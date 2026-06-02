/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Attributes of a widget recovered from an image watermark. */
@JsonPropertyOrder({
  StegadographyWidgetAttributes.JSON_PROPERTY_LOCATIONX,
  StegadographyWidgetAttributes.JSON_PROPERTY_LOCATIONY,
  StegadographyWidgetAttributes.JSON_PROPERTY_RAW_DATA,
  StegadographyWidgetAttributes.JSON_PROPERTY_WATERMARK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StegadographyWidgetAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOCATIONX = "locationx";
  private Long locationx;

  public static final String JSON_PROPERTY_LOCATIONY = "locationy";
  private Long locationy;

  public static final String JSON_PROPERTY_RAW_DATA = "rawData";
  private String rawData;

  public static final String JSON_PROPERTY_WATERMARK = "watermark";
  private String watermark;

  public StegadographyWidgetAttributes() {}

  @JsonCreator
  public StegadographyWidgetAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_LOCATIONX) Long locationx,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOCATIONY) Long locationy,
      @JsonProperty(required = true, value = JSON_PROPERTY_RAW_DATA) String rawData,
      @JsonProperty(required = true, value = JSON_PROPERTY_WATERMARK) String watermark) {
    this.locationx = locationx;
    this.locationy = locationy;
    this.rawData = rawData;
    this.watermark = watermark;
  }

  public StegadographyWidgetAttributes locationx(Long locationx) {
    this.locationx = locationx;
    return this;
  }

  /**
   * Horizontal pixel coordinate of the watermark within the image.
   *
   * @return locationx
   */
  @JsonProperty(JSON_PROPERTY_LOCATIONX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLocationx() {
    return locationx;
  }

  public void setLocationx(Long locationx) {
    this.locationx = locationx;
  }

  public StegadographyWidgetAttributes locationy(Long locationy) {
    this.locationy = locationy;
    return this;
  }

  /**
   * Vertical pixel coordinate of the watermark within the image.
   *
   * @return locationy
   */
  @JsonProperty(JSON_PROPERTY_LOCATIONY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLocationy() {
    return locationy;
  }

  public void setLocationy(Long locationy) {
    this.locationy = locationy;
  }

  public StegadographyWidgetAttributes rawData(String rawData) {
    this.rawData = rawData;
    return this;
  }

  /**
   * Stored snapshot of the widget state, returned exactly as it was cached.
   *
   * @return rawData
   */
  @JsonProperty(JSON_PROPERTY_RAW_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRawData() {
    return rawData;
  }

  public void setRawData(String rawData) {
    this.rawData = rawData;
  }

  public StegadographyWidgetAttributes watermark(String watermark) {
    this.watermark = watermark;
    return this;
  }

  /**
   * The watermark value extracted from the image that this widget was matched against.
   *
   * @return watermark
   */
  @JsonProperty(JSON_PROPERTY_WATERMARK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWatermark() {
    return watermark;
  }

  public void setWatermark(String watermark) {
    this.watermark = watermark;
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
   * @return StegadographyWidgetAttributes
   */
  @JsonAnySetter
  public StegadographyWidgetAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this StegadographyWidgetAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StegadographyWidgetAttributes stegadographyWidgetAttributes = (StegadographyWidgetAttributes) o;
    return Objects.equals(this.locationx, stegadographyWidgetAttributes.locationx)
        && Objects.equals(this.locationy, stegadographyWidgetAttributes.locationy)
        && Objects.equals(this.rawData, stegadographyWidgetAttributes.rawData)
        && Objects.equals(this.watermark, stegadographyWidgetAttributes.watermark)
        && Objects.equals(
            this.additionalProperties, stegadographyWidgetAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationx, locationy, rawData, watermark, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StegadographyWidgetAttributes {\n");
    sb.append("    locationx: ").append(toIndentedString(locationx)).append("\n");
    sb.append("    locationy: ").append(toIndentedString(locationy)).append("\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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
