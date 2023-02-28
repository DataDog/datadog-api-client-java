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

/** Configuration options for scheduling. */
@JsonPropertyOrder({MonitorOptionsSchedulingOptions.JSON_PROPERTY_EVALUATION_WINDOW})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorOptionsSchedulingOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVALUATION_WINDOW = "evaluation_window";
  private MonitorOptionsSchedulingOptionsEvaluationWindow evaluationWindow;

  public MonitorOptionsSchedulingOptions evaluationWindow(
      MonitorOptionsSchedulingOptionsEvaluationWindow evaluationWindow) {
    this.evaluationWindow = evaluationWindow;
    this.unparsed |= evaluationWindow.unparsed;
    return this;
  }

  /**
   * Configuration options for the evaluation window. If <code>hour_starts</code> is set, no other
   * fields may be set. Otherwise, <code>day_starts</code> and <code>month_starts</code> must be set
   * together.
   *
   * @return evaluationWindow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorOptionsSchedulingOptionsEvaluationWindow getEvaluationWindow() {
    return evaluationWindow;
  }

  public void setEvaluationWindow(
      MonitorOptionsSchedulingOptionsEvaluationWindow evaluationWindow) {
    this.evaluationWindow = evaluationWindow;
  }

  /** Return true if this MonitorOptionsSchedulingOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorOptionsSchedulingOptions monitorOptionsSchedulingOptions =
        (MonitorOptionsSchedulingOptions) o;
    return Objects.equals(this.evaluationWindow, monitorOptionsSchedulingOptions.evaluationWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorOptionsSchedulingOptions {\n");
    sb.append("    evaluationWindow: ").append(toIndentedString(evaluationWindow)).append("\n");
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
