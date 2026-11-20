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
  WidgetTime20270101OneOf4464105312.JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA,
  WidgetTime20270101OneOf4464105312.JSON_PROPERTY_LIVE_SPAN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetTime20270101OneOf4464105312 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA = "hide_incomplete_cost_data";
  private Boolean hideIncompleteCostData;

  public static final String JSON_PROPERTY_LIVE_SPAN = "live_span";
  private LegacyLiveSpan liveSpan;

  public WidgetTime20270101OneOf4464105312() {}

  @JsonCreator
  public WidgetTime20270101OneOf4464105312(
      @JsonProperty(required = true, value = JSON_PROPERTY_LIVE_SPAN) LegacyLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
    this.unparsed |= liveSpan.unparsed;
  }

  public WidgetTime20270101OneOf4464105312 hideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public WidgetTime20270101OneOf4464105312 liveSpan(LegacyLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
    this.unparsed |= liveSpan.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return liveSpan
   */
  @JsonProperty(JSON_PROPERTY_LIVE_SPAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LegacyLiveSpan getLiveSpan() {
    return liveSpan;
  }

  public void setLiveSpan(LegacyLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
    if (liveSpan != null) {
      this.unparsed |= liveSpan.unparsed;
    }
  }

  /** Return true if this WidgetTime20270101OneOf4464105312 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetTime20270101OneOf4464105312 widgetTime20270101OneOf4464105312 =
        (WidgetTime20270101OneOf4464105312) o;
    return Objects.equals(
            this.hideIncompleteCostData, widgetTime20270101OneOf4464105312.hideIncompleteCostData)
        && Objects.equals(this.liveSpan, widgetTime20270101OneOf4464105312.liveSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideIncompleteCostData, liveSpan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetTime20270101OneOf4464105312 {\n");
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
