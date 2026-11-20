/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  Marker.JSON_PROPERTY_DISPLAY_TYPE,
  Marker.JSON_PROPERTY_FROM_TS,
  Marker.JSON_PROPERTY_IS_HOVERED,
  Marker.JSON_PROPERTY_LABEL,
  Marker.JSON_PROPERTY_MAX,
  Marker.JSON_PROPERTY_MIN,
  Marker.JSON_PROPERTY_ON_RIGHT_YAXIS,
  Marker.JSON_PROPERTY_TIME,
  Marker.JSON_PROPERTY_TO_TS,
  Marker.JSON_PROPERTY_TS,
  Marker.JSON_PROPERTY_TYPE,
  Marker.JSON_PROPERTY_VAL,
  Marker.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Marker {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_TYPE = "display_type";
  private String displayType;

  public static final String JSON_PROPERTY_FROM_TS = "from_ts";
  private String fromTs;

  public static final String JSON_PROPERTY_IS_HOVERED = "is_hovered";
  private Boolean isHovered;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_MAX = "max";
  private Double max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Double min;

  public static final String JSON_PROPERTY_ON_RIGHT_YAXIS = "on_right_yaxis";
  private Boolean onRightYaxis;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_TO_TS = "to_ts";
  private String toTs;

  public static final String JSON_PROPERTY_TS = "ts";
  private String ts;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VAL = "val";
  private Double val;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public Marker displayType(String displayType) {
    this.displayType = displayType;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return displayType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayType() {
    return displayType;
  }

  public void setDisplayType(String displayType) {
    this.displayType = displayType;
  }

  public Marker fromTs(String fromTs) {
    this.fromTs = fromTs;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return fromTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFromTs() {
    return fromTs;
  }

  public void setFromTs(String fromTs) {
    this.fromTs = fromTs;
  }

  public Marker isHovered(Boolean isHovered) {
    this.isHovered = isHovered;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return isHovered
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_HOVERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsHovered() {
    return isHovered;
  }

  public void setIsHovered(Boolean isHovered) {
    this.isHovered = isHovered;
  }

  public Marker label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return label
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Marker max(Double max) {
    this.max = max;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return max
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public Marker min(Double min) {
    this.min = min;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return min
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }

  public Marker onRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return onRightYaxis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_RIGHT_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOnRightYaxis() {
    return onRightYaxis;
  }

  public void setOnRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
  }

  public Marker time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Marker toTs(String toTs) {
    this.toTs = toTs;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return toTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToTs() {
    return toTs;
  }

  public void setToTs(String toTs) {
    this.toTs = toTs;
  }

  public Marker ts(String ts) {
    this.ts = ts;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return ts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTs() {
    return ts;
  }

  public void setTs(String ts) {
    this.ts = ts;
  }

  public Marker type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Marker val(Double val) {
    this.val = val;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return val
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getVal() {
    return val;
  }

  public void setVal(Double val) {
    this.val = val;
  }

  public Marker value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this Marker object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Marker marker = (Marker) o;
    return Objects.equals(this.displayType, marker.displayType)
        && Objects.equals(this.fromTs, marker.fromTs)
        && Objects.equals(this.isHovered, marker.isHovered)
        && Objects.equals(this.label, marker.label)
        && Objects.equals(this.max, marker.max)
        && Objects.equals(this.min, marker.min)
        && Objects.equals(this.onRightYaxis, marker.onRightYaxis)
        && Objects.equals(this.time, marker.time)
        && Objects.equals(this.toTs, marker.toTs)
        && Objects.equals(this.ts, marker.ts)
        && Objects.equals(this.type, marker.type)
        && Objects.equals(this.val, marker.val)
        && Objects.equals(this.value, marker.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        displayType,
        fromTs,
        isHovered,
        label,
        max,
        min,
        onRightYaxis,
        time,
        toTs,
        ts,
        type,
        val,
        value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Marker {\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    isHovered: ").append(toIndentedString(isHovered)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    onRightYaxis: ").append(toIndentedString(onRightYaxis)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
