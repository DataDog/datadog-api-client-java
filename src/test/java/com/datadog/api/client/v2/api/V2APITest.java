/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.api;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestClient;
import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.RetryConfig;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class V2APITest extends TestUtils.APITest {
  protected static ApiClient generalApiClient;
  protected static ApiClient generalApiUnitTestClient;
  protected static ApiClient generalApiClientWithRetry;

  @BeforeClass
  public static void initGeneralApiClientWithRetry(){
    initGeneralApiClient();
    generalApiClientWithRetry = generalApiClient;
    generalApiClientWithRetry.setRetry(new RetryConfig(true,2,2,3));
  }

  @BeforeClass
  public static void initGeneralApiClient() {
    generalApiClient = new ApiClient();

    // Configure authorization
    HashMap<String, String> secrets = new HashMap<>();
    secrets.put("apiKeyAuth", TEST_API_KEY);
    secrets.put("appKeyAuth", TEST_APP_KEY);
    generalApiClient.configureApiKeys(secrets);
    generalApiClient.setServerIndex(0);

    // Set debugging based on env
    generalApiClient.setDebugging("true".equals(System.getenv("DEBUG")));

    // Set proxy to the mockServer for recording
    if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
        ClientConfig config = (ClientConfig) generalApiClient.getHttpClient().getConfiguration();
        config.connectorProvider(
            new HttpUrlConnectorProvider()
                .connectionFactory(new TestUtils.MockServerProxyConnectionFactory()));
      } else {
        String site = System.getenv("DD_TEST_SITE");
        if (site != null) {
          HashMap<String, String> serverVariables = new HashMap<String, String>();
          serverVariables.put("site", site);
          generalApiClient.setServerIndex(2);
          generalApiClient.setServerVariables(serverVariables);
        }
      }
    }
  }

  @BeforeClass
  public static void initGeneralApiUnitTestClient() {
    generalApiUnitTestClient = new ApiClient();
    generalApiUnitTestClient.setCompress(false);
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
  public void setTestClient() {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      Client httpClient =
          new TestClient(
              this.getQualifiedTestcaseName(),
              "/" + V2APITest.version,
              generalApiClient.getJSON().getMapper());
      generalApiClient.setHttpClient(httpClient);
    }
  }

  public String testDomain() throws MalformedURLException {
    String basePath = generalApiClient.getBasePath();
    String host = new URL(basePath).getHost();

    // naïvely assume the TLD does not contain periods
    Pattern domainPattern = Pattern.compile(".*?([^.]+\\.[\\w]+)$");
    Matcher matcher = domainPattern.matcher(host);
    if (matcher.find()) {
      return matcher.group(1);
    }
    return null;
  }

  public <T> ApiResponse<T> sendRequest(
      String method, String url, Object payload, GenericType<T> responseType) throws ApiException {
    String originalBasePath = generalApiClient.getBasePath();
    Integer originalServerIndex = generalApiClient.getServerIndex();
    if (url.startsWith("https://")) {
      // if we got full URL, ensure that invokeAPI method doesn't use builtin operation servers
      // but rather falls back to basePath, which is empty => we'll get precisely the URL we want as
      // result
      generalApiClient.setBasePath("");
      generalApiClient.setServerIndex(null);
    }
    try {
      Invocation.Builder builder =
          generalApiClient.createBuilder(
              "",
              url,
              new ArrayList<Pair>(),
              new HashMap<String, String>(),
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
      return generalApiClient.invokeAPI(
          method,
          builder,
          new HashMap<String, String>(),
          new String[] {"application/json"},
          payload,
          new HashMap<String, Object>(),
          false,
          responseType);
    } catch (Exception e) {
      throw e;
    } finally {
      generalApiClient.setBasePath(originalBasePath);
      generalApiClient.setServerIndex(originalServerIndex);
    }
  }
}
