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

/** Custom attribute resource attributes */
@JsonPropertyOrder({
  CustomAttributeConfigResourceAttributes.JSON_PROPERTY_CASE_TYPE_ID,
  CustomAttributeConfigResourceAttributes.JSON_PROPERTY_DESCRIPTION,
  CustomAttributeConfigResourceAttributes.JSON_PROPERTY_DISPLAY_NAME,
  CustomAttributeConfigResourceAttributes.JSON_PROPERTY_IS_MULTI,
  CustomAttributeConfigResourceAttributes.JSON_PROPERTY_KEY,
  CustomAttributeConfigResourceAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomAttributeConfigResourceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASE_TYPE_ID = "case_type_id";
  private String caseTypeId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_IS_MULTI = "is_multi";
  private Boolean isMulti;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomAttributeType type;

  public CustomAttributeConfigResourceAttributes() {}

  @JsonCreator
  public CustomAttributeConfigResourceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CASE_TYPE_ID) String caseTypeId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_MULTI) Boolean isMulti,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CustomAttributeType type) {
    this.caseTypeId = caseTypeId;
    this.displayName = displayName;
    this.isMulti = isMulti;
    this.key = key;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CustomAttributeConfigResourceAttributes caseTypeId(String caseTypeId) {
    this.caseTypeId = caseTypeId;
    return this;
  }

  /**
   * Custom attribute config identifier.
   *
   * @return caseTypeId
   */
  @JsonProperty(JSON_PROPERTY_CASE_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCaseTypeId() {
    return caseTypeId;
  }

  public void setCaseTypeId(String caseTypeId) {
    this.caseTypeId = caseTypeId;
  }

  public CustomAttributeConfigResourceAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Custom attribute description.
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

  public CustomAttributeConfigResourceAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Custom attribute name.
   *
   * @return displayName
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CustomAttributeConfigResourceAttributes isMulti(Boolean isMulti) {
    this.isMulti = isMulti;
    return this;
  }

  /**
   * Whether multiple values can be set
   *
   * @return isMulti
   */
  @JsonProperty(JSON_PROPERTY_IS_MULTI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsMulti() {
    return isMulti;
  }

  public void setIsMulti(Boolean isMulti) {
    this.isMulti = isMulti;
  }

  public CustomAttributeConfigResourceAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Custom attribute key. This will be the value use to search on this custom attribute
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CustomAttributeConfigResourceAttributes type(CustomAttributeType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Custom attributes type
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomAttributeType getType() {
    return type;
  }

  public void setType(CustomAttributeType type) {
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
   * @return CustomAttributeConfigResourceAttributes
   */
  @JsonAnySetter
  public CustomAttributeConfigResourceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomAttributeConfigResourceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributeConfigResourceAttributes customAttributeConfigResourceAttributes =
        (CustomAttributeConfigResourceAttributes) o;
    return Objects.equals(this.caseTypeId, customAttributeConfigResourceAttributes.caseTypeId)
        && Objects.equals(this.description, customAttributeConfigResourceAttributes.description)
        && Objects.equals(this.displayName, customAttributeConfigResourceAttributes.displayName)
        && Objects.equals(this.isMulti, customAttributeConfigResourceAttributes.isMulti)
        && Objects.equals(this.key, customAttributeConfigResourceAttributes.key)
        && Objects.equals(this.type, customAttributeConfigResourceAttributes.type)
        && Objects.equals(
            this.additionalProperties,
            customAttributeConfigResourceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        caseTypeId, description, displayName, isMulti, key, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributeConfigResourceAttributes {\n");
    sb.append("    caseTypeId: ").append(toIndentedString(caseTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isMulti: ").append(toIndentedString(isMulti)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
