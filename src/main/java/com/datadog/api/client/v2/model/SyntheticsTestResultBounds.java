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

/** Bounding box of an element on the page. */
@JsonPropertyOrder({
  SyntheticsTestResultBounds.JSON_PROPERTY_HEIGHT,
  SyntheticsTestResultBounds.JSON_PROPERTY_WIDTH,
  SyntheticsTestResultBounds.JSON_PROPERTY_X,
  SyntheticsTestResultBounds.JSON_PROPERTY_Y
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultBounds {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public static final String JSON_PROPERTY_X = "x";
  private Long x;

  public static final String JSON_PROPERTY_Y = "y";
  private Long y;

  public SyntheticsTestResultBounds height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Height in pixels.
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

  public SyntheticsTestResultBounds width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Width in pixels.
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

  public SyntheticsTestResultBounds x(Long x) {
    this.x = x;
    return this;
  }

  /**
   * Horizontal position in pixels.
   *
   * @return x
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getX() {
    return x;
  }

  public void setX(Long x) {
    this.x = x;
  }

  public SyntheticsTestResultBounds y(Long y) {
    this.y = y;
    return this;
  }

  /**
   * Vertical position in pixels.
   *
   * @return y
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getY() {
    return y;
  }

  public void setY(Long y) {
    this.y = y;
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
   * @return SyntheticsTestResultBounds
   */
  @JsonAnySetter
  public SyntheticsTestResultBounds putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultBounds object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultBounds syntheticsTestResultBounds = (SyntheticsTestResultBounds) o;
    return Objects.equals(this.height, syntheticsTestResultBounds.height)
        && Objects.equals(this.width, syntheticsTestResultBounds.width)
        && Objects.equals(this.x, syntheticsTestResultBounds.x)
        && Objects.equals(this.y, syntheticsTestResultBounds.y)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultBounds.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, x, y, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultBounds {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
