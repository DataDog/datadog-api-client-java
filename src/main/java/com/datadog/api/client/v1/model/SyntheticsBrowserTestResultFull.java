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
   * <p>Object returned describing a browser test result.</p>
 */
@JsonPropertyOrder({
  SyntheticsBrowserTestResultFull.JSON_PROPERTY_CHECK,
  SyntheticsBrowserTestResultFull.JSON_PROPERTY_CHECK_TIME,
  SyntheticsBrowserTestResultFull.JSON_PROPERTY_CHECK_VERSION,
  SyntheticsBrowserTestResultFull.JSON_PROPERTY_PROBE_DC,
  SyntheticsBrowserTestResultFull.JSON_PROPERTY_RESULT,
  SyntheticsBrowserTestResultFull.JSON_PROPERTY_RESULT_ID,
  SyntheticsBrowserTestResultFull.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBrowserTestResultFull {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK = "check";
  private SyntheticsBrowserTestResultFullCheck check;

  public static final String JSON_PROPERTY_CHECK_TIME = "check_time";
  private Double checkTime;

  public static final String JSON_PROPERTY_CHECK_VERSION = "check_version";
  private Long checkVersion;

  public static final String JSON_PROPERTY_PROBE_DC = "probe_dc";
  private String probeDc;

  public static final String JSON_PROPERTY_RESULT = "result";
  private SyntheticsBrowserTestResultData result;

  public static final String JSON_PROPERTY_RESULT_ID = "result_id";
  private String resultId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestMonitorStatus status;

  public SyntheticsBrowserTestResultFull check(SyntheticsBrowserTestResultFullCheck check) {
    this.check = check;
    this.unparsed |= check.unparsed;
    return this;
  }

  /**
   * <p>Object describing the browser test configuration.</p>
   * @return check
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHECK)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsBrowserTestResultFullCheck getCheck() {
        return check;
      }
  public void setCheck(SyntheticsBrowserTestResultFullCheck check) {
    this.check = check;
  }
  public SyntheticsBrowserTestResultFull checkTime(Double checkTime) {
    this.checkTime = checkTime;
    return this;
  }

  /**
   * <p>When the browser test was conducted.</p>
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
  public SyntheticsBrowserTestResultFull checkVersion(Long checkVersion) {
    this.checkVersion = checkVersion;
    return this;
  }

  /**
   * <p>Version of the browser test used.</p>
   * @return checkVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHECK_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCheckVersion() {
        return checkVersion;
      }
  public void setCheckVersion(Long checkVersion) {
    this.checkVersion = checkVersion;
  }
  public SyntheticsBrowserTestResultFull probeDc(String probeDc) {
    this.probeDc = probeDc;
    return this;
  }

  /**
   * <p>Location from which the browser test was performed.</p>
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
  public SyntheticsBrowserTestResultFull result(SyntheticsBrowserTestResultData result) {
    this.result = result;
    this.unparsed |= result.unparsed;
    return this;
  }

  /**
   * <p>Object containing results for your Synthetic browser test.</p>
   * @return result
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESULT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsBrowserTestResultData getResult() {
        return result;
      }
  public void setResult(SyntheticsBrowserTestResultData result) {
    this.result = result;
  }
  public SyntheticsBrowserTestResultFull resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * <p>ID of the browser test result.</p>
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
  public SyntheticsBrowserTestResultFull status(SyntheticsTestMonitorStatus status) {
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
   * @return SyntheticsBrowserTestResultFull
   */
  @JsonAnySetter
  public SyntheticsBrowserTestResultFull putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsBrowserTestResultFull object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestResultFull syntheticsBrowserTestResultFull = (SyntheticsBrowserTestResultFull) o;
    return Objects.equals(this.check, syntheticsBrowserTestResultFull.check) && Objects.equals(this.checkTime, syntheticsBrowserTestResultFull.checkTime) && Objects.equals(this.checkVersion, syntheticsBrowserTestResultFull.checkVersion) && Objects.equals(this.probeDc, syntheticsBrowserTestResultFull.probeDc) && Objects.equals(this.result, syntheticsBrowserTestResultFull.result) && Objects.equals(this.resultId, syntheticsBrowserTestResultFull.resultId) && Objects.equals(this.status, syntheticsBrowserTestResultFull.status) && Objects.equals(this.additionalProperties, syntheticsBrowserTestResultFull.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(check,checkTime,checkVersion,probeDc,result,resultId,status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestResultFull {\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    checkTime: ").append(toIndentedString(checkTime)).append("\n");
    sb.append("    checkVersion: ").append(toIndentedString(checkVersion)).append("\n");
    sb.append("    probeDc: ").append(toIndentedString(probeDc)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
