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

/** Key/Value pair of attributes used for update request. */
@JsonPropertyOrder({
  AuthNMappingUpdateAttributes.JSON_PROPERTY_ATTRIBUTE_KEY,
  AuthNMappingUpdateAttributes.JSON_PROPERTY_ATTRIBUTE_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTE_KEY = "attribute_key";
  private String attributeKey;

  public static final String JSON_PROPERTY_ATTRIBUTE_VALUE = "attribute_value";
  private String attributeValue;

  public AuthNMappingUpdateAttributes attributeKey(String attributeKey) {
    this.attributeKey = attributeKey;
    return this;
  }

  /**
   * Key portion of a key/value pair of the attribute sent from the Identity Provider.
   *
   * @return attributeKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAttributeKey() {
    return attributeKey;
  }

  public void setAttributeKey(String attributeKey) {
    this.attributeKey = attributeKey;
  }

  public AuthNMappingUpdateAttributes attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * Value portion of a key/value pair of the attribute sent from the Identity Provider.
   *
   * @return attributeValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
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
   * @return AuthNMappingUpdateAttributes
   */
  @JsonAnySetter
  public AuthNMappingUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AuthNMappingUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMappingUpdateAttributes authNMappingUpdateAttributes = (AuthNMappingUpdateAttributes) o;
    return Objects.equals(this.attributeKey, authNMappingUpdateAttributes.attributeKey)
        && Objects.equals(this.attributeValue, authNMappingUpdateAttributes.attributeValue)
        && Objects.equals(
            this.additionalProperties, authNMappingUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeKey, attributeValue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingUpdateAttributes {\n");
    sb.append("    attributeKey: ").append(toIndentedString(attributeKey)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
