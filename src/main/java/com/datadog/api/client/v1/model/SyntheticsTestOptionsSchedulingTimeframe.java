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

/** Object describing a timeframe. */
@JsonPropertyOrder({
  SyntheticsTestOptionsSchedulingTimeframe.JSON_PROPERTY_DAY,
  SyntheticsTestOptionsSchedulingTimeframe.JSON_PROPERTY_FROM,
  SyntheticsTestOptionsSchedulingTimeframe.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestOptionsSchedulingTimeframe {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAY = "day";
  private Integer day;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public SyntheticsTestOptionsSchedulingTimeframe day(Integer day) {
    this.day = day;
    return this;
  }

  /**
   * Number representing the day of the week. minimum: 1 maximum: 7
   *
   * @return day
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public SyntheticsTestOptionsSchedulingTimeframe from(String from) {
    this.from = from;
    return this;
  }

  /**
   * The hour of the day on which scheduling starts.
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public SyntheticsTestOptionsSchedulingTimeframe to(String to) {
    this.to = to;
    return this;
  }

  /**
   * The hour of the day on which scheduling ends.
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  /** Return true if this SyntheticsTestOptionsSchedulingTimeframe object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestOptionsSchedulingTimeframe syntheticsTestOptionsSchedulingTimeframe =
        (SyntheticsTestOptionsSchedulingTimeframe) o;
    return Objects.equals(this.day, syntheticsTestOptionsSchedulingTimeframe.day)
        && Objects.equals(this.from, syntheticsTestOptionsSchedulingTimeframe.from)
        && Objects.equals(this.to, syntheticsTestOptionsSchedulingTimeframe.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptionsSchedulingTimeframe {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
