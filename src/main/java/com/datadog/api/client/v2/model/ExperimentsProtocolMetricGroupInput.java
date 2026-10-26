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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A metric group supplied by the protocol. Empty decision groups are removed. */
@JsonPropertyOrder({
  ExperimentsProtocolMetricGroupInput.JSON_PROPERTY_IS_DECISION,
  ExperimentsProtocolMetricGroupInput.JSON_PROPERTY_METRICS,
  ExperimentsProtocolMetricGroupInput.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsProtocolMetricGroupInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_DECISION = "is_decision";
  private Boolean isDecision;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private JsonNullable<List<ExperimentsProtocolMetricInput>> metrics =
      JsonNullable.<List<ExperimentsProtocolMetricInput>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ExperimentsProtocolMetricGroupInput isDecision(Boolean isDecision) {
    this.isDecision = isDecision;
    return this;
  }

  /**
   * Whether this group contains decision metrics.
   *
   * @return isDecision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDecision() {
    return isDecision;
  }

  public void setIsDecision(Boolean isDecision) {
    this.isDecision = isDecision;
  }

  public ExperimentsProtocolMetricGroupInput metrics(List<ExperimentsProtocolMetricInput> metrics) {
    this.metrics = JsonNullable.<List<ExperimentsProtocolMetricInput>>of(metrics);
    return this;
  }

  public ExperimentsProtocolMetricGroupInput addMetricsItem(
      ExperimentsProtocolMetricInput metricsItem) {
    if (this.metrics == null || !this.metrics.isPresent()) {
      this.metrics = JsonNullable.<List<ExperimentsProtocolMetricInput>>of(new ArrayList<>());
    }
    try {
      this.metrics.get().add(metricsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Metrics in the group.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<ExperimentsProtocolMetricInput> getMetrics() {
    return metrics.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ExperimentsProtocolMetricInput>> getMetrics_JsonNullable() {
    return metrics;
  }

  @JsonProperty(JSON_PROPERTY_METRICS)
  public void setMetrics_JsonNullable(JsonNullable<List<ExperimentsProtocolMetricInput>> metrics) {
    this.metrics = metrics;
  }

  public void setMetrics(List<ExperimentsProtocolMetricInput> metrics) {
    this.metrics = JsonNullable.<List<ExperimentsProtocolMetricInput>>of(metrics);
  }

  public ExperimentsProtocolMetricGroupInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Metric group name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return ExperimentsProtocolMetricGroupInput
   */
  @JsonAnySetter
  public ExperimentsProtocolMetricGroupInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsProtocolMetricGroupInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsProtocolMetricGroupInput experimentsProtocolMetricGroupInput =
        (ExperimentsProtocolMetricGroupInput) o;
    return Objects.equals(this.isDecision, experimentsProtocolMetricGroupInput.isDecision)
        && Objects.equals(this.metrics, experimentsProtocolMetricGroupInput.metrics)
        && Objects.equals(this.name, experimentsProtocolMetricGroupInput.name)
        && Objects.equals(
            this.additionalProperties, experimentsProtocolMetricGroupInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDecision, metrics, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsProtocolMetricGroupInput {\n");
    sb.append("    isDecision: ").append(toIndentedString(isDecision)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
