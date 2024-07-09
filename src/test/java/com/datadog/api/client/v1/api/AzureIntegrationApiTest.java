/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.APIErrorResponse;
import com.datadog.api.client.v1.model.AzureAccount;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import org.junit.*;

/** API tests for AzureIntegrationApi */
public class AzureIntegrationApiTest extends V1ApiTest {

  private static AzureIntegrationApi api;
  private static AzureIntegrationApi unitApi;
  private static AzureIntegrationApi fakeAuthApi;

  private static AzureAccount uniqueAzureAccount = new AzureAccount();
  private static AzureAccount uniqueUpdatedAzureAccount = new AzureAccount();
  private static AzureAccount uniqueUpdatedHostFilters = new AzureAccount();
  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final String fixturePrefix = "client/v1/api/azure_fixtures";
  private final String apiUri = "/api/v1/integration/azure";

  @Override
  public String getTracingEndpoint() {
    return "integration-azure";
  }

  @BeforeClass
  public static void initApi() {
    api = new AzureIntegrationApi(generalApiClient);
    unitApi = new AzureIntegrationApi(generalApiUnitTestClient);
    fakeAuthApi = new AzureIntegrationApi(generalFakeAuthApiClient);
  }

  @Before
  public void setupAzureAccounts() {
    String uniqueTenantName = String.format("aaaaaaaa-bbbb-cccc-dddd-%dee", now.toEpochSecond());

    uniqueAzureAccount.setClientId("javatest-1234-5678-9101-3fcbf464test");
    uniqueAzureAccount.setClientSecret("testingx./Sw*g/Y33t..R1cH+hScMDt");
    uniqueAzureAccount.setTenantName(uniqueTenantName);

    uniqueUpdatedAzureAccount.setClientId(uniqueAzureAccount.getClientId());
    uniqueUpdatedAzureAccount.setTenantName(uniqueTenantName);
    uniqueUpdatedAzureAccount.setHostFilters("filter:foo,test:bar");

    uniqueUpdatedHostFilters.setClientId(uniqueUpdatedAzureAccount.getClientId());
    uniqueUpdatedHostFilters.setTenantName(uniqueUpdatedAzureAccount.getTenantName());
    uniqueUpdatedHostFilters.setHostFilters("filter:updated,test:updated");
  }

  @After
  public void cleanup() {
    try {
      api.deleteAzureIntegration(uniqueAzureAccount);
    } catch (ApiException e) {
      System.out.printf(
          "Couldn't uninstall Azure account %s, may have been removed as part of another test",
          uniqueAzureAccount);
      e.printStackTrace();
    }
    // Delete Updated Azure Account too
    AzureAccount updatedAccount = new AzureAccount();
    updatedAccount.setClientId(uniqueUpdatedAzureAccount.getClientId());
    updatedAccount.setTenantName(uniqueUpdatedAzureAccount.getTenantName());
    try {
      api.deleteAzureIntegration(updatedAccount);
    } catch (ApiException e) {
      System.out.printf(
          "Couldn't uninstall Azure account %s, may have been removed as part of another test",
          updatedAccount);
      e.printStackTrace();
    }
  }

  /**
   * Add a Azure integration to your Datadog account.
   *
   * <p>### Overview Create a Datadog-Azure integration. ### Arguments * **&#x60;tenant_name&#x60;**
   * [*required*, *default* &#x3D; **None**]: Your Azure Active Directory ID. *
   * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure web application
   * ID. * **&#x60;client_secret&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure web
   * application secret key. * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]:
   * Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one
   * of the defined tags are imported into Datadog.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createAzureIntegrationTest() throws ApiException {
    Object response = api.createAzureIntegration(uniqueAzureAccount);
    assertEquals(response, new java.util.LinkedHashMap<>());
  }

  /**
   * List and Delete an Azure Integration from your Datadog account.
   *
   * <p>### Overview Delete a given Datadog-Azure integration. ### Arguments *
   * **&#x60;tenant_name&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure Active
   * Directory ID. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure
   * web application ID.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listAnddeleteAzureIntegrationTest() throws ApiException {
    // Setup Azure Account to List
    api.createAzureIntegration(uniqueAzureAccount);

    List<AzureAccount> listAccounts = api.listAzureIntegration();
    AzureAccount retrievedAccount;
    retrievedAccount = retrieveAccountInList(listAccounts, uniqueAzureAccount.getTenantName());
    assertEquals(uniqueAzureAccount.getClientId(), retrievedAccount.getClientId());
    assertEquals(uniqueAzureAccount.getTenantName(), retrievedAccount.getTenantName());
    assertTrue(listAccounts.size() >= 1);

    // Test account deletion as well
    api.deleteAzureIntegration(uniqueAzureAccount);
    try {
      // the API returns 400 if there are no accounts at all, but because of potential other tests
      // running, we can never be sure if there are currently other accounts, so we handle both
      // cases
      listAccounts = api.listAzureIntegration();
      retrievedAccount = retrieveAccountInList(listAccounts, uniqueAzureAccount.getTenantName());
      assertEquals(new AzureAccount(), retrievedAccount);
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      System.out.printf(
          "Listing Azure accounts returned 400, this is ok when no other accounts exist at this"
              + " moment");
    }
  }

  /**
   * Update an Azure integration to your Datadog account.
   *
   * <p>### Overview Update an Datadog-Azure integration. Requires an existing tenant_name and
   * client_id. Any other fields supplied will overwrite existing values. To overwrite tenant_name
   * or client_id, use new_tenant_name and new_client_id. To leave a field unchanged, do not supply
   * that field in the payload. ### Arguments * **&#x60;tenant_name&#x60;** [*required*, *default*
   * &#x3D; **None**]: Your existing Azure Active Directory ID. * **&#x60;new_tenant_name&#x60;**
   * [*optional*, *default* &#x3D; **None**]: Your new Azure Active Directory ID. *
   * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your existing Azure web
   * application ID. * **&#x60;new_client_id&#x60;** [*optional*, *default* &#x3D; **None**]: Your
   * new Azure web application ID. * **&#x60;client_secret&#x60;** [*optional*, *default* &#x3D;
   * **None**]: Your Azure web application secret key. * **&#x60;host_filters&#x60;** [*optional*,
   * *default* &#x3D; **None**]: Limit the Azure instances that are pulled into Datadog by using
   * tags. Only hosts that match one of the defined tags are imported into Datadog.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateAzureIntegrationTest() throws ApiException {
    // Create and update an account
    api.createAzureIntegration(uniqueAzureAccount);
    api.updateAzureIntegration(uniqueUpdatedAzureAccount);

    // List account to ensure update worked.
    List<AzureAccount> listAccounts = api.listAzureIntegration();
    AzureAccount retrievedAccount;
    retrievedAccount =
        retrieveAccountInList(listAccounts, uniqueUpdatedAzureAccount.getTenantName());
    assertEquals(uniqueUpdatedAzureAccount.getClientId(), retrievedAccount.getClientId());
    assertEquals(uniqueUpdatedAzureAccount.getTenantName(), retrievedAccount.getTenantName());
    assertEquals(uniqueUpdatedAzureAccount.getHostFilters(), retrievedAccount.getHostFilters());

    // Test update host filters endpoint
    api.updateAzureHostFilters(uniqueUpdatedHostFilters);
    listAccounts = api.listAzureIntegration();
    retrievedAccount =
        retrieveAccountInList(listAccounts, uniqueUpdatedHostFilters.getTenantName());
    assertEquals(uniqueUpdatedHostFilters.getHostFilters(), retrievedAccount.getHostFilters());
  }

  private AzureAccount retrieveAccountInList(List<AzureAccount> listAccounts, String tenantName) {
    AzureAccount retrievedAccount = new AzureAccount();
    for (AzureAccount iterAccount : listAccounts) {
      if (iterAccount.getTenantName().equals(tenantName)) {
        retrievedAccount = iterAccount;
      }
    }
    return retrievedAccount;
  }

  @Test
  public void list400AzureIntegrationErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
    stubFor(get(urlPathEqualTo(apiUri)).willReturn(okJson(fixtureData).withStatus(400)));
    // Mocked because it is only returned when the azure integration is not installed, which is not
    // the case on test org
    // and it can't be done through the API
    try {
      unitApi.listAzureIntegration();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void list403AzureIntegrationErrorTest() throws IOException {
    try {
      fakeAuthApi.listAzureIntegration();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void createAzureIntegrationErrorsTest() throws IOException {
    try {
      api.createAzureIntegration(new AzureAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createAzureIntegration(new AzureAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void deleteAzureIntegrationErrorsTest() throws IOException {
    try {
      api.deleteAzureIntegration(new AzureAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.deleteAzureIntegration(new AzureAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void updateAzureIntegrationErrorsTest() throws IOException {
    try {
      api.updateAzureIntegration(new AzureAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateAzureIntegration(new AzureAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void updateHostFiltersAzureIntegrationErrorsTest() throws IOException {
    try {
      api.updateAzureHostFilters(new AzureAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateAzureHostFilters(new AzureAccount());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
