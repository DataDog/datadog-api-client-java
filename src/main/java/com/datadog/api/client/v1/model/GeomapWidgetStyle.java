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

/** The style for the points coming from this request. */
@JsonPropertyOrder({
  GeomapWidgetStyle.JSON_PROPERTY_COLOR_BY,
  GeomapWidgetStyle.JSON_PROPERTY_PALETTE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapWidgetStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_BY = "color_by";
  private String colorBy;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public GeomapWidgetStyle colorBy(String colorBy) {
    this.colorBy = colorBy;
    return this;
  }

  /**
   * Field used for coloring the points based on a value.
   *
   * @return colorBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColorBy() {
    return colorBy;
  }

  public void setColorBy(String colorBy) {
    this.colorBy = colorBy;
  }

  public GeomapWidgetStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * Defines the color of all the points for this request.
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
   * @return GeomapWidgetStyle
   */
  @JsonAnySetter
  public GeomapWidgetStyle putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GeomapWidgetStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapWidgetStyle geomapWidgetStyle = (GeomapWidgetStyle) o;
    return Objects.equals(this.colorBy, geomapWidgetStyle.colorBy)
        && Objects.equals(this.palette, geomapWidgetStyle.palette)
        && Objects.equals(this.additionalProperties, geomapWidgetStyle.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorBy, palette, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapWidgetStyle {\n");
    sb.append("    colorBy: ").append(toIndentedString(colorBy)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
