/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 */


package com.datadog.api.v2.client.api;

import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.put;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.junit.Assert.assertEquals;

import com.datadog.api.TestUtils;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.model.LogsArchive;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequest;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequestAttributes;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequestDefinition;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequestDestination;
import com.datadog.api.v2.client.model.LogsArchiveDefinition;
import com.datadog.api.v2.client.model.LogsArchiveDestinationAzure;
import com.datadog.api.v2.client.model.LogsArchiveDestinationAzureType;
import com.datadog.api.v2.client.model.LogsArchiveDestinationGCS;
import com.datadog.api.v2.client.model.LogsArchiveDestinationGCSType;
import com.datadog.api.v2.client.model.LogsArchiveDestinationS3;
import com.datadog.api.v2.client.model.LogsArchiveDestinationS3Type;
import com.datadog.api.v2.client.model.LogsArchiveIntegrationAzure;
import com.datadog.api.v2.client.model.LogsArchiveIntegrationGCS;
import com.datadog.api.v2.client.model.LogsArchiveIntegrationS3;
import com.datadog.api.v2.client.model.LogsArchives;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * API tests for LogsArchivesApi
 */
public class LogsArchivesApiTest extends V2APITest {

    private static LogsArchivesApi api;

    // ObjectMapper instance configure to not fail when encountering unknown properties
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private final String fixturePrefix = "v2/client/api/logs_archives_fixtures";
    private final String apiUri = "/api/v2/logs/config/archives";


    @BeforeClass
    public static void initApi() {
        api = new LogsArchivesApi(generalApiUnitTestClient);
    }

    /**
     * Create an archive S3
     *
     * Create an archive in your organization.
     *
     * @throws IOException
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLogsArchiveTestS3() throws IOException, ApiException {
        LogsArchiveCreateRequest archive = getLogsArchiveCreateRequestS3();
        String archiveType = "s3";
        String outputData = TestUtils.getFixture(String.format("%s/%s/out/%s", fixturePrefix, archiveType, "create.json"));
        stubFor(post(urlPathEqualTo(apiUri))
                .withRequestBody(equalToJson(objectMapper.writeValueAsString(archive)))
                .willReturn(okJson(outputData).withStatus(200))
        );
        LogsArchive response = api.createLogsArchive().body(archive).execute();
        assertEquals(objectMapper.readValue(outputData, LogsArchive.class), response);
    }

    /**
     * Create an archive Azure
     *
     * Create an archive in your organization.
     *
     * @throws IOException
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLogsArchiveTestAzure() throws IOException, ApiException {
        LogsArchiveCreateRequest archive = getLogsArchiveCreateRequestAzure();
        String archiveType = "azure";
        String outputData = TestUtils.getFixture(String.format("%s/%s/out/%s", fixturePrefix, archiveType, "create.json"));
        stubFor(post(urlPathEqualTo(apiUri))
                .withRequestBody(equalToJson(objectMapper.writeValueAsString(archive)))
                .willReturn(okJson(outputData).withStatus(200))
        );
        LogsArchive response = api.createLogsArchive().body(archive).execute();
        assertEquals(objectMapper.readValue(outputData, LogsArchive.class), response);
    }

    /**
     * Create an archive GCS
     *
     * Create an archive in your organization.
     *
     * @throws IOException
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLogsArchiveTestGCS() throws IOException, ApiException {
        LogsArchiveCreateRequest archive = getLogsArchiveCreateRequestGCS();
        String archiveType = "gcs";
        String outputData = TestUtils.getFixture(String.format("%s/%s/out/%s", fixturePrefix, archiveType, "create.json"));
        stubFor(post(urlPathEqualTo(apiUri))
                .withRequestBody(equalToJson(objectMapper.writeValueAsString(archive)))
                .willReturn(okJson(outputData).withStatus(200))
        );
        LogsArchive response = api.createLogsArchive().body(archive).execute();
        assertEquals(objectMapper.readValue(outputData, LogsArchive.class), response);
    }


    /**
     * Delete an archive
     *
     * Delete a given archive from your organization.
     *
     * @throws IOException
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLogsArchiveTest() throws IOException, ApiException {
        String archiveType = "s3";
        String fixtureData = TestUtils.getFixture(String.format("%s/%s/out/%s", fixturePrefix, archiveType, "getbyid.json"));
        String archiveId = "XVlBzgbaiC";
        stubFor(delete(urlPathEqualTo(String.format("%s/%s", apiUri, archiveId)))
                .willReturn(okJson(fixtureData).withStatus(204))
        );
        ApiResponse<Void> response = api.deleteLogsArchive(archiveId).executeWithHttpInfo();
        assertEquals(204, response.getStatusCode());
    }
    
    /**
     * Get an archive
     *
     * Get a specific archive from your organization.
     *
     * @throws IOException
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogsArchiveTest() throws IOException, ApiException {
        String archiveType = "s3";
        String fixtureData = TestUtils.getFixture(String.format("%s/%s/out/%s", fixturePrefix, archiveType, "getbyid.json"));
        String archiveId = "XVlBzgbaiC";
        stubFor(get(urlPathEqualTo(String.format("%s/%s", apiUri, archiveId)))
                .willReturn(okJson(fixtureData).withStatus(200))
        );
        LogsArchive response = api.getLogsArchive(archiveId).execute();
        checkS3Archive(response.getData());
    }
    
    /**
     * Get all archives
     *
     * Get the list of configured logs archives with their definitions.
     *
     * @throws IOException
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLogsArchivesTest() throws IOException, ApiException {
        String archiveType = "s3";
        String fixtureData = TestUtils.getFixture(String.format("%s/%s/out/%s", fixturePrefix, archiveType, "getall.json"));
        stubFor(get(urlPathEqualTo(apiUri))
                .willReturn(okJson(fixtureData).withStatus(200))
        );
        LogsArchives response = api.listLogsArchives().execute();
        assertEquals(1, response.getData().size());
        checkS3Archive(response.getData().get(0));
    }
    
    /**
     * Update an archive
     *
     * Update a given archive configuration.  **Note**: Using this method updates your archive configuration by **replacing** your current configuration with the new one sent to your Datadog organization.
     *
     * @throws IOException
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLogsArchiveTest() throws IOException, ApiException {
        String archiveType = "s3";
        LogsArchiveCreateRequest input = getLogsArchiveCreateRequestS3();
        String outputData = TestUtils.getFixture(String.format("%s/%s/out/%s", fixturePrefix, archiveType, "update.json"));
        String archiveId = "XVlBzgbaiC";
        stubFor(put(urlPathEqualTo(String.format("%s/%s", apiUri, archiveId)))
                .withRequestBody(equalToJson(objectMapper.writeValueAsString(input)))
                .willReturn(okJson(outputData).withStatus(200))
        );
        LogsArchive response = api.updateLogsArchive(archiveId).body(input).execute();
        checkS3Archive(response.getData(), "/path/toto", "service:toto");
    }

    private LogsArchiveCreateRequest getLogsArchiveCreateRequestS3() {
        LogsArchiveIntegrationS3 integration = new LogsArchiveIntegrationS3()
                .accountId("711111111111")
                .roleName("DatadogGoClientTestIntegrationRole");
        LogsArchiveDestinationS3 destination = new LogsArchiveDestinationS3()
                .integration(integration)
                .bucket("dd-logs-test-datadog-api-client-go")
                .path("/path/toto")
                .type(LogsArchiveDestinationS3Type.S3);
        LogsArchiveCreateRequestAttributes attributes = new LogsArchiveCreateRequestAttributes()
                .destination(new LogsArchiveCreateRequestDestination(destination))
                .name("datadog-api-client-go Tests Archive")
                .query("service:toto");
        return new LogsArchiveCreateRequest().data(new LogsArchiveCreateRequestDefinition().attributes(attributes));
    }

    private LogsArchiveCreateRequest getLogsArchiveCreateRequestAzure() {
        LogsArchiveIntegrationAzure integration = new LogsArchiveIntegrationAzure()
                .clientId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa")
                .tenantId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa");
        LogsArchiveDestinationAzure destination = new LogsArchiveDestinationAzure()
                .integration(integration)
                .path("/path/blou")
                .region("my-region")
                .storageAccount("storageAccount")
                .path("/path/blou")
                .container("my-container")
                .type(LogsArchiveDestinationAzureType.AZURE);
        LogsArchiveCreateRequestAttributes attributes = new LogsArchiveCreateRequestAttributes()
                .destination(new LogsArchiveCreateRequestDestination(destination))
                .name("datadog-api-client-go Tests Archive")
                .query("service:toto");
        return new LogsArchiveCreateRequest().data(new LogsArchiveCreateRequestDefinition().attributes(attributes));
    }

    private LogsArchiveCreateRequest getLogsArchiveCreateRequestGCS() {
        LogsArchiveIntegrationGCS integration = new LogsArchiveIntegrationGCS()
                .clientEmail("email@email.com")
                .projectId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa");
        LogsArchiveDestinationGCS destination = new LogsArchiveDestinationGCS()
                .integration(integration)
                .bucket("dd-logs-test-datadog-api-client-go")
                .path("/path/blou")
                .type(LogsArchiveDestinationGCSType.GCS);
        LogsArchiveCreateRequestAttributes attributes = new LogsArchiveCreateRequestAttributes()
                .destination(new LogsArchiveCreateRequestDestination(destination))
                .name("datadog-api-client-go Tests Archive")
                .query("service:toto");
        return new LogsArchiveCreateRequest().data(new LogsArchiveCreateRequestDefinition().attributes(attributes));
    }

    private void checkS3Archive(LogsArchiveDefinition outputArchive) {
        checkS3Archive(outputArchive, "/path/blou", "source:tata");
    }

    private void checkS3Archive(LogsArchiveDefinition outputArchive, String path, String query) {
        assertEquals(outputArchive.getType(), "archives");
        LogsArchiveDestinationS3 destination = (LogsArchiveDestinationS3) outputArchive.getAttributes().getDestination().getActualInstance();
        assertEquals(destination.getType(), LogsArchiveDestinationS3Type.S3);
        assertEquals(destination.getIntegration().getAccountId(), "711111111111");
        assertEquals(destination.getIntegration().getRoleName(), "DatadogGoClientTestIntegrationRole");
        assertEquals(destination.getPath(), path);
        assertEquals(destination.getBucket(), "dd-logs-test-datadog-api-client-go");
        assertEquals(outputArchive.getAttributes().getName(), "datadog-api-client-go Tests Archive");
        assertEquals(outputArchive.getAttributes().getQuery(), query);
        assertEquals(outputArchive.getId(), "XVlBzgbaiC");
    }
    
}
