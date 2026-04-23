/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a Synthetic test result summary. */
@JsonPropertyOrder({
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_DEVICE,
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_EXECUTION_INFO,
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_FINISHED_AT,
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_LOCATION,
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_RUN_TYPE,
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_STARTED_AT,
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_STATUS,
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_STEPS_INFO,
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_TEST_SUB_TYPE,
  SyntheticsTestResultSummaryAttributes.JSON_PROPERTY_TEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultSummaryAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEVICE = "device";
  private SyntheticsTestResultDevice device;

  public static final String JSON_PROPERTY_EXECUTION_INFO = "execution_info";
  private SyntheticsTestResultExecutionInfo executionInfo;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private Long finishedAt;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private SyntheticsTestResultLocation location;

  public static final String JSON_PROPERTY_RUN_TYPE = "run_type";
  private SyntheticsTestResultRunType runType;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private Long startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestResultStatus status;

  public static final String JSON_PROPERTY_STEPS_INFO = "steps_info";
  private SyntheticsTestResultStepsInfo stepsInfo;

  public static final String JSON_PROPERTY_TEST_SUB_TYPE = "test_sub_type";
  private SyntheticsTestSubType testSubType;

  public static final String JSON_PROPERTY_TEST_TYPE = "test_type";
  private SyntheticsTestType testType;

  public SyntheticsTestResultSummaryAttributes device(SyntheticsTestResultDevice device) {
    this.device = device;
    this.unparsed |= device.unparsed;
    return this;
  }

  /**
   * Device information for the test result (browser and mobile tests).
   *
   * @return device
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultDevice getDevice() {
    return device;
  }

  public void setDevice(SyntheticsTestResultDevice device) {
    this.device = device;
  }

  public SyntheticsTestResultSummaryAttributes executionInfo(
      SyntheticsTestResultExecutionInfo executionInfo) {
    this.executionInfo = executionInfo;
    this.unparsed |= executionInfo.unparsed;
    return this;
  }

  /**
   * Execution details for a Synthetic test result.
   *
   * @return executionInfo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultExecutionInfo getExecutionInfo() {
    return executionInfo;
  }

  public void setExecutionInfo(SyntheticsTestResultExecutionInfo executionInfo) {
    this.executionInfo = executionInfo;
  }

  public SyntheticsTestResultSummaryAttributes finishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Timestamp of when the test finished (in milliseconds).
   *
   * @return finishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
  }

  public SyntheticsTestResultSummaryAttributes location(SyntheticsTestResultLocation location) {
    this.location = location;
    this.unparsed |= location.unparsed;
    return this;
  }

  /**
   * Location information for a Synthetic test result.
   *
   * @return location
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultLocation getLocation() {
    return location;
  }

  public void setLocation(SyntheticsTestResultLocation location) {
    this.location = location;
  }

  public SyntheticsTestResultSummaryAttributes runType(SyntheticsTestResultRunType runType) {
    this.runType = runType;
    this.unparsed |= !runType.isValid();
    return this;
  }

  /**
   * The type of run for a Synthetic test result.
   *
   * @return runType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultRunType getRunType() {
    return runType;
  }

  public void setRunType(SyntheticsTestResultRunType runType) {
    if (!runType.isValid()) {
      this.unparsed = true;
    }
    this.runType = runType;
  }

  public SyntheticsTestResultSummaryAttributes startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Timestamp of when the test started (in milliseconds).
   *
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Long startedAt) {
    this.startedAt = startedAt;
  }

  public SyntheticsTestResultSummaryAttributes status(SyntheticsTestResultStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Status of a Synthetic test result.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultStatus getStatus() {
    return status;
  }

  public void setStatus(SyntheticsTestResultStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public SyntheticsTestResultSummaryAttributes stepsInfo(SyntheticsTestResultStepsInfo stepsInfo) {
    this.stepsInfo = stepsInfo;
    this.unparsed |= stepsInfo.unparsed;
    return this;
  }

  /**
   * Step execution summary for a Synthetic test result.
   *
   * @return stepsInfo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultStepsInfo getStepsInfo() {
    return stepsInfo;
  }

  public void setStepsInfo(SyntheticsTestResultStepsInfo stepsInfo) {
    this.stepsInfo = stepsInfo;
  }

  public SyntheticsTestResultSummaryAttributes testSubType(SyntheticsTestSubType testSubType) {
    this.testSubType = testSubType;
    this.unparsed |= !testSubType.isValid();
    return this;
  }

  /**
   * Subtype of the Synthetic test that produced this result.
   *
   * @return testSubType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestSubType getTestSubType() {
    return testSubType;
  }

  public void setTestSubType(SyntheticsTestSubType testSubType) {
    if (!testSubType.isValid()) {
      this.unparsed = true;
    }
    this.testSubType = testSubType;
  }

  public SyntheticsTestResultSummaryAttributes testType(SyntheticsTestType testType) {
    this.testType = testType;
    this.unparsed |= !testType.isValid();
    return this;
  }

  /**
   * Type of the Synthetic test that produced this result.
   *
   * @return testType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestType getTestType() {
    return testType;
  }

  public void setTestType(SyntheticsTestType testType) {
    if (!testType.isValid()) {
      this.unparsed = true;
    }
    this.testType = testType;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsTestResultSummaryAttributes
   */
  @JsonAnySetter
  public SyntheticsTestResultSummaryAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultSummaryAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultSummaryAttributes syntheticsTestResultSummaryAttributes =
        (SyntheticsTestResultSummaryAttributes) o;
    return Objects.equals(this.device, syntheticsTestResultSummaryAttributes.device)
        && Objects.equals(this.executionInfo, syntheticsTestResultSummaryAttributes.executionInfo)
        && Objects.equals(this.finishedAt, syntheticsTestResultSummaryAttributes.finishedAt)
        && Objects.equals(this.location, syntheticsTestResultSummaryAttributes.location)
        && Objects.equals(this.runType, syntheticsTestResultSummaryAttributes.runType)
        && Objects.equals(this.startedAt, syntheticsTestResultSummaryAttributes.startedAt)
        && Objects.equals(this.status, syntheticsTestResultSummaryAttributes.status)
        && Objects.equals(this.stepsInfo, syntheticsTestResultSummaryAttributes.stepsInfo)
        && Objects.equals(this.testSubType, syntheticsTestResultSummaryAttributes.testSubType)
        && Objects.equals(this.testType, syntheticsTestResultSummaryAttributes.testType)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultSummaryAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        device,
        executionInfo,
        finishedAt,
        location,
        runType,
        startedAt,
        status,
        stepsInfo,
        testSubType,
        testType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultSummaryAttributes {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    executionInfo: ").append(toIndentedString(executionInfo)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stepsInfo: ").append(toIndentedString(stepsInfo)).append("\n");
    sb.append("    testSubType: ").append(toIndentedString(testSubType)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
