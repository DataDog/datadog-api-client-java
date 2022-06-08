/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** SLO thresholds (target and optionally warning) for a single time window. */
@JsonPropertyOrder({
  SLOThreshold.JSON_PROPERTY_TARGET,
  SLOThreshold.JSON_PROPERTY_TARGET_DISPLAY,
  SLOThreshold.JSON_PROPERTY_TIMEFRAME,
  SLOThreshold.JSON_PROPERTY_WARNING,
  SLOThreshold.JSON_PROPERTY_WARNING_DISPLAY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOThreshold {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TARGET = "target";
  private Double target;

  public static final String JSON_PROPERTY_TARGET_DISPLAY = "target_display";
  private String targetDisplay;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private SLOTimeframe timeframe;

  public static final String JSON_PROPERTY_WARNING = "warning";
  private Double warning;

  public static final String JSON_PROPERTY_WARNING_DISPLAY = "warning_display";
  private String warningDisplay;

  public SLOThreshold() {}

  @JsonCreator
  public SLOThreshold(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) Double target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEFRAME) SLOTimeframe timeframe) {
    this.target = target;
    this.timeframe = timeframe;
    this.unparsed |= !timeframe.isValid();
  }

  public SLOThreshold target(Double target) {
    this.target = target;
    return this;
  }

  /**
   * The target value for the service level indicator within the corresponding timeframe.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getTarget() {
    return target;
  }

  public void setTarget(Double target) {
    this.target = target;
  }

  public SLOThreshold targetDisplay(String targetDisplay) {
    this.targetDisplay = targetDisplay;
    return this;
  }

  /**
   * A string representation of the target that indicates its precision. It uses trailing zeros to
   * show significant decimal places (for example <code>98.00</code>).
   *
   * <p>Always included in service level objective responses. Ignored in create/update requests.
   *
   * @return targetDisplay
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTargetDisplay() {
    return targetDisplay;
  }

  public void setTargetDisplay(String targetDisplay) {
    this.targetDisplay = targetDisplay;
  }

  public SLOThreshold timeframe(SLOTimeframe timeframe) {
    this.timeframe = timeframe;
    this.unparsed |= !timeframe.isValid();
    return this;
  }

  /**
   * The SLO time window options.
   *
   * @return timeframe
   */
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOTimeframe getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(SLOTimeframe timeframe) {
    if (!timeframe.isValid()) {
      this.unparsed = true;
    }
    this.timeframe = timeframe;
  }

  public SLOThreshold warning(Double warning) {
    this.warning = warning;
    return this;
  }

  /**
   * The warning value for the service level objective.
   *
   * @return warning
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWarning() {
    return warning;
  }

  public void setWarning(Double warning) {
    this.warning = warning;
  }

  public SLOThreshold warningDisplay(String warningDisplay) {
    this.warningDisplay = warningDisplay;
    return this;
  }

  /**
   * A string representation of the warning target (see the description of the <code>target_display
   * </code> field for details).
   *
   * <p>Included in service level objective responses if a warning target exists. Ignored in
   * create/update requests.
   *
   * @return warningDisplay
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWarningDisplay() {
    return warningDisplay;
  }

  public void setWarningDisplay(String warningDisplay) {
    this.warningDisplay = warningDisplay;
  }

  /** Return true if this SLOThreshold object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOThreshold sloThreshold = (SLOThreshold) o;
    return Objects.equals(this.target, sloThreshold.target)
        && Objects.equals(this.targetDisplay, sloThreshold.targetDisplay)
        && Objects.equals(this.timeframe, sloThreshold.timeframe)
        && Objects.equals(this.warning, sloThreshold.warning)
        && Objects.equals(this.warningDisplay, sloThreshold.warningDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, targetDisplay, timeframe, warning, warningDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOThreshold {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetDisplay: ").append(toIndentedString(targetDisplay)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    warningDisplay: ").append(toIndentedString(warningDisplay)).append("\n");
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
