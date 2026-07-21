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

/**
 * Attributes of a DDSQL tabular query response. <code>query_id</code> is set when <code>state
 * </code> is <code>running</code>; <code>columns</code> is set when <code>state</code> is <code>
 * completed</code>.
 */
@JsonPropertyOrder({
  DdsqlTabularQueryResponseAttributes.JSON_PROPERTY_COLUMNS,
  DdsqlTabularQueryResponseAttributes.JSON_PROPERTY_QUERY_ID,
  DdsqlTabularQueryResponseAttributes.JSON_PROPERTY_STATE,
  DdsqlTabularQueryResponseAttributes.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DdsqlTabularQueryResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<DdsqlTabularQueryColumn> columns = null;

  public static final String JSON_PROPERTY_QUERY_ID = "query_id";
  private String queryId;

  public static final String JSON_PROPERTY_STATE = "state";
  private DdsqlTabularQueryState state;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<String> warnings = null;

  public DdsqlTabularQueryResponseAttributes() {}

  @JsonCreator
  public DdsqlTabularQueryResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE) DdsqlTabularQueryState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
  }

  public DdsqlTabularQueryResponseAttributes columns(List<DdsqlTabularQueryColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (DdsqlTabularQueryColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public DdsqlTabularQueryResponseAttributes addColumnsItem(DdsqlTabularQueryColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Column-major result set. Each element carries one column's name, type, and values, with one
   * value per row of the result. Set when <code>state</code> is <code>completed</code>.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DdsqlTabularQueryColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<DdsqlTabularQueryColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (DdsqlTabularQueryColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public DdsqlTabularQueryResponseAttributes queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * Opaque token to pass to the fetch endpoint to poll for results. Set when <code>state</code> is
   * <code>running</code> and absent when <code>state</code> is <code>completed</code>.
   *
   * @return queryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public DdsqlTabularQueryResponseAttributes state(DdsqlTabularQueryState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * Lifecycle state of a DDSQL tabular query response. <code>running</code> means the query is
   * still executing and the client should poll the fetch endpoint with the returned <code>query_id
   * </code>. <code>completed</code> means the result set is inlined in <code>columns</code> and no
   * further polling is required.
   *
   * @return state
   */
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DdsqlTabularQueryState getState() {
    return state;
  }

  public void setState(DdsqlTabularQueryState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public DdsqlTabularQueryResponseAttributes warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public DdsqlTabularQueryResponseAttributes addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Non-fatal messages emitted by the query engine while serving this response.
   *
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
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
   * @return DdsqlTabularQueryResponseAttributes
   */
  @JsonAnySetter
  public DdsqlTabularQueryResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DdsqlTabularQueryResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DdsqlTabularQueryResponseAttributes ddsqlTabularQueryResponseAttributes =
        (DdsqlTabularQueryResponseAttributes) o;
    return Objects.equals(this.columns, ddsqlTabularQueryResponseAttributes.columns)
        && Objects.equals(this.queryId, ddsqlTabularQueryResponseAttributes.queryId)
        && Objects.equals(this.state, ddsqlTabularQueryResponseAttributes.state)
        && Objects.equals(this.warnings, ddsqlTabularQueryResponseAttributes.warnings)
        && Objects.equals(
            this.additionalProperties, ddsqlTabularQueryResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, queryId, state, warnings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DdsqlTabularQueryResponseAttributes {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
