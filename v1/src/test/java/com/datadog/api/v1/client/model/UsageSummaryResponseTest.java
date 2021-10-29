/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.model.LogsByRetention;
import com.datadog.api.v1.client.model.UsageSummaryDate;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for UsageSummaryResponse
 */
public class UsageSummaryResponseTest {
    private final UsageSummaryResponse model = new UsageSummaryResponse();

    /**
     * Model tests for UsageSummaryResponse
     */
    @Test
    public void testUsageSummaryResponse() {
        // TODO: test UsageSummaryResponse
    }

    /**
     * Test the property 'agentHostTop99pSum'
     */
    @Test
    public void agentHostTop99pSumTest() {
        // TODO: test agentHostTop99pSum
    }

    /**
     * Test the property 'apmAzureAppServiceHostTop99pSum'
     */
    @Test
    public void apmAzureAppServiceHostTop99pSumTest() {
        // TODO: test apmAzureAppServiceHostTop99pSum
    }

    /**
     * Test the property 'apmHostTop99pSum'
     */
    @Test
    public void apmHostTop99pSumTest() {
        // TODO: test apmHostTop99pSum
    }

    /**
     * Test the property 'auditLogsLinesIndexedAggSum'
     */
    @Test
    public void auditLogsLinesIndexedAggSumTest() {
        // TODO: test auditLogsLinesIndexedAggSum
    }

    /**
     * Test the property 'awsHostTop99pSum'
     */
    @Test
    public void awsHostTop99pSumTest() {
        // TODO: test awsHostTop99pSum
    }

    /**
     * Test the property 'awsLambdaFuncCount'
     */
    @Test
    public void awsLambdaFuncCountTest() {
        // TODO: test awsLambdaFuncCount
    }

    /**
     * Test the property 'awsLambdaInvocationsSum'
     */
    @Test
    public void awsLambdaInvocationsSumTest() {
        // TODO: test awsLambdaInvocationsSum
    }

    /**
     * Test the property 'azureAppServiceTop99pSum'
     */
    @Test
    public void azureAppServiceTop99pSumTest() {
        // TODO: test azureAppServiceTop99pSum
    }

    /**
     * Test the property 'azureHostTop99pSum'
     */
    @Test
    public void azureHostTop99pSumTest() {
        // TODO: test azureHostTop99pSum
    }

    /**
     * Test the property 'billableIngestedBytesAggSum'
     */
    @Test
    public void billableIngestedBytesAggSumTest() {
        // TODO: test billableIngestedBytesAggSum
    }

    /**
     * Test the property 'containerAvgSum'
     */
    @Test
    public void containerAvgSumTest() {
        // TODO: test containerAvgSum
    }

    /**
     * Test the property 'containerHwmSum'
     */
    @Test
    public void containerHwmSumTest() {
        // TODO: test containerHwmSum
    }

    /**
     * Test the property 'cspmContainerAvgSum'
     */
    @Test
    public void cspmContainerAvgSumTest() {
        // TODO: test cspmContainerAvgSum
    }

    /**
     * Test the property 'cspmContainerHwmSum'
     */
    @Test
    public void cspmContainerHwmSumTest() {
        // TODO: test cspmContainerHwmSum
    }

    /**
     * Test the property 'cspmHostTop99pSum'
     */
    @Test
    public void cspmHostTop99pSumTest() {
        // TODO: test cspmHostTop99pSum
    }

    /**
     * Test the property 'customTsSum'
     */
    @Test
    public void customTsSumTest() {
        // TODO: test customTsSum
    }

    /**
     * Test the property 'cwsContainersAvgSum'
     */
    @Test
    public void cwsContainersAvgSumTest() {
        // TODO: test cwsContainersAvgSum
    }

    /**
     * Test the property 'cwsHostTop99pSum'
     */
    @Test
    public void cwsHostTop99pSumTest() {
        // TODO: test cwsHostTop99pSum
    }

    /**
     * Test the property 'dbmHostTop99pSum'
     */
    @Test
    public void dbmHostTop99pSumTest() {
        // TODO: test dbmHostTop99pSum
    }

    /**
     * Test the property 'dbmQueriesAvgSum'
     */
    @Test
    public void dbmQueriesAvgSumTest() {
        // TODO: test dbmQueriesAvgSum
    }

    /**
     * Test the property 'endDate'
     */
    @Test
    public void endDateTest() {
        // TODO: test endDate
    }

    /**
     * Test the property 'fargateTasksCountAvgSum'
     */
    @Test
    public void fargateTasksCountAvgSumTest() {
        // TODO: test fargateTasksCountAvgSum
    }

    /**
     * Test the property 'fargateTasksCountHwmSum'
     */
    @Test
    public void fargateTasksCountHwmSumTest() {
        // TODO: test fargateTasksCountHwmSum
    }

    /**
     * Test the property 'gcpHostTop99pSum'
     */
    @Test
    public void gcpHostTop99pSumTest() {
        // TODO: test gcpHostTop99pSum
    }

    /**
     * Test the property 'herokuHostTop99pSum'
     */
    @Test
    public void herokuHostTop99pSumTest() {
        // TODO: test herokuHostTop99pSum
    }

    /**
     * Test the property 'incidentManagementMonthlyActiveUsersHwmSum'
     */
    @Test
    public void incidentManagementMonthlyActiveUsersHwmSumTest() {
        // TODO: test incidentManagementMonthlyActiveUsersHwmSum
    }

    /**
     * Test the property 'indexedEventsCountAggSum'
     */
    @Test
    public void indexedEventsCountAggSumTest() {
        // TODO: test indexedEventsCountAggSum
    }

    /**
     * Test the property 'infraHostTop99pSum'
     */
    @Test
    public void infraHostTop99pSumTest() {
        // TODO: test infraHostTop99pSum
    }

    /**
     * Test the property 'ingestedEventsBytesAggSum'
     */
    @Test
    public void ingestedEventsBytesAggSumTest() {
        // TODO: test ingestedEventsBytesAggSum
    }

    /**
     * Test the property 'iotDeviceAggSum'
     */
    @Test
    public void iotDeviceAggSumTest() {
        // TODO: test iotDeviceAggSum
    }

    /**
     * Test the property 'iotDeviceTop99pSum'
     */
    @Test
    public void iotDeviceTop99pSumTest() {
        // TODO: test iotDeviceTop99pSum
    }

    /**
     * Test the property 'lastUpdated'
     */
    @Test
    public void lastUpdatedTest() {
        // TODO: test lastUpdated
    }

    /**
     * Test the property 'liveIndexedEventsAggSum'
     */
    @Test
    public void liveIndexedEventsAggSumTest() {
        // TODO: test liveIndexedEventsAggSum
    }

    /**
     * Test the property 'liveIngestedBytesAggSum'
     */
    @Test
    public void liveIngestedBytesAggSumTest() {
        // TODO: test liveIngestedBytesAggSum
    }

    /**
     * Test the property 'logsByRetention'
     */
    @Test
    public void logsByRetentionTest() {
        // TODO: test logsByRetention
    }

    /**
     * Test the property 'mobileRumSessionCountAggSum'
     */
    @Test
    public void mobileRumSessionCountAggSumTest() {
        // TODO: test mobileRumSessionCountAggSum
    }

    /**
     * Test the property 'mobileRumSessionCountAndroidAggSum'
     */
    @Test
    public void mobileRumSessionCountAndroidAggSumTest() {
        // TODO: test mobileRumSessionCountAndroidAggSum
    }

    /**
     * Test the property 'mobileRumSessionCountIosAggSum'
     */
    @Test
    public void mobileRumSessionCountIosAggSumTest() {
        // TODO: test mobileRumSessionCountIosAggSum
    }

    /**
     * Test the property 'netflowIndexedEventsCountAggSum'
     */
    @Test
    public void netflowIndexedEventsCountAggSumTest() {
        // TODO: test netflowIndexedEventsCountAggSum
    }

    /**
     * Test the property 'npmHostTop99pSum'
     */
    @Test
    public void npmHostTop99pSumTest() {
        // TODO: test npmHostTop99pSum
    }

    /**
     * Test the property 'opentelemetryHostTop99pSum'
     */
    @Test
    public void opentelemetryHostTop99pSumTest() {
        // TODO: test opentelemetryHostTop99pSum
    }

    /**
     * Test the property 'profilingContainerAgentCountAvg'
     */
    @Test
    public void profilingContainerAgentCountAvgTest() {
        // TODO: test profilingContainerAgentCountAvg
    }

    /**
     * Test the property 'profilingHostCountTop99pSum'
     */
    @Test
    public void profilingHostCountTop99pSumTest() {
        // TODO: test profilingHostCountTop99pSum
    }

    /**
     * Test the property 'rehydratedIndexedEventsAggSum'
     */
    @Test
    public void rehydratedIndexedEventsAggSumTest() {
        // TODO: test rehydratedIndexedEventsAggSum
    }

    /**
     * Test the property 'rehydratedIngestedBytesAggSum'
     */
    @Test
    public void rehydratedIngestedBytesAggSumTest() {
        // TODO: test rehydratedIngestedBytesAggSum
    }

    /**
     * Test the property 'rumSessionCountAggSum'
     */
    @Test
    public void rumSessionCountAggSumTest() {
        // TODO: test rumSessionCountAggSum
    }

    /**
     * Test the property 'rumTotalSessionCountAggSum'
     */
    @Test
    public void rumTotalSessionCountAggSumTest() {
        // TODO: test rumTotalSessionCountAggSum
    }

    /**
     * Test the property 'sdsLogsScannedBytesSum'
     */
    @Test
    public void sdsLogsScannedBytesSumTest() {
        // TODO: test sdsLogsScannedBytesSum
    }

    /**
     * Test the property 'sdsTotalScannedBytesSum'
     */
    @Test
    public void sdsTotalScannedBytesSumTest() {
        // TODO: test sdsTotalScannedBytesSum
    }

    /**
     * Test the property 'startDate'
     */
    @Test
    public void startDateTest() {
        // TODO: test startDate
    }

    /**
     * Test the property 'syntheticsBrowserCheckCallsCountAggSum'
     */
    @Test
    public void syntheticsBrowserCheckCallsCountAggSumTest() {
        // TODO: test syntheticsBrowserCheckCallsCountAggSum
    }

    /**
     * Test the property 'syntheticsCheckCallsCountAggSum'
     */
    @Test
    public void syntheticsCheckCallsCountAggSumTest() {
        // TODO: test syntheticsCheckCallsCountAggSum
    }

    /**
     * Test the property 'traceSearchIndexedEventsCountAggSum'
     */
    @Test
    public void traceSearchIndexedEventsCountAggSumTest() {
        // TODO: test traceSearchIndexedEventsCountAggSum
    }

    /**
     * Test the property 'twolIngestedEventsBytesAggSum'
     */
    @Test
    public void twolIngestedEventsBytesAggSumTest() {
        // TODO: test twolIngestedEventsBytesAggSum
    }

    /**
     * Test the property 'usage'
     */
    @Test
    public void usageTest() {
        // TODO: test usage
    }

    /**
     * Test the property 'vsphereHostTop99pSum'
     */
    @Test
    public void vsphereHostTop99pSumTest() {
        // TODO: test vsphereHostTop99pSum
    }

}
