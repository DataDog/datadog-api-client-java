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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  HeatmapBackendRequest20270101OneOf4458138496.JSON_PROPERTY__QUERY_OPTIONS,
  HeatmapBackendRequest20270101OneOf4458138496.JSON_PROPERTY_Q,
  HeatmapBackendRequest20270101OneOf4458138496.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatmapBackendRequest20270101OneOf4458138496 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__QUERY_OPTIONS = "_query_options";
  private Map<String, DashboardInlineSchema5> QueryOptions = null;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_STYLE = "style";
  private RequestStyle style;

  public HeatmapBackendRequest20270101OneOf4458138496() {}

  @JsonCreator
  public HeatmapBackendRequest20270101OneOf4458138496(
      @JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public HeatmapBackendRequest20270101OneOf4458138496 QueryOptions(
      Map<String, DashboardInlineSchema5> QueryOptions) {
    this.QueryOptions = QueryOptions;
    return this;
  }

  public HeatmapBackendRequest20270101OneOf4458138496 putQueryOptionsItem(
      String key, DashboardInlineSchema5 QueryOptionsItem) {
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
  public Map<String, DashboardInlineSchema5> getQueryOptions() {
    return QueryOptions;
  }

  public void setQueryOptions(Map<String, DashboardInlineSchema5> QueryOptions) {
    this.QueryOptions = QueryOptions;
  }

  public HeatmapBackendRequest20270101OneOf4458138496 q(String q) {
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

  public HeatmapBackendRequest20270101OneOf4458138496 style(RequestStyle style) {
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
  public RequestStyle getStyle() {
    return style;
  }

  public void setStyle(RequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this HeatmapBackendRequest20270101OneOf4458138496 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatmapBackendRequest20270101OneOf4458138496 heatmapBackendRequest20270101OneOf4458138496 =
        (HeatmapBackendRequest20270101OneOf4458138496) o;
    return Objects.equals(
            this.QueryOptions, heatmapBackendRequest20270101OneOf4458138496.QueryOptions)
        && Objects.equals(this.q, heatmapBackendRequest20270101OneOf4458138496.q)
        && Objects.equals(this.style, heatmapBackendRequest20270101OneOf4458138496.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(QueryOptions, q, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatmapBackendRequest20270101OneOf4458138496 {\n");
    sb.append("    QueryOptions: ").append(toIndentedString(QueryOptions)).append("\n");
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
