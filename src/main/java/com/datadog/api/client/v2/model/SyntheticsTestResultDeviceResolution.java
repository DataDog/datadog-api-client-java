/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Screen resolution of the device used to run the test. */
@JsonPropertyOrder({
  SyntheticsTestResultDeviceResolution.JSON_PROPERTY_HEIGHT,
  SyntheticsTestResultDeviceResolution.JSON_PROPERTY_PIXEL_RATIO,
  SyntheticsTestResultDeviceResolution.JSON_PROPERTY_WIDTH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultDeviceResolution {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_PIXEL_RATIO = "pixel_ratio";
  private Double pixelRatio;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public SyntheticsTestResultDeviceResolution height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Viewport height in pixels.
   *
   * @return height
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public SyntheticsTestResultDeviceResolution pixelRatio(Double pixelRatio) {
    this.pixelRatio = pixelRatio;
    return this;
  }

  /**
   * Device pixel ratio.
   *
   * @return pixelRatio
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIXEL_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPixelRatio() {
    return pixelRatio;
  }

  public void setPixelRatio(Double pixelRatio) {
    this.pixelRatio = pixelRatio;
  }

  public SyntheticsTestResultDeviceResolution width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Viewport width in pixels.
   *
   * @return width
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
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
   * @return SyntheticsTestResultDeviceResolution
   */
  @JsonAnySetter
  public SyntheticsTestResultDeviceResolution putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultDeviceResolution object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultDeviceResolution syntheticsTestResultDeviceResolution =
        (SyntheticsTestResultDeviceResolution) o;
    return Objects.equals(this.height, syntheticsTestResultDeviceResolution.height)
        && Objects.equals(this.pixelRatio, syntheticsTestResultDeviceResolution.pixelRatio)
        && Objects.equals(this.width, syntheticsTestResultDeviceResolution.width)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultDeviceResolution.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, pixelRatio, width, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultDeviceResolution {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    pixelRatio: ").append(toIndentedString(pixelRatio)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
