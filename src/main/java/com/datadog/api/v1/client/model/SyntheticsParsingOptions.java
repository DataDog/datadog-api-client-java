/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.JSON;
import com.datadog.api.v1.client.model.SyntheticsGlobalVariableParseTestOptionsType;
import com.datadog.api.v1.client.model.SyntheticsVariableParser;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Parsing options for variables to extract.
 */
@ApiModel(description = "Parsing options for variables to extract.")
@JsonPropertyOrder(
    {
        SyntheticsParsingOptions.JSON_PROPERTY_FIELD,
        SyntheticsParsingOptions.JSON_PROPERTY_NAME,
        SyntheticsParsingOptions.JSON_PROPERTY_PARSER,
        SyntheticsParsingOptions.JSON_PROPERTY_TYPE
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsParsingOptions {

    @JsonIgnore
    public boolean unparsed = false;

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
     * When type is &#x60;http_header&#x60;, name of the header to use to extract the value.
     * @return field
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "content-type", value = "When type is `http_header`, name of the header to use to extract the value.")
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
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Name of the variable to extract.")
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
     * Get parser
     * @return parser
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
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
     * Get type
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
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
        return (
            Objects.equals(this.field, syntheticsParsingOptions.field) &&
            Objects.equals(this.name, syntheticsParsingOptions.name) &&
            Objects.equals(this.parser, syntheticsParsingOptions.parser) &&
            Objects.equals(this.type, syntheticsParsingOptions.type)
        );
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
