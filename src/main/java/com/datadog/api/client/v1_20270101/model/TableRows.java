/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  TableRows.JSON_PROPERTY_GROUP_BY,
  TableRows.JSON_PROPERTY_JOIN_TYPE,
  TableRows.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableRows {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<TableRowGroupBy> groupBy = new ArrayList<>();

  public static final String JSON_PROPERTY_JOIN_TYPE = "join_type";
  private TableRowsJoinType joinType;

  public static final String JSON_PROPERTY_SORT = "sort";
  private TableSort sort;

  public TableRows() {}

  @JsonCreator
  public TableRows(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_BY) List<TableRowGroupBy> groupBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_SORT) TableSort sort) {
    this.groupBy = groupBy;
    for (TableRowGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    this.sort = sort;
    this.unparsed |= sort.unparsed;
  }

  public TableRows groupBy(List<TableRowGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (TableRowGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TableRows addGroupByItem(TableRowGroupBy groupByItem) {
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TableRowGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<TableRowGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (TableRowGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TableRows joinType(TableRowsJoinType joinType) {
    this.joinType = joinType;
    this.unparsed |= !joinType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return joinType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableRowsJoinType getJoinType() {
    return joinType;
  }

  public void setJoinType(TableRowsJoinType joinType) {
    if (!joinType.isValid()) {
      this.unparsed = true;
    }
    this.joinType = joinType;
  }

  public TableRows sort(TableSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableSort getSort() {
    return sort;
  }

  public void setSort(TableSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this TableRows object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRows tableRows = (TableRows) o;
    return Objects.equals(this.groupBy, tableRows.groupBy)
        && Objects.equals(this.joinType, tableRows.joinType)
        && Objects.equals(this.sort, tableRows.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBy, joinType, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRows {\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
