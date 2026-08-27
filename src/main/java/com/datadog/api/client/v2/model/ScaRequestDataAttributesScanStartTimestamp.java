/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The time when the SCA scan started. */
@JsonPropertyOrder({
  ScaRequestDataAttributesScanStartTimestamp.JSON_PROPERTY_NANOS,
  ScaRequestDataAttributesScanStartTimestamp.JSON_PROPERTY_SECONDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScaRequestDataAttributesScanStartTimestamp {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NANOS = "nanos";
  private Integer nanos;

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private Long seconds;

  public ScaRequestDataAttributesScanStartTimestamp nanos(Integer nanos) {
    this.nanos = nanos;
    return this;
  }

  /**
   * Non-negative fractions of a second at nanosecond resolution. minimum: 0 maximum: 999999999
   *
   * @return nanos
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NANOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getNanos() {
    return nanos;
  }

  public void setNanos(Integer nanos) {
    this.nanos = nanos;
  }

  public ScaRequestDataAttributesScanStartTimestamp seconds(Long seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * Seconds of UTC time since Unix epoch.
   *
   * @return seconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSeconds() {
    return seconds;
  }

  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }

  /** Return true if this ScaRequestDataAttributesScanStartTimestamp object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaRequestDataAttributesScanStartTimestamp scaRequestDataAttributesScanStartTimestamp =
        (ScaRequestDataAttributesScanStartTimestamp) o;
    return Objects.equals(this.nanos, scaRequestDataAttributesScanStartTimestamp.nanos)
        && Objects.equals(this.seconds, scaRequestDataAttributesScanStartTimestamp.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nanos, seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaRequestDataAttributesScanStartTimestamp {\n");
    sb.append("    nanos: ").append(toIndentedString(nanos)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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
