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

/** A single analytics result bucket. */
@JsonPropertyOrder({
  LLMObsExperimentationAnalyticsValue.JSON_PROPERTY_BY,
  LLMObsExperimentationAnalyticsValue.JSON_PROPERTY_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentationAnalyticsValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BY = "by";
  private Map<String, Object> by = null;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private Map<String, Object> metrics = new HashMap<String, Object>();

  public LLMObsExperimentationAnalyticsValue() {}

  @JsonCreator
  public LLMObsExperimentationAnalyticsValue(
      @JsonProperty(required = true, value = JSON_PROPERTY_METRICS) Map<String, Object> metrics) {
    this.metrics = metrics;
  }

  public LLMObsExperimentationAnalyticsValue by(Map<String, Object> by) {
    this.by = by;
    return this;
  }

  public LLMObsExperimentationAnalyticsValue putByItem(String key, Object byItem) {
    if (this.by == null) {
      this.by = new HashMap<>();
    }
    this.by.put(key, byItem);
    return this;
  }

  /**
   * The group-by field values for this bucket.
   *
   * @return by
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getBy() {
    return by;
  }

  public void setBy(Map<String, Object> by) {
    this.by = by;
  }

  public LLMObsExperimentationAnalyticsValue metrics(Map<String, Object> metrics) {
    this.metrics = metrics;
    return this;
  }

  public LLMObsExperimentationAnalyticsValue putMetricsItem(String key, Object metricsItem) {
    this.metrics.put(key, metricsItem);
    return this;
  }

  /**
   * Computed metric values for this bucket.
   *
   * @return metrics
   */
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, Object> metrics) {
    this.metrics = metrics;
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
   * @return LLMObsExperimentationAnalyticsValue
   */
  @JsonAnySetter
  public LLMObsExperimentationAnalyticsValue putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentationAnalyticsValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentationAnalyticsValue llmObsExperimentationAnalyticsValue =
        (LLMObsExperimentationAnalyticsValue) o;
    return Objects.equals(this.by, llmObsExperimentationAnalyticsValue.by)
        && Objects.equals(this.metrics, llmObsExperimentationAnalyticsValue.metrics)
        && Objects.equals(
            this.additionalProperties, llmObsExperimentationAnalyticsValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, metrics, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentationAnalyticsValue {\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
