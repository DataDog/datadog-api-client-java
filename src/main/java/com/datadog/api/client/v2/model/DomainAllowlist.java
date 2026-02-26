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
import org.openapitools.jackson.nullable.JsonNullable;

/** The email domain allowlist for an org. */
@JsonPropertyOrder({
  DomainAllowlist.JSON_PROPERTY_ATTRIBUTES,
  DomainAllowlist.JSON_PROPERTY_ID,
  DomainAllowlist.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DomainAllowlist {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private DomainAllowlistAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private DomainAllowlistType type = DomainAllowlistType.DOMAIN_ALLOWLIST;

  public DomainAllowlist() {}

  @JsonCreator
  public DomainAllowlist(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DomainAllowlistType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DomainAllowlist attributes(DomainAllowlistAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The details of the email domain allowlist.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DomainAllowlistAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(DomainAllowlistAttributes attributes) {
    this.attributes = attributes;
  }

  public DomainAllowlist id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

  /**
   * The unique identifier of the org.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getId() {
    return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }

  public DomainAllowlist type(DomainAllowlistType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Email domain allowlist allowlist type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DomainAllowlistType getType() {
    return type;
  }

  public void setType(DomainAllowlistType type) {
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
   * @return DomainAllowlist
   */
  @JsonAnySetter
  public DomainAllowlist putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DomainAllowlist object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainAllowlist domainAllowlist = (DomainAllowlist) o;
    return Objects.equals(this.attributes, domainAllowlist.attributes)
        && Objects.equals(this.id, domainAllowlist.id)
        && Objects.equals(this.type, domainAllowlist.type)
        && Objects.equals(this.additionalProperties, domainAllowlist.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainAllowlist {\n");
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
