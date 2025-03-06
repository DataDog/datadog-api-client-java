/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The definition of <code>AnnotationDisplayBounds</code> object. */
@JsonPropertyOrder({
  AnnotationDisplayBounds.JSON_PROPERTY_HEIGHT,
  AnnotationDisplayBounds.JSON_PROPERTY_WIDTH,
  AnnotationDisplayBounds.JSON_PROPERTY_X,
  AnnotationDisplayBounds.JSON_PROPERTY_Y
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnnotationDisplayBounds {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Double height;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Double width;

  public static final String JSON_PROPERTY_X = "x";
  private Double x;

  public static final String JSON_PROPERTY_Y = "y";
  private Double y;

  public AnnotationDisplayBounds height(Double height) {
    this.height = height;
    return this;
  }

  /**
   * The <code>bounds</code> <code>height</code>.
   *
   * @return height
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public AnnotationDisplayBounds width(Double width) {
    this.width = width;
    return this;
  }

  /**
   * The <code>bounds</code> <code>width</code>.
   *
   * @return width
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public AnnotationDisplayBounds x(Double x) {
    this.x = x;
    return this;
  }

  /**
   * The <code>bounds</code> <code>x</code>.
   *
   * @return x
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public AnnotationDisplayBounds y(Double y) {
    this.y = y;
    return this;
  }

  /**
   * The <code>bounds</code> <code>y</code>.
   *
   * @return y
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  /** Return true if this AnnotationDisplayBounds object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationDisplayBounds annotationDisplayBounds = (AnnotationDisplayBounds) o;
    return Objects.equals(this.height, annotationDisplayBounds.height)
        && Objects.equals(this.width, annotationDisplayBounds.width)
        && Objects.equals(this.x, annotationDisplayBounds.x)
        && Objects.equals(this.y, annotationDisplayBounds.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationDisplayBounds {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
