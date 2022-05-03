/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/** API tests for OrgsApi */
public class OrganizationsApiTest extends V1ApiTest {

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final OrganizationsApi api = new OrganizationsApi(generalApiClient);
  private final OrganizationsApi unitApi = new OrganizationsApi(generalApiUnitTestClient);
  private final OrganizationsApi fakeAuthApi = new OrganizationsApi(generalFakeAuthApiClient);

  private final String apiUri = "/api/v1/org";
  private final String fixturePrefix = "v1/client/api/org_fixtures";

  @Override
  public String getTracingEndpoint() {
    return "organizations";
  }

  /**
   * Create child-organization.
   *
   * <p>## Overview This endpoint requires the [multi-org
   * account](https://docs.datadoghq.com/account_management/multi_organization/) feature and must be
   * enabled by [contacting support](https://docs.datadoghq.com/help/). ### ARGUMENTS *
   * **&#x60;name&#x60;** [*required*]: The name of the new child-organization, limited to 32
   * characters. * **&#x60;subscription&#x60;** [*required*]: A JSON array of subscription type.
   * Types available are **trial**, **free**, and **pro**. * **&#x60;billing&#x60;** [*required*]: A
   * JSON array of billing type. Note that only **parent_billing** is supported. Once a new
   * child-organization is created, you can interact with it by using the **org.public_id**,
   * **api_key.key**, and **application_key.hash** provided in the response.
   *
   * @throws ApiException if the Api call fails
   * @throws IOException if the fixture data cannot be loaded
   */
  @Test
  public void createChildOrgTest() throws ApiException, IOException {
    MappingBuilder stub = setupStub(apiUri, fixturePrefix + "/create_child_org.json", "post");
    stubFor(stub);

    // CreateBody can contain anything since we're mocking the response
    // Just confirmation that the proper fields can be set
    OrganizationCreateBody orgCreateBody =
        new OrganizationCreateBody()
            .name("My Org")
            .billing(new OrganizationBilling().type("parent_billing"))
            .subscription(new OrganizationSubscription().type("pro"));
    OrganizationCreateResponse response = unitApi.createChildOrg(orgCreateBody);

    // Assert values match whats in create_child_org.json
    assertEquals(response.getOrg().getName(), "My Org");
    assertEquals(response.getOrg().getPublicId(), "axd2s");
    assertEquals(response.getOrg().getSubscription().getType(), "pro");
    assertEquals(response.getOrg().getBilling().getType(), "parent_billing");
    assertEquals(response.getUser().getName(), "Organization admin");
    assertEquals(response.getUser().getHandle(), "test@datadoghq.com");
    assertEquals(response.getApiKey().getCreatedBy(), "user");
    assertEquals(response.getApiKey().getKey(), "6ccdfb88ff1aa63192c326");
    assertEquals(response.getApplicationKey().getOwner(), "Organization admin");
    assertEquals(response.getApplicationKey().getHash(), "88e5ae6a71f51d1d5a0071a24f");
  }

  /**
   * Get the organization
   *
   * <p>## Overview Gets information about your organization
   *
   * @throws ApiException if the Api call fails
   * @throws IOException if the fixture file cannot be loaded
   */
  @Test
  public void getOrgTest() throws ApiException, IOException {
    MappingBuilder stub = setupStub(apiUri, fixturePrefix + "/get_orgs.json", "get");
    stubFor(stub);

    OrganizationListResponse response = unitApi.listOrgs();

    // Assert values match whats in get_orgs.json fixture
    assertEquals(response.getOrgs().size(), 1);
    assertEquals(response.getOrgs().get(0).getName(), "My Org");
    assertEquals(response.getOrgs().get(0).getPublicId(), "axd2s");
    assertEquals(response.getOrgs().get(0).getBilling().getType(), "bill-parent");
    assertEquals(response.getOrgs().get(0).getSubscription().getType(), "pro");
  }

  /**
   * Update the organization
   *
   * <p>## Overview Updates the organization ### ARGUMENTS * **&#x60;name&#x60;** [*optional*]: The
   * organization name. * **&#x60;settings&#x60;** [*optional*]: A JSON array of settings. Settings
   * include: * **&#x60;saml&#x60;**: Set the boolean property **enabled** to enable or disable
   * single sign on with SAML. See the [SAML
   * documentation](https://docs.datadoghq.com/account_management/saml) for more information about
   * all SAML settings. * **&#x60;saml_idp_initiated_login&#x60;**: has one property **enabled**
   * (boolean). * **&#x60;saml_strict_mode&#x60;**: has one property **enabled** (boolean). *
   * **&#x60;saml_autocreate_users_domains&#x60;**: has two properties: **enabled** (boolean) and
   * **domains** which is a list of domains without the @ symbol.
   *
   * @throws ApiException if the Api call fail
   * @throws IOException if the fixture file cannot be loaded
   */
  @Test
  public void updateOrgTest() throws ApiException, IOException {
    String publicId = "12345";
    MappingBuilder stub =
        setupStub(apiUri + "/" + publicId, fixturePrefix + "/update_org.json", "put");
    stubFor(stub);

    // Update Body can contain anything since we're mocking the response
    // Just confirmation that the proper fields can be set
    Organization org =
        new Organization()
            .name("My Org")
            .settings(
                new OrganizationSettings()
                    .saml(new OrganizationSettingsSaml().enabled(true))
                    .samlIdpInitiatedLogin(
                        new OrganizationSettingsSamlIdpInitiatedLogin().enabled(true))
                    .samlStrictMode(new OrganizationSettingsSamlStrictMode().enabled(true))
                    .samlAutocreateUsersDomains(
                        new OrganizationSettingsSamlAutocreateUsersDomains()
                            .enabled(true)
                            .addDomainsItem("my-org.com")
                            .addDomainsItem("example.com")));
    OrganizationResponse response = unitApi.updateOrg(publicId, org);

    // Assert values match whats in update_orgs.json fixture
    assertEquals(response.getOrg().getPublicId(), "axd2s");
    assertEquals(response.getOrg().getName(), "My Org");
    assertEquals(response.getOrg().getBilling(), new OrganizationBilling());
    assertEquals(response.getOrg().getCreated(), "2016-10-06 21:41:12");
    assertEquals(response.getOrg().getSettings().getSamlCanBeEnabled(), true);
    assertEquals(response.getOrg().getSettings().getSamlIdpInitiatedLogin().getEnabled(), true);
    assertEquals(response.getOrg().getSettings().getSaml().getEnabled(), true);
    assertEquals(
        response.getOrg().getSettings().getSamlIdpEndpoint(),
        "https://idp.datadoghq.com/idp/profile/SAML2/POST/SSO");
    List<String> expectedDomains = new ArrayList<String>();
    expectedDomains.add("my-org.com");
    expectedDomains.add("example.com");
    assertEquals(
        response.getOrg().getSettings().getSamlAutocreateUsersDomains().getDomains(),
        expectedDomains);
    assertEquals(
        response.getOrg().getSettings().getSamlAutocreateUsersDomains().getEnabled(), true);
    assertEquals(
        response.getOrg().getSettings().getSamlLoginUrl(),
        "https://app.datadoghq.com/account/login/id/c81e728d9");
    assertEquals(response.getOrg().getSettings().getSamlIdpMetadataUploaded(), true);
    assertEquals(response.getOrg().getSettings().getSamlStrictMode().getEnabled(), true);
    assertEquals(response.getOrg().getSubscription().getType(), "pro");
  }

  /**
   * Upload IdP metadata
   *
   * <p>## Overview There are a couple of options for updating the Identity Provider (IdP) metadata
   * from your SAML IdP. * **Multipart Form-Data**: Post the IdP metadata file using a form post.
   * ### Multipart Form-Data #### Headers * **&#x60;Content-Type: multipart/form-data&#x60;** ####
   * Arguments * **&#x60;public_id&#x60;** [*required*]: The public id of the org you want to update
   * metadata for. ### MultiPart Form Data Body * The encoded data for the IDP settings to upload
   * #### Headers * **&#x60;Content-Type: multipart/form-data&#x60;** #### Arguments * The body must
   * contain the contents of your IdP metadata XML file.
   *
   * @throws ApiException if the Api call fails
   * @throws IOException if the test fixture can't be accessed
   */
  @Test
  public void uploadIdPForOrgTest() throws ApiException, IOException, URISyntaxException {
    MappingBuilder stub =
        setupStub(apiUri + "/123456/idp_metadata", fixturePrefix + "/update_idp_meta.json", "post");
    beginStub(stub);

    String publicId = "123456";
    // Open a file to test the request. Any file can do, content does not matter since the endpoint
    // is mocked.
    File idpFile =
        new File(
            OrganizationsApiTest.class.getResource("org_fixtures/update_idp_meta.json").toURI());
    IdpResponse response =
        unitApi.uploadIdPForOrg(publicId, idpFile); // .uploadIdPForOrg(publicId);

    assertEquals(response.getMessage(), "IdP metadata successfully uploaded for org Datadog HQ");
  }

  @Test
  public void orgsCreateErrorsTest() throws IOException {
    try {
      api.createChildOrg(new OrganizationCreateBody());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createChildOrg(new OrganizationCreateBody());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void orgsListErrorsTest() throws IOException {
    try {
      fakeAuthApi.listOrgs();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void orgsGetErrorsTest() throws IOException {
    try {
      api.getOrg("lsqdkjf");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getOrg("lsqdkjf");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void orgsUpdateErrorsTest() throws IOException {
    try {
      api.updateOrg("lsqdkjf", new Organization());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateOrg("lsqdkjf", new Organization());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void orgsUploadIdpErrorsTest() throws URISyntaxException, IOException {
    // Boundary is uniquely generated at each request, so the test will fail when replaying
    assumeFalse(
        "This test does not support replay from recording",
        TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING));

    // Get random file.
    File idpFile =
        new File(OrganizationsApiTest.class.getResource("org_fixtures/error_415.json").toURI());

    try {
      api.uploadIdPForOrg("lsqdkjf", idpFile);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.uploadIdPForOrg("lsqdkjf", idpFile);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void orgsUploadIdp415ErrorTest() throws URISyntaxException, IOException {
    // Get file object. This fixture doesn't exist since we don't need it to.
    File idpFile =
        new File(OrganizationsApiTest.class.getResource("org_fixtures/error_415.json").toURI());

    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_415.json");
    stubFor(
        post(urlPathEqualTo(apiUri + "/id/idp_metadata"))
            .willReturn(okJson(fixtureData).withStatus(415)));
    // Can't trigger 415 from the client because it will always send the proper MIME type so mock it
    try {
      unitApi.uploadIdPForOrg("id", idpFile);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(415, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
