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

/** Name and data field mappings for the new subject type. */
@JsonPropertyOrder({
  ExperimentsCreateSubjectTypeV2RequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsCreateSubjectTypeV2RequestDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsCreateSubjectTypeV2RequestDataAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_ATTRIBUTE,
  ExperimentsCreateSubjectTypeV2RequestDataAttributes.JSON_PROPERTY_WAREHOUSE_COLUMN_NAMES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateSubjectTypeV2RequestDataAttributes {
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

  public ExperimentsCreateSubjectTypeV2RequestDataAttributes() {}

  @JsonCreator
  public ExperimentsCreateSubjectTypeV2RequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public ExperimentsCreateSubjectTypeV2RequestDataAttributes migrationMetadata(
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

  public ExperimentsCreateSubjectTypeV2RequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the subject type.
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

  public ExperimentsCreateSubjectTypeV2RequestDataAttributes productAnalyticsAttribute(
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

  public ExperimentsCreateSubjectTypeV2RequestDataAttributes warehouseColumnNames(
      List<String> warehouseColumnNames) {
    this.warehouseColumnNames = warehouseColumnNames;
    return this;
  }

  public ExperimentsCreateSubjectTypeV2RequestDataAttributes addWarehouseColumnNamesItem(
      String warehouseColumnNamesItem) {
    if (this.warehouseColumnNames == null) {
      this.warehouseColumnNames = new ArrayList<>();
    }
    this.warehouseColumnNames.add(warehouseColumnNamesItem);
    return this;
  }

  /**
   * Warehouse column names associated with this subject type.
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
   * @return ExperimentsCreateSubjectTypeV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsCreateSubjectTypeV2RequestDataAttributes putAdditionalProperty(
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
   * Return true if this ExperimentsCreateSubjectTypeV2RequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateSubjectTypeV2RequestDataAttributes
        experimentsCreateSubjectTypeV2RequestDataAttributes =
            (ExperimentsCreateSubjectTypeV2RequestDataAttributes) o;
    return Objects.equals(
            this.migrationMetadata,
            experimentsCreateSubjectTypeV2RequestDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsCreateSubjectTypeV2RequestDataAttributes.name)
        && Objects.equals(
            this.productAnalyticsAttribute,
            experimentsCreateSubjectTypeV2RequestDataAttributes.productAnalyticsAttribute)
        && Objects.equals(
            this.warehouseColumnNames,
            experimentsCreateSubjectTypeV2RequestDataAttributes.warehouseColumnNames)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateSubjectTypeV2RequestDataAttributes.additionalProperties);
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
    sb.append("class ExperimentsCreateSubjectTypeV2RequestDataAttributes {\n");
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
