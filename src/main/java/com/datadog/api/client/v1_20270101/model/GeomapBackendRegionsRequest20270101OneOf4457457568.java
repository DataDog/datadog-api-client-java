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
  GeomapBackendRegionsRequest20270101OneOf4457457568.JSON_PROPERTY_CI_PIPELINE_QUERY,
  GeomapBackendRegionsRequest20270101OneOf4457457568.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GeomapBackendRegionsRequest20270101OneOf4457457568.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendRegionsRequest20270101OneOf4457457568 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CI_PIPELINE_QUERY = "ci_pipeline_query";
  private LogQueryDefinition ciPipelineQuery;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapRequestStyle style;

  public GeomapBackendRegionsRequest20270101OneOf4457457568() {}

  @JsonCreator
  public GeomapBackendRegionsRequest20270101OneOf4457457568(
      @JsonProperty(required = true, value = JSON_PROPERTY_CI_PIPELINE_QUERY)
          LogQueryDefinition ciPipelineQuery) {
    this.ciPipelineQuery = ciPipelineQuery;
    this.unparsed |= ciPipelineQuery.unparsed;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457457568 ciPipelineQuery(
      LogQueryDefinition ciPipelineQuery) {
    this.ciPipelineQuery = ciPipelineQuery;
    this.unparsed |= ciPipelineQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return ciPipelineQuery
   */
  @JsonProperty(JSON_PROPERTY_CI_PIPELINE_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition getCiPipelineQuery() {
    return ciPipelineQuery;
  }

  public void setCiPipelineQuery(LogQueryDefinition ciPipelineQuery) {
    this.ciPipelineQuery = ciPipelineQuery;
    if (ciPipelineQuery != null) {
      this.unparsed |= ciPipelineQuery.unparsed;
    }
  }

  public GeomapBackendRegionsRequest20270101OneOf4457457568 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457457568 addConditionalFormatsItem(
      ThresholdFormattingRule conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ThresholdFormattingRule> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GeomapBackendRegionsRequest20270101OneOf4457457568 style(GeomapRequestStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GeomapRequestStyle getStyle() {
    return style;
  }

  public void setStyle(GeomapRequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /**
   * Return true if this GeomapBackendRegionsRequest20270101OneOf4457457568 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendRegionsRequest20270101OneOf4457457568
        geomapBackendRegionsRequest20270101OneOf4457457568 =
            (GeomapBackendRegionsRequest20270101OneOf4457457568) o;
    return Objects.equals(
            this.ciPipelineQuery,
            geomapBackendRegionsRequest20270101OneOf4457457568.ciPipelineQuery)
        && Objects.equals(
            this.conditionalFormats,
            geomapBackendRegionsRequest20270101OneOf4457457568.conditionalFormats)
        && Objects.equals(this.style, geomapBackendRegionsRequest20270101OneOf4457457568.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciPipelineQuery, conditionalFormats, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendRegionsRequest20270101OneOf4457457568 {\n");
    sb.append("    ciPipelineQuery: ").append(toIndentedString(ciPipelineQuery)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
