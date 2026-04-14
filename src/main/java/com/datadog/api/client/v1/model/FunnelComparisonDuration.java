/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Comparison time configuration for funnel widgets. */
@JsonPropertyOrder({
  FunnelComparisonDuration.JSON_PROPERTY_CUSTOM_TIMEFRAME,
  FunnelComparisonDuration.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelComparisonDuration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_TIMEFRAME = "custom_timeframe";
  private FunnelComparisonCustomTimeframe customTimeframe;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FunnelComparisonDurationType type;

  public FunnelComparisonDuration() {}

  @JsonCreator
  public FunnelComparisonDuration(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          FunnelComparisonDurationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public FunnelComparisonDuration customTimeframe(FunnelComparisonCustomTimeframe customTimeframe) {
    this.customTimeframe = customTimeframe;
    this.unparsed |= customTimeframe.unparsed;
    return this;
  }

  /**
   * Custom timeframe for funnel comparison.
   *
   * @return customTimeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FunnelComparisonCustomTimeframe getCustomTimeframe() {
    return customTimeframe;
  }

  public void setCustomTimeframe(FunnelComparisonCustomTimeframe customTimeframe) {
    this.customTimeframe = customTimeframe;
  }

  public FunnelComparisonDuration type(FunnelComparisonDurationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of comparison duration.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FunnelComparisonDurationType getType() {
    return type;
  }

  public void setType(FunnelComparisonDurationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this FunnelComparisonDuration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelComparisonDuration funnelComparisonDuration = (FunnelComparisonDuration) o;
    return Objects.equals(this.customTimeframe, funnelComparisonDuration.customTimeframe)
        && Objects.equals(this.type, funnelComparisonDuration.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTimeframe, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelComparisonDuration {\n");
    sb.append("    customTimeframe: ").append(toIndentedString(customTimeframe)).append("\n");
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
