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

/** The new permanent RUM retention filter configuration to update. */
@JsonPropertyOrder({
  RUMPermanentRetentionFilterUpdateData.JSON_PROPERTY_ATTRIBUTES,
  RUMPermanentRetentionFilterUpdateData.JSON_PROPERTY_ID,
  RUMPermanentRetentionFilterUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMPermanentRetentionFilterUpdateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private RUMPermanentRetentionFilterUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private RUMPermanentRetentionFilterID id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RUMPermanentRetentionFilterType type =
      RUMPermanentRetentionFilterType.PERMANENT_RETENTION_FILTERS;

  public RUMPermanentRetentionFilterUpdateData() {}

  @JsonCreator
  public RUMPermanentRetentionFilterUpdateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          RUMPermanentRetentionFilterUpdateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) RUMPermanentRetentionFilterID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          RUMPermanentRetentionFilterType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.unparsed |= !id.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public RUMPermanentRetentionFilterUpdateData attributes(
      RUMPermanentRetentionFilterUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The configuration to update on a permanent RUM retention filter.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RUMPermanentRetentionFilterUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(RUMPermanentRetentionFilterUpdateAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public RUMPermanentRetentionFilterUpdateData id(RUMPermanentRetentionFilterID id) {
    this.id = id;
    this.unparsed |= !id.isValid();
    return this;
  }

  /**
   * The identifier of a permanent RUM retention filter.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RUMPermanentRetentionFilterID getId() {
    return id;
  }

  public void setId(RUMPermanentRetentionFilterID id) {
    if (!id.isValid()) {
      this.unparsed = true;
    }
    this.id = id;
  }

  public RUMPermanentRetentionFilterUpdateData type(RUMPermanentRetentionFilterType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the resource. The value should always be <code>permanent_retention_filters</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RUMPermanentRetentionFilterType getType() {
    return type;
  }

  public void setType(RUMPermanentRetentionFilterType type) {
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
   * @return RUMPermanentRetentionFilterUpdateData
   */
  @JsonAnySetter
  public RUMPermanentRetentionFilterUpdateData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMPermanentRetentionFilterUpdateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMPermanentRetentionFilterUpdateData rumPermanentRetentionFilterUpdateData =
        (RUMPermanentRetentionFilterUpdateData) o;
    return Objects.equals(this.attributes, rumPermanentRetentionFilterUpdateData.attributes)
        && Objects.equals(this.id, rumPermanentRetentionFilterUpdateData.id)
        && Objects.equals(this.type, rumPermanentRetentionFilterUpdateData.type)
        && Objects.equals(
            this.additionalProperties, rumPermanentRetentionFilterUpdateData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMPermanentRetentionFilterUpdateData {\n");
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
