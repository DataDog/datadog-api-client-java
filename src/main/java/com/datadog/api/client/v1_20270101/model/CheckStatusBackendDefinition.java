/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  CheckStatusBackendDefinition.JSON_PROPERTY_CHECK,
  CheckStatusBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  CheckStatusBackendDefinition.JSON_PROPERTY_GROUP,
  CheckStatusBackendDefinition.JSON_PROPERTY_GROUP_BY,
  CheckStatusBackendDefinition.JSON_PROPERTY_GROUPING,
  CheckStatusBackendDefinition.JSON_PROPERTY_NOTES,
  CheckStatusBackendDefinition.JSON_PROPERTY_TAGS,
  CheckStatusBackendDefinition.JSON_PROPERTY_TIME,
  CheckStatusBackendDefinition.JSON_PROPERTY_TITLE,
  CheckStatusBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  CheckStatusBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  CheckStatusBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CheckStatusBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK = "check";
  private String check;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_GROUPING = "grouping";
  private CheckStatusBackendDefinitionGrouping grouping;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

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
  private CheckStatusBackendDefinitionType type;

  public CheckStatusBackendDefinition() {}

  @JsonCreator
  public CheckStatusBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHECK) String check,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUPING)
          CheckStatusBackendDefinitionGrouping grouping,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CheckStatusBackendDefinitionType type) {
    this.check = check;
    this.grouping = grouping;
    this.unparsed |= !grouping.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CheckStatusBackendDefinition check(String check) {
    this.check = check;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return check
   */
  @JsonProperty(JSON_PROPERTY_CHECK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCheck() {
    return check;
  }

  public void setCheck(String check) {
    this.check = check;
  }

  public CheckStatusBackendDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CheckStatusBackendDefinition group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return group
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public CheckStatusBackendDefinition groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public CheckStatusBackendDefinition addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public CheckStatusBackendDefinition grouping(CheckStatusBackendDefinitionGrouping grouping) {
    this.grouping = grouping;
    this.unparsed |= !grouping.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return grouping
   */
  @JsonProperty(JSON_PROPERTY_GROUPING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CheckStatusBackendDefinitionGrouping getGrouping() {
    return grouping;
  }

  public void setGrouping(CheckStatusBackendDefinitionGrouping grouping) {
    if (!grouping.isValid()) {
      this.unparsed = true;
    }
    this.grouping = grouping;
  }

  public CheckStatusBackendDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return notes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CheckStatusBackendDefinition tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CheckStatusBackendDefinition addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CheckStatusBackendDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
  }

  public CheckStatusBackendDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CheckStatusBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return titleAlign
   */
  @jakarta.annotation.Nullable
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

  public CheckStatusBackendDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return titleSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public CheckStatusBackendDefinition type(CheckStatusBackendDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CheckStatusBackendDefinitionType getType() {
    return type;
  }

  public void setType(CheckStatusBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CheckStatusBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckStatusBackendDefinition checkStatusBackendDefinition = (CheckStatusBackendDefinition) o;
    return Objects.equals(this.check, checkStatusBackendDefinition.check)
        && Objects.equals(this.description, checkStatusBackendDefinition.description)
        && Objects.equals(this.group, checkStatusBackendDefinition.group)
        && Objects.equals(this.groupBy, checkStatusBackendDefinition.groupBy)
        && Objects.equals(this.grouping, checkStatusBackendDefinition.grouping)
        && Objects.equals(this.notes, checkStatusBackendDefinition.notes)
        && Objects.equals(this.tags, checkStatusBackendDefinition.tags)
        && Objects.equals(this.time, checkStatusBackendDefinition.time)
        && Objects.equals(this.title, checkStatusBackendDefinition.title)
        && Objects.equals(this.titleAlign, checkStatusBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, checkStatusBackendDefinition.titleSize)
        && Objects.equals(this.type, checkStatusBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        check,
        description,
        group,
        groupBy,
        grouping,
        notes,
        tags,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckStatusBackendDefinition {\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
