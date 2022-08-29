/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Time setting for the widget.</p>
 */
@JsonPropertyOrder({
  WidgetTime.JSON_PROPERTY_LIVE_SPAN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetTime {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIVE_SPAN = "live_span";
  private WidgetLiveSpan liveSpan;

  public WidgetTime liveSpan(WidgetLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
    this.unparsed |= !liveSpan.isValid();
    return this;
  }

  /**
   * <p>The available timeframes depend on the widget you are using.</p>
   * @return liveSpan
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIVE_SPAN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetLiveSpan getLiveSpan() {
        return liveSpan;
      }
  public void setLiveSpan(WidgetLiveSpan liveSpan) {
    if (!liveSpan.isValid()) {
        this.unparsed = true;
    }
    this.liveSpan = liveSpan;
  }

  /**
   * Return true if this WidgetTime object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetTime widgetTime = (WidgetTime) o;
    return Objects.equals(this.liveSpan, widgetTime.liveSpan);
  }


  @Override
  public int hashCode() {
    return Objects.hash(liveSpan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetTime {\n");
    sb.append("    liveSpan: ").append(toIndentedString(liveSpan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
