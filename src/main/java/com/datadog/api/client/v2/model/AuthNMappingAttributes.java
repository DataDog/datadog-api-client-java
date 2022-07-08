/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** Attributes of AuthN Mapping. */
@JsonPropertyOrder({
  AuthNMappingAttributes.JSON_PROPERTY_ATTRIBUTE_KEY,
  AuthNMappingAttributes.JSON_PROPERTY_ATTRIBUTE_VALUE,
  AuthNMappingAttributes.JSON_PROPERTY_CREATED_AT,
  AuthNMappingAttributes.JSON_PROPERTY_MODIFIED_AT,
  AuthNMappingAttributes.JSON_PROPERTY_SAML_ASSERTION_ATTRIBUTE_ID
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTE_KEY = "attribute_key";
  private String attributeKey;

  public static final String JSON_PROPERTY_ATTRIBUTE_VALUE = "attribute_value";
  private String attributeValue;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_SAML_ASSERTION_ATTRIBUTE_ID =
      "saml_assertion_attribute_id";
  private String samlAssertionAttributeId;

  public AuthNMappingAttributes attributeKey(String attributeKey) {
    this.attributeKey = attributeKey;
    return this;
  }

  /**
   * Key portion of a key/value pair of the attribute sent from the Identity Provider.
   *
   * @return attributeKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAttributeKey() {
    return attributeKey;
  }

  public void setAttributeKey(String attributeKey) {
    this.attributeKey = attributeKey;
  }

  public AuthNMappingAttributes attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * Value portion of a key/value pair of the attribute sent from the Identity Provider.
   *
   * @return attributeValue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }

  /**
   * Creation time of the AuthN Mapping.
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Time of last AuthN Mapping modification.
   *
   * @return modifiedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public AuthNMappingAttributes samlAssertionAttributeId(String samlAssertionAttributeId) {
    this.samlAssertionAttributeId = samlAssertionAttributeId;
    return this;
  }

  /**
   * The ID of the SAML assertion attribute.
   *
   * @return samlAssertionAttributeId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML_ASSERTION_ATTRIBUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSamlAssertionAttributeId() {
    return samlAssertionAttributeId;
  }

  public void setSamlAssertionAttributeId(String samlAssertionAttributeId) {
    this.samlAssertionAttributeId = samlAssertionAttributeId;
  }

  /** Return true if this AuthNMappingAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMappingAttributes authNMappingAttributes = (AuthNMappingAttributes) o;
    return Objects.equals(this.attributeKey, authNMappingAttributes.attributeKey)
        && Objects.equals(this.attributeValue, authNMappingAttributes.attributeValue)
        && Objects.equals(this.createdAt, authNMappingAttributes.createdAt)
        && Objects.equals(this.modifiedAt, authNMappingAttributes.modifiedAt)
        && Objects.equals(
            this.samlAssertionAttributeId, authNMappingAttributes.samlAssertionAttributeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attributeKey, attributeValue, createdAt, modifiedAt, samlAssertionAttributeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingAttributes {\n");
    sb.append("    attributeKey: ").append(toIndentedString(attributeKey)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    samlAssertionAttributeId: ")
        .append(toIndentedString(samlAssertionAttributeId))
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
