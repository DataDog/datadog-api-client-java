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
   * <p>Define a conditional format for the widget.</p>
 */
@JsonPropertyOrder({
  WidgetConditionalFormat.JSON_PROPERTY_COMPARATOR,
  WidgetConditionalFormat.JSON_PROPERTY_CUSTOM_BG_COLOR,
  WidgetConditionalFormat.JSON_PROPERTY_CUSTOM_FG_COLOR,
  WidgetConditionalFormat.JSON_PROPERTY_HIDE_VALUE,
  WidgetConditionalFormat.JSON_PROPERTY_IMAGE_URL,
  WidgetConditionalFormat.JSON_PROPERTY_METRIC,
  WidgetConditionalFormat.JSON_PROPERTY_PALETTE,
  WidgetConditionalFormat.JSON_PROPERTY_TIMEFRAME,
  WidgetConditionalFormat.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetConditionalFormat {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPARATOR = "comparator";
  private WidgetComparator comparator;

  public static final String JSON_PROPERTY_CUSTOM_BG_COLOR = "custom_bg_color";
  private String customBgColor;

  public static final String JSON_PROPERTY_CUSTOM_FG_COLOR = "custom_fg_color";
  private String customFgColor;

  public static final String JSON_PROPERTY_HIDE_VALUE = "hide_value";
  private Boolean hideValue;

  public static final String JSON_PROPERTY_IMAGE_URL = "image_url";
  private String imageUrl;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private WidgetPalette palette;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private String timeframe;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public WidgetConditionalFormat() {}

  @JsonCreator
  public WidgetConditionalFormat(
            @JsonProperty(required=true, value=JSON_PROPERTY_COMPARATOR)WidgetComparator comparator,
            @JsonProperty(required=true, value=JSON_PROPERTY_PALETTE)WidgetPalette palette,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)Double value) {
        this.comparator = comparator;
        this.unparsed |= !comparator.isValid();
        this.palette = palette;
        this.unparsed |= !palette.isValid();
        this.value = value;
  }
  public WidgetConditionalFormat comparator(WidgetComparator comparator) {
    this.comparator = comparator;
    this.unparsed |= !comparator.isValid();
    return this;
  }

  /**
   * <p>Comparator to apply.</p>
   * @return comparator
  **/
      @JsonProperty(JSON_PROPERTY_COMPARATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public WidgetComparator getComparator() {
        return comparator;
      }
  public void setComparator(WidgetComparator comparator) {
    if (!comparator.isValid()) {
        this.unparsed = true;
    }
    this.comparator = comparator;
  }
  public WidgetConditionalFormat customBgColor(String customBgColor) {
    this.customBgColor = customBgColor;
    return this;
  }

  /**
   * <p>Color palette to apply to the background, same values available as palette.</p>
   * @return customBgColor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_BG_COLOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomBgColor() {
        return customBgColor;
      }
  public void setCustomBgColor(String customBgColor) {
    this.customBgColor = customBgColor;
  }
  public WidgetConditionalFormat customFgColor(String customFgColor) {
    this.customFgColor = customFgColor;
    return this;
  }

  /**
   * <p>Color palette to apply to the foreground, same values available as palette.</p>
   * @return customFgColor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_FG_COLOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomFgColor() {
        return customFgColor;
      }
  public void setCustomFgColor(String customFgColor) {
    this.customFgColor = customFgColor;
  }
  public WidgetConditionalFormat hideValue(Boolean hideValue) {
    this.hideValue = hideValue;
    return this;
  }

  /**
   * <p>True hides values.</p>
   * @return hideValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HIDE_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getHideValue() {
        return hideValue;
      }
  public void setHideValue(Boolean hideValue) {
    this.hideValue = hideValue;
  }
  public WidgetConditionalFormat imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * <p>Displays an image as the background.</p>
   * @return imageUrl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IMAGE_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getImageUrl() {
        return imageUrl;
      }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
  public WidgetConditionalFormat metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * <p>Metric from the request to correlate this conditional format with.</p>
   * @return metric
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METRIC)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMetric() {
        return metric;
      }
  public void setMetric(String metric) {
    this.metric = metric;
  }
  public WidgetConditionalFormat palette(WidgetPalette palette) {
    this.palette = palette;
    this.unparsed |= !palette.isValid();
    return this;
  }

  /**
   * <p>Color palette to apply.</p>
   * @return palette
  **/
      @JsonProperty(JSON_PROPERTY_PALETTE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public WidgetPalette getPalette() {
        return palette;
      }
  public void setPalette(WidgetPalette palette) {
    if (!palette.isValid()) {
        this.unparsed = true;
    }
    this.palette = palette;
  }
  public WidgetConditionalFormat timeframe(String timeframe) {
    this.timeframe = timeframe;
    return this;
  }

  /**
   * <p>Defines the displayed timeframe.</p>
   * @return timeframe
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEFRAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTimeframe() {
        return timeframe;
      }
  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }
  public WidgetConditionalFormat value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Value for the comparator.</p>
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getValue() {
        return value;
      }
  public void setValue(Double value) {
    this.value = value;
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
   * @return WidgetConditionalFormat
   */
  @JsonAnySetter
  public WidgetConditionalFormat putAdditionalProperty(String key, Object value) {
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
   * Return true if this WidgetConditionalFormat object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetConditionalFormat widgetConditionalFormat = (WidgetConditionalFormat) o;
    return Objects.equals(this.comparator, widgetConditionalFormat.comparator) && Objects.equals(this.customBgColor, widgetConditionalFormat.customBgColor) && Objects.equals(this.customFgColor, widgetConditionalFormat.customFgColor) && Objects.equals(this.hideValue, widgetConditionalFormat.hideValue) && Objects.equals(this.imageUrl, widgetConditionalFormat.imageUrl) && Objects.equals(this.metric, widgetConditionalFormat.metric) && Objects.equals(this.palette, widgetConditionalFormat.palette) && Objects.equals(this.timeframe, widgetConditionalFormat.timeframe) && Objects.equals(this.value, widgetConditionalFormat.value) && Objects.equals(this.additionalProperties, widgetConditionalFormat.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(comparator,customBgColor,customFgColor,hideValue,imageUrl,metric,palette,timeframe,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetConditionalFormat {\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
    sb.append("    customBgColor: ").append(toIndentedString(customBgColor)).append("\n");
    sb.append("    customFgColor: ").append(toIndentedString(customFgColor)).append("\n");
    sb.append("    hideValue: ").append(toIndentedString(hideValue)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
