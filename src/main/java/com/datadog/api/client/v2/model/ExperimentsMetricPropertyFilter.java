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

/** A comparison that selects metric data by a property or measure. */
@JsonPropertyOrder({
  ExperimentsMetricPropertyFilter.JSON_PROPERTY_MEASURE_ID,
  ExperimentsMetricPropertyFilter.JSON_PROPERTY_OPERATION,
  ExperimentsMetricPropertyFilter.JSON_PROPERTY_PROPERTY_ID,
  ExperimentsMetricPropertyFilter.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricPropertyFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MEASURE_ID = "measure_id";
  private String measureId;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_PROPERTY_ID = "property_id";
  private String propertyId;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public ExperimentsMetricPropertyFilter measureId(String measureId) {
    this.measureId = measureId;
    return this;
  }

  /**
   * ID of the measure evaluated by the filter.
   *
   * @return measureId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEASURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMeasureId() {
    return measureId;
  }

  public void setMeasureId(String measureId) {
    this.measureId = measureId;
  }

  public ExperimentsMetricPropertyFilter operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Comparison applied by the filter.
   *
   * @return operation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public ExperimentsMetricPropertyFilter propertyId(String propertyId) {
    this.propertyId = propertyId;
    return this;
  }

  /**
   * ID of the property evaluated by the filter.
   *
   * @return propertyId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPropertyId() {
    return propertyId;
  }

  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }

  public ExperimentsMetricPropertyFilter values(List<String> values) {
    this.values = values;
    return this;
  }

  public ExperimentsMetricPropertyFilter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Values used by the filter's comparison.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return ExperimentsMetricPropertyFilter
   */
  @JsonAnySetter
  public ExperimentsMetricPropertyFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsMetricPropertyFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricPropertyFilter experimentsMetricPropertyFilter =
        (ExperimentsMetricPropertyFilter) o;
    return Objects.equals(this.measureId, experimentsMetricPropertyFilter.measureId)
        && Objects.equals(this.operation, experimentsMetricPropertyFilter.operation)
        && Objects.equals(this.propertyId, experimentsMetricPropertyFilter.propertyId)
        && Objects.equals(this.values, experimentsMetricPropertyFilter.values)
        && Objects.equals(
            this.additionalProperties, experimentsMetricPropertyFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measureId, operation, propertyId, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricPropertyFilter {\n");
    sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
