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

/** Uses a Datadog reference table to enrich metrics. */
@JsonPropertyOrder({
  ObservabilityPipelineMetricEnrichmentTableReferenceTable.JSON_PROPERTY_APP_KEY_KEY,
  ObservabilityPipelineMetricEnrichmentTableReferenceTable.JSON_PROPERTY_COLUMNS,
  ObservabilityPipelineMetricEnrichmentTableReferenceTable.JSON_PROPERTY_KEY,
  ObservabilityPipelineMetricEnrichmentTableReferenceTable.JSON_PROPERTY_TABLE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineMetricEnrichmentTableReferenceTable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APP_KEY_KEY = "app_key_key";
  private String appKeyKey;

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<String> columns = null;

  public static final String JSON_PROPERTY_KEY = "key";
  private ObservabilityPipelineMetricEnrichmentTableReferenceKey key;

  public static final String JSON_PROPERTY_TABLE_ID = "table_id";
  private String tableId;

  public ObservabilityPipelineMetricEnrichmentTableReferenceTable() {}

  @JsonCreator
  public ObservabilityPipelineMetricEnrichmentTableReferenceTable(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY)
          ObservabilityPipelineMetricEnrichmentTableReferenceKey key,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_ID) String tableId) {
    this.key = key;
    this.unparsed |= key.unparsed;
    this.tableId = tableId;
  }

  public ObservabilityPipelineMetricEnrichmentTableReferenceTable appKeyKey(String appKeyKey) {
    this.appKeyKey = appKeyKey;
    return this;
  }

  /**
   * The name of the environment variable or secret that holds the Datadog application key used to
   * access the reference table.
   *
   * @return appKeyKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_KEY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppKeyKey() {
    return appKeyKey;
  }

  public void setAppKeyKey(String appKeyKey) {
    this.appKeyKey = appKeyKey;
  }

  public ObservabilityPipelineMetricEnrichmentTableReferenceTable columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public ObservabilityPipelineMetricEnrichmentTableReferenceTable addColumnsItem(
      String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * A list of column names to include from the reference table. If not provided, all columns are
   * included.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public ObservabilityPipelineMetricEnrichmentTableReferenceTable key(
      ObservabilityPipelineMetricEnrichmentTableReferenceKey key) {
    this.key = key;
    this.unparsed |= key.unparsed;
    return this;
  }

  /**
   * Defines the metric lookup value used as the reference-table row ID.
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineMetricEnrichmentTableReferenceKey getKey() {
    return key;
  }

  public void setKey(ObservabilityPipelineMetricEnrichmentTableReferenceKey key) {
    this.key = key;
    if (key != null) {
      this.unparsed |= key.unparsed;
    }
  }

  public ObservabilityPipelineMetricEnrichmentTableReferenceTable tableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * The unique identifier of the reference table.
   *
   * @return tableId
   */
  @JsonProperty(JSON_PROPERTY_TABLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
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
   * @return ObservabilityPipelineMetricEnrichmentTableReferenceTable
   */
  @JsonAnySetter
  public ObservabilityPipelineMetricEnrichmentTableReferenceTable putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineMetricEnrichmentTableReferenceTable object is equal to
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
    ObservabilityPipelineMetricEnrichmentTableReferenceTable
        observabilityPipelineMetricEnrichmentTableReferenceTable =
            (ObservabilityPipelineMetricEnrichmentTableReferenceTable) o;
    return Objects.equals(
            this.appKeyKey, observabilityPipelineMetricEnrichmentTableReferenceTable.appKeyKey)
        && Objects.equals(
            this.columns, observabilityPipelineMetricEnrichmentTableReferenceTable.columns)
        && Objects.equals(this.key, observabilityPipelineMetricEnrichmentTableReferenceTable.key)
        && Objects.equals(
            this.tableId, observabilityPipelineMetricEnrichmentTableReferenceTable.tableId)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineMetricEnrichmentTableReferenceTable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKeyKey, columns, key, tableId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineMetricEnrichmentTableReferenceTable {\n");
    sb.append("    appKeyKey: ").append(toIndentedString(appKeyKey)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
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
