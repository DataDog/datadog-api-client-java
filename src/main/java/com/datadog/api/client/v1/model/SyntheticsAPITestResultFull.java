/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object returned describing a API test result. */
@JsonPropertyOrder({
  SyntheticsAPITestResultFull.JSON_PROPERTY_CHECK,
  SyntheticsAPITestResultFull.JSON_PROPERTY_CHECK_TIME,
  SyntheticsAPITestResultFull.JSON_PROPERTY_CHECK_VERSION,
  SyntheticsAPITestResultFull.JSON_PROPERTY_PROBE_DC,
  SyntheticsAPITestResultFull.JSON_PROPERTY_RESULT,
  SyntheticsAPITestResultFull.JSON_PROPERTY_RESULT_ID,
  SyntheticsAPITestResultFull.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPITestResultFull {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK = "check";
  private SyntheticsAPITestResultFullCheck check;

  public static final String JSON_PROPERTY_CHECK_TIME = "check_time";
  private Double checkTime;

  public static final String JSON_PROPERTY_CHECK_VERSION = "check_version";
  private Long checkVersion;

  public static final String JSON_PROPERTY_PROBE_DC = "probe_dc";
  private String probeDc;

  public static final String JSON_PROPERTY_RESULT = "result";
  private SyntheticsAPITestResultData result;

  public static final String JSON_PROPERTY_RESULT_ID = "result_id";
  private String resultId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestMonitorStatus status;

  public SyntheticsAPITestResultFull check(SyntheticsAPITestResultFullCheck check) {
    this.check = check;
    this.unparsed |= check.unparsed;
    return this;
  }

  /**
   * Object describing the API test configuration.
   *
   * @return check
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsAPITestResultFullCheck getCheck() {
    return check;
  }

  public void setCheck(SyntheticsAPITestResultFullCheck check) {
    this.check = check;
  }

  public SyntheticsAPITestResultFull checkTime(Double checkTime) {
    this.checkTime = checkTime;
    return this;
  }

  /**
   * When the API test was conducted.
   *
   * @return checkTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(Double checkTime) {
    this.checkTime = checkTime;
  }

  public SyntheticsAPITestResultFull checkVersion(Long checkVersion) {
    this.checkVersion = checkVersion;
    return this;
  }

  /**
   * Version of the API test used.
   *
   * @return checkVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCheckVersion() {
    return checkVersion;
  }

  public void setCheckVersion(Long checkVersion) {
    this.checkVersion = checkVersion;
  }

  public SyntheticsAPITestResultFull probeDc(String probeDc) {
    this.probeDc = probeDc;
    return this;
  }

  /**
   * Locations for which to query the API test results.
   *
   * @return probeDc
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBE_DC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProbeDc() {
    return probeDc;
  }

  public void setProbeDc(String probeDc) {
    this.probeDc = probeDc;
  }

  public SyntheticsAPITestResultFull result(SyntheticsAPITestResultData result) {
    this.result = result;
    this.unparsed |= result.unparsed;
    return this;
  }

  /**
   * Object containing results for your Synthetic API test.
   *
   * @return result
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsAPITestResultData getResult() {
    return result;
  }

  public void setResult(SyntheticsAPITestResultData result) {
    this.result = result;
  }

  public SyntheticsAPITestResultFull resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * ID of the API test result.
   *
   * @return resultId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  public SyntheticsAPITestResultFull status(SyntheticsTestMonitorStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of your Synthetic monitor. * <code>O</code> for not triggered * <code>1</code> for
   * triggered * <code>2</code> for no data
   *
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestMonitorStatus getStatus() {
    return status;
  }

  public void setStatus(SyntheticsTestMonitorStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  /** Return true if this SyntheticsAPITestResultFull object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestResultFull syntheticsApiTestResultFull = (SyntheticsAPITestResultFull) o;
    return Objects.equals(this.check, syntheticsApiTestResultFull.check)
        && Objects.equals(this.checkTime, syntheticsApiTestResultFull.checkTime)
        && Objects.equals(this.checkVersion, syntheticsApiTestResultFull.checkVersion)
        && Objects.equals(this.probeDc, syntheticsApiTestResultFull.probeDc)
        && Objects.equals(this.result, syntheticsApiTestResultFull.result)
        && Objects.equals(this.resultId, syntheticsApiTestResultFull.resultId)
        && Objects.equals(this.status, syntheticsApiTestResultFull.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(check, checkTime, checkVersion, probeDc, result, resultId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestResultFull {\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    checkTime: ").append(toIndentedString(checkTime)).append("\n");
    sb.append("    checkVersion: ").append(toIndentedString(checkVersion)).append("\n");
    sb.append("    probeDc: ").append(toIndentedString(probeDc)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
