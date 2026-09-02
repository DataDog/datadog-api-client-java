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

/** Attributes for a batch rows query request. */
@JsonPropertyOrder({
  BatchRowsQueryRequestDataAttributes.JSON_PROPERTY_ROW_IDS,
  BatchRowsQueryRequestDataAttributes.JSON_PROPERTY_TABLE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BatchRowsQueryRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ROW_IDS = "row_ids";
  private List<String> rowIds = new ArrayList<>();

  public static final String JSON_PROPERTY_TABLE_ID = "table_id";
  private String tableId;

  public BatchRowsQueryRequestDataAttributes() {}

  @JsonCreator
  public BatchRowsQueryRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ROW_IDS) List<String> rowIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_ID) String tableId) {
    this.rowIds = rowIds;
    this.tableId = tableId;
  }

  public BatchRowsQueryRequestDataAttributes rowIds(List<String> rowIds) {
    this.rowIds = rowIds;
    return this;
  }

  public BatchRowsQueryRequestDataAttributes addRowIdsItem(String rowIdsItem) {
    this.rowIds.add(rowIdsItem);
    return this;
  }

  /**
   * List of row identifiers to query from the reference table.
   *
   * @return rowIds
   */
  @JsonProperty(JSON_PROPERTY_ROW_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRowIds() {
    return rowIds;
  }

  public void setRowIds(List<String> rowIds) {
    this.rowIds = rowIds;
  }

  public BatchRowsQueryRequestDataAttributes tableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * Unique identifier of the reference table to query.
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
   * @return BatchRowsQueryRequestDataAttributes
   */
  @JsonAnySetter
  public BatchRowsQueryRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this BatchRowsQueryRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRowsQueryRequestDataAttributes batchRowsQueryRequestDataAttributes =
        (BatchRowsQueryRequestDataAttributes) o;
    return Objects.equals(this.rowIds, batchRowsQueryRequestDataAttributes.rowIds)
        && Objects.equals(this.tableId, batchRowsQueryRequestDataAttributes.tableId)
        && Objects.equals(
            this.additionalProperties, batchRowsQueryRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowIds, tableId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRowsQueryRequestDataAttributes {\n");
    sb.append("    rowIds: ").append(toIndentedString(rowIds)).append("\n");
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
