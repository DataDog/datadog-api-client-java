/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes that define the reference table's configuration and properties. */
@JsonPropertyOrder({
  TableResultV2DataAttributes.JSON_PROPERTY_CREATED_BY,
  TableResultV2DataAttributes.JSON_PROPERTY_DESCRIPTION,
  TableResultV2DataAttributes.JSON_PROPERTY_FILE_METADATA,
  TableResultV2DataAttributes.JSON_PROPERTY_LAST_UPDATED_BY,
  TableResultV2DataAttributes.JSON_PROPERTY_ROW_COUNT,
  TableResultV2DataAttributes.JSON_PROPERTY_SCHEMA,
  TableResultV2DataAttributes.JSON_PROPERTY_SOURCE,
  TableResultV2DataAttributes.JSON_PROPERTY_STATUS,
  TableResultV2DataAttributes.JSON_PROPERTY_TABLE_NAME,
  TableResultV2DataAttributes.JSON_PROPERTY_TAGS,
  TableResultV2DataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableResultV2DataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FILE_METADATA = "file_metadata";
  private TableResultV2DataAttributesFileMetadata fileMetadata;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "last_updated_by";
  private String lastUpdatedBy;

  public static final String JSON_PROPERTY_ROW_COUNT = "row_count";
  private Long rowCount;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private TableResultV2DataAttributesSchema schema;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private ReferenceTableSourceType source;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public TableResultV2DataAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * UUID of the user who created the reference table.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public TableResultV2DataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional text describing the purpose or contents of this reference table.
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

  public TableResultV2DataAttributes fileMetadata(
      TableResultV2DataAttributesFileMetadata fileMetadata) {
    this.fileMetadata = fileMetadata;
    this.unparsed |= fileMetadata.unparsed;
    return this;
  }

  /**
   * Metadata specifying where and how to access the reference table's data file.
   *
   * <p>For cloud storage tables (S3/GCS/Azure): - sync_enabled and access_details will always be
   * present - error fields (error_message, error_row_count, error_type) are present only when
   * errors occur
   *
   * <p>For local file tables: - error fields (error_message, error_row_count) are present only when
   * errors occur - sync_enabled, access_details are never present
   *
   * @return fileMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableResultV2DataAttributesFileMetadata getFileMetadata() {
    return fileMetadata;
  }

  public void setFileMetadata(TableResultV2DataAttributesFileMetadata fileMetadata) {
    this.fileMetadata = fileMetadata;
  }

  public TableResultV2DataAttributes lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * UUID of the user who last updated the reference table.
   *
   * @return lastUpdatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public TableResultV2DataAttributes rowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  /**
   * The number of successfully processed rows in the reference table.
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

  public TableResultV2DataAttributes schema(TableResultV2DataAttributesSchema schema) {
    this.schema = schema;
    this.unparsed |= schema.unparsed;
    return this;
  }

  /**
   * Schema defining the structure and columns of the reference table.
   *
   * @return schema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableResultV2DataAttributesSchema getSchema() {
    return schema;
  }

  public void setSchema(TableResultV2DataAttributesSchema schema) {
    this.schema = schema;
  }

  public TableResultV2DataAttributes source(ReferenceTableSourceType source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * The source type for reference table data. Includes all possible source types that can appear in
   * responses.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReferenceTableSourceType getSource() {
    return source;
  }

  public void setSource(ReferenceTableSourceType source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public TableResultV2DataAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The processing status of the table.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TableResultV2DataAttributes tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Unique name to identify this reference table. Used in enrichment processors and API calls.
   *
   * @return tableName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public TableResultV2DataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TableResultV2DataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for organizing and filtering reference tables.
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

  public TableResultV2DataAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When the reference table was last updated, in ISO 8601 format.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return TableResultV2DataAttributes
   */
  @JsonAnySetter
  public TableResultV2DataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TableResultV2DataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableResultV2DataAttributes tableResultV2DataAttributes = (TableResultV2DataAttributes) o;
    return Objects.equals(this.createdBy, tableResultV2DataAttributes.createdBy)
        && Objects.equals(this.description, tableResultV2DataAttributes.description)
        && Objects.equals(this.fileMetadata, tableResultV2DataAttributes.fileMetadata)
        && Objects.equals(this.lastUpdatedBy, tableResultV2DataAttributes.lastUpdatedBy)
        && Objects.equals(this.rowCount, tableResultV2DataAttributes.rowCount)
        && Objects.equals(this.schema, tableResultV2DataAttributes.schema)
        && Objects.equals(this.source, tableResultV2DataAttributes.source)
        && Objects.equals(this.status, tableResultV2DataAttributes.status)
        && Objects.equals(this.tableName, tableResultV2DataAttributes.tableName)
        && Objects.equals(this.tags, tableResultV2DataAttributes.tags)
        && Objects.equals(this.updatedAt, tableResultV2DataAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, tableResultV2DataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdBy,
        description,
        fileMetadata,
        lastUpdatedBy,
        rowCount,
        schema,
        source,
        status,
        tableName,
        tags,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableResultV2DataAttributes {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileMetadata: ").append(toIndentedString(fileMetadata)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
