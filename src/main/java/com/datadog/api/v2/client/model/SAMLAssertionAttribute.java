/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** SAML assertion attribute. */
@JsonPropertyOrder({
  SAMLAssertionAttribute.JSON_PROPERTY_ATTRIBUTES,
  SAMLAssertionAttribute.JSON_PROPERTY_ID,
  SAMLAssertionAttribute.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SAMLAssertionAttribute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SAMLAssertionAttributeAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SAMLAssertionAttributesType type = SAMLAssertionAttributesType.SAML_ASSERTION_ATTRIBUTES;

  public SAMLAssertionAttribute() {}

  @JsonCreator
  public SAMLAssertionAttribute(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) Integer id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SAMLAssertionAttributesType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SAMLAssertionAttribute attributes(SAMLAssertionAttributeAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Key/Value pair of attributes used in SAML assertion attributes.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SAMLAssertionAttributeAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SAMLAssertionAttributeAttributes attributes) {
    this.attributes = attributes;
  }

  public SAMLAssertionAttribute id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the SAML assertion attribute. maximum: 2147483647
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SAMLAssertionAttribute type(SAMLAssertionAttributesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * SAML assertion attributes resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SAMLAssertionAttributesType getType() {
    return type;
  }

  public void setType(SAMLAssertionAttributesType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SAMLAssertionAttribute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAMLAssertionAttribute samlAssertionAttribute = (SAMLAssertionAttribute) o;
    return Objects.equals(this.attributes, samlAssertionAttribute.attributes)
        && Objects.equals(this.id, samlAssertionAttribute.id)
        && Objects.equals(this.type, samlAssertionAttribute.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLAssertionAttribute {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
