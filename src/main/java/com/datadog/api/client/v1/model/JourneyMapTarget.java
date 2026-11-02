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

/** The pair of journey steps the paths are visualized between. */
@JsonPropertyOrder({JourneyMapTarget.JSON_PROPERTY_END, JourneyMapTarget.JSON_PROPERTY_START})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JourneyMapTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private String end;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public JourneyMapTarget() {}

  @JsonCreator
  public JourneyMapTarget(
      @JsonProperty(required = true, value = JSON_PROPERTY_END) String end,
      @JsonProperty(required = true, value = JSON_PROPERTY_START) String start) {
    this.end = end;
    this.start = start;
  }

  public JourneyMapTarget end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Key of the end step in <code>search.node_objects</code>.
   *
   * @return end
   */
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public JourneyMapTarget start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Key of the start step in <code>search.node_objects</code>.
   *
   * @return start
   */
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  /** Return true if this JourneyMapTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyMapTarget journeyMapTarget = (JourneyMapTarget) o;
    return Objects.equals(this.end, journeyMapTarget.end)
        && Objects.equals(this.start, journeyMapTarget.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyMapTarget {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
