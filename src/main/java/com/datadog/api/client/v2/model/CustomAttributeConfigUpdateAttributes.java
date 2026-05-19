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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes that can be updated on a custom attribute configuration. All fields are optional; only
 * provided fields are changed.
 */
@JsonPropertyOrder({
  CustomAttributeConfigUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  CustomAttributeConfigUpdateAttributes.JSON_PROPERTY_DISPLAY_NAME,
  CustomAttributeConfigUpdateAttributes.JSON_PROPERTY_MAP_FROM,
  CustomAttributeConfigUpdateAttributes.JSON_PROPERTY_TYPE,
  CustomAttributeConfigUpdateAttributes.JSON_PROPERTY_TYPE_DATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomAttributeConfigUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_MAP_FROM = "map_from";
  private String mapFrom;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomAttributeType type;

  public static final String JSON_PROPERTY_TYPE_DATA = "type_data";
  private CustomAttributeTypeData typeData;

  public CustomAttributeConfigUpdateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description explaining the purpose and expected values for this custom attribute.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomAttributeConfigUpdateAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable label shown in the Case Management UI for this custom attribute.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CustomAttributeConfigUpdateAttributes mapFrom(String mapFrom) {
    this.mapFrom = mapFrom;
    return this;
  }

  /**
   * An external field identifier to auto-populate this attribute from (used for integrations with
   * external systems).
   *
   * @return mapFrom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMapFrom() {
    return mapFrom;
  }

  public void setMapFrom(String mapFrom) {
    this.mapFrom = mapFrom;
  }

  public CustomAttributeConfigUpdateAttributes type(CustomAttributeType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The data type of the custom attribute, which determines the allowed values and UI input
   * control.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomAttributeType getType() {
    return type;
  }

  public void setType(CustomAttributeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public CustomAttributeConfigUpdateAttributes typeData(CustomAttributeTypeData typeData) {
    this.typeData = typeData;
    this.unparsed |= typeData.unparsed;
    return this;
  }

  /**
   * Type-specific configuration for the custom attribute. For SELECT-type attributes, this contains
   * the list of allowed options.
   *
   * @return typeData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomAttributeTypeData getTypeData() {
    return typeData;
  }

  public void setTypeData(CustomAttributeTypeData typeData) {
    this.typeData = typeData;
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
   * @return CustomAttributeConfigUpdateAttributes
   */
  @JsonAnySetter
  public CustomAttributeConfigUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomAttributeConfigUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributeConfigUpdateAttributes customAttributeConfigUpdateAttributes =
        (CustomAttributeConfigUpdateAttributes) o;
    return Objects.equals(this.description, customAttributeConfigUpdateAttributes.description)
        && Objects.equals(this.displayName, customAttributeConfigUpdateAttributes.displayName)
        && Objects.equals(this.mapFrom, customAttributeConfigUpdateAttributes.mapFrom)
        && Objects.equals(this.type, customAttributeConfigUpdateAttributes.type)
        && Objects.equals(this.typeData, customAttributeConfigUpdateAttributes.typeData)
        && Objects.equals(
            this.additionalProperties, customAttributeConfigUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, mapFrom, type, typeData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributeConfigUpdateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    mapFrom: ").append(toIndentedString(mapFrom)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeData: ").append(toIndentedString(typeData)).append("\n");
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
