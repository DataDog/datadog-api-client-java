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

/** A trace resource document. */
@JsonPropertyOrder({
  TraceData.JSON_PROPERTY_ATTRIBUTES,
  TraceData.JSON_PROPERTY_ID,
  TraceData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TraceData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private TraceAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TraceType type;

  public TraceData() {}

  @JsonCreator
  public TraceData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES) TraceAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TraceType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TraceData attributes(TraceAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The attributes of a trace returned by the Get trace by ID endpoint.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TraceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(TraceAttributes attributes) {
    this.attributes = attributes;
  }

  public TraceData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The full 128-bit trace ID, encoded as a 32-character hexadecimal string.
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

  public TraceData type(TraceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the trace resource. The value is always <code>trace</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TraceType getType() {
    return type;
  }

  public void setType(TraceType type) {
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
   * @return TraceData
   */
  @JsonAnySetter
  public TraceData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TraceData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceData traceData = (TraceData) o;
    return Objects.equals(this.attributes, traceData.attributes)
        && Objects.equals(this.id, traceData.id)
        && Objects.equals(this.type, traceData.type)
        && Objects.equals(this.additionalProperties, traceData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceData {\n");
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
