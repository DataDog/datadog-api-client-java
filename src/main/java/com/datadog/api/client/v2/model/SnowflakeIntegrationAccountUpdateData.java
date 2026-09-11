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

/** Data envelope for updating a Snowflake integration account. */
@JsonPropertyOrder({
  SnowflakeIntegrationAccountUpdateData.JSON_PROPERTY_ATTRIBUTES,
  SnowflakeIntegrationAccountUpdateData.JSON_PROPERTY_ID,
  SnowflakeIntegrationAccountUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationAccountUpdateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SnowflakeIntegrationAccountUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IntegrationAccountType type = IntegrationAccountType.INTEGRATION_ACCOUNT;

  public SnowflakeIntegrationAccountUpdateData() {}

  @JsonCreator
  public SnowflakeIntegrationAccountUpdateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          SnowflakeIntegrationAccountUpdateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) IntegrationAccountType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SnowflakeIntegrationAccountUpdateData attributes(
      SnowflakeIntegrationAccountUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Writable attributes used to update a Snowflake integration account. Every field is optional;
   * only the fields provided are changed. When <code>dataflows</code> is provided, only the
   * dataflow ids included in the request are modified; dataflows omitted from the map keep their
   * current configuration, as do the settings of an included dataflow that provides only <code>
   * enabled</code>. <code>authentication</code> is the exception to partial updates: when provided
   * it is replaced as a whole, so it must carry every field that creating an account requires.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SnowflakeIntegrationAccountUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SnowflakeIntegrationAccountUpdateAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public SnowflakeIntegrationAccountUpdateData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the Snowflake integration account to update.
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

  public SnowflakeIntegrationAccountUpdateData type(IntegrationAccountType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the integration account resource. Always <code>integration-account</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IntegrationAccountType getType() {
    return type;
  }

  public void setType(IntegrationAccountType type) {
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
   * @return SnowflakeIntegrationAccountUpdateData
   */
  @JsonAnySetter
  public SnowflakeIntegrationAccountUpdateData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SnowflakeIntegrationAccountUpdateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationAccountUpdateData snowflakeIntegrationAccountUpdateData =
        (SnowflakeIntegrationAccountUpdateData) o;
    return Objects.equals(this.attributes, snowflakeIntegrationAccountUpdateData.attributes)
        && Objects.equals(this.id, snowflakeIntegrationAccountUpdateData.id)
        && Objects.equals(this.type, snowflakeIntegrationAccountUpdateData.type)
        && Objects.equals(
            this.additionalProperties, snowflakeIntegrationAccountUpdateData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationAccountUpdateData {\n");
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
