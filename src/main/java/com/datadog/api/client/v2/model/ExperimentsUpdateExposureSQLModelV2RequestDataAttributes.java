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

/** Complete column mappings and query used to replace the exposure SQL model. */
@JsonPropertyOrder({
  ExperimentsUpdateExposureSQLModelV2RequestDataAttributes.JSON_PROPERTY_DATE_PARTITION_COLUMN,
  ExperimentsUpdateExposureSQLModelV2RequestDataAttributes.JSON_PROPERTY_EXPERIMENT_COLUMN,
  ExperimentsUpdateExposureSQLModelV2RequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsUpdateExposureSQLModelV2RequestDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsUpdateExposureSQLModelV2RequestDataAttributes.JSON_PROPERTY_PROPERTIES,
  ExperimentsUpdateExposureSQLModelV2RequestDataAttributes.JSON_PROPERTY_SQL,
  ExperimentsUpdateExposureSQLModelV2RequestDataAttributes.JSON_PROPERTY_SUBJECT_TYPES,
  ExperimentsUpdateExposureSQLModelV2RequestDataAttributes.JSON_PROPERTY_TIMESTAMP_COLUMN,
  ExperimentsUpdateExposureSQLModelV2RequestDataAttributes.JSON_PROPERTY_VARIANT_COLUMN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsUpdateExposureSQLModelV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATE_PARTITION_COLUMN = "date_partition_column";
  private JsonNullable<String> datePartitionColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPERIMENT_COLUMN = "experiment_column";
  private String experimentColumn;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<ExperimentsSQLModelPropertyInput> properties = null;

  public static final String JSON_PROPERTY_SQL = "sql";
  private String sql;

  public static final String JSON_PROPERTY_SUBJECT_TYPES = "subject_types";
  private List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
      subjectTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_TIMESTAMP_COLUMN = "timestamp_column";
  private String timestampColumn;

  public static final String JSON_PROPERTY_VARIANT_COLUMN = "variant_column";
  private String variantColumn;

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes() {}

  @JsonCreator
  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPERIMENT_COLUMN)
          String experimentColumn,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SQL) String sql,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECT_TYPES)
          List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
              subjectTypes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP_COLUMN) String timestampColumn,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANT_COLUMN) String variantColumn) {
    this.experimentColumn = experimentColumn;
    this.name = name;
    this.sql = sql;
    this.subjectTypes = subjectTypes;
    for (ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems item :
        subjectTypes) {
      this.unparsed |= item.unparsed;
    }
    this.timestampColumn = timestampColumn;
    this.variantColumn = variantColumn;
  }

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes datePartitionColumn(
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

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes experimentColumn(
      String experimentColumn) {
    this.experimentColumn = experimentColumn;
    return this;
  }

  /**
   * SQL column that identifies the experiment for each exposure.
   *
   * @return experimentColumn
   */
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExperimentColumn() {
    return experimentColumn;
  }

  public void setExperimentColumn(String experimentColumn) {
    this.experimentColumn = experimentColumn;
  }

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes migrationMetadata(
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

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the exposure SQL model.
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

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes properties(
      List<ExperimentsSQLModelPropertyInput> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ExperimentsSQLModelPropertyInput item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes addPropertiesItem(
      ExperimentsSQLModelPropertyInput propertiesItem) {
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
  public List<ExperimentsSQLModelPropertyInput> getProperties() {
    return properties;
  }

  public void setProperties(List<ExperimentsSQLModelPropertyInput> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ExperimentsSQLModelPropertyInput item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes sql(String sql) {
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

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes subjectTypes(
      List<ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems>
          subjectTypes) {
    this.subjectTypes = subjectTypes;
    for (ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems item :
        subjectTypes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes addSubjectTypesItem(
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

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes timestampColumn(
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

  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes variantColumn(
      String variantColumn) {
    this.variantColumn = variantColumn;
    return this;
  }

  /**
   * SQL column that identifies the variant for each exposure.
   *
   * @return variantColumn
   */
  @JsonProperty(JSON_PROPERTY_VARIANT_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return ExperimentsUpdateExposureSQLModelV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsUpdateExposureSQLModelV2RequestDataAttributes putAdditionalProperty(
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
   * Return true if this ExperimentsUpdateExposureSQLModelV2RequestDataAttributes object is equal to
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
    ExperimentsUpdateExposureSQLModelV2RequestDataAttributes
        experimentsUpdateExposureSqlModelV2RequestDataAttributes =
            (ExperimentsUpdateExposureSQLModelV2RequestDataAttributes) o;
    return Objects.equals(
            this.datePartitionColumn,
            experimentsUpdateExposureSqlModelV2RequestDataAttributes.datePartitionColumn)
        && Objects.equals(
            this.experimentColumn,
            experimentsUpdateExposureSqlModelV2RequestDataAttributes.experimentColumn)
        && Objects.equals(
            this.migrationMetadata,
            experimentsUpdateExposureSqlModelV2RequestDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsUpdateExposureSqlModelV2RequestDataAttributes.name)
        && Objects.equals(
            this.properties, experimentsUpdateExposureSqlModelV2RequestDataAttributes.properties)
        && Objects.equals(this.sql, experimentsUpdateExposureSqlModelV2RequestDataAttributes.sql)
        && Objects.equals(
            this.subjectTypes,
            experimentsUpdateExposureSqlModelV2RequestDataAttributes.subjectTypes)
        && Objects.equals(
            this.timestampColumn,
            experimentsUpdateExposureSqlModelV2RequestDataAttributes.timestampColumn)
        && Objects.equals(
            this.variantColumn,
            experimentsUpdateExposureSqlModelV2RequestDataAttributes.variantColumn)
        && Objects.equals(
            this.additionalProperties,
            experimentsUpdateExposureSqlModelV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datePartitionColumn,
        experimentColumn,
        migrationMetadata,
        name,
        properties,
        sql,
        subjectTypes,
        timestampColumn,
        variantColumn,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsUpdateExposureSQLModelV2RequestDataAttributes {\n");
    sb.append("    datePartitionColumn: ")
        .append(toIndentedString(datePartitionColumn))
        .append("\n");
    sb.append("    experimentColumn: ").append(toIndentedString(experimentColumn)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    subjectTypes: ").append(toIndentedString(subjectTypes)).append("\n");
    sb.append("    timestampColumn: ").append(toIndentedString(timestampColumn)).append("\n");
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
