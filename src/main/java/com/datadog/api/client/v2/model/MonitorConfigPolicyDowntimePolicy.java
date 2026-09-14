/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Downtime duration attributes of a monitor configuration policy. */
@JsonPropertyOrder({MonitorConfigPolicyDowntimePolicy.JSON_PROPERTY_MAX_DURATION_MS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorConfigPolicyDowntimePolicy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX_DURATION_MS = "max_duration_ms";
  private Long maxDurationMs;

  public MonitorConfigPolicyDowntimePolicy() {}

  @JsonCreator
  public MonitorConfigPolicyDowntimePolicy(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_DURATION_MS) Long maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
  }

  public MonitorConfigPolicyDowntimePolicy maxDurationMs(Long maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
    return this;
  }

  /**
   * The maximum allowed downtime duration, in milliseconds. minimum: 1
   *
   * @return maxDurationMs
   */
  @JsonProperty(JSON_PROPERTY_MAX_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMaxDurationMs() {
    return maxDurationMs;
  }

  public void setMaxDurationMs(Long maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
  }

  /** Return true if this MonitorConfigPolicyDowntimePolicy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorConfigPolicyDowntimePolicy monitorConfigPolicyDowntimePolicy =
        (MonitorConfigPolicyDowntimePolicy) o;
    return Objects.equals(this.maxDurationMs, monitorConfigPolicyDowntimePolicy.maxDurationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDurationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorConfigPolicyDowntimePolicy {\n");
    sb.append("    maxDurationMs: ").append(toIndentedString(maxDurationMs)).append("\n");
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
