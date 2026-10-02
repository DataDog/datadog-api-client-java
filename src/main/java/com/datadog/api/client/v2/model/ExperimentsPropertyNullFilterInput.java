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

/** A property comparison for metric source data. */
@JsonPropertyOrder({
  ExperimentsPropertyNullFilterInput.JSON_PROPERTY_MEASURE_ID,
  ExperimentsPropertyNullFilterInput.JSON_PROPERTY_OPERATION,
  ExperimentsPropertyNullFilterInput.JSON_PROPERTY_PROPERTY_ID,
  ExperimentsPropertyNullFilterInput.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPropertyNullFilterInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MEASURE_ID = "measure_id";
  private JsonNullable<String> measureId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private ExperimentsPropertyNullFilterInputOperation operation;

  public static final String JSON_PROPERTY_PROPERTY_ID = "property_id";
  private UUID propertyId;

  public static final String JSON_PROPERTY_VALUES = "values";
  private JsonNullable<List<String>> values = JsonNullable.<List<String>>undefined();

  public ExperimentsPropertyNullFilterInput() {}

  @JsonCreator
  public ExperimentsPropertyNullFilterInput(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATION)
          ExperimentsPropertyNullFilterInputOperation operation,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY_ID) UUID propertyId) {
    this.operation = operation;
    this.unparsed |= !operation.isValid();
    this.propertyId = propertyId;
  }

  public ExperimentsPropertyNullFilterInput measureId(String measureId) {
    this.measureId = JsonNullable.<String>of(measureId);
    return this;
  }

  /**
   * Omit this target or use null or a blank string.
   *
   * @return measureId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMeasureId() {
    return measureId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEASURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMeasureId_JsonNullable() {
    return measureId;
  }

  @JsonProperty(JSON_PROPERTY_MEASURE_ID)
  public void setMeasureId_JsonNullable(JsonNullable<String> measureId) {
    this.measureId = measureId;
  }

  public void setMeasureId(String measureId) {
    this.measureId = JsonNullable.<String>of(measureId);
  }

  public ExperimentsPropertyNullFilterInput operation(
      ExperimentsPropertyNullFilterInputOperation operation) {
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
  public ExperimentsPropertyNullFilterInputOperation getOperation() {
    return operation;
  }

  public void setOperation(ExperimentsPropertyNullFilterInputOperation operation) {
    if (!operation.isValid()) {
      this.unparsed = true;
    }
    this.operation = operation;
  }

  public ExperimentsPropertyNullFilterInput propertyId(UUID propertyId) {
    this.propertyId = propertyId;
    return this;
  }

  /**
   * ID of the property on the aggregation source.
   *
   * @return propertyId
   */
  @JsonProperty(JSON_PROPERTY_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getPropertyId() {
    return propertyId;
  }

  public void setPropertyId(UUID propertyId) {
    this.propertyId = propertyId;
  }

  public ExperimentsPropertyNullFilterInput values(List<String> values) {
    this.values = JsonNullable.<List<String>>of(values);
    return this;
  }

  public ExperimentsPropertyNullFilterInput addValuesItem(String valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.values.get().add(valuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Values used by the comparison.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getValues() {
    return values.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getValues_JsonNullable() {
    return values;
  }

  @JsonProperty(JSON_PROPERTY_VALUES)
  public void setValues_JsonNullable(JsonNullable<List<String>> values) {
    this.values = values;
  }

  public void setValues(List<String> values) {
    this.values = JsonNullable.<List<String>>of(values);
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
   * @return ExperimentsPropertyNullFilterInput
   */
  @JsonAnySetter
  public ExperimentsPropertyNullFilterInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsPropertyNullFilterInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPropertyNullFilterInput experimentsPropertyNullFilterInput =
        (ExperimentsPropertyNullFilterInput) o;
    return Objects.equals(this.measureId, experimentsPropertyNullFilterInput.measureId)
        && Objects.equals(this.operation, experimentsPropertyNullFilterInput.operation)
        && Objects.equals(this.propertyId, experimentsPropertyNullFilterInput.propertyId)
        && Objects.equals(this.values, experimentsPropertyNullFilterInput.values)
        && Objects.equals(
            this.additionalProperties, experimentsPropertyNullFilterInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measureId, operation, propertyId, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPropertyNullFilterInput {\n");
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
