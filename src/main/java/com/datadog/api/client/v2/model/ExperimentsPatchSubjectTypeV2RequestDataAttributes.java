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

/** Fields supplied to update the subject type. */
@JsonPropertyOrder({
  ExperimentsPatchSubjectTypeV2RequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsPatchSubjectTypeV2RequestDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsPatchSubjectTypeV2RequestDataAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_ATTRIBUTE,
  ExperimentsPatchSubjectTypeV2RequestDataAttributes.JSON_PROPERTY_WAREHOUSE_COLUMN_NAMES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchSubjectTypeV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_ATTRIBUTE =
      "product_analytics_attribute";
  private String productAnalyticsAttribute;

  public static final String JSON_PROPERTY_WAREHOUSE_COLUMN_NAMES = "warehouse_column_names";
  private List<String> warehouseColumnNames = null;

  public ExperimentsPatchSubjectTypeV2RequestDataAttributes migrationMetadata(
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

  public ExperimentsPatchSubjectTypeV2RequestDataAttributes name(String name) {
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

  public ExperimentsPatchSubjectTypeV2RequestDataAttributes productAnalyticsAttribute(
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

  public ExperimentsPatchSubjectTypeV2RequestDataAttributes warehouseColumnNames(
      List<String> warehouseColumnNames) {
    this.warehouseColumnNames = warehouseColumnNames;
    return this;
  }

  public ExperimentsPatchSubjectTypeV2RequestDataAttributes addWarehouseColumnNamesItem(
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
   * @return ExperimentsPatchSubjectTypeV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsPatchSubjectTypeV2RequestDataAttributes putAdditionalProperty(
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
   * Return true if this ExperimentsPatchSubjectTypeV2RequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchSubjectTypeV2RequestDataAttributes
        experimentsPatchSubjectTypeV2RequestDataAttributes =
            (ExperimentsPatchSubjectTypeV2RequestDataAttributes) o;
    return Objects.equals(
            this.migrationMetadata,
            experimentsPatchSubjectTypeV2RequestDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsPatchSubjectTypeV2RequestDataAttributes.name)
        && Objects.equals(
            this.productAnalyticsAttribute,
            experimentsPatchSubjectTypeV2RequestDataAttributes.productAnalyticsAttribute)
        && Objects.equals(
            this.warehouseColumnNames,
            experimentsPatchSubjectTypeV2RequestDataAttributes.warehouseColumnNames)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchSubjectTypeV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        migrationMetadata,
        name,
        productAnalyticsAttribute,
        warehouseColumnNames,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchSubjectTypeV2RequestDataAttributes {\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productAnalyticsAttribute: ")
        .append(toIndentedString(productAnalyticsAttribute))
        .append("\n");
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
