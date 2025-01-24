/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 */

package com.datadog.api.client.v2.api;

import static com.datadog.api.World.fromJSON;
import static com.datadog.api.World.lookup;
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.put;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.v2.model.LogsArchive;
import com.datadog.api.client.v2.model.LogsArchiveCreateRequest;
import com.datadog.api.client.v2.model.LogsArchiveCreateRequestAttributes;
import com.datadog.api.client.v2.model.LogsArchiveCreateRequestDefinition;
import com.datadog.api.client.v2.model.LogsArchiveCreateRequestDestination;
import com.datadog.api.client.v2.model.LogsArchiveDestinationAzure;
import com.datadog.api.client.v2.model.LogsArchiveDestinationAzureType;
import com.datadog.api.client.v2.model.LogsArchiveDestinationGCS;
import com.datadog.api.client.v2.model.LogsArchiveDestinationGCSType;
import com.datadog.api.client.v2.model.LogsArchiveDestinationS3;
import com.datadog.api.client.v2.model.LogsArchiveDestinationS3Type;
import com.datadog.api.client.v2.model.LogsArchiveEncryptionS3;
import com.datadog.api.client.v2.model.LogsArchiveEncryptionS3Type;
import com.datadog.api.client.v2.model.LogsArchiveIntegrationAzure;
import com.datadog.api.client.v2.model.LogsArchiveIntegrationGCS;
import com.datadog.api.client.v2.model.LogsArchiveIntegrationS3;
import com.datadog.api.client.v2.model.LogsArchiveOrder;
import com.datadog.api.client.v2.model.LogsArchiveOrderAttributes;
import com.datadog.api.client.v2.model.LogsArchiveOrderDefinition;
import com.datadog.api.client.v2.model.LogsArchives;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openapitools.jackson.nullable.JsonNullableModule;

/** API tests for LogsArchivesApi */
public class LogsArchivesApiTest extends V2APITest {

  public static final String ARCHIVE_ID = "FOObar";
  private static LogsArchivesApi api;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final String fixturePrefix = "client/v2/api/logs_archives_fixtures";
  private final String apiUriForArchives = "/api/v2/logs/config/archives";
  private final String apiUriForArchiveOrder = "/api/v2/logs/config/archive-order";

  @Override
  public String getTracingEndpoint() {
    return "logs-archives";
  }

  @BeforeClass
  public static void initApi() {
    api = new LogsArchivesApi(generalApiUnitTestClient);
    objectMapper.registerModule(new JsonNullableModule());
  }

  /**
   * Create an archive S3
   *
   * <p>Create an archive in your organization.
   *
   * @throws IOException
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createLogsArchiveTestS3() throws IOException, ApiException {
    LogsArchiveCreateRequest archive = createLogsArchiveCreateRequestS3();
    String archiveType = "s3";
    String outputData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, archiveType, "create.json"));
    stubFor(
        post(urlPathEqualTo(apiUriForArchives))
            .withRequestBody(equalToJson(objectMapper.writeValueAsString(archive)))
            .willReturn(okJson(outputData).withStatus(200)));
    LogsArchive response = api.createLogsArchive(archive);
    assertEquals(objectMapper.readValue(outputData, LogsArchive.class), response);
  }

  /**
   * Create an archive Azure
   *
   * <p>Create an archive in your organization.
   *
   * @throws IOException
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createLogsArchiveTestAzure() throws IOException, ApiException {
    LogsArchiveCreateRequest archive = createLogsArchiveCreateRequestAzure();
    String archiveType = "azure";
    String outputData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, archiveType, "create.json"));
    stubFor(
        post(urlPathEqualTo(apiUriForArchives))
            .withRequestBody(equalToJson(objectMapper.writeValueAsString(archive)))
            .willReturn(okJson(outputData).withStatus(200)));
    LogsArchive response = api.createLogsArchive(archive);
    assertEquals(objectMapper.readValue(outputData, LogsArchive.class), response);
  }

  /**
   * Create an archive GCS
   *
   * <p>Create an archive in your organization.
   *
   * @throws IOException
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createLogsArchiveTestGCS() throws IOException, ApiException {
    LogsArchiveCreateRequest archive = createLogsArchiveCreateRequestGCS();
    String archiveType = "gcs";
    String outputData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, archiveType, "create.json"));
    stubFor(
        post(urlPathEqualTo(apiUriForArchives))
            .withRequestBody(equalToJson(objectMapper.writeValueAsString(archive)))
            .willReturn(okJson(outputData).withStatus(200)));
    LogsArchive response = api.createLogsArchive(archive);
    assertEquals(objectMapper.readValue(outputData, LogsArchive.class), response);
  }

  /**
   * Delete an archive
   *
   * <p>Delete a given archive from your organization.
   *
   * @throws IOException
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteLogsArchiveTest() throws IOException, ApiException {
    String archiveType = "s3";
    String fixtureData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, archiveType, "getbyid.json"));
    stubFor(
        delete(urlPathEqualTo(String.format("%s/%s", apiUriForArchives, ARCHIVE_ID)))
            .willReturn(okJson(fixtureData).withStatus(204)));
    ApiResponse<Void> response = api.deleteLogsArchiveWithHttpInfo(ARCHIVE_ID);
    assertEquals(204, response.getStatusCode());
  }

  /**
   * Get an archive
   *
   * <p>Get a specific archive from your organization.
   *
   * @throws IOException
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getLogsArchiveTest() throws IOException, ApiException {
    String archiveType = "s3";
    String fixtureData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, archiveType, "getbyid.json"));
    stubFor(
        get(urlPathEqualTo(String.format("%s/%s", apiUriForArchives, ARCHIVE_ID)))
            .willReturn(okJson(fixtureData).withStatus(200)));
    LogsArchive response = api.getLogsArchive(ARCHIVE_ID);
    assertEquals(objectMapper.readValue(fixtureData, LogsArchive.class), response);
  }

  /**
   * Get all archives
   *
   * <p>Get the list of configured logs archives with their definitions.
   *
   * @throws IOException
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listLogsArchivesTest() throws IOException, ApiException {
    String archiveType = "s3";
    String fixtureData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, archiveType, "getall.json"));
    stubFor(get(urlPathEqualTo(apiUriForArchives)).willReturn(okJson(fixtureData).withStatus(200)));
    LogsArchives response = api.listLogsArchives();
    assertEquals(objectMapper.readValue(fixtureData, LogsArchives.class), response);
  }

  /**
   * Update an archive
   *
   * <p>Update a given archive configuration. **Note**: Using this method updates your archive
   * configuration by **replacing** your current configuration with the new one sent to your Datadog
   * organization.
   *
   * @throws IOException
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateLogsArchiveTest() throws IOException, ApiException {
    String archiveType = "s3";
    LogsArchiveCreateRequest input = createLogsArchiveCreateRequestS3();
    String outputData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, archiveType, "update.json"));
    stubFor(
        put(urlPathEqualTo(String.format("%s/%s", apiUriForArchives, ARCHIVE_ID)))
            .withRequestBody(equalToJson(objectMapper.writeValueAsString(input)))
            .willReturn(okJson(outputData).withStatus(200)));
    LogsArchive response = api.updateLogsArchive(ARCHIVE_ID, input);
    assertEquals(objectMapper.readValue(outputData, LogsArchive.class), response);
  }

  /** Get an ordered list of archive IDs */
  @Test
  public void getArchiveOrderTest() throws ApiException, IOException {
    String outputData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, "archive_order", "default.json"));
    stubFor(
        get(urlPathEqualTo(String.format("%s", apiUriForArchiveOrder)))
            .willReturn(okJson(outputData).withStatus(200)));

    LogsArchiveOrder response = api.getLogsArchiveOrder();
    assertEquals(objectMapper.readValue(outputData, LogsArchiveOrder.class), response);
  }

  /** update the order of archives */
  @Test
  public void updateArchiveOrderTest() throws ApiException, IOException {
    LogsArchiveOrder input = createUpdatedLogsArchiveOrder();
    String outputData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, "archive_order", "updated.json"));
    stubFor(
        put(urlPathEqualTo(String.format("%s", apiUriForArchiveOrder)))
            .withRequestBody(equalToJson(objectMapper.writeValueAsString(input)))
            .willReturn(okJson(outputData).withStatus(200)));

    LogsArchiveOrder response = api.updateLogsArchiveOrder(input);
    assertEquals(objectMapper.readValue(outputData, LogsArchiveOrder.class), response);
  }

  private LogsArchiveOrder createUpdatedLogsArchiveOrder() throws IOException {
    String getDefaultData =
        TestUtils.getFixture(
            String.format("%s/%s/out/%s", fixturePrefix, "archive_order", "default.json"));
    LogsArchiveOrder oldArchiveOrder =
        objectMapper.readValue(getDefaultData, LogsArchiveOrder.class);
    assert oldArchiveOrder.getData() != null;
    assert oldArchiveOrder.getData().getAttributes() != null;
    List<String> newArchiveIds = oldArchiveOrder.getData().getAttributes().getArchiveIds();
    newArchiveIds.add(newArchiveIds.get(0));
    newArchiveIds.remove(0);
    LogsArchiveOrderAttributes archiveOrderAttributes = new LogsArchiveOrderAttributes();
    archiveOrderAttributes.setArchiveIds(newArchiveIds);
    LogsArchiveOrderDefinition archiveOrderDefinition = new LogsArchiveOrderDefinition();
    archiveOrderDefinition.setAttributes(archiveOrderAttributes);
    LogsArchiveOrder logsArchiveOrder = new LogsArchiveOrder();
    logsArchiveOrder.setData(archiveOrderDefinition);

    return logsArchiveOrder;
  }

  private LogsArchiveCreateRequest createLogsArchiveCreateRequestS3() {
    LogsArchiveIntegrationS3 integration =
        new LogsArchiveIntegrationS3()
            .accountId("711111111111")
            .roleName("DatadogGoClientTestIntegrationRole");
    LogsArchiveEncryptionS3 encryptionS3 =
        new LogsArchiveEncryptionS3().key("test").type(LogsArchiveEncryptionS3Type.NO_OVERRIDE);
    LogsArchiveDestinationS3 destination =
        new LogsArchiveDestinationS3()
            .integration(integration)
            .encryption(encryptionS3)
            .bucket("dd-logs-test-datadog-api-client-go")
            .path("/path/toto")
            .type(LogsArchiveDestinationS3Type.S3);
    LogsArchiveCreateRequestAttributes attributes =
        new LogsArchiveCreateRequestAttributes()
            .destination(new LogsArchiveCreateRequestDestination(destination))
            .name("datadog-api-client-go Tests Archive")
            .query("service:toto")
            .rehydrationTags(Arrays.asList("team:intake", "team:app"))
            .includeTags(true);
    return new LogsArchiveCreateRequest()
        .data(new LogsArchiveCreateRequestDefinition().attributes(attributes));
  }

  private LogsArchiveCreateRequest createLogsArchiveCreateRequestAzure() {
    LogsArchiveIntegrationAzure integration =
        new LogsArchiveIntegrationAzure()
            .clientId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa")
            .tenantId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa");
    LogsArchiveDestinationAzure destination =
        new LogsArchiveDestinationAzure()
            .integration(integration)
            .path("/path/blou")
            .region("my-region")
            .storageAccount("storageAccount")
            .path("/path/blou")
            .container("my-container")
            .type(LogsArchiveDestinationAzureType.AZURE);
    LogsArchiveCreateRequestAttributes attributes =
        new LogsArchiveCreateRequestAttributes()
            .destination(new LogsArchiveCreateRequestDestination(destination))
            .name("datadog-api-client-go Tests Archive")
            .query("service:toto")
            .rehydrationTags(Arrays.asList("team:intake", "team:app"))
            .includeTags(true);
    return new LogsArchiveCreateRequest()
        .data(new LogsArchiveCreateRequestDefinition().attributes(attributes));
  }

  private LogsArchiveCreateRequest createLogsArchiveCreateRequestGCS() {
    LogsArchiveIntegrationGCS integration =
        new LogsArchiveIntegrationGCS()
            .clientEmail("email@email.com")
            .projectId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa");
    LogsArchiveDestinationGCS destination =
        new LogsArchiveDestinationGCS()
            .integration(integration)
            .bucket("dd-logs-test-datadog-api-client-go")
            .path("/path/blou")
            .type(LogsArchiveDestinationGCSType.GCS);
    LogsArchiveCreateRequestAttributes attributes =
        new LogsArchiveCreateRequestAttributes()
            .destination(new LogsArchiveCreateRequestDestination(destination))
            .name("datadog-api-client-go Tests Archive")
            .query("service:toto")
            .rehydrationTags(Arrays.asList("team:intake", "team:app"))
            .includeTags(true);
    return new LogsArchiveCreateRequest()
        .data(new LogsArchiveCreateRequestDefinition().attributes(attributes));
  }

  @Test
  public void TestDeserializationUnknownNestedOneOf()
      throws JsonProcessingException, NoSuchFieldException, IllegalAccessException {
    String body =
        "{\"data\":{\"type\":\"archives\",\"id\":\"n_XDSxVpScepiBnyhysj_A\",\"attributes\":{\"name\":\"my"
            + " first azure"
            + " archive\",\"query\":\"service:toto\",\"state\":\"UNKNOWN\",\"destination\":{\"container\":\"my-container\",\"storage_account\":\"storageaccount\",\"path\":\"/path/blou\",\"type\":\"A"
            + " non existent"
            + " destination\",\"integration\":{\"tenant_id\":\"tf-TestAccDatadogLogsArchiveAzure_basic-local-1624981538\",\"client_id\":\"testc7f6-1234-5678-9101-3fcbf464test\"}},\"rehydration_tags\":[],\"include_tags\":false}}}";
    ObjectMapper mapper = generalApiClient.getJSON().getMapper();
    Object res = fromJSON(mapper, LogsArchive.class, body);

    assertFalse(((LogsArchive) res).unparsed);
    assertFalse((Boolean) lookup(res, "data.attributes.unparsed"));
    assertEquals(
        "A non existent destination", lookup(res, "data.attributes.destination.type").toString());
  }
}
