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

/** Custom attribute values */
@JsonPropertyOrder({
  CustomAttributeValue.JSON_PROPERTY_IS_MULTI,
  CustomAttributeValue.JSON_PROPERTY_TYPE,
  CustomAttributeValue.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomAttributeValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_MULTI = "is_multi";
  private Boolean isMulti;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomAttributeType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private CustomAttributeValuesUnion value;

  public CustomAttributeValue() {}

  @JsonCreator
  public CustomAttributeValue(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_MULTI) Boolean isMulti,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CustomAttributeType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE)
          CustomAttributeValuesUnion value) {
    this.isMulti = isMulti;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.value = value;
    this.unparsed |= value.unparsed;
  }

  public CustomAttributeValue isMulti(Boolean isMulti) {
    this.isMulti = isMulti;
    return this;
  }

  /**
   * If true, value must be an array
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

  public CustomAttributeValue type(CustomAttributeType type) {
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

  public CustomAttributeValue value(CustomAttributeValuesUnion value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * Union of supported value for a custom attribute
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomAttributeValuesUnion getValue() {
    return value;
  }

  public void setValue(CustomAttributeValuesUnion value) {
    this.value = value;
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
   * @return CustomAttributeValue
   */
  @JsonAnySetter
  public CustomAttributeValue putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomAttributeValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributeValue customAttributeValue = (CustomAttributeValue) o;
    return Objects.equals(this.isMulti, customAttributeValue.isMulti)
        && Objects.equals(this.type, customAttributeValue.type)
        && Objects.equals(this.value, customAttributeValue.value)
        && Objects.equals(this.additionalProperties, customAttributeValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMulti, type, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributeValue {\n");
    sb.append("    isMulti: ").append(toIndentedString(isMulti)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
