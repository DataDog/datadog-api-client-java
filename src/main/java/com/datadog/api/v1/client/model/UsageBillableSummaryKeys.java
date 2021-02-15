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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.UsageBillableSummaryBody;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Response with aggregated usage types.
 */
@ApiModel(description = "Response with aggregated usage types.")
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
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INDEXED_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_LOGS_INGESTED_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_NPM_FLOW_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_NPM_HOST_TOP99P,
  UsageBillableSummaryKeys.JSON_PROPERTY_RUM_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SERVERLESS_INVOCATION_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SIEM_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SYNTHETICS_API_TESTS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECKS_SUM,
  UsageBillableSummaryKeys.JSON_PROPERTY_TIMESERIES_AVERAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageBillableSummaryKeys {
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

  public static final String JSON_PROPERTY_LOGS_INDEXED_SUM = "logs_indexed_sum";
  private UsageBillableSummaryBody logsIndexedSum;

  public static final String JSON_PROPERTY_LOGS_INGESTED_SUM = "logs_ingested_sum";
  private UsageBillableSummaryBody logsIngestedSum;

  public static final String JSON_PROPERTY_NPM_FLOW_SUM = "npm_flow_sum";
  private UsageBillableSummaryBody npmFlowSum;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P = "npm_host_top99p";
  private UsageBillableSummaryBody npmHostTop99p;

  public static final String JSON_PROPERTY_RUM_SUM = "rum_sum";
  private UsageBillableSummaryBody rumSum;

  public static final String JSON_PROPERTY_SERVERLESS_INVOCATION_SUM = "serverless_invocation_sum";
  private UsageBillableSummaryBody serverlessInvocationSum;

  public static final String JSON_PROPERTY_SIEM_SUM = "siem_sum";
  private UsageBillableSummaryBody siemSum;

  public static final String JSON_PROPERTY_SYNTHETICS_API_TESTS_SUM = "synthetics_api_tests_sum";
  private UsageBillableSummaryBody syntheticsApiTestsSum;

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECKS_SUM = "synthetics_browser_checks_sum";
  private UsageBillableSummaryBody syntheticsBrowserChecksSum;

  public static final String JSON_PROPERTY_TIMESERIES_AVERAGE = "timeseries_average";
  private UsageBillableSummaryBody timeseriesAverage;


  public UsageBillableSummaryKeys apmHostSum(UsageBillableSummaryBody apmHostSum) {
    this.apmHostSum = apmHostSum;
    return this;
  }

   /**
   * Get apmHostSum
   * @return apmHostSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    return this;
  }

   /**
   * Get apmHostTop99p
   * @return apmHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    return this;
  }

   /**
   * Get apmTraceSearchSum
   * @return apmTraceSearchSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APM_TRACE_SEARCH_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getApmTraceSearchSum() {
    return apmTraceSearchSum;
  }


  public void setApmTraceSearchSum(UsageBillableSummaryBody apmTraceSearchSum) {
    this.apmTraceSearchSum = apmTraceSearchSum;
  }


  public UsageBillableSummaryKeys fargateContainerAverage(UsageBillableSummaryBody fargateContainerAverage) {
    this.fargateContainerAverage = fargateContainerAverage;
    return this;
  }

   /**
   * Get fargateContainerAverage
   * @return fargateContainerAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    return this;
  }

   /**
   * Get infraContainerSum
   * @return infraContainerSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    return this;
  }

   /**
   * Get infraHostSum
   * @return infraHostSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    return this;
  }

   /**
   * Get infraHostTop99p
   * @return infraHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    return this;
  }

   /**
   * Get iotTop99p
   * @return iotTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IOT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getIotTop99p() {
    return iotTop99p;
  }


  public void setIotTop99p(UsageBillableSummaryBody iotTop99p) {
    this.iotTop99p = iotTop99p;
  }


  public UsageBillableSummaryKeys lambdaFunctionAverage(UsageBillableSummaryBody lambdaFunctionAverage) {
    this.lambdaFunctionAverage = lambdaFunctionAverage;
    return this;
  }

   /**
   * Get lambdaFunctionAverage
   * @return lambdaFunctionAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTION_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getLambdaFunctionAverage() {
    return lambdaFunctionAverage;
  }


  public void setLambdaFunctionAverage(UsageBillableSummaryBody lambdaFunctionAverage) {
    this.lambdaFunctionAverage = lambdaFunctionAverage;
  }


  public UsageBillableSummaryKeys logsIndexedSum(UsageBillableSummaryBody logsIndexedSum) {
    this.logsIndexedSum = logsIndexedSum;
    return this;
  }

   /**
   * Get logsIndexedSum
   * @return logsIndexedSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    return this;
  }

   /**
   * Get logsIngestedSum
   * @return logsIngestedSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGS_INGESTED_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getLogsIngestedSum() {
    return logsIngestedSum;
  }


  public void setLogsIngestedSum(UsageBillableSummaryBody logsIngestedSum) {
    this.logsIngestedSum = logsIngestedSum;
  }


  public UsageBillableSummaryKeys npmFlowSum(UsageBillableSummaryBody npmFlowSum) {
    this.npmFlowSum = npmFlowSum;
    return this;
  }

   /**
   * Get npmFlowSum
   * @return npmFlowSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NPM_FLOW_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getNpmFlowSum() {
    return npmFlowSum;
  }


  public void setNpmFlowSum(UsageBillableSummaryBody npmFlowSum) {
    this.npmFlowSum = npmFlowSum;
  }


  public UsageBillableSummaryKeys npmHostTop99p(UsageBillableSummaryBody npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
    return this;
  }

   /**
   * Get npmHostTop99p
   * @return npmHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NPM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getNpmHostTop99p() {
    return npmHostTop99p;
  }


  public void setNpmHostTop99p(UsageBillableSummaryBody npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
  }


  public UsageBillableSummaryKeys rumSum(UsageBillableSummaryBody rumSum) {
    this.rumSum = rumSum;
    return this;
  }

   /**
   * Get rumSum
   * @return rumSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RUM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getRumSum() {
    return rumSum;
  }


  public void setRumSum(UsageBillableSummaryBody rumSum) {
    this.rumSum = rumSum;
  }


  public UsageBillableSummaryKeys serverlessInvocationSum(UsageBillableSummaryBody serverlessInvocationSum) {
    this.serverlessInvocationSum = serverlessInvocationSum;
    return this;
  }

   /**
   * Get serverlessInvocationSum
   * @return serverlessInvocationSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    return this;
  }

   /**
   * Get siemSum
   * @return siemSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIEM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getSiemSum() {
    return siemSum;
  }


  public void setSiemSum(UsageBillableSummaryBody siemSum) {
    this.siemSum = siemSum;
  }


  public UsageBillableSummaryKeys syntheticsApiTestsSum(UsageBillableSummaryBody syntheticsApiTestsSum) {
    this.syntheticsApiTestsSum = syntheticsApiTestsSum;
    return this;
  }

   /**
   * Get syntheticsApiTestsSum
   * @return syntheticsApiTestsSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_API_TESTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getSyntheticsApiTestsSum() {
    return syntheticsApiTestsSum;
  }


  public void setSyntheticsApiTestsSum(UsageBillableSummaryBody syntheticsApiTestsSum) {
    this.syntheticsApiTestsSum = syntheticsApiTestsSum;
  }


  public UsageBillableSummaryKeys syntheticsBrowserChecksSum(UsageBillableSummaryBody syntheticsBrowserChecksSum) {
    this.syntheticsBrowserChecksSum = syntheticsBrowserChecksSum;
    return this;
  }

   /**
   * Get syntheticsBrowserChecksSum
   * @return syntheticsBrowserChecksSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    return this;
  }

   /**
   * Get timeseriesAverage
   * @return timeseriesAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMESERIES_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBillableSummaryBody getTimeseriesAverage() {
    return timeseriesAverage;
  }


  public void setTimeseriesAverage(UsageBillableSummaryBody timeseriesAverage) {
    this.timeseriesAverage = timeseriesAverage;
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
    return Objects.equals(this.apmHostSum, usageBillableSummaryKeys.apmHostSum) &&
        Objects.equals(this.apmHostTop99p, usageBillableSummaryKeys.apmHostTop99p) &&
        Objects.equals(this.apmTraceSearchSum, usageBillableSummaryKeys.apmTraceSearchSum) &&
        Objects.equals(this.fargateContainerAverage, usageBillableSummaryKeys.fargateContainerAverage) &&
        Objects.equals(this.infraContainerSum, usageBillableSummaryKeys.infraContainerSum) &&
        Objects.equals(this.infraHostSum, usageBillableSummaryKeys.infraHostSum) &&
        Objects.equals(this.infraHostTop99p, usageBillableSummaryKeys.infraHostTop99p) &&
        Objects.equals(this.iotTop99p, usageBillableSummaryKeys.iotTop99p) &&
        Objects.equals(this.lambdaFunctionAverage, usageBillableSummaryKeys.lambdaFunctionAverage) &&
        Objects.equals(this.logsIndexedSum, usageBillableSummaryKeys.logsIndexedSum) &&
        Objects.equals(this.logsIngestedSum, usageBillableSummaryKeys.logsIngestedSum) &&
        Objects.equals(this.npmFlowSum, usageBillableSummaryKeys.npmFlowSum) &&
        Objects.equals(this.npmHostTop99p, usageBillableSummaryKeys.npmHostTop99p) &&
        Objects.equals(this.rumSum, usageBillableSummaryKeys.rumSum) &&
        Objects.equals(this.serverlessInvocationSum, usageBillableSummaryKeys.serverlessInvocationSum) &&
        Objects.equals(this.siemSum, usageBillableSummaryKeys.siemSum) &&
        Objects.equals(this.syntheticsApiTestsSum, usageBillableSummaryKeys.syntheticsApiTestsSum) &&
        Objects.equals(this.syntheticsBrowserChecksSum, usageBillableSummaryKeys.syntheticsBrowserChecksSum) &&
        Objects.equals(this.timeseriesAverage, usageBillableSummaryKeys.timeseriesAverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apmHostSum, apmHostTop99p, apmTraceSearchSum, fargateContainerAverage, infraContainerSum, infraHostSum, infraHostTop99p, iotTop99p, lambdaFunctionAverage, logsIndexedSum, logsIngestedSum, npmFlowSum, npmHostTop99p, rumSum, serverlessInvocationSum, siemSum, syntheticsApiTestsSum, syntheticsBrowserChecksSum, timeseriesAverage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageBillableSummaryKeys {\n");
    sb.append("    apmHostSum: ").append(toIndentedString(apmHostSum)).append("\n");
    sb.append("    apmHostTop99p: ").append(toIndentedString(apmHostTop99p)).append("\n");
    sb.append("    apmTraceSearchSum: ").append(toIndentedString(apmTraceSearchSum)).append("\n");
    sb.append("    fargateContainerAverage: ").append(toIndentedString(fargateContainerAverage)).append("\n");
    sb.append("    infraContainerSum: ").append(toIndentedString(infraContainerSum)).append("\n");
    sb.append("    infraHostSum: ").append(toIndentedString(infraHostSum)).append("\n");
    sb.append("    infraHostTop99p: ").append(toIndentedString(infraHostTop99p)).append("\n");
    sb.append("    iotTop99p: ").append(toIndentedString(iotTop99p)).append("\n");
    sb.append("    lambdaFunctionAverage: ").append(toIndentedString(lambdaFunctionAverage)).append("\n");
    sb.append("    logsIndexedSum: ").append(toIndentedString(logsIndexedSum)).append("\n");
    sb.append("    logsIngestedSum: ").append(toIndentedString(logsIngestedSum)).append("\n");
    sb.append("    npmFlowSum: ").append(toIndentedString(npmFlowSum)).append("\n");
    sb.append("    npmHostTop99p: ").append(toIndentedString(npmHostTop99p)).append("\n");
    sb.append("    rumSum: ").append(toIndentedString(rumSum)).append("\n");
    sb.append("    serverlessInvocationSum: ").append(toIndentedString(serverlessInvocationSum)).append("\n");
    sb.append("    siemSum: ").append(toIndentedString(siemSum)).append("\n");
    sb.append("    syntheticsApiTestsSum: ").append(toIndentedString(syntheticsApiTestsSum)).append("\n");
    sb.append("    syntheticsBrowserChecksSum: ").append(toIndentedString(syntheticsBrowserChecksSum)).append("\n");
    sb.append("    timeseriesAverage: ").append(toIndentedString(timeseriesAverage)).append("\n");
    sb.append("}");
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

