/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The style to apply to the widget.</p>
 */
@JsonPropertyOrder({
  HostMapWidgetDefinitionStyle.JSON_PROPERTY_FILL_MAX,
  HostMapWidgetDefinitionStyle.JSON_PROPERTY_FILL_MIN,
  HostMapWidgetDefinitionStyle.JSON_PROPERTY_PALETTE,
  HostMapWidgetDefinitionStyle.JSON_PROPERTY_PALETTE_FLIP
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMapWidgetDefinitionStyle {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILL_MAX = "fill_max";
  private String fillMax;

  public static final String JSON_PROPERTY_FILL_MIN = "fill_min";
  private String fillMin;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_PALETTE_FLIP = "palette_flip";
  private Boolean paletteFlip;

  public HostMapWidgetDefinitionStyle fillMax(String fillMax) {
    this.fillMax = fillMax;
    return this;
  }

  /**
   * <p>Max value to use to color the map.</p>
   * @return fillMax
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILL_MAX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFillMax() {
        return fillMax;
      }
  public void setFillMax(String fillMax) {
    this.fillMax = fillMax;
  }
  public HostMapWidgetDefinitionStyle fillMin(String fillMin) {
    this.fillMin = fillMin;
    return this;
  }

  /**
   * <p>Min value to use to color the map.</p>
   * @return fillMin
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILL_MIN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFillMin() {
        return fillMin;
      }
  public void setFillMin(String fillMin) {
    this.fillMin = fillMin;
  }
  public HostMapWidgetDefinitionStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * <p>Color palette to apply to the widget.</p>
   * @return palette
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PALETTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPalette() {
        return palette;
      }
  public void setPalette(String palette) {
    this.palette = palette;
  }
  public HostMapWidgetDefinitionStyle paletteFlip(Boolean paletteFlip) {
    this.paletteFlip = paletteFlip;
    return this;
  }

  /**
   * <p>Whether to flip the palette tones.</p>
   * @return paletteFlip
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PALETTE_FLIP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getPaletteFlip() {
        return paletteFlip;
      }
  public void setPaletteFlip(Boolean paletteFlip) {
    this.paletteFlip = paletteFlip;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return HostMapWidgetDefinitionStyle
   */
  @JsonAnySetter
  public HostMapWidgetDefinitionStyle putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this HostMapWidgetDefinitionStyle object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMapWidgetDefinitionStyle hostMapWidgetDefinitionStyle = (HostMapWidgetDefinitionStyle) o;
    return Objects.equals(this.fillMax, hostMapWidgetDefinitionStyle.fillMax) && Objects.equals(this.fillMin, hostMapWidgetDefinitionStyle.fillMin) && Objects.equals(this.palette, hostMapWidgetDefinitionStyle.palette) && Objects.equals(this.paletteFlip, hostMapWidgetDefinitionStyle.paletteFlip) && Objects.equals(this.additionalProperties, hostMapWidgetDefinitionStyle.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(fillMax,fillMin,palette,paletteFlip, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMapWidgetDefinitionStyle {\n");
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
