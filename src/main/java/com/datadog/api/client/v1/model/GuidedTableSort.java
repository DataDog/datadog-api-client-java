/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Sort configuration for a guided table. */
@JsonPropertyOrder({GuidedTableSort.JSON_PROPERTY_COLUMNS, GuidedTableSort.JSON_PROPERTY_LIMIT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableSort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<WidgetFieldSort> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public GuidedTableSort() {}

  @JsonCreator
  public GuidedTableSort(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS) List<WidgetFieldSort> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) Long limit) {
    this.columns = columns;
    this.limit = limit;
  }

  public GuidedTableSort columns(List<WidgetFieldSort> columns) {
    this.columns = columns;
    for (WidgetFieldSort item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GuidedTableSort addColumnsItem(WidgetFieldSort columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Columns to sort by, in order of application.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<WidgetFieldSort> getColumns() {
    return columns;
  }

  public void setColumns(List<WidgetFieldSort> columns) {
    this.columns = columns;
  }

  public GuidedTableSort limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of rows to show after sorting. minimum: 1
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
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
   * @return GuidedTableSort
   */
  @JsonAnySetter
  public GuidedTableSort putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableSort guidedTableSort = (GuidedTableSort) o;
    return Objects.equals(this.columns, guidedTableSort.columns)
        && Objects.equals(this.limit, guidedTableSort.limit)
        && Objects.equals(this.additionalProperties, guidedTableSort.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, limit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableSort {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
