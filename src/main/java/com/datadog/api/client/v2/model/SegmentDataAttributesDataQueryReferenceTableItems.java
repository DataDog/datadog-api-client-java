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

/** */
@JsonPropertyOrder({
  SegmentDataAttributesDataQueryReferenceTableItems.JSON_PROPERTY_COLUMNS,
  SegmentDataAttributesDataQueryReferenceTableItems.JSON_PROPERTY_FILTER_QUERY,
  SegmentDataAttributesDataQueryReferenceTableItems.JSON_PROPERTY_JOIN_CONDITION,
  SegmentDataAttributesDataQueryReferenceTableItems.JSON_PROPERTY_NAME,
  SegmentDataAttributesDataQueryReferenceTableItems.JSON_PROPERTY_TABLE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentDataAttributesDataQueryReferenceTableItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<SegmentDataAttributesDataQueryReferenceTableItemsColumnsItems> columns = null;

  public static final String JSON_PROPERTY_FILTER_QUERY = "filter_query";
  private String filterQuery;

  public static final String JSON_PROPERTY_JOIN_CONDITION = "join_condition";
  private SegmentDataAttributesDataQueryReferenceTableItemsJoinCondition joinCondition;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public SegmentDataAttributesDataQueryReferenceTableItems() {}

  @JsonCreator
  public SegmentDataAttributesDataQueryReferenceTableItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_CONDITION)
          SegmentDataAttributesDataQueryReferenceTableItemsJoinCondition joinCondition,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_NAME) String tableName) {
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
    this.tableName = tableName;
  }

  public SegmentDataAttributesDataQueryReferenceTableItems columns(
      List<SegmentDataAttributesDataQueryReferenceTableItemsColumnsItems> columns) {
    this.columns = columns;
    for (SegmentDataAttributesDataQueryReferenceTableItemsColumnsItems item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SegmentDataAttributesDataQueryReferenceTableItems addColumnsItem(
      SegmentDataAttributesDataQueryReferenceTableItemsColumnsItems columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Getcolumns
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentDataAttributesDataQueryReferenceTableItemsColumnsItems> getColumns() {
    return columns;
  }

  public void setColumns(
      List<SegmentDataAttributesDataQueryReferenceTableItemsColumnsItems> columns) {
    this.columns = columns;
  }

  public SegmentDataAttributesDataQueryReferenceTableItems filterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
    return this;
  }

  /**
   * GetfilterQuery
   *
   * @return filterQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilterQuery() {
    return filterQuery;
  }

  public void setFilterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
  }

  public SegmentDataAttributesDataQueryReferenceTableItems joinCondition(
      SegmentDataAttributesDataQueryReferenceTableItemsJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
    return this;
  }

  /**
   * GetjoinCondition
   *
   * @return joinCondition
   */
  @JsonProperty(JSON_PROPERTY_JOIN_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SegmentDataAttributesDataQueryReferenceTableItemsJoinCondition getJoinCondition() {
    return joinCondition;
  }

  public void setJoinCondition(
      SegmentDataAttributesDataQueryReferenceTableItemsJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
  }

  public SegmentDataAttributesDataQueryReferenceTableItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Getname
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

  public SegmentDataAttributesDataQueryReferenceTableItems tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * GettableName
   *
   * @return tableName
   */
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
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
   * @return SegmentDataAttributesDataQueryReferenceTableItems
   */
  @JsonAnySetter
  public SegmentDataAttributesDataQueryReferenceTableItems putAdditionalProperty(
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

  /** Return true if this SegmentDataAttributesDataQueryReferenceTableItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentDataAttributesDataQueryReferenceTableItems
        segmentDataAttributesDataQueryReferenceTableItems =
            (SegmentDataAttributesDataQueryReferenceTableItems) o;
    return Objects.equals(this.columns, segmentDataAttributesDataQueryReferenceTableItems.columns)
        && Objects.equals(
            this.filterQuery, segmentDataAttributesDataQueryReferenceTableItems.filterQuery)
        && Objects.equals(
            this.joinCondition, segmentDataAttributesDataQueryReferenceTableItems.joinCondition)
        && Objects.equals(this.name, segmentDataAttributesDataQueryReferenceTableItems.name)
        && Objects.equals(
            this.tableName, segmentDataAttributesDataQueryReferenceTableItems.tableName)
        && Objects.equals(
            this.additionalProperties,
            segmentDataAttributesDataQueryReferenceTableItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, filterQuery, joinCondition, name, tableName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentDataAttributesDataQueryReferenceTableItems {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    filterQuery: ").append(toIndentedString(filterQuery)).append("\n");
    sb.append("    joinCondition: ").append(toIndentedString(joinCondition)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
