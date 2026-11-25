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
  StructuredAnalysisJoin.JSON_PROPERTY_JOIN_CONDITIONS,
  StructuredAnalysisJoin.JSON_PROPERTY_JOIN_TYPE,
  StructuredAnalysisJoin.JSON_PROPERTY_TARGET_COLUMNS,
  StructuredAnalysisJoin.JSON_PROPERTY_TARGET_DATASET,
  StructuredAnalysisJoin.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisJoin {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_JOIN_CONDITIONS = "join_conditions";
  private List<StructuredAnalysisJoinCondition> joinConditions = new ArrayList<>();

  public static final String JSON_PROPERTY_JOIN_TYPE = "join_type";
  private StructuredAnalysisJoinJoinType joinType;

  public static final String JSON_PROPERTY_TARGET_COLUMNS = "target_columns";
  private List<String> targetColumns = new ArrayList<>();

  public static final String JSON_PROPERTY_TARGET_DATASET = "target_dataset";
  private String targetDataset;

  public static final String JSON_PROPERTY_TYPE = "type";
  private StructuredAnalysisJoinType type;

  public StructuredAnalysisJoin() {}

  @JsonCreator
  public StructuredAnalysisJoin(
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_CONDITIONS)
          List<StructuredAnalysisJoinCondition> joinConditions,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_TYPE)
          StructuredAnalysisJoinJoinType joinType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_COLUMNS)
          List<String> targetColumns,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_DATASET) String targetDataset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) StructuredAnalysisJoinType type) {
    this.joinConditions = joinConditions;
    for (StructuredAnalysisJoinCondition item : joinConditions) {
      this.unparsed |= item.unparsed;
    }
    this.joinType = joinType;
    this.unparsed |= !joinType.isValid();
    this.targetColumns = targetColumns;
    this.targetDataset = targetDataset;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public StructuredAnalysisJoin joinConditions(
      List<StructuredAnalysisJoinCondition> joinConditions) {
    this.joinConditions = joinConditions;
    for (StructuredAnalysisJoinCondition item : joinConditions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public StructuredAnalysisJoin addJoinConditionsItem(
      StructuredAnalysisJoinCondition joinConditionsItem) {
    this.joinConditions.add(joinConditionsItem);
    this.unparsed |= joinConditionsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return joinConditions
   */
  @JsonProperty(JSON_PROPERTY_JOIN_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<StructuredAnalysisJoinCondition> getJoinConditions() {
    return joinConditions;
  }

  public void setJoinConditions(List<StructuredAnalysisJoinCondition> joinConditions) {
    this.joinConditions = joinConditions;
    if (joinConditions != null) {
      for (StructuredAnalysisJoinCondition item : joinConditions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public StructuredAnalysisJoin joinType(StructuredAnalysisJoinJoinType joinType) {
    this.joinType = joinType;
    this.unparsed |= !joinType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return joinType
   */
  @JsonProperty(JSON_PROPERTY_JOIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public StructuredAnalysisJoinJoinType getJoinType() {
    return joinType;
  }

  public void setJoinType(StructuredAnalysisJoinJoinType joinType) {
    if (!joinType.isValid()) {
      this.unparsed = true;
    }
    this.joinType = joinType;
  }

  public StructuredAnalysisJoin targetColumns(List<String> targetColumns) {
    this.targetColumns = targetColumns;
    return this;
  }

  public StructuredAnalysisJoin addTargetColumnsItem(String targetColumnsItem) {
    this.targetColumns.add(targetColumnsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return targetColumns
   */
  @JsonProperty(JSON_PROPERTY_TARGET_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTargetColumns() {
    return targetColumns;
  }

  public void setTargetColumns(List<String> targetColumns) {
    this.targetColumns = targetColumns;
  }

  public StructuredAnalysisJoin targetDataset(String targetDataset) {
    this.targetDataset = targetDataset;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return targetDataset
   */
  @JsonProperty(JSON_PROPERTY_TARGET_DATASET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTargetDataset() {
    return targetDataset;
  }

  public void setTargetDataset(String targetDataset) {
    this.targetDataset = targetDataset;
  }

  public StructuredAnalysisJoin type(StructuredAnalysisJoinType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public StructuredAnalysisJoinType getType() {
    return type;
  }

  public void setType(StructuredAnalysisJoinType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this StructuredAnalysisJoin object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisJoin structuredAnalysisJoin = (StructuredAnalysisJoin) o;
    return Objects.equals(this.joinConditions, structuredAnalysisJoin.joinConditions)
        && Objects.equals(this.joinType, structuredAnalysisJoin.joinType)
        && Objects.equals(this.targetColumns, structuredAnalysisJoin.targetColumns)
        && Objects.equals(this.targetDataset, structuredAnalysisJoin.targetDataset)
        && Objects.equals(this.type, structuredAnalysisJoin.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joinConditions, joinType, targetColumns, targetDataset, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisJoin {\n");
    sb.append("    joinConditions: ").append(toIndentedString(joinConditions)).append("\n");
    sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
    sb.append("    targetColumns: ").append(toIndentedString(targetColumns)).append("\n");
    sb.append("    targetDataset: ").append(toIndentedString(targetDataset)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
