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

/** The definition of <code>HTTPTokenUpdate</code> object. */
@JsonPropertyOrder({
  HTTPTokenUpdate.JSON_PROPERTY_DELETED,
  HTTPTokenUpdate.JSON_PROPERTY_NAME,
  HTTPTokenUpdate.JSON_PROPERTY_TYPE,
  HTTPTokenUpdate.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HTTPTokenUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TokenType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public HTTPTokenUpdate() {}

  @JsonCreator
  public HTTPTokenUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TokenType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.value = value;
  }

  public HTTPTokenUpdate deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Should the header be deleted.
   *
   * @return deleted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public HTTPTokenUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The <code>HTTPToken</code> <code>name</code>.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HTTPTokenUpdate type(TokenType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of <code>TokenType</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TokenType getType() {
    return type;
  }

  public void setType(TokenType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public HTTPTokenUpdate value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The <code>HTTPToken</code> <code>value</code>.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
   * @return HTTPTokenUpdate
   */
  @JsonAnySetter
  public HTTPTokenUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HTTPTokenUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPTokenUpdate httpTokenUpdate = (HTTPTokenUpdate) o;
    return Objects.equals(this.deleted, httpTokenUpdate.deleted)
        && Objects.equals(this.name, httpTokenUpdate.name)
        && Objects.equals(this.type, httpTokenUpdate.type)
        && Objects.equals(this.value, httpTokenUpdate.value)
        && Objects.equals(this.additionalProperties, httpTokenUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, name, type, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPTokenUpdate {\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
