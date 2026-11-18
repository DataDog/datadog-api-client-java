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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a segment in a list. The segment definition is not included. */
@JsonPropertyOrder({
  SegmentSummaryAttributes.JSON_PROPERTY_CREATED_AT,
  SegmentSummaryAttributes.JSON_PROPERTY_CREATED_BY,
  SegmentSummaryAttributes.JSON_PROPERTY_DESCRIPTION,
  SegmentSummaryAttributes.JSON_PROPERTY_ENTITY,
  SegmentSummaryAttributes.JSON_PROPERTY_MODIFIED_AT,
  SegmentSummaryAttributes.JSON_PROPERTY_MODIFIED_BY,
  SegmentSummaryAttributes.JSON_PROPERTY_NAME,
  SegmentSummaryAttributes.JSON_PROPERTY_ORG_ID,
  SegmentSummaryAttributes.JSON_PROPERTY_ROW_COUNT,
  SegmentSummaryAttributes.JSON_PROPERTY_SOURCE,
  SegmentSummaryAttributes.JSON_PROPERTY_TAGS,
  SegmentSummaryAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentSummaryAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private SegmentUser createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private String entity;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private SegmentUser modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_ROW_COUNT = "row_count";
  private Long rowCount;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Long source;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SegmentSummaryAttributes() {}

  @JsonCreator
  public SegmentSummaryAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.createdAt = createdAt;
    this.modifiedAt = modifiedAt;
    this.name = name;
  }

  public SegmentSummaryAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time the segment was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SegmentSummaryAttributes createdBy(SegmentUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * A Datadog user who created, modified, or disabled a segment.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SegmentUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(SegmentUser createdBy) {
    this.createdBy = createdBy;
    if (createdBy != null) {
      this.unparsed |= createdBy.unparsed;
    }
  }

  public SegmentSummaryAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the segment.
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

  public SegmentSummaryAttributes entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Kind of entity that the segment contains, <code>user</code> or <code>account</code>.
   *
   * @return entity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public SegmentSummaryAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Time the segment was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public SegmentSummaryAttributes modifiedBy(SegmentUser modifiedBy) {
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    return this;
  }

  /**
   * A Datadog user who created, modified, or disabled a segment.
   *
   * @return modifiedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SegmentUser getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(SegmentUser modifiedBy) {
    this.modifiedBy = modifiedBy;
    if (modifiedBy != null) {
      this.unparsed |= modifiedBy.unparsed;
    }
  }

  public SegmentSummaryAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the segment.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SegmentSummaryAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * ID of the organization that owns the segment.
   *
   * @return orgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public SegmentSummaryAttributes rowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  /**
   * Number of entities in the segment when its membership was last computed. <code>-1</code> means
   * the count is not available yet.
   *
   * @return rowCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRowCount() {
    return rowCount;
  }

  public void setRowCount(Long rowCount) {
    this.rowCount = rowCount;
  }

  public SegmentSummaryAttributes source(Long source) {
    this.source = source;
    return this;
  }

  /**
   * Who created the segment. <code>0</code> for a user and <code>1</code> for Datadog.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSource() {
    return source;
  }

  public void setSource(Long source) {
    this.source = source;
  }

  public SegmentSummaryAttributes tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }

  public SegmentSummaryAttributes addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Tags of the segment.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getTags() {
    return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }

  public SegmentSummaryAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Kind of segment, derived from its blocks.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return SegmentSummaryAttributes
   */
  @JsonAnySetter
  public SegmentSummaryAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentSummaryAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentSummaryAttributes segmentSummaryAttributes = (SegmentSummaryAttributes) o;
    return Objects.equals(this.createdAt, segmentSummaryAttributes.createdAt)
        && Objects.equals(this.createdBy, segmentSummaryAttributes.createdBy)
        && Objects.equals(this.description, segmentSummaryAttributes.description)
        && Objects.equals(this.entity, segmentSummaryAttributes.entity)
        && Objects.equals(this.modifiedAt, segmentSummaryAttributes.modifiedAt)
        && Objects.equals(this.modifiedBy, segmentSummaryAttributes.modifiedBy)
        && Objects.equals(this.name, segmentSummaryAttributes.name)
        && Objects.equals(this.orgId, segmentSummaryAttributes.orgId)
        && Objects.equals(this.rowCount, segmentSummaryAttributes.rowCount)
        && Objects.equals(this.source, segmentSummaryAttributes.source)
        && Objects.equals(this.tags, segmentSummaryAttributes.tags)
        && Objects.equals(this.type, segmentSummaryAttributes.type)
        && Objects.equals(this.additionalProperties, segmentSummaryAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        description,
        entity,
        modifiedAt,
        modifiedBy,
        name,
        orgId,
        rowCount,
        source,
        tags,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentSummaryAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
