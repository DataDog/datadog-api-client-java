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

/** Execution details for a Synthetic test result. */
@JsonPropertyOrder({
  SyntheticsTestResultExecutionInfo.JSON_PROPERTY_DURATION,
  SyntheticsTestResultExecutionInfo.JSON_PROPERTY_ERROR_MESSAGE,
  SyntheticsTestResultExecutionInfo.JSON_PROPERTY_IS_FAST_RETRY,
  SyntheticsTestResultExecutionInfo.JSON_PROPERTY_TIMINGS,
  SyntheticsTestResultExecutionInfo.JSON_PROPERTY_TUNNEL,
  SyntheticsTestResultExecutionInfo.JSON_PROPERTY_UNHEALTHY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultExecutionInfo {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private SyntheticsTestResultDuration duration;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_IS_FAST_RETRY = "is_fast_retry";
  private Boolean isFastRetry;

  public static final String JSON_PROPERTY_TIMINGS = "timings";
  private Map<String, Object> timings = null;

  public static final String JSON_PROPERTY_TUNNEL = "tunnel";
  private Boolean tunnel;

  public static final String JSON_PROPERTY_UNHEALTHY = "unhealthy";
  private Boolean unhealthy;

  public SyntheticsTestResultExecutionInfo duration(SyntheticsTestResultDuration duration) {
    this.duration = duration;
    this.unparsed |= duration.unparsed;
    return this;
  }

  /**
   * Total duration of a Synthetic test execution.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultDuration getDuration() {
    return duration;
  }

  public void setDuration(SyntheticsTestResultDuration duration) {
    this.duration = duration;
  }

  public SyntheticsTestResultExecutionInfo errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Error message if the execution encountered an issue.
   *
   * @return errorMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public SyntheticsTestResultExecutionInfo isFastRetry(Boolean isFastRetry) {
    this.isFastRetry = isFastRetry;
    return this;
  }

  /**
   * Whether this result is from a fast retry.
   *
   * @return isFastRetry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_FAST_RETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsFastRetry() {
    return isFastRetry;
  }

  public void setIsFastRetry(Boolean isFastRetry) {
    this.isFastRetry = isFastRetry;
  }

  public SyntheticsTestResultExecutionInfo timings(Map<String, Object> timings) {
    this.timings = timings;
    return this;
  }

  public SyntheticsTestResultExecutionInfo putTimingsItem(String key, Object timingsItem) {
    if (this.timings == null) {
      this.timings = new HashMap<>();
    }
    this.timings.put(key, timingsItem);
    return this;
  }

  /**
   * Timing breakdown of the test execution in milliseconds.
   *
   * @return timings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getTimings() {
    return timings;
  }

  public void setTimings(Map<String, Object> timings) {
    this.timings = timings;
  }

  public SyntheticsTestResultExecutionInfo tunnel(Boolean tunnel) {
    this.tunnel = tunnel;
    return this;
  }

  /**
   * Whether the test was executed through a tunnel.
   *
   * @return tunnel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUNNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTunnel() {
    return tunnel;
  }

  public void setTunnel(Boolean tunnel) {
    this.tunnel = tunnel;
  }

  public SyntheticsTestResultExecutionInfo unhealthy(Boolean unhealthy) {
    this.unhealthy = unhealthy;
    return this;
  }

  /**
   * Whether the location was unhealthy during execution.
   *
   * @return unhealthy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNHEALTHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUnhealthy() {
    return unhealthy;
  }

  public void setUnhealthy(Boolean unhealthy) {
    this.unhealthy = unhealthy;
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
   * @return SyntheticsTestResultExecutionInfo
   */
  @JsonAnySetter
  public SyntheticsTestResultExecutionInfo putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultExecutionInfo object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultExecutionInfo syntheticsTestResultExecutionInfo =
        (SyntheticsTestResultExecutionInfo) o;
    return Objects.equals(this.duration, syntheticsTestResultExecutionInfo.duration)
        && Objects.equals(this.errorMessage, syntheticsTestResultExecutionInfo.errorMessage)
        && Objects.equals(this.isFastRetry, syntheticsTestResultExecutionInfo.isFastRetry)
        && Objects.equals(this.timings, syntheticsTestResultExecutionInfo.timings)
        && Objects.equals(this.tunnel, syntheticsTestResultExecutionInfo.tunnel)
        && Objects.equals(this.unhealthy, syntheticsTestResultExecutionInfo.unhealthy)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultExecutionInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        duration, errorMessage, isFastRetry, timings, tunnel, unhealthy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultExecutionInfo {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    isFastRetry: ").append(toIndentedString(isFastRetry)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
    sb.append("    tunnel: ").append(toIndentedString(tunnel)).append("\n");
    sb.append("    unhealthy: ").append(toIndentedString(unhealthy)).append("\n");
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
