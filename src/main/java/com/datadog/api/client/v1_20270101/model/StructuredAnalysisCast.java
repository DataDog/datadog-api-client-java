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
  StructuredAnalysisCast.JSON_PROPERTY_SOURCE_COLUMN,
  StructuredAnalysisCast.JSON_PROPERTY_TARGET_COLUMN,
  StructuredAnalysisCast.JSON_PROPERTY_TARGET_TYPE,
  StructuredAnalysisCast.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisCast {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SOURCE_COLUMN = "source_column";
  private String sourceColumn;

  public static final String JSON_PROPERTY_TARGET_COLUMN = "target_column";
  private String targetColumn;

  public static final String JSON_PROPERTY_TARGET_TYPE = "target_type";
  private StructuredAnalysisCastTargetType targetType;

  public static final String JSON_PROPERTY_TYPE = "type";
  private StructuredAnalysisCastType type;

  public StructuredAnalysisCast() {}

  @JsonCreator
  public StructuredAnalysisCast(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_COLUMN) String sourceColumn,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_COLUMN) String targetColumn,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_TYPE)
          StructuredAnalysisCastTargetType targetType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) StructuredAnalysisCastType type) {
    this.sourceColumn = sourceColumn;
    this.targetColumn = targetColumn;
    this.targetType = targetType;
    this.unparsed |= !targetType.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public StructuredAnalysisCast sourceColumn(String sourceColumn) {
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

  public StructuredAnalysisCast targetColumn(String targetColumn) {
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

  public StructuredAnalysisCast targetType(StructuredAnalysisCastTargetType targetType) {
    this.targetType = targetType;
    this.unparsed |= !targetType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return targetType
   */
  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public StructuredAnalysisCastTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(StructuredAnalysisCastTargetType targetType) {
    if (!targetType.isValid()) {
      this.unparsed = true;
    }
    this.targetType = targetType;
  }

  public StructuredAnalysisCast type(StructuredAnalysisCastType type) {
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
  public StructuredAnalysisCastType getType() {
    return type;
  }

  public void setType(StructuredAnalysisCastType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this StructuredAnalysisCast object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisCast structuredAnalysisCast = (StructuredAnalysisCast) o;
    return Objects.equals(this.sourceColumn, structuredAnalysisCast.sourceColumn)
        && Objects.equals(this.targetColumn, structuredAnalysisCast.targetColumn)
        && Objects.equals(this.targetType, structuredAnalysisCast.targetType)
        && Objects.equals(this.type, structuredAnalysisCast.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceColumn, targetColumn, targetType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisCast {\n");
    sb.append("    sourceColumn: ").append(toIndentedString(sourceColumn)).append("\n");
    sb.append("    targetColumn: ").append(toIndentedString(targetColumn)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
