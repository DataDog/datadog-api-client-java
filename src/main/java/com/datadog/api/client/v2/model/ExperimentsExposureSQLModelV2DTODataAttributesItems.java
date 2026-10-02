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

/** Property column available from the exposure SQL model. */
@JsonPropertyOrder({
  ExperimentsExposureSQLModelV2DTODataAttributesItems.JSON_PROPERTY_COLUMN_NAME,
  ExperimentsExposureSQLModelV2DTODataAttributesItems.JSON_PROPERTY_COLUMN_TYPE,
  ExperimentsExposureSQLModelV2DTODataAttributesItems.JSON_PROPERTY_DESCRIPTION,
  ExperimentsExposureSQLModelV2DTODataAttributesItems.JSON_PROPERTY_ID,
  ExperimentsExposureSQLModelV2DTODataAttributesItems.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsExposureSQLModelV2DTODataAttributesItems.JSON_PROPERTY_NAME,
  ExperimentsExposureSQLModelV2DTODataAttributesItems.JSON_PROPERTY_PIPELINE_COLUMN_SUFFIX
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExposureSQLModelV2DTODataAttributesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_NAME = "column_name";
  private String columnName;

  public static final String JSON_PROPERTY_COLUMN_TYPE = "column_type";
  private String columnType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PIPELINE_COLUMN_SUFFIX = "pipeline_column_suffix";
  private String pipelineColumnSuffix;

  public ExperimentsExposureSQLModelV2DTODataAttributesItems columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * SQL result column that contains this property.
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

  public ExperimentsExposureSQLModelV2DTODataAttributesItems columnType(String columnType) {
    this.columnType = columnType;
    return this;
  }

  /**
   * Data type of the property column.
   *
   * @return columnType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColumnType() {
    return columnType;
  }

  public void setColumnType(String columnType) {
    this.columnType = columnType;
  }

  public ExperimentsExposureSQLModelV2DTODataAttributesItems description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the exposure property.
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

  public ExperimentsExposureSQLModelV2DTODataAttributesItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the exposure property.
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

  public ExperimentsExposureSQLModelV2DTODataAttributesItems migrationMetadata(
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

  public ExperimentsExposureSQLModelV2DTODataAttributesItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the exposure property.
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

  public ExperimentsExposureSQLModelV2DTODataAttributesItems pipelineColumnSuffix(
      String pipelineColumnSuffix) {
    this.pipelineColumnSuffix = pipelineColumnSuffix;
    return this;
  }

  /**
   * Suffix used for this property column in the analysis pipeline.
   *
   * @return pipelineColumnSuffix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIPELINE_COLUMN_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPipelineColumnSuffix() {
    return pipelineColumnSuffix;
  }

  public void setPipelineColumnSuffix(String pipelineColumnSuffix) {
    this.pipelineColumnSuffix = pipelineColumnSuffix;
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
   * @return ExperimentsExposureSQLModelV2DTODataAttributesItems
   */
  @JsonAnySetter
  public ExperimentsExposureSQLModelV2DTODataAttributesItems putAdditionalProperty(
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
   * Return true if this ExperimentsExposureSQLModelV2DTODataAttributesItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExposureSQLModelV2DTODataAttributesItems
        experimentsExposureSqlModelV2DtoDataAttributesItems =
            (ExperimentsExposureSQLModelV2DTODataAttributesItems) o;
    return Objects.equals(
            this.columnName, experimentsExposureSqlModelV2DtoDataAttributesItems.columnName)
        && Objects.equals(
            this.columnType, experimentsExposureSqlModelV2DtoDataAttributesItems.columnType)
        && Objects.equals(
            this.description, experimentsExposureSqlModelV2DtoDataAttributesItems.description)
        && Objects.equals(this.id, experimentsExposureSqlModelV2DtoDataAttributesItems.id)
        && Objects.equals(
            this.migrationMetadata,
            experimentsExposureSqlModelV2DtoDataAttributesItems.migrationMetadata)
        && Objects.equals(this.name, experimentsExposureSqlModelV2DtoDataAttributesItems.name)
        && Objects.equals(
            this.pipelineColumnSuffix,
            experimentsExposureSqlModelV2DtoDataAttributesItems.pipelineColumnSuffix)
        && Objects.equals(
            this.additionalProperties,
            experimentsExposureSqlModelV2DtoDataAttributesItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columnName,
        columnType,
        description,
        id,
        migrationMetadata,
        name,
        pipelineColumnSuffix,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExposureSQLModelV2DTODataAttributesItems {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pipelineColumnSuffix: ")
        .append(toIndentedString(pipelineColumnSuffix))
        .append("\n");
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
