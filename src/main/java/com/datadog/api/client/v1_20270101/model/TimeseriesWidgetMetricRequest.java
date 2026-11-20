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
  TimeseriesWidgetMetricRequest.JSON_PROPERTY__QUERY_OPTIONS,
  TimeseriesWidgetMetricRequest.JSON_PROPERTY_DISPLAY_TYPE,
  TimeseriesWidgetMetricRequest.JSON_PROPERTY_METADATA,
  TimeseriesWidgetMetricRequest.JSON_PROPERTY_ON_RIGHT_YAXIS,
  TimeseriesWidgetMetricRequest.JSON_PROPERTY_Q,
  TimeseriesWidgetMetricRequest.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesWidgetMetricRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__QUERY_OPTIONS = "_query_options";
  private Map<String, DashboardInlineSchema50> QueryOptions = null;

  public static final String JSON_PROPERTY_DISPLAY_TYPE = "display_type";
  private WidgetDisplayType displayType;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<TimeseriesWidgetExpressionAlias> metadata = null;

  public static final String JSON_PROPERTY_ON_RIGHT_YAXIS = "on_right_yaxis";
  private Boolean onRightYaxis;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_STYLE = "style";
  private TimeseriesRequestStyle style;

  public TimeseriesWidgetMetricRequest() {}

  @JsonCreator
  public TimeseriesWidgetMetricRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public TimeseriesWidgetMetricRequest QueryOptions(
      Map<String, DashboardInlineSchema50> QueryOptions) {
    this.QueryOptions = QueryOptions;
    return this;
  }

  public TimeseriesWidgetMetricRequest putQueryOptionsItem(
      String key, DashboardInlineSchema50 QueryOptionsItem) {
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
  public Map<String, DashboardInlineSchema50> getQueryOptions() {
    return QueryOptions;
  }

  public void setQueryOptions(Map<String, DashboardInlineSchema50> QueryOptions) {
    this.QueryOptions = QueryOptions;
  }

  public TimeseriesWidgetMetricRequest displayType(WidgetDisplayType displayType) {
    this.displayType = displayType;
    this.unparsed |= !displayType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return displayType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetDisplayType getDisplayType() {
    return displayType;
  }

  public void setDisplayType(WidgetDisplayType displayType) {
    if (!displayType.isValid()) {
      this.unparsed = true;
    }
    this.displayType = displayType;
  }

  public TimeseriesWidgetMetricRequest metadata(List<TimeseriesWidgetExpressionAlias> metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      for (TimeseriesWidgetExpressionAlias item : metadata) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TimeseriesWidgetMetricRequest addMetadataItem(
      TimeseriesWidgetExpressionAlias metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    this.unparsed |= metadataItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeseriesWidgetExpressionAlias> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<TimeseriesWidgetExpressionAlias> metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      for (TimeseriesWidgetExpressionAlias item : metadata) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesWidgetMetricRequest onRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return onRightYaxis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_RIGHT_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOnRightYaxis() {
    return onRightYaxis;
  }

  public void setOnRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
  }

  public TimeseriesWidgetMetricRequest q(String q) {
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

  public TimeseriesWidgetMetricRequest style(TimeseriesRequestStyle style) {
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
  public TimeseriesRequestStyle getStyle() {
    return style;
  }

  public void setStyle(TimeseriesRequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this TimeseriesWidgetMetricRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetMetricRequest timeseriesWidgetMetricRequest = (TimeseriesWidgetMetricRequest) o;
    return Objects.equals(this.QueryOptions, timeseriesWidgetMetricRequest.QueryOptions)
        && Objects.equals(this.displayType, timeseriesWidgetMetricRequest.displayType)
        && Objects.equals(this.metadata, timeseriesWidgetMetricRequest.metadata)
        && Objects.equals(this.onRightYaxis, timeseriesWidgetMetricRequest.onRightYaxis)
        && Objects.equals(this.q, timeseriesWidgetMetricRequest.q)
        && Objects.equals(this.style, timeseriesWidgetMetricRequest.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(QueryOptions, displayType, metadata, onRightYaxis, q, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetMetricRequest {\n");
    sb.append("    QueryOptions: ").append(toIndentedString(QueryOptions)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    onRightYaxis: ").append(toIndentedString(onRightYaxis)).append("\n");
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
