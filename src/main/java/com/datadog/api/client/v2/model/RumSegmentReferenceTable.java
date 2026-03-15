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

/** A reference table query block within a segment data query. */
@JsonPropertyOrder({
  RumSegmentReferenceTable.JSON_PROPERTY_COLUMNS,
  RumSegmentReferenceTable.JSON_PROPERTY_FILTER_QUERY,
  RumSegmentReferenceTable.JSON_PROPERTY_JOIN_CONDITION,
  RumSegmentReferenceTable.JSON_PROPERTY_NAME,
  RumSegmentReferenceTable.JSON_PROPERTY_TABLE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSegmentReferenceTable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<RumSegmentReferenceTableColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_FILTER_QUERY = "filter_query";
  private String filterQuery;

  public static final String JSON_PROPERTY_JOIN_CONDITION = "join_condition";
  private RumSegmentReferenceTableJoinCondition joinCondition;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public RumSegmentReferenceTable() {}

  @JsonCreator
  public RumSegmentReferenceTable(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<RumSegmentReferenceTableColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_CONDITION)
          RumSegmentReferenceTableJoinCondition joinCondition,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_NAME) String tableName) {
    this.columns = columns;
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
    this.name = name;
    this.tableName = tableName;
  }

  public RumSegmentReferenceTable columns(List<RumSegmentReferenceTableColumn> columns) {
    this.columns = columns;
    for (RumSegmentReferenceTableColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSegmentReferenceTable addColumnsItem(RumSegmentReferenceTableColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * The columns to include from the reference table.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<RumSegmentReferenceTableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<RumSegmentReferenceTableColumn> columns) {
    this.columns = columns;
  }

  public RumSegmentReferenceTable filterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
    return this;
  }

  /**
   * An optional filter query for the reference table data.
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

  public RumSegmentReferenceTable joinCondition(
      RumSegmentReferenceTableJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
    return this;
  }

  /**
   * The join condition for a reference table query block.
   *
   * @return joinCondition
   */
  @JsonProperty(JSON_PROPERTY_JOIN_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSegmentReferenceTableJoinCondition getJoinCondition() {
    return joinCondition;
  }

  public void setJoinCondition(RumSegmentReferenceTableJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
  }

  public RumSegmentReferenceTable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this query block.
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

  public RumSegmentReferenceTable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * The name of the reference table.
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
   * @return RumSegmentReferenceTable
   */
  @JsonAnySetter
  public RumSegmentReferenceTable putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSegmentReferenceTable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSegmentReferenceTable rumSegmentReferenceTable = (RumSegmentReferenceTable) o;
    return Objects.equals(this.columns, rumSegmentReferenceTable.columns)
        && Objects.equals(this.filterQuery, rumSegmentReferenceTable.filterQuery)
        && Objects.equals(this.joinCondition, rumSegmentReferenceTable.joinCondition)
        && Objects.equals(this.name, rumSegmentReferenceTable.name)
        && Objects.equals(this.tableName, rumSegmentReferenceTable.tableName)
        && Objects.equals(this.additionalProperties, rumSegmentReferenceTable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, filterQuery, joinCondition, name, tableName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSegmentReferenceTable {\n");
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
