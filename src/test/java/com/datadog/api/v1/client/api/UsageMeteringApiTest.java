/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;


import com.datadog.api.TestUtils;
import com.datadog.api.RecordingMode;
import static org.junit.Assume.assumeFalse;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;


/**
 * API tests for UsageApi
 */
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
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private final String apiUri = "/api/v1/usage";
    private final String fixturePrefix = "v1/client/api/usage_fixtures";

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

        startHr = OffsetDateTime.of(nowDateTime.getYear(), nowDateTime.getMonth().getValue(), 1, 12, 0, 0, 0, ZoneOffset.UTC).minusMonths(1);
        endHr = startHr.plusHours(1);
        startMonth = OffsetDateTime.of(nowDateTime.getYear(), nowDateTime.getMonth().getValue(), 1, 0, 0, 0, 0, ZoneOffset.UTC).minusMonths(2);
        endMonth = startHr.plusMonths(1);
        futureStartHr = OffsetDateTime.of(now.getYear(), now.getMonth().getValue(), now.getDayOfMonth(), now.getHour(), now.getMinute(), 0, 0, ZoneOffset.UTC).plusHours(5);
        futureStartMonth = futureStartHr.plusMonths(1);
        pastStartMonth = startHr.minusYears(2);
    }

    @Test
    public void getUsageAnalyzedLogsTest() throws ApiException {
        UsageAnalyzedLogsResponse response = api.getUsageAnalyzedLogs()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageFargateTest() throws ApiException {
        UsageFargateResponse response = api.getUsageFargate()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageRumSessionsTest() throws ApiException {
        UsageRumSessionsResponse response = api.getUsageRumSessions()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageMobileRumSessionsTest() throws ApiException {
        UsageRumSessionsResponse response = api.getUsageRumSessions()
                .startHr(startHr)
                .endHr(endHr)
                .type("mobile")
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageHostsTest() throws ApiException {
        UsageHostsResponse response = api.getUsageHosts()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageProfilingTest() throws ApiException {
        UsageProfilingResponse response = api.getUsageProfiling()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageLogsTest() throws ApiException {
        UsageLogsResponse response = api.getUsageLogs()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageLogsByIndexTest() throws ApiException {
        UsageLogsByIndexResponse response = api.getUsageLogsByIndex()
                .startHr(startHr)
                .endHr(endHr)
                .indexName(null)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageNetworkFlowsTest() throws ApiException {
        UsageNetworkFlowsResponse response = api.getUsageNetworkFlows()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageNetworkHostsTest() throws ApiException {
        UsageNetworkHostsResponse response = api.getUsageNetworkHosts()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageSNMPTest() throws ApiException {
        UsageSNMPResponse response = api.getUsageSNMP()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageTracingWithoutLimitsTest() throws ApiException {
        UsageTracingWithoutLimitsResponse response = api.getTracingWithoutLimits()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageBillableSummaryTest() throws ApiException, IOException {
        stubFor(get(urlPathEqualTo("/api/v1/usage/billable-summary"))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/usage_fixtures/usage_billable_summary.json")))
        );

        UsageBillableSummaryResponse usage = unitApi.getUsageBillableSummary().execute();

        assertNotNull(usage.getUsage());
        UsageBillableSummaryHour usageItem = usage.getUsage().get(0);
        assertEquals(usageItem.getOrgName(), "API - Test");
        assertEquals(usageItem.getBillingPlan(), "Pro");
        assertEquals(usageItem.getPublicId(), "123abcxyz");
        OffsetDateTime startDateExpected = OffsetDateTime.of(LocalDateTime.of(2020, 06, 01, 00, 00),
                ZoneOffset.ofHoursMinutes(0, 0));
        OffsetDateTime endDateExpected = OffsetDateTime.of(LocalDateTime.of(2020, 06, 28, 23, 00),
                ZoneOffset.ofHoursMinutes(0, 0));
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
        LocalDate date = LocalDate.now();
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String reportID = FORMATTER.format(date.minusDays(1)); // Only have report from previous day
        generalApiClient.setUnstableOperationEnabled("getSpecifiedDailyCustomReports", true);
        try{
            UsageSpecifiedCustomReportsResponse response = api.getSpecifiedDailyCustomReports(reportID).execute();
            assertNotNull(response.getMeta());
            assertNotNull(response.getData());
        } catch (ApiException e) {
            if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING) == false
            || e.getCode() == 404 || e.getCode() == 403) {
                System.out.println("\nNo reports are available yet or this org is forbidden\n");
            }
        }
    }

    @Test
    public void getSpecifiedMonthlyCustomReportsTest() throws ApiException {
        LocalDate date = LocalDate.now();
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String reportID = FORMATTER.format(date.minusDays(1)); //Reports will only be generated on this 2020-08-15 for this org
        generalApiClient.setUnstableOperationEnabled("getSpecifiedMonthlyCustomReports", true);
        try {
            UsageSpecifiedCustomReportsResponse response = api.getSpecifiedMonthlyCustomReports(reportID).execute();
            assertNotNull(response.getMeta());
            assertNotNull(response.getData());
        } catch (ApiException e) {
            if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING) == false
            || e.getCode() == 404 || e.getCode() == 403) {
                System.out.println("\nNo reports are available yet or this org is forbidden\n");
            }
        }
    }


    @Test
    public void getDailyCustomReportsTest() throws ApiException {
        generalApiClient.setUnstableOperationEnabled("getDailyCustomReports", true);
        try {
            UsageCustomReportsResponse response = api.getDailyCustomReports().execute();
            assertNotNull(response.getMeta());
            assertNotNull(response.getData());
        } catch (ApiException e) {
            if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING) == false
            || e.getCode() == 404 || e.getCode() == 403) {
                System.out.println("\nNo reports are available yet or this org is forbidden\n");
            }
        }
    }

    @Test
    public void getMonthlyCustomReportsTest() throws ApiException {
        generalApiClient.setUnstableOperationEnabled("getMonthlyCustomReports", true);
        try {
            UsageCustomReportsResponse response = api.getMonthlyCustomReports().execute();
            assertNotNull(response.getMeta());
            assertNotNull(response.getData());
        } catch (ApiException e) {
            if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING) == false
            || e.getCode() == 404 || e.getCode() == 403) {
                System.out.println("\nNo reports are available yet or this org is forbidden\n");
            }
        }
    }

    @Test
    public void getUsageSummaryTest() throws ApiException, IOException {
        Boolean includeOrgDetails = true;
        OffsetDateTime startMonth = OffsetDateTime.now();
        OffsetDateTime endMonth = OffsetDateTime.now();

        stubFor(get(urlPathEqualTo("/api/v1/usage/summary"))
                .withQueryParam("start_month", equalTo(startMonth.toString()))
                .withQueryParam("end_month", equalTo(endMonth.toString()))
                .withQueryParam("include_org_details", equalTo("true"))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/usage_fixtures/usage_summary.json")))
        );

        UsageSummaryResponse usage = unitApi.getUsageSummary()
                .startMonth(startMonth)
                .endMonth(endMonth)
                .includeOrgDetails(includeOrgDetails)
                .execute();

        assertNotNull(usage.getUsage());
        OffsetDateTime startDateExpected = OffsetDateTime.of(LocalDateTime.of(2019, 02, 02, 23, 00),
                ZoneOffset.ofHoursMinutes(0, 0));
        OffsetDateTime endDateExpected = OffsetDateTime.of(LocalDateTime.of(2020, 02, 02, 23, 00),
                ZoneOffset.ofHoursMinutes(0, 0));
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

        // Note the nanosecond field had to be converted from the value in the summary fixture (i.e. 0.014039s -> 14039000ns)
        OffsetDateTime dateExpected = OffsetDateTime.of(LocalDateTime.of(2020, 02, 02, 23, 00),
                ZoneOffset.ofHoursMinutes(0, 0));
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
    }

    @Test
    public void getUsageSyntheticsTest() throws ApiException {
        UsageSyntheticsResponse response = api.getUsageSynthetics()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageSyntheticsAPITest() throws ApiException {
        UsageSyntheticsAPIResponse response = api.getUsageSyntheticsAPI()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageSyntheticsBrowserTest() throws ApiException {
        UsageSyntheticsBrowserResponse response = api.getUsageSyntheticsBrowser()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageTimeseriesTest() throws ApiException {
        UsageTimeseriesResponse response = api.getUsageTimeseries()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageTopAvgMetricsTest() throws ApiException {
        // List<String> names = null;
        UsageTopAvgMetricsResponse response = api.getUsageTopAvgMetrics()
                .month(startMonth)
                // .names(names)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageTraceTest() throws ApiException {
        UsageTraceResponse response = api.getUsageTrace()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageLambdaTest() throws ApiException {
        UsageLambdaResponse response = api.getUsageLambda()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    @Test
    public void getUsageAnalyzedLogsErrorsTest() throws IOException {
        try {
            api.getUsageAnalyzedLogs().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageAnalyzedLogs().startHr(futureStartHr).execute();
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
            api.getUsageHosts().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageHosts().startHr(futureStartHr).execute();
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
            api.getUsageProfiling().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageProfiling().startHr(futureStartHr).execute();
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
            api.getUsageLogs().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageLogs().startHr(futureStartHr).execute();
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
            api.getUsageLogsByIndex().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageLogsByIndex().startHr(futureStartHr).execute();
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
            api.getUsageTimeseries().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageTimeseries().startHr(futureStartHr).execute();
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
            api.getUsageTopAvgMetrics().month(pastStartMonth).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageTopAvgMetrics().month(pastStartMonth).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getUsageTraceErrorsTest() throws IOException {
        try {
            api.getUsageTrace().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageTrace().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getUsageSyntheticsErrorsTest() throws IOException {
        //This function is deprecated
        try {
            api.getUsageSynthetics().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageSynthetics().startHr(futureStartHr).execute();
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
            api.getUsageSyntheticsAPI().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageSyntheticsAPI().startHr(futureStartHr).execute();
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
            api.getUsageSyntheticsBrowser().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageSyntheticsBrowser().startHr(futureStartHr).execute();
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
            api.getUsageFargate().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageFargate().startHr(futureStartHr).execute();
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
            api.getUsageLambda().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageLambda().startHr(futureStartHr).execute();
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
            api.getUsageRumSessions().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.getUsageRumSessions()
                    .startHr(startHr)
                    .endHr(endHr)
                    .type("invalid")
                    .execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageRumSessions().startHr(futureStartHr).execute();
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
            api.getUsageNetworkHosts().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageNetworkHosts().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getUsageNetworkFlowsErrorsTest()throws IOException  {
        try {
            api.getUsageNetworkFlows().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageNetworkFlows().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getUsageSNMPErrorsTest()throws IOException  {
        try {
            api.getUsageSNMP().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getUsageSNMP().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getUsageTracingWithoutLimitsErrorsTest()throws IOException  {
        try {
            api.getTracingWithoutLimits().startHr(futureStartHr).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getTracingWithoutLimits().startHr(futureStartHr).execute();
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
            fakeAuthApi.getUsageBillableSummary().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getSpecifiedDailyCustomReportsErrorsTest()throws IOException  {
        try {
            generalFakeAuthApiClient.setUnstableOperationEnabled("getSpecifiedDailyCustomReports", true);
            fakeAuthApi.getSpecifiedDailyCustomReports("whatever").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            generalApiClient.setUnstableOperationEnabled("getSpecifiedDailyCustomReports", true);
            api.getSpecifiedDailyCustomReports("2010-01-01").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getSpecifiedMonthlyCustomReportsErrorsTest()throws IOException  {
        try {
            generalApiClient.setUnstableOperationEnabled("getSpecifiedMonthlyCustomReports", true);
            api.getSpecifiedMonthlyCustomReports("whatever").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            generalFakeAuthApiClient.setUnstableOperationEnabled("getSpecifiedMonthlyCustomReports", true);
            fakeAuthApi.getSpecifiedMonthlyCustomReports("whatever").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }


    @Test
    public void getSpecifiedMonthlyCustomReports404ErrorTest() throws IOException {
        try {
            generalApiClient.setUnstableOperationEnabled("getSpecifiedMonthlyCustomReports", true);
            api.getSpecifiedMonthlyCustomReports("2010-01-01").execute();
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
            generalFakeAuthApiClient.setUnstableOperationEnabled("getDailyCustomReports", true);
            fakeAuthApi.getDailyCustomReports().execute();
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
            generalFakeAuthApiClient.setUnstableOperationEnabled("getMonthlyCustomReports", true);
            fakeAuthApi.getMonthlyCustomReports().execute();
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
        stubFor(get(urlPathEqualTo(apiUri + "/billable-summary"))
                .willReturn(okJson(fixtureData).withStatus(400))
        );
        // Mocked as this call must be made from the parent organization
        try {
            unitApi.getUsageBillableSummary().execute();
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
            fakeAuthApi.getUsageSummary().startMonth(futureStartMonth).execute();
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
        stubFor(get(urlPathEqualTo(apiUri + "/summary"))
                .willReturn(okJson(fixtureData).withStatus(400))
        );
        // Mocked because this requires multi org feature
        try {
            unitApi.getUsageSummary().startMonth(startMonth).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
}
