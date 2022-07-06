/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Parsing options for variables to extract. */
@JsonPropertyOrder({
  SyntheticsParsingOptions.JSON_PROPERTY_FIELD,
  SyntheticsParsingOptions.JSON_PROPERTY_NAME,
  SyntheticsParsingOptions.JSON_PROPERTY_PARSER,
  SyntheticsParsingOptions.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsParsingOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARSER = "parser";
  private SyntheticsVariableParser parser;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsGlobalVariableParseTestOptionsType type;

  public SyntheticsParsingOptions field(String field) {
    this.field = field;
    return this;
  }

  /**
   * When type is <code>http_header</code>, name of the header to use to extract the value.
   *
   * @return field
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Name of the variable to extract.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Details of the parser to use for the global variable.
   *
   * @return parser
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsVariableParser getParser() {
    return parser;
  }

  public void setParser(SyntheticsVariableParser parser) {
    this.parser = parser;
  }

  public SyntheticsParsingOptions type(SyntheticsGlobalVariableParseTestOptionsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Property of the Synthetics Test Response to use for a Synthetics global variable.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsGlobalVariableParseTestOptionsType getType() {
    return type;
  }

  public void setType(SyntheticsGlobalVariableParseTestOptionsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SyntheticsParsingOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsParsingOptions syntheticsParsingOptions = (SyntheticsParsingOptions) o;
    return Objects.equals(this.field, syntheticsParsingOptions.field)
        && Objects.equals(this.name, syntheticsParsingOptions.name)
        && Objects.equals(this.parser, syntheticsParsingOptions.parser)
        && Objects.equals(this.type, syntheticsParsingOptions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, name, parser, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsParsingOptions {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parser: ").append(toIndentedString(parser)).append("\n");
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
