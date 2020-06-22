/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.api;


import static java.util.Collections.emptyMap;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.ws.rs.core.GenericType;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class V2APITest extends TestUtils.APITest {
    protected static ApiClient generalApiClient;
    protected static ApiClient generalApiUnitTestClient;

    @BeforeClass
    public static void initGeneralApiClient() {
        generalApiClient = new ApiClient();

        // Configure authorization
        HashMap<String, String> secrets = new HashMap<>();
        secrets.put("apiKeyAuth", TEST_API_KEY);
        secrets.put("appKeyAuth", TEST_APP_KEY);
        generalApiClient.configureApiKeys(secrets);

        // Set debugging based on env
        generalApiClient.setDebugging("true".equals(System.getenv("DEBUG")));

        // Set proxy to the mockServer for recording
        if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
            if (!(TestUtils.isIbmJdk() || TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE))) {
                ClientConfig config = (ClientConfig) generalApiClient.getHttpClient().getConfiguration();
                config.connectorProvider(new HttpUrlConnectorProvider().connectionFactory(new TestUtils.MockServerProxyConnectionFactory()));
            }
        } else {
            // Set base path to the mock server for replaying
            generalApiClient.setBasePath("https://" + TestUtils.MOCKSERVER_HOST + ":" + TestUtils.MOCKSERVER_PORT);
            generalApiClient.setServerIndex(null);
        }
    }

    @BeforeClass
    public static void initGeneralApiUnitTestClient() {
        generalApiUnitTestClient = new ApiClient();
        generalApiUnitTestClient.setBasePath(String.format("http://localhost:%d", WIREMOCK_PORT));
        // Disable templated servers
        generalApiUnitTestClient.setServerIndex(null);

        // Configure authorization with fake keys
        HashMap<String, String> secrets = new HashMap<>();
        secrets.put("apiKeyAuth", TEST_API_KEY_NAME);
        secrets.put("appKeyAuth", TEST_APP_KEY_NAME);
        generalApiUnitTestClient.configureApiKeys(secrets);
    }

    @BeforeClass
    public static void setVersion() {
        version = "v2";
    }

    @Before
    public void setTestNameHeader() {
        // these headers help mockserver properly identify the request in the huge all-in-one cassette
        generalApiClient.addDefaultHeader("JAVA-TEST-NAME", name.getMethodName());
    }

    public String testDomain() throws MalformedURLException {
        String basePath = generalApiClient.getBasePath();
        String host = new URL(basePath).getHost();

        // naïvely assume the TLD does not contain periods
        Pattern domainPattern = Pattern.compile(".*?([^.]+\\.[\\w]+)$");
        Matcher matcher = domainPattern.matcher(host);
        matcher.find();
        return matcher.group(1);
    }


    public <T> ApiResponse<T> sendRequest(String method, String url, String payload, GenericType<T> responseType) throws ApiException {
        String originalBasePath = generalApiClient.getBasePath();
        Integer originalServerIndex = generalApiClient.getServerIndex();
        if (url.startsWith("https://")) {
            // if we got full URL, ensure that invokeAPI method doesn't use builtin operation servers
            // but rather falls back to basePath, which is empty => we'll get precisely the URL we want as result
            generalApiClient.setBasePath("");
            generalApiClient.setServerIndex(null);
        }
        try {
            return generalApiClient.invokeAPI(
                    "",
                    url,
                    method,
                    null,
                    payload,
                    emptyMap(),
                    emptyMap(),
                    emptyMap(),
                    "application/json",
                    "application/json",
                    new String[]{"apiKeyAuth", "appKeyAuth"},
                    responseType
            );
        } catch (Exception e) {
            throw e;
        } finally {
            generalApiClient.setBasePath(originalBasePath);
            generalApiClient.setServerIndex(originalServerIndex);
        }
    }
}
