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

/** */
@JsonPropertyOrder({
  SegmentDataAttributes.JSON_PROPERTY_CREATED_AT,
  SegmentDataAttributes.JSON_PROPERTY_CREATED_BY,
  SegmentDataAttributes.JSON_PROPERTY_DATA_QUERY,
  SegmentDataAttributes.JSON_PROPERTY_DESCRIPTION,
  SegmentDataAttributes.JSON_PROPERTY_DISABLED_AT,
  SegmentDataAttributes.JSON_PROPERTY_DISABLED_BY,
  SegmentDataAttributes.JSON_PROPERTY_MATERIALIZATION_ROW_COUNT,
  SegmentDataAttributes.JSON_PROPERTY_MATERIALIZED_AT,
  SegmentDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  SegmentDataAttributes.JSON_PROPERTY_MODIFIED_BY,
  SegmentDataAttributes.JSON_PROPERTY_NAME,
  SegmentDataAttributes.JSON_PROPERTY_ORG_ID,
  SegmentDataAttributes.JSON_PROPERTY_SOURCE,
  SegmentDataAttributes.JSON_PROPERTY_TAGS,
  SegmentDataAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private SegmentDataSource createdBy;

  public static final String JSON_PROPERTY_DATA_QUERY = "data_query";
  private SegmentDataAttributesDataQuery dataQuery;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISABLED_AT = "disabled_at";
  private OffsetDateTime disabledAt;

  public static final String JSON_PROPERTY_DISABLED_BY = "disabled_by";
  private SegmentDataSource disabledBy;

  public static final String JSON_PROPERTY_MATERIALIZATION_ROW_COUNT = "materialization_row_count";
  private Long materializationRowCount;

  public static final String JSON_PROPERTY_MATERIALIZED_AT = "materialized_at";
  private String materializedAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private SegmentDataSource modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Long source;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SegmentDataAttributes() {}

  @JsonCreator
  public SegmentDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_QUERY)
          SegmentDataAttributesDataQuery dataQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataQuery = dataQuery;
    this.unparsed |= dataQuery.unparsed;
    this.name = name;
  }

  public SegmentDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * GetcreatedAt
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SegmentDataAttributes createdBy(SegmentDataSource createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * GetcreatedBy
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SegmentDataSource getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(SegmentDataSource createdBy) {
    this.createdBy = createdBy;
  }

  public SegmentDataAttributes dataQuery(SegmentDataAttributesDataQuery dataQuery) {
    this.dataQuery = dataQuery;
    this.unparsed |= dataQuery.unparsed;
    return this;
  }

  /**
   * GetdataQuery
   *
   * @return dataQuery
   */
  @JsonProperty(JSON_PROPERTY_DATA_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SegmentDataAttributesDataQuery getDataQuery() {
    return dataQuery;
  }

  public void setDataQuery(SegmentDataAttributesDataQuery dataQuery) {
    this.dataQuery = dataQuery;
  }

  public SegmentDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Getdescription
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

  public SegmentDataAttributes disabledAt(OffsetDateTime disabledAt) {
    this.disabledAt = disabledAt;
    return this;
  }

  /**
   * GetdisabledAt
   *
   * @return disabledAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDisabledAt() {
    return disabledAt;
  }

  public void setDisabledAt(OffsetDateTime disabledAt) {
    this.disabledAt = disabledAt;
  }

  public SegmentDataAttributes disabledBy(SegmentDataSource disabledBy) {
    this.disabledBy = disabledBy;
    this.unparsed |= disabledBy.unparsed;
    return this;
  }

  /**
   * GetdisabledBy
   *
   * @return disabledBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SegmentDataSource getDisabledBy() {
    return disabledBy;
  }

  public void setDisabledBy(SegmentDataSource disabledBy) {
    this.disabledBy = disabledBy;
  }

  public SegmentDataAttributes materializationRowCount(Long materializationRowCount) {
    this.materializationRowCount = materializationRowCount;
    return this;
  }

  /**
   * GetmaterializationRowCount
   *
   * @return materializationRowCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATERIALIZATION_ROW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaterializationRowCount() {
    return materializationRowCount;
  }

  public void setMaterializationRowCount(Long materializationRowCount) {
    this.materializationRowCount = materializationRowCount;
  }

  public SegmentDataAttributes materializedAt(String materializedAt) {
    this.materializedAt = materializedAt;
    return this;
  }

  /**
   * GetmaterializedAt
   *
   * @return materializedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATERIALIZED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMaterializedAt() {
    return materializedAt;
  }

  public void setMaterializedAt(String materializedAt) {
    this.materializedAt = materializedAt;
  }

  public SegmentDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * GetmodifiedAt
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public SegmentDataAttributes modifiedBy(SegmentDataSource modifiedBy) {
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    return this;
  }

  /**
   * GetmodifiedBy
   *
   * @return modifiedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SegmentDataSource getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(SegmentDataSource modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public SegmentDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Getname
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

  public SegmentDataAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * GetorgId
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

  public SegmentDataAttributes source(Long source) {
    this.source = source;
    return this;
  }

  /**
   * Getsource
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

  public SegmentDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SegmentDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Gettags
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

  public SegmentDataAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Getversion
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return SegmentDataAttributes
   */
  @JsonAnySetter
  public SegmentDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentDataAttributes segmentDataAttributes = (SegmentDataAttributes) o;
    return Objects.equals(this.createdAt, segmentDataAttributes.createdAt)
        && Objects.equals(this.createdBy, segmentDataAttributes.createdBy)
        && Objects.equals(this.dataQuery, segmentDataAttributes.dataQuery)
        && Objects.equals(this.description, segmentDataAttributes.description)
        && Objects.equals(this.disabledAt, segmentDataAttributes.disabledAt)
        && Objects.equals(this.disabledBy, segmentDataAttributes.disabledBy)
        && Objects.equals(
            this.materializationRowCount, segmentDataAttributes.materializationRowCount)
        && Objects.equals(this.materializedAt, segmentDataAttributes.materializedAt)
        && Objects.equals(this.modifiedAt, segmentDataAttributes.modifiedAt)
        && Objects.equals(this.modifiedBy, segmentDataAttributes.modifiedBy)
        && Objects.equals(this.name, segmentDataAttributes.name)
        && Objects.equals(this.orgId, segmentDataAttributes.orgId)
        && Objects.equals(this.source, segmentDataAttributes.source)
        && Objects.equals(this.tags, segmentDataAttributes.tags)
        && Objects.equals(this.version, segmentDataAttributes.version)
        && Objects.equals(this.additionalProperties, segmentDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        dataQuery,
        description,
        disabledAt,
        disabledBy,
        materializationRowCount,
        materializedAt,
        modifiedAt,
        modifiedBy,
        name,
        orgId,
        source,
        tags,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dataQuery: ").append(toIndentedString(dataQuery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabledAt: ").append(toIndentedString(disabledAt)).append("\n");
    sb.append("    disabledBy: ").append(toIndentedString(disabledBy)).append("\n");
    sb.append("    materializationRowCount: ")
        .append(toIndentedString(materializationRowCount))
        .append("\n");
    sb.append("    materializedAt: ").append(toIndentedString(materializedAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
