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

/** Custom header access authentication. */
@JsonPropertyOrder({
  CustomDestinationHttpDestinationAuthCustomHeader.JSON_PROPERTY_HEADER_NAME,
  CustomDestinationHttpDestinationAuthCustomHeader.JSON_PROPERTY_HEADER_VALUE,
  CustomDestinationHttpDestinationAuthCustomHeader.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationHttpDestinationAuthCustomHeader {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEADER_NAME = "header_name";
  private String headerName;

  public static final String JSON_PROPERTY_HEADER_VALUE = "header_value";
  private String headerValue;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomDestinationHttpDestinationAuthCustomHeaderType type =
      CustomDestinationHttpDestinationAuthCustomHeaderType.CUSTOM_HEADER;

  public CustomDestinationHttpDestinationAuthCustomHeader() {}

  @JsonCreator
  public CustomDestinationHttpDestinationAuthCustomHeader(
      @JsonProperty(required = true, value = JSON_PROPERTY_HEADER_NAME) String headerName,
      @JsonProperty(required = true, value = JSON_PROPERTY_HEADER_VALUE) String headerValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CustomDestinationHttpDestinationAuthCustomHeaderType type) {
    this.headerName = headerName;
    this.headerValue = headerValue;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CustomDestinationHttpDestinationAuthCustomHeader headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

  /**
   * The header name of the authentication.
   *
   * @return headerName
   */
  @JsonProperty(JSON_PROPERTY_HEADER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }

  public CustomDestinationHttpDestinationAuthCustomHeader headerValue(String headerValue) {
    this.headerValue = headerValue;
    return this;
  }

  /**
   * The header value of the authentication. This field is not returned by the API.
   *
   * @return headerValue
   */
  @JsonProperty(JSON_PROPERTY_HEADER_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHeaderValue() {
    return headerValue;
  }

  public void setHeaderValue(String headerValue) {
    this.headerValue = headerValue;
  }

  public CustomDestinationHttpDestinationAuthCustomHeader type(
      CustomDestinationHttpDestinationAuthCustomHeaderType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the custom header access authentication.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationHttpDestinationAuthCustomHeaderType getType() {
    return type;
  }

  public void setType(CustomDestinationHttpDestinationAuthCustomHeaderType type) {
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
   * @return CustomDestinationHttpDestinationAuthCustomHeader
   */
  @JsonAnySetter
  public CustomDestinationHttpDestinationAuthCustomHeader putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this CustomDestinationHttpDestinationAuthCustomHeader object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationHttpDestinationAuthCustomHeader
        customDestinationHttpDestinationAuthCustomHeader =
            (CustomDestinationHttpDestinationAuthCustomHeader) o;
    return Objects.equals(
            this.headerName, customDestinationHttpDestinationAuthCustomHeader.headerName)
        && Objects.equals(
            this.headerValue, customDestinationHttpDestinationAuthCustomHeader.headerValue)
        && Objects.equals(this.type, customDestinationHttpDestinationAuthCustomHeader.type)
        && Objects.equals(
            this.additionalProperties,
            customDestinationHttpDestinationAuthCustomHeader.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerName, headerValue, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationHttpDestinationAuthCustomHeader {\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    headerValue: ").append(toIndentedString(headerValue)).append("\n");
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
