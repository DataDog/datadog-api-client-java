/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Wrapper for live span */
@JsonPropertyOrder({
  WidgetLegacyLiveSpan.JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA,
  WidgetLegacyLiveSpan.JSON_PROPERTY_LIVE_SPAN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetLegacyLiveSpan {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA = "hide_incomplete_cost_data";
  private Boolean hideIncompleteCostData;

  public static final String JSON_PROPERTY_LIVE_SPAN = "live_span";
  private WidgetLiveSpan liveSpan;

  public WidgetLegacyLiveSpan hideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
    return this;
  }

  /**
   * Whether to hide incomplete cost data in the widget.
   *
   * @return hideIncompleteCostData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideIncompleteCostData() {
    return hideIncompleteCostData;
  }

  public void setHideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
  }

  public WidgetLegacyLiveSpan liveSpan(WidgetLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
    this.unparsed |= !liveSpan.isValid();
    return this;
  }

  /**
   * The available timeframes depend on the widget you are using.
   *
   * @return liveSpan
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetLiveSpan getLiveSpan() {
    return liveSpan;
  }

  public void setLiveSpan(WidgetLiveSpan liveSpan) {
    if (!liveSpan.isValid()) {
      this.unparsed = true;
    }
    this.liveSpan = liveSpan;
  }

  /** Return true if this WidgetLegacyLiveSpan object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetLegacyLiveSpan widgetLegacyLiveSpan = (WidgetLegacyLiveSpan) o;
    return Objects.equals(this.hideIncompleteCostData, widgetLegacyLiveSpan.hideIncompleteCostData)
        && Objects.equals(this.liveSpan, widgetLegacyLiveSpan.liveSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideIncompleteCostData, liveSpan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetLegacyLiveSpan {\n");
    sb.append("    hideIncompleteCostData: ")
        .append(toIndentedString(hideIncompleteCostData))
        .append("\n");
    sb.append("    liveSpan: ").append(toIndentedString(liveSpan)).append("\n");
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
