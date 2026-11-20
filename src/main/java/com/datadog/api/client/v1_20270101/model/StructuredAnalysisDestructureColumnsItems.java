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
  StructuredAnalysisDestructureColumnsItems.JSON_PROPERTY_KEYS,
  StructuredAnalysisDestructureColumnsItems.JSON_PROPERTY_SOURCE_COLUMN,
  StructuredAnalysisDestructureColumnsItems.JSON_PROPERTY_TARGET_COLUMN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisDestructureColumnsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KEYS = "keys";
  private List<String> keys = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCE_COLUMN = "source_column";
  private String sourceColumn;

  public static final String JSON_PROPERTY_TARGET_COLUMN = "target_column";
  private String targetColumn;

  public StructuredAnalysisDestructureColumnsItems() {}

  @JsonCreator
  public StructuredAnalysisDestructureColumnsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEYS) List<String> keys,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_COLUMN) String sourceColumn,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_COLUMN) String targetColumn) {
    this.keys = keys;
    this.sourceColumn = sourceColumn;
    this.targetColumn = targetColumn;
  }

  public StructuredAnalysisDestructureColumnsItems keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public StructuredAnalysisDestructureColumnsItems addKeysItem(String keysItem) {
    this.keys.add(keysItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return keys
   */
  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }

  public StructuredAnalysisDestructureColumnsItems sourceColumn(String sourceColumn) {
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

  public StructuredAnalysisDestructureColumnsItems targetColumn(String targetColumn) {
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

  /** Return true if this StructuredAnalysisDestructureColumnsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisDestructureColumnsItems structuredAnalysisDestructureColumnsItems =
        (StructuredAnalysisDestructureColumnsItems) o;
    return Objects.equals(this.keys, structuredAnalysisDestructureColumnsItems.keys)
        && Objects.equals(this.sourceColumn, structuredAnalysisDestructureColumnsItems.sourceColumn)
        && Objects.equals(
            this.targetColumn, structuredAnalysisDestructureColumnsItems.targetColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, sourceColumn, targetColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisDestructureColumnsItems {\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
