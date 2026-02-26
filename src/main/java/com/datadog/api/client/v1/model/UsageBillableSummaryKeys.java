/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Response with aggregated usage types.</p>
 */
@JsonPropertyOrder({
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_FARGATE_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_FARGATE_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_PROFILER_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_PROFILER_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_TRACE_SEARCH_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_APPLICATION_SECURITY_FARGATE_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_APPLICATION_SECURITY_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_APPLICATION_SECURITY_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CI_PIPELINE_MAXIMUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CI_PIPELINE_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CI_TESTING_MAXIMUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CI_TESTING_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CSPM_CONTAINER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CSPM_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CSPM_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_CUSTOM_EVENT_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CWS_CONTAINER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CWS_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_CWS_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_DBM_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_DBM_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_DBM_NORMALIZED_QUERIES_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_DBM_NORMALIZED_QUERIES_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_FARGATE_CONTAINER_APM_AND_PROFILER_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_FARGATE_CONTAINER_APM_AND_PROFILER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_FARGATE_CONTAINER_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_FARGATE_CONTAINER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_INCIDENT_MANAGEMENT_MAXIMUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_INCIDENT_MANAGEMENT_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_INFRA_AND_APM_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_INFRA_AND_APM_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_INFRA_CONTAINER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_INFRA_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_INFRA_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_INGESTED_SPANS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_INGESTED_TIMESERIES_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_INGESTED_TIMESERIES_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_IOT_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_IOT_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_LAMBDA_FUNCTION_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_LAMBDA_FUNCTION_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_FORWARDING_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED15DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED180DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED_1DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED30DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED_360DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED3DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED45DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED60DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED7DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED90DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INGESTED_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_NETWORK_DEVICE_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_NETWORK_DEVICE_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_NPM_FLOW_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_NPM_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_NPM_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_OBSERVABILITY_PIPELINE_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_ONLINE_ARCHIVE_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_PROF_CONTAINER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_PROF_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_PROF_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_RUM_LITE_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_RUM_REPLAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_RUM_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_RUM_UNITS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SENSITIVE_DATA_SCANNER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SERVERLESS_APM_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SERVERLESS_INFRA_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_SERVERLESS_INFRA_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SERVERLESS_INVOCATION_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SIEM_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_STANDARD_TIMESERIES_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_SYNTHETICS_API_TESTS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SYNTHETICS_APP_TESTING_MAXIMUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECKS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_TIMESERIES_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_TIMESERIES_SUM
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageBillableSummaryKeys {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_FARGATE_AVERAGE = "apm_fargate_average";
  private UsageBillableSummaryBody apmFargateAverage;

  public static final String JSON_PROPERTY_APM_FARGATE_SUM = "apm_fargate_sum";
  private UsageBillableSummaryBody apmFargateSum;

  public static final String JSON_PROPERTY_APM_HOST_SUM = "apm_host_sum";
  private UsageBillableSummaryBody apmHostSum;

  public static final String JSON_PROPERTY_APM_HOST_TOP99P = "apm_host_top99p";
  private UsageBillableSummaryBody apmHostTop99p;

  public static final String JSON_PROPERTY_APM_PROFILER_HOST_SUM = "apm_profiler_host_sum";
  private UsageBillableSummaryBody apmProfilerHostSum;

  public static final String JSON_PROPERTY_APM_PROFILER_HOST_TOP99P = "apm_profiler_host_top99p";
  private UsageBillableSummaryBody apmProfilerHostTop99p;

  public static final String JSON_PROPERTY_APM_TRACE_SEARCH_SUM = "apm_trace_search_sum";
  private UsageBillableSummaryBody apmTraceSearchSum;

  public static final String JSON_PROPERTY_APPLICATION_SECURITY_FARGATE_AVERAGE = "application_security_fargate_average";
  private UsageBillableSummaryBody applicationSecurityFargateAverage;

  public static final String JSON_PROPERTY_APPLICATION_SECURITY_HOST_SUM = "application_security_host_sum";
  private UsageBillableSummaryBody applicationSecurityHostSum;

  public static final String JSON_PROPERTY_APPLICATION_SECURITY_HOST_TOP99P = "application_security_host_top99p";
  private UsageBillableSummaryBody applicationSecurityHostTop99p;

  public static final String JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM = "ci_pipeline_indexed_spans_sum";
  private UsageBillableSummaryBody ciPipelineIndexedSpansSum;

  public static final String JSON_PROPERTY_CI_PIPELINE_MAXIMUM = "ci_pipeline_maximum";
  private UsageBillableSummaryBody ciPipelineMaximum;

  public static final String JSON_PROPERTY_CI_PIPELINE_SUM = "ci_pipeline_sum";
  private UsageBillableSummaryBody ciPipelineSum;

  public static final String JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM = "ci_test_indexed_spans_sum";
  private UsageBillableSummaryBody ciTestIndexedSpansSum;

  public static final String JSON_PROPERTY_CI_TESTING_MAXIMUM = "ci_testing_maximum";
  private UsageBillableSummaryBody ciTestingMaximum;

  public static final String JSON_PROPERTY_CI_TESTING_SUM = "ci_testing_sum";
  private UsageBillableSummaryBody ciTestingSum;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AVERAGE = "cloud_cost_management_average";
  private UsageBillableSummaryBody cloudCostManagementAverage;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_SUM = "cloud_cost_management_sum";
  private UsageBillableSummaryBody cloudCostManagementSum;

  public static final String JSON_PROPERTY_CSPM_CONTAINER_SUM = "cspm_container_sum";
  private UsageBillableSummaryBody cspmContainerSum;

  public static final String JSON_PROPERTY_CSPM_HOST_SUM = "cspm_host_sum";
  private UsageBillableSummaryBody cspmHostSum;

  public static final String JSON_PROPERTY_CSPM_HOST_TOP99P = "cspm_host_top99p";
  private UsageBillableSummaryBody cspmHostTop99p;

  public static final String JSON_PROPERTY_CUSTOM_EVENT_SUM = "custom_event_sum";
  private UsageBillableSummaryBody customEventSum;

  public static final String JSON_PROPERTY_CWS_CONTAINER_SUM = "cws_container_sum";
  private UsageBillableSummaryBody cwsContainerSum;

  public static final String JSON_PROPERTY_CWS_HOST_SUM = "cws_host_sum";
  private UsageBillableSummaryBody cwsHostSum;

  public static final String JSON_PROPERTY_CWS_HOST_TOP99P = "cws_host_top99p";
  private UsageBillableSummaryBody cwsHostTop99p;

  public static final String JSON_PROPERTY_DBM_HOST_SUM = "dbm_host_sum";
  private UsageBillableSummaryBody dbmHostSum;

  public static final String JSON_PROPERTY_DBM_HOST_TOP99P = "dbm_host_top99p";
  private UsageBillableSummaryBody dbmHostTop99p;

  public static final String JSON_PROPERTY_DBM_NORMALIZED_QUERIES_AVERAGE = "dbm_normalized_queries_average";
  private UsageBillableSummaryBody dbmNormalizedQueriesAverage;

  public static final String JSON_PROPERTY_DBM_NORMALIZED_QUERIES_SUM = "dbm_normalized_queries_sum";
  private UsageBillableSummaryBody dbmNormalizedQueriesSum;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_APM_AND_PROFILER_AVERAGE = "fargate_container_apm_and_profiler_average";
  private UsageBillableSummaryBody fargateContainerApmAndProfilerAverage;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_APM_AND_PROFILER_SUM = "fargate_container_apm_and_profiler_sum";
  private UsageBillableSummaryBody fargateContainerApmAndProfilerSum;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_AVERAGE = "fargate_container_average";
  private UsageBillableSummaryBody fargateContainerAverage;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_AVERAGE = "fargate_container_profiler_average";
  private UsageBillableSummaryBody fargateContainerProfilerAverage;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_SUM = "fargate_container_profiler_sum";
  private UsageBillableSummaryBody fargateContainerProfilerSum;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_SUM = "fargate_container_sum";
  private UsageBillableSummaryBody fargateContainerSum;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_MAXIMUM = "incident_management_maximum";
  private UsageBillableSummaryBody incidentManagementMaximum;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_SUM = "incident_management_sum";
  private UsageBillableSummaryBody incidentManagementSum;

  public static final String JSON_PROPERTY_INFRA_AND_APM_HOST_SUM = "infra_and_apm_host_sum";
  private UsageBillableSummaryBody infraAndApmHostSum;

  public static final String JSON_PROPERTY_INFRA_AND_APM_HOST_TOP99P = "infra_and_apm_host_top99p";
  private UsageBillableSummaryBody infraAndApmHostTop99p;

  public static final String JSON_PROPERTY_INFRA_CONTAINER_SUM = "infra_container_sum";
  private UsageBillableSummaryBody infraContainerSum;

  public static final String JSON_PROPERTY_INFRA_HOST_SUM = "infra_host_sum";
  private UsageBillableSummaryBody infraHostSum;

  public static final String JSON_PROPERTY_INFRA_HOST_TOP99P = "infra_host_top99p";
  private UsageBillableSummaryBody infraHostTop99p;

  public static final String JSON_PROPERTY_INGESTED_SPANS_SUM = "ingested_spans_sum";
  private UsageBillableSummaryBody ingestedSpansSum;

  public static final String JSON_PROPERTY_INGESTED_TIMESERIES_AVERAGE = "ingested_timeseries_average";
  private UsageBillableSummaryBody ingestedTimeseriesAverage;

  public static final String JSON_PROPERTY_INGESTED_TIMESERIES_SUM = "ingested_timeseries_sum";
  private UsageBillableSummaryBody ingestedTimeseriesSum;

  public static final String JSON_PROPERTY_IOT_SUM = "iot_sum";
  private UsageBillableSummaryBody iotSum;

  public static final String JSON_PROPERTY_IOT_TOP99P = "iot_top99p";
  private UsageBillableSummaryBody iotTop99p;

  public static final String JSON_PROPERTY_LAMBDA_FUNCTION_AVERAGE = "lambda_function_average";
  private UsageBillableSummaryBody lambdaFunctionAverage;

  public static final String JSON_PROPERTY_LAMBDA_FUNCTION_SUM = "lambda_function_sum";
  private UsageBillableSummaryBody lambdaFunctionSum;

  public static final String JSON_PROPERTY_LOGS_FORWARDING_SUM = "logs_forwarding_sum";
  private UsageBillableSummaryBody logsForwardingSum;

  public static final String JSON_PROPERTY_LOGS_INDEXED15DAY_SUM = "logs_indexed_15day_sum";
  private UsageBillableSummaryBody logsIndexed15daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED180DAY_SUM = "logs_indexed_180day_sum";
  private UsageBillableSummaryBody logsIndexed180daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED_1DAY_SUM = "logs_indexed_1day_sum";
  private UsageBillableSummaryBody logsIndexed1daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED30DAY_SUM = "logs_indexed_30day_sum";
  private UsageBillableSummaryBody logsIndexed30daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED_360DAY_SUM = "logs_indexed_360day_sum";
  private UsageBillableSummaryBody logsIndexed360daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED3DAY_SUM = "logs_indexed_3day_sum";
  private UsageBillableSummaryBody logsIndexed3daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED45DAY_SUM = "logs_indexed_45day_sum";
  private UsageBillableSummaryBody logsIndexed45daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED60DAY_SUM = "logs_indexed_60day_sum";
  private UsageBillableSummaryBody logsIndexed60daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED7DAY_SUM = "logs_indexed_7day_sum";
  private UsageBillableSummaryBody logsIndexed7daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED90DAY_SUM = "logs_indexed_90day_sum";
  private UsageBillableSummaryBody logsIndexed90daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_SUM = "logs_indexed_custom_retention_sum";
  private UsageBillableSummaryBody logsIndexedCustomRetentionSum;

  public static final String JSON_PROPERTY_LOGS_INDEXED_SUM = "logs_indexed_sum";
  private UsageBillableSummaryBody logsIndexedSum;

  public static final String JSON_PROPERTY_LOGS_INGESTED_SUM = "logs_ingested_sum";
  private UsageBillableSummaryBody logsIngestedSum;

  public static final String JSON_PROPERTY_NETWORK_DEVICE_SUM = "network_device_sum";
  private UsageBillableSummaryBody networkDeviceSum;

  public static final String JSON_PROPERTY_NETWORK_DEVICE_TOP99P = "network_device_top99p";
  private UsageBillableSummaryBody networkDeviceTop99p;

  public static final String JSON_PROPERTY_NPM_FLOW_SUM = "npm_flow_sum";
  private UsageBillableSummaryBody npmFlowSum;

  public static final String JSON_PROPERTY_NPM_HOST_SUM = "npm_host_sum";
  private UsageBillableSummaryBody npmHostSum;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P = "npm_host_top99p";
  private UsageBillableSummaryBody npmHostTop99p;

  public static final String JSON_PROPERTY_OBSERVABILITY_PIPELINE_SUM = "observability_pipeline_sum";
  private UsageBillableSummaryBody observabilityPipelineSum;

  public static final String JSON_PROPERTY_ONLINE_ARCHIVE_SUM = "online_archive_sum";
  private UsageBillableSummaryBody onlineArchiveSum;

  public static final String JSON_PROPERTY_PROF_CONTAINER_SUM = "prof_container_sum";
  private UsageBillableSummaryBody profContainerSum;

  public static final String JSON_PROPERTY_PROF_HOST_SUM = "prof_host_sum";
  private UsageBillableSummaryBody profHostSum;

  public static final String JSON_PROPERTY_PROF_HOST_TOP99P = "prof_host_top99p";
  private UsageBillableSummaryBody profHostTop99p;

  public static final String JSON_PROPERTY_RUM_LITE_SUM = "rum_lite_sum";
  private UsageBillableSummaryBody rumLiteSum;

  public static final String JSON_PROPERTY_RUM_REPLAY_SUM = "rum_replay_sum";
  private UsageBillableSummaryBody rumReplaySum;

  public static final String JSON_PROPERTY_RUM_SUM = "rum_sum";
  private UsageBillableSummaryBody rumSum;

  public static final String JSON_PROPERTY_RUM_UNITS_SUM = "rum_units_sum";
  private UsageBillableSummaryBody rumUnitsSum;

  public static final String JSON_PROPERTY_SENSITIVE_DATA_SCANNER_SUM = "sensitive_data_scanner_sum";
  private UsageBillableSummaryBody sensitiveDataScannerSum;

  public static final String JSON_PROPERTY_SERVERLESS_APM_SUM = "serverless_apm_sum";
  private UsageBillableSummaryBody serverlessApmSum;

  public static final String JSON_PROPERTY_SERVERLESS_INFRA_AVERAGE = "serverless_infra_average";
  private UsageBillableSummaryBody serverlessInfraAverage;

  public static final String JSON_PROPERTY_SERVERLESS_INFRA_SUM = "serverless_infra_sum";
  private UsageBillableSummaryBody serverlessInfraSum;

  public static final String JSON_PROPERTY_SERVERLESS_INVOCATION_SUM = "serverless_invocation_sum";
  private UsageBillableSummaryBody serverlessInvocationSum;

  public static final String JSON_PROPERTY_SIEM_SUM = "siem_sum";
  private UsageBillableSummaryBody siemSum;

  public static final String JSON_PROPERTY_STANDARD_TIMESERIES_AVERAGE = "standard_timeseries_average";
  private UsageBillableSummaryBody standardTimeseriesAverage;

  public static final String JSON_PROPERTY_SYNTHETICS_API_TESTS_SUM = "synthetics_api_tests_sum";
  private UsageBillableSummaryBody syntheticsApiTestsSum;

  public static final String JSON_PROPERTY_SYNTHETICS_APP_TESTING_MAXIMUM = "synthetics_app_testing_maximum";
  private UsageBillableSummaryBody syntheticsAppTestingMaximum;

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECKS_SUM = "synthetics_browser_checks_sum";
  private UsageBillableSummaryBody syntheticsBrowserChecksSum;

  public static final String JSON_PROPERTY_TIMESERIES_AVERAGE = "timeseries_average";
  private UsageBillableSummaryBody timeseriesAverage;

  public static final String JSON_PROPERTY_TIMESERIES_SUM = "timeseries_sum";
  private UsageBillableSummaryBody timeseriesSum;

  public UsageBillableSummaryKeys apmFargateAverage(UsageBillableSummaryBody apmFargateAverage) {
    this.apmFargateAverage = apmFargateAverage;
    this.unparsed |= apmFargateAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return apmFargateAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM_FARGATE_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApmFargateAverage() {
        return apmFargateAverage;
      }
  public void setApmFargateAverage(UsageBillableSummaryBody apmFargateAverage) {
    this.apmFargateAverage = apmFargateAverage;
  }
  public UsageBillableSummaryKeys apmFargateSum(UsageBillableSummaryBody apmFargateSum) {
    this.apmFargateSum = apmFargateSum;
    this.unparsed |= apmFargateSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return apmFargateSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM_FARGATE_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApmFargateSum() {
        return apmFargateSum;
      }
  public void setApmFargateSum(UsageBillableSummaryBody apmFargateSum) {
    this.apmFargateSum = apmFargateSum;
  }
  public UsageBillableSummaryKeys apmHostSum(UsageBillableSummaryBody apmHostSum) {
    this.apmHostSum = apmHostSum;
    this.unparsed |= apmHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return apmHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApmHostSum() {
        return apmHostSum;
      }
  public void setApmHostSum(UsageBillableSummaryBody apmHostSum) {
    this.apmHostSum = apmHostSum;
  }
  public UsageBillableSummaryKeys apmHostTop99p(UsageBillableSummaryBody apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
    this.unparsed |= apmHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return apmHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApmHostTop99p() {
        return apmHostTop99p;
      }
  public void setApmHostTop99p(UsageBillableSummaryBody apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
  }
  public UsageBillableSummaryKeys apmProfilerHostSum(UsageBillableSummaryBody apmProfilerHostSum) {
    this.apmProfilerHostSum = apmProfilerHostSum;
    this.unparsed |= apmProfilerHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return apmProfilerHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM_PROFILER_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApmProfilerHostSum() {
        return apmProfilerHostSum;
      }
  public void setApmProfilerHostSum(UsageBillableSummaryBody apmProfilerHostSum) {
    this.apmProfilerHostSum = apmProfilerHostSum;
  }
  public UsageBillableSummaryKeys apmProfilerHostTop99p(UsageBillableSummaryBody apmProfilerHostTop99p) {
    this.apmProfilerHostTop99p = apmProfilerHostTop99p;
    this.unparsed |= apmProfilerHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return apmProfilerHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM_PROFILER_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApmProfilerHostTop99p() {
        return apmProfilerHostTop99p;
      }
  public void setApmProfilerHostTop99p(UsageBillableSummaryBody apmProfilerHostTop99p) {
    this.apmProfilerHostTop99p = apmProfilerHostTop99p;
  }
  public UsageBillableSummaryKeys apmTraceSearchSum(UsageBillableSummaryBody apmTraceSearchSum) {
    this.apmTraceSearchSum = apmTraceSearchSum;
    this.unparsed |= apmTraceSearchSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return apmTraceSearchSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM_TRACE_SEARCH_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApmTraceSearchSum() {
        return apmTraceSearchSum;
      }
  public void setApmTraceSearchSum(UsageBillableSummaryBody apmTraceSearchSum) {
    this.apmTraceSearchSum = apmTraceSearchSum;
  }
  public UsageBillableSummaryKeys applicationSecurityFargateAverage(UsageBillableSummaryBody applicationSecurityFargateAverage) {
    this.applicationSecurityFargateAverage = applicationSecurityFargateAverage;
    this.unparsed |= applicationSecurityFargateAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return applicationSecurityFargateAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APPLICATION_SECURITY_FARGATE_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApplicationSecurityFargateAverage() {
        return applicationSecurityFargateAverage;
      }
  public void setApplicationSecurityFargateAverage(UsageBillableSummaryBody applicationSecurityFargateAverage) {
    this.applicationSecurityFargateAverage = applicationSecurityFargateAverage;
  }
  public UsageBillableSummaryKeys applicationSecurityHostSum(UsageBillableSummaryBody applicationSecurityHostSum) {
    this.applicationSecurityHostSum = applicationSecurityHostSum;
    this.unparsed |= applicationSecurityHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return applicationSecurityHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APPLICATION_SECURITY_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApplicationSecurityHostSum() {
        return applicationSecurityHostSum;
      }
  public void setApplicationSecurityHostSum(UsageBillableSummaryBody applicationSecurityHostSum) {
    this.applicationSecurityHostSum = applicationSecurityHostSum;
  }
  public UsageBillableSummaryKeys applicationSecurityHostTop99p(UsageBillableSummaryBody applicationSecurityHostTop99p) {
    this.applicationSecurityHostTop99p = applicationSecurityHostTop99p;
    this.unparsed |= applicationSecurityHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return applicationSecurityHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APPLICATION_SECURITY_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getApplicationSecurityHostTop99p() {
        return applicationSecurityHostTop99p;
      }
  public void setApplicationSecurityHostTop99p(UsageBillableSummaryBody applicationSecurityHostTop99p) {
    this.applicationSecurityHostTop99p = applicationSecurityHostTop99p;
  }
  public UsageBillableSummaryKeys ciPipelineIndexedSpansSum(UsageBillableSummaryBody ciPipelineIndexedSpansSum) {
    this.ciPipelineIndexedSpansSum = ciPipelineIndexedSpansSum;
    this.unparsed |= ciPipelineIndexedSpansSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return ciPipelineIndexedSpansSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCiPipelineIndexedSpansSum() {
        return ciPipelineIndexedSpansSum;
      }
  public void setCiPipelineIndexedSpansSum(UsageBillableSummaryBody ciPipelineIndexedSpansSum) {
    this.ciPipelineIndexedSpansSum = ciPipelineIndexedSpansSum;
  }
  public UsageBillableSummaryKeys ciPipelineMaximum(UsageBillableSummaryBody ciPipelineMaximum) {
    this.ciPipelineMaximum = ciPipelineMaximum;
    this.unparsed |= ciPipelineMaximum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return ciPipelineMaximum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_PIPELINE_MAXIMUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCiPipelineMaximum() {
        return ciPipelineMaximum;
      }
  public void setCiPipelineMaximum(UsageBillableSummaryBody ciPipelineMaximum) {
    this.ciPipelineMaximum = ciPipelineMaximum;
  }
  public UsageBillableSummaryKeys ciPipelineSum(UsageBillableSummaryBody ciPipelineSum) {
    this.ciPipelineSum = ciPipelineSum;
    this.unparsed |= ciPipelineSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return ciPipelineSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_PIPELINE_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCiPipelineSum() {
        return ciPipelineSum;
      }
  public void setCiPipelineSum(UsageBillableSummaryBody ciPipelineSum) {
    this.ciPipelineSum = ciPipelineSum;
  }
  public UsageBillableSummaryKeys ciTestIndexedSpansSum(UsageBillableSummaryBody ciTestIndexedSpansSum) {
    this.ciTestIndexedSpansSum = ciTestIndexedSpansSum;
    this.unparsed |= ciTestIndexedSpansSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return ciTestIndexedSpansSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCiTestIndexedSpansSum() {
        return ciTestIndexedSpansSum;
      }
  public void setCiTestIndexedSpansSum(UsageBillableSummaryBody ciTestIndexedSpansSum) {
    this.ciTestIndexedSpansSum = ciTestIndexedSpansSum;
  }
  public UsageBillableSummaryKeys ciTestingMaximum(UsageBillableSummaryBody ciTestingMaximum) {
    this.ciTestingMaximum = ciTestingMaximum;
    this.unparsed |= ciTestingMaximum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return ciTestingMaximum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_TESTING_MAXIMUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCiTestingMaximum() {
        return ciTestingMaximum;
      }
  public void setCiTestingMaximum(UsageBillableSummaryBody ciTestingMaximum) {
    this.ciTestingMaximum = ciTestingMaximum;
  }
  public UsageBillableSummaryKeys ciTestingSum(UsageBillableSummaryBody ciTestingSum) {
    this.ciTestingSum = ciTestingSum;
    this.unparsed |= ciTestingSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return ciTestingSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_TESTING_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCiTestingSum() {
        return ciTestingSum;
      }
  public void setCiTestingSum(UsageBillableSummaryBody ciTestingSum) {
    this.ciTestingSum = ciTestingSum;
  }
  public UsageBillableSummaryKeys cloudCostManagementAverage(UsageBillableSummaryBody cloudCostManagementAverage) {
    this.cloudCostManagementAverage = cloudCostManagementAverage;
    this.unparsed |= cloudCostManagementAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return cloudCostManagementAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCloudCostManagementAverage() {
        return cloudCostManagementAverage;
      }
  public void setCloudCostManagementAverage(UsageBillableSummaryBody cloudCostManagementAverage) {
    this.cloudCostManagementAverage = cloudCostManagementAverage;
  }
  public UsageBillableSummaryKeys cloudCostManagementSum(UsageBillableSummaryBody cloudCostManagementSum) {
    this.cloudCostManagementSum = cloudCostManagementSum;
    this.unparsed |= cloudCostManagementSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return cloudCostManagementSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCloudCostManagementSum() {
        return cloudCostManagementSum;
      }
  public void setCloudCostManagementSum(UsageBillableSummaryBody cloudCostManagementSum) {
    this.cloudCostManagementSum = cloudCostManagementSum;
  }
  public UsageBillableSummaryKeys cspmContainerSum(UsageBillableSummaryBody cspmContainerSum) {
    this.cspmContainerSum = cspmContainerSum;
    this.unparsed |= cspmContainerSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return cspmContainerSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCspmContainerSum() {
        return cspmContainerSum;
      }
  public void setCspmContainerSum(UsageBillableSummaryBody cspmContainerSum) {
    this.cspmContainerSum = cspmContainerSum;
  }
  public UsageBillableSummaryKeys cspmHostSum(UsageBillableSummaryBody cspmHostSum) {
    this.cspmHostSum = cspmHostSum;
    this.unparsed |= cspmHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return cspmHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CSPM_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCspmHostSum() {
        return cspmHostSum;
      }
  public void setCspmHostSum(UsageBillableSummaryBody cspmHostSum) {
    this.cspmHostSum = cspmHostSum;
  }
  public UsageBillableSummaryKeys cspmHostTop99p(UsageBillableSummaryBody cspmHostTop99p) {
    this.cspmHostTop99p = cspmHostTop99p;
    this.unparsed |= cspmHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return cspmHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CSPM_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCspmHostTop99p() {
        return cspmHostTop99p;
      }
  public void setCspmHostTop99p(UsageBillableSummaryBody cspmHostTop99p) {
    this.cspmHostTop99p = cspmHostTop99p;
  }
  public UsageBillableSummaryKeys customEventSum(UsageBillableSummaryBody customEventSum) {
    this.customEventSum = customEventSum;
    this.unparsed |= customEventSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return customEventSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_EVENT_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCustomEventSum() {
        return customEventSum;
      }
  public void setCustomEventSum(UsageBillableSummaryBody customEventSum) {
    this.customEventSum = customEventSum;
  }
  public UsageBillableSummaryKeys cwsContainerSum(UsageBillableSummaryBody cwsContainerSum) {
    this.cwsContainerSum = cwsContainerSum;
    this.unparsed |= cwsContainerSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return cwsContainerSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCwsContainerSum() {
        return cwsContainerSum;
      }
  public void setCwsContainerSum(UsageBillableSummaryBody cwsContainerSum) {
    this.cwsContainerSum = cwsContainerSum;
  }
  public UsageBillableSummaryKeys cwsHostSum(UsageBillableSummaryBody cwsHostSum) {
    this.cwsHostSum = cwsHostSum;
    this.unparsed |= cwsHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return cwsHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CWS_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCwsHostSum() {
        return cwsHostSum;
      }
  public void setCwsHostSum(UsageBillableSummaryBody cwsHostSum) {
    this.cwsHostSum = cwsHostSum;
  }
  public UsageBillableSummaryKeys cwsHostTop99p(UsageBillableSummaryBody cwsHostTop99p) {
    this.cwsHostTop99p = cwsHostTop99p;
    this.unparsed |= cwsHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return cwsHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CWS_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getCwsHostTop99p() {
        return cwsHostTop99p;
      }
  public void setCwsHostTop99p(UsageBillableSummaryBody cwsHostTop99p) {
    this.cwsHostTop99p = cwsHostTop99p;
  }
  public UsageBillableSummaryKeys dbmHostSum(UsageBillableSummaryBody dbmHostSum) {
    this.dbmHostSum = dbmHostSum;
    this.unparsed |= dbmHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return dbmHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DBM_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getDbmHostSum() {
        return dbmHostSum;
      }
  public void setDbmHostSum(UsageBillableSummaryBody dbmHostSum) {
    this.dbmHostSum = dbmHostSum;
  }
  public UsageBillableSummaryKeys dbmHostTop99p(UsageBillableSummaryBody dbmHostTop99p) {
    this.dbmHostTop99p = dbmHostTop99p;
    this.unparsed |= dbmHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return dbmHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DBM_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getDbmHostTop99p() {
        return dbmHostTop99p;
      }
  public void setDbmHostTop99p(UsageBillableSummaryBody dbmHostTop99p) {
    this.dbmHostTop99p = dbmHostTop99p;
  }
  public UsageBillableSummaryKeys dbmNormalizedQueriesAverage(UsageBillableSummaryBody dbmNormalizedQueriesAverage) {
    this.dbmNormalizedQueriesAverage = dbmNormalizedQueriesAverage;
    this.unparsed |= dbmNormalizedQueriesAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return dbmNormalizedQueriesAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DBM_NORMALIZED_QUERIES_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getDbmNormalizedQueriesAverage() {
        return dbmNormalizedQueriesAverage;
      }
  public void setDbmNormalizedQueriesAverage(UsageBillableSummaryBody dbmNormalizedQueriesAverage) {
    this.dbmNormalizedQueriesAverage = dbmNormalizedQueriesAverage;
  }
  public UsageBillableSummaryKeys dbmNormalizedQueriesSum(UsageBillableSummaryBody dbmNormalizedQueriesSum) {
    this.dbmNormalizedQueriesSum = dbmNormalizedQueriesSum;
    this.unparsed |= dbmNormalizedQueriesSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return dbmNormalizedQueriesSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DBM_NORMALIZED_QUERIES_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getDbmNormalizedQueriesSum() {
        return dbmNormalizedQueriesSum;
      }
  public void setDbmNormalizedQueriesSum(UsageBillableSummaryBody dbmNormalizedQueriesSum) {
    this.dbmNormalizedQueriesSum = dbmNormalizedQueriesSum;
  }
  public UsageBillableSummaryKeys fargateContainerApmAndProfilerAverage(UsageBillableSummaryBody fargateContainerApmAndProfilerAverage) {
    this.fargateContainerApmAndProfilerAverage = fargateContainerApmAndProfilerAverage;
    this.unparsed |= fargateContainerApmAndProfilerAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return fargateContainerApmAndProfilerAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_APM_AND_PROFILER_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getFargateContainerApmAndProfilerAverage() {
        return fargateContainerApmAndProfilerAverage;
      }
  public void setFargateContainerApmAndProfilerAverage(UsageBillableSummaryBody fargateContainerApmAndProfilerAverage) {
    this.fargateContainerApmAndProfilerAverage = fargateContainerApmAndProfilerAverage;
  }
  public UsageBillableSummaryKeys fargateContainerApmAndProfilerSum(UsageBillableSummaryBody fargateContainerApmAndProfilerSum) {
    this.fargateContainerApmAndProfilerSum = fargateContainerApmAndProfilerSum;
    this.unparsed |= fargateContainerApmAndProfilerSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return fargateContainerApmAndProfilerSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_APM_AND_PROFILER_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getFargateContainerApmAndProfilerSum() {
        return fargateContainerApmAndProfilerSum;
      }
  public void setFargateContainerApmAndProfilerSum(UsageBillableSummaryBody fargateContainerApmAndProfilerSum) {
    this.fargateContainerApmAndProfilerSum = fargateContainerApmAndProfilerSum;
  }
  public UsageBillableSummaryKeys fargateContainerAverage(UsageBillableSummaryBody fargateContainerAverage) {
    this.fargateContainerAverage = fargateContainerAverage;
    this.unparsed |= fargateContainerAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return fargateContainerAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getFargateContainerAverage() {
        return fargateContainerAverage;
      }
  public void setFargateContainerAverage(UsageBillableSummaryBody fargateContainerAverage) {
    this.fargateContainerAverage = fargateContainerAverage;
  }
  public UsageBillableSummaryKeys fargateContainerProfilerAverage(UsageBillableSummaryBody fargateContainerProfilerAverage) {
    this.fargateContainerProfilerAverage = fargateContainerProfilerAverage;
    this.unparsed |= fargateContainerProfilerAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return fargateContainerProfilerAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getFargateContainerProfilerAverage() {
        return fargateContainerProfilerAverage;
      }
  public void setFargateContainerProfilerAverage(UsageBillableSummaryBody fargateContainerProfilerAverage) {
    this.fargateContainerProfilerAverage = fargateContainerProfilerAverage;
  }
  public UsageBillableSummaryKeys fargateContainerProfilerSum(UsageBillableSummaryBody fargateContainerProfilerSum) {
    this.fargateContainerProfilerSum = fargateContainerProfilerSum;
    this.unparsed |= fargateContainerProfilerSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return fargateContainerProfilerSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getFargateContainerProfilerSum() {
        return fargateContainerProfilerSum;
      }
  public void setFargateContainerProfilerSum(UsageBillableSummaryBody fargateContainerProfilerSum) {
    this.fargateContainerProfilerSum = fargateContainerProfilerSum;
  }
  public UsageBillableSummaryKeys fargateContainerSum(UsageBillableSummaryBody fargateContainerSum) {
    this.fargateContainerSum = fargateContainerSum;
    this.unparsed |= fargateContainerSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return fargateContainerSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getFargateContainerSum() {
        return fargateContainerSum;
      }
  public void setFargateContainerSum(UsageBillableSummaryBody fargateContainerSum) {
    this.fargateContainerSum = fargateContainerSum;
  }
  public UsageBillableSummaryKeys incidentManagementMaximum(UsageBillableSummaryBody incidentManagementMaximum) {
    this.incidentManagementMaximum = incidentManagementMaximum;
    this.unparsed |= incidentManagementMaximum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return incidentManagementMaximum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_MAXIMUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getIncidentManagementMaximum() {
        return incidentManagementMaximum;
      }
  public void setIncidentManagementMaximum(UsageBillableSummaryBody incidentManagementMaximum) {
    this.incidentManagementMaximum = incidentManagementMaximum;
  }
  public UsageBillableSummaryKeys incidentManagementSum(UsageBillableSummaryBody incidentManagementSum) {
    this.incidentManagementSum = incidentManagementSum;
    this.unparsed |= incidentManagementSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return incidentManagementSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getIncidentManagementSum() {
        return incidentManagementSum;
      }
  public void setIncidentManagementSum(UsageBillableSummaryBody incidentManagementSum) {
    this.incidentManagementSum = incidentManagementSum;
  }
  public UsageBillableSummaryKeys infraAndApmHostSum(UsageBillableSummaryBody infraAndApmHostSum) {
    this.infraAndApmHostSum = infraAndApmHostSum;
    this.unparsed |= infraAndApmHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return infraAndApmHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INFRA_AND_APM_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getInfraAndApmHostSum() {
        return infraAndApmHostSum;
      }
  public void setInfraAndApmHostSum(UsageBillableSummaryBody infraAndApmHostSum) {
    this.infraAndApmHostSum = infraAndApmHostSum;
  }
  public UsageBillableSummaryKeys infraAndApmHostTop99p(UsageBillableSummaryBody infraAndApmHostTop99p) {
    this.infraAndApmHostTop99p = infraAndApmHostTop99p;
    this.unparsed |= infraAndApmHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return infraAndApmHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INFRA_AND_APM_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getInfraAndApmHostTop99p() {
        return infraAndApmHostTop99p;
      }
  public void setInfraAndApmHostTop99p(UsageBillableSummaryBody infraAndApmHostTop99p) {
    this.infraAndApmHostTop99p = infraAndApmHostTop99p;
  }
  public UsageBillableSummaryKeys infraContainerSum(UsageBillableSummaryBody infraContainerSum) {
    this.infraContainerSum = infraContainerSum;
    this.unparsed |= infraContainerSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return infraContainerSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INFRA_CONTAINER_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getInfraContainerSum() {
        return infraContainerSum;
      }
  public void setInfraContainerSum(UsageBillableSummaryBody infraContainerSum) {
    this.infraContainerSum = infraContainerSum;
  }
  public UsageBillableSummaryKeys infraHostSum(UsageBillableSummaryBody infraHostSum) {
    this.infraHostSum = infraHostSum;
    this.unparsed |= infraHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return infraHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INFRA_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getInfraHostSum() {
        return infraHostSum;
      }
  public void setInfraHostSum(UsageBillableSummaryBody infraHostSum) {
    this.infraHostSum = infraHostSum;
  }
  public UsageBillableSummaryKeys infraHostTop99p(UsageBillableSummaryBody infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
    this.unparsed |= infraHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return infraHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INFRA_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getInfraHostTop99p() {
        return infraHostTop99p;
      }
  public void setInfraHostTop99p(UsageBillableSummaryBody infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
  }
  public UsageBillableSummaryKeys ingestedSpansSum(UsageBillableSummaryBody ingestedSpansSum) {
    this.ingestedSpansSum = ingestedSpansSum;
    this.unparsed |= ingestedSpansSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return ingestedSpansSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INGESTED_SPANS_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getIngestedSpansSum() {
        return ingestedSpansSum;
      }
  public void setIngestedSpansSum(UsageBillableSummaryBody ingestedSpansSum) {
    this.ingestedSpansSum = ingestedSpansSum;
  }
  public UsageBillableSummaryKeys ingestedTimeseriesAverage(UsageBillableSummaryBody ingestedTimeseriesAverage) {
    this.ingestedTimeseriesAverage = ingestedTimeseriesAverage;
    this.unparsed |= ingestedTimeseriesAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return ingestedTimeseriesAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INGESTED_TIMESERIES_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getIngestedTimeseriesAverage() {
        return ingestedTimeseriesAverage;
      }
  public void setIngestedTimeseriesAverage(UsageBillableSummaryBody ingestedTimeseriesAverage) {
    this.ingestedTimeseriesAverage = ingestedTimeseriesAverage;
  }
  public UsageBillableSummaryKeys ingestedTimeseriesSum(UsageBillableSummaryBody ingestedTimeseriesSum) {
    this.ingestedTimeseriesSum = ingestedTimeseriesSum;
    this.unparsed |= ingestedTimeseriesSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return ingestedTimeseriesSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INGESTED_TIMESERIES_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getIngestedTimeseriesSum() {
        return ingestedTimeseriesSum;
      }
  public void setIngestedTimeseriesSum(UsageBillableSummaryBody ingestedTimeseriesSum) {
    this.ingestedTimeseriesSum = ingestedTimeseriesSum;
  }
  public UsageBillableSummaryKeys iotSum(UsageBillableSummaryBody iotSum) {
    this.iotSum = iotSum;
    this.unparsed |= iotSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return iotSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IOT_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getIotSum() {
        return iotSum;
      }
  public void setIotSum(UsageBillableSummaryBody iotSum) {
    this.iotSum = iotSum;
  }
  public UsageBillableSummaryKeys iotTop99p(UsageBillableSummaryBody iotTop99p) {
    this.iotTop99p = iotTop99p;
    this.unparsed |= iotTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return iotTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IOT_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getIotTop99p() {
        return iotTop99p;
      }
  public void setIotTop99p(UsageBillableSummaryBody iotTop99p) {
    this.iotTop99p = iotTop99p;
  }
  public UsageBillableSummaryKeys lambdaFunctionAverage(UsageBillableSummaryBody lambdaFunctionAverage) {
    this.lambdaFunctionAverage = lambdaFunctionAverage;
    this.unparsed |= lambdaFunctionAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return lambdaFunctionAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTION_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLambdaFunctionAverage() {
        return lambdaFunctionAverage;
      }
  public void setLambdaFunctionAverage(UsageBillableSummaryBody lambdaFunctionAverage) {
    this.lambdaFunctionAverage = lambdaFunctionAverage;
  }
  public UsageBillableSummaryKeys lambdaFunctionSum(UsageBillableSummaryBody lambdaFunctionSum) {
    this.lambdaFunctionSum = lambdaFunctionSum;
    this.unparsed |= lambdaFunctionSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return lambdaFunctionSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTION_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLambdaFunctionSum() {
        return lambdaFunctionSum;
      }
  public void setLambdaFunctionSum(UsageBillableSummaryBody lambdaFunctionSum) {
    this.lambdaFunctionSum = lambdaFunctionSum;
  }
  public UsageBillableSummaryKeys logsForwardingSum(UsageBillableSummaryBody logsForwardingSum) {
    this.logsForwardingSum = logsForwardingSum;
    this.unparsed |= logsForwardingSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsForwardingSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_FORWARDING_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsForwardingSum() {
        return logsForwardingSum;
      }
  public void setLogsForwardingSum(UsageBillableSummaryBody logsForwardingSum) {
    this.logsForwardingSum = logsForwardingSum;
  }
  public UsageBillableSummaryKeys logsIndexed15daySum(UsageBillableSummaryBody logsIndexed15daySum) {
    this.logsIndexed15daySum = logsIndexed15daySum;
    this.unparsed |= logsIndexed15daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed15daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED15DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed15daySum() {
        return logsIndexed15daySum;
      }
  public void setLogsIndexed15daySum(UsageBillableSummaryBody logsIndexed15daySum) {
    this.logsIndexed15daySum = logsIndexed15daySum;
  }
  public UsageBillableSummaryKeys logsIndexed180daySum(UsageBillableSummaryBody logsIndexed180daySum) {
    this.logsIndexed180daySum = logsIndexed180daySum;
    this.unparsed |= logsIndexed180daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed180daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED180DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed180daySum() {
        return logsIndexed180daySum;
      }
  public void setLogsIndexed180daySum(UsageBillableSummaryBody logsIndexed180daySum) {
    this.logsIndexed180daySum = logsIndexed180daySum;
  }
  public UsageBillableSummaryKeys logsIndexed1daySum(UsageBillableSummaryBody logsIndexed1daySum) {
    this.logsIndexed1daySum = logsIndexed1daySum;
    this.unparsed |= logsIndexed1daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed1daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_1DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed1daySum() {
        return logsIndexed1daySum;
      }
  public void setLogsIndexed1daySum(UsageBillableSummaryBody logsIndexed1daySum) {
    this.logsIndexed1daySum = logsIndexed1daySum;
  }
  public UsageBillableSummaryKeys logsIndexed30daySum(UsageBillableSummaryBody logsIndexed30daySum) {
    this.logsIndexed30daySum = logsIndexed30daySum;
    this.unparsed |= logsIndexed30daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed30daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED30DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed30daySum() {
        return logsIndexed30daySum;
      }
  public void setLogsIndexed30daySum(UsageBillableSummaryBody logsIndexed30daySum) {
    this.logsIndexed30daySum = logsIndexed30daySum;
  }
  public UsageBillableSummaryKeys logsIndexed360daySum(UsageBillableSummaryBody logsIndexed360daySum) {
    this.logsIndexed360daySum = logsIndexed360daySum;
    this.unparsed |= logsIndexed360daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed360daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_360DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed360daySum() {
        return logsIndexed360daySum;
      }
  public void setLogsIndexed360daySum(UsageBillableSummaryBody logsIndexed360daySum) {
    this.logsIndexed360daySum = logsIndexed360daySum;
  }
  public UsageBillableSummaryKeys logsIndexed3daySum(UsageBillableSummaryBody logsIndexed3daySum) {
    this.logsIndexed3daySum = logsIndexed3daySum;
    this.unparsed |= logsIndexed3daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed3daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED3DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed3daySum() {
        return logsIndexed3daySum;
      }
  public void setLogsIndexed3daySum(UsageBillableSummaryBody logsIndexed3daySum) {
    this.logsIndexed3daySum = logsIndexed3daySum;
  }
  public UsageBillableSummaryKeys logsIndexed45daySum(UsageBillableSummaryBody logsIndexed45daySum) {
    this.logsIndexed45daySum = logsIndexed45daySum;
    this.unparsed |= logsIndexed45daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed45daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED45DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed45daySum() {
        return logsIndexed45daySum;
      }
  public void setLogsIndexed45daySum(UsageBillableSummaryBody logsIndexed45daySum) {
    this.logsIndexed45daySum = logsIndexed45daySum;
  }
  public UsageBillableSummaryKeys logsIndexed60daySum(UsageBillableSummaryBody logsIndexed60daySum) {
    this.logsIndexed60daySum = logsIndexed60daySum;
    this.unparsed |= logsIndexed60daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed60daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED60DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed60daySum() {
        return logsIndexed60daySum;
      }
  public void setLogsIndexed60daySum(UsageBillableSummaryBody logsIndexed60daySum) {
    this.logsIndexed60daySum = logsIndexed60daySum;
  }
  public UsageBillableSummaryKeys logsIndexed7daySum(UsageBillableSummaryBody logsIndexed7daySum) {
    this.logsIndexed7daySum = logsIndexed7daySum;
    this.unparsed |= logsIndexed7daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed7daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED7DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed7daySum() {
        return logsIndexed7daySum;
      }
  public void setLogsIndexed7daySum(UsageBillableSummaryBody logsIndexed7daySum) {
    this.logsIndexed7daySum = logsIndexed7daySum;
  }
  public UsageBillableSummaryKeys logsIndexed90daySum(UsageBillableSummaryBody logsIndexed90daySum) {
    this.logsIndexed90daySum = logsIndexed90daySum;
    this.unparsed |= logsIndexed90daySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexed90daySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED90DAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexed90daySum() {
        return logsIndexed90daySum;
      }
  public void setLogsIndexed90daySum(UsageBillableSummaryBody logsIndexed90daySum) {
    this.logsIndexed90daySum = logsIndexed90daySum;
  }
  public UsageBillableSummaryKeys logsIndexedCustomRetentionSum(UsageBillableSummaryBody logsIndexedCustomRetentionSum) {
    this.logsIndexedCustomRetentionSum = logsIndexedCustomRetentionSum;
    this.unparsed |= logsIndexedCustomRetentionSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexedCustomRetentionSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexedCustomRetentionSum() {
        return logsIndexedCustomRetentionSum;
      }
  public void setLogsIndexedCustomRetentionSum(UsageBillableSummaryBody logsIndexedCustomRetentionSum) {
    this.logsIndexedCustomRetentionSum = logsIndexedCustomRetentionSum;
  }
  public UsageBillableSummaryKeys logsIndexedSum(UsageBillableSummaryBody logsIndexedSum) {
    this.logsIndexedSum = logsIndexedSum;
    this.unparsed |= logsIndexedSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIndexedSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIndexedSum() {
        return logsIndexedSum;
      }
  public void setLogsIndexedSum(UsageBillableSummaryBody logsIndexedSum) {
    this.logsIndexedSum = logsIndexedSum;
  }
  public UsageBillableSummaryKeys logsIngestedSum(UsageBillableSummaryBody logsIngestedSum) {
    this.logsIngestedSum = logsIngestedSum;
    this.unparsed |= logsIngestedSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return logsIngestedSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INGESTED_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getLogsIngestedSum() {
        return logsIngestedSum;
      }
  public void setLogsIngestedSum(UsageBillableSummaryBody logsIngestedSum) {
    this.logsIngestedSum = logsIngestedSum;
  }
  public UsageBillableSummaryKeys networkDeviceSum(UsageBillableSummaryBody networkDeviceSum) {
    this.networkDeviceSum = networkDeviceSum;
    this.unparsed |= networkDeviceSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return networkDeviceSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NETWORK_DEVICE_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getNetworkDeviceSum() {
        return networkDeviceSum;
      }
  public void setNetworkDeviceSum(UsageBillableSummaryBody networkDeviceSum) {
    this.networkDeviceSum = networkDeviceSum;
  }
  public UsageBillableSummaryKeys networkDeviceTop99p(UsageBillableSummaryBody networkDeviceTop99p) {
    this.networkDeviceTop99p = networkDeviceTop99p;
    this.unparsed |= networkDeviceTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return networkDeviceTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NETWORK_DEVICE_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getNetworkDeviceTop99p() {
        return networkDeviceTop99p;
      }
  public void setNetworkDeviceTop99p(UsageBillableSummaryBody networkDeviceTop99p) {
    this.networkDeviceTop99p = networkDeviceTop99p;
  }
  public UsageBillableSummaryKeys npmFlowSum(UsageBillableSummaryBody npmFlowSum) {
    this.npmFlowSum = npmFlowSum;
    this.unparsed |= npmFlowSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return npmFlowSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NPM_FLOW_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getNpmFlowSum() {
        return npmFlowSum;
      }
  public void setNpmFlowSum(UsageBillableSummaryBody npmFlowSum) {
    this.npmFlowSum = npmFlowSum;
  }
  public UsageBillableSummaryKeys npmHostSum(UsageBillableSummaryBody npmHostSum) {
    this.npmHostSum = npmHostSum;
    this.unparsed |= npmHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return npmHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NPM_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getNpmHostSum() {
        return npmHostSum;
      }
  public void setNpmHostSum(UsageBillableSummaryBody npmHostSum) {
    this.npmHostSum = npmHostSum;
  }
  public UsageBillableSummaryKeys npmHostTop99p(UsageBillableSummaryBody npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
    this.unparsed |= npmHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return npmHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NPM_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getNpmHostTop99p() {
        return npmHostTop99p;
      }
  public void setNpmHostTop99p(UsageBillableSummaryBody npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
  }
  public UsageBillableSummaryKeys observabilityPipelineSum(UsageBillableSummaryBody observabilityPipelineSum) {
    this.observabilityPipelineSum = observabilityPipelineSum;
    this.unparsed |= observabilityPipelineSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return observabilityPipelineSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OBSERVABILITY_PIPELINE_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getObservabilityPipelineSum() {
        return observabilityPipelineSum;
      }
  public void setObservabilityPipelineSum(UsageBillableSummaryBody observabilityPipelineSum) {
    this.observabilityPipelineSum = observabilityPipelineSum;
  }
  public UsageBillableSummaryKeys onlineArchiveSum(UsageBillableSummaryBody onlineArchiveSum) {
    this.onlineArchiveSum = onlineArchiveSum;
    this.unparsed |= onlineArchiveSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return onlineArchiveSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ONLINE_ARCHIVE_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getOnlineArchiveSum() {
        return onlineArchiveSum;
      }
  public void setOnlineArchiveSum(UsageBillableSummaryBody onlineArchiveSum) {
    this.onlineArchiveSum = onlineArchiveSum;
  }
  public UsageBillableSummaryKeys profContainerSum(UsageBillableSummaryBody profContainerSum) {
    this.profContainerSum = profContainerSum;
    this.unparsed |= profContainerSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return profContainerSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROF_CONTAINER_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getProfContainerSum() {
        return profContainerSum;
      }
  public void setProfContainerSum(UsageBillableSummaryBody profContainerSum) {
    this.profContainerSum = profContainerSum;
  }
  public UsageBillableSummaryKeys profHostSum(UsageBillableSummaryBody profHostSum) {
    this.profHostSum = profHostSum;
    this.unparsed |= profHostSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return profHostSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROF_HOST_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getProfHostSum() {
        return profHostSum;
      }
  public void setProfHostSum(UsageBillableSummaryBody profHostSum) {
    this.profHostSum = profHostSum;
  }
  public UsageBillableSummaryKeys profHostTop99p(UsageBillableSummaryBody profHostTop99p) {
    this.profHostTop99p = profHostTop99p;
    this.unparsed |= profHostTop99p.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return profHostTop99p
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROF_HOST_TOP99P)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getProfHostTop99p() {
        return profHostTop99p;
      }
  public void setProfHostTop99p(UsageBillableSummaryBody profHostTop99p) {
    this.profHostTop99p = profHostTop99p;
  }
  public UsageBillableSummaryKeys rumLiteSum(UsageBillableSummaryBody rumLiteSum) {
    this.rumLiteSum = rumLiteSum;
    this.unparsed |= rumLiteSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return rumLiteSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RUM_LITE_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getRumLiteSum() {
        return rumLiteSum;
      }
  public void setRumLiteSum(UsageBillableSummaryBody rumLiteSum) {
    this.rumLiteSum = rumLiteSum;
  }
  public UsageBillableSummaryKeys rumReplaySum(UsageBillableSummaryBody rumReplaySum) {
    this.rumReplaySum = rumReplaySum;
    this.unparsed |= rumReplaySum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return rumReplaySum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RUM_REPLAY_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getRumReplaySum() {
        return rumReplaySum;
      }
  public void setRumReplaySum(UsageBillableSummaryBody rumReplaySum) {
    this.rumReplaySum = rumReplaySum;
  }
  public UsageBillableSummaryKeys rumSum(UsageBillableSummaryBody rumSum) {
    this.rumSum = rumSum;
    this.unparsed |= rumSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return rumSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RUM_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getRumSum() {
        return rumSum;
      }
  public void setRumSum(UsageBillableSummaryBody rumSum) {
    this.rumSum = rumSum;
  }
  public UsageBillableSummaryKeys rumUnitsSum(UsageBillableSummaryBody rumUnitsSum) {
    this.rumUnitsSum = rumUnitsSum;
    this.unparsed |= rumUnitsSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return rumUnitsSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RUM_UNITS_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getRumUnitsSum() {
        return rumUnitsSum;
      }
  public void setRumUnitsSum(UsageBillableSummaryBody rumUnitsSum) {
    this.rumUnitsSum = rumUnitsSum;
  }
  public UsageBillableSummaryKeys sensitiveDataScannerSum(UsageBillableSummaryBody sensitiveDataScannerSum) {
    this.sensitiveDataScannerSum = sensitiveDataScannerSum;
    this.unparsed |= sensitiveDataScannerSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return sensitiveDataScannerSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SENSITIVE_DATA_SCANNER_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getSensitiveDataScannerSum() {
        return sensitiveDataScannerSum;
      }
  public void setSensitiveDataScannerSum(UsageBillableSummaryBody sensitiveDataScannerSum) {
    this.sensitiveDataScannerSum = sensitiveDataScannerSum;
  }
  public UsageBillableSummaryKeys serverlessApmSum(UsageBillableSummaryBody serverlessApmSum) {
    this.serverlessApmSum = serverlessApmSum;
    this.unparsed |= serverlessApmSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return serverlessApmSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVERLESS_APM_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getServerlessApmSum() {
        return serverlessApmSum;
      }
  public void setServerlessApmSum(UsageBillableSummaryBody serverlessApmSum) {
    this.serverlessApmSum = serverlessApmSum;
  }
  public UsageBillableSummaryKeys serverlessInfraAverage(UsageBillableSummaryBody serverlessInfraAverage) {
    this.serverlessInfraAverage = serverlessInfraAverage;
    this.unparsed |= serverlessInfraAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return serverlessInfraAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVERLESS_INFRA_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getServerlessInfraAverage() {
        return serverlessInfraAverage;
      }
  public void setServerlessInfraAverage(UsageBillableSummaryBody serverlessInfraAverage) {
    this.serverlessInfraAverage = serverlessInfraAverage;
  }
  public UsageBillableSummaryKeys serverlessInfraSum(UsageBillableSummaryBody serverlessInfraSum) {
    this.serverlessInfraSum = serverlessInfraSum;
    this.unparsed |= serverlessInfraSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return serverlessInfraSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVERLESS_INFRA_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getServerlessInfraSum() {
        return serverlessInfraSum;
      }
  public void setServerlessInfraSum(UsageBillableSummaryBody serverlessInfraSum) {
    this.serverlessInfraSum = serverlessInfraSum;
  }
  public UsageBillableSummaryKeys serverlessInvocationSum(UsageBillableSummaryBody serverlessInvocationSum) {
    this.serverlessInvocationSum = serverlessInvocationSum;
    this.unparsed |= serverlessInvocationSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return serverlessInvocationSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVERLESS_INVOCATION_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getServerlessInvocationSum() {
        return serverlessInvocationSum;
      }
  public void setServerlessInvocationSum(UsageBillableSummaryBody serverlessInvocationSum) {
    this.serverlessInvocationSum = serverlessInvocationSum;
  }
  public UsageBillableSummaryKeys siemSum(UsageBillableSummaryBody siemSum) {
    this.siemSum = siemSum;
    this.unparsed |= siemSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return siemSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIEM_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getSiemSum() {
        return siemSum;
      }
  public void setSiemSum(UsageBillableSummaryBody siemSum) {
    this.siemSum = siemSum;
  }
  public UsageBillableSummaryKeys standardTimeseriesAverage(UsageBillableSummaryBody standardTimeseriesAverage) {
    this.standardTimeseriesAverage = standardTimeseriesAverage;
    this.unparsed |= standardTimeseriesAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return standardTimeseriesAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STANDARD_TIMESERIES_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getStandardTimeseriesAverage() {
        return standardTimeseriesAverage;
      }
  public void setStandardTimeseriesAverage(UsageBillableSummaryBody standardTimeseriesAverage) {
    this.standardTimeseriesAverage = standardTimeseriesAverage;
  }
  public UsageBillableSummaryKeys syntheticsApiTestsSum(UsageBillableSummaryBody syntheticsApiTestsSum) {
    this.syntheticsApiTestsSum = syntheticsApiTestsSum;
    this.unparsed |= syntheticsApiTestsSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return syntheticsApiTestsSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SYNTHETICS_API_TESTS_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getSyntheticsApiTestsSum() {
        return syntheticsApiTestsSum;
      }
  public void setSyntheticsApiTestsSum(UsageBillableSummaryBody syntheticsApiTestsSum) {
    this.syntheticsApiTestsSum = syntheticsApiTestsSum;
  }
  public UsageBillableSummaryKeys syntheticsAppTestingMaximum(UsageBillableSummaryBody syntheticsAppTestingMaximum) {
    this.syntheticsAppTestingMaximum = syntheticsAppTestingMaximum;
    this.unparsed |= syntheticsAppTestingMaximum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return syntheticsAppTestingMaximum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SYNTHETICS_APP_TESTING_MAXIMUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getSyntheticsAppTestingMaximum() {
        return syntheticsAppTestingMaximum;
      }
  public void setSyntheticsAppTestingMaximum(UsageBillableSummaryBody syntheticsAppTestingMaximum) {
    this.syntheticsAppTestingMaximum = syntheticsAppTestingMaximum;
  }
  public UsageBillableSummaryKeys syntheticsBrowserChecksSum(UsageBillableSummaryBody syntheticsBrowserChecksSum) {
    this.syntheticsBrowserChecksSum = syntheticsBrowserChecksSum;
    this.unparsed |= syntheticsBrowserChecksSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return syntheticsBrowserChecksSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SYNTHETICS_BROWSER_CHECKS_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getSyntheticsBrowserChecksSum() {
        return syntheticsBrowserChecksSum;
      }
  public void setSyntheticsBrowserChecksSum(UsageBillableSummaryBody syntheticsBrowserChecksSum) {
    this.syntheticsBrowserChecksSum = syntheticsBrowserChecksSum;
  }
  public UsageBillableSummaryKeys timeseriesAverage(UsageBillableSummaryBody timeseriesAverage) {
    this.timeseriesAverage = timeseriesAverage;
    this.unparsed |= timeseriesAverage.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return timeseriesAverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESERIES_AVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getTimeseriesAverage() {
        return timeseriesAverage;
      }
  public void setTimeseriesAverage(UsageBillableSummaryBody timeseriesAverage) {
    this.timeseriesAverage = timeseriesAverage;
  }
  public UsageBillableSummaryKeys timeseriesSum(UsageBillableSummaryBody timeseriesSum) {
    this.timeseriesSum = timeseriesSum;
    this.unparsed |= timeseriesSum.unparsed;
    return this;
  }

  /**
   * <p>Response with properties for each aggregated usage type.</p>
   * @return timeseriesSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESERIES_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryBody getTimeseriesSum() {
        return timeseriesSum;
      }
  public void setTimeseriesSum(UsageBillableSummaryBody timeseriesSum) {
    this.timeseriesSum = timeseriesSum;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return UsageBillableSummaryKeys
   */
  @JsonAnySetter
  public UsageBillableSummaryKeys putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this UsageBillableSummaryKeys object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageBillableSummaryKeys usageBillableSummaryKeys = (UsageBillableSummaryKeys) o;
    return Objects.equals(this.apmFargateAverage, usageBillableSummaryKeys.apmFargateAverage) && Objects.equals(this.apmFargateSum, usageBillableSummaryKeys.apmFargateSum) && Objects.equals(this.apmHostSum, usageBillableSummaryKeys.apmHostSum) && Objects.equals(this.apmHostTop99p, usageBillableSummaryKeys.apmHostTop99p) && Objects.equals(this.apmProfilerHostSum, usageBillableSummaryKeys.apmProfilerHostSum) && Objects.equals(this.apmProfilerHostTop99p, usageBillableSummaryKeys.apmProfilerHostTop99p) && Objects.equals(this.apmTraceSearchSum, usageBillableSummaryKeys.apmTraceSearchSum) && Objects.equals(this.applicationSecurityFargateAverage, usageBillableSummaryKeys.applicationSecurityFargateAverage) && Objects.equals(this.applicationSecurityHostSum, usageBillableSummaryKeys.applicationSecurityHostSum) && Objects.equals(this.applicationSecurityHostTop99p, usageBillableSummaryKeys.applicationSecurityHostTop99p) && Objects.equals(this.ciPipelineIndexedSpansSum, usageBillableSummaryKeys.ciPipelineIndexedSpansSum) && Objects.equals(this.ciPipelineMaximum, usageBillableSummaryKeys.ciPipelineMaximum) && Objects.equals(this.ciPipelineSum, usageBillableSummaryKeys.ciPipelineSum) && Objects.equals(this.ciTestIndexedSpansSum, usageBillableSummaryKeys.ciTestIndexedSpansSum) && Objects.equals(this.ciTestingMaximum, usageBillableSummaryKeys.ciTestingMaximum) && Objects.equals(this.ciTestingSum, usageBillableSummaryKeys.ciTestingSum) && Objects.equals(this.cloudCostManagementAverage, usageBillableSummaryKeys.cloudCostManagementAverage) && Objects.equals(this.cloudCostManagementSum, usageBillableSummaryKeys.cloudCostManagementSum) && Objects.equals(this.cspmContainerSum, usageBillableSummaryKeys.cspmContainerSum) && Objects.equals(this.cspmHostSum, usageBillableSummaryKeys.cspmHostSum) && Objects.equals(this.cspmHostTop99p, usageBillableSummaryKeys.cspmHostTop99p) && Objects.equals(this.customEventSum, usageBillableSummaryKeys.customEventSum) && Objects.equals(this.cwsContainerSum, usageBillableSummaryKeys.cwsContainerSum) && Objects.equals(this.cwsHostSum, usageBillableSummaryKeys.cwsHostSum) && Objects.equals(this.cwsHostTop99p, usageBillableSummaryKeys.cwsHostTop99p) && Objects.equals(this.dbmHostSum, usageBillableSummaryKeys.dbmHostSum) && Objects.equals(this.dbmHostTop99p, usageBillableSummaryKeys.dbmHostTop99p) && Objects.equals(this.dbmNormalizedQueriesAverage, usageBillableSummaryKeys.dbmNormalizedQueriesAverage) && Objects.equals(this.dbmNormalizedQueriesSum, usageBillableSummaryKeys.dbmNormalizedQueriesSum) && Objects.equals(this.fargateContainerApmAndProfilerAverage, usageBillableSummaryKeys.fargateContainerApmAndProfilerAverage) && Objects.equals(this.fargateContainerApmAndProfilerSum, usageBillableSummaryKeys.fargateContainerApmAndProfilerSum) && Objects.equals(this.fargateContainerAverage, usageBillableSummaryKeys.fargateContainerAverage) && Objects.equals(this.fargateContainerProfilerAverage, usageBillableSummaryKeys.fargateContainerProfilerAverage) && Objects.equals(this.fargateContainerProfilerSum, usageBillableSummaryKeys.fargateContainerProfilerSum) && Objects.equals(this.fargateContainerSum, usageBillableSummaryKeys.fargateContainerSum) && Objects.equals(this.incidentManagementMaximum, usageBillableSummaryKeys.incidentManagementMaximum) && Objects.equals(this.incidentManagementSum, usageBillableSummaryKeys.incidentManagementSum) && Objects.equals(this.infraAndApmHostSum, usageBillableSummaryKeys.infraAndApmHostSum) && Objects.equals(this.infraAndApmHostTop99p, usageBillableSummaryKeys.infraAndApmHostTop99p) && Objects.equals(this.infraContainerSum, usageBillableSummaryKeys.infraContainerSum) && Objects.equals(this.infraHostSum, usageBillableSummaryKeys.infraHostSum) && Objects.equals(this.infraHostTop99p, usageBillableSummaryKeys.infraHostTop99p) && Objects.equals(this.ingestedSpansSum, usageBillableSummaryKeys.ingestedSpansSum) && Objects.equals(this.ingestedTimeseriesAverage, usageBillableSummaryKeys.ingestedTimeseriesAverage) && Objects.equals(this.ingestedTimeseriesSum, usageBillableSummaryKeys.ingestedTimeseriesSum) && Objects.equals(this.iotSum, usageBillableSummaryKeys.iotSum) && Objects.equals(this.iotTop99p, usageBillableSummaryKeys.iotTop99p) && Objects.equals(this.lambdaFunctionAverage, usageBillableSummaryKeys.lambdaFunctionAverage) && Objects.equals(this.lambdaFunctionSum, usageBillableSummaryKeys.lambdaFunctionSum) && Objects.equals(this.logsForwardingSum, usageBillableSummaryKeys.logsForwardingSum) && Objects.equals(this.logsIndexed15daySum, usageBillableSummaryKeys.logsIndexed15daySum) && Objects.equals(this.logsIndexed180daySum, usageBillableSummaryKeys.logsIndexed180daySum) && Objects.equals(this.logsIndexed1daySum, usageBillableSummaryKeys.logsIndexed1daySum) && Objects.equals(this.logsIndexed30daySum, usageBillableSummaryKeys.logsIndexed30daySum) && Objects.equals(this.logsIndexed360daySum, usageBillableSummaryKeys.logsIndexed360daySum) && Objects.equals(this.logsIndexed3daySum, usageBillableSummaryKeys.logsIndexed3daySum) && Objects.equals(this.logsIndexed45daySum, usageBillableSummaryKeys.logsIndexed45daySum) && Objects.equals(this.logsIndexed60daySum, usageBillableSummaryKeys.logsIndexed60daySum) && Objects.equals(this.logsIndexed7daySum, usageBillableSummaryKeys.logsIndexed7daySum) && Objects.equals(this.logsIndexed90daySum, usageBillableSummaryKeys.logsIndexed90daySum) && Objects.equals(this.logsIndexedCustomRetentionSum, usageBillableSummaryKeys.logsIndexedCustomRetentionSum) && Objects.equals(this.logsIndexedSum, usageBillableSummaryKeys.logsIndexedSum) && Objects.equals(this.logsIngestedSum, usageBillableSummaryKeys.logsIngestedSum) && Objects.equals(this.networkDeviceSum, usageBillableSummaryKeys.networkDeviceSum) && Objects.equals(this.networkDeviceTop99p, usageBillableSummaryKeys.networkDeviceTop99p) && Objects.equals(this.npmFlowSum, usageBillableSummaryKeys.npmFlowSum) && Objects.equals(this.npmHostSum, usageBillableSummaryKeys.npmHostSum) && Objects.equals(this.npmHostTop99p, usageBillableSummaryKeys.npmHostTop99p) && Objects.equals(this.observabilityPipelineSum, usageBillableSummaryKeys.observabilityPipelineSum) && Objects.equals(this.onlineArchiveSum, usageBillableSummaryKeys.onlineArchiveSum) && Objects.equals(this.profContainerSum, usageBillableSummaryKeys.profContainerSum) && Objects.equals(this.profHostSum, usageBillableSummaryKeys.profHostSum) && Objects.equals(this.profHostTop99p, usageBillableSummaryKeys.profHostTop99p) && Objects.equals(this.rumLiteSum, usageBillableSummaryKeys.rumLiteSum) && Objects.equals(this.rumReplaySum, usageBillableSummaryKeys.rumReplaySum) && Objects.equals(this.rumSum, usageBillableSummaryKeys.rumSum) && Objects.equals(this.rumUnitsSum, usageBillableSummaryKeys.rumUnitsSum) && Objects.equals(this.sensitiveDataScannerSum, usageBillableSummaryKeys.sensitiveDataScannerSum) && Objects.equals(this.serverlessApmSum, usageBillableSummaryKeys.serverlessApmSum) && Objects.equals(this.serverlessInfraAverage, usageBillableSummaryKeys.serverlessInfraAverage) && Objects.equals(this.serverlessInfraSum, usageBillableSummaryKeys.serverlessInfraSum) && Objects.equals(this.serverlessInvocationSum, usageBillableSummaryKeys.serverlessInvocationSum) && Objects.equals(this.siemSum, usageBillableSummaryKeys.siemSum) && Objects.equals(this.standardTimeseriesAverage, usageBillableSummaryKeys.standardTimeseriesAverage) && Objects.equals(this.syntheticsApiTestsSum, usageBillableSummaryKeys.syntheticsApiTestsSum) && Objects.equals(this.syntheticsAppTestingMaximum, usageBillableSummaryKeys.syntheticsAppTestingMaximum) && Objects.equals(this.syntheticsBrowserChecksSum, usageBillableSummaryKeys.syntheticsBrowserChecksSum) && Objects.equals(this.timeseriesAverage, usageBillableSummaryKeys.timeseriesAverage) && Objects.equals(this.timeseriesSum, usageBillableSummaryKeys.timeseriesSum) && Objects.equals(this.additionalProperties, usageBillableSummaryKeys.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apmFargateAverage,apmFargateSum,apmHostSum,apmHostTop99p,apmProfilerHostSum,apmProfilerHostTop99p,apmTraceSearchSum,applicationSecurityFargateAverage,applicationSecurityHostSum,applicationSecurityHostTop99p,ciPipelineIndexedSpansSum,ciPipelineMaximum,ciPipelineSum,ciTestIndexedSpansSum,ciTestingMaximum,ciTestingSum,cloudCostManagementAverage,cloudCostManagementSum,cspmContainerSum,cspmHostSum,cspmHostTop99p,customEventSum,cwsContainerSum,cwsHostSum,cwsHostTop99p,dbmHostSum,dbmHostTop99p,dbmNormalizedQueriesAverage,dbmNormalizedQueriesSum,fargateContainerApmAndProfilerAverage,fargateContainerApmAndProfilerSum,fargateContainerAverage,fargateContainerProfilerAverage,fargateContainerProfilerSum,fargateContainerSum,incidentManagementMaximum,incidentManagementSum,infraAndApmHostSum,infraAndApmHostTop99p,infraContainerSum,infraHostSum,infraHostTop99p,ingestedSpansSum,ingestedTimeseriesAverage,ingestedTimeseriesSum,iotSum,iotTop99p,lambdaFunctionAverage,lambdaFunctionSum,logsForwardingSum,logsIndexed15daySum,logsIndexed180daySum,logsIndexed1daySum,logsIndexed30daySum,logsIndexed360daySum,logsIndexed3daySum,logsIndexed45daySum,logsIndexed60daySum,logsIndexed7daySum,logsIndexed90daySum,logsIndexedCustomRetentionSum,logsIndexedSum,logsIngestedSum,networkDeviceSum,networkDeviceTop99p,npmFlowSum,npmHostSum,npmHostTop99p,observabilityPipelineSum,onlineArchiveSum,profContainerSum,profHostSum,profHostTop99p,rumLiteSum,rumReplaySum,rumSum,rumUnitsSum,sensitiveDataScannerSum,serverlessApmSum,serverlessInfraAverage,serverlessInfraSum,serverlessInvocationSum,siemSum,standardTimeseriesAverage,syntheticsApiTestsSum,syntheticsAppTestingMaximum,syntheticsBrowserChecksSum,timeseriesAverage,timeseriesSum, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageBillableSummaryKeys {\n");
    sb.append("    apmFargateAverage: ").append(toIndentedString(apmFargateAverage)).append("\n");
    sb.append("    apmFargateSum: ").append(toIndentedString(apmFargateSum)).append("\n");
    sb.append("    apmHostSum: ").append(toIndentedString(apmHostSum)).append("\n");
    sb.append("    apmHostTop99p: ").append(toIndentedString(apmHostTop99p)).append("\n");
    sb.append("    apmProfilerHostSum: ").append(toIndentedString(apmProfilerHostSum)).append("\n");
    sb.append("    apmProfilerHostTop99p: ").append(toIndentedString(apmProfilerHostTop99p)).append("\n");
    sb.append("    apmTraceSearchSum: ").append(toIndentedString(apmTraceSearchSum)).append("\n");
    sb.append("    applicationSecurityFargateAverage: ").append(toIndentedString(applicationSecurityFargateAverage)).append("\n");
    sb.append("    applicationSecurityHostSum: ").append(toIndentedString(applicationSecurityHostSum)).append("\n");
    sb.append("    applicationSecurityHostTop99p: ").append(toIndentedString(applicationSecurityHostTop99p)).append("\n");
    sb.append("    ciPipelineIndexedSpansSum: ").append(toIndentedString(ciPipelineIndexedSpansSum)).append("\n");
    sb.append("    ciPipelineMaximum: ").append(toIndentedString(ciPipelineMaximum)).append("\n");
    sb.append("    ciPipelineSum: ").append(toIndentedString(ciPipelineSum)).append("\n");
    sb.append("    ciTestIndexedSpansSum: ").append(toIndentedString(ciTestIndexedSpansSum)).append("\n");
    sb.append("    ciTestingMaximum: ").append(toIndentedString(ciTestingMaximum)).append("\n");
    sb.append("    ciTestingSum: ").append(toIndentedString(ciTestingSum)).append("\n");
    sb.append("    cloudCostManagementAverage: ").append(toIndentedString(cloudCostManagementAverage)).append("\n");
    sb.append("    cloudCostManagementSum: ").append(toIndentedString(cloudCostManagementSum)).append("\n");
    sb.append("    cspmContainerSum: ").append(toIndentedString(cspmContainerSum)).append("\n");
    sb.append("    cspmHostSum: ").append(toIndentedString(cspmHostSum)).append("\n");
    sb.append("    cspmHostTop99p: ").append(toIndentedString(cspmHostTop99p)).append("\n");
    sb.append("    customEventSum: ").append(toIndentedString(customEventSum)).append("\n");
    sb.append("    cwsContainerSum: ").append(toIndentedString(cwsContainerSum)).append("\n");
    sb.append("    cwsHostSum: ").append(toIndentedString(cwsHostSum)).append("\n");
    sb.append("    cwsHostTop99p: ").append(toIndentedString(cwsHostTop99p)).append("\n");
    sb.append("    dbmHostSum: ").append(toIndentedString(dbmHostSum)).append("\n");
    sb.append("    dbmHostTop99p: ").append(toIndentedString(dbmHostTop99p)).append("\n");
    sb.append("    dbmNormalizedQueriesAverage: ").append(toIndentedString(dbmNormalizedQueriesAverage)).append("\n");
    sb.append("    dbmNormalizedQueriesSum: ").append(toIndentedString(dbmNormalizedQueriesSum)).append("\n");
    sb.append("    fargateContainerApmAndProfilerAverage: ").append(toIndentedString(fargateContainerApmAndProfilerAverage)).append("\n");
    sb.append("    fargateContainerApmAndProfilerSum: ").append(toIndentedString(fargateContainerApmAndProfilerSum)).append("\n");
    sb.append("    fargateContainerAverage: ").append(toIndentedString(fargateContainerAverage)).append("\n");
    sb.append("    fargateContainerProfilerAverage: ").append(toIndentedString(fargateContainerProfilerAverage)).append("\n");
    sb.append("    fargateContainerProfilerSum: ").append(toIndentedString(fargateContainerProfilerSum)).append("\n");
    sb.append("    fargateContainerSum: ").append(toIndentedString(fargateContainerSum)).append("\n");
    sb.append("    incidentManagementMaximum: ").append(toIndentedString(incidentManagementMaximum)).append("\n");
    sb.append("    incidentManagementSum: ").append(toIndentedString(incidentManagementSum)).append("\n");
    sb.append("    infraAndApmHostSum: ").append(toIndentedString(infraAndApmHostSum)).append("\n");
    sb.append("    infraAndApmHostTop99p: ").append(toIndentedString(infraAndApmHostTop99p)).append("\n");
    sb.append("    infraContainerSum: ").append(toIndentedString(infraContainerSum)).append("\n");
    sb.append("    infraHostSum: ").append(toIndentedString(infraHostSum)).append("\n");
    sb.append("    infraHostTop99p: ").append(toIndentedString(infraHostTop99p)).append("\n");
    sb.append("    ingestedSpansSum: ").append(toIndentedString(ingestedSpansSum)).append("\n");
    sb.append("    ingestedTimeseriesAverage: ").append(toIndentedString(ingestedTimeseriesAverage)).append("\n");
    sb.append("    ingestedTimeseriesSum: ").append(toIndentedString(ingestedTimeseriesSum)).append("\n");
    sb.append("    iotSum: ").append(toIndentedString(iotSum)).append("\n");
    sb.append("    iotTop99p: ").append(toIndentedString(iotTop99p)).append("\n");
    sb.append("    lambdaFunctionAverage: ").append(toIndentedString(lambdaFunctionAverage)).append("\n");
    sb.append("    lambdaFunctionSum: ").append(toIndentedString(lambdaFunctionSum)).append("\n");
    sb.append("    logsForwardingSum: ").append(toIndentedString(logsForwardingSum)).append("\n");
    sb.append("    logsIndexed15daySum: ").append(toIndentedString(logsIndexed15daySum)).append("\n");
    sb.append("    logsIndexed180daySum: ").append(toIndentedString(logsIndexed180daySum)).append("\n");
    sb.append("    logsIndexed1daySum: ").append(toIndentedString(logsIndexed1daySum)).append("\n");
    sb.append("    logsIndexed30daySum: ").append(toIndentedString(logsIndexed30daySum)).append("\n");
    sb.append("    logsIndexed360daySum: ").append(toIndentedString(logsIndexed360daySum)).append("\n");
    sb.append("    logsIndexed3daySum: ").append(toIndentedString(logsIndexed3daySum)).append("\n");
    sb.append("    logsIndexed45daySum: ").append(toIndentedString(logsIndexed45daySum)).append("\n");
    sb.append("    logsIndexed60daySum: ").append(toIndentedString(logsIndexed60daySum)).append("\n");
    sb.append("    logsIndexed7daySum: ").append(toIndentedString(logsIndexed7daySum)).append("\n");
    sb.append("    logsIndexed90daySum: ").append(toIndentedString(logsIndexed90daySum)).append("\n");
    sb.append("    logsIndexedCustomRetentionSum: ").append(toIndentedString(logsIndexedCustomRetentionSum)).append("\n");
    sb.append("    logsIndexedSum: ").append(toIndentedString(logsIndexedSum)).append("\n");
    sb.append("    logsIngestedSum: ").append(toIndentedString(logsIngestedSum)).append("\n");
    sb.append("    networkDeviceSum: ").append(toIndentedString(networkDeviceSum)).append("\n");
    sb.append("    networkDeviceTop99p: ").append(toIndentedString(networkDeviceTop99p)).append("\n");
    sb.append("    npmFlowSum: ").append(toIndentedString(npmFlowSum)).append("\n");
    sb.append("    npmHostSum: ").append(toIndentedString(npmHostSum)).append("\n");
    sb.append("    npmHostTop99p: ").append(toIndentedString(npmHostTop99p)).append("\n");
    sb.append("    observabilityPipelineSum: ").append(toIndentedString(observabilityPipelineSum)).append("\n");
    sb.append("    onlineArchiveSum: ").append(toIndentedString(onlineArchiveSum)).append("\n");
    sb.append("    profContainerSum: ").append(toIndentedString(profContainerSum)).append("\n");
    sb.append("    profHostSum: ").append(toIndentedString(profHostSum)).append("\n");
    sb.append("    profHostTop99p: ").append(toIndentedString(profHostTop99p)).append("\n");
    sb.append("    rumLiteSum: ").append(toIndentedString(rumLiteSum)).append("\n");
    sb.append("    rumReplaySum: ").append(toIndentedString(rumReplaySum)).append("\n");
    sb.append("    rumSum: ").append(toIndentedString(rumSum)).append("\n");
    sb.append("    rumUnitsSum: ").append(toIndentedString(rumUnitsSum)).append("\n");
    sb.append("    sensitiveDataScannerSum: ").append(toIndentedString(sensitiveDataScannerSum)).append("\n");
    sb.append("    serverlessApmSum: ").append(toIndentedString(serverlessApmSum)).append("\n");
    sb.append("    serverlessInfraAverage: ").append(toIndentedString(serverlessInfraAverage)).append("\n");
    sb.append("    serverlessInfraSum: ").append(toIndentedString(serverlessInfraSum)).append("\n");
    sb.append("    serverlessInvocationSum: ").append(toIndentedString(serverlessInvocationSum)).append("\n");
    sb.append("    siemSum: ").append(toIndentedString(siemSum)).append("\n");
    sb.append("    standardTimeseriesAverage: ").append(toIndentedString(standardTimeseriesAverage)).append("\n");
    sb.append("    syntheticsApiTestsSum: ").append(toIndentedString(syntheticsApiTestsSum)).append("\n");
    sb.append("    syntheticsAppTestingMaximum: ").append(toIndentedString(syntheticsAppTestingMaximum)).append("\n");
    sb.append("    syntheticsBrowserChecksSum: ").append(toIndentedString(syntheticsBrowserChecksSum)).append("\n");
    sb.append("    timeseriesAverage: ").append(toIndentedString(timeseriesAverage)).append("\n");
    sb.append("    timeseriesSum: ").append(toIndentedString(timeseriesSum)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
