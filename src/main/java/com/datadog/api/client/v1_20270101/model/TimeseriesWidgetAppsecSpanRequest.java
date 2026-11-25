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
  TimeseriesWidgetAppsecSpanRequest.JSON_PROPERTY_APPSECSPAN_QUERY,
  TimeseriesWidgetAppsecSpanRequest.JSON_PROPERTY_DISPLAY_TYPE,
  TimeseriesWidgetAppsecSpanRequest.JSON_PROPERTY_METADATA,
  TimeseriesWidgetAppsecSpanRequest.JSON_PROPERTY_ON_RIGHT_YAXIS,
  TimeseriesWidgetAppsecSpanRequest.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesWidgetAppsecSpanRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPSECSPAN_QUERY = "appsecspan_query";
  private LogQueryDefinition appsecspanQuery;

  public static final String JSON_PROPERTY_DISPLAY_TYPE = "display_type";
  private WidgetDisplayType displayType;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<TimeseriesWidgetExpressionAlias> metadata = null;

  public static final String JSON_PROPERTY_ON_RIGHT_YAXIS = "on_right_yaxis";
  private Boolean onRightYaxis;

  public static final String JSON_PROPERTY_STYLE = "style";
  private TimeseriesRequestStyle style;

  public TimeseriesWidgetAppsecSpanRequest() {}

  @JsonCreator
  public TimeseriesWidgetAppsecSpanRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPSECSPAN_QUERY)
          LogQueryDefinition appsecspanQuery) {
    this.appsecspanQuery = appsecspanQuery;
    this.unparsed |= appsecspanQuery.unparsed;
  }

  public TimeseriesWidgetAppsecSpanRequest appsecspanQuery(LogQueryDefinition appsecspanQuery) {
    this.appsecspanQuery = appsecspanQuery;
    this.unparsed |= appsecspanQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return appsecspanQuery
   */
  @JsonProperty(JSON_PROPERTY_APPSECSPAN_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition getAppsecspanQuery() {
    return appsecspanQuery;
  }

  public void setAppsecspanQuery(LogQueryDefinition appsecspanQuery) {
    this.appsecspanQuery = appsecspanQuery;
    if (appsecspanQuery != null) {
      this.unparsed |= appsecspanQuery.unparsed;
    }
  }

  public TimeseriesWidgetAppsecSpanRequest displayType(WidgetDisplayType displayType) {
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

  public TimeseriesWidgetAppsecSpanRequest metadata(
      List<TimeseriesWidgetExpressionAlias> metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      for (TimeseriesWidgetExpressionAlias item : metadata) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TimeseriesWidgetAppsecSpanRequest addMetadataItem(
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

  public TimeseriesWidgetAppsecSpanRequest onRightYaxis(Boolean onRightYaxis) {
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

  public TimeseriesWidgetAppsecSpanRequest style(TimeseriesRequestStyle style) {
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

  /** Return true if this TimeseriesWidgetAppsecSpanRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetAppsecSpanRequest timeseriesWidgetAppsecSpanRequest =
        (TimeseriesWidgetAppsecSpanRequest) o;
    return Objects.equals(this.appsecspanQuery, timeseriesWidgetAppsecSpanRequest.appsecspanQuery)
        && Objects.equals(this.displayType, timeseriesWidgetAppsecSpanRequest.displayType)
        && Objects.equals(this.metadata, timeseriesWidgetAppsecSpanRequest.metadata)
        && Objects.equals(this.onRightYaxis, timeseriesWidgetAppsecSpanRequest.onRightYaxis)
        && Objects.equals(this.style, timeseriesWidgetAppsecSpanRequest.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appsecspanQuery, displayType, metadata, onRightYaxis, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetAppsecSpanRequest {\n");
    sb.append("    appsecspanQuery: ").append(toIndentedString(appsecspanQuery)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    onRightYaxis: ").append(toIndentedString(onRightYaxis)).append("\n");
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
