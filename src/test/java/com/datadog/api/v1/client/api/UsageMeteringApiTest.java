/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import org.eclipse.jetty.util.IO;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


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

    private final String apiUri = "/api/v1/usage";
    private final String fixturePrefix = "v1/client/api/usage_fixtures";

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
    public void getUsageHostsTest() throws ApiException {
        UsageHostsResponse response = api.getUsageHosts()
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

        // Note the nanosecond field had to be converted from the value in the summary fixture (i.e. 0.014039s -> 14039000ns)
        OffsetDateTime dateExpected = OffsetDateTime.of(LocalDateTime.of(2020, 02, 02, 16, 34, 14, 14039000),
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
    public void getUsageHostsErrorsTest() {
        try {
            api.getUsageHosts().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageHosts().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageLogsErrorsTest() {
        try {
            api.getUsageLogs().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageLogs().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageLogsByIndexErrorsTest() {
        try {
            api.getUsageLogsByIndex().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageLogsByIndex().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageTimeSeriesErrorsTest() {
        try {
            api.getUsageTimeseries().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageTimeseries().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageTopAvgMetricsErrorsTest() {
        try {
            api.getUsageTopAvgMetrics().month(pastStartMonth).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageTopAvgMetrics().month(pastStartMonth).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageTraceErrorsTest() {
        try {
            api.getUsageTrace().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageTrace().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageSyntheticsErrorsTest() {
        //This function is deprecated
        try {
            api.getUsageSynthetics().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageSynthetics().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageSyntheticsAPIErrorsTest() {
        try {
            api.getUsageSyntheticsAPI().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageSyntheticsAPI().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageSyntheticsBrowserErrorsTest() {
        try {
            api.getUsageSyntheticsBrowser().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageSyntheticsBrowser().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageFargateErrorsTest() {
        try {
            api.getUsageFargate().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageFargate().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageLambdaErrorsTest() {
        try {
            api.getUsageLambda().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageLambda().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageRumSessionErrorsTest() {
        try {
            api.getUsageRumSessions().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageRumSessions().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageNetworkHostsErrorsTest() {
        try {
            api.getUsageNetworkHosts().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageNetworkHosts().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageNetworkFlowsErrorsTest() {
        try {
            api.getUsageNetworkFlows().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getUsageNetworkFlows().startHr(futureStartHr).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void getUsageSummaryErrorsTest() {
        try {
            fakeAuthApi.getUsageSummary().startMonth(futureStartMonth).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
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
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }
    }
}
