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

/** Strategy that increments a generated metric based on the value of a log field. */
@JsonPropertyOrder({
  ObservabilityPipelineGeneratedMetricIncrementByField.JSON_PROPERTY_FIELD,
  ObservabilityPipelineGeneratedMetricIncrementByField.JSON_PROPERTY_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineGeneratedMetricIncrementByField {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy strategy;

  public ObservabilityPipelineGeneratedMetricIncrementByField() {}

  @JsonCreator
  public ObservabilityPipelineGeneratedMetricIncrementByField(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD) String field,
      @JsonProperty(required = true, value = JSON_PROPERTY_STRATEGY)
          ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy strategy) {
    this.field = field;
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
  }

  public ObservabilityPipelineGeneratedMetricIncrementByField field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Name of the log field containing the numeric value to increment the metric by.
   *
   * @return field
   */
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ObservabilityPipelineGeneratedMetricIncrementByField strategy(
      ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
    return this;
  }

  /**
   * Uses a numeric field in the log event as the metric increment.
   *
   * @return strategy
   */
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy strategy) {
    if (!strategy.isValid()) {
      this.unparsed = true;
    }
    this.strategy = strategy;
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
   * @return ObservabilityPipelineGeneratedMetricIncrementByField
   */
  @JsonAnySetter
  public ObservabilityPipelineGeneratedMetricIncrementByField putAdditionalProperty(
      String key, Object value) {
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

  /**
   * Return true if this ObservabilityPipelineGeneratedMetricIncrementByField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineGeneratedMetricIncrementByField
        observabilityPipelineGeneratedMetricIncrementByField =
            (ObservabilityPipelineGeneratedMetricIncrementByField) o;
    return Objects.equals(this.field, observabilityPipelineGeneratedMetricIncrementByField.field)
        && Objects.equals(
            this.strategy, observabilityPipelineGeneratedMetricIncrementByField.strategy)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineGeneratedMetricIncrementByField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, strategy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineGeneratedMetricIncrementByField {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
