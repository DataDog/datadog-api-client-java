/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Used for arbitrary live span times, such as 17 minutes or 6 hours. */
@JsonPropertyOrder({
  WidgetNewLiveSpan.JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA,
  WidgetNewLiveSpan.JSON_PROPERTY_TYPE,
  WidgetNewLiveSpan.JSON_PROPERTY_UNIT,
  WidgetNewLiveSpan.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetNewLiveSpan {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA = "hide_incomplete_cost_data";
  private Boolean hideIncompleteCostData;

  public static final String JSON_PROPERTY_TYPE = "type";
  private WidgetNewLiveSpanType type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private WidgetLiveSpanUnit unit;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public WidgetNewLiveSpan() {}

  @JsonCreator
  public WidgetNewLiveSpan(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) WidgetNewLiveSpanType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT) WidgetLiveSpanUnit unit,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Long value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.unit = unit;
    this.unparsed |= !unit.isValid();
    this.value = value;
  }

  public WidgetNewLiveSpan hideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
    return this;
  }

  /**
   * Whether to hide incomplete cost data in the widget.
   *
   * @return hideIncompleteCostData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideIncompleteCostData() {
    return hideIncompleteCostData;
  }

  public void setHideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
  }

  public WidgetNewLiveSpan type(WidgetNewLiveSpanType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type "live" denotes a live span in the new format.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WidgetNewLiveSpanType getType() {
    return type;
  }

  public void setType(WidgetNewLiveSpanType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public WidgetNewLiveSpan unit(WidgetLiveSpanUnit unit) {
    this.unit = unit;
    this.unparsed |= !unit.isValid();
    return this;
  }

  /**
   * Unit of the time span.
   *
   * @return unit
   */
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WidgetLiveSpanUnit getUnit() {
    return unit;
  }

  public void setUnit(WidgetLiveSpanUnit unit) {
    if (!unit.isValid()) {
      this.unparsed = true;
    }
    this.unit = unit;
  }

  public WidgetNewLiveSpan value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the time span. minimum: 1
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return WidgetNewLiveSpan
   */
  @JsonAnySetter
  public WidgetNewLiveSpan putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this WidgetNewLiveSpan object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetNewLiveSpan widgetNewLiveSpan = (WidgetNewLiveSpan) o;
    return Objects.equals(this.hideIncompleteCostData, widgetNewLiveSpan.hideIncompleteCostData)
        && Objects.equals(this.type, widgetNewLiveSpan.type)
        && Objects.equals(this.unit, widgetNewLiveSpan.unit)
        && Objects.equals(this.value, widgetNewLiveSpan.value)
        && Objects.equals(this.additionalProperties, widgetNewLiveSpan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideIncompleteCostData, type, unit, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetNewLiveSpan {\n");
    sb.append("    hideIncompleteCostData: ")
        .append(toIndentedString(hideIncompleteCostData))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
