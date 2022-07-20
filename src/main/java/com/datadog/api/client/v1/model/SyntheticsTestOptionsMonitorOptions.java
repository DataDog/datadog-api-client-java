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

/**
 * Object containing the options for a Synthetic test as a monitor (for example, renotification).
 */
@JsonPropertyOrder({SyntheticsTestOptionsMonitorOptions.JSON_PROPERTY_RENOTIFY_INTERVAL})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestOptionsMonitorOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RENOTIFY_INTERVAL = "renotify_interval";
  private Long renotifyInterval;

  public SyntheticsTestOptionsMonitorOptions renotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
    return this;
  }

  /**
   * Time interval before renotifying if the test is still failing (in minutes). minimum: 0 maximum:
   * 1440
   *
   * @return renotifyInterval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENOTIFY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRenotifyInterval() {
    return renotifyInterval;
  }

  public void setRenotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
  }

  /** Return true if this SyntheticsTestOptionsMonitorOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestOptionsMonitorOptions syntheticsTestOptionsMonitorOptions =
        (SyntheticsTestOptionsMonitorOptions) o;
    return Objects.equals(
        this.renotifyInterval, syntheticsTestOptionsMonitorOptions.renotifyInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renotifyInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptionsMonitorOptions {\n");
    sb.append("    renotifyInterval: ").append(toIndentedString(renotifyInterval)).append("\n");
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
