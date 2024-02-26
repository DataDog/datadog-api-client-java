/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object with the result of the last browser test run. */
@JsonPropertyOrder({
  SyntheticsBrowserTestResultShortResult.JSON_PROPERTY_DEVICE,
  SyntheticsBrowserTestResultShortResult.JSON_PROPERTY_DURATION,
  SyntheticsBrowserTestResultShortResult.JSON_PROPERTY_ERROR_COUNT,
  SyntheticsBrowserTestResultShortResult.JSON_PROPERTY_STEP_COUNT_COMPLETED,
  SyntheticsBrowserTestResultShortResult.JSON_PROPERTY_STEP_COUNT_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBrowserTestResultShortResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEVICE = "device";
  private SyntheticsDevice device;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_ERROR_COUNT = "errorCount";
  private Long errorCount;

  public static final String JSON_PROPERTY_STEP_COUNT_COMPLETED = "stepCountCompleted";
  private Long stepCountCompleted;

  public static final String JSON_PROPERTY_STEP_COUNT_TOTAL = "stepCountTotal";
  private Long stepCountTotal;

  public SyntheticsBrowserTestResultShortResult device(SyntheticsDevice device) {
    this.device = device;
    this.unparsed |= device.unparsed;
    return this;
  }

  /**
   * Object describing the device used to perform the Synthetic test.
   *
   * @return device
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsDevice getDevice() {
    return device;
  }

  public void setDevice(SyntheticsDevice device) {
    this.device = device;
  }

  public SyntheticsBrowserTestResultShortResult duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Length in milliseconds of the browser test run.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public SyntheticsBrowserTestResultShortResult errorCount(Long errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * Amount of errors collected for a single browser test run.
   *
   * @return errorCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Long errorCount) {
    this.errorCount = errorCount;
  }

  public SyntheticsBrowserTestResultShortResult stepCountCompleted(Long stepCountCompleted) {
    this.stepCountCompleted = stepCountCompleted;
    return this;
  }

  /**
   * Amount of browser test steps completed before failing.
   *
   * @return stepCountCompleted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_COUNT_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStepCountCompleted() {
    return stepCountCompleted;
  }

  public void setStepCountCompleted(Long stepCountCompleted) {
    this.stepCountCompleted = stepCountCompleted;
  }

  public SyntheticsBrowserTestResultShortResult stepCountTotal(Long stepCountTotal) {
    this.stepCountTotal = stepCountTotal;
    return this;
  }

  /**
   * Total amount of browser test steps.
   *
   * @return stepCountTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_COUNT_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStepCountTotal() {
    return stepCountTotal;
  }

  public void setStepCountTotal(Long stepCountTotal) {
    this.stepCountTotal = stepCountTotal;
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
   * @return SyntheticsBrowserTestResultShortResult
   */
  @JsonAnySetter
  public SyntheticsBrowserTestResultShortResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsBrowserTestResultShortResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestResultShortResult syntheticsBrowserTestResultShortResult =
        (SyntheticsBrowserTestResultShortResult) o;
    return Objects.equals(this.device, syntheticsBrowserTestResultShortResult.device)
        && Objects.equals(this.duration, syntheticsBrowserTestResultShortResult.duration)
        && Objects.equals(this.errorCount, syntheticsBrowserTestResultShortResult.errorCount)
        && Objects.equals(
            this.stepCountCompleted, syntheticsBrowserTestResultShortResult.stepCountCompleted)
        && Objects.equals(
            this.stepCountTotal, syntheticsBrowserTestResultShortResult.stepCountTotal)
        && Objects.equals(
            this.additionalProperties, syntheticsBrowserTestResultShortResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        device, duration, errorCount, stepCountCompleted, stepCountTotal, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestResultShortResult {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    stepCountCompleted: ").append(toIndentedString(stepCountCompleted)).append("\n");
    sb.append("    stepCountTotal: ").append(toIndentedString(stepCountTotal)).append("\n");
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
