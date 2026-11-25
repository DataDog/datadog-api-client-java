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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  StructuredAnalysisJoinCondition.JSON_PROPERTY_SOURCE_COLUMN,
  StructuredAnalysisJoinCondition.JSON_PROPERTY_TARGET_COLUMN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisJoinCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SOURCE_COLUMN = "source_column";
  private String sourceColumn;

  public static final String JSON_PROPERTY_TARGET_COLUMN = "target_column";
  private String targetColumn;

  public StructuredAnalysisJoinCondition() {}

  @JsonCreator
  public StructuredAnalysisJoinCondition(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_COLUMN) String sourceColumn,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_COLUMN) String targetColumn) {
    this.sourceColumn = sourceColumn;
    this.targetColumn = targetColumn;
  }

  public StructuredAnalysisJoinCondition sourceColumn(String sourceColumn) {
    this.sourceColumn = sourceColumn;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sourceColumn
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceColumn() {
    return sourceColumn;
  }

  public void setSourceColumn(String sourceColumn) {
    this.sourceColumn = sourceColumn;
  }

  public StructuredAnalysisJoinCondition targetColumn(String targetColumn) {
    this.targetColumn = targetColumn;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return targetColumn
   */
  @JsonProperty(JSON_PROPERTY_TARGET_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTargetColumn() {
    return targetColumn;
  }

  public void setTargetColumn(String targetColumn) {
    this.targetColumn = targetColumn;
  }

  /** Return true if this StructuredAnalysisJoinCondition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisJoinCondition structuredAnalysisJoinCondition =
        (StructuredAnalysisJoinCondition) o;
    return Objects.equals(this.sourceColumn, structuredAnalysisJoinCondition.sourceColumn)
        && Objects.equals(this.targetColumn, structuredAnalysisJoinCondition.targetColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceColumn, targetColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisJoinCondition {\n");
    sb.append("    sourceColumn: ").append(toIndentedString(sourceColumn)).append("\n");
    sb.append("    targetColumn: ").append(toIndentedString(targetColumn)).append("\n");
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
