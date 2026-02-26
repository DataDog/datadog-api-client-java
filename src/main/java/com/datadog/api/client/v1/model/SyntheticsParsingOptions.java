/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Parsing options for variables to extract.</p>
 */
@JsonPropertyOrder({
  SyntheticsParsingOptions.JSON_PROPERTY_FIELD,
  SyntheticsParsingOptions.JSON_PROPERTY_NAME,
  SyntheticsParsingOptions.JSON_PROPERTY_PARSER,
  SyntheticsParsingOptions.JSON_PROPERTY_SECURE,
  SyntheticsParsingOptions.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsParsingOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARSER = "parser";
  private SyntheticsVariableParser parser;

  public static final String JSON_PROPERTY_SECURE = "secure";
  private Boolean secure;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsLocalVariableParsingOptionsType type;

  public SyntheticsParsingOptions field(String field) {
    this.field = field;
    return this;
  }

  /**
   * <p>When type is <code>http_header</code> or <code>grpc_metadata</code>, name of the header or metadatum to extract.</p>
   * @return field
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getField() {
        return field;
      }
  public void setField(String field) {
    this.field = field;
  }
  public SyntheticsParsingOptions name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the variable to extract.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SyntheticsParsingOptions parser(SyntheticsVariableParser parser) {
    this.parser = parser;
    this.unparsed |= parser.unparsed;
    return this;
  }

  /**
   * <p>Details of the parser to use for the global variable.</p>
   * @return parser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PARSER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsVariableParser getParser() {
        return parser;
      }
  public void setParser(SyntheticsVariableParser parser) {
    this.parser = parser;
  }
  public SyntheticsParsingOptions secure(Boolean secure) {
    this.secure = secure;
    return this;
  }

  /**
   * <p>Determines whether or not the extracted value will be obfuscated.</p>
   * @return secure
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SECURE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getSecure() {
        return secure;
      }
  public void setSecure(Boolean secure) {
    this.secure = secure;
  }
  public SyntheticsParsingOptions type(SyntheticsLocalVariableParsingOptionsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Property of the Synthetic Test Response to extract into a local variable.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsLocalVariableParsingOptionsType getType() {
        return type;
      }
  public void setType(SyntheticsLocalVariableParsingOptionsType type) {
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
   * @return SyntheticsParsingOptions
   */
  @JsonAnySetter
  public SyntheticsParsingOptions putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsParsingOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsParsingOptions syntheticsParsingOptions = (SyntheticsParsingOptions) o;
    return Objects.equals(this.field, syntheticsParsingOptions.field) && Objects.equals(this.name, syntheticsParsingOptions.name) && Objects.equals(this.parser, syntheticsParsingOptions.parser) && Objects.equals(this.secure, syntheticsParsingOptions.secure) && Objects.equals(this.type, syntheticsParsingOptions.type) && Objects.equals(this.additionalProperties, syntheticsParsingOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(field,name,parser,secure,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsParsingOptions {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parser: ").append(toIndentedString(parser)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
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
