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
import com.datadog.api.v1.client.model.SyntheticsBrowserTestResultShortResult;
import com.datadog.api.v1.client.model.SyntheticsTestMonitorStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object with the results of a single Synthetic browser test.
 */
@ApiModel(description = "Object with the results of a single Synthetic browser test.")
@JsonPropertyOrder({
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_CHECK_TIME,
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_PROBE_DC,
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_RESULT,
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_RESULT_ID,
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_STATUS
})

public class SyntheticsBrowserTestResultShort {
  public static final String JSON_PROPERTY_CHECK_TIME = "check_time";
  private Double checkTime;

  public static final String JSON_PROPERTY_PROBE_DC = "probe_dc";
  private String probeDc;

  public static final String JSON_PROPERTY_RESULT = "result";
  private SyntheticsBrowserTestResultShortResult result;

  public static final String JSON_PROPERTY_RESULT_ID = "result_id";
  private String resultId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestMonitorStatus status;


  public SyntheticsBrowserTestResultShort checkTime(Double checkTime) {
    this.checkTime = checkTime;
    return this;
  }

   /**
   * Last time the browser test was performed.
   * @return checkTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time the browser test was performed.")
  @JsonProperty(JSON_PROPERTY_CHECK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCheckTime() {
    return checkTime;
  }


  public void setCheckTime(Double checkTime) {
    this.checkTime = checkTime;
  }


  public SyntheticsBrowserTestResultShort probeDc(String probeDc) {
    this.probeDc = probeDc;
    return this;
  }

   /**
   * Location from which the Browser test was performed.
   * @return probeDc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location from which the Browser test was performed.")
  @JsonProperty(JSON_PROPERTY_PROBE_DC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProbeDc() {
    return probeDc;
  }


  public void setProbeDc(String probeDc) {
    this.probeDc = probeDc;
  }


  public SyntheticsBrowserTestResultShort result(SyntheticsBrowserTestResultShortResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsBrowserTestResultShortResult getResult() {
    return result;
  }


  public void setResult(SyntheticsBrowserTestResultShortResult result) {
    this.result = result;
  }


  public SyntheticsBrowserTestResultShort resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

   /**
   * ID of the browser test result.
   * @return resultId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the browser test result.")
  @JsonProperty(JSON_PROPERTY_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultId() {
    return resultId;
  }


  public void setResultId(String resultId) {
    this.resultId = resultId;
  }


  public SyntheticsBrowserTestResultShort status(SyntheticsTestMonitorStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestMonitorStatus getStatus() {
    return status;
  }


  public void setStatus(SyntheticsTestMonitorStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestResultShort syntheticsBrowserTestResultShort = (SyntheticsBrowserTestResultShort) o;
    return Objects.equals(this.checkTime, syntheticsBrowserTestResultShort.checkTime) &&
        Objects.equals(this.probeDc, syntheticsBrowserTestResultShort.probeDc) &&
        Objects.equals(this.result, syntheticsBrowserTestResultShort.result) &&
        Objects.equals(this.resultId, syntheticsBrowserTestResultShort.resultId) &&
        Objects.equals(this.status, syntheticsBrowserTestResultShort.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkTime, probeDc, result, resultId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestResultShort {\n");
    sb.append("    checkTime: ").append(toIndentedString(checkTime)).append("\n");
    sb.append("    probeDc: ").append(toIndentedString(probeDc)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

