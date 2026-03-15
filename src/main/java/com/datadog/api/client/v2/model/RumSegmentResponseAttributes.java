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

/** Attributes of a segment in a response. */
@JsonPropertyOrder({
  RumSegmentResponseAttributes.JSON_PROPERTY_CREATED_AT,
  RumSegmentResponseAttributes.JSON_PROPERTY_CREATED_BY,
  RumSegmentResponseAttributes.JSON_PROPERTY_DATA_QUERY,
  RumSegmentResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  RumSegmentResponseAttributes.JSON_PROPERTY_MODIFIED_AT,
  RumSegmentResponseAttributes.JSON_PROPERTY_MODIFIED_BY,
  RumSegmentResponseAttributes.JSON_PROPERTY_NAME,
  RumSegmentResponseAttributes.JSON_PROPERTY_ORG_ID,
  RumSegmentResponseAttributes.JSON_PROPERTY_ROW_COUNT,
  RumSegmentResponseAttributes.JSON_PROPERTY_SOURCE,
  RumSegmentResponseAttributes.JSON_PROPERTY_TAGS,
  RumSegmentResponseAttributes.JSON_PROPERTY_TYPE,
  RumSegmentResponseAttributes.JSON_PROPERTY_UUID,
  RumSegmentResponseAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSegmentResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private RumSegmentUser createdBy;

  public static final String JSON_PROPERTY_DATA_QUERY = "data_query";
  private RumSegmentDataQuery dataQuery;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private RumSegmentUser modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_ROW_COUNT = "row_count";
  private Long rowCount;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private RumSegmentSource source;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private RumSegmentSegmentType type;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public RumSegmentResponseAttributes() {}

  @JsonCreator
  public RumSegmentResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) RumSegmentUser createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_QUERY)
          RumSegmentDataQuery dataQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_BY) RumSegmentUser modifiedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROW_COUNT) Long rowCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) RumSegmentSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) RumSegmentSegmentType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UUID) String uuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    this.dataQuery = dataQuery;
    this.unparsed |= dataQuery.unparsed;
    this.description = description;
    this.modifiedAt = modifiedAt;
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    this.name = name;
    this.orgId = orgId;
    this.rowCount = rowCount;
    this.source = source;
    this.unparsed |= !source.isValid();
    this.tags = tags;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.uuid = uuid;
    this.version = version;
  }

  public RumSegmentResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation timestamp in RFC 3339 format.
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

  public RumSegmentResponseAttributes createdBy(RumSegmentUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * A user who performed an action on a segment.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSegmentUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(RumSegmentUser createdBy) {
    this.createdBy = createdBy;
  }

  public RumSegmentResponseAttributes dataQuery(RumSegmentDataQuery dataQuery) {
    this.dataQuery = dataQuery;
    this.unparsed |= dataQuery.unparsed;
    return this;
  }

  /**
   * Query definition for the segment. Contains one or more query blocks and an optional combination
   * formula.
   *
   * @return dataQuery
   */
  @JsonProperty(JSON_PROPERTY_DATA_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSegmentDataQuery getDataQuery() {
    return dataQuery;
  }

  public void setDataQuery(RumSegmentDataQuery dataQuery) {
    this.dataQuery = dataQuery;
  }

  public RumSegmentResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the segment.
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

  public RumSegmentResponseAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The last modification timestamp in RFC 3339 format.
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

  public RumSegmentResponseAttributes modifiedBy(RumSegmentUser modifiedBy) {
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    return this;
  }

  /**
   * A user who performed an action on a segment.
   *
   * @return modifiedBy
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSegmentUser getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(RumSegmentUser modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public RumSegmentResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the segment.
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

  public RumSegmentResponseAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The organization identifier.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public RumSegmentResponseAttributes rowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  /**
   * The number of users in the segment.
   *
   * @return rowCount
   */
  @JsonProperty(JSON_PROPERTY_ROW_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRowCount() {
    return rowCount;
  }

  public void setRowCount(Long rowCount) {
    this.rowCount = rowCount;
  }

  public RumSegmentResponseAttributes source(RumSegmentSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * The source of a segment.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSegmentSource getSource() {
    return source;
  }

  public void setSource(RumSegmentSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public RumSegmentResponseAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RumSegmentResponseAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags for the segment.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public RumSegmentResponseAttributes type(RumSegmentSegmentType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of a segment based on its data query configuration.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSegmentSegmentType getType() {
    return type;
  }

  public void setType(RumSegmentSegmentType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public RumSegmentResponseAttributes uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The unique identifier of the segment.
   *
   * @return uuid
   */
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public RumSegmentResponseAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version number of the segment.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return RumSegmentResponseAttributes
   */
  @JsonAnySetter
  public RumSegmentResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSegmentResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSegmentResponseAttributes rumSegmentResponseAttributes = (RumSegmentResponseAttributes) o;
    return Objects.equals(this.createdAt, rumSegmentResponseAttributes.createdAt)
        && Objects.equals(this.createdBy, rumSegmentResponseAttributes.createdBy)
        && Objects.equals(this.dataQuery, rumSegmentResponseAttributes.dataQuery)
        && Objects.equals(this.description, rumSegmentResponseAttributes.description)
        && Objects.equals(this.modifiedAt, rumSegmentResponseAttributes.modifiedAt)
        && Objects.equals(this.modifiedBy, rumSegmentResponseAttributes.modifiedBy)
        && Objects.equals(this.name, rumSegmentResponseAttributes.name)
        && Objects.equals(this.orgId, rumSegmentResponseAttributes.orgId)
        && Objects.equals(this.rowCount, rumSegmentResponseAttributes.rowCount)
        && Objects.equals(this.source, rumSegmentResponseAttributes.source)
        && Objects.equals(this.tags, rumSegmentResponseAttributes.tags)
        && Objects.equals(this.type, rumSegmentResponseAttributes.type)
        && Objects.equals(this.uuid, rumSegmentResponseAttributes.uuid)
        && Objects.equals(this.version, rumSegmentResponseAttributes.version)
        && Objects.equals(
            this.additionalProperties, rumSegmentResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        dataQuery,
        description,
        modifiedAt,
        modifiedBy,
        name,
        orgId,
        rowCount,
        source,
        tags,
        type,
        uuid,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSegmentResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dataQuery: ").append(toIndentedString(dataQuery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
