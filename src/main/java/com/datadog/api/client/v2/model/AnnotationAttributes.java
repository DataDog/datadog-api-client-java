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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of an annotation returned in a response. */
@JsonPropertyOrder({
  AnnotationAttributes.JSON_PROPERTY_AUTHOR_ID,
  AnnotationAttributes.JSON_PROPERTY_COLOR,
  AnnotationAttributes.JSON_PROPERTY_CREATED_AT,
  AnnotationAttributes.JSON_PROPERTY_DESCRIPTION,
  AnnotationAttributes.JSON_PROPERTY_END_TIME,
  AnnotationAttributes.JSON_PROPERTY_MODIFIED_AT,
  AnnotationAttributes.JSON_PROPERTY_PAGE_ID,
  AnnotationAttributes.JSON_PROPERTY_START_TIME,
  AnnotationAttributes.JSON_PROPERTY_TYPE,
  AnnotationAttributes.JSON_PROPERTY_WIDGET_IDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnnotationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR_ID = "author_id";
  private String authorId;

  public static final String JSON_PROPERTY_COLOR = "color";
  private AnnotationColor color;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private Long endTime;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private Long modifiedAt;

  public static final String JSON_PROPERTY_PAGE_ID = "page_id";
  private String pageId;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private Long startTime;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AnnotationKind type;

  public static final String JSON_PROPERTY_WIDGET_IDS = "widget_ids";
  private List<String> widgetIds = null;

  public AnnotationAttributes() {}

  @JsonCreator
  public AnnotationAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHOR_ID) String authorId,
      @JsonProperty(required = true, value = JSON_PROPERTY_COLOR) AnnotationColor color,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) Long createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_END_TIME) Long endTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) Long modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_PAGE_ID) String pageId,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_TIME) Long startTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AnnotationKind type) {
    this.authorId = authorId;
    this.color = color;
    this.unparsed |= !color.isValid();
    this.createdAt = createdAt;
    this.description = description;
    this.endTime = endTime;
    if (endTime != null) {}
    this.modifiedAt = modifiedAt;
    this.pageId = pageId;
    this.startTime = startTime;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AnnotationAttributes authorId(String authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * Identifier of the user who created the annotation.
   *
   * @return authorId
   */
  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  public AnnotationAttributes color(AnnotationColor color) {
    this.color = color;
    this.unparsed |= !color.isValid();
    return this;
  }

  /**
   * Color used to render the annotation in the UI.
   *
   * @return color
   */
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnnotationColor getColor() {
    return color;
  }

  public void setColor(AnnotationColor color) {
    if (!color.isValid()) {
      this.unparsed = true;
    }
    this.color = color;
  }

  public AnnotationAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time of the annotation in milliseconds since the Unix epoch.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public AnnotationAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * User-defined text attached to the annotation.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AnnotationAttributes endTime(Long endTime) {
    this.endTime = endTime;
    if (endTime != null) {}
    return this;
  }

  /**
   * End time of the annotation in milliseconds since the Unix epoch. Null for <code>pointInTime
   * </code> annotations.
   *
   * @return endTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public AnnotationAttributes modifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Last modification time of the annotation in milliseconds since the Unix epoch.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public AnnotationAttributes pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * ID of the page the annotation belongs to, prefixed with the page type and joined by a colon
   * (for example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890</code>).
   *
   * @return pageId
   */
  @JsonProperty(JSON_PROPERTY_PAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  public AnnotationAttributes startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Start time of the annotation in milliseconds since the Unix epoch.
   *
   * @return startTime
   */
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public AnnotationAttributes type(AnnotationKind type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Kind of annotation. <code>pointInTime</code> annotations mark a single moment in time, while
   * <code>timeRegion</code> annotations span a window of time and require an <code>end_time</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnnotationKind getType() {
    return type;
  }

  public void setType(AnnotationKind type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public AnnotationAttributes widgetIds(List<String> widgetIds) {
    this.widgetIds = widgetIds;
    return this;
  }

  public AnnotationAttributes addWidgetIdsItem(String widgetIdsItem) {
    if (this.widgetIds == null) {
      this.widgetIds = new ArrayList<>();
    }
    this.widgetIds.add(widgetIdsItem);
    return this;
  }

  /**
   * IDs of widgets the annotation is associated with. When empty or omitted, the annotation applies
   * to the whole page.
   *
   * @return widgetIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDGET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getWidgetIds() {
    return widgetIds;
  }

  public void setWidgetIds(List<String> widgetIds) {
    this.widgetIds = widgetIds;
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
   * @return AnnotationAttributes
   */
  @JsonAnySetter
  public AnnotationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AnnotationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationAttributes annotationAttributes = (AnnotationAttributes) o;
    return Objects.equals(this.authorId, annotationAttributes.authorId)
        && Objects.equals(this.color, annotationAttributes.color)
        && Objects.equals(this.createdAt, annotationAttributes.createdAt)
        && Objects.equals(this.description, annotationAttributes.description)
        && Objects.equals(this.endTime, annotationAttributes.endTime)
        && Objects.equals(this.modifiedAt, annotationAttributes.modifiedAt)
        && Objects.equals(this.pageId, annotationAttributes.pageId)
        && Objects.equals(this.startTime, annotationAttributes.startTime)
        && Objects.equals(this.type, annotationAttributes.type)
        && Objects.equals(this.widgetIds, annotationAttributes.widgetIds)
        && Objects.equals(this.additionalProperties, annotationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authorId,
        color,
        createdAt,
        description,
        endTime,
        modifiedAt,
        pageId,
        startTime,
        type,
        widgetIds,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationAttributes {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    widgetIds: ").append(toIndentedString(widgetIds)).append("\n");
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
