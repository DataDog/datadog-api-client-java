/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.*;
import org.junit.*;

/** API tests for SyntheticsApi */
public class SyntheticsApiTest extends V1ApiTest {
  private static SyntheticsApi api;
  private static SyntheticsApi fakeAuthApi;
  private static SyntheticsApi unitApi;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final String apiUri = "/api/v1/synthetics";
  private final String fixturePrefix = "v1/client/api/synthetics_fixtures";
  private ArrayList<String> deleteSyntheticsTests = null;
  private SyntheticsTestDetails apiTestConfig =
      new SyntheticsTestDetails()
          .config(
              new SyntheticsTestConfig()
                  .assertions(
                      Arrays.asList(
                          new SyntheticsAssertion(
                              new SyntheticsAssertionTarget()
                                  .operator(SyntheticsAssertionOperator.IS)
                                  .property("content-type")
                                  .target("text/html")
                                  .type(SyntheticsAssertionType.HEADER)),
                          new SyntheticsAssertion(
                              new SyntheticsAssertionTarget()
                                  .operator(SyntheticsAssertionOperator.LESS_THAN)
                                  .target(2000)
                                  .type(SyntheticsAssertionType.RESPONSE_TIME))))
                  .request(
                      new SyntheticsTestRequest()
                          .headers(
                              new HashMap<String, String>() {
                                {
                                  put("testingJavaClient", "true");
                                }
                              })
                          .method(HTTPMethod.GET)
                          .timeout(10.0)
                          .url("https://datadoghq.com")))
          .locations(Arrays.asList("aws:us-east-2"))
          .message("testing Synthetics API test - this is message")
          .options(
              new SyntheticsTestOptions()
                  .acceptSelfSigned(false)
                  .allowInsecure(true)
                  .followRedirects(true)
                  .minFailureDuration(10L)
                  .minLocationFailed(1L)
                  .retry(new SyntheticsTestOptionsRetry().count(3L).interval(10.0))
                  .tickEvery(SyntheticsTickInterval.MINUTE))
          .subtype(SyntheticsTestDetailsSubType.HTTP)
          .tags(Arrays.asList("testing:api"))
          .type(SyntheticsTestDetailsType.API);
  private SyntheticsTestDetails subtypeTcpApiTestConfig =
      new SyntheticsTestDetails()
          .config(
              new SyntheticsTestConfig()
                  .assertions(
                      Arrays.asList(
                          new SyntheticsAssertion(
                              new SyntheticsAssertionTarget()
                                  .operator(SyntheticsAssertionOperator.LESS_THAN)
                                  .target(2000)
                                  .type(SyntheticsAssertionType.RESPONSE_TIME))))
                  .request(
                      new SyntheticsTestRequest()
                          .host("agent-intake.logs.datadoghq.com")
                          .port(443L)))
          .locations(Arrays.asList("aws:us-east-2"))
          .message("testing Synthetics API test Subtype TCP - this is message")
          .options(new SyntheticsTestOptions().tickEvery(SyntheticsTickInterval.MINUTE))
          .subtype(SyntheticsTestDetailsSubType.TCP)
          .tags(Arrays.asList("testing:api-tcp"))
          .type(SyntheticsTestDetailsType.API);
  private SyntheticsTestDetails browserTestConfig =
      new SyntheticsTestDetails()
          .config(
              new SyntheticsTestConfig()
                  .assertions(Arrays.<SyntheticsAssertion>asList())
                  .request(
                      new SyntheticsTestRequest()
                          .method(HTTPMethod.GET)
                          .url("https://datadoghq.com")))
          .locations(Arrays.asList("aws:us-east-2"))
          .message("testing Synthetics Browser test - this is message")
          .options(
              new SyntheticsTestOptions()
                  .acceptSelfSigned(false)
                  .allowInsecure(true)
                  .deviceIds(Arrays.asList(SyntheticsDeviceID.TABLET))
                  .followRedirects(true)
                  .minFailureDuration(10L)
                  .minLocationFailed(1L)
                  .retry(new SyntheticsTestOptionsRetry().count(3L).interval(10.0))
                  .tickEvery(SyntheticsTickInterval.FIVE_MINUTES))
          .tags(Arrays.asList("testing:browser"))
          .type(SyntheticsTestDetailsType.BROWSER);

  @Override
  public String getTracingEndpoint() {
    return "synthetics";
  }

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
          api.deleteTests(new SyntheticsDeleteTestsPayload().publicIds(Arrays.asList(id)));
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
    File recentResultsFixture =
        new File(
            getClass().getResource("synthetics_fixtures/api_test_recent_results.json").getFile());
    File singleResultFixture =
        new File(
            getClass().getResource("synthetics_fixtures/api_test_single_result.json").getFile());

    // Create API test
    String apiTestName = getUniqueEntityName();
    apiTestConfig.setName(apiTestName);
    synt = api.createTest(apiTestConfig);
    publicId = synt.getPublicId();
    deleteSyntheticsTests.add(publicId);
    assertEquals(apiTestName, synt.getName());

    // Update API test
    synt.setName(apiTestConfig.getName() + "-updated");
    // if we want to reuse the entity returned by the API, we must set these fields to null, as they
    // can't be sent back
    synt.setMonitorId(null);
    synt.setPublicId(null);
    synt = api.updateTest(publicId, synt);
    assertEquals(apiTestConfig.getName() + "-updated", synt.getName());

    // Get API test
    synt = api.getTest(publicId);
    assertEquals(apiTestConfig.getName() + "-updated", synt.getName());

    // NOTE: API tests are started by default, so we have to stop it first
    // Stop API test
    pauseStatus =
        api.updateTestPauseStatus(
            publicId,
            new SyntheticsUpdateTestPauseStatusPayload()
                .newStatus(SyntheticsTestPauseStatus.PAUSED));
    assertEquals(true, pauseStatus);

    // Start API test
    pauseStatus =
        api.updateTestPauseStatus(
            publicId,
            new SyntheticsUpdateTestPauseStatusPayload().newStatus(SyntheticsTestPauseStatus.LIVE));
    assertEquals(true, pauseStatus);

    // Get the most recent API test results
    latestResults =
        api.getAPITestLatestResults(
            publicId,
            api.new GetAPITestLatestResultsParameters()
                .fromTs(0L)
                .toTs(now.toInstant().toEpochMilli())
                .probeDc(Arrays.asList("aws:us-east-2")));
    // API tests sometimes have a delay before getting first result, so we use a mock response to
    // verify
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
    stubFor(
        get(urlPathEqualTo("/api/v1/synthetics/tests/test-synthetics-id/results/test-result-id"))
            .willReturn(
                okJson(
                    TestUtils.getFixture(
                        "v1/client/api/synthetics_fixtures/api_test_single_result.json"))));
    SyntheticsAPITestResultFull result =
        unitApi.getAPITestResult("test-synthetics-id", "test-result-id");

    // Assert a few of the returned attributes unmarshall properly
    assertEquals(result.getStatus(), SyntheticsTestMonitorStatus.TRIGGERED);
    assertEquals(result.getCheckTime(), Double.valueOf("1580204310361"));
    assertEquals(result.getCheckVersion().intValue(), 2);
    assertEquals(result.getResultId(), "7761116396307201795");
    assertEquals(result.getResult().getEventType(), SyntheticsTestProcessStatus.FINISHED);

    // Delete API test
    api.deleteTests(new SyntheticsDeleteTestsPayload().publicIds(Arrays.asList(publicId)));
  }

  @Test
  public void testSyntheticsSubtypeTcpAPILifecycle() throws ApiException, IOException {
    SyntheticsTestDetails synt;
    String publicId;
    Boolean pauseStatus;
    SyntheticsGetAPITestLatestResultsResponse latestResults;
    SyntheticsAPITestResultFull singleResult;
    File recentResultsFixture =
        new File(
            getClass()
                .getResource("synthetics_fixtures/api_test_subtype_tcp_recent_results.json")
                .getFile());
    File singleResultFixture =
        new File(
            getClass()
                .getResource("synthetics_fixtures/api_test_subtype_tcp_single_result.json")
                .getFile());

    // Create API test
    String apiTestName = getUniqueEntityName();
    subtypeTcpApiTestConfig.setName(apiTestName);
    synt = api.createTest(subtypeTcpApiTestConfig);
    publicId = synt.getPublicId();
    deleteSyntheticsTests.add(publicId);
    assertEquals(apiTestName, synt.getName());

    // Update API test
    synt.setName(subtypeTcpApiTestConfig.getName() + "-updated");
    // if we want to reuse the entity returned by the API, we must set these fields to null, as they
    // can't be sent back
    synt.setMonitorId(null);
    synt.setPublicId(null);
    synt = api.updateTest(publicId, synt);
    assertEquals(subtypeTcpApiTestConfig.getName() + "-updated", synt.getName());

    assertEquals(1, synt.getConfig().getAssertions().size());

    // Get API test
    synt = api.getTest(publicId);
    assertEquals(subtypeTcpApiTestConfig.getName() + "-updated", synt.getName());

    // NOTE: API tests are started by default, so we have to stop it first
    // Stop API test
    pauseStatus =
        api.updateTestPauseStatus(
            publicId,
            new SyntheticsUpdateTestPauseStatusPayload()
                .newStatus(SyntheticsTestPauseStatus.PAUSED));
    assertEquals(true, pauseStatus);

    // Start API test
    pauseStatus =
        api.updateTestPauseStatus(
            publicId,
            new SyntheticsUpdateTestPauseStatusPayload().newStatus(SyntheticsTestPauseStatus.LIVE));
    assertEquals(true, pauseStatus);

    // Get the most recent API test results
    latestResults =
        api.getAPITestLatestResults(
            publicId,
            api.new GetAPITestLatestResultsParameters()
                .fromTs(0L)
                .toTs(now.toInstant().toEpochMilli())
                .probeDc(Arrays.asList("aws:us-east-2")));
    // API tests sometimes have a delay before getting first result, so we use a mock response to
    // verify
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
    stubFor(
        get(urlPathEqualTo("/api/v1/synthetics/tests/test-synthetics-id/results/test-result-id"))
            .willReturn(
                okJson(
                    TestUtils.getFixture(
                        "v1/client/api/synthetics_fixtures/api_test_subtype_tcp_single_result.json"))));
    SyntheticsAPITestResultFull result =
        unitApi.getAPITestResult("test-synthetics-id", "test-result-id");

    // Assert a few of the returned attributes unmarshall properly
    assertEquals(result.getStatus(), SyntheticsTestMonitorStatus.UNTRIGGERED);
    assertEquals(result.getCheckTime(), Double.valueOf("1594759676042"));
    assertEquals(result.getCheckVersion().intValue(), 2);
    assertEquals(result.getResultId(), "8846149531307597251");
    assertEquals(result.getResult().getEventType(), SyntheticsTestProcessStatus.FINISHED);

    // Delete API test
    api.deleteTests(new SyntheticsDeleteTestsPayload().publicIds(Arrays.asList(publicId)));
  }

  @Test
  public void testSyntheticsBrowserLifecycle() throws ApiException, IOException {
    SyntheticsTestDetails synt;
    String publicId;
    Boolean pauseStatus;
    SyntheticsGetBrowserTestLatestResultsResponse latestResults;
    File recentResultsFixture =
        new File(
            getClass()
                .getResource("synthetics_fixtures/browser_test_recent_results.json")
                .getFile());
    File singleResultFixture =
        new File(
            getClass()
                .getResource("synthetics_fixtures/browser_test_single_result.json")
                .getFile());

    // Create Browser test
    String browserTestName = getUniqueEntityName();
    browserTestConfig.setName(browserTestName);
    synt = api.createTest(browserTestConfig);
    publicId = synt.getPublicId();
    deleteSyntheticsTests.add(publicId);
    assertEquals(browserTestName, synt.getName());

    // Update Browser test
    synt.setName(browserTestConfig.getName() + "-updated");
    // if we want to reuse the entity returned by the API, we must set these fields to null, as they
    // can't be sent back
    synt.setMonitorId(null);
    synt.setPublicId(null);
    synt = api.updateTest(publicId, synt);
    assertEquals(browserTestConfig.getName() + "-updated", synt.getName());

    // Get Browser test
    synt = api.getTest(publicId);
    assertEquals(browserTestConfig.getName() + "-updated", synt.getName());

    // NOTE: Browser tests are paused by default, so we have to run it first
    // Start Browser test
    pauseStatus =
        api.updateTestPauseStatus(
            publicId,
            new SyntheticsUpdateTestPauseStatusPayload().newStatus(SyntheticsTestPauseStatus.LIVE));
    assertEquals(true, pauseStatus);

    // Stop Browser test
    pauseStatus =
        api.updateTestPauseStatus(
            publicId,
            new SyntheticsUpdateTestPauseStatusPayload()
                .newStatus(SyntheticsTestPauseStatus.PAUSED));
    assertEquals(true, pauseStatus);

    // Get the most recent Browser test results
    latestResults =
        api.getBrowserTestLatestResults(
            publicId,
            api.new GetBrowserTestLatestResultsParameters()
                .fromTs(0L)
                .toTs(now.toInstant().toEpochMilli())
                .probeDc(Arrays.asList("aws:us-east-2")));
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
    stubFor(
        get(urlPathEqualTo(
                "/api/v1/synthetics/tests/browser/test-synthetics-id/results/test-result-id"))
            .willReturn(
                okJson(
                    TestUtils.getFixture(
                        "v1/client/api/synthetics_fixtures/browser_test_single_result.json"))));
    SyntheticsBrowserTestResultFull result =
        unitApi.getBrowserTestResult("test-synthetics-id", "test-result-id");
    // Assert based on the data from the fixture file, test a few fields
    assertEquals(result.getResultId(), "5140738909114888212");
    assertEquals(result.getStatus(), SyntheticsTestMonitorStatus.UNTRIGGERED);
    assertEquals(result.getCheckTime(), Double.valueOf("1579711893111"));
    assertEquals(result.getCheckVersion().intValue(), 5);

    // Delete Browser test
    api.deleteTests(new SyntheticsDeleteTestsPayload().publicIds(Arrays.asList(publicId)));
  }

  @Test
  public void testSyntheticsMultipleTestsOperations() throws ApiException {
    SyntheticsTestDetails syntAPI, syntBrowser;
    SyntheticsListTestsResponse allTests;

    apiTestConfig.setName(getUniqueEntityName("api"));
    syntAPI = api.createTest(apiTestConfig);
    deleteSyntheticsTests.add(syntAPI.getPublicId());
    browserTestConfig.setName(getUniqueEntityName("browser"));
    syntBrowser = api.createTest(browserTestConfig);
    deleteSyntheticsTests.add(syntBrowser.getPublicId());
    allTests = api.listTests();

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
      api.deleteTests(new SyntheticsDeleteTestsPayload());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.deleteTests(new SyntheticsDeleteTestsPayload());
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
    stubFor(
        post(urlPathEqualTo(apiUri + "/tests/delete"))
            .willReturn(okJson(fixtureData).withStatus(404)));

    try {
      unitApi.deleteTests(new SyntheticsDeleteTestsPayload());
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
    apiTestConfig.setName(getUniqueEntityName());
    SyntheticsTestDetails synt = api.createTest(apiTestConfig);
    String publicId = synt.getPublicId();
    deleteSyntheticsTests.add(publicId);

    try {
      api.updateTestPauseStatus(publicId, new SyntheticsUpdateTestPauseStatusPayload());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateTestPauseStatus(publicId, new SyntheticsUpdateTestPauseStatusPayload());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updateTestPauseStatus("aaa-aaa-aaa", new SyntheticsUpdateTestPauseStatusPayload());
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
      fakeAuthApi.getBrowserTestResult("id", "resultid");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getBrowserTestResult("aaa-aaa-aaa", "resultid");
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
      fakeAuthApi.getAPITestResult("id", "resultid");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getAPITestResult("aaa-aaa-aaa", "resultid");
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
      fakeAuthApi.getTest("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getTest("aaa-aaa-aaa");
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
    apiTestConfig.setName(getUniqueEntityName());
    SyntheticsTestDetails synt = api.createTest(apiTestConfig);
    String publicId = synt.getPublicId();
    deleteSyntheticsTests.add(publicId);

    try {
      api.updateTest(publicId, new SyntheticsTestDetails());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateTest("id", new SyntheticsTestDetails());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updateTest("aaa-aaa-aaa", new SyntheticsTestDetails());
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
      fakeAuthApi.listTests();
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
    stubFor(get(urlPathEqualTo(apiUri + "/tests")).willReturn(okJson(fixtureData).withStatus(404)));

    try {
      unitApi.listTests();
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
      api.createTest(new SyntheticsTestDetails());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createTest(new SyntheticsTestDetails());
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
    stubFor(
        post(urlPathEqualTo(apiUri + "/tests")).willReturn(okJson(fixtureData).withStatus(402)));

    try {
      unitApi.createTest(new SyntheticsTestDetails());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(402, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void syntheticsListLocationsTest() throws ApiException {
    SyntheticsLocations locations = api.listLocations();
    assertTrue(locations.getLocations().size() > 0);
  }
}
