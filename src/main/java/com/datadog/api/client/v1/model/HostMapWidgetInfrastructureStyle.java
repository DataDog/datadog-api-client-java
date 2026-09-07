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

/** Style configuration for the infrastructure host map. */
@JsonPropertyOrder({
  HostMapWidgetInfrastructureStyle.JSON_PROPERTY_FILL_MAX,
  HostMapWidgetInfrastructureStyle.JSON_PROPERTY_FILL_MIN,
  HostMapWidgetInfrastructureStyle.JSON_PROPERTY_PALETTE,
  HostMapWidgetInfrastructureStyle.JSON_PROPERTY_PALETTE_FLIP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMapWidgetInfrastructureStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILL_MAX = "fill_max";
  private Double fillMax;

  public static final String JSON_PROPERTY_FILL_MIN = "fill_min";
  private Double fillMin;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_PALETTE_FLIP = "palette_flip";
  private Boolean paletteFlip;

  public HostMapWidgetInfrastructureStyle fillMax(Double fillMax) {
    this.fillMax = fillMax;
    return this;
  }

  /**
   * Maximum value for the fill color scale. Omit to use automatic scaling.
   *
   * @return fillMax
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFillMax() {
    return fillMax;
  }

  public void setFillMax(Double fillMax) {
    this.fillMax = fillMax;
  }

  public HostMapWidgetInfrastructureStyle fillMin(Double fillMin) {
    this.fillMin = fillMin;
    return this;
  }

  /**
   * Minimum value for the fill color scale. Omit to use automatic scaling.
   *
   * @return fillMin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFillMin() {
    return fillMin;
  }

  public void setFillMin(Double fillMin) {
    this.fillMin = fillMin;
  }

  public HostMapWidgetInfrastructureStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * Color palette name or alias.
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

  public HostMapWidgetInfrastructureStyle paletteFlip(Boolean paletteFlip) {
    this.paletteFlip = paletteFlip;
    return this;
  }

  /**
   * Whether to invert the color palette.
   *
   * @return paletteFlip
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE_FLIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPaletteFlip() {
    return paletteFlip;
  }

  public void setPaletteFlip(Boolean paletteFlip) {
    this.paletteFlip = paletteFlip;
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
   * @return HostMapWidgetInfrastructureStyle
   */
  @JsonAnySetter
  public HostMapWidgetInfrastructureStyle putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HostMapWidgetInfrastructureStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMapWidgetInfrastructureStyle hostMapWidgetInfrastructureStyle =
        (HostMapWidgetInfrastructureStyle) o;
    return Objects.equals(this.fillMax, hostMapWidgetInfrastructureStyle.fillMax)
        && Objects.equals(this.fillMin, hostMapWidgetInfrastructureStyle.fillMin)
        && Objects.equals(this.palette, hostMapWidgetInfrastructureStyle.palette)
        && Objects.equals(this.paletteFlip, hostMapWidgetInfrastructureStyle.paletteFlip)
        && Objects.equals(
            this.additionalProperties, hostMapWidgetInfrastructureStyle.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillMax, fillMin, palette, paletteFlip, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMapWidgetInfrastructureStyle {\n");
    sb.append("    fillMax: ").append(toIndentedString(fillMax)).append("\n");
    sb.append("    fillMin: ").append(toIndentedString(fillMin)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    paletteFlip: ").append(toIndentedString(paletteFlip)).append("\n");
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
