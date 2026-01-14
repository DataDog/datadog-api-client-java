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

/** Uses a Datadog reference table to enrich logs. */
@JsonPropertyOrder({
  ObservabilityPipelineEnrichmentTableReferenceTable.JSON_PROPERTY_COLUMNS,
  ObservabilityPipelineEnrichmentTableReferenceTable.JSON_PROPERTY_KEY_FIELD,
  ObservabilityPipelineEnrichmentTableReferenceTable.JSON_PROPERTY_TABLE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineEnrichmentTableReferenceTable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<String> columns = null;

  public static final String JSON_PROPERTY_KEY_FIELD = "key_field";
  private String keyField;

  public static final String JSON_PROPERTY_TABLE_ID = "table_id";
  private String tableId;

  public ObservabilityPipelineEnrichmentTableReferenceTable() {}

  @JsonCreator
  public ObservabilityPipelineEnrichmentTableReferenceTable(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY_FIELD) String keyField,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_ID) String tableId) {
    this.keyField = keyField;
    this.tableId = tableId;
  }

  public ObservabilityPipelineEnrichmentTableReferenceTable columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public ObservabilityPipelineEnrichmentTableReferenceTable addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * List of column names to include from the reference table. If not provided, all columns are
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

  public ObservabilityPipelineEnrichmentTableReferenceTable keyField(String keyField) {
    this.keyField = keyField;
    return this;
  }

  /**
   * Path to the field in the log event to match against the reference table.
   *
   * @return keyField
   */
  @JsonProperty(JSON_PROPERTY_KEY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKeyField() {
    return keyField;
  }

  public void setKeyField(String keyField) {
    this.keyField = keyField;
  }

  public ObservabilityPipelineEnrichmentTableReferenceTable tableId(String tableId) {
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
   * @return ObservabilityPipelineEnrichmentTableReferenceTable
   */
  @JsonAnySetter
  public ObservabilityPipelineEnrichmentTableReferenceTable putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineEnrichmentTableReferenceTable object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineEnrichmentTableReferenceTable
        observabilityPipelineEnrichmentTableReferenceTable =
            (ObservabilityPipelineEnrichmentTableReferenceTable) o;
    return Objects.equals(this.columns, observabilityPipelineEnrichmentTableReferenceTable.columns)
        && Objects.equals(
            this.keyField, observabilityPipelineEnrichmentTableReferenceTable.keyField)
        && Objects.equals(this.tableId, observabilityPipelineEnrichmentTableReferenceTable.tableId)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineEnrichmentTableReferenceTable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, keyField, tableId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineEnrichmentTableReferenceTable {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    keyField: ").append(toIndentedString(keyField)).append("\n");
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
