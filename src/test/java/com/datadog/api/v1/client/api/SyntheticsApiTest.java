/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import static com.datadog.api.World.fromJSON;
import static com.datadog.api.World.lookup;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
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
  private SyntheticsAPITest apiTestConfig = buildAPITestConfig();

  private SyntheticsAPITest buildAPITestConfig() {
    return new SyntheticsAPITest()
        .config(
            new SyntheticsAPITestConfig()
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
                .tickEvery(60L))
        .subtype(SyntheticsTestDetailsSubType.HTTP)
        .tags(Arrays.asList("testing:api"))
        .type(SyntheticsAPITestType.API);
  }

  private SyntheticsAPITest subtypeTcpApiTestConfig = buildAPITCPTestConfig();

  private SyntheticsAPITest buildAPITCPTestConfig() {
    return new SyntheticsAPITest()
        .config(
            new SyntheticsAPITestConfig()
                .assertions(
                    Arrays.asList(
                        new SyntheticsAssertion(
                            new SyntheticsAssertionTarget()
                                .operator(SyntheticsAssertionOperator.LESS_THAN)
                                .target(2000)
                                .type(SyntheticsAssertionType.RESPONSE_TIME))))
                .request(
                    new SyntheticsTestRequest().host("agent-intake.logs.datadoghq.com").port(443L)))
        .locations(Arrays.asList("aws:us-east-2"))
        .message("testing Synthetics API test Subtype TCP - this is message")
        .options(new SyntheticsTestOptions().tickEvery(60L))
        .subtype(SyntheticsTestDetailsSubType.TCP)
        .tags(Arrays.asList("testing:api-tcp"))
        .type(SyntheticsAPITestType.API);
  }

  private SyntheticsBrowserTest browserTestConfig = buildBrowserTestConfig();

  private SyntheticsBrowserTest buildBrowserTestConfig() {
    return new SyntheticsBrowserTest()
        .config(
            new SyntheticsBrowserTestConfig()
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
                .tickEvery(300L))
        .tags(Arrays.asList("testing:browser"))
        .type(SyntheticsBrowserTestType.BROWSER);
  }

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
    SyntheticsAPITest synt;
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

    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }
    // Create API test
    String apiTestName = getUniqueEntityName();
    apiTestConfig.setName(apiTestName);
    synt = api.createSyntheticsAPITest(apiTestConfig);
    publicId = synt.getPublicId();
    deleteSyntheticsTests.add(publicId);
    assertEquals(apiTestName, synt.getName());

    // Update API test
    SyntheticsAPITest updatedSynt = buildAPITestConfig();
    updatedSynt.setName(apiTestConfig.getName() + "-updated");
    synt = api.updateAPITest(publicId, updatedSynt);
    assertEquals(apiTestConfig.getName() + "-updated", synt.getName());

    // Get API test
    synt = api.getAPITest(publicId);
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
            new SyntheticsApi.GetAPITestLatestResultsOptionalParameters()
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
    SyntheticsAPITest synt;
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

    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }

    // Create API test
    String apiTestName = getUniqueEntityName();
    subtypeTcpApiTestConfig.setName(apiTestName);
    synt = api.createSyntheticsAPITest(subtypeTcpApiTestConfig);
    publicId = synt.getPublicId();
    deleteSyntheticsTests.add(publicId);
    assertEquals(apiTestName, synt.getName());

    // Update API test
    SyntheticsAPITest updatedSynt = buildAPITCPTestConfig();
    updatedSynt.setName(subtypeTcpApiTestConfig.getName() + "-updated");
    synt = api.updateAPITest(publicId, updatedSynt);
    assertEquals(subtypeTcpApiTestConfig.getName() + "-updated", synt.getName());

    assertEquals(1, synt.getConfig().getAssertions().size());

    // Get API test
    synt = api.getAPITest(publicId);
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
            new SyntheticsApi.GetAPITestLatestResultsOptionalParameters()
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
    SyntheticsBrowserTest synt;
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

    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }

    // Create Browser test
    String browserTestName = getUniqueEntityName();
    browserTestConfig.setName(browserTestName);
    synt = api.createSyntheticsBrowserTest(browserTestConfig);
    publicId = synt.getPublicId();
    deleteSyntheticsTests.add(publicId);
    assertEquals(browserTestName, synt.getName());

    // Update Browser test
    SyntheticsBrowserTest updatedSynt = buildBrowserTestConfig();
    updatedSynt.setName(browserTestConfig.getName() + "-updated");
    synt = api.updateBrowserTest(publicId, updatedSynt);
    assertEquals(browserTestConfig.getName() + "-updated", synt.getName());

    // Get Browser test
    synt = api.getBrowserTest(publicId);
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
            new SyntheticsApi.GetBrowserTestLatestResultsOptionalParameters()
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
    SyntheticsAPITest syntAPI;
    SyntheticsBrowserTest syntBrowser;
    SyntheticsListTestsResponse allTests;

    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }

    apiTestConfig.setName(getUniqueEntityName("api"));
    syntAPI = api.createSyntheticsAPITest(apiTestConfig);
    deleteSyntheticsTests.add(syntAPI.getPublicId());
    browserTestConfig.setName(getUniqueEntityName("browser"));
    syntBrowser = api.createSyntheticsBrowserTest(browserTestConfig);
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
    SyntheticsAPITest synt = api.createSyntheticsAPITest(apiTestConfig);
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
      fakeAuthApi.getAPITest("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getAPITest("aaa-aaa-aaa");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void updateTestSyntheticsErrorsTest() throws ApiException, IOException {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }

    // Create API test
    apiTestConfig.setName(getUniqueEntityName());
    SyntheticsAPITest synt = api.createSyntheticsAPITest(apiTestConfig);
    String publicId = synt.getPublicId();
    deleteSyntheticsTests.add(publicId);

    try {
      api.updateAPITest(publicId, new SyntheticsAPITest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateAPITest("id", new SyntheticsAPITest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updateAPITest("aaa-aaa-aaa", new SyntheticsAPITest());
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
      api.createSyntheticsAPITest(new SyntheticsAPITest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createSyntheticsAPITest(new SyntheticsAPITest());
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
        post(urlPathEqualTo(apiUri + "/tests/api"))
            .willReturn(okJson(fixtureData).withStatus(402)));

    try {
      unitApi.createSyntheticsAPITest(new SyntheticsAPITest());
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

  @Test
  public void TestDeserializationUnknownNestedOneOfInList()
      throws JsonProcessingException, NoSuchFieldException, IllegalAccessException {
    String body =
        "{\"status\":\"paused\",\"public_id\":\"jv7-wfd-kvt\",\"tags\":[],\"locations\":[\"pl:pl-kevin-y-6382df0d72d4588e1817f090b131541f\"],\"message\":\"\",\"name\":\"Test"
            + " on www.example.com\",\"monitor_id\":28558768,\"type\":\"api\",\"created_at\":\"2021-01-12T10:11:40.802074+00:00\",\"modified_at\":\"2021-01-22T16:42:10.520384+00:00\",\"subtype\":\"http\",\"config\":{\"request\":{\"url\":\"https://www.example.com\",\"method\":\"GET\",\"timeout\":30},\"assertions\":[{\"operator\":\"lessThan\",\"type\":\"responseTime\",\"target\":1000},{\"operator\":\"is\",\"type\":\"statusCode\",\"target\":200},{\"operator\":\"A"
            + " non existent"
            + " operator\",\"type\":\"body\",\"target\":{\"xPath\":\"//html/head/title\",\"operator\":\"contains\",\"targetValue\":\"Example\"}}],\"configVariables\":[]},\"options\":{\"monitor_options\":{\"notify_audit\":false,\"locked\":false,\"include_tags\":true,\"new_host_delay\":300,\"notify_no_data\":false,\"renotify_interval\":0},\"retry\":{\"count\":0,\"interval\":300},\"min_location_failed\":1,\"min_failure_duration\":0,\"tick_every\":60}}";
    ObjectMapper mapper = generalApiClient.getJSON().getMapper();
    Object res = fromJSON(mapper, SyntheticsAPITest.class, body);
    List<SyntheticsAssertion> assertions =
        (List<SyntheticsAssertion>) (lookup(res, "config.assertions"));

    assertFalse(((SyntheticsAPITest) res).unparsed);
    assertEquals(3, assertions.size());
    assertEquals("A non existent operator", lookup(assertions.get(2), "operator"));
  }

  @Test
  public void TestDeserializationUnknownNestedEnumInList()
      throws JsonProcessingException, NoSuchFieldException, IllegalAccessException {
    String body =
        "{\"status\":\"live\",\"public_id\":\"2fx-64b-fb8\",\"tags\":[\"mini-website\",\"team:synthetics\",\"firefox\",\"synthetics-ci-browser\",\"edge\",\"chrome\"],\"locations\":[\"aws:ap-northeast-1\",\"aws:eu-north-1\",\"aws:eu-west-3\",\"aws:eu-central-1\"],\"message\":\"This"
            + " mini-website check failed, please investigate why."
            + " @slack-synthetics-ops-worker\",\"name\":\"Mini Website - Click"
            + " Trap\",\"monitor_id\":7647262,\"type\":\"browser\",\"created_at\":\"2018-12-20T13:19:23.734004+00:00\",\"modified_at\":\"2021-06-30T15:46:49.387631+00:00\",\"config\":{\"variables\":[],\"setCookie\":\"\",\"request\":{\"url\":\"http://34.95.79.70/click-trap\",\"headers\":{},\"method\":\"GET\"},\"assertions\":[],\"configVariables\":[]},\"options\":{\"ci\":{\"executionRule\":\"blocking\"},\"retry\":{\"count\":1,\"interval\":1000},\"min_location_failed\":1,\"min_failure_duration\":0,\"noScreenshot\":false,\"tick_every\":300,\"forwardProxy\":false,\"disableCors\":false,\"device_ids\":[\"chrome.laptop_large\",\"firefox.laptop_large\",\"A"
            + " non existent device"
            + " ID\"],\"monitor_options\":{\"renotify_interval\":360},\"ignoreServerCertificateError\":true}}";
    ObjectMapper mapper = generalApiClient.getJSON().getMapper();
    Object res = fromJSON(mapper, SyntheticsBrowserTest.class, body);
    List<SyntheticsDeviceID> deviceIds =
        (List<SyntheticsDeviceID>) (lookup(res, "options.deviceIds"));

    assertFalse(((SyntheticsBrowserTest) res).unparsed);
    assertEquals(3, deviceIds.size());
    assertEquals("A non existent device ID", deviceIds.get(2).toString());
  }

  @Test
  public void TestDeserializationUnknownTopLevelEnum()
      throws JsonProcessingException, NoSuchFieldException, IllegalAccessException {
    String body =
        "{\"status\":\"live\",\"public_id\":\"g6d-gcm-pdq\",\"tags\":[],\"locations\":[\"aws:eu-central-1\",\"aws:ap-northeast-1\"],\"message\":\"\",\"name\":\"Check"
            + " on www.10.0.0.1.xip.io\",\"monitor_id\":7464050,\"type\":\"A non existent test"
            + " type\",\"created_at\":\"2018-12-07T17:30:49.785089+00:00\",\"modified_at\":\"2019-09-04T17:01:09.921070+00:00\",\"subtype\":\"http\",\"config\":{\"request\":{\"url\":\"https://www.10.0.0.1.xip.io\",\"method\":\"GET\",\"timeout\":30},\"assertions\":[{\"operator\":\"is\",\"type\":\"statusCode\",\"target\":200}]},\"options\":{\"tick_every\":60}}";
    ObjectMapper mapper = generalApiClient.getJSON().getMapper();
    Object res = fromJSON(mapper, SyntheticsBrowserTest.class, body);

    assertTrue(((SyntheticsBrowserTest) res).unparsed);
    assertEquals("A non existent test type", lookup(res, "type").toString());
    assertEquals("Check on www.10.0.0.1.xip.io", lookup(res, "name").toString());
  }

  @Test
  public void TestDeserializationUnknownNestedEnum()
      throws JsonProcessingException, NoSuchFieldException, IllegalAccessException {
    String body =
        "{\"status\":\"live\",\"public_id\":\"g6d-gcm-pdq\",\"tags\":[],\"locations\":[\"aws:eu-central-1\",\"aws:ap-northeast-1\"],\"message\":\"\",\"name\":\"Check"
            + " on www.10.0.0.1.xip.io\",\"monitor_id\":7464050,\"type\":\"api\",\"created_at\":\"2018-12-07T17:30:49.785089+00:00\",\"modified_at\":\"2019-09-04T17:01:09.921070+00:00\",\"subtype\":\"http\",\"config\":{\"request\":{\"url\":\"https://www.10.0.0.1.xip.io\",\"method\":\"A"
            + " non existent"
            + " method\",\"timeout\":30},\"assertions\":[{\"operator\":\"is\",\"type\":\"statusCode\",\"target\":200}]},\"options\":{\"tick_every\":60}}";
    ObjectMapper mapper = generalApiClient.getJSON().getMapper();
    Object res = fromJSON(mapper, SyntheticsAPITest.class, body);

    assertFalse(((SyntheticsAPITest) res).unparsed);
    assertFalse((Boolean) lookup(res, "config.unparsed"));
    assertTrue((Boolean) lookup(res, "config.request.unparsed"));
    assertEquals("A non existent method", lookup(res, "config.request.method").toString());
    assertEquals(30.0, lookup(res, "config.request.timeout"));
  }
}
