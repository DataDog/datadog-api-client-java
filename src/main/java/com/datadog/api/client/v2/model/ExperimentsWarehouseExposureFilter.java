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

/** A comparison that selects warehouse exposure data by a property. */
@JsonPropertyOrder({
  ExperimentsWarehouseExposureFilter.JSON_PROPERTY_OPERATION,
  ExperimentsWarehouseExposureFilter.JSON_PROPERTY_PROPERTY_ID,
  ExperimentsWarehouseExposureFilter.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsWarehouseExposureFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATION = "operation";
  private
  ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPointFiltersItemsOperation
      operation;

  public static final String JSON_PROPERTY_PROPERTY_ID = "property_id";
  private String propertyId;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public ExperimentsWarehouseExposureFilter() {}

  @JsonCreator
  public ExperimentsWarehouseExposureFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATION)
          ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPointFiltersItemsOperation
              operation,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY_ID) String propertyId,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.operation = operation;
    this.unparsed |= !operation.isValid();
    this.propertyId = propertyId;
    this.values = values;
  }

  public ExperimentsWarehouseExposureFilter operation(
      ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPointFiltersItemsOperation
          operation) {
    this.operation = operation;
    this.unparsed |= !operation.isValid();
    return this;
  }

  /**
   * Comparison applied by the warehouse entry-point filter.
   *
   * @return operation
   */
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public
  ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPointFiltersItemsOperation
      getOperation() {
    return operation;
  }

  public void setOperation(
      ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPointFiltersItemsOperation
          operation) {
    if (!operation.isValid()) {
      this.unparsed = true;
    }
    this.operation = operation;
  }

  public ExperimentsWarehouseExposureFilter propertyId(String propertyId) {
    this.propertyId = propertyId;
    return this;
  }

  /**
   * Warehouse property UUID.
   *
   * @return propertyId
   */
  @JsonProperty(JSON_PROPERTY_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPropertyId() {
    return propertyId;
  }

  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }

  public ExperimentsWarehouseExposureFilter values(List<String> values) {
    this.values = values;
    return this;
  }

  public ExperimentsWarehouseExposureFilter addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Ordered values used by the filter.
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
   * @return ExperimentsWarehouseExposureFilter
   */
  @JsonAnySetter
  public ExperimentsWarehouseExposureFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsWarehouseExposureFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsWarehouseExposureFilter experimentsWarehouseExposureFilter =
        (ExperimentsWarehouseExposureFilter) o;
    return Objects.equals(this.operation, experimentsWarehouseExposureFilter.operation)
        && Objects.equals(this.propertyId, experimentsWarehouseExposureFilter.propertyId)
        && Objects.equals(this.values, experimentsWarehouseExposureFilter.values)
        && Objects.equals(
            this.additionalProperties, experimentsWarehouseExposureFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, propertyId, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsWarehouseExposureFilter {\n");
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
