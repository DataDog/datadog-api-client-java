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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  GeomapBackendRegionsRequest20270101OneOf4457448128.JSON_PROPERTY__QUERY_OPTIONS,
  GeomapBackendRegionsRequest20270101OneOf4457448128.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GeomapBackendRegionsRequest20270101OneOf4457448128.JSON_PROPERTY_Q,
  GeomapBackendRegionsRequest20270101OneOf4457448128.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendRegionsRequest20270101OneOf4457448128 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__QUERY_OPTIONS = "_query_options";
  private Map<String, DashboardInlineSchema6> QueryOptions = null;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapRequestStyle style;

  public GeomapBackendRegionsRequest20270101OneOf4457448128() {}

  @JsonCreator
  public GeomapBackendRegionsRequest20270101OneOf4457448128(
      @JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457448128 QueryOptions(
      Map<String, DashboardInlineSchema6> QueryOptions) {
    this.QueryOptions = QueryOptions;
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457448128 putQueryOptionsItem(
      String key, DashboardInlineSchema6 QueryOptionsItem) {
    if (this.QueryOptions == null) {
      this.QueryOptions = new HashMap<>();
    }
    this.QueryOptions.put(key, QueryOptionsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return QueryOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY__QUERY_OPTIONS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, DashboardInlineSchema6> getQueryOptions() {
    return QueryOptions;
  }

  public void setQueryOptions(Map<String, DashboardInlineSchema6> QueryOptions) {
    this.QueryOptions = QueryOptions;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457448128 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457448128 addConditionalFormatsItem(
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

  public GeomapBackendRegionsRequest20270101OneOf4457448128 q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return q
   */
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457448128 style(GeomapRequestStyle style) {
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
   * Return true if this GeomapBackendRegionsRequest20270101OneOf4457448128 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendRegionsRequest20270101OneOf4457448128
        geomapBackendRegionsRequest20270101OneOf4457448128 =
            (GeomapBackendRegionsRequest20270101OneOf4457448128) o;
    return Objects.equals(
            this.QueryOptions, geomapBackendRegionsRequest20270101OneOf4457448128.QueryOptions)
        && Objects.equals(
            this.conditionalFormats,
            geomapBackendRegionsRequest20270101OneOf4457448128.conditionalFormats)
        && Objects.equals(this.q, geomapBackendRegionsRequest20270101OneOf4457448128.q)
        && Objects.equals(this.style, geomapBackendRegionsRequest20270101OneOf4457448128.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(QueryOptions, conditionalFormats, q, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendRegionsRequest20270101OneOf4457448128 {\n");
    sb.append("    QueryOptions: ").append(toIndentedString(QueryOptions)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
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
