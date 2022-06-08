/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Parser options to use for retrieving a Synthetics global variable from a Synthetics Test. Used in
 * conjunction with <code>parse_test_public_id</code>.
 */
@JsonPropertyOrder({
  SyntheticsGlobalVariableParseTestOptions.JSON_PROPERTY_FIELD,
  SyntheticsGlobalVariableParseTestOptions.JSON_PROPERTY_PARSER,
  SyntheticsGlobalVariableParseTestOptions.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsGlobalVariableParseTestOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_PARSER = "parser";
  private SyntheticsVariableParser parser;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsGlobalVariableParseTestOptionsType type;

  public SyntheticsGlobalVariableParseTestOptions() {}

  @JsonCreator
  public SyntheticsGlobalVariableParseTestOptions(
      @JsonProperty(required = true, value = JSON_PROPERTY_PARSER) SyntheticsVariableParser parser,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SyntheticsGlobalVariableParseTestOptionsType type) {
    this.parser = parser;
    this.unparsed |= parser.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsGlobalVariableParseTestOptions field(String field) {
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

  public SyntheticsGlobalVariableParseTestOptions parser(SyntheticsVariableParser parser) {
    this.parser = parser;
    this.unparsed |= parser.unparsed;
    return this;
  }

  /**
   * Details of the parser to use for the global variable.
   *
   * @return parser
   */
  @JsonProperty(JSON_PROPERTY_PARSER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsVariableParser getParser() {
    return parser;
  }

  public void setParser(SyntheticsVariableParser parser) {
    this.parser = parser;
  }

  public SyntheticsGlobalVariableParseTestOptions type(
      SyntheticsGlobalVariableParseTestOptionsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Property of the Synthetics Test Response to use for a Synthetics global variable.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsGlobalVariableParseTestOptionsType getType() {
    return type;
  }

  public void setType(SyntheticsGlobalVariableParseTestOptionsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SyntheticsGlobalVariableParseTestOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGlobalVariableParseTestOptions syntheticsGlobalVariableParseTestOptions =
        (SyntheticsGlobalVariableParseTestOptions) o;
    return Objects.equals(this.field, syntheticsGlobalVariableParseTestOptions.field)
        && Objects.equals(this.parser, syntheticsGlobalVariableParseTestOptions.parser)
        && Objects.equals(this.type, syntheticsGlobalVariableParseTestOptions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, parser, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGlobalVariableParseTestOptions {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
