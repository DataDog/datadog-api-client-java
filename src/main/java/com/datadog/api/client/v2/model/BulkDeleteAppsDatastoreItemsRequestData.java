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

/** Data wrapper containing the data needed to delete items from a datastore. */
@JsonPropertyOrder({
  BulkDeleteAppsDatastoreItemsRequestData.JSON_PROPERTY_ATTRIBUTES,
  BulkDeleteAppsDatastoreItemsRequestData.JSON_PROPERTY_ID,
  BulkDeleteAppsDatastoreItemsRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BulkDeleteAppsDatastoreItemsRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private BulkDeleteAppsDatastoreItemsRequestDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private BulkDeleteAppsDatastoreItemsRequestDataType type =
      BulkDeleteAppsDatastoreItemsRequestDataType.ITEMS;

  public BulkDeleteAppsDatastoreItemsRequestData() {}

  @JsonCreator
  public BulkDeleteAppsDatastoreItemsRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          BulkDeleteAppsDatastoreItemsRequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public BulkDeleteAppsDatastoreItemsRequestData attributes(
      BulkDeleteAppsDatastoreItemsRequestDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of request data to delete items from a datastore.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BulkDeleteAppsDatastoreItemsRequestDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(BulkDeleteAppsDatastoreItemsRequestDataAttributes attributes) {
    this.attributes = attributes;
  }

  public BulkDeleteAppsDatastoreItemsRequestData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID for the datastore of the items to delete.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BulkDeleteAppsDatastoreItemsRequestData type(
      BulkDeleteAppsDatastoreItemsRequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Items resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BulkDeleteAppsDatastoreItemsRequestDataType getType() {
    return type;
  }

  public void setType(BulkDeleteAppsDatastoreItemsRequestDataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return BulkDeleteAppsDatastoreItemsRequestData
   */
  @JsonAnySetter
  public BulkDeleteAppsDatastoreItemsRequestData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this BulkDeleteAppsDatastoreItemsRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDeleteAppsDatastoreItemsRequestData bulkDeleteAppsDatastoreItemsRequestData =
        (BulkDeleteAppsDatastoreItemsRequestData) o;
    return Objects.equals(this.attributes, bulkDeleteAppsDatastoreItemsRequestData.attributes)
        && Objects.equals(this.id, bulkDeleteAppsDatastoreItemsRequestData.id)
        && Objects.equals(this.type, bulkDeleteAppsDatastoreItemsRequestData.type)
        && Objects.equals(
            this.additionalProperties,
            bulkDeleteAppsDatastoreItemsRequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDeleteAppsDatastoreItemsRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
