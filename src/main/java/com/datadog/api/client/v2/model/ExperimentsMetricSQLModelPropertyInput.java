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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A property column defined by a metric SQL model. */
@JsonPropertyOrder({
  ExperimentsMetricSQLModelPropertyInput.JSON_PROPERTY_COLUMN_NAME,
  ExperimentsMetricSQLModelPropertyInput.JSON_PROPERTY_COLUMN_TYPE,
  ExperimentsMetricSQLModelPropertyInput.JSON_PROPERTY_DESCRIPTION,
  ExperimentsMetricSQLModelPropertyInput.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsMetricSQLModelPropertyInput.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricSQLModelPropertyInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_NAME = "column_name";
  private String columnName;

  public static final String JSON_PROPERTY_COLUMN_TYPE = "column_type";
  private ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType columnType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ExperimentsMetricSQLModelPropertyInput() {}

  @JsonCreator
  public ExperimentsMetricSQLModelPropertyInput(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN_NAME) String columnName,
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN_TYPE)
          ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType columnType,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.columnName = columnName;
    this.columnType = columnType;
    this.unparsed |= !columnType.isValid();
    this.name = name;
  }

  public ExperimentsMetricSQLModelPropertyInput columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Name of the SQL result column that supplies this property.
   *
   * @return columnName
   */
  @JsonProperty(JSON_PROPERTY_COLUMN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public ExperimentsMetricSQLModelPropertyInput columnType(
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
  @JsonProperty(JSON_PROPERTY_COLUMN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  public ExperimentsMetricSQLModelPropertyInput description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Optional text that explains what this property represents.
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

  public ExperimentsMetricSQLModelPropertyInput migrationMetadata(Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
    return this;
  }

  /**
   * Opaque metadata preserved when this property is migrated.
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

  public ExperimentsMetricSQLModelPropertyInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name used to identify the property in the model.
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
   * @return ExperimentsMetricSQLModelPropertyInput
   */
  @JsonAnySetter
  public ExperimentsMetricSQLModelPropertyInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsMetricSQLModelPropertyInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricSQLModelPropertyInput experimentsMetricSqlModelPropertyInput =
        (ExperimentsMetricSQLModelPropertyInput) o;
    return Objects.equals(this.columnName, experimentsMetricSqlModelPropertyInput.columnName)
        && Objects.equals(this.columnType, experimentsMetricSqlModelPropertyInput.columnType)
        && Objects.equals(this.description, experimentsMetricSqlModelPropertyInput.description)
        && Objects.equals(
            this.migrationMetadata, experimentsMetricSqlModelPropertyInput.migrationMetadata)
        && Objects.equals(this.name, experimentsMetricSqlModelPropertyInput.name)
        && Objects.equals(
            this.additionalProperties, experimentsMetricSqlModelPropertyInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columnName, columnType, description, migrationMetadata, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricSQLModelPropertyInput {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
