/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;


import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

/**
 * API tests for SyntheticsApi
 */
public class SyntheticsApiTest extends V1ApiTest {
    private static SyntheticsApi api;
    private static SyntheticsApi fakeAuthApi;
    private static SyntheticsApi unitApi;

    // ObjectMapper instance configure to not fail when encountering unknown properties
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private final String apiUri = "/api/v1/synthetics";
    private final String fixturePrefix = "v1/client/api/synthetics_fixtures";
    private ArrayList<String> deleteSyntheticsTests = null;
    private SyntheticsTestDetails apiTestConfig = new SyntheticsTestDetails()
            .config(new SyntheticsTestConfig()
                    .assertions(Arrays.asList(
                            new SyntheticsAssertion()
                                    .operator(SyntheticsAssertionOperator.IS)
                                    .property("content-type")
                                    .target("text/html")
                                    .type(SyntheticsAssertionType.HEADER),
                            new SyntheticsAssertion()
                                    .operator(SyntheticsAssertionOperator.LESS_THAN)
                                    .target(2000)
                                    .type(SyntheticsAssertionType.RESPONSE_TIME)
                    ))
                    .request(new SyntheticsTestRequest()
                            .headers(new HashMap<String, String>() {{put("testingJavaClient", "true");}})
                            .method(HTTPMethod.GET)
                            .timeout(10.0)
                            .url("https://datadoghq.com")
                    )
            )
            .locations(Arrays.asList("aws:us-east-2"))
            .message("testing Synthetics API test - this is message")
            .name("testing Synthetics API test")
            .options(new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .followRedirects(true)
                    .minLocationFailed(10L)
                    .retry(new SyntheticsTestOptionsRetry()
                            .count(3L)
                            .interval(10.0)
                    )
                    .tickEvery(SyntheticsTickInterval.MINUTE)
            )
            .subtype(SyntheticsTestDetailsSubType.HTTP)
            .tags(Arrays.asList("testing:api"))
            .type(SyntheticsTestDetailsType.API);
    private SyntheticsTestDetails browserTestConfig = new SyntheticsTestDetails()
            .config(new SyntheticsTestConfig()
                    .assertions(Arrays.<SyntheticsAssertion>asList())
                    .request(new SyntheticsTestRequest()
                            .method(HTTPMethod.GET)
                            .url("https://datadoghq.com")
                    )
            )
            .locations(Arrays.asList("aws:us-east-2"))
            .message("testing Synthetics Browser test - this is message")
            .name("testing Synthetics Browser test")
            .options(new SyntheticsTestOptions()
                    .acceptSelfSigned(false)
                    .deviceIds(Arrays.asList(SyntheticsDeviceID.TABLET))
                    .followRedirects(true)
                    .minLocationFailed(10L)
                    .retry(new SyntheticsTestOptionsRetry()
                            .count(3L)
                            .interval(10.0)
                    )
                    .tickEvery(SyntheticsTickInterval.FIVE_MINUTES)
            )
            .tags(Arrays.asList("testing:browser"))
            .type(SyntheticsTestDetailsType.BROWSER);

    @Before
    public void resetDeleteSyntheticsTests() {
        deleteSyntheticsTests = new ArrayList<String>();
    }

    @BeforeClass
    public static void initApi() {
        api = new SyntheticsApi(generalApiClient);
        fakeAuthApi = new SyntheticsApi(generalFakeAuthApiClient);
        unitApi = new SyntheticsApi(generalApiUnitTestClient);
    }

    @After
    public void deleteSLOs() throws ApiException {
        if (deleteSyntheticsTests != null) {
            for (String id : deleteSyntheticsTests) {
                try {
                    api.deleteTests().body(new SyntheticsDeleteTestsPayload().publicIds(Arrays.asList(id))).execute();
                } catch (ApiException e) {
                    if (e.getCode() == 404) {
                        // doesn't exist => continue
                        continue;
                    } else {
                        throw e;
                    }
                }
            }
        }
    }

    @Test
    public void testSyntheticsAPILifecycle() throws ApiException, IOException {
        SyntheticsTestDetails synt;
        String publicId;
        Boolean pauseStatus;
        SyntheticsGetAPITestLatestResultsResponse latestResults;
        SyntheticsAPITestResultFull singleResult;
        File recentResultsFixture = new File(getClass()
                .getResource("synthetics_fixtures/api_test_recent_results.json").getFile());
        File singleResultFixture = new File(getClass()
                .getResource("synthetics_fixtures/api_test_single_result.json").getFile());

        // Create API test
        synt = api.createTest().body(apiTestConfig).execute();
        publicId = synt.getPublicId();
        deleteSyntheticsTests.add(publicId);
        assertEquals("testing Synthetics API test", synt.getName());

        // Update API test
        synt.setName("updated name");
        // if we want to reuse the entity returned by the API, we must set these fields to null, as they can't be sent back
        synt.setCreatedAt(null);
        synt.setCreatedBy(null);
        synt.setModifiedAt(null);
        synt.setPublicId(null);
        synt = api.updateTest(publicId).body(synt).execute();
        assertEquals("updated name", synt.getName());

        // Get API test
        synt = api.getTest(publicId).execute();
        assertEquals("updated name", synt.getName());

        // NOTE: API tests are started by default, so we have to stop it first
        // Stop API test
        pauseStatus = api.updateTestPauseStatus(publicId)
                .body(new SyntheticsUpdateTestPauseStatusPayload().newStatus(SyntheticsTestPauseStatus.PAUSED))
                .execute();
        assertEquals(true, pauseStatus);

        // Start API test
        pauseStatus = api.updateTestPauseStatus(publicId)
                .body(new SyntheticsUpdateTestPauseStatusPayload().newStatus(SyntheticsTestPauseStatus.LIVE))
                .execute();
        assertEquals(true, pauseStatus);

        // Get the most recent API test results
        latestResults = api.getAPITestLatestResults(publicId)
                .fromTs(0L)
                .toTs(now.toInstant().toEpochMilli())
                .probeDc(Arrays.asList("aws:us-east-2"))
                .execute();
        // API tests sometimes have a delay before getting first result, so we use a mock response to verify
        // that deserialization works properly
        try {
            generalApiClient
                    .getJSON()
                    .getContext(null)
                    .readValue(recentResultsFixture, SyntheticsGetAPITestLatestResultsResponse.class);
        } catch (Exception e) {
            assertNull(e);
        }

        // Get a specific API test result
        // Again, using a mock response to just test deserialization
        try {
            generalApiClient
                    .getJSON()
                    .getContext(null)
                    .readValue(singleResultFixture, SyntheticsAPITestResultFull.class);
        } catch (Exception e) {
            assertNull(e);
        }

        // Retrieve a single result. Use a mock as it takes time for a result to be available
        stubFor(get(urlPathEqualTo("/api/v1/synthetics/tests/test-synthetics-id/results/test-result-id"))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/synthetics_fixtures/api_test_single_result.json")))
        );
        SyntheticsAPITestResultFull result = unitApi.getAPITestResult("test-synthetics-id", "test-result-id").execute();

        // Assert a few of the returned attributes unmarshall properly
        assertEquals(result.getStatus(), SyntheticsTestMonitorStatus.TRIGGERED);
        assertEquals(result.getCheckTime(), Double.valueOf("1580204310361"));
        assertEquals(result.getCheckVersion().intValue(), 2);
        assertEquals(result.getResultId(), "7761116396307201795");
        assertEquals(result.getResult().getEventType(), SyntheticsTestProcessStatus.FINISHED);

        // Delete API test
        api.deleteTests().body(new SyntheticsDeleteTestsPayload().publicIds(Arrays.asList(publicId))).execute();
    }

    @Test
    public void testSyntheticsBrowserLifecycle() throws ApiException, IOException {
        SyntheticsTestDetails synt;
        String publicId;
        Boolean pauseStatus;
        SyntheticsGetBrowserTestLatestResultsResponse latestResults;
        File recentResultsFixture = new File(getClass()
                .getResource("synthetics_fixtures/browser_test_recent_results.json").getFile());
        File singleResultFixture = new File(getClass()
                .getResource("synthetics_fixtures/browser_test_single_result.json").getFile());

        // Create Browser test
        synt = api.createTest().body(browserTestConfig).execute();
        publicId = synt.getPublicId();
        deleteSyntheticsTests.add(publicId);
        assertEquals("testing Synthetics Browser test", synt.getName());

        // Update Browser test
        synt.setName("updated name");
        // if we want to reuse the entity returned by the API, we must set these fields to null, as they can't be sent back
        synt.setCreatedAt(null);
        synt.setCreatedBy(null);
        synt.setModifiedAt(null);
        synt.setPublicId(null);
        synt = api.updateTest(publicId).body(synt).execute();
        assertEquals("updated name", synt.getName());

        // Get Browser test
        synt = api.getTest(publicId).execute();
        assertEquals("updated name", synt.getName());

        // NOTE: Browser tests are paused by default, so we have to run it first
        // Start Browser test
        pauseStatus = api.updateTestPauseStatus(publicId)
                .body(new SyntheticsUpdateTestPauseStatusPayload().newStatus(SyntheticsTestPauseStatus.LIVE))
                .execute();
        assertEquals(true, pauseStatus);

        // Stop Browser test
        pauseStatus = api.updateTestPauseStatus(publicId)
                .body(new SyntheticsUpdateTestPauseStatusPayload().newStatus(SyntheticsTestPauseStatus.PAUSED))
                .execute();
        assertEquals(true, pauseStatus);

        // Get the most recent Browser test results
        latestResults = api.getBrowserTestLatestResults(publicId)
                .fromTs(0L)
                .toTs(now.toInstant().toEpochMilli())
                .probeDc(Arrays.asList("aws:us-east-2"))
                .execute();
        assertTrue(latestResults.getResults().isEmpty());
        // Browser tests are asynchronous and take some time to run, so we use a mock response to verify
        // that deserialization works properly
        try {
            generalApiClient
                    .getJSON()
                    .getContext(null)
                    .readValue(recentResultsFixture, SyntheticsGetBrowserTestLatestResultsResponse.class);
        } catch (Exception e) {
            assertNull(e);
        }

        // Get a specific Browser test result
        // Again, using a mock response to just test deserialization
        stubFor(get(urlPathEqualTo("/api/v1/synthetics/tests/browser/test-synthetics-id/results/test-result-id"))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/synthetics_fixtures/browser_test_single_result.json")))
        );
        SyntheticsBrowserTestResultFull result = unitApi.getBrowserTestResult("test-synthetics-id", "test-result-id").execute();
        // Assert based on the data from the fixture file, test a few fields
        assertEquals(result.getResultId(), "5140738909114888212");
        assertEquals(result.getStatus(), SyntheticsTestMonitorStatus.UNTRIGGERED);
        assertEquals(result.getCheckTime(),  Double.valueOf("1579711893111"));
        assertEquals(result.getCheckVersion().intValue(), 5);

        // Delete Browser test
        api.deleteTests().body(new SyntheticsDeleteTestsPayload().publicIds(Arrays.asList(publicId))).execute();
    }

    @Test
    public void testSyntheticsMultipleTestsOperations() throws ApiException {
        SyntheticsTestDetails syntAPI, syntBrowser;
        SyntheticsListTestsResponse allTests;

        syntAPI = api.createTest().body(apiTestConfig).execute();
        deleteSyntheticsTests.add(syntAPI.getPublicId());
        syntBrowser = api.createTest().body(browserTestConfig).execute();
        deleteSyntheticsTests.add(syntBrowser.getPublicId());
        allTests = api.listTests().execute();

        assertPublicIdPresent(syntAPI.getPublicId(), allTests.getTests());
        assertPublicIdPresent(syntBrowser.getPublicId(), allTests.getTests());
    }

    public void assertPublicIdPresent(String publicId, List<SyntheticsTestDetails> tests) {
        for (SyntheticsTestDetails test : tests) {
            if (test.getPublicId().equals(publicId)) {
                return;
            }
        }

        assertTrue(String.format("Test %s not found in list retrieved from API", publicId), false);
    }

    @Test
    public void deleteSyntheticsErrorsTest() throws IOException {
        try {
            api.deleteTests().body(new SyntheticsDeleteTestsPayload()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.deleteTests().body(new SyntheticsDeleteTestsPayload()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void deleteSynthetics404ErrorsTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_404.json");
        stubFor(post(urlPathEqualTo(apiUri + "/tests/delete"))
                .willReturn(okJson(fixtureData).withStatus(404))
        );

        try {
            unitApi.deleteTests().body(new SyntheticsDeleteTestsPayload()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void updateStatusSyntheticsErrorsTest() throws ApiException, IOException {
        // Create API test
        SyntheticsTestDetails synt = api.createTest().body(apiTestConfig).execute();
        String publicId = synt.getPublicId();
        deleteSyntheticsTests.add(publicId);

        try {
            api.updateTestPauseStatus(publicId).body(new SyntheticsUpdateTestPauseStatusPayload()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.updateTestPauseStatus(publicId).body(new SyntheticsUpdateTestPauseStatusPayload()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.updateTestPauseStatus("aaa-aaa-aaa").body(new SyntheticsUpdateTestPauseStatusPayload()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void browserSpecificGetResultSyntheticsErrorsTest() throws IOException {
        try {
            fakeAuthApi.getBrowserTestResult("id", "resultid").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.getBrowserTestResult("aaa-aaa-aaa", "resultid").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void aPISpecificGetResultSyntheticsErrorsTest() throws IOException {
        try {
            fakeAuthApi.getAPITestResult("id", "resultid").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.getAPITestResult("aaa-aaa-aaa", "resultid").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getTestSyntheticsErrorsTest() throws IOException {
        try {
            fakeAuthApi.getTest( "id").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.getTest( "aaa-aaa-aaa").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void updateTestSyntheticsErrorsTest() throws ApiException, IOException {
        // Create API test
        SyntheticsTestDetails synt = api.createTest().body(apiTestConfig).execute();
        String publicId = synt.getPublicId();
        deleteSyntheticsTests.add(publicId);

        try {
            api.updateTest(publicId).body(new SyntheticsTestDetails()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.updateTest("id").body(new SyntheticsTestDetails()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.updateTest("aaa-aaa-aaa").body(new SyntheticsTestDetails()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void listTestSyntheticsErrorsTest() throws IOException {
        try {
            fakeAuthApi.listTests().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void listTestSynthetics404ErrorTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_404.json");
        stubFor(get(urlPathEqualTo(apiUri + "/tests"))
                .willReturn(okJson(fixtureData).withStatus(404))
        );

        try {
            unitApi.listTests().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void createTestSyntheticsErrorsTest() throws IOException {
        try {
            api.createTest().body(new SyntheticsTestDetails()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.createTest().body(new SyntheticsTestDetails()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void createTestSynthetics402ErrorTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_402.json");
        stubFor(post(urlPathEqualTo(apiUri + "/tests"))
                .willReturn(okJson(fixtureData).withStatus(402))
        );

        try {
            unitApi.createTest().body(new SyntheticsTestDetails()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(402, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
}
