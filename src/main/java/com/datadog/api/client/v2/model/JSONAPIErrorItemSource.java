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

/** References to the source of the error. */
@JsonPropertyOrder({
  JSONAPIErrorItemSource.JSON_PROPERTY_HEADER,
  JSONAPIErrorItemSource.JSON_PROPERTY_PARAMETER,
  JSONAPIErrorItemSource.JSON_PROPERTY_POINTER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JSONAPIErrorItemSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEADER = "header";
  private String header;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public static final String JSON_PROPERTY_POINTER = "pointer";
  private String pointer;

  public JSONAPIErrorItemSource header(String header) {
    this.header = header;
    return this;
  }

  /**
   * A string indicating the name of a single request header which caused the error.
   *
   * @return header
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public JSONAPIErrorItemSource parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * A string indicating which URI query parameter caused the error.
   *
   * @return parameter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public JSONAPIErrorItemSource pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

  /**
   * A JSON pointer to the value in the request document that caused the error.
   *
   * @return pointer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPointer() {
    return pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = pointer;
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
   * @return JSONAPIErrorItemSource
   */
  @JsonAnySetter
  public JSONAPIErrorItemSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JSONAPIErrorItemSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONAPIErrorItemSource jsonapiErrorItemSource = (JSONAPIErrorItemSource) o;
    return Objects.equals(this.header, jsonapiErrorItemSource.header)
        && Objects.equals(this.parameter, jsonapiErrorItemSource.parameter)
        && Objects.equals(this.pointer, jsonapiErrorItemSource.pointer)
        && Objects.equals(this.additionalProperties, jsonapiErrorItemSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, parameter, pointer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONAPIErrorItemSource {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
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
