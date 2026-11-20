/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ImageBackendDefinition.JSON_PROPERTY_CAPTION,
  ImageBackendDefinition.JSON_PROPERTY_HAS_BACKGROUND,
  ImageBackendDefinition.JSON_PROPERTY_HAS_BORDER,
  ImageBackendDefinition.JSON_PROPERTY_HORIZONTAL_ALIGN,
  ImageBackendDefinition.JSON_PROPERTY_MARGIN,
  ImageBackendDefinition.JSON_PROPERTY_SIZING,
  ImageBackendDefinition.JSON_PROPERTY_TYPE,
  ImageBackendDefinition.JSON_PROPERTY_URL,
  ImageBackendDefinition.JSON_PROPERTY_URL_DARK_THEME,
  ImageBackendDefinition.JSON_PROPERTY_VERTICAL_ALIGN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ImageBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CAPTION = "caption";
  private String caption;

  public static final String JSON_PROPERTY_HAS_BACKGROUND = "has_background";
  private Boolean hasBackground;

  public static final String JSON_PROPERTY_HAS_BORDER = "has_border";
  private Boolean hasBorder;

  public static final String JSON_PROPERTY_HORIZONTAL_ALIGN = "horizontal_align";
  private ImageBackendDefinitionHorizontalAlign horizontalAlign;

  public static final String JSON_PROPERTY_MARGIN = "margin";
  private ImageMargin margin;

  public static final String JSON_PROPERTY_SIZING = "sizing";
  private ImageBackendDefinition20270101Sizing sizing;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ImageBackendDefinitionType type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_URL_DARK_THEME = "url_dark_theme";
  private String urlDarkTheme;

  public static final String JSON_PROPERTY_VERTICAL_ALIGN = "vertical_align";
  private ImageBackendDefinitionVerticalAlign verticalAlign;

  public ImageBackendDefinition() {}

  @JsonCreator
  public ImageBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ImageBackendDefinitionType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.url = url;
  }

  public ImageBackendDefinition caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return caption
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public ImageBackendDefinition hasBackground(Boolean hasBackground) {
    this.hasBackground = hasBackground;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hasBackground
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_BACKGROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasBackground() {
    return hasBackground;
  }

  public void setHasBackground(Boolean hasBackground) {
    this.hasBackground = hasBackground;
  }

  public ImageBackendDefinition hasBorder(Boolean hasBorder) {
    this.hasBorder = hasBorder;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hasBorder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_BORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasBorder() {
    return hasBorder;
  }

  public void setHasBorder(Boolean hasBorder) {
    this.hasBorder = hasBorder;
  }

  public ImageBackendDefinition horizontalAlign(
      ImageBackendDefinitionHorizontalAlign horizontalAlign) {
    this.horizontalAlign = horizontalAlign;
    this.unparsed |= !horizontalAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return horizontalAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HORIZONTAL_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ImageBackendDefinitionHorizontalAlign getHorizontalAlign() {
    return horizontalAlign;
  }

  public void setHorizontalAlign(ImageBackendDefinitionHorizontalAlign horizontalAlign) {
    if (!horizontalAlign.isValid()) {
      this.unparsed = true;
    }
    this.horizontalAlign = horizontalAlign;
  }

  public ImageBackendDefinition margin(ImageMargin margin) {
    this.margin = margin;
    this.unparsed |= !margin.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return margin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ImageMargin getMargin() {
    return margin;
  }

  public void setMargin(ImageMargin margin) {
    if (!margin.isValid()) {
      this.unparsed = true;
    }
    this.margin = margin;
  }

  public ImageBackendDefinition sizing(ImageBackendDefinition20270101Sizing sizing) {
    this.sizing = sizing;
    this.unparsed |= sizing.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sizing
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ImageBackendDefinition20270101Sizing getSizing() {
    return sizing;
  }

  public void setSizing(ImageBackendDefinition20270101Sizing sizing) {
    this.sizing = sizing;
    if (sizing != null) {
      this.unparsed |= sizing.unparsed;
    }
  }

  public ImageBackendDefinition type(ImageBackendDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ImageBackendDefinitionType getType() {
    return type;
  }

  public void setType(ImageBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ImageBackendDefinition url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return url
   */
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ImageBackendDefinition urlDarkTheme(String urlDarkTheme) {
    this.urlDarkTheme = urlDarkTheme;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return urlDarkTheme
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_DARK_THEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrlDarkTheme() {
    return urlDarkTheme;
  }

  public void setUrlDarkTheme(String urlDarkTheme) {
    this.urlDarkTheme = urlDarkTheme;
  }

  public ImageBackendDefinition verticalAlign(ImageBackendDefinitionVerticalAlign verticalAlign) {
    this.verticalAlign = verticalAlign;
    this.unparsed |= !verticalAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return verticalAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERTICAL_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ImageBackendDefinitionVerticalAlign getVerticalAlign() {
    return verticalAlign;
  }

  public void setVerticalAlign(ImageBackendDefinitionVerticalAlign verticalAlign) {
    if (!verticalAlign.isValid()) {
      this.unparsed = true;
    }
    this.verticalAlign = verticalAlign;
  }

  /** Return true if this ImageBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageBackendDefinition imageBackendDefinition = (ImageBackendDefinition) o;
    return Objects.equals(this.caption, imageBackendDefinition.caption)
        && Objects.equals(this.hasBackground, imageBackendDefinition.hasBackground)
        && Objects.equals(this.hasBorder, imageBackendDefinition.hasBorder)
        && Objects.equals(this.horizontalAlign, imageBackendDefinition.horizontalAlign)
        && Objects.equals(this.margin, imageBackendDefinition.margin)
        && Objects.equals(this.sizing, imageBackendDefinition.sizing)
        && Objects.equals(this.type, imageBackendDefinition.type)
        && Objects.equals(this.url, imageBackendDefinition.url)
        && Objects.equals(this.urlDarkTheme, imageBackendDefinition.urlDarkTheme)
        && Objects.equals(this.verticalAlign, imageBackendDefinition.verticalAlign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        caption,
        hasBackground,
        hasBorder,
        horizontalAlign,
        margin,
        sizing,
        type,
        url,
        urlDarkTheme,
        verticalAlign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageBackendDefinition {\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    hasBackground: ").append(toIndentedString(hasBackground)).append("\n");
    sb.append("    hasBorder: ").append(toIndentedString(hasBorder)).append("\n");
    sb.append("    horizontalAlign: ").append(toIndentedString(horizontalAlign)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    sizing: ").append(toIndentedString(sizing)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlDarkTheme: ").append(toIndentedString(urlDarkTheme)).append("\n");
    sb.append("    verticalAlign: ").append(toIndentedString(verticalAlign)).append("\n");
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
