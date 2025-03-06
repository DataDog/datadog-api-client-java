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

/** Defines a rate limit for a trigger. */
@JsonPropertyOrder({TriggerRateLimit.JSON_PROPERTY_COUNT, TriggerRateLimit.JSON_PROPERTY_INTERVAL})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TriggerRateLimit {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private String interval;

  public TriggerRateLimit count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * The <code>TriggerRateLimit</code> <code>count</code>.
   *
   * @return count
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public TriggerRateLimit interval(String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The <code>TriggerRateLimit</code> <code>interval</code>. The expected format is the number of
   * seconds ending with an s. For example, 1 day is 86400s
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  /** Return true if this TriggerRateLimit object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerRateLimit triggerRateLimit = (TriggerRateLimit) o;
    return Objects.equals(this.count, triggerRateLimit.count)
        && Objects.equals(this.interval, triggerRateLimit.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerRateLimit {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
