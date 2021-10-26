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
import com.datadog.api.v1.client.model.LogsURLParserType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * This processor extracts query parameters and other important parameters from a URL.
 */
@ApiModel(description = "This processor extracts query parameters and other important parameters from a URL.")
@JsonPropertyOrder(
    {
        LogsURLParser.JSON_PROPERTY_IS_ENABLED,
        LogsURLParser.JSON_PROPERTY_NAME,
        LogsURLParser.JSON_PROPERTY_NORMALIZE_ENDING_SLASHES,
        LogsURLParser.JSON_PROPERTY_SOURCES,
        LogsURLParser.JSON_PROPERTY_TARGET,
        LogsURLParser.JSON_PROPERTY_TYPE
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsURLParser {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
    private Boolean isEnabled = false;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_NORMALIZE_ENDING_SLASHES = "normalize_ending_slashes";
    private JsonNullable<Boolean> normalizeEndingSlashes = JsonNullable.<Boolean>of(false);

    public static final String JSON_PROPERTY_SOURCES = "sources";
    private List<String> sources = new ArrayList<>();

    public static final String JSON_PROPERTY_TARGET = "target";
    private String target = "http.url_details";

    public static final String JSON_PROPERTY_TYPE = "type";
    private LogsURLParserType type = LogsURLParserType.URL_PARSER;

    public LogsURLParser() {}

    @JsonCreator
    public LogsURLParser(
        @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources,
        @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
        @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsURLParserType type
    ) {
        this.sources = sources;
        this.target = target;
        this.type = type;
        this.unparsed |= !type.isValid();
    }

    public LogsURLParser isEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Whether or not the processor is enabled.
     * @return isEnabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Whether or not the processor is enabled.")
    @JsonProperty(JSON_PROPERTY_IS_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public LogsURLParser name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the processor.
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Name of the processor.")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LogsURLParser normalizeEndingSlashes(Boolean normalizeEndingSlashes) {
        this.normalizeEndingSlashes = JsonNullable.<Boolean>of(normalizeEndingSlashes);
        return this;
    }

    /**
     * Normalize the ending slashes or not.
     * @return normalizeEndingSlashes
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Normalize the ending slashes or not.")
    @JsonIgnore
    public Boolean getNormalizeEndingSlashes() {
        return normalizeEndingSlashes.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_NORMALIZE_ENDING_SLASHES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<Boolean> getNormalizeEndingSlashes_JsonNullable() {
        return normalizeEndingSlashes;
    }

    @JsonProperty(JSON_PROPERTY_NORMALIZE_ENDING_SLASHES)
    public void setNormalizeEndingSlashes_JsonNullable(JsonNullable<Boolean> normalizeEndingSlashes) {
        this.normalizeEndingSlashes = normalizeEndingSlashes;
    }

    public void setNormalizeEndingSlashes(Boolean normalizeEndingSlashes) {
        this.normalizeEndingSlashes = JsonNullable.<Boolean>of(normalizeEndingSlashes);
    }

    public LogsURLParser sources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    public LogsURLParser addSourcesItem(String sourcesItem) {
        this.sources.add(sourcesItem);
        return this;
    }

    /**
     * Array of source attributes.
     * @return sources
     **/
    @ApiModelProperty(example = "[\"http.url\"]", required = true, value = "Array of source attributes.")
    @JsonProperty(JSON_PROPERTY_SOURCES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public LogsURLParser target(String target) {
        this.target = target;
        return this;
    }

    /**
     * Name of the parent attribute that contains all the extracted details from the &#x60;sources&#x60;.
     * @return target
     **/
    @ApiModelProperty(
        example = "http.url_details",
        required = true,
        value = "Name of the parent attribute that contains all the extracted details from the `sources`."
    )
    @JsonProperty(JSON_PROPERTY_TARGET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public LogsURLParser type(LogsURLParserType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public LogsURLParserType getType() {
        return type;
    }

    public void setType(LogsURLParserType type) {
        if (!type.isValid()) {
            this.unparsed = true;
        }
        this.type = type;
    }

    /**
     * Return true if this LogsURLParser object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogsURLParser logsURLParser = (LogsURLParser) o;
        return (
            Objects.equals(this.isEnabled, logsURLParser.isEnabled) &&
            Objects.equals(this.name, logsURLParser.name) &&
            Objects.equals(this.normalizeEndingSlashes, logsURLParser.normalizeEndingSlashes) &&
            Objects.equals(this.sources, logsURLParser.sources) &&
            Objects.equals(this.target, logsURLParser.target) &&
            Objects.equals(this.type, logsURLParser.type)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEnabled, name, normalizeEndingSlashes, sources, target, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogsURLParser {\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    normalizeEndingSlashes: ").append(toIndentedString(normalizeEndingSlashes)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
