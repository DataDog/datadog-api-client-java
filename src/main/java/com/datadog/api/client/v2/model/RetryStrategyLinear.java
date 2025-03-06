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

/** The definition of <code>RetryStrategyLinear</code> object. */
@JsonPropertyOrder({
  RetryStrategyLinear.JSON_PROPERTY_INTERVAL,
  RetryStrategyLinear.JSON_PROPERTY_MAX_RETRIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetryStrategyLinear {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private String interval;

  public static final String JSON_PROPERTY_MAX_RETRIES = "maxRetries";
  private Double maxRetries;

  public RetryStrategyLinear() {}

  @JsonCreator
  public RetryStrategyLinear(
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERVAL) String interval,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_RETRIES) Double maxRetries) {
    this.interval = interval;
    this.maxRetries = maxRetries;
  }

  public RetryStrategyLinear interval(String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The <code>RetryStrategyLinear</code> <code>interval</code>. The expected format is the number
   * of seconds ending with an s. For example, 1 day is 86400s
   *
   * @return interval
   */
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public RetryStrategyLinear maxRetries(Double maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

  /**
   * The <code>RetryStrategyLinear</code> <code>maxRetries</code>.
   *
   * @return maxRetries
   */
  @JsonProperty(JSON_PROPERTY_MAX_RETRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(Double maxRetries) {
    this.maxRetries = maxRetries;
  }

  /** Return true if this RetryStrategyLinear object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryStrategyLinear retryStrategyLinear = (RetryStrategyLinear) o;
    return Objects.equals(this.interval, retryStrategyLinear.interval)
        && Objects.equals(this.maxRetries, retryStrategyLinear.maxRetries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, maxRetries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryStrategyLinear {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
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
