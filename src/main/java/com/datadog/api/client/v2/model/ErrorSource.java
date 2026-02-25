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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An object containing references to the primary source of the error. See:
 * https://jsonapi.org/format/#error-objects
 */
@JsonPropertyOrder({
  ErrorSource.JSON_PROPERTY_HEADER,
  ErrorSource.JSON_PROPERTY_PARAMETER,
  ErrorSource.JSON_PROPERTY_POINTER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ErrorSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEADER = "header";
  private JsonNullable<String> header = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private JsonNullable<String> parameter = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POINTER = "pointer";
  private JsonNullable<String> pointer = JsonNullable.<String>undefined();

  public ErrorSource header(String header) {
    this.header = JsonNullable.<String>of(header);
    return this;
  }

  /**
   * Getheader
   *
   * @return header
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getHeader() {
    return header.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getHeader_JsonNullable() {
    return header;
  }

  @JsonProperty(JSON_PROPERTY_HEADER)
  public void setHeader_JsonNullable(JsonNullable<String> header) {
    this.header = header;
  }

  public void setHeader(String header) {
    this.header = JsonNullable.<String>of(header);
  }

  public ErrorSource parameter(String parameter) {
    this.parameter = JsonNullable.<String>of(parameter);
    return this;
  }

  /**
   * Getparameter
   *
   * @return parameter
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getParameter() {
    return parameter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getParameter_JsonNullable() {
    return parameter;
  }

  @JsonProperty(JSON_PROPERTY_PARAMETER)
  public void setParameter_JsonNullable(JsonNullable<String> parameter) {
    this.parameter = parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = JsonNullable.<String>of(parameter);
  }

  public ErrorSource pointer(String pointer) {
    this.pointer = JsonNullable.<String>of(pointer);
    return this;
  }

  /**
   * Getpointer
   *
   * @return pointer
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPointer() {
    return pointer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POINTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPointer_JsonNullable() {
    return pointer;
  }

  @JsonProperty(JSON_PROPERTY_POINTER)
  public void setPointer_JsonNullable(JsonNullable<String> pointer) {
    this.pointer = pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = JsonNullable.<String>of(pointer);
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
   * @return ErrorSource
   */
  @JsonAnySetter
  public ErrorSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ErrorSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorSource errorSource = (ErrorSource) o;
    return Objects.equals(this.header, errorSource.header)
        && Objects.equals(this.parameter, errorSource.parameter)
        && Objects.equals(this.pointer, errorSource.pointer)
        && Objects.equals(this.additionalProperties, errorSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, parameter, pointer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorSource {\n");
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
