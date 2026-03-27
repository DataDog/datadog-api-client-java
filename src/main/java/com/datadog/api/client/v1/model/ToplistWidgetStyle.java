/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Style customization for a top list widget. */
@JsonPropertyOrder({
  ToplistWidgetStyle.JSON_PROPERTY_DISPLAY,
  ToplistWidgetStyle.JSON_PROPERTY_PALETTE,
  ToplistWidgetStyle.JSON_PROPERTY_SCALING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistWidgetStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY = "display";
  private ToplistWidgetDisplay display;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_SCALING = "scaling";
  private ToplistWidgetScaling scaling;

  public ToplistWidgetStyle display(ToplistWidgetDisplay display) {
    this.display = display;
    this.unparsed |= display.unparsed;
    return this;
  }

  /**
   * Top list widget display options.
   *
   * @return display
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ToplistWidgetDisplay getDisplay() {
    return display;
  }

  public void setDisplay(ToplistWidgetDisplay display) {
    this.display = display;
  }

  public ToplistWidgetStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * Color palette to apply to the widget.
   *
   * @return palette
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPalette() {
    return palette;
  }

  public void setPalette(String palette) {
    this.palette = palette;
  }

  public ToplistWidgetStyle scaling(ToplistWidgetScaling scaling) {
    this.scaling = scaling;
    this.unparsed |= !scaling.isValid();
    return this;
  }

  /**
   * Top list widget scaling definition.
   *
   * @return scaling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ToplistWidgetScaling getScaling() {
    return scaling;
  }

  public void setScaling(ToplistWidgetScaling scaling) {
    if (!scaling.isValid()) {
      this.unparsed = true;
    }
    this.scaling = scaling;
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
   * @return ToplistWidgetStyle
   */
  @JsonAnySetter
  public ToplistWidgetStyle putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ToplistWidgetStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistWidgetStyle toplistWidgetStyle = (ToplistWidgetStyle) o;
    return Objects.equals(this.display, toplistWidgetStyle.display)
        && Objects.equals(this.palette, toplistWidgetStyle.palette)
        && Objects.equals(this.scaling, toplistWidgetStyle.scaling)
        && Objects.equals(this.additionalProperties, toplistWidgetStyle.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, palette, scaling, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistWidgetStyle {\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    scaling: ").append(toIndentedString(scaling)).append("\n");
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
