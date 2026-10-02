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

/**
 * Complete Datadog split-by selection. Identify each property by column_name. Omit this field to
 * copy organization defaults.
 */
@JsonPropertyOrder({
  ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems
      .JSON_PROPERTY_COLUMN_NAME,
  ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems
      .JSON_PROPERTY_COLUMN_TYPE,
  ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_NAME = "column_name";
  private String columnName;

  public static final String JSON_PROPERTY_COLUMN_TYPE = "column_type";
  private
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsColumnType
      columnType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems() {}

  @JsonCreator
  public ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN_NAME) String columnName) {
    this.columnName = columnName;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems columnName(
      String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Exposure field that identifies the property.
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

  public ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems columnType(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsColumnType
          columnType) {
    this.columnType = columnType;
    this.unparsed |= !columnType.isValid();
    return this;
  }

  /**
   * Data type of the column evaluated by the entry-point filter.
   *
   * @return columnType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsColumnType
      getColumnType() {
    return columnType;
  }

  public void setColumnType(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsColumnType
          columnType) {
    if (!columnType.isValid()) {
      this.unparsed = true;
    }
    this.columnType = columnType;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems name(
      String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional display name. Defaults to column_name for a new property.
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
   * @return ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems
   */
  @JsonAnySetter
  public ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems
        experimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems =
            (ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems) o;
    return Objects.equals(
            this.columnName,
            experimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems.columnName)
        && Objects.equals(
            this.columnType,
            experimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems.columnType)
        && Objects.equals(
            this.name,
            experimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems.name)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, columnType, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
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
