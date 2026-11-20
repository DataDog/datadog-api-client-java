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
  StructuredAnalysisColumnExtraction.JSON_PROPERTY_GROK_EXPRESSION,
  StructuredAnalysisColumnExtraction.JSON_PROPERTY_KEEP_NULLS,
  StructuredAnalysisColumnExtraction.JSON_PROPERTY_SOURCE_COLUMN,
  StructuredAnalysisColumnExtraction.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisColumnExtraction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROK_EXPRESSION = "grok_expression";
  private String grokExpression;

  public static final String JSON_PROPERTY_KEEP_NULLS = "keep_nulls";
  private Boolean keepNulls;

  public static final String JSON_PROPERTY_SOURCE_COLUMN = "source_column";
  private String sourceColumn;

  public static final String JSON_PROPERTY_TYPE = "type";
  private StructuredAnalysisColumnExtractionType type;

  public StructuredAnalysisColumnExtraction() {}

  @JsonCreator
  public StructuredAnalysisColumnExtraction(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROK_EXPRESSION) String grokExpression,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_COLUMN) String sourceColumn,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          StructuredAnalysisColumnExtractionType type) {
    this.grokExpression = grokExpression;
    this.sourceColumn = sourceColumn;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public StructuredAnalysisColumnExtraction grokExpression(String grokExpression) {
    this.grokExpression = grokExpression;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return grokExpression
   */
  @JsonProperty(JSON_PROPERTY_GROK_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGrokExpression() {
    return grokExpression;
  }

  public void setGrokExpression(String grokExpression) {
    this.grokExpression = grokExpression;
  }

  public StructuredAnalysisColumnExtraction keepNulls(Boolean keepNulls) {
    this.keepNulls = keepNulls;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return keepNulls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEEP_NULLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getKeepNulls() {
    return keepNulls;
  }

  public void setKeepNulls(Boolean keepNulls) {
    this.keepNulls = keepNulls;
  }

  public StructuredAnalysisColumnExtraction sourceColumn(String sourceColumn) {
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

  public StructuredAnalysisColumnExtraction type(StructuredAnalysisColumnExtractionType type) {
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
  public StructuredAnalysisColumnExtractionType getType() {
    return type;
  }

  public void setType(StructuredAnalysisColumnExtractionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this StructuredAnalysisColumnExtraction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisColumnExtraction structuredAnalysisColumnExtraction =
        (StructuredAnalysisColumnExtraction) o;
    return Objects.equals(this.grokExpression, structuredAnalysisColumnExtraction.grokExpression)
        && Objects.equals(this.keepNulls, structuredAnalysisColumnExtraction.keepNulls)
        && Objects.equals(this.sourceColumn, structuredAnalysisColumnExtraction.sourceColumn)
        && Objects.equals(this.type, structuredAnalysisColumnExtraction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grokExpression, keepNulls, sourceColumn, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisColumnExtraction {\n");
    sb.append("    grokExpression: ").append(toIndentedString(grokExpression)).append("\n");
    sb.append("    keepNulls: ").append(toIndentedString(keepNulls)).append("\n");
    sb.append("    sourceColumn: ").append(toIndentedString(sourceColumn)).append("\n");
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
