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
  StructuredAnalysisCompute.JSON_PROPERTY_AGGREGATION,
  StructuredAnalysisCompute.JSON_PROPERTY_COLUMN,
  StructuredAnalysisCompute.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public StructuredAnalysisCompute() {}

  @JsonCreator
  public StructuredAnalysisCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION) String aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column) {
    this.aggregation = aggregation;
    this.column = column;
  }

  public StructuredAnalysisCompute aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAggregation() {
    return aggregation;
  }

  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }

  public StructuredAnalysisCompute column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return column
   */
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public StructuredAnalysisCompute name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  /** Return true if this StructuredAnalysisCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisCompute structuredAnalysisCompute = (StructuredAnalysisCompute) o;
    return Objects.equals(this.aggregation, structuredAnalysisCompute.aggregation)
        && Objects.equals(this.column, structuredAnalysisCompute.column)
        && Objects.equals(this.name, structuredAnalysisCompute.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, column, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
