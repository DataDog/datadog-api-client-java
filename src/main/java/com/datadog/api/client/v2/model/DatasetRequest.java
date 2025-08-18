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

/**
 * <strong>Datasets Object Constraints</strong> - <strong>Tag limit per dataset</strong>: - Each
 * restricted dataset supports a maximum of 10 key:value pairs per product.
 *
 * <ul>
 *   <li><strong>Tag key rules per telemetry type</strong>:
 *   <li>Only one tag key or attribute may be used to define access within a single telemetry type.
 *   <li>
 *       <p>The same or different tag key may be used across different telemetry types.
 *   <li>
 *       <p><strong>Tag value uniqueness</strong>:
 *   <li>Tag values must be unique within a single dataset.
 *   <li>A tag value used in one dataset cannot be reused in another dataset of the same telemetry
 *       type.
 * </ul>
 */
@JsonPropertyOrder({DatasetRequest.JSON_PROPERTY_ATTRIBUTES, DatasetRequest.JSON_PROPERTY_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatasetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private DatasetAttributesRequest attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DatasetType type = DatasetType.DATASET;

  public DatasetRequest() {}

  @JsonCreator
  public DatasetRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          DatasetAttributesRequest attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DatasetType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DatasetRequest attributes(DatasetAttributesRequest attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Dataset metadata and configurations.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatasetAttributesRequest getAttributes() {
    return attributes;
  }

  public void setAttributes(DatasetAttributesRequest attributes) {
    this.attributes = attributes;
  }

  public DatasetRequest type(DatasetType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Resource type, always set to <code>dataset</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatasetType getType() {
    return type;
  }

  public void setType(DatasetType type) {
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
   * @return DatasetRequest
   */
  @JsonAnySetter
  public DatasetRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DatasetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetRequest datasetRequest = (DatasetRequest) o;
    return Objects.equals(this.attributes, datasetRequest.attributes)
        && Objects.equals(this.type, datasetRequest.type)
        && Objects.equals(this.additionalProperties, datasetRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetRequest {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
