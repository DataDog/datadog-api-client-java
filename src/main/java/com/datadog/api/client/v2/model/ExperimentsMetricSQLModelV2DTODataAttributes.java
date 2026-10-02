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

/** Details of the metric SQL model. */
@JsonPropertyOrder({
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_CERTIFIED_AT,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_CREATED_AT,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_DATE_PARTITION_COLUMN,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_EVENT_COUNT_MEASURE_ID,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_EXPERIMENT_COUNT,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_IS_CERTIFIED,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_MEASURES,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_METRIC_COUNT,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_NAME,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_PROPERTIES,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_SQL,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_SUBJECT_TYPES,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_TIMESTAMP_COLUMN,
  ExperimentsMetricSQLModelV2DTODataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricSQLModelV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CERTIFIED_AT = "certified_at";
  private JsonNullable<OffsetDateTime> certifiedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATE_PARTITION_COLUMN = "date_partition_column";
  private JsonNullable<String> datePartitionColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EVENT_COUNT_MEASURE_ID = "event_count_measure_id";
  private String eventCountMeasureId;

  public static final String JSON_PROPERTY_EXPERIMENT_COUNT = "experiment_count";
  private JsonNullable<Long> experimentCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_IS_CERTIFIED = "is_certified";
  private Boolean isCertified;

  public static final String JSON_PROPERTY_MEASURES = "measures";
  private List<ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems> measures = null;

  public static final String JSON_PROPERTY_METRIC_COUNT = "metric_count";
  private JsonNullable<Long> metricCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems> properties = null;

  public static final String JSON_PROPERTY_SQL = "sql";
  private String sql;

  public static final String JSON_PROPERTY_SUBJECT_TYPES = "subject_types";
  private List<ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems> subjectTypes = null;

  public static final String JSON_PROPERTY_TIMESTAMP_COLUMN = "timestamp_column";
  private String timestampColumn;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public ExperimentsMetricSQLModelV2DTODataAttributes certifiedAt(OffsetDateTime certifiedAt) {
    this.certifiedAt = JsonNullable.<OffsetDateTime>of(certifiedAt);
    return this;
  }

  /**
   * Time when this resource was certified.
   *
   * @return certifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getCertifiedAt() {
    return certifiedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CERTIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getCertifiedAt_JsonNullable() {
    return certifiedAt;
  }

  @JsonProperty(JSON_PROPERTY_CERTIFIED_AT)
  public void setCertifiedAt_JsonNullable(JsonNullable<OffsetDateTime> certifiedAt) {
    this.certifiedAt = certifiedAt;
  }

  public void setCertifiedAt(OffsetDateTime certifiedAt) {
    this.certifiedAt = JsonNullable.<OffsetDateTime>of(certifiedAt);
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when this resource was created.
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

  public ExperimentsMetricSQLModelV2DTODataAttributes datePartitionColumn(
      String datePartitionColumn) {
    this.datePartitionColumn = JsonNullable.<String>of(datePartitionColumn);
    return this;
  }

  /**
   * SQL column used to partition the source data by date.
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

  public ExperimentsMetricSQLModelV2DTODataAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Text that explains the metric SQL model.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes eventCountMeasureId(
      String eventCountMeasureId) {
    this.eventCountMeasureId = eventCountMeasureId;
    return this;
  }

  /**
   * Read-only measure ID. Pass it as warehouse_metric_measure.id when the metric operation is
   * count.
   *
   * @return eventCountMeasureId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_COUNT_MEASURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEventCountMeasureId() {
    return eventCountMeasureId;
  }

  public void setEventCountMeasureId(String eventCountMeasureId) {
    this.eventCountMeasureId = eventCountMeasureId;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes experimentCount(Long experimentCount) {
    this.experimentCount = JsonNullable.<Long>of(experimentCount);
    return this;
  }

  /**
   * Number of experiments that reference this resource.
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

  public ExperimentsMetricSQLModelV2DTODataAttributes isCertified(Boolean isCertified) {
    this.isCertified = isCertified;
    return this;
  }

  /**
   * Whether this resource has been certified.
   *
   * @return isCertified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CERTIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCertified() {
    return isCertified;
  }

  public void setIsCertified(Boolean isCertified) {
    this.isCertified = isCertified;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes measures(
      List<ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems> measures) {
    this.measures = measures;
    if (measures != null) {
      for (ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems item : measures) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes addMeasuresItem(
      ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems measuresItem) {
    if (this.measures == null) {
      this.measures = new ArrayList<>();
    }
    this.measures.add(measuresItem);
    this.unparsed |= measuresItem.unparsed;
    return this;
  }

  /**
   * Measures available from the SQL model's result columns.
   *
   * @return measures
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEASURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems> getMeasures() {
    return measures;
  }

  public void setMeasures(
      List<ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems> measures) {
    this.measures = measures;
    if (measures != null) {
      for (ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems item : measures) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes metricCount(Long metricCount) {
    this.metricCount = JsonNullable.<Long>of(metricCount);
    return this;
  }

  /**
   * Number of metrics that use this SQL model.
   *
   * @return metricCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMetricCount() {
    return metricCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRIC_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMetricCount_JsonNullable() {
    return metricCount;
  }

  @JsonProperty(JSON_PROPERTY_METRIC_COUNT)
  public void setMetricCount_JsonNullable(JsonNullable<Long> metricCount) {
    this.metricCount = metricCount;
  }

  public void setMetricCount(Long metricCount) {
    this.metricCount = JsonNullable.<Long>of(metricCount);
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes migrationMetadata(Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
    return this;
  }

  /**
   * Metadata retained for resources imported from another system.
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

  public ExperimentsMetricSQLModelV2DTODataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the metric SQL model.
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

  public ExperimentsMetricSQLModelV2DTODataAttributes properties(
      List<ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes addPropertiesItem(
      ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    this.unparsed |= propertiesItem.unparsed;
    return this;
  }

  /**
   * Property columns exposed by the SQL model.
   *
   * @return properties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems> getProperties() {
    return properties;
  }

  public void setProperties(
      List<ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes sql(String sql) {
    this.sql = sql;
    return this;
  }

  /**
   * SQL query that produces the model's source data.
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

  public ExperimentsMetricSQLModelV2DTODataAttributes subjectTypes(
      List<ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems> subjectTypes) {
    this.subjectTypes = subjectTypes;
    if (subjectTypes != null) {
      for (ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems item : subjectTypes) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes addSubjectTypesItem(
      ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems subjectTypesItem) {
    if (this.subjectTypes == null) {
      this.subjectTypes = new ArrayList<>();
    }
    this.subjectTypes.add(subjectTypesItem);
    this.unparsed |= subjectTypesItem.unparsed;
    return this;
  }

  /**
   * Subject types mapped to columns in the SQL model.
   *
   * @return subjectTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems> getSubjectTypes() {
    return subjectTypes;
  }

  public void setSubjectTypes(
      List<ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems> subjectTypes) {
    this.subjectTypes = subjectTypes;
    if (subjectTypes != null) {
      for (ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems item : subjectTypes) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsMetricSQLModelV2DTODataAttributes timestampColumn(String timestampColumn) {
    this.timestampColumn = timestampColumn;
    return this;
  }

  /**
   * SQL column that supplies the event timestamp.
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

  public ExperimentsMetricSQLModelV2DTODataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when this resource was last updated.
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
   * @return ExperimentsMetricSQLModelV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsMetricSQLModelV2DTODataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsMetricSQLModelV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricSQLModelV2DTODataAttributes experimentsMetricSqlModelV2DtoDataAttributes =
        (ExperimentsMetricSQLModelV2DTODataAttributes) o;
    return Objects.equals(
            this.certifiedAt, experimentsMetricSqlModelV2DtoDataAttributes.certifiedAt)
        && Objects.equals(this.createdAt, experimentsMetricSqlModelV2DtoDataAttributes.createdAt)
        && Objects.equals(
            this.datePartitionColumn,
            experimentsMetricSqlModelV2DtoDataAttributes.datePartitionColumn)
        && Objects.equals(
            this.description, experimentsMetricSqlModelV2DtoDataAttributes.description)
        && Objects.equals(
            this.eventCountMeasureId,
            experimentsMetricSqlModelV2DtoDataAttributes.eventCountMeasureId)
        && Objects.equals(
            this.experimentCount, experimentsMetricSqlModelV2DtoDataAttributes.experimentCount)
        && Objects.equals(
            this.isCertified, experimentsMetricSqlModelV2DtoDataAttributes.isCertified)
        && Objects.equals(this.measures, experimentsMetricSqlModelV2DtoDataAttributes.measures)
        && Objects.equals(
            this.metricCount, experimentsMetricSqlModelV2DtoDataAttributes.metricCount)
        && Objects.equals(
            this.migrationMetadata, experimentsMetricSqlModelV2DtoDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsMetricSqlModelV2DtoDataAttributes.name)
        && Objects.equals(this.properties, experimentsMetricSqlModelV2DtoDataAttributes.properties)
        && Objects.equals(this.sql, experimentsMetricSqlModelV2DtoDataAttributes.sql)
        && Objects.equals(
            this.subjectTypes, experimentsMetricSqlModelV2DtoDataAttributes.subjectTypes)
        && Objects.equals(
            this.timestampColumn, experimentsMetricSqlModelV2DtoDataAttributes.timestampColumn)
        && Objects.equals(this.updatedAt, experimentsMetricSqlModelV2DtoDataAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties,
            experimentsMetricSqlModelV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        certifiedAt,
        createdAt,
        datePartitionColumn,
        description,
        eventCountMeasureId,
        experimentCount,
        isCertified,
        measures,
        metricCount,
        migrationMetadata,
        name,
        properties,
        sql,
        subjectTypes,
        timestampColumn,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricSQLModelV2DTODataAttributes {\n");
    sb.append("    certifiedAt: ").append(toIndentedString(certifiedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datePartitionColumn: ")
        .append(toIndentedString(datePartitionColumn))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventCountMeasureId: ")
        .append(toIndentedString(eventCountMeasureId))
        .append("\n");
    sb.append("    experimentCount: ").append(toIndentedString(experimentCount)).append("\n");
    sb.append("    isCertified: ").append(toIndentedString(isCertified)).append("\n");
    sb.append("    measures: ").append(toIndentedString(measures)).append("\n");
    sb.append("    metricCount: ").append(toIndentedString(metricCount)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    subjectTypes: ").append(toIndentedString(subjectTypes)).append("\n");
    sb.append("    timestampColumn: ").append(toIndentedString(timestampColumn)).append("\n");
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
