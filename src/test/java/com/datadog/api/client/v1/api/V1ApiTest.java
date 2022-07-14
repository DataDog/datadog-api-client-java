/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestClient;
import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class V1ApiTest extends TestUtils.APITest {
  protected static ApiClient generalApiClient;
  protected static ApiClient generalFakeAuthApiClient;
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
  public static void initGeneralFakeAuthApiClient() {
    generalFakeAuthApiClient = new ApiClient();

    // Configure authorization
    HashMap<String, String> secrets = new HashMap<>();
    secrets.put("apiKeyAuth", "fake_api_key");
    secrets.put("appKeyAuth", "fake_app_key");
    generalFakeAuthApiClient.configureApiKeys(secrets);

    // Set debugging based on env
    generalFakeAuthApiClient.setDebugging("true".equals(System.getenv("DEBUG")));

    // Set proxy to the mockServer for recording
    if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
        ClientConfig config =
            (ClientConfig) generalFakeAuthApiClient.getHttpClient().getConfiguration();
        config.connectorProvider(
            new HttpUrlConnectorProvider()
                .connectionFactory(new TestUtils.MockServerProxyConnectionFactory()));
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
    version = "v1";
  }

  public MappingBuilder setupStub(String Urlpath, String fixturePath, String httpMethod)
      throws IOException {
    MappingBuilder stub = null;

    switch (httpMethod) {
      case "get":
        stub = get(urlMatching(Urlpath + "(\\?.*)?"));
        break;
      case "post":
        stub = post(urlMatching(Urlpath + "(\\?.*)?"));
        break;
      case "put":
        stub = put(urlMatching(Urlpath + "(\\?.*)?"));
        break;
      case "delete":
        stub = delete(urlMatching(Urlpath + "(\\?.*)?"));
        break;
    }
    stub.willReturn(
        aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(TestUtils.getFixture(fixturePath)));
    return stub;
  }

  @Before
  public void setTestClient() {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      Client httpClient =
          new TestClient(
              this.getQualifiedTestcaseName(),
              "/" + V1ApiTest.version,
              generalApiClient.getJSON().getMapper());
      generalApiClient.setHttpClient(httpClient);
      generalFakeAuthApiClient.setHttpClient(httpClient);
    }
  }

  public void beginStub(MappingBuilder stub) {
    stubFor(stub);
  }

  public <T> ApiResponse<T> sendRequest(
      String method, String url, Object payload, GenericType<T> responseType) throws ApiException {
    String originalBasePath = generalApiClient.getBasePath();
    Integer originalServerIndex = generalApiClient.getServerIndex();
    if (url.startsWith("https://")) {
      try {
        URL parsedUrl = new URL(url);
        HashMap<String, String> serverVariables = new HashMap<>();
        serverVariables.put("name", parsedUrl.getHost());
        serverVariables.put("protocol", parsedUrl.getProtocol());
        url = parsedUrl.getPath();
        generalApiClient.setServerIndex(1);
        generalApiClient.setServerVariables(serverVariables);
      } catch (Exception e) {
        throw new RuntimeException("Malformed url", e);
      }
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
    } finally {
      generalApiClient.setBasePath(originalBasePath);
      generalApiClient.setServerIndex(originalServerIndex);
    }
  }
}
