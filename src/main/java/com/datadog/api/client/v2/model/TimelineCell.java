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
   * <p>timeline cell</p>
 */
@JsonPropertyOrder({
  TimelineCell.JSON_PROPERTY_AUTHOR,
  TimelineCell.JSON_PROPERTY_CELL_CONTENT,
  TimelineCell.JSON_PROPERTY_CREATED_AT,
  TimelineCell.JSON_PROPERTY_DELETED_AT,
  TimelineCell.JSON_PROPERTY_MODIFIED_AT,
  TimelineCell.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimelineCell {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private TimelineCellAuthor author;

  public static final String JSON_PROPERTY_CELL_CONTENT = "cell_content";
  private TimelineCellContent cellContent;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private OffsetDateTime deletedAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TimelineCellType type;

  public TimelineCell author(TimelineCellAuthor author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * <p>author of the timeline cell</p>
   * @return author
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTHOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TimelineCellAuthor getAuthor() {
        return author;
      }
  public void setAuthor(TimelineCellAuthor author) {
    this.author = author;
  }
  public TimelineCell cellContent(TimelineCellContent cellContent) {
    this.cellContent = cellContent;
    this.unparsed |= cellContent.unparsed;
    return this;
  }

  /**
   * <p>timeline cell content</p>
   * @return cellContent
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CELL_CONTENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TimelineCellContent getCellContent() {
        return cellContent;
      }
  public void setCellContent(TimelineCellContent cellContent) {
    this.cellContent = cellContent;
  }

  /**
   * <p>Timestamp of when the cell was created</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }

  /**
   * <p>Timestamp of when the cell was deleted</p>
   * @return deletedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DELETED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getDeletedAt() {
        return deletedAt;
      }

  /**
   * <p>Timestamp of when the cell was last modified</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public TimelineCell type(TimelineCellType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Timeline cell content type</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TimelineCellType getType() {
        return type;
      }
  public void setType(TimelineCellType type) {
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
   * @return TimelineCell
   */
  @JsonAnySetter
  public TimelineCell putAdditionalProperty(String key, Object value) {
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
   * Return true if this TimelineCell object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineCell timelineCell = (TimelineCell) o;
    return Objects.equals(this.author, timelineCell.author) && Objects.equals(this.cellContent, timelineCell.cellContent) && Objects.equals(this.createdAt, timelineCell.createdAt) && Objects.equals(this.deletedAt, timelineCell.deletedAt) && Objects.equals(this.modifiedAt, timelineCell.modifiedAt) && Objects.equals(this.type, timelineCell.type) && Objects.equals(this.additionalProperties, timelineCell.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(author,cellContent,createdAt,deletedAt,modifiedAt,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineCell {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    cellContent: ").append(toIndentedString(cellContent)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
