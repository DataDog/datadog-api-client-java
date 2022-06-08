/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Response with aggregated usage types. */
@JsonPropertyOrder({
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_APM_TRACE_SEARCH_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_FARGATE_CONTAINER_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_INFRA_CONTAINER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_INFRA_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_INFRA_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_IOT_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_LAMBDA_FUNCTION_AVERAGE,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED15DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED180DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED30DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED3DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED45DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED60DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED7DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED90DAY_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INGESTED_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_NETWORK_DEVICE_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_NPM_FLOW_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_NPM_HOST_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_NPM_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_PROF_CONTAINER_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_PROF_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_RUM_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SERVERLESS_INVOCATION_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SIEM_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SYNTHETICS_API_TESTS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECKS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_TIMESERIES_AVERAGE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageBillableSummaryKeys {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_HOST_SUM = "apm_host_sum";
  private UsageBillableSummaryBody apmHostSum;

  public static final String JSON_PROPERTY_APM_HOST_TOP99P = "apm_host_top99p";
  private UsageBillableSummaryBody apmHostTop99p;

  public static final String JSON_PROPERTY_APM_TRACE_SEARCH_SUM = "apm_trace_search_sum";
  private UsageBillableSummaryBody apmTraceSearchSum;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_AVERAGE = "fargate_container_average";
  private UsageBillableSummaryBody fargateContainerAverage;

  public static final String JSON_PROPERTY_INFRA_CONTAINER_SUM = "infra_container_sum";
  private UsageBillableSummaryBody infraContainerSum;

  public static final String JSON_PROPERTY_INFRA_HOST_SUM = "infra_host_sum";
  private UsageBillableSummaryBody infraHostSum;

  public static final String JSON_PROPERTY_INFRA_HOST_TOP99P = "infra_host_top99p";
  private UsageBillableSummaryBody infraHostTop99p;

  public static final String JSON_PROPERTY_IOT_TOP99P = "iot_top99p";
  private UsageBillableSummaryBody iotTop99p;

  public static final String JSON_PROPERTY_LAMBDA_FUNCTION_AVERAGE = "lambda_function_average";
  private UsageBillableSummaryBody lambdaFunctionAverage;

  public static final String JSON_PROPERTY_LOGS_INDEXED15DAY_SUM = "logs_indexed_15day_sum";
  private UsageBillableSummaryBody logsIndexed15daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED180DAY_SUM = "logs_indexed_180day_sum";
  private UsageBillableSummaryBody logsIndexed180daySum;

  public static final String JSON_PROPERTY_LOGS_INDEXED30DAY_SUM = "logs_indexed_30day_sum";
  private UsageBillableSummaryBody logsIndexed30daySum;

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

  public static final String JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_SUM =
      "logs_indexed_custom_retention_sum";
  private UsageBillableSummaryBody logsIndexedCustomRetentionSum;

  public static final String JSON_PROPERTY_LOGS_INDEXED_SUM = "logs_indexed_sum";
  private UsageBillableSummaryBody logsIndexedSum;

  public static final String JSON_PROPERTY_LOGS_INGESTED_SUM = "logs_ingested_sum";
  private UsageBillableSummaryBody logsIngestedSum;

  public static final String JSON_PROPERTY_NETWORK_DEVICE_TOP99P = "network_device_top99p";
  private UsageBillableSummaryBody networkDeviceTop99p;

  public static final String JSON_PROPERTY_NPM_FLOW_SUM = "npm_flow_sum";
  private UsageBillableSummaryBody npmFlowSum;

  public static final String JSON_PROPERTY_NPM_HOST_SUM = "npm_host_sum";
  private UsageBillableSummaryBody npmHostSum;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P = "npm_host_top99p";
  private UsageBillableSummaryBody npmHostTop99p;

  public static final String JSON_PROPERTY_PROF_CONTAINER_SUM = "prof_container_sum";
  private UsageBillableSummaryBody profContainerSum;

  public static final String JSON_PROPERTY_PROF_HOST_TOP99P = "prof_host_top99p";
  private UsageBillableSummaryBody profHostTop99p;

  public static final String JSON_PROPERTY_RUM_SUM = "rum_sum";
  private UsageBillableSummaryBody rumSum;

  public static final String JSON_PROPERTY_SERVERLESS_INVOCATION_SUM = "serverless_invocation_sum";
  private UsageBillableSummaryBody serverlessInvocationSum;

  public static final String JSON_PROPERTY_SIEM_SUM = "siem_sum";
  private UsageBillableSummaryBody siemSum;

  public static final String JSON_PROPERTY_SYNTHETICS_API_TESTS_SUM = "synthetics_api_tests_sum";
  private UsageBillableSummaryBody syntheticsApiTestsSum;

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECKS_SUM =
      "synthetics_browser_checks_sum";
  private UsageBillableSummaryBody syntheticsBrowserChecksSum;

  public static final String JSON_PROPERTY_TIMESERIES_AVERAGE = "timeseries_average";
  private UsageBillableSummaryBody timeseriesAverage;

  public UsageBillableSummaryKeys apmHostSum(UsageBillableSummaryBody apmHostSum) {
    this.apmHostSum = apmHostSum;
    this.unparsed |= apmHostSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return apmHostSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_HOST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return apmHostTop99p
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getApmHostTop99p() {
    return apmHostTop99p;
  }

  public void setApmHostTop99p(UsageBillableSummaryBody apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
  }

  public UsageBillableSummaryKeys apmTraceSearchSum(UsageBillableSummaryBody apmTraceSearchSum) {
    this.apmTraceSearchSum = apmTraceSearchSum;
    this.unparsed |= apmTraceSearchSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return apmTraceSearchSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_TRACE_SEARCH_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getApmTraceSearchSum() {
    return apmTraceSearchSum;
  }

  public void setApmTraceSearchSum(UsageBillableSummaryBody apmTraceSearchSum) {
    this.apmTraceSearchSum = apmTraceSearchSum;
  }

  public UsageBillableSummaryKeys fargateContainerAverage(
      UsageBillableSummaryBody fargateContainerAverage) {
    this.fargateContainerAverage = fargateContainerAverage;
    this.unparsed |= fargateContainerAverage.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return fargateContainerAverage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getFargateContainerAverage() {
    return fargateContainerAverage;
  }

  public void setFargateContainerAverage(UsageBillableSummaryBody fargateContainerAverage) {
    this.fargateContainerAverage = fargateContainerAverage;
  }

  public UsageBillableSummaryKeys infraContainerSum(UsageBillableSummaryBody infraContainerSum) {
    this.infraContainerSum = infraContainerSum;
    this.unparsed |= infraContainerSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return infraContainerSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CONTAINER_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return infraHostSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return infraHostTop99p
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getInfraHostTop99p() {
    return infraHostTop99p;
  }

  public void setInfraHostTop99p(UsageBillableSummaryBody infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
  }

  public UsageBillableSummaryKeys iotTop99p(UsageBillableSummaryBody iotTop99p) {
    this.iotTop99p = iotTop99p;
    this.unparsed |= iotTop99p.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return iotTop99p
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getIotTop99p() {
    return iotTop99p;
  }

  public void setIotTop99p(UsageBillableSummaryBody iotTop99p) {
    this.iotTop99p = iotTop99p;
  }

  public UsageBillableSummaryKeys lambdaFunctionAverage(
      UsageBillableSummaryBody lambdaFunctionAverage) {
    this.lambdaFunctionAverage = lambdaFunctionAverage;
    this.unparsed |= lambdaFunctionAverage.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return lambdaFunctionAverage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTION_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLambdaFunctionAverage() {
    return lambdaFunctionAverage;
  }

  public void setLambdaFunctionAverage(UsageBillableSummaryBody lambdaFunctionAverage) {
    this.lambdaFunctionAverage = lambdaFunctionAverage;
  }

  public UsageBillableSummaryKeys logsIndexed15daySum(
      UsageBillableSummaryBody logsIndexed15daySum) {
    this.logsIndexed15daySum = logsIndexed15daySum;
    this.unparsed |= logsIndexed15daySum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexed15daySum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED15DAY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLogsIndexed15daySum() {
    return logsIndexed15daySum;
  }

  public void setLogsIndexed15daySum(UsageBillableSummaryBody logsIndexed15daySum) {
    this.logsIndexed15daySum = logsIndexed15daySum;
  }

  public UsageBillableSummaryKeys logsIndexed180daySum(
      UsageBillableSummaryBody logsIndexed180daySum) {
    this.logsIndexed180daySum = logsIndexed180daySum;
    this.unparsed |= logsIndexed180daySum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexed180daySum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED180DAY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLogsIndexed180daySum() {
    return logsIndexed180daySum;
  }

  public void setLogsIndexed180daySum(UsageBillableSummaryBody logsIndexed180daySum) {
    this.logsIndexed180daySum = logsIndexed180daySum;
  }

  public UsageBillableSummaryKeys logsIndexed30daySum(
      UsageBillableSummaryBody logsIndexed30daySum) {
    this.logsIndexed30daySum = logsIndexed30daySum;
    this.unparsed |= logsIndexed30daySum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexed30daySum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED30DAY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLogsIndexed30daySum() {
    return logsIndexed30daySum;
  }

  public void setLogsIndexed30daySum(UsageBillableSummaryBody logsIndexed30daySum) {
    this.logsIndexed30daySum = logsIndexed30daySum;
  }

  public UsageBillableSummaryKeys logsIndexed3daySum(UsageBillableSummaryBody logsIndexed3daySum) {
    this.logsIndexed3daySum = logsIndexed3daySum;
    this.unparsed |= logsIndexed3daySum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexed3daySum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED3DAY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLogsIndexed3daySum() {
    return logsIndexed3daySum;
  }

  public void setLogsIndexed3daySum(UsageBillableSummaryBody logsIndexed3daySum) {
    this.logsIndexed3daySum = logsIndexed3daySum;
  }

  public UsageBillableSummaryKeys logsIndexed45daySum(
      UsageBillableSummaryBody logsIndexed45daySum) {
    this.logsIndexed45daySum = logsIndexed45daySum;
    this.unparsed |= logsIndexed45daySum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexed45daySum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED45DAY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLogsIndexed45daySum() {
    return logsIndexed45daySum;
  }

  public void setLogsIndexed45daySum(UsageBillableSummaryBody logsIndexed45daySum) {
    this.logsIndexed45daySum = logsIndexed45daySum;
  }

  public UsageBillableSummaryKeys logsIndexed60daySum(
      UsageBillableSummaryBody logsIndexed60daySum) {
    this.logsIndexed60daySum = logsIndexed60daySum;
    this.unparsed |= logsIndexed60daySum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexed60daySum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED60DAY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexed7daySum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED7DAY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLogsIndexed7daySum() {
    return logsIndexed7daySum;
  }

  public void setLogsIndexed7daySum(UsageBillableSummaryBody logsIndexed7daySum) {
    this.logsIndexed7daySum = logsIndexed7daySum;
  }

  public UsageBillableSummaryKeys logsIndexed90daySum(
      UsageBillableSummaryBody logsIndexed90daySum) {
    this.logsIndexed90daySum = logsIndexed90daySum;
    this.unparsed |= logsIndexed90daySum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexed90daySum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED90DAY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLogsIndexed90daySum() {
    return logsIndexed90daySum;
  }

  public void setLogsIndexed90daySum(UsageBillableSummaryBody logsIndexed90daySum) {
    this.logsIndexed90daySum = logsIndexed90daySum;
  }

  public UsageBillableSummaryKeys logsIndexedCustomRetentionSum(
      UsageBillableSummaryBody logsIndexedCustomRetentionSum) {
    this.logsIndexedCustomRetentionSum = logsIndexedCustomRetentionSum;
    this.unparsed |= logsIndexedCustomRetentionSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexedCustomRetentionSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLogsIndexedCustomRetentionSum() {
    return logsIndexedCustomRetentionSum;
  }

  public void setLogsIndexedCustomRetentionSum(
      UsageBillableSummaryBody logsIndexedCustomRetentionSum) {
    this.logsIndexedCustomRetentionSum = logsIndexedCustomRetentionSum;
  }

  public UsageBillableSummaryKeys logsIndexedSum(UsageBillableSummaryBody logsIndexedSum) {
    this.logsIndexedSum = logsIndexedSum;
    this.unparsed |= logsIndexedSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return logsIndexedSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return logsIngestedSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INGESTED_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getLogsIngestedSum() {
    return logsIngestedSum;
  }

  public void setLogsIngestedSum(UsageBillableSummaryBody logsIngestedSum) {
    this.logsIngestedSum = logsIngestedSum;
  }

  public UsageBillableSummaryKeys networkDeviceTop99p(
      UsageBillableSummaryBody networkDeviceTop99p) {
    this.networkDeviceTop99p = networkDeviceTop99p;
    this.unparsed |= networkDeviceTop99p.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return networkDeviceTop99p
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_DEVICE_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return npmFlowSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NPM_FLOW_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return npmHostSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NPM_HOST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return npmHostTop99p
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NPM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getNpmHostTop99p() {
    return npmHostTop99p;
  }

  public void setNpmHostTop99p(UsageBillableSummaryBody npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
  }

  public UsageBillableSummaryKeys profContainerSum(UsageBillableSummaryBody profContainerSum) {
    this.profContainerSum = profContainerSum;
    this.unparsed |= profContainerSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return profContainerSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROF_CONTAINER_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getProfContainerSum() {
    return profContainerSum;
  }

  public void setProfContainerSum(UsageBillableSummaryBody profContainerSum) {
    this.profContainerSum = profContainerSum;
  }

  public UsageBillableSummaryKeys profHostTop99p(UsageBillableSummaryBody profHostTop99p) {
    this.profHostTop99p = profHostTop99p;
    this.unparsed |= profHostTop99p.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return profHostTop99p
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROF_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getProfHostTop99p() {
    return profHostTop99p;
  }

  public void setProfHostTop99p(UsageBillableSummaryBody profHostTop99p) {
    this.profHostTop99p = profHostTop99p;
  }

  public UsageBillableSummaryKeys rumSum(UsageBillableSummaryBody rumSum) {
    this.rumSum = rumSum;
    this.unparsed |= rumSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return rumSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getRumSum() {
    return rumSum;
  }

  public void setRumSum(UsageBillableSummaryBody rumSum) {
    this.rumSum = rumSum;
  }

  public UsageBillableSummaryKeys serverlessInvocationSum(
      UsageBillableSummaryBody serverlessInvocationSum) {
    this.serverlessInvocationSum = serverlessInvocationSum;
    this.unparsed |= serverlessInvocationSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return serverlessInvocationSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_INVOCATION_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return siemSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIEM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getSiemSum() {
    return siemSum;
  }

  public void setSiemSum(UsageBillableSummaryBody siemSum) {
    this.siemSum = siemSum;
  }

  public UsageBillableSummaryKeys syntheticsApiTestsSum(
      UsageBillableSummaryBody syntheticsApiTestsSum) {
    this.syntheticsApiTestsSum = syntheticsApiTestsSum;
    this.unparsed |= syntheticsApiTestsSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return syntheticsApiTestsSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_API_TESTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getSyntheticsApiTestsSum() {
    return syntheticsApiTestsSum;
  }

  public void setSyntheticsApiTestsSum(UsageBillableSummaryBody syntheticsApiTestsSum) {
    this.syntheticsApiTestsSum = syntheticsApiTestsSum;
  }

  public UsageBillableSummaryKeys syntheticsBrowserChecksSum(
      UsageBillableSummaryBody syntheticsBrowserChecksSum) {
    this.syntheticsBrowserChecksSum = syntheticsBrowserChecksSum;
    this.unparsed |= syntheticsBrowserChecksSum.unparsed;
    return this;
  }

  /**
   * Response with properties for each aggregated usage type.
   *
   * @return syntheticsBrowserChecksSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_BROWSER_CHECKS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Response with properties for each aggregated usage type.
   *
   * @return timeseriesAverage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESERIES_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageBillableSummaryBody getTimeseriesAverage() {
    return timeseriesAverage;
  }

  public void setTimeseriesAverage(UsageBillableSummaryBody timeseriesAverage) {
    this.timeseriesAverage = timeseriesAverage;
  }

  /** Return true if this UsageBillableSummaryKeys object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageBillableSummaryKeys usageBillableSummaryKeys = (UsageBillableSummaryKeys) o;
    return Objects.equals(this.apmHostSum, usageBillableSummaryKeys.apmHostSum)
        && Objects.equals(this.apmHostTop99p, usageBillableSummaryKeys.apmHostTop99p)
        && Objects.equals(this.apmTraceSearchSum, usageBillableSummaryKeys.apmTraceSearchSum)
        && Objects.equals(
            this.fargateContainerAverage, usageBillableSummaryKeys.fargateContainerAverage)
        && Objects.equals(this.infraContainerSum, usageBillableSummaryKeys.infraContainerSum)
        && Objects.equals(this.infraHostSum, usageBillableSummaryKeys.infraHostSum)
        && Objects.equals(this.infraHostTop99p, usageBillableSummaryKeys.infraHostTop99p)
        && Objects.equals(this.iotTop99p, usageBillableSummaryKeys.iotTop99p)
        && Objects.equals(
            this.lambdaFunctionAverage, usageBillableSummaryKeys.lambdaFunctionAverage)
        && Objects.equals(this.logsIndexed15daySum, usageBillableSummaryKeys.logsIndexed15daySum)
        && Objects.equals(this.logsIndexed180daySum, usageBillableSummaryKeys.logsIndexed180daySum)
        && Objects.equals(this.logsIndexed30daySum, usageBillableSummaryKeys.logsIndexed30daySum)
        && Objects.equals(this.logsIndexed3daySum, usageBillableSummaryKeys.logsIndexed3daySum)
        && Objects.equals(this.logsIndexed45daySum, usageBillableSummaryKeys.logsIndexed45daySum)
        && Objects.equals(this.logsIndexed60daySum, usageBillableSummaryKeys.logsIndexed60daySum)
        && Objects.equals(this.logsIndexed7daySum, usageBillableSummaryKeys.logsIndexed7daySum)
        && Objects.equals(this.logsIndexed90daySum, usageBillableSummaryKeys.logsIndexed90daySum)
        && Objects.equals(
            this.logsIndexedCustomRetentionSum,
            usageBillableSummaryKeys.logsIndexedCustomRetentionSum)
        && Objects.equals(this.logsIndexedSum, usageBillableSummaryKeys.logsIndexedSum)
        && Objects.equals(this.logsIngestedSum, usageBillableSummaryKeys.logsIngestedSum)
        && Objects.equals(this.networkDeviceTop99p, usageBillableSummaryKeys.networkDeviceTop99p)
        && Objects.equals(this.npmFlowSum, usageBillableSummaryKeys.npmFlowSum)
        && Objects.equals(this.npmHostSum, usageBillableSummaryKeys.npmHostSum)
        && Objects.equals(this.npmHostTop99p, usageBillableSummaryKeys.npmHostTop99p)
        && Objects.equals(this.profContainerSum, usageBillableSummaryKeys.profContainerSum)
        && Objects.equals(this.profHostTop99p, usageBillableSummaryKeys.profHostTop99p)
        && Objects.equals(this.rumSum, usageBillableSummaryKeys.rumSum)
        && Objects.equals(
            this.serverlessInvocationSum, usageBillableSummaryKeys.serverlessInvocationSum)
        && Objects.equals(this.siemSum, usageBillableSummaryKeys.siemSum)
        && Objects.equals(
            this.syntheticsApiTestsSum, usageBillableSummaryKeys.syntheticsApiTestsSum)
        && Objects.equals(
            this.syntheticsBrowserChecksSum, usageBillableSummaryKeys.syntheticsBrowserChecksSum)
        && Objects.equals(this.timeseriesAverage, usageBillableSummaryKeys.timeseriesAverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apmHostSum,
        apmHostTop99p,
        apmTraceSearchSum,
        fargateContainerAverage,
        infraContainerSum,
        infraHostSum,
        infraHostTop99p,
        iotTop99p,
        lambdaFunctionAverage,
        logsIndexed15daySum,
        logsIndexed180daySum,
        logsIndexed30daySum,
        logsIndexed3daySum,
        logsIndexed45daySum,
        logsIndexed60daySum,
        logsIndexed7daySum,
        logsIndexed90daySum,
        logsIndexedCustomRetentionSum,
        logsIndexedSum,
        logsIngestedSum,
        networkDeviceTop99p,
        npmFlowSum,
        npmHostSum,
        npmHostTop99p,
        profContainerSum,
        profHostTop99p,
        rumSum,
        serverlessInvocationSum,
        siemSum,
        syntheticsApiTestsSum,
        syntheticsBrowserChecksSum,
        timeseriesAverage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageBillableSummaryKeys {\n");
    sb.append("    apmHostSum: ").append(toIndentedString(apmHostSum)).append("\n");
    sb.append("    apmHostTop99p: ").append(toIndentedString(apmHostTop99p)).append("\n");
    sb.append("    apmTraceSearchSum: ").append(toIndentedString(apmTraceSearchSum)).append("\n");
    sb.append("    fargateContainerAverage: ")
        .append(toIndentedString(fargateContainerAverage))
        .append("\n");
    sb.append("    infraContainerSum: ").append(toIndentedString(infraContainerSum)).append("\n");
    sb.append("    infraHostSum: ").append(toIndentedString(infraHostSum)).append("\n");
    sb.append("    infraHostTop99p: ").append(toIndentedString(infraHostTop99p)).append("\n");
    sb.append("    iotTop99p: ").append(toIndentedString(iotTop99p)).append("\n");
    sb.append("    lambdaFunctionAverage: ")
        .append(toIndentedString(lambdaFunctionAverage))
        .append("\n");
    sb.append("    logsIndexed15daySum: ")
        .append(toIndentedString(logsIndexed15daySum))
        .append("\n");
    sb.append("    logsIndexed180daySum: ")
        .append(toIndentedString(logsIndexed180daySum))
        .append("\n");
    sb.append("    logsIndexed30daySum: ")
        .append(toIndentedString(logsIndexed30daySum))
        .append("\n");
    sb.append("    logsIndexed3daySum: ").append(toIndentedString(logsIndexed3daySum)).append("\n");
    sb.append("    logsIndexed45daySum: ")
        .append(toIndentedString(logsIndexed45daySum))
        .append("\n");
    sb.append("    logsIndexed60daySum: ")
        .append(toIndentedString(logsIndexed60daySum))
        .append("\n");
    sb.append("    logsIndexed7daySum: ").append(toIndentedString(logsIndexed7daySum)).append("\n");
    sb.append("    logsIndexed90daySum: ")
        .append(toIndentedString(logsIndexed90daySum))
        .append("\n");
    sb.append("    logsIndexedCustomRetentionSum: ")
        .append(toIndentedString(logsIndexedCustomRetentionSum))
        .append("\n");
    sb.append("    logsIndexedSum: ").append(toIndentedString(logsIndexedSum)).append("\n");
    sb.append("    logsIngestedSum: ").append(toIndentedString(logsIngestedSum)).append("\n");
    sb.append("    networkDeviceTop99p: ")
        .append(toIndentedString(networkDeviceTop99p))
        .append("\n");
    sb.append("    npmFlowSum: ").append(toIndentedString(npmFlowSum)).append("\n");
    sb.append("    npmHostSum: ").append(toIndentedString(npmHostSum)).append("\n");
    sb.append("    npmHostTop99p: ").append(toIndentedString(npmHostTop99p)).append("\n");
    sb.append("    profContainerSum: ").append(toIndentedString(profContainerSum)).append("\n");
    sb.append("    profHostTop99p: ").append(toIndentedString(profHostTop99p)).append("\n");
    sb.append("    rumSum: ").append(toIndentedString(rumSum)).append("\n");
    sb.append("    serverlessInvocationSum: ")
        .append(toIndentedString(serverlessInvocationSum))
        .append("\n");
    sb.append("    siemSum: ").append(toIndentedString(siemSum)).append("\n");
    sb.append("    syntheticsApiTestsSum: ")
        .append(toIndentedString(syntheticsApiTestsSum))
        .append("\n");
    sb.append("    syntheticsBrowserChecksSum: ")
        .append(toIndentedString(syntheticsBrowserChecksSum))
        .append("\n");
    sb.append("    timeseriesAverage: ").append(toIndentedString(timeseriesAverage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
