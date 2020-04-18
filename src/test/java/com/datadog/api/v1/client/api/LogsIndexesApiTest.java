/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.model.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * API tests for LogsIndexesApi
 */
public class LogsIndexesApiTest extends V1ApiTest {

    private static LogsIndexesApi api;
    private static LogsIndexesApi fakeAuthApi;
    private static LogsIndexesApi unitApi;
    private final String INDEXNAME = "main";

    // ObjectMapper instance configure to not fail when encountering unknown properties
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private final String apiUri = "/api/v1/logs/config/indexes";
    private final String fixturePrefix = "v1/client/api/logs_indexes_fixtures";


    @BeforeClass
    public static void initApi() {
        api = new LogsIndexesApi(generalApiClient);
        fakeAuthApi = new LogsIndexesApi(generalFakeAuthApiClient);
        unitApi = new LogsIndexesApi(generalApiUnitTestClient);
    }

    @BeforeClass
    public static void enableUnstableOperations() {
        generalApiClient.setUnstableOperationEnabled("getLogsIndex", true);
        generalApiClient.setUnstableOperationEnabled("listLogIndexes", true);
        generalApiClient.setUnstableOperationEnabled("updateLogsIndex", true);
        generalFakeAuthApiClient.setUnstableOperationEnabled("getLogsIndex", true);
        generalFakeAuthApiClient.setUnstableOperationEnabled("listLogIndexes", true);
        generalFakeAuthApiClient.setUnstableOperationEnabled("updateLogsIndex", true);
        generalApiUnitTestClient.setUnstableOperationEnabled("getLogsIndex", true);
        generalApiUnitTestClient.setUnstableOperationEnabled("listLogIndexes", true);
        generalApiUnitTestClient.setUnstableOperationEnabled("updateLogsIndex", true);
    }

    @AfterClass
    public static void disableUnstableOperations() {
        generalApiClient.setUnstableOperationEnabled("getLogsIndex", false);
        generalApiClient.setUnstableOperationEnabled("listLogIndexes", false);
        generalApiClient.setUnstableOperationEnabled("updateLogsIndex", false);
        generalFakeAuthApiClient.setUnstableOperationEnabled("getLogsIndex", false);
        generalFakeAuthApiClient.setUnstableOperationEnabled("listLogIndexes", false);
        generalFakeAuthApiClient.setUnstableOperationEnabled("updateLogsIndex", false);
        generalApiUnitTestClient.setUnstableOperationEnabled("getLogsIndex", false);
        generalApiUnitTestClient.setUnstableOperationEnabled("listLogIndexes", false);
        generalApiUnitTestClient.setUnstableOperationEnabled("updateLogsIndex", false);
    }

    /**
     * This endpoint returns an array of the LogIndex objects of your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLogIndexesTest() throws ApiException {
        LogsIndexListResponse response = api.listLogIndexes().execute();
        assertTrue(0 < response.getIndexes().size());
    }

    /**
     * This endpoint returns an Index identified by its name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLogsIndexTest() throws ApiException {
        LogsIndex response = api.getLogsIndex(INDEXNAME).execute();
        assertEquals(INDEXNAME, response.getName());
        assertEquals("", response.getFilter().getQuery());
        assertNotNull(response.getExclusionFilters().size());
        assertNotNull(response.getDailyLimit());
        assertNotNull(response.getIsRateLimited());
        assertNotNull(response.getNumRetentionDays());
    }

    /**
     * Get the current order of your log indexes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLogsIndexOrderTest() throws ApiException {
        LogsIndexesOrder response = api.getLogsIndexOrder().execute();
        assertTrue(0 < response.getIndexNames().size());
        assertTrue(response.getIndexNames().contains(INDEXNAME));
    }

    /**
     * Unit Test
     * This endpoint updates an Index identified by its name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateLogsIndexTest() throws ApiException, IOException {
        stubFor(get(urlPathEqualTo(String.format("/api/v1/logs/config/indexes/%s", INDEXNAME)))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/logs_indexes_fixtures/get_index.json")))
        );
        LogsIndex orig = unitApi.getLogsIndex(INDEXNAME).execute();
        resetWiremock();

        List<LogsExclusion> exclusionFilters = new ArrayList<LogsExclusion>();
        LogsExclusion exclusion = new LogsExclusion()
            .name(String.format("datadog-api-client-java"))
            .isEnabled(false)
            .filter(new LogsExclusionFilter().query("*").sampleRate(1.0));
        exclusionFilters.add(exclusion);

        LogsIndex body = new LogsIndex()
            .filter(orig.getFilter())
            .exclusionFilters(exclusionFilters);

        stubFor(put(urlPathEqualTo(String.format("/api/v1/logs/config/indexes/%s", INDEXNAME)))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/logs_indexes_fixtures/update_index.json")))
        );
        LogsIndex response = unitApi.updateLogsIndex(INDEXNAME).body(body).execute();
        resetWiremock();
        assertEquals(body.getExclusionFilters(), response.getExclusionFilters());
    }

    /**
     * Unit Test
     * Update the order of your log indexes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateLogsIndexOrderTest() throws ApiException, IOException {
        // Get current index order
        stubFor(get(urlPathEqualTo("/api/v1/logs/config/index-order"))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/logs_indexes_fixtures/get_index_order.json")))
        );

        LogsIndexesOrder body = unitApi.getLogsIndexOrder().execute();
        resetWiremock();
        List<String> names = body.getIndexNames();

        // Slightly change order
        List<String> newOrder = new ArrayList<>(names);
        newOrder.add(newOrder.get(0));
        newOrder.remove(0);
        body.setIndexNames(newOrder);
        stubFor(put(urlPathEqualTo("/api/v1/logs/config/index-order"))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/logs_indexes_fixtures/updated_index_order.json")))
        );
        LogsIndexesOrder response = unitApi.updateLogsIndexOrder().body(body).execute();
        resetWiremock();
        assertEquals(body.getIndexNames(), response.getIndexNames());
    }

    @Test
    @Ignore // FIXME: Ignore the test for now as the endpoint is responding with a 502
    public void logsIndexesListErrorsTest() throws IOException {
        try {
            fakeAuthApi.listLogIndexes().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    @Ignore // FIXME: Ignore the test for now as the endpoint is responding with a 502
    public void logsIndexesGetErrorsTest() throws IOException {
        try {
            fakeAuthApi.getLogsIndex("shrugs").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.getLogsIndex("shrugs").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    @Ignore // FIXME: Ignore the test for now as the endpoint is responding with a 502
    public void logsIndexesUpdateErrorsTest() throws IOException {
        try {
            api.updateLogsIndex("shrugs").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.updateLogsIndex("shrugs").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        //mock 429 - Too many requests response
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_429.json");
        stubFor(put(urlPathEqualTo(apiUri + "/shrugs"))
                .willReturn(okJson(fixtureData).withStatus(429))
        );
        // Mock the 429 response
        try {
            unitApi.updateLogsIndex("shrugs").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(429, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    @Ignore // FIXME: Ignore the test for now as the endpoint is responding with a 502
    public void logsIndexesOrderGetErrorsTest() throws IOException {
        try {
            fakeAuthApi.getLogsIndexOrder().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    @Ignore // FIXME: Ignore the test for now as the endpoint is responding with 429 and 502
    public void logsIndexesOrderUpdateErrorsTest() throws IOException {
        try {
            api.updateLogsIndexOrder().body(new LogsIndexesOrder()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.updateLogsIndexOrder().body(new LogsIndexesOrder()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
}