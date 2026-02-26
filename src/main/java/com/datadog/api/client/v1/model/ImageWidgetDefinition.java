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
   * <p>The image widget allows you to embed an image on your dashboard. An image can be a PNG, JPG, or animated GIF. Only available on FREE layout dashboards.</p>
 */
@JsonPropertyOrder({
  ImageWidgetDefinition.JSON_PROPERTY_HAS_BACKGROUND,
  ImageWidgetDefinition.JSON_PROPERTY_HAS_BORDER,
  ImageWidgetDefinition.JSON_PROPERTY_HORIZONTAL_ALIGN,
  ImageWidgetDefinition.JSON_PROPERTY_MARGIN,
  ImageWidgetDefinition.JSON_PROPERTY_SIZING,
  ImageWidgetDefinition.JSON_PROPERTY_TYPE,
  ImageWidgetDefinition.JSON_PROPERTY_URL,
  ImageWidgetDefinition.JSON_PROPERTY_URL_DARK_THEME,
  ImageWidgetDefinition.JSON_PROPERTY_VERTICAL_ALIGN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ImageWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAS_BACKGROUND = "has_background";
  private Boolean hasBackground = true;

  public static final String JSON_PROPERTY_HAS_BORDER = "has_border";
  private Boolean hasBorder = true;

  public static final String JSON_PROPERTY_HORIZONTAL_ALIGN = "horizontal_align";
  private WidgetHorizontalAlign horizontalAlign;

  public static final String JSON_PROPERTY_MARGIN = "margin";
  private WidgetMargin margin;

  public static final String JSON_PROPERTY_SIZING = "sizing";
  private WidgetImageSizing sizing;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ImageWidgetDefinitionType type = ImageWidgetDefinitionType.IMAGE;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_URL_DARK_THEME = "url_dark_theme";
  private String urlDarkTheme;

  public static final String JSON_PROPERTY_VERTICAL_ALIGN = "vertical_align";
  private WidgetVerticalAlign verticalAlign;

  public ImageWidgetDefinition() {}

  @JsonCreator
  public ImageWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ImageWidgetDefinitionType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_URL)String url) {
        this.type = type;
        this.unparsed |= !type.isValid();
        this.url = url;
  }
  public ImageWidgetDefinition hasBackground(Boolean hasBackground) {
    this.hasBackground = hasBackground;
    return this;
  }

  /**
   * <p>Whether to display a background or not.</p>
   * @return hasBackground
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HAS_BACKGROUND)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getHasBackground() {
        return hasBackground;
      }
  public void setHasBackground(Boolean hasBackground) {
    this.hasBackground = hasBackground;
  }
  public ImageWidgetDefinition hasBorder(Boolean hasBorder) {
    this.hasBorder = hasBorder;
    return this;
  }

  /**
   * <p>Whether to display a border or not.</p>
   * @return hasBorder
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HAS_BORDER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getHasBorder() {
        return hasBorder;
      }
  public void setHasBorder(Boolean hasBorder) {
    this.hasBorder = hasBorder;
  }
  public ImageWidgetDefinition horizontalAlign(WidgetHorizontalAlign horizontalAlign) {
    this.horizontalAlign = horizontalAlign;
    this.unparsed |= !horizontalAlign.isValid();
    return this;
  }

  /**
   * <p>Horizontal alignment.</p>
   * @return horizontalAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HORIZONTAL_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetHorizontalAlign getHorizontalAlign() {
        return horizontalAlign;
      }
  public void setHorizontalAlign(WidgetHorizontalAlign horizontalAlign) {
    if (!horizontalAlign.isValid()) {
        this.unparsed = true;
    }
    this.horizontalAlign = horizontalAlign;
  }
  public ImageWidgetDefinition margin(WidgetMargin margin) {
    this.margin = margin;
    this.unparsed |= !margin.isValid();
    return this;
  }

  /**
   * <p>Size of the margins around the image.
   * <strong>Note</strong>: <code>small</code> and <code>large</code> values are deprecated.</p>
   * @return margin
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MARGIN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetMargin getMargin() {
        return margin;
      }
  public void setMargin(WidgetMargin margin) {
    if (!margin.isValid()) {
        this.unparsed = true;
    }
    this.margin = margin;
  }
  public ImageWidgetDefinition sizing(WidgetImageSizing sizing) {
    this.sizing = sizing;
    this.unparsed |= !sizing.isValid();
    return this;
  }

  /**
   * <p>How to size the image on the widget. The values are based on the image <code>object-fit</code> CSS properties.
   * <strong>Note</strong>: <code>zoom</code>, <code>fit</code> and <code>center</code> values are deprecated.</p>
   * @return sizing
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIZING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetImageSizing getSizing() {
        return sizing;
      }
  public void setSizing(WidgetImageSizing sizing) {
    if (!sizing.isValid()) {
        this.unparsed = true;
    }
    this.sizing = sizing;
  }
  public ImageWidgetDefinition type(ImageWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the image widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ImageWidgetDefinitionType getType() {
        return type;
      }
  public void setType(ImageWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public ImageWidgetDefinition url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>URL of the image.</p>
   * @return url
  **/
      @JsonProperty(JSON_PROPERTY_URL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUrl() {
        return url;
      }
  public void setUrl(String url) {
    this.url = url;
  }
  public ImageWidgetDefinition urlDarkTheme(String urlDarkTheme) {
    this.urlDarkTheme = urlDarkTheme;
    return this;
  }

  /**
   * <p>URL of the image in dark mode.</p>
   * @return urlDarkTheme
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_URL_DARK_THEME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUrlDarkTheme() {
        return urlDarkTheme;
      }
  public void setUrlDarkTheme(String urlDarkTheme) {
    this.urlDarkTheme = urlDarkTheme;
  }
  public ImageWidgetDefinition verticalAlign(WidgetVerticalAlign verticalAlign) {
    this.verticalAlign = verticalAlign;
    this.unparsed |= !verticalAlign.isValid();
    return this;
  }

  /**
   * <p>Vertical alignment.</p>
   * @return verticalAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERTICAL_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetVerticalAlign getVerticalAlign() {
        return verticalAlign;
      }
  public void setVerticalAlign(WidgetVerticalAlign verticalAlign) {
    if (!verticalAlign.isValid()) {
        this.unparsed = true;
    }
    this.verticalAlign = verticalAlign;
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
   * @return ImageWidgetDefinition
   */
  @JsonAnySetter
  public ImageWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this ImageWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageWidgetDefinition imageWidgetDefinition = (ImageWidgetDefinition) o;
    return Objects.equals(this.hasBackground, imageWidgetDefinition.hasBackground) && Objects.equals(this.hasBorder, imageWidgetDefinition.hasBorder) && Objects.equals(this.horizontalAlign, imageWidgetDefinition.horizontalAlign) && Objects.equals(this.margin, imageWidgetDefinition.margin) && Objects.equals(this.sizing, imageWidgetDefinition.sizing) && Objects.equals(this.type, imageWidgetDefinition.type) && Objects.equals(this.url, imageWidgetDefinition.url) && Objects.equals(this.urlDarkTheme, imageWidgetDefinition.urlDarkTheme) && Objects.equals(this.verticalAlign, imageWidgetDefinition.verticalAlign) && Objects.equals(this.additionalProperties, imageWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(hasBackground,hasBorder,horizontalAlign,margin,sizing,type,url,urlDarkTheme,verticalAlign, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageWidgetDefinition {\n");
    sb.append("    hasBackground: ").append(toIndentedString(hasBackground)).append("\n");
    sb.append("    hasBorder: ").append(toIndentedString(hasBorder)).append("\n");
    sb.append("    horizontalAlign: ").append(toIndentedString(horizontalAlign)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    sizing: ").append(toIndentedString(sizing)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlDarkTheme: ").append(toIndentedString(urlDarkTheme)).append("\n");
    sb.append("    verticalAlign: ").append(toIndentedString(verticalAlign)).append("\n");
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
