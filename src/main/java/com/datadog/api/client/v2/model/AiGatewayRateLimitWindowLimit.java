/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A limit on one metric over a rolling window longer than a minute. */
@JsonPropertyOrder({
  AiGatewayRateLimitWindowLimit.JSON_PROPERTY_AMOUNT,
  AiGatewayRateLimitWindowLimit.JSON_PROPERTY_METRIC,
  AiGatewayRateLimitWindowLimit.JSON_PROPERTY_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRateLimitWindowLimit {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private AiGatewayRateLimitWindowLimitMetric metric;

  public static final String JSON_PROPERTY_WINDOW = "window";
  private AiGatewayRateLimitWindowLimitWindow window;

  public AiGatewayRateLimitWindowLimit() {}

  @JsonCreator
  public AiGatewayRateLimitWindowLimit(
      @JsonProperty(required = true, value = JSON_PROPERTY_AMOUNT) Long amount,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC)
          AiGatewayRateLimitWindowLimitMetric metric,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW)
          AiGatewayRateLimitWindowLimitWindow window) {
    this.amount = amount;
    this.metric = metric;
    this.unparsed |= !metric.isValid();
    this.window = window;
    this.unparsed |= !window.isValid();
  }

  public AiGatewayRateLimitWindowLimit amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Maximum amount of the metric over the window. For <code>cost</code>, the amount is priced spend
   * in microcents of 1e-8 USD each, as in <code>cost_microcents_per_minute</code>. For the same
   * metric, a longer window must have a larger amount. minimum: 1
   *
   * @return amount
   */
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public AiGatewayRateLimitWindowLimit metric(AiGatewayRateLimitWindowLimitMetric metric) {
    this.metric = metric;
    this.unparsed |= !metric.isValid();
    return this;
  }

  /**
   * The metric that a window limit counts. <code>cost</code> counts priced spend in microcents.
   *
   * @return metric
   */
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayRateLimitWindowLimitMetric getMetric() {
    return metric;
  }

  public void setMetric(AiGatewayRateLimitWindowLimitMetric metric) {
    if (!metric.isValid()) {
      this.unparsed = true;
    }
    this.metric = metric;
  }

  public AiGatewayRateLimitWindowLimit window(AiGatewayRateLimitWindowLimitWindow window) {
    this.window = window;
    this.unparsed |= !window.isValid();
    return this;
  }

  /**
   * The rolling window that a limit applies to. For per-minute limits, use the <code>*_per_minute
   * </code> fields instead.
   *
   * @return window
   */
  @JsonProperty(JSON_PROPERTY_WINDOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayRateLimitWindowLimitWindow getWindow() {
    return window;
  }

  public void setWindow(AiGatewayRateLimitWindowLimitWindow window) {
    if (!window.isValid()) {
      this.unparsed = true;
    }
    this.window = window;
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
   * @return AiGatewayRateLimitWindowLimit
   */
  @JsonAnySetter
  public AiGatewayRateLimitWindowLimit putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRateLimitWindowLimit object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRateLimitWindowLimit aiGatewayRateLimitWindowLimit = (AiGatewayRateLimitWindowLimit) o;
    return Objects.equals(this.amount, aiGatewayRateLimitWindowLimit.amount)
        && Objects.equals(this.metric, aiGatewayRateLimitWindowLimit.metric)
        && Objects.equals(this.window, aiGatewayRateLimitWindowLimit.window)
        && Objects.equals(
            this.additionalProperties, aiGatewayRateLimitWindowLimit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, metric, window, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRateLimitWindowLimit {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
