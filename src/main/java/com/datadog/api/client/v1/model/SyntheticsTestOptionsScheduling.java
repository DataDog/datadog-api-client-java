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
   * <p>Object containing timeframes and timezone used for advanced scheduling.</p>
 */
@JsonPropertyOrder({
  SyntheticsTestOptionsScheduling.JSON_PROPERTY_TIMEFRAMES,
  SyntheticsTestOptionsScheduling.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestOptionsScheduling {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TIMEFRAMES = "timeframes";
  private List<SyntheticsTestOptionsSchedulingTimeframe> timeframes = null;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public SyntheticsTestOptionsScheduling timeframes(List<SyntheticsTestOptionsSchedulingTimeframe> timeframes) {
    this.timeframes = timeframes;
    for (SyntheticsTestOptionsSchedulingTimeframe item : timeframes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsTestOptionsScheduling addTimeframesItem(SyntheticsTestOptionsSchedulingTimeframe timeframesItem) {
    if (this.timeframes == null) {
      this.timeframes = new ArrayList<>();
    }
    this.timeframes.add(timeframesItem);
    this.unparsed |= timeframesItem.unparsed;
    return this;
  }

  /**
   * <p>Array containing objects describing the scheduling pattern to apply to each day.</p>
   * @return timeframes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEFRAMES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsTestOptionsSchedulingTimeframe> getTimeframes() {
        return timeframes;
      }
  public void setTimeframes(List<SyntheticsTestOptionsSchedulingTimeframe> timeframes) {
    this.timeframes = timeframes;
  }
  public SyntheticsTestOptionsScheduling timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * <p>Timezone in which the timeframe is based.</p>
   * @return timezone
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEZONE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTimezone() {
        return timezone;
      }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   * Return true if this SyntheticsTestOptionsScheduling object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestOptionsScheduling syntheticsTestOptionsScheduling = (SyntheticsTestOptionsScheduling) o;
    return Objects.equals(this.timeframes, syntheticsTestOptionsScheduling.timeframes) && Objects.equals(this.timezone, syntheticsTestOptionsScheduling.timezone);
  }


  @Override
  public int hashCode() {
    return Objects.hash(timeframes,timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptionsScheduling {\n");
    sb.append("    timeframes: ").append(toIndentedString(timeframes)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
