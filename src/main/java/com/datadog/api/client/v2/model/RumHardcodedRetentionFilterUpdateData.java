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

/** The hardcoded retention filter properties to update. */
@JsonPropertyOrder({
  RumHardcodedRetentionFilterUpdateData.JSON_PROPERTY_ATTRIBUTES,
  RumHardcodedRetentionFilterUpdateData.JSON_PROPERTY_ID,
  RumHardcodedRetentionFilterUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumHardcodedRetentionFilterUpdateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private RumHardcodedRetentionFilterUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RumHardcodedRetentionFilterType type =
      RumHardcodedRetentionFilterType.HARDCODED_RETENTION_FILTERS;

  public RumHardcodedRetentionFilterUpdateData() {}

  @JsonCreator
  public RumHardcodedRetentionFilterUpdateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          RumHardcodedRetentionFilterUpdateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          RumHardcodedRetentionFilterType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public RumHardcodedRetentionFilterUpdateData attributes(
      RumHardcodedRetentionFilterUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The attributes of a hardcoded retention filter that can be updated. Only fields whose matching
   * flag in <code>cross_product_sampling_editability</code> is <code>true</code> can be modified.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumHardcodedRetentionFilterUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(RumHardcodedRetentionFilterUpdateAttributes attributes) {
    this.attributes = attributes;
  }

  public RumHardcodedRetentionFilterUpdateData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the hardcoded retention filter. Must match the <code>rf_id</code> path parameter.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RumHardcodedRetentionFilterUpdateData type(RumHardcodedRetentionFilterType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The resource type. The value must be <code>hardcoded_retention_filters</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumHardcodedRetentionFilterType getType() {
    return type;
  }

  public void setType(RumHardcodedRetentionFilterType type) {
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
   * @return RumHardcodedRetentionFilterUpdateData
   */
  @JsonAnySetter
  public RumHardcodedRetentionFilterUpdateData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumHardcodedRetentionFilterUpdateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumHardcodedRetentionFilterUpdateData rumHardcodedRetentionFilterUpdateData =
        (RumHardcodedRetentionFilterUpdateData) o;
    return Objects.equals(this.attributes, rumHardcodedRetentionFilterUpdateData.attributes)
        && Objects.equals(this.id, rumHardcodedRetentionFilterUpdateData.id)
        && Objects.equals(this.type, rumHardcodedRetentionFilterUpdateData.type)
        && Objects.equals(
            this.additionalProperties, rumHardcodedRetentionFilterUpdateData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumHardcodedRetentionFilterUpdateData {\n");
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
