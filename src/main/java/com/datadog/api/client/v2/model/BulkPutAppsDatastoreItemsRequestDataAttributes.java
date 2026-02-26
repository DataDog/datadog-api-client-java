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

/** Configuration for bulk inserting multiple items into a datastore. */
@JsonPropertyOrder({
  BulkPutAppsDatastoreItemsRequestDataAttributes.JSON_PROPERTY_CONFLICT_MODE,
  BulkPutAppsDatastoreItemsRequestDataAttributes.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BulkPutAppsDatastoreItemsRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFLICT_MODE = "conflict_mode";
  private DatastoreItemConflictMode conflictMode;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Map<String, Object>> values = new ArrayList<>();

  public BulkPutAppsDatastoreItemsRequestDataAttributes() {}

  @JsonCreator
  public BulkPutAppsDatastoreItemsRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES)
          List<Map<String, Object>> values) {
    this.values = values;
  }

  public BulkPutAppsDatastoreItemsRequestDataAttributes conflictMode(
      DatastoreItemConflictMode conflictMode) {
    this.conflictMode = conflictMode;
    this.unparsed |= !conflictMode.isValid();
    return this;
  }

  /**
   * How to handle conflicts when inserting items that already exist in the datastore.
   *
   * @return conflictMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFLICT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatastoreItemConflictMode getConflictMode() {
    return conflictMode;
  }

  public void setConflictMode(DatastoreItemConflictMode conflictMode) {
    if (!conflictMode.isValid()) {
      this.unparsed = true;
    }
    this.conflictMode = conflictMode;
  }

  public BulkPutAppsDatastoreItemsRequestDataAttributes values(List<Map<String, Object>> values) {
    this.values = values;
    return this;
  }

  public BulkPutAppsDatastoreItemsRequestDataAttributes addValuesItem(
      Map<String, Object> valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * An array of items to add to the datastore, where each item is a set of key-value pairs
   * representing the item's data. Up to 100 items can be updated in a single request.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Map<String, Object>> getValues() {
    return values;
  }

  public void setValues(List<Map<String, Object>> values) {
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
   * @return BulkPutAppsDatastoreItemsRequestDataAttributes
   */
  @JsonAnySetter
  public BulkPutAppsDatastoreItemsRequestDataAttributes putAdditionalProperty(
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

  /** Return true if this BulkPutAppsDatastoreItemsRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPutAppsDatastoreItemsRequestDataAttributes bulkPutAppsDatastoreItemsRequestDataAttributes =
        (BulkPutAppsDatastoreItemsRequestDataAttributes) o;
    return Objects.equals(
            this.conflictMode, bulkPutAppsDatastoreItemsRequestDataAttributes.conflictMode)
        && Objects.equals(this.values, bulkPutAppsDatastoreItemsRequestDataAttributes.values)
        && Objects.equals(
            this.additionalProperties,
            bulkPutAppsDatastoreItemsRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conflictMode, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPutAppsDatastoreItemsRequestDataAttributes {\n");
    sb.append("    conflictMode: ").append(toIndentedString(conflictMode)).append("\n");
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
