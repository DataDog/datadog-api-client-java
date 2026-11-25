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
import org.openapitools.jackson.nullable.JsonNullable;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  MSLWidgetLayout.JSON_PROPERTY_HEIGHT,
  MSLWidgetLayout.JSON_PROPERTY_PARENT,
  MSLWidgetLayout.JSON_PROPERTY_WIDTH,
  MSLWidgetLayout.JSON_PROPERTY_X,
  MSLWidgetLayout.JSON_PROPERTY_Y
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MSLWidgetLayout {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Double height;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private JsonNullable<Double> parent = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Double width;

  public static final String JSON_PROPERTY_X = "x";
  private Double x;

  public static final String JSON_PROPERTY_Y = "y";
  private Double y;

  public MSLWidgetLayout() {}

  @JsonCreator
  public MSLWidgetLayout(
      @JsonProperty(required = true, value = JSON_PROPERTY_HEIGHT) Double height,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDTH) Double width,
      @JsonProperty(required = true, value = JSON_PROPERTY_X) Double x,
      @JsonProperty(required = true, value = JSON_PROPERTY_Y) Double y) {
    this.height = height;
    this.width = width;
    this.x = x;
    this.y = y;
  }

  public MSLWidgetLayout height(Double height) {
    this.height = height;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return height
   */
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public MSLWidgetLayout parent(Double parent) {
    this.parent = JsonNullable.<Double>of(parent);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return parent
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getParent() {
    return parent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getParent_JsonNullable() {
    return parent;
  }

  @JsonProperty(JSON_PROPERTY_PARENT)
  public void setParent_JsonNullable(JsonNullable<Double> parent) {
    this.parent = parent;
  }

  public void setParent(Double parent) {
    this.parent = JsonNullable.<Double>of(parent);
  }

  public MSLWidgetLayout width(Double width) {
    this.width = width;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return width
   */
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public MSLWidgetLayout x(Double x) {
    this.x = x;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return x
   */
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public MSLWidgetLayout y(Double y) {
    this.y = y;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return y
   */
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  /** Return true if this MSLWidgetLayout object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MSLWidgetLayout mslWidgetLayout = (MSLWidgetLayout) o;
    return Objects.equals(this.height, mslWidgetLayout.height)
        && Objects.equals(this.parent, mslWidgetLayout.parent)
        && Objects.equals(this.width, mslWidgetLayout.width)
        && Objects.equals(this.x, mslWidgetLayout.x)
        && Objects.equals(this.y, mslWidgetLayout.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, parent, width, x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MSLWidgetLayout {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
