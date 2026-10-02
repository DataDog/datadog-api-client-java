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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A measure available from a metric SQL model column. */
@JsonPropertyOrder({
  ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems.JSON_PROPERTY_COLUMN_NAME,
  ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems.JSON_PROPERTY_COLUMN_TYPE,
  ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems.JSON_PROPERTY_DESCRIPTION,
  ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems.JSON_PROPERTY_ID,
  ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_NAME = "column_name";
  private String columnName;

  public static final String JSON_PROPERTY_COLUMN_TYPE = "column_type";
  private ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType columnType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Name of the SQL result column that supplies this measure.
   *
   * @return columnName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems columnType(
      ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType columnType) {
    this.columnType = columnType;
    this.unparsed |= !columnType.isValid();
    return this;
  }

  /**
   * Data type of a column in the SQL model.
   *
   * @return columnType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType getColumnType() {
    return columnType;
  }

  public void setColumnType(
      ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType columnType) {
    if (!columnType.isValid()) {
      this.unparsed = true;
    }
    this.columnType = columnType;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text that explains the measure.
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

  public ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the measure.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems migrationMetadata(
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

  public ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the measure.
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
   * @return ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems
   */
  @JsonAnySetter
  public ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems putAdditionalProperty(
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
   * Return true if this ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems
        experimentsMetricSqlModelV2DtoDataAttributesMeasuresItems =
            (ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems) o;
    return Objects.equals(
            this.columnName, experimentsMetricSqlModelV2DtoDataAttributesMeasuresItems.columnName)
        && Objects.equals(
            this.columnType, experimentsMetricSqlModelV2DtoDataAttributesMeasuresItems.columnType)
        && Objects.equals(
            this.description, experimentsMetricSqlModelV2DtoDataAttributesMeasuresItems.description)
        && Objects.equals(this.id, experimentsMetricSqlModelV2DtoDataAttributesMeasuresItems.id)
        && Objects.equals(
            this.migrationMetadata,
            experimentsMetricSqlModelV2DtoDataAttributesMeasuresItems.migrationMetadata)
        && Objects.equals(this.name, experimentsMetricSqlModelV2DtoDataAttributesMeasuresItems.name)
        && Objects.equals(
            this.additionalProperties,
            experimentsMetricSqlModelV2DtoDataAttributesMeasuresItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columnName, columnType, description, id, migrationMetadata, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricSQLModelV2DTODataAttributesMeasuresItems {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
