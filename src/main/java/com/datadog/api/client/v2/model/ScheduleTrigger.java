/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Trigger a workflow VIA a Schedule. The workflow must be published. */
@JsonPropertyOrder({ScheduleTrigger.JSON_PROPERTY_RRULE_EXPRESSION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScheduleTrigger {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RRULE_EXPRESSION = "rruleExpression";
  private String rruleExpression;

  public ScheduleTrigger() {}

  @JsonCreator
  public ScheduleTrigger(
      @JsonProperty(required = true, value = JSON_PROPERTY_RRULE_EXPRESSION)
          String rruleExpression) {
    this.rruleExpression = rruleExpression;
  }

  public ScheduleTrigger rruleExpression(String rruleExpression) {
    this.rruleExpression = rruleExpression;
    return this;
  }

  /**
   * Recurrence rule expression for scheduling.
   *
   * @return rruleExpression
   */
  @JsonProperty(JSON_PROPERTY_RRULE_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRruleExpression() {
    return rruleExpression;
  }

  public void setRruleExpression(String rruleExpression) {
    this.rruleExpression = rruleExpression;
  }

  /** Return true if this ScheduleTrigger object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleTrigger scheduleTrigger = (ScheduleTrigger) o;
    return Objects.equals(this.rruleExpression, scheduleTrigger.rruleExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rruleExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleTrigger {\n");
    sb.append("    rruleExpression: ").append(toIndentedString(rruleExpression)).append("\n");
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
