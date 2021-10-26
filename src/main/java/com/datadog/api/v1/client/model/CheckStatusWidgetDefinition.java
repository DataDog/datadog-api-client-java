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
import com.datadog.api.v1.client.model.CheckStatusWidgetDefinitionType;
import com.datadog.api.v1.client.model.WidgetGrouping;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
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
 * Check status shows the current status or number of results for any check performed.
 */
@ApiModel(description = "Check status shows the current status or number of results for any check performed.")
@JsonPropertyOrder(
    {
        CheckStatusWidgetDefinition.JSON_PROPERTY_CHECK,
        CheckStatusWidgetDefinition.JSON_PROPERTY_GROUP,
        CheckStatusWidgetDefinition.JSON_PROPERTY_GROUP_BY,
        CheckStatusWidgetDefinition.JSON_PROPERTY_GROUPING,
        CheckStatusWidgetDefinition.JSON_PROPERTY_TAGS,
        CheckStatusWidgetDefinition.JSON_PROPERTY_TIME,
        CheckStatusWidgetDefinition.JSON_PROPERTY_TITLE,
        CheckStatusWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
        CheckStatusWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
        CheckStatusWidgetDefinition.JSON_PROPERTY_TYPE
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckStatusWidgetDefinition {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_CHECK = "check";
    private String check;

    public static final String JSON_PROPERTY_GROUP = "group";
    private String group;

    public static final String JSON_PROPERTY_GROUP_BY = "group_by";
    private List<String> groupBy = null;

    public static final String JSON_PROPERTY_GROUPING = "grouping";
    private WidgetGrouping grouping;

    public static final String JSON_PROPERTY_TAGS = "tags";
    private List<String> tags = null;

    public static final String JSON_PROPERTY_TIME = "time";
    private WidgetTime time;

    public static final String JSON_PROPERTY_TITLE = "title";
    private String title;

    public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
    private WidgetTextAlign titleAlign;

    public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
    private String titleSize;

    public static final String JSON_PROPERTY_TYPE = "type";
    private CheckStatusWidgetDefinitionType type = CheckStatusWidgetDefinitionType.CHECK_STATUS;

    public CheckStatusWidgetDefinition() {}

    @JsonCreator
    public CheckStatusWidgetDefinition(
        @JsonProperty(required = true, value = JSON_PROPERTY_CHECK) String check,
        @JsonProperty(required = true, value = JSON_PROPERTY_GROUPING) WidgetGrouping grouping,
        @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CheckStatusWidgetDefinitionType type
    ) {
        this.check = check;
        this.grouping = grouping;
        this.unparsed |= !grouping.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
    }

    public CheckStatusWidgetDefinition check(String check) {
        this.check = check;
        return this;
    }

    /**
     * Name of the check to use in the widget.
     * @return check
     **/
    @ApiModelProperty(example = "", required = true, value = "Name of the check to use in the widget.")
    @JsonProperty(JSON_PROPERTY_CHECK)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public CheckStatusWidgetDefinition group(String group) {
        this.group = group;
        return this;
    }

    /**
     * Group reporting a single check.
     * @return group
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Group reporting a single check.")
    @JsonProperty(JSON_PROPERTY_GROUP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public CheckStatusWidgetDefinition groupBy(List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public CheckStatusWidgetDefinition addGroupByItem(String groupByItem) {
        if (this.groupBy == null) {
            this.groupBy = new ArrayList<>();
        }
        this.groupBy.add(groupByItem);
        return this;
    }

    /**
     * List of tag prefixes to group by in the case of a cluster check.
     * @return groupBy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "List of tag prefixes to group by in the case of a cluster check.")
    @JsonProperty(JSON_PROPERTY_GROUP_BY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
    }

    public CheckStatusWidgetDefinition grouping(WidgetGrouping grouping) {
        this.grouping = grouping;
        this.unparsed |= !grouping.isValid();
        return this;
    }

    /**
     * Get grouping
     * @return grouping
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_GROUPING)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public WidgetGrouping getGrouping() {
        return grouping;
    }

    public void setGrouping(WidgetGrouping grouping) {
        if (!grouping.isValid()) {
            this.unparsed = true;
        }
        this.grouping = grouping;
    }

    public CheckStatusWidgetDefinition tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CheckStatusWidgetDefinition addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * List of tags used to filter the groups reporting a cluster check.
     * @return tags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "List of tags used to filter the groups reporting a cluster check.")
    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CheckStatusWidgetDefinition time(WidgetTime time) {
        this.time = time;
        this.unparsed |= time.unparsed;
        return this;
    }

    /**
     * Get time
     * @return time
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WidgetTime getTime() {
        return time;
    }

    public void setTime(WidgetTime time) {
        this.time = time;
    }

    public CheckStatusWidgetDefinition title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Title of the widget.
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Title of the widget.")
    @JsonProperty(JSON_PROPERTY_TITLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CheckStatusWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
        this.titleAlign = titleAlign;
        this.unparsed |= !titleAlign.isValid();
        return this;
    }

    /**
     * Get titleAlign
     * @return titleAlign
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WidgetTextAlign getTitleAlign() {
        return titleAlign;
    }

    public void setTitleAlign(WidgetTextAlign titleAlign) {
        if (!titleAlign.isValid()) {
            this.unparsed = true;
        }
        this.titleAlign = titleAlign;
    }

    public CheckStatusWidgetDefinition titleSize(String titleSize) {
        this.titleSize = titleSize;
        return this;
    }

    /**
     * Size of the title.
     * @return titleSize
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Size of the title.")
    @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTitleSize() {
        return titleSize;
    }

    public void setTitleSize(String titleSize) {
        this.titleSize = titleSize;
    }

    public CheckStatusWidgetDefinition type(CheckStatusWidgetDefinitionType type) {
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
    public CheckStatusWidgetDefinitionType getType() {
        return type;
    }

    public void setType(CheckStatusWidgetDefinitionType type) {
        if (!type.isValid()) {
            this.unparsed = true;
        }
        this.type = type;
    }

    /**
     * Return true if this CheckStatusWidgetDefinition object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckStatusWidgetDefinition checkStatusWidgetDefinition = (CheckStatusWidgetDefinition) o;
        return (
            Objects.equals(this.check, checkStatusWidgetDefinition.check) &&
            Objects.equals(this.group, checkStatusWidgetDefinition.group) &&
            Objects.equals(this.groupBy, checkStatusWidgetDefinition.groupBy) &&
            Objects.equals(this.grouping, checkStatusWidgetDefinition.grouping) &&
            Objects.equals(this.tags, checkStatusWidgetDefinition.tags) &&
            Objects.equals(this.time, checkStatusWidgetDefinition.time) &&
            Objects.equals(this.title, checkStatusWidgetDefinition.title) &&
            Objects.equals(this.titleAlign, checkStatusWidgetDefinition.titleAlign) &&
            Objects.equals(this.titleSize, checkStatusWidgetDefinition.titleSize) &&
            Objects.equals(this.type, checkStatusWidgetDefinition.type)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(check, group, groupBy, grouping, tags, time, title, titleAlign, titleSize, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckStatusWidgetDefinition {\n");
        sb.append("    check: ").append(toIndentedString(check)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
        sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
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
