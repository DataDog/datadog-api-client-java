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

/** Markers allow you to add visual conditional formatting for your graphs. */
@JsonPropertyOrder({
  WidgetMarker.JSON_PROPERTY_DISPLAY_TYPE,
  WidgetMarker.JSON_PROPERTY_LABEL,
  WidgetMarker.JSON_PROPERTY_TIME,
  WidgetMarker.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetMarker {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_TYPE = "display_type";
  private String displayType;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public WidgetMarker() {}

  @JsonCreator
  public WidgetMarker(@JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.value = value;
  }

  public WidgetMarker displayType(String displayType) {
    this.displayType = displayType;
    return this;
  }

  /**
   * Combination of: - A severity error, warning, ok, or info - A line type: dashed, solid, or bold
   * In this case of a Distribution widget, this can be set to be <code>percentile</code>.
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

  public WidgetMarker label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Label to display over the marker.
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

  public WidgetMarker time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp for the widget.
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

  public WidgetMarker value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value to apply. Can be a single value y = 15 or a range of values 0 &lt; y &lt; 10. For
   * Distribution widgets with <code>display_type</code> set to <code>percentile</code>, this should
   * be a numeric percentile value (for example, "90" for P90).
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
   * @return WidgetMarker
   */
  @JsonAnySetter
  public WidgetMarker putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WidgetMarker object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetMarker widgetMarker = (WidgetMarker) o;
    return Objects.equals(this.displayType, widgetMarker.displayType)
        && Objects.equals(this.label, widgetMarker.label)
        && Objects.equals(this.time, widgetMarker.time)
        && Objects.equals(this.value, widgetMarker.value)
        && Objects.equals(this.additionalProperties, widgetMarker.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayType, label, time, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetMarker {\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
