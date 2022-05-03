/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.*;

import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.GCPAccount;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import org.junit.*;

/** API tests for GcpIntegrationApi */
public class GcpIntegrationApiTest extends V1ApiTest {

  private static GcpIntegrationApi api;
  private static GcpIntegrationApi fakeAuthApi;
  private static GcpIntegrationApi unitApi;

  private static GCPAccount uniqueGCPAccount = new GCPAccount();
  private static GCPAccount uniqueUpdateGCPAccount = new GCPAccount();
  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final String apiUri = "/api/v1/integration/gcp";
  private final String fixturePrefix = "v1/client/api/gcp_fixtures";

  @Override
  public String getTracingEndpoint() {
    return "integration-gcp";
  }

  @BeforeClass
  public static void initAPI() {
    api = new GcpIntegrationApi(generalApiClient);
    fakeAuthApi = new GcpIntegrationApi(generalFakeAuthApiClient);
    unitApi = new GcpIntegrationApi(generalApiUnitTestClient);
  }

  @Before
  public void setupGCPAccounts() {
    String uniqueProjectID = getUniqueEntityName();

    uniqueGCPAccount.setProjectId(uniqueProjectID);
    uniqueGCPAccount.setType("service_account");
    uniqueGCPAccount.setPrivateKeyId("fake_private_key_id");
    uniqueGCPAccount.setPrivateKey("fake_key");
    uniqueGCPAccount.setClientEmail("api-test@fake-sandbox.iam.gserviceaccount.com");
    uniqueGCPAccount.setClientId("123456712345671234567");
    uniqueGCPAccount.setAuthUri("fake_uri");
    uniqueGCPAccount.setTokenUri("fake_uri");
    uniqueGCPAccount.setAuthProviderX509CertUrl("fake_uri");
    uniqueGCPAccount.setClientX509CertUrl("fake_uri");
    uniqueGCPAccount.setHostFilters("fake:tag,example:test");
    uniqueGCPAccount.setAutomute(false);

    uniqueUpdateGCPAccount.setProjectId(uniqueProjectID);
    uniqueUpdateGCPAccount.setClientEmail(uniqueGCPAccount.getClientEmail());
    uniqueUpdateGCPAccount.setHostFilters("fake:update,example:update");
    uniqueUpdateGCPAccount.setAutomute(true);
  }

  @After
  public void cleanup() {
    try {
      api.deleteGCPIntegration(uniqueGCPAccount);
    } catch (ApiException e) {
      System.out.printf(
          "Couldn't uninstall GCP account %s, may have been removed as part of another test",
          uniqueGCPAccount);
      e.printStackTrace();
    }
    try {
      api.deleteGCPIntegration(uniqueUpdateGCPAccount);
    } catch (ApiException e) {
      System.out.printf(
          "Couldn't uninstall GCP account %s, may have been removed as part of another test",
          uniqueUpdateGCPAccount);
      e.printStackTrace();
    }
  }

  /**
   * Add a GCP integration to your Datadog account.
   *
   * <p>### Overview Create a Datadog-GCP integration. ### Arguments * **&#x60;type&#x60;**
   * [*required*, *default* &#x3D; **None**]: The value for service_account found in your JSON
   * service account key. * **&#x60;project_id&#x60;** [*required*, *default* &#x3D; **None**]: Your
   * Google Cloud project ID found in your JSON service account key. *
   * **&#x60;private_key_id&#x60;** [*required*, *default* &#x3D; **None**]: Your private key ID
   * found in your JSON service account key. * **&#x60;private_key&#x60;** [*required*, *default*
   * &#x3D; **None**]: Your private key name found in your JSON service account key. *
   * **&#x60;client_email&#x60;** [*required*, *default* &#x3D; **None**]: Your email found in your
   * JSON service account key. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]:
   * Your ID found in your JSON service account key. * **&#x60;auth_uri&#x60;** [*required*,
   * *default* &#x3D; **None**]: Should be https://accounts.google.com/o/oauth2/auth. *
   * **&#x60;token_uri&#x60;** [*required*, *default* &#x3D; **None**]: Should be
   * https://accounts.google.com/o/oauth2/token. * **&#x60;auth_provider_x509_cert_url&#x60;**
   * [*required*, *default* &#x3D; **None**]: Should be https://www.googleapis.com/oauth2/v1/certs.
   * * **&#x60;client_x509_cert_url&#x60;** [*required*, *default* &#x3D; **None**]: Should be
   * https://www.googleapis.com/robot/v1/metadata/x509/&lt;CLIENT_EMAIL&gt; where
   * &lt;CLIENT_EMAIL&gt; is the email found in your JSON service account key. *
   * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]: Limit the GCE instances
   * that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are
   * imported into Datadog. * **&#x60;automute&#x60;** [*optional*, *default* &#x3D; false]: Silence
   * monitors for expected GCE instance shutdowns.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createGCPIntegrationTest() throws ApiException {
    Object response = api.createGCPIntegration(uniqueGCPAccount);
    assertEquals(response, new java.util.LinkedHashMap<>());
  }

  /**
   * List and Delete a GCP Integration from your Datadog account.
   *
   * <p>### Overview Delete a given Datadog-GCP integration. ### Arguments *
   * **&#x60;project_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Google Cloud project
   * ID to be deleted. * **&#x60;client_email&#x60;** [*required*, *default* &#x3D; **None**]: Your
   * client email associated with the integration to be deleted.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listAndDeleteGCPIntegrationTest() throws ApiException {
    // Setup Gcp Account to List
    api.createGCPIntegration(uniqueGCPAccount);

    List<GCPAccount> listAccounts = api.listGCPIntegration();
    GCPAccount retrievedAccount =
        retrieveAccountInList(listAccounts, uniqueGCPAccount.getProjectId());

    assertEquals(retrievedAccount.getClientEmail(), uniqueGCPAccount.getClientEmail());
    assertEquals(retrievedAccount.getHostFilters(), uniqueGCPAccount.getHostFilters());
    // Assert returned list is greater than or equal to 1
    assertTrue(listAccounts.size() >= 1);

    // Test account deletion as well
    api.deleteGCPIntegration(uniqueGCPAccount);
    listAccounts = api.listGCPIntegration();
    retrievedAccount = retrieveAccountInList(listAccounts, uniqueGCPAccount.getProjectId());
    assertEquals(new GCPAccount(), retrievedAccount);
  }

  /**
   * Update a GCP integration in your Datadog account.
   *
   * <p>### Overview Update a Datadog-GCP integrations host_filters and/or automute. Requires a
   * project_id and client_email, however these fields cannot be updated. If you need to update
   * these fields please delete and use the create (POST) endpoint. The unspecified fields will keep
   * their original values. ### Arguments * **&#x60;project_id&#x60;** [*required*, *default* &#x3D;
   * **None**]: Your Google Cloud project ID associated with the integration to be updated. *
   * **&#x60;client_email&#x60;** [*required*, *default* &#x3D; **None**]: Your client email
   * associated with the integration to be updated. * **&#x60;host_filters&#x60;** [*optional*,
   * *default* &#x3D; **None**]: Limit the GCE instances that are pulled into Datadog by using tags.
   * Only hosts that match one of the defined tags are imported into Datadog. *
   * **&#x60;automute&#x60;** [*optional*, *default* &#x3D; false]: Silence monitors for expected
   * GCE instance shutdowns.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateGCPIntegrationTest() throws ApiException {
    // Setup Gcp Account to Update
    api.createGCPIntegration(uniqueGCPAccount);
    api.updateGCPIntegration(uniqueUpdateGCPAccount);

    List<GCPAccount> listAccounts = api.listGCPIntegration();
    GCPAccount retrievedAccount =
        retrieveAccountInList(listAccounts, uniqueUpdateGCPAccount.getProjectId());
    assertEquals(retrievedAccount.getAutomute(), true);
    assertEquals(retrievedAccount.getHostFilters(), uniqueUpdateGCPAccount.getHostFilters());
  }

  private GCPAccount retrieveAccountInList(List<GCPAccount> listAccounts, String projectID) {
    GCPAccount retrievedAccount = new GCPAccount();
    for (GCPAccount iterAccount : listAccounts) {
      if (iterAccount.getProjectId().equals(projectID)) {
        retrievedAccount = iterAccount;
      }
    }
    return retrievedAccount;
  }

  @Test
  public void gCPList400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
    stubFor(get(urlPathEqualTo(apiUri)).willReturn(okJson(fixtureData).withStatus(400)));
    // Mocked because it is only returned when the gcp integration is not installed, which is not
    // the case on test org
    // and it can't be done through the API
    try {
      unitApi.listGCPIntegration();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void gCPListErrorsTest() throws IOException {
    try {
      fakeAuthApi.listGCPIntegration();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void gCPCreateErrorsTest() throws IOException {
    try {
      api.createGCPIntegration(new GCPAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createGCPIntegration(new GCPAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void gCPDeleteErrorsTest() throws IOException {
    try {
      api.deleteGCPIntegration(new GCPAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.deleteGCPIntegration(new GCPAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void gCPUpdateErrorsTest() throws IOException {
    try {
      api.updateGCPIntegration(new GCPAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateGCPIntegration(new GCPAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
