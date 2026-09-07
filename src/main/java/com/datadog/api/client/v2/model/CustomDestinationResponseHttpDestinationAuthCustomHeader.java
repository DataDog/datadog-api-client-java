/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Custom header access authentication.</p>
 */
@JsonPropertyOrder({
  CustomDestinationResponseHttpDestinationAuthCustomHeader.JSON_PROPERTY_HEADER_NAME,
  CustomDestinationResponseHttpDestinationAuthCustomHeader.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationResponseHttpDestinationAuthCustomHeader {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEADER_NAME = "header_name";
  private String headerName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomDestinationResponseHttpDestinationAuthCustomHeaderType type = CustomDestinationResponseHttpDestinationAuthCustomHeaderType.CUSTOM_HEADER;

  public CustomDestinationResponseHttpDestinationAuthCustomHeader() {}

  @JsonCreator
  public CustomDestinationResponseHttpDestinationAuthCustomHeader(
            @JsonProperty(required=true, value=JSON_PROPERTY_HEADER_NAME)String headerName,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)CustomDestinationResponseHttpDestinationAuthCustomHeaderType type) {
        this.headerName = headerName;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public CustomDestinationResponseHttpDestinationAuthCustomHeader headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

  /**
   * <p>The header name of the authentication.</p>
   * @return headerName
  **/
      @JsonProperty(JSON_PROPERTY_HEADER_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getHeaderName() {
        return headerName;
      }
  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }
  public CustomDestinationResponseHttpDestinationAuthCustomHeader type(CustomDestinationResponseHttpDestinationAuthCustomHeaderType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the custom header access authentication.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CustomDestinationResponseHttpDestinationAuthCustomHeaderType getType() {
        return type;
      }
  public void setType(CustomDestinationResponseHttpDestinationAuthCustomHeaderType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CustomDestinationResponseHttpDestinationAuthCustomHeader
   */
  @JsonAnySetter
  public CustomDestinationResponseHttpDestinationAuthCustomHeader putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this CustomDestinationResponseHttpDestinationAuthCustomHeader object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationResponseHttpDestinationAuthCustomHeader customDestinationResponseHttpDestinationAuthCustomHeader = (CustomDestinationResponseHttpDestinationAuthCustomHeader) o;
    return Objects.equals(this.headerName, customDestinationResponseHttpDestinationAuthCustomHeader.headerName) && Objects.equals(this.type, customDestinationResponseHttpDestinationAuthCustomHeader.type) && Objects.equals(this.additionalProperties, customDestinationResponseHttpDestinationAuthCustomHeader.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(headerName,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationResponseHttpDestinationAuthCustomHeader {\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
