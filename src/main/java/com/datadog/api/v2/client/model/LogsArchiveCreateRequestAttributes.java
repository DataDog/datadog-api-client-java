/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JSON;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequestDestination;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The attributes associated with the archive.
 */
@ApiModel(description = "The attributes associated with the archive.")
@JsonPropertyOrder(
    {
        LogsArchiveCreateRequestAttributes.JSON_PROPERTY_DESTINATION,
        LogsArchiveCreateRequestAttributes.JSON_PROPERTY_INCLUDE_TAGS,
        LogsArchiveCreateRequestAttributes.JSON_PROPERTY_NAME,
        LogsArchiveCreateRequestAttributes.JSON_PROPERTY_QUERY,
        LogsArchiveCreateRequestAttributes.JSON_PROPERTY_REHYDRATION_TAGS
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsArchiveCreateRequestAttributes {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_DESTINATION = "destination";
    private LogsArchiveCreateRequestDestination destination;

    public static final String JSON_PROPERTY_INCLUDE_TAGS = "include_tags";
    private Boolean includeTags = false;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_QUERY = "query";
    private String query;

    public static final String JSON_PROPERTY_REHYDRATION_TAGS = "rehydration_tags";
    private List<String> rehydrationTags = null;

    public LogsArchiveCreateRequestAttributes() {}

    @JsonCreator
    public LogsArchiveCreateRequestAttributes(
        @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION) LogsArchiveCreateRequestDestination destination,
        @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
        @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query
    ) {
        this.destination = destination;
        this.unparsed |= destination.unparsed;
        this.name = name;
        this.query = query;
    }

    public LogsArchiveCreateRequestAttributes destination(LogsArchiveCreateRequestDestination destination) {
        this.destination = destination;
        this.unparsed |= destination.unparsed;
        return this;
    }

    /**
     * Get destination
     * @return destination
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_DESTINATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public LogsArchiveCreateRequestDestination getDestination() {
        return destination;
    }

    public void setDestination(LogsArchiveCreateRequestDestination destination) {
        this.destination = destination;
    }

    public LogsArchiveCreateRequestAttributes includeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }

    /**
     * To store the tags in the archive, set the value \&quot;true\&quot;. If it is set to \&quot;false\&quot;, the tags will be deleted when the logs are sent to the archive.
     * @return includeTags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "To store the tags in the archive, set the value \"true\". If it is set to \"false\", the tags will be deleted when the logs are sent to the archive."
    )
    @JsonProperty(JSON_PROPERTY_INCLUDE_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIncludeTags() {
        return includeTags;
    }

    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    public LogsArchiveCreateRequestAttributes name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The archive name.
     * @return name
     **/
    @ApiModelProperty(example = "Nginx Archive", required = true, value = "The archive name.")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LogsArchiveCreateRequestAttributes query(String query) {
        this.query = query;
        return this;
    }

    /**
     * The archive query/filter. Logs matching this query are included in the archive.
     * @return query
     **/
    @ApiModelProperty(
        example = "source:nginx",
        required = true,
        value = "The archive query/filter. Logs matching this query are included in the archive."
    )
    @JsonProperty(JSON_PROPERTY_QUERY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public LogsArchiveCreateRequestAttributes rehydrationTags(List<String> rehydrationTags) {
        this.rehydrationTags = rehydrationTags;
        return this;
    }

    public LogsArchiveCreateRequestAttributes addRehydrationTagsItem(String rehydrationTagsItem) {
        if (this.rehydrationTags == null) {
            this.rehydrationTags = new ArrayList<>();
        }
        this.rehydrationTags.add(rehydrationTagsItem);
        return this;
    }

    /**
     * An array of tags to add to rehydrated logs from an archive.
     * @return rehydrationTags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[\"team:intake\",\"team:app\"]", value = "An array of tags to add to rehydrated logs from an archive.")
    @JsonProperty(JSON_PROPERTY_REHYDRATION_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getRehydrationTags() {
        return rehydrationTags;
    }

    public void setRehydrationTags(List<String> rehydrationTags) {
        this.rehydrationTags = rehydrationTags;
    }

    /**
     * Return true if this LogsArchiveCreateRequestAttributes object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogsArchiveCreateRequestAttributes logsArchiveCreateRequestAttributes = (LogsArchiveCreateRequestAttributes) o;
        return (
            Objects.equals(this.destination, logsArchiveCreateRequestAttributes.destination) &&
            Objects.equals(this.includeTags, logsArchiveCreateRequestAttributes.includeTags) &&
            Objects.equals(this.name, logsArchiveCreateRequestAttributes.name) &&
            Objects.equals(this.query, logsArchiveCreateRequestAttributes.query) &&
            Objects.equals(this.rehydrationTags, logsArchiveCreateRequestAttributes.rehydrationTags)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, includeTags, name, query, rehydrationTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogsArchiveCreateRequestAttributes {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    rehydrationTags: ").append(toIndentedString(rehydrationTags)).append("\n");
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
