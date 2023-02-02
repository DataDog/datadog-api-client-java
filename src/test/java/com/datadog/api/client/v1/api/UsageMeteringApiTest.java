/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/** API tests for UsageApi */
public class UsageMeteringApiTest extends V1ApiTest {

  private static UsageMeteringApi api;
  private static UsageMeteringApi fakeAuthApi;
  private static UsageMeteringApi unitApi;

  private static OffsetDateTime startHr;
  private static OffsetDateTime endHr;
  private static OffsetDateTime startMonth;
  private static OffsetDateTime endMonth;
  private static OffsetDateTime futureStartHr;
  private static OffsetDateTime futureStartMonth;
  private static OffsetDateTime pastStartMonth;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final String apiUri = "/api/v1/usage";
  private final String fixturePrefix = "client/v1/api/usage_fixtures";

  @Override
  public String getTracingEndpoint() {
    return "usage-metering";
  }

  @BeforeClass
  public static void initApi() {
    api = new UsageMeteringApi(generalApiClient);
    fakeAuthApi = new UsageMeteringApi(generalFakeAuthApiClient);
    unitApi = new UsageMeteringApi(generalApiUnitTestClient);
  }

  @Before
  public void initDateTime() {
    OffsetDateTime nowDateTime = now;

    startHr =
        OffsetDateTime.of(
                nowDateTime.getYear(),
                nowDateTime.getMonth().getValue(),
                1,
                12,
                0,
                0,
                0,
                ZoneOffset.UTC)
            .minusMonths(1);
    endHr = startHr.plusHours(1);
    startMonth =
        OffsetDateTime.of(
                nowDateTime.getYear(),
                nowDateTime.getMonth().getValue(),
                1,
                0,
                0,
                0,
                0,
                ZoneOffset.UTC)
            .minusMonths(2);
    endMonth = startHr.plusMonths(1);
    futureStartHr =
        OffsetDateTime.of(
                now.getYear(),
                now.getMonth().getValue(),
                now.getDayOfMonth(),
                now.getHour(),
                now.getMinute(),
                0,
                0,
                ZoneOffset.UTC)
            .plusHours(5);
    futureStartMonth = futureStartHr.plusMonths(1);
    pastStartMonth = startHr.minusYears(2);
  }

  @Test
  public void getUsageAnalyzedLogsTest() throws ApiException {
    UsageAnalyzedLogsResponse response =
        api.getUsageAnalyzedLogs(
            startHr, new UsageMeteringApi.GetUsageAnalyzedLogsOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageFargateTest() throws ApiException {
    UsageFargateResponse response =
        api.getUsageFargate(
            startHr, new UsageMeteringApi.GetUsageFargateOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageRumSessionsTest() throws ApiException {
    UsageRumSessionsResponse response =
        api.getUsageRumSessions(
            startHr, new UsageMeteringApi.GetUsageRumSessionsOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageMobileRumSessionsTest() throws ApiException {
    UsageRumSessionsResponse response =
        api.getUsageRumSessions(
            startHr,
            new UsageMeteringApi.GetUsageRumSessionsOptionalParameters()
                .endHr(endHr)
                .type("mobile"));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageHostsTest() throws ApiException {
    UsageHostsResponse response =
        api.getUsageHosts(
            startHr, new UsageMeteringApi.GetUsageHostsOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageProfilingTest() throws ApiException {
    UsageProfilingResponse response =
        api.getUsageProfiling(
            startHr, new UsageMeteringApi.GetUsageProfilingOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageLogsTest() throws ApiException {
    UsageLogsResponse response =
        api.getUsageLogs(
            startHr, new UsageMeteringApi.GetUsageLogsOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageLogsByIndexTest() throws ApiException {
    UsageLogsByIndexResponse response =
        api.getUsageLogsByIndex(
            startHr,
            new UsageMeteringApi.GetUsageLogsByIndexOptionalParameters()
                .endHr(endHr)
                .indexName(null));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageNetworkFlowsTest() throws ApiException {
    UsageNetworkFlowsResponse response =
        api.getUsageNetworkFlows(
            startHr, new UsageMeteringApi.GetUsageNetworkFlowsOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageNetworkHostsTest() throws ApiException {
    UsageNetworkHostsResponse response =
        api.getUsageNetworkHosts(
            startHr, new UsageMeteringApi.GetUsageNetworkHostsOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageSNMPTest() throws ApiException {
    UsageSNMPResponse response =
        api.getUsageSNMP(
            startHr, new UsageMeteringApi.GetUsageSNMPOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageIngestedSpansTest() throws ApiException {
    UsageIngestedSpansResponse response =
        api.getIngestedSpans(
            startHr, new UsageMeteringApi.GetIngestedSpansOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageIncidentManagementTest() throws ApiException {
    UsageIncidentManagementResponse response =
        api.getIncidentManagement(
            startHr, new UsageMeteringApi.GetIncidentManagementOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageBillableSummaryTest() throws ApiException, IOException {
    stubFor(
        get(urlPathEqualTo("/api/v1/usage/billable-summary"))
            .willReturn(
                okJson(
                    TestUtils.getFixture(
                        "client/v1/api/usage_fixtures/usage_billable_summary.json"))));

    UsageBillableSummaryResponse usage = unitApi.getUsageBillableSummary();

    assertNotNull(usage.getUsage());
    UsageBillableSummaryHour usageItem = usage.getUsage().get(0);
    assertEquals(usageItem.getOrgName(), "API - Test");
    assertEquals(usageItem.getBillingPlan(), "Pro");
    assertEquals(usageItem.getPublicId(), "123abcxyz");
    OffsetDateTime startDateExpected =
        OffsetDateTime.of(LocalDateTime.of(2020, 06, 01, 00, 00), ZoneOffset.ofHoursMinutes(0, 0));
    OffsetDateTime endDateExpected =
        OffsetDateTime.of(LocalDateTime.of(2020, 06, 28, 23, 00), ZoneOffset.ofHoursMinutes(0, 0));
    assertEquals(usageItem.getStartDate(), startDateExpected);
    assertEquals(usageItem.getEndDate(), endDateExpected);
    assertEquals(usageItem.getRatioInMonth().intValue(), 1);
    assertEquals(usageItem.getNumOrgs().intValue(), 235);

    UsageBillableSummaryKeys usageKeys = usageItem.getUsage();
    UsageBillableSummaryBody logsIndexedSum = usageKeys.getLogsIndexedSum();

    assertEquals(logsIndexedSum.getOrgBillableUsage().intValue(), 14514687);
    assertEquals(logsIndexedSum.getUsageUnit(), "logs");
    assertEquals(logsIndexedSum.getAccountBillableUsage().intValue(), 1611132837);
    assertEquals(logsIndexedSum.getFirstBillableUsageHour(), startDateExpected);
    assertEquals(logsIndexedSum.getElapsedUsageHours().intValue(), 672);
    assertEquals(logsIndexedSum.getLastBillableUsageHour(), endDateExpected);
    assertEquals(logsIndexedSum.getPercentageInAccount().doubleValue(), 0.9, 0);
  }

  @Test
  public void getSpecifiedDailyCustomReportsTest() throws ApiException {
    LocalDate date = LocalDate.now(clock);
    DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String reportID = FORMATTER.format(date.minusDays(1)); // Only have report from previous day
    generalApiClient.setUnstableOperationEnabled("v1.getSpecifiedDailyCustomReports", true);
    try {
      UsageSpecifiedCustomReportsResponse response = api.getSpecifiedDailyCustomReports(reportID);
      assertNotNull(response.getMeta());
      assertNotNull(response.getData());
    } catch (ApiException e) {
      if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING) == false
          || e.getCode() == 404
          || e.getCode() == 403) {
        System.out.println("\nNo reports are available yet or this org is forbidden\n");
      }
    }
  }

  @Test
  public void getSpecifiedMonthlyCustomReportsTest() throws ApiException {
    LocalDate date = LocalDate.now(clock);
    DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String reportID =
        FORMATTER.format(
            date.minusDays(1)); // Reports will only be generated on this 2020-08-15 for this org
    generalApiClient.setUnstableOperationEnabled("v1.getSpecifiedMonthlyCustomReports", true);
    try {
      UsageSpecifiedCustomReportsResponse response = api.getSpecifiedMonthlyCustomReports(reportID);
      assertNotNull(response.getMeta());
      assertNotNull(response.getData());
    } catch (ApiException e) {
      if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING) == false
          || e.getCode() == 404
          || e.getCode() == 403) {
        System.out.println("\nNo reports are available yet or this org is forbidden\n");
      }
    }
  }

  @Test
  public void getDailyCustomReportsTest() throws ApiException {
    generalApiClient.setUnstableOperationEnabled("v1.getDailyCustomReports", true);
    try {
      UsageCustomReportsResponse response = api.getDailyCustomReports();
      assertNotNull(response.getMeta());
      assertNotNull(response.getData());
    } catch (ApiException e) {
      if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING) == false
          || e.getCode() == 404
          || e.getCode() == 403) {
        System.out.println("\nNo reports are available yet or this org is forbidden\n");
      }
    }
  }

  @Test
  public void getMonthlyCustomReportsTest() throws ApiException {
    generalApiClient.setUnstableOperationEnabled("v1.getMonthlyCustomReports", true);
    try {
      UsageCustomReportsResponse response = api.getMonthlyCustomReports();
      assertNotNull(response.getMeta());
      assertNotNull(response.getData());
    } catch (ApiException e) {
      if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING) == false
          || e.getCode() == 404
          || e.getCode() == 403) {
        System.out.println("\nNo reports are available yet or this org is forbidden\n");
      }
    }
  }

  @Test
  public void getUsageSummaryTest() throws ApiException, IOException {
    Boolean includeOrgDetails = true;
    OffsetDateTime startMonth = OffsetDateTime.now();
    OffsetDateTime endMonth = OffsetDateTime.now();

    stubFor(
        get(urlPathEqualTo("/api/v1/usage/summary"))
            .withQueryParam(
                "start_month", equalTo(generalApiClient.formatOffsetDateTime(startMonth)))
            .withQueryParam("end_month", equalTo(generalApiClient.formatOffsetDateTime(endMonth)))
            .withQueryParam("include_org_details", equalTo("true"))
            .willReturn(
                okJson(TestUtils.getFixture("client/v1/api/usage_fixtures/usage_summary.json"))));

    UsageSummaryResponse usage =
        unitApi.getUsageSummary(
            startMonth,
            new UsageMeteringApi.GetUsageSummaryOptionalParameters()
                .endMonth(endMonth)
                .includeOrgDetails(includeOrgDetails));

    assertNotNull(usage.getUsage());
    OffsetDateTime startDateExpected =
        OffsetDateTime.of(LocalDateTime.of(2019, 02, 02, 23, 00), ZoneOffset.ofHoursMinutes(0, 0));
    OffsetDateTime endDateExpected =
        OffsetDateTime.of(LocalDateTime.of(2020, 02, 02, 23, 00), ZoneOffset.ofHoursMinutes(0, 0));
    assertEquals(usage.getStartDate(), startDateExpected);
    assertEquals(usage.getEndDate(), endDateExpected);
    assertEquals(usage.getApmHostTop99pSum().longValue(), 1L);
    assertEquals(usage.getInfraHostTop99pSum().longValue(), 2L);
    assertEquals(usage.getContainerHwmSum().longValue(), 1L);
    assertEquals(usage.getCustomTsSum().longValue(), 4L);
    assertEquals(usage.getRumSessionCountAggSum().longValue(), 5L);
    assertEquals(usage.getProfilingHostCountTop99pSum().longValue(), 6L);
    assertEquals(usage.getProfilingContainerAgentCountAvg().longValue(), 7L);
    assertEquals(usage.getTwolIngestedEventsBytesAggSum().longValue(), 8L);
    assertEquals(usage.getMobileRumSessionCountAggSum().longValue(), 9L);
    assertEquals(usage.getIncidentManagementMonthlyActiveUsersHwmSum().longValue(), 10L);
    assertEquals(usage.getMobileRumSessionCountIosAggSum().longValue(), 11L);
    assertEquals(usage.getMobileRumSessionCountAndroidAggSum().longValue(), 12L);
    assertEquals(usage.getRumTotalSessionCountAggSum().longValue(), 13L);
    assertEquals(usage.getAzureAppServiceTop99pSum().longValue(), 14L);
    assertEquals(usage.getApmAzureAppServiceHostTop99pSum().longValue(), 15L);

    // Note the nanosecond field had to be converted from the value in the summary fixture (i.e.
    // 0.014039s -> 14039000ns)
    OffsetDateTime dateExpected =
        OffsetDateTime.of(LocalDateTime.of(2020, 02, 02, 23, 00), ZoneOffset.ofHoursMinutes(0, 0));
    UsageSummaryDate usageItem = usage.getUsage().get(0);
    assertEquals(usageItem.getDate(), dateExpected);
    assertEquals(usageItem.getAgentHostTop99p().longValue(), 1L);
    assertEquals(usageItem.getApmHostTop99p().longValue(), 2L);
    assertEquals(usageItem.getAwsHostTop99p().longValue(), 3L);
    assertEquals(usageItem.getContainerHwm().longValue(), 5L);
    assertEquals(usageItem.getCustomTsAvg().longValue(), 6L);
    assertEquals(usageItem.getGcpHostTop99p().longValue(), 7L);
    assertEquals(usageItem.getInfraHostTop99p().longValue(), 8L);
    assertEquals(usageItem.getRumSessionCountSum().longValue(), 9L);
    assertEquals(usageItem.getProfilingHostTop99p().longValue(), 10L);
    assertEquals(usageItem.getTwolIngestedEventsBytesSum().longValue(), 11L);
    assertEquals(usageItem.getMobileRumSessionCountSum().longValue(), 12L);
    assertEquals(usageItem.getIncidentManagementMonthlyActiveUsersHwm().longValue(), 13L);
    assertEquals(usageItem.getMobileRumSessionCountIosSum().longValue(), 14L);
    assertEquals(usageItem.getMobileRumSessionCountAndroidSum().longValue(), 15L);
    assertEquals(usageItem.getRumTotalSessionCountSum().longValue(), 16L);
    assertEquals(usageItem.getAzureAppServiceTop99p().longValue(), 17L);
    assertEquals(usageItem.getApmAzureAppServiceHostTop99p().longValue(), 18L);

    UsageSummaryDateOrg usageOrgItem = usageItem.getOrgs().get(0);
    assertEquals(usageOrgItem.getId(), "1b");
    assertEquals(usageOrgItem.getName(), "datadog");
    assertEquals(usageOrgItem.getAgentHostTop99p().longValue(), 1L);
    assertEquals(usageOrgItem.getApmHostTop99p().longValue(), 2L);
    assertEquals(usageOrgItem.getAwsHostTop99p().longValue(), 3L);
    assertEquals(usageOrgItem.getContainerHwm().longValue(), 5L);
    assertEquals(usageOrgItem.getCustomTsAvg().longValue(), 6L);
    assertEquals(usageOrgItem.getGcpHostTop99p().longValue(), 7L);
    assertEquals(usageOrgItem.getInfraHostTop99p().longValue(), 8L);
    assertEquals(usageOrgItem.getRumSessionCountSum().longValue(), 9L);
    assertEquals(usageOrgItem.getProfilingHostTop99p().longValue(), 10L);
    assertEquals(usageOrgItem.getTwolIngestedEventsBytesSum().longValue(), 11L);
    assertEquals(usageOrgItem.getMobileRumSessionCountSum().longValue(), 12L);
    assertEquals(usageOrgItem.getIncidentManagementMonthlyActiveUsersHwm().longValue(), 13L);
    assertEquals(usageOrgItem.getMobileRumSessionCountIosSum().longValue(), 14L);
    assertEquals(usageOrgItem.getMobileRumSessionCountAndroidSum().longValue(), 15L);
    assertEquals(usageOrgItem.getRumTotalSessionCountSum().longValue(), 16L);
    assertEquals(usageOrgItem.getAzureAppServiceTop99p().longValue(), 17L);
    assertEquals(usageOrgItem.getApmAzureAppServiceHostTop99p().longValue(), 18L);
  }

  @Test
  public void getUsageSyntheticsTest() throws ApiException {
    UsageSyntheticsResponse response =
        api.getUsageSynthetics(
            startHr, new UsageMeteringApi.GetUsageSyntheticsOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageSyntheticsAPITest() throws ApiException {
    UsageSyntheticsAPIResponse response =
        api.getUsageSyntheticsAPI(
            startHr, new UsageMeteringApi.GetUsageSyntheticsAPIOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageSyntheticsBrowserTest() throws ApiException {
    UsageSyntheticsBrowserResponse response =
        api.getUsageSyntheticsBrowser(
            startHr,
            new UsageMeteringApi.GetUsageSyntheticsBrowserOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageTimeseriesTest() throws ApiException {
    UsageTimeseriesResponse response =
        api.getUsageTimeseries(
            startHr, new UsageMeteringApi.GetUsageTimeseriesOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageTopAvgMetricsTest() throws ApiException {
    // List<String> names = null;
    UsageTopAvgMetricsResponse response =
        api.getUsageTopAvgMetrics(
            new UsageMeteringApi.GetUsageTopAvgMetricsOptionalParameters().month(startMonth));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageIndexedSpansTest() throws ApiException {
    UsageIndexedSpansResponse response =
        api.getUsageIndexedSpans(
            startHr, new UsageMeteringApi.GetUsageIndexedSpansOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageLambdaTest() throws ApiException {
    UsageLambdaResponse response =
        api.getUsageLambda(
            startHr, new UsageMeteringApi.GetUsageLambdaOptionalParameters().endHr(endHr));
    assertNotNull(response.getUsage());
  }

  @Test
  public void getUsageAnalyzedLogsErrorsTest() throws IOException {
    try {
      api.getUsageAnalyzedLogs(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageAnalyzedLogs(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageHostsErrorsTest() throws IOException {
    try {
      api.getUsageHosts(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageHosts(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageProfilingErrorsTest() throws IOException {
    try {
      api.getUsageProfiling(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageProfiling(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageLogsErrorsTest() throws IOException {
    try {
      api.getUsageLogs(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageLogs(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageLogsByIndexErrorsTest() throws IOException {
    try {
      api.getUsageLogsByIndex(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageLogsByIndex(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageTimeSeriesErrorsTest() throws IOException {
    try {
      api.getUsageTimeseries(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageTimeseries(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageTopAvgMetricsErrorsTest() throws IOException {
    try {
      api.getUsageTopAvgMetrics(
          new UsageMeteringApi.GetUsageTopAvgMetricsOptionalParameters().month(pastStartMonth));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageTopAvgMetrics(
          new UsageMeteringApi.GetUsageTopAvgMetricsOptionalParameters().month(pastStartMonth));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageIndexedSpansErrorsTest() throws IOException {
    try {
      api.getUsageIndexedSpans(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageIndexedSpans(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageSyntheticsErrorsTest() throws IOException {
    // This function is deprecated
    try {
      api.getUsageSynthetics(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageSynthetics(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageSyntheticsAPIErrorsTest() throws IOException {
    try {
      api.getUsageSyntheticsAPI(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageSyntheticsAPI(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageSyntheticsBrowserErrorsTest() throws IOException {
    try {
      api.getUsageSyntheticsBrowser(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageSyntheticsBrowser(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageFargateErrorsTest() throws IOException {
    try {
      api.getUsageFargate(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageFargate(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageLambdaErrorsTest() throws IOException {
    try {
      api.getUsageLambda(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageLambda(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageRumSessionErrorsTest() throws IOException {
    try {
      api.getUsageRumSessions(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getUsageRumSessions(
          startHr,
          new UsageMeteringApi.GetUsageRumSessionsOptionalParameters()
              .endHr(endHr)
              .type("invalid"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageRumSessions(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageNetworkHostsErrorsTest() throws IOException {
    try {
      api.getUsageNetworkHosts(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageNetworkHosts(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageNetworkFlowsErrorsTest() throws IOException {
    try {
      api.getUsageNetworkFlows(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageNetworkFlows(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageSNMPErrorsTest() throws IOException {
    try {
      api.getUsageSNMP(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getUsageSNMP(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageBillableSummaryErrorsTest() throws IOException {
    try {
      fakeAuthApi.getUsageBillableSummary();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getSpecifiedDailyCustomReportsErrorsTest() throws IOException {
    try {
      generalFakeAuthApiClient.setUnstableOperationEnabled(
          "v1.getSpecifiedDailyCustomReports", true);
      fakeAuthApi.getSpecifiedDailyCustomReports("whatever");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      generalApiClient.setUnstableOperationEnabled("v1.getSpecifiedDailyCustomReports", true);
      api.getSpecifiedDailyCustomReports("2010-01-01");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getSpecifiedMonthlyCustomReports404ErrorTest() throws IOException {
    try {
      generalApiClient.setUnstableOperationEnabled("v1.getSpecifiedMonthlyCustomReports", true);
      api.getSpecifiedMonthlyCustomReports("2010-01-01");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getDailyCustomReportsErrorsTest() throws IOException {
    try {
      generalFakeAuthApiClient.setUnstableOperationEnabled("v1.getDailyCustomReports", true);
      fakeAuthApi.getDailyCustomReports();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getMonthlyCustomReportsErrorsTest() throws IOException {
    try {
      generalFakeAuthApiClient.setUnstableOperationEnabled("v1.getMonthlyCustomReports", true);
      fakeAuthApi.getMonthlyCustomReports();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageBillableSummary400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
    stubFor(
        get(urlPathEqualTo(apiUri + "/billable-summary"))
            .willReturn(okJson(fixtureData).withStatus(400)));
    // Mocked as this call must be made from the parent organization
    try {
      unitApi.getUsageBillableSummary();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageSummaryErrorsTest() throws IOException {
    try {
      fakeAuthApi.getUsageSummary(futureStartMonth);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageSummary400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
    stubFor(
        get(urlPathEqualTo(apiUri + "/summary")).willReturn(okJson(fixtureData).withStatus(400)));
    // Mocked because this requires multi org feature
    try {
      unitApi.getUsageSummary(startMonth);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageIncidentManagementErrorsTest() throws IOException {
    try {
      api.getIncidentManagement(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getIncidentManagement(futureStartHr);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getUsageAttributionErrorsTest() throws IOException {
    try {
      generalFakeAuthApiClient.setUnstableOperationEnabled("v1.getUsageAttribution", true);
      fakeAuthApi.getUsageAttribution(startMonth, UsageAttributionSupportedMetrics.ALL);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
