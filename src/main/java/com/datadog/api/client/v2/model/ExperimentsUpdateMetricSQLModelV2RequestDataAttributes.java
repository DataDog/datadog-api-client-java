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
import org.openapitools.jackson.nullable.JsonNullable;

/** Complete column mappings and query used to replace the metric SQL model. */
@JsonPropertyOrder({
  ExperimentsUpdateMetricSQLModelV2RequestDataAttributes.JSON_PROPERTY_DATE_PARTITION_COLUMN,
  ExperimentsUpdateMetricSQLModelV2RequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsUpdateMetricSQLModelV2RequestDataAttributes.JSON_PROPERTY_MEASURES,
  ExperimentsUpdateMetricSQLModelV2RequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsUpdateMetricSQLModelV2RequestDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsUpdateMetricSQLModelV2RequestDataAttributes.JSON_PROPERTY_PROPERTIES,
  ExperimentsUpdateMetricSQLModelV2RequestDataAttributes.JSON_PROPERTY_SQL,
  ExperimentsUpdateMetricSQLModelV2RequestDataAttributes.JSON_PROPERTY_SUBJECT_TYPES,
  ExperimentsUpdateMetricSQLModelV2RequestDataAttributes.JSON_PROPERTY_TIMESTAMP_COLUMN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsUpdateMetricSQLModelV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATE_PARTITION_COLUMN = "date_partition_column";
  private JsonNullable<String> datePartitionColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MEASURES = "measures";
  private List<ExperimentsCreateMetricSQLModelV2RequestDataAttributesMeasuresItems> measures = null;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<ExperimentsMetricSQLModelPropertyInput> properties = null;

  public static final String JSON_PROPERTY_SQL = "sql";
  private String sql;

  public static final String JSON_PROPERTY_SUBJECT_TYPES = "subject_types";
  private List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
      subjectTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_TIMESTAMP_COLUMN = "timestamp_column";
  private String timestampColumn;

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes() {}

  @JsonCreator
  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SQL) String sql,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECT_TYPES)
          List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
              subjectTypes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP_COLUMN)
          String timestampColumn) {
    this.name = name;
    this.sql = sql;
    this.subjectTypes = subjectTypes;
    for (ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems item :
        subjectTypes) {
      this.unparsed |= item.unparsed;
    }
    this.timestampColumn = timestampColumn;
  }

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes datePartitionColumn(
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

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes description(String description) {
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

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes measures(
      List<ExperimentsCreateMetricSQLModelV2RequestDataAttributesMeasuresItems> measures) {
    this.measures = measures;
    if (measures != null) {
      for (ExperimentsCreateMetricSQLModelV2RequestDataAttributesMeasuresItems item : measures) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes addMeasuresItem(
      ExperimentsCreateMetricSQLModelV2RequestDataAttributesMeasuresItems measuresItem) {
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
  public List<ExperimentsCreateMetricSQLModelV2RequestDataAttributesMeasuresItems> getMeasures() {
    return measures;
  }

  public void setMeasures(
      List<ExperimentsCreateMetricSQLModelV2RequestDataAttributesMeasuresItems> measures) {
    this.measures = measures;
    if (measures != null) {
      for (ExperimentsCreateMetricSQLModelV2RequestDataAttributesMeasuresItems item : measures) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes migrationMetadata(
      Object migrationMetadata) {
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

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the metric SQL model.
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

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes properties(
      List<ExperimentsMetricSQLModelPropertyInput> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ExperimentsMetricSQLModelPropertyInput item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes addPropertiesItem(
      ExperimentsMetricSQLModelPropertyInput propertiesItem) {
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
  public List<ExperimentsMetricSQLModelPropertyInput> getProperties() {
    return properties;
  }

  public void setProperties(List<ExperimentsMetricSQLModelPropertyInput> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ExperimentsMetricSQLModelPropertyInput item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes sql(String sql) {
    this.sql = sql;
    return this;
  }

  /**
   * SQL query that produces the model's source data.
   *
   * @return sql
   */
  @JsonProperty(JSON_PROPERTY_SQL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSql() {
    return sql;
  }

  public void setSql(String sql) {
    this.sql = sql;
  }

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes subjectTypes(
      List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
          subjectTypes) {
    this.subjectTypes = subjectTypes;
    for (ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems item :
        subjectTypes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes addSubjectTypesItem(
      ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems subjectTypesItem) {
    this.subjectTypes.add(subjectTypesItem);
    this.unparsed |= subjectTypesItem.unparsed;
    return this;
  }

  /**
   * Subject types mapped to columns in the SQL model.
   *
   * @return subjectTypes
   */
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes timestampColumn(
      String timestampColumn) {
    this.timestampColumn = timestampColumn;
    return this;
  }

  /**
   * SQL column that supplies the event timestamp.
   *
   * @return timestampColumn
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimestampColumn() {
    return timestampColumn;
  }

  public void setTimestampColumn(String timestampColumn) {
    this.timestampColumn = timestampColumn;
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
   * @return ExperimentsUpdateMetricSQLModelV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsUpdateMetricSQLModelV2RequestDataAttributes putAdditionalProperty(
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

  /**
   * Return true if this ExperimentsUpdateMetricSQLModelV2RequestDataAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsUpdateMetricSQLModelV2RequestDataAttributes
        experimentsUpdateMetricSqlModelV2RequestDataAttributes =
            (ExperimentsUpdateMetricSQLModelV2RequestDataAttributes) o;
    return Objects.equals(
            this.datePartitionColumn,
            experimentsUpdateMetricSqlModelV2RequestDataAttributes.datePartitionColumn)
        && Objects.equals(
            this.description, experimentsUpdateMetricSqlModelV2RequestDataAttributes.description)
        && Objects.equals(
            this.measures, experimentsUpdateMetricSqlModelV2RequestDataAttributes.measures)
        && Objects.equals(
            this.migrationMetadata,
            experimentsUpdateMetricSqlModelV2RequestDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsUpdateMetricSqlModelV2RequestDataAttributes.name)
        && Objects.equals(
            this.properties, experimentsUpdateMetricSqlModelV2RequestDataAttributes.properties)
        && Objects.equals(this.sql, experimentsUpdateMetricSqlModelV2RequestDataAttributes.sql)
        && Objects.equals(
            this.subjectTypes, experimentsUpdateMetricSqlModelV2RequestDataAttributes.subjectTypes)
        && Objects.equals(
            this.timestampColumn,
            experimentsUpdateMetricSqlModelV2RequestDataAttributes.timestampColumn)
        && Objects.equals(
            this.additionalProperties,
            experimentsUpdateMetricSqlModelV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datePartitionColumn,
        description,
        measures,
        migrationMetadata,
        name,
        properties,
        sql,
        subjectTypes,
        timestampColumn,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsUpdateMetricSQLModelV2RequestDataAttributes {\n");
    sb.append("    datePartitionColumn: ")
        .append(toIndentedString(datePartitionColumn))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    measures: ").append(toIndentedString(measures)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    subjectTypes: ").append(toIndentedString(subjectTypes)).append("\n");
    sb.append("    timestampColumn: ").append(toIndentedString(timestampColumn)).append("\n");
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
