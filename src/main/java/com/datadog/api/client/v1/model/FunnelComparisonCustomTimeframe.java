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

/** Custom timeframe for funnel comparison. */
@JsonPropertyOrder({
  FunnelComparisonCustomTimeframe.JSON_PROPERTY_FROM,
  FunnelComparisonCustomTimeframe.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelComparisonCustomTimeframe {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private Double from;

  public static final String JSON_PROPERTY_TO = "to";
  private Double to;

  public FunnelComparisonCustomTimeframe() {}

  @JsonCreator
  public FunnelComparisonCustomTimeframe(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Double from,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Double to) {
    this.from = from;
    this.to = to;
  }

  public FunnelComparisonCustomTimeframe from(Double from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the custom timeframe.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getFrom() {
    return from;
  }

  public void setFrom(Double from) {
    this.from = from;
  }

  public FunnelComparisonCustomTimeframe to(Double to) {
    this.to = to;
    return this;
  }

  /**
   * End of the custom timeframe.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getTo() {
    return to;
  }

  public void setTo(Double to) {
    this.to = to;
  }

  /** Return true if this FunnelComparisonCustomTimeframe object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelComparisonCustomTimeframe funnelComparisonCustomTimeframe =
        (FunnelComparisonCustomTimeframe) o;
    return Objects.equals(this.from, funnelComparisonCustomTimeframe.from)
        && Objects.equals(this.to, funnelComparisonCustomTimeframe.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelComparisonCustomTimeframe {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
