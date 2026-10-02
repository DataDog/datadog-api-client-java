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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** A measure comparison for metric source data. */
@JsonPropertyOrder({
  ExperimentsMeasureRangeFilterInput.JSON_PROPERTY_MEASURE_ID,
  ExperimentsMeasureRangeFilterInput.JSON_PROPERTY_OPERATION,
  ExperimentsMeasureRangeFilterInput.JSON_PROPERTY_PROPERTY_ID,
  ExperimentsMeasureRangeFilterInput.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMeasureRangeFilterInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MEASURE_ID = "measure_id";
  private UUID measureId;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private ExperimentsMeasureRangeFilterInputOperation operation;

  public static final String JSON_PROPERTY_PROPERTY_ID = "property_id";
  private JsonNullable<String> propertyId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public ExperimentsMeasureRangeFilterInput() {}

  @JsonCreator
  public ExperimentsMeasureRangeFilterInput(
      @JsonProperty(required = true, value = JSON_PROPERTY_MEASURE_ID) UUID measureId,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATION)
          ExperimentsMeasureRangeFilterInputOperation operation,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.measureId = measureId;
    this.operation = operation;
    this.unparsed |= !operation.isValid();
    this.values = values;
  }

  public ExperimentsMeasureRangeFilterInput measureId(UUID measureId) {
    this.measureId = measureId;
    return this;
  }

  /**
   * ID of the measure on the aggregation source.
   *
   * @return measureId
   */
  @JsonProperty(JSON_PROPERTY_MEASURE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getMeasureId() {
    return measureId;
  }

  public void setMeasureId(UUID measureId) {
    this.measureId = measureId;
  }

  public ExperimentsMeasureRangeFilterInput operation(
      ExperimentsMeasureRangeFilterInputOperation operation) {
    this.operation = operation;
    this.unparsed |= !operation.isValid();
    return this;
  }

  /**
   * Comparison applied by this filter.
   *
   * @return operation
   */
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsMeasureRangeFilterInputOperation getOperation() {
    return operation;
  }

  public void setOperation(ExperimentsMeasureRangeFilterInputOperation operation) {
    if (!operation.isValid()) {
      this.unparsed = true;
    }
    this.operation = operation;
  }

  public ExperimentsMeasureRangeFilterInput propertyId(String propertyId) {
    this.propertyId = JsonNullable.<String>of(propertyId);
    return this;
  }

  /**
   * Omit this target or use null or a blank string.
   *
   * @return propertyId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPropertyId() {
    return propertyId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPropertyId_JsonNullable() {
    return propertyId;
  }

  @JsonProperty(JSON_PROPERTY_PROPERTY_ID)
  public void setPropertyId_JsonNullable(JsonNullable<String> propertyId) {
    this.propertyId = propertyId;
  }

  public void setPropertyId(String propertyId) {
    this.propertyId = JsonNullable.<String>of(propertyId);
  }

  public ExperimentsMeasureRangeFilterInput values(List<String> values) {
    this.values = values;
    return this;
  }

  public ExperimentsMeasureRangeFilterInput addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Values used by the comparison.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return ExperimentsMeasureRangeFilterInput
   */
  @JsonAnySetter
  public ExperimentsMeasureRangeFilterInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsMeasureRangeFilterInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMeasureRangeFilterInput experimentsMeasureRangeFilterInput =
        (ExperimentsMeasureRangeFilterInput) o;
    return Objects.equals(this.measureId, experimentsMeasureRangeFilterInput.measureId)
        && Objects.equals(this.operation, experimentsMeasureRangeFilterInput.operation)
        && Objects.equals(this.propertyId, experimentsMeasureRangeFilterInput.propertyId)
        && Objects.equals(this.values, experimentsMeasureRangeFilterInput.values)
        && Objects.equals(
            this.additionalProperties, experimentsMeasureRangeFilterInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measureId, operation, propertyId, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMeasureRangeFilterInput {\n");
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
