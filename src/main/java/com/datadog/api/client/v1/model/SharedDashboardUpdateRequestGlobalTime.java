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

/** Timeframe setting for the shared dashboard. */
@JsonPropertyOrder({SharedDashboardUpdateRequestGlobalTime.JSON_PROPERTY_LIVE_SPAN})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardUpdateRequestGlobalTime {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIVE_SPAN = "live_span";
  private DashboardGlobalTimeLiveSpan liveSpan;

  public SharedDashboardUpdateRequestGlobalTime liveSpan(DashboardGlobalTimeLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
    this.unparsed |= !liveSpan.isValid();
    return this;
  }

  /**
   * Dashboard global time live_span selection
   *
   * @return liveSpan
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardGlobalTimeLiveSpan getLiveSpan() {
    return liveSpan;
  }

  public void setLiveSpan(DashboardGlobalTimeLiveSpan liveSpan) {
    if (!liveSpan.isValid()) {
      this.unparsed = true;
    }
    this.liveSpan = liveSpan;
  }

  /** Return true if this SharedDashboardUpdateRequestGlobalTime object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardUpdateRequestGlobalTime sharedDashboardUpdateRequestGlobalTime =
        (SharedDashboardUpdateRequestGlobalTime) o;
    return Objects.equals(this.liveSpan, sharedDashboardUpdateRequestGlobalTime.liveSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveSpan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardUpdateRequestGlobalTime {\n");
    sb.append("    liveSpan: ").append(toIndentedString(liveSpan)).append("\n");
    sb.append("}");
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
