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

/** Details of the subject type. */
@JsonPropertyOrder({
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_CREATED_AT,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_EXPERIMENT_COUNT,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_EXPOSURE_SOURCE_COUNT,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_IS_DEFAULT,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_METRIC_SQL_MODEL_COUNT,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_NAME,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_ATTRIBUTE,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_PROTOCOL_COUNT,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_UPDATED_AT,
  ExperimentsSubjectTypeV2DTODataAttributes.JSON_PROPERTY_WAREHOUSE_COLUMN_NAMES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsSubjectTypeV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPERIMENT_COUNT = "experiment_count";
  private JsonNullable<Long> experimentCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_EXPOSURE_SOURCE_COUNT = "exposure_source_count";
  private JsonNullable<Long> exposureSourceCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_METRIC_SQL_MODEL_COUNT = "metric_sql_model_count";
  private JsonNullable<Long> metricSqlModelCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_ATTRIBUTE =
      "product_analytics_attribute";
  private String productAnalyticsAttribute;

  public static final String JSON_PROPERTY_PROTOCOL_COUNT = "protocol_count";
  private JsonNullable<Long> protocolCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_WAREHOUSE_COLUMN_NAMES = "warehouse_column_names";
  private List<String> warehouseColumnNames = null;

  public ExperimentsSubjectTypeV2DTODataAttributes createdAt(OffsetDateTime createdAt) {
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

  public ExperimentsSubjectTypeV2DTODataAttributes experimentCount(Long experimentCount) {
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

  public ExperimentsSubjectTypeV2DTODataAttributes exposureSourceCount(Long exposureSourceCount) {
    this.exposureSourceCount = JsonNullable.<Long>of(exposureSourceCount);
    return this;
  }

  /**
   * Number of exposure sources that reference this subject type.
   *
   * @return exposureSourceCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getExposureSourceCount() {
    return exposureSourceCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPOSURE_SOURCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getExposureSourceCount_JsonNullable() {
    return exposureSourceCount;
  }

  @JsonProperty(JSON_PROPERTY_EXPOSURE_SOURCE_COUNT)
  public void setExposureSourceCount_JsonNullable(JsonNullable<Long> exposureSourceCount) {
    this.exposureSourceCount = exposureSourceCount;
  }

  public void setExposureSourceCount(Long exposureSourceCount) {
    this.exposureSourceCount = JsonNullable.<Long>of(exposureSourceCount);
  }

  public ExperimentsSubjectTypeV2DTODataAttributes isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this is the organization's default subject type.
   *
   * @return isDefault
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public ExperimentsSubjectTypeV2DTODataAttributes metricSqlModelCount(Long metricSqlModelCount) {
    this.metricSqlModelCount = JsonNullable.<Long>of(metricSqlModelCount);
    return this;
  }

  /**
   * Number of metric SQL models that reference this subject type.
   *
   * @return metricSqlModelCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMetricSqlModelCount() {
    return metricSqlModelCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRIC_SQL_MODEL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMetricSqlModelCount_JsonNullable() {
    return metricSqlModelCount;
  }

  @JsonProperty(JSON_PROPERTY_METRIC_SQL_MODEL_COUNT)
  public void setMetricSqlModelCount_JsonNullable(JsonNullable<Long> metricSqlModelCount) {
    this.metricSqlModelCount = metricSqlModelCount;
  }

  public void setMetricSqlModelCount(Long metricSqlModelCount) {
    this.metricSqlModelCount = JsonNullable.<Long>of(metricSqlModelCount);
  }

  public ExperimentsSubjectTypeV2DTODataAttributes migrationMetadata(Object migrationMetadata) {
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

  public ExperimentsSubjectTypeV2DTODataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the subject type.
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

  public ExperimentsSubjectTypeV2DTODataAttributes productAnalyticsAttribute(
      String productAnalyticsAttribute) {
    this.productAnalyticsAttribute = productAnalyticsAttribute;
    return this;
  }

  /**
   * Product Analytics attribute used to identify subjects of this type.
   *
   * @return productAnalyticsAttribute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProductAnalyticsAttribute() {
    return productAnalyticsAttribute;
  }

  public void setProductAnalyticsAttribute(String productAnalyticsAttribute) {
    this.productAnalyticsAttribute = productAnalyticsAttribute;
  }

  public ExperimentsSubjectTypeV2DTODataAttributes protocolCount(Long protocolCount) {
    this.protocolCount = JsonNullable.<Long>of(protocolCount);
    return this;
  }

  /**
   * Number of protocols that reference this subject type.
   *
   * @return protocolCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getProtocolCount() {
    return protocolCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROTOCOL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getProtocolCount_JsonNullable() {
    return protocolCount;
  }

  @JsonProperty(JSON_PROPERTY_PROTOCOL_COUNT)
  public void setProtocolCount_JsonNullable(JsonNullable<Long> protocolCount) {
    this.protocolCount = protocolCount;
  }

  public void setProtocolCount(Long protocolCount) {
    this.protocolCount = JsonNullable.<Long>of(protocolCount);
  }

  public ExperimentsSubjectTypeV2DTODataAttributes updatedAt(OffsetDateTime updatedAt) {
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

  public ExperimentsSubjectTypeV2DTODataAttributes warehouseColumnNames(
      List<String> warehouseColumnNames) {
    this.warehouseColumnNames = warehouseColumnNames;
    return this;
  }

  public ExperimentsSubjectTypeV2DTODataAttributes addWarehouseColumnNamesItem(
      String warehouseColumnNamesItem) {
    if (this.warehouseColumnNames == null) {
      this.warehouseColumnNames = new ArrayList<>();
    }
    this.warehouseColumnNames.add(warehouseColumnNamesItem);
    return this;
  }

  /**
   * Warehouse columns that identify subjects of this type.
   *
   * @return warehouseColumnNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAREHOUSE_COLUMN_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getWarehouseColumnNames() {
    return warehouseColumnNames;
  }

  public void setWarehouseColumnNames(List<String> warehouseColumnNames) {
    this.warehouseColumnNames = warehouseColumnNames;
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
   * @return ExperimentsSubjectTypeV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsSubjectTypeV2DTODataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsSubjectTypeV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsSubjectTypeV2DTODataAttributes experimentsSubjectTypeV2DtoDataAttributes =
        (ExperimentsSubjectTypeV2DTODataAttributes) o;
    return Objects.equals(this.createdAt, experimentsSubjectTypeV2DtoDataAttributes.createdAt)
        && Objects.equals(
            this.experimentCount, experimentsSubjectTypeV2DtoDataAttributes.experimentCount)
        && Objects.equals(
            this.exposureSourceCount, experimentsSubjectTypeV2DtoDataAttributes.exposureSourceCount)
        && Objects.equals(this.isDefault, experimentsSubjectTypeV2DtoDataAttributes.isDefault)
        && Objects.equals(
            this.metricSqlModelCount, experimentsSubjectTypeV2DtoDataAttributes.metricSqlModelCount)
        && Objects.equals(
            this.migrationMetadata, experimentsSubjectTypeV2DtoDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsSubjectTypeV2DtoDataAttributes.name)
        && Objects.equals(
            this.productAnalyticsAttribute,
            experimentsSubjectTypeV2DtoDataAttributes.productAnalyticsAttribute)
        && Objects.equals(
            this.protocolCount, experimentsSubjectTypeV2DtoDataAttributes.protocolCount)
        && Objects.equals(this.updatedAt, experimentsSubjectTypeV2DtoDataAttributes.updatedAt)
        && Objects.equals(
            this.warehouseColumnNames,
            experimentsSubjectTypeV2DtoDataAttributes.warehouseColumnNames)
        && Objects.equals(
            this.additionalProperties,
            experimentsSubjectTypeV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        experimentCount,
        exposureSourceCount,
        isDefault,
        metricSqlModelCount,
        migrationMetadata,
        name,
        productAnalyticsAttribute,
        protocolCount,
        updatedAt,
        warehouseColumnNames,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsSubjectTypeV2DTODataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    experimentCount: ").append(toIndentedString(experimentCount)).append("\n");
    sb.append("    exposureSourceCount: ")
        .append(toIndentedString(exposureSourceCount))
        .append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    metricSqlModelCount: ")
        .append(toIndentedString(metricSqlModelCount))
        .append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productAnalyticsAttribute: ")
        .append(toIndentedString(productAnalyticsAttribute))
        .append("\n");
    sb.append("    protocolCount: ").append(toIndentedString(protocolCount)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    warehouseColumnNames: ")
        .append(toIndentedString(warehouseColumnNames))
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
