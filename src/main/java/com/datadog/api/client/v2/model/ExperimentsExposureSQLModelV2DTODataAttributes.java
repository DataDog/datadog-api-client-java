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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Query and column mappings used to read experiment assignment data. */
@JsonPropertyOrder({
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_ARCHIVED_AT,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_CREATED_AT,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_DATE_PARTITION_COLUMN,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_EXPERIMENT_COLUMN,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_EXPERIMENT_COUNT,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_NAME,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_PROPERTIES,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_SQL,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_SUBJECT_TYPES,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_TIMESTAMP_COLUMN,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_UPDATED_AT,
  ExperimentsExposureSQLModelV2DTODataAttributes.JSON_PROPERTY_VARIANT_COLUMN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExposureSQLModelV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVED_AT = "archived_at";
  private JsonNullable<OffsetDateTime> archivedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATE_PARTITION_COLUMN = "date_partition_column";
  private JsonNullable<String> datePartitionColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPERIMENT_COLUMN = "experiment_column";
  private String experimentColumn;

  public static final String JSON_PROPERTY_EXPERIMENT_COUNT = "experiment_count";
  private JsonNullable<Long> experimentCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<ExperimentsExposureSQLModelV2DTODataAttributesItems> properties = null;

  public static final String JSON_PROPERTY_SQL = "sql";
  private String sql;

  public static final String JSON_PROPERTY_SUBJECT_TYPES = "subject_types";
  private List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
      subjectTypes = null;

  public static final String JSON_PROPERTY_TIMESTAMP_COLUMN = "timestamp_column";
  private String timestampColumn;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_VARIANT_COLUMN = "variant_column";
  private String variantColumn;

  public ExperimentsExposureSQLModelV2DTODataAttributes archivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = JsonNullable.<OffsetDateTime>of(archivedAt);
    return this;
  }

  /**
   * Time when the exposure SQL model was archived.
   *
   * @return archivedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getArchivedAt() {
    return archivedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getArchivedAt_JsonNullable() {
    return archivedAt;
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
  public void setArchivedAt_JsonNullable(JsonNullable<OffsetDateTime> archivedAt) {
    this.archivedAt = archivedAt;
  }

  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = JsonNullable.<OffsetDateTime>of(archivedAt);
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the exposure SQL model was created.
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

  public ExperimentsExposureSQLModelV2DTODataAttributes datePartitionColumn(
      String datePartitionColumn) {
    this.datePartitionColumn = JsonNullable.<String>of(datePartitionColumn);
    return this;
  }

  /**
   * Column used to identify date partitions in the exposure data.
   *
   * @return datePartitionColumn
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDatePartitionColumn() {
    return datePartitionColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE_PARTITION_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDatePartitionColumn_JsonNullable() {
    return datePartitionColumn;
  }

  @JsonProperty(JSON_PROPERTY_DATE_PARTITION_COLUMN)
  public void setDatePartitionColumn_JsonNullable(JsonNullable<String> datePartitionColumn) {
    this.datePartitionColumn = datePartitionColumn;
  }

  public void setDatePartitionColumn(String datePartitionColumn) {
    this.datePartitionColumn = JsonNullable.<String>of(datePartitionColumn);
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes experimentColumn(String experimentColumn) {
    this.experimentColumn = experimentColumn;
    return this;
  }

  /**
   * SQL result column that contains the experiment key.
   *
   * @return experimentColumn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExperimentColumn() {
    return experimentColumn;
  }

  public void setExperimentColumn(String experimentColumn) {
    this.experimentColumn = experimentColumn;
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes experimentCount(Long experimentCount) {
    this.experimentCount = JsonNullable.<Long>of(experimentCount);
    return this;
  }

  /**
   * Number of experiments associated with the exposure SQL model.
   *
   * @return experimentCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getExperimentCount() {
    return experimentCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getExperimentCount_JsonNullable() {
    return experimentCount;
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_COUNT)
  public void setExperimentCount_JsonNullable(JsonNullable<Long> experimentCount) {
    this.experimentCount = experimentCount;
  }

  public void setExperimentCount(Long experimentCount) {
    this.experimentCount = JsonNullable.<Long>of(experimentCount);
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes migrationMetadata(
      Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
    return this;
  }

  /**
   * Metadata associated with migration of this resource.
   *
   * @return migrationMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATION_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getMigrationMetadata() {
    return migrationMetadata;
  }

  public void setMigrationMetadata(Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the exposure SQL model.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes properties(
      List<ExperimentsExposureSQLModelV2DTODataAttributesItems> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ExperimentsExposureSQLModelV2DTODataAttributesItems item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes addPropertiesItem(
      ExperimentsExposureSQLModelV2DTODataAttributesItems propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    this.unparsed |= propertiesItem.unparsed;
    return this;
  }

  /**
   * Property columns available for filtering or splitting exposure data.
   *
   * @return properties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsExposureSQLModelV2DTODataAttributesItems> getProperties() {
    return properties;
  }

  public void setProperties(List<ExperimentsExposureSQLModelV2DTODataAttributesItems> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ExperimentsExposureSQLModelV2DTODataAttributesItems item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes sql(String sql) {
    this.sql = sql;
    return this;
  }

  /**
   * SQL query that supplies the experiment assignment data.
   *
   * @return sql
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSql() {
    return sql;
  }

  public void setSql(String sql) {
    this.sql = sql;
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes subjectTypes(
      List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
          subjectTypes) {
    this.subjectTypes = subjectTypes;
    if (subjectTypes != null) {
      for (ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems item :
          subjectTypes) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes addSubjectTypesItem(
      ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems subjectTypesItem) {
    if (this.subjectTypes == null) {
      this.subjectTypes = new ArrayList<>();
    }
    this.subjectTypes.add(subjectTypesItem);
    this.unparsed |= subjectTypesItem.unparsed;
    return this;
  }

  /**
   * Mappings between subject types and their identifier columns.
   *
   * @return subjectTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
      getSubjectTypes() {
    return subjectTypes;
  }

  public void setSubjectTypes(
      List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
          subjectTypes) {
    this.subjectTypes = subjectTypes;
    if (subjectTypes != null) {
      for (ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems item :
          subjectTypes) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes timestampColumn(String timestampColumn) {
    this.timestampColumn = timestampColumn;
    return this;
  }

  /**
   * SQL result column that contains the assignment timestamp.
   *
   * @return timestampColumn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimestampColumn() {
    return timestampColumn;
  }

  public void setTimestampColumn(String timestampColumn) {
    this.timestampColumn = timestampColumn;
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when the exposure SQL model was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ExperimentsExposureSQLModelV2DTODataAttributes variantColumn(String variantColumn) {
    this.variantColumn = variantColumn;
    return this;
  }

  /**
   * SQL result column that contains the assigned variant.
   *
   * @return variantColumn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariantColumn() {
    return variantColumn;
  }

  public void setVariantColumn(String variantColumn) {
    this.variantColumn = variantColumn;
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
   * @return ExperimentsExposureSQLModelV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsExposureSQLModelV2DTODataAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ExperimentsExposureSQLModelV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExposureSQLModelV2DTODataAttributes experimentsExposureSqlModelV2DtoDataAttributes =
        (ExperimentsExposureSQLModelV2DTODataAttributes) o;
    return Objects.equals(
            this.archivedAt, experimentsExposureSqlModelV2DtoDataAttributes.archivedAt)
        && Objects.equals(this.createdAt, experimentsExposureSqlModelV2DtoDataAttributes.createdAt)
        && Objects.equals(
            this.datePartitionColumn,
            experimentsExposureSqlModelV2DtoDataAttributes.datePartitionColumn)
        && Objects.equals(
            this.experimentColumn, experimentsExposureSqlModelV2DtoDataAttributes.experimentColumn)
        && Objects.equals(
            this.experimentCount, experimentsExposureSqlModelV2DtoDataAttributes.experimentCount)
        && Objects.equals(
            this.migrationMetadata,
            experimentsExposureSqlModelV2DtoDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsExposureSqlModelV2DtoDataAttributes.name)
        && Objects.equals(
            this.properties, experimentsExposureSqlModelV2DtoDataAttributes.properties)
        && Objects.equals(this.sql, experimentsExposureSqlModelV2DtoDataAttributes.sql)
        && Objects.equals(
            this.subjectTypes, experimentsExposureSqlModelV2DtoDataAttributes.subjectTypes)
        && Objects.equals(
            this.timestampColumn, experimentsExposureSqlModelV2DtoDataAttributes.timestampColumn)
        && Objects.equals(this.updatedAt, experimentsExposureSqlModelV2DtoDataAttributes.updatedAt)
        && Objects.equals(
            this.variantColumn, experimentsExposureSqlModelV2DtoDataAttributes.variantColumn)
        && Objects.equals(
            this.additionalProperties,
            experimentsExposureSqlModelV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archivedAt,
        createdAt,
        datePartitionColumn,
        experimentColumn,
        experimentCount,
        migrationMetadata,
        name,
        properties,
        sql,
        subjectTypes,
        timestampColumn,
        updatedAt,
        variantColumn,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExposureSQLModelV2DTODataAttributes {\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datePartitionColumn: ")
        .append(toIndentedString(datePartitionColumn))
        .append("\n");
    sb.append("    experimentColumn: ").append(toIndentedString(experimentColumn)).append("\n");
    sb.append("    experimentCount: ").append(toIndentedString(experimentCount)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    subjectTypes: ").append(toIndentedString(subjectTypes)).append("\n");
    sb.append("    timestampColumn: ").append(toIndentedString(timestampColumn)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    variantColumn: ").append(toIndentedString(variantColumn)).append("\n");
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
