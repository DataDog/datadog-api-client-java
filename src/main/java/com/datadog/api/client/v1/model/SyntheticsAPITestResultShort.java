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
   * <p>Object with the results of a single Synthetic API test.</p>
 */
@JsonPropertyOrder({
  SyntheticsAPITestResultShort.JSON_PROPERTY_CHECK_TIME,
  SyntheticsAPITestResultShort.JSON_PROPERTY_PROBE_DC,
  SyntheticsAPITestResultShort.JSON_PROPERTY_RESULT,
  SyntheticsAPITestResultShort.JSON_PROPERTY_RESULT_ID,
  SyntheticsAPITestResultShort.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPITestResultShort {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK_TIME = "check_time";
  private Double checkTime;

  public static final String JSON_PROPERTY_PROBE_DC = "probe_dc";
  private String probeDc;

  public static final String JSON_PROPERTY_RESULT = "result";
  private SyntheticsAPITestResultShortResult result;

  public static final String JSON_PROPERTY_RESULT_ID = "result_id";
  private String resultId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestMonitorStatus status;

  public SyntheticsAPITestResultShort checkTime(Double checkTime) {
    this.checkTime = checkTime;
    return this;
  }

  /**
   * <p>Last time the API test was performed.</p>
   * @return checkTime
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHECK_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getCheckTime() {
        return checkTime;
      }
  public void setCheckTime(Double checkTime) {
    this.checkTime = checkTime;
  }
  public SyntheticsAPITestResultShort probeDc(String probeDc) {
    this.probeDc = probeDc;
    return this;
  }

  /**
   * <p>Location from which the API test was performed.</p>
   * @return probeDc
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROBE_DC)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProbeDc() {
        return probeDc;
      }
  public void setProbeDc(String probeDc) {
    this.probeDc = probeDc;
  }
  public SyntheticsAPITestResultShort result(SyntheticsAPITestResultShortResult result) {
    this.result = result;
    this.unparsed |= result.unparsed;
    return this;
  }

  /**
   * <p>Result of the last API test run.</p>
   * @return result
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESULT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsAPITestResultShortResult getResult() {
        return result;
      }
  public void setResult(SyntheticsAPITestResultShortResult result) {
    this.result = result;
  }
  public SyntheticsAPITestResultShort resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * <p>ID of the API test result.</p>
   * @return resultId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESULT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getResultId() {
        return resultId;
      }
  public void setResultId(String resultId) {
    this.resultId = resultId;
  }
  public SyntheticsAPITestResultShort status(SyntheticsTestMonitorStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The status of your Synthetic monitor.
   * * <code>O</code> for not triggered
   * * <code>1</code> for triggered
   * * <code>2</code> for no data</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestMonitorStatus getStatus() {
        return status;
      }
  public void setStatus(SyntheticsTestMonitorStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }

  /**
   * Return true if this SyntheticsAPITestResultShort object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestResultShort syntheticsApiTestResultShort = (SyntheticsAPITestResultShort) o;
    return Objects.equals(this.checkTime, syntheticsApiTestResultShort.checkTime) && Objects.equals(this.probeDc, syntheticsApiTestResultShort.probeDc) && Objects.equals(this.result, syntheticsApiTestResultShort.result) && Objects.equals(this.resultId, syntheticsApiTestResultShort.resultId) && Objects.equals(this.status, syntheticsApiTestResultShort.status);
  }


  @Override
  public int hashCode() {
    return Objects.hash(checkTime,probeDc,result,resultId,status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestResultShort {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
