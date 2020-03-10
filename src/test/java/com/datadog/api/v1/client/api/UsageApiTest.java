/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import com.datadog.api.v1.client.model.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * API tests for UsageApi
 */
public class UsageApiTest extends V1ApiTest {

    private static UsageApi api;
    private static UsageApi unitAPI;

    private static OffsetDateTime startHr;
    private static OffsetDateTime endHr;
    private static OffsetDateTime startMonth;
    private static OffsetDateTime endMonth;

    @BeforeClass
    public static void initApi() {
        api = new UsageApi(generalApiClient);
        unitAPI = new UsageApi(generalApiUnitTestClient);
    }

    @BeforeClass
    public static void initDateTime() {
        OffsetDateTime now = OffsetDateTime.now();

        startHr = OffsetDateTime.of(now.getYear(), now.getMonth().getValue(), 1, 12, 0, 0, 0, ZoneOffset.UTC).minusMonths(1);
        endHr = startHr.plusHours(1);
        startMonth = OffsetDateTime.of(now.getYear(), now.getMonth().getValue(), 1, 0, 0, 0, 0, ZoneOffset.UTC).minusMonths(2);
        endMonth = startHr.plusMonths(1);
    }


    /**
     * Get hourly usage for fargate.
     *
     * ### Overview Get hourly usage for [fargate](https://docs.datadoghq.com/integrations/ecs_fargate/). ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageFargateTest() throws ApiException {
        UsageFargateResponse response = api.getUsageFargate()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    /**
     * Get hourly usage for hosts and containers.
     *
     * ### Overview Get hourly usage for hosts and containers. ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageHostsTest() throws ApiException {
        UsageHostsResponse response = api.getUsageHosts()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    /**
     * Get hourly usage for logs.
     *
     * ### Overview Get hourly usage for logs. ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageLogsTest() throws ApiException {
        UsageLogsResponse response = api.getUsageLogs()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    /**
     * Get usage across your multi-org account.
     *
     * ### Overview Get usage across your multi-org account. ### Arguments * **&#x60;start_month&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning in this month. Maximum of 15 months ago. * **&#x60;end_month&#x60;** [*optional*, *default* &#x3D; **current_month-3d**] Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage ending this month. * **&#x60;include_org_details&#x60;** [*optional*, *default* &#x3D; **true**] Include usage summaries for each sub-org.
     *
     * @throws ApiException
     *          if the Api call fails
     */
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

        UsageSummaryResponse usage = unitAPI.getUsageSummary()
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

        // Note the nanoseocnd field had to be converted from the value in the summary fixture (i.e. 0.014039s -> 14039000ns)
        OffsetDateTime dateExpected = OffsetDateTime.of(LocalDateTime.of(2020, 02, 02, 16, 34, 14, 14039000),
                ZoneOffset.ofHoursMinutes(0, 0));
        UsageSummaryDate usageItem = usage.getUsage().get(0);
        assertEquals(usageItem.getDate(),  dateExpected);
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

    /**
     * Get hourly usage for synthetics.
     *
     * ### Overview Get hourly usage for [synthetics](https://docs.datadoghq.com/synthetics/). ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageSyntheticsTest() throws ApiException {
        UsageSyntheticsResponse response = api.getUsageSynthetics()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    /**
     * Get hourly usage for custom metrics.
     *
     * ### Overview Get hourly usage for [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/). ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageTimeseriesTest() throws ApiException {
        UsageTimeseriesResponse response = api.getUsageTimeseries()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

    /**
     * Get top custom metrics by hourly average.
     *
     * ### Overview Get top [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average. ### Arguments * **&#x60;month&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour. * **&#x60;names&#x60;** [*optional*, *default* &#x3D; **None**] Comma-separated list of metric names.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageTopAvgMetricsTest() throws ApiException {
        // List<String> names = null;
        UsageTopAvgMetricsResponse response = api.getUsageTopAvgMetrics()
                .month(startMonth)
                // .names(names)
                .execute();
        assertNotNull(response.getUsage());
    }

    /**
     * Get hourly usage for trace search.
     *
     * ### Overview Get hourly usage for trace search. ### Arguments * **&#x60;start_hr&#x60;** [*required*] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour * **&#x60;end_hr&#x60;** [*optional*, *default* &#x3D; **1d+start_hr**] Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending BEFORE this hour
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsageTraceTest() throws ApiException {
        UsageTraceResponse response = api.getUsageTrace()
                .startHr(startHr)
                .endHr(endHr)
                .execute();
        assertNotNull(response.getUsage());
    }

}
