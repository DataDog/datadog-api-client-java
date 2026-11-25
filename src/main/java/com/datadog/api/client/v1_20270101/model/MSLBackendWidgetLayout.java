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
  MSLBackendWidgetLayout.JSON_PROPERTY_HEIGHT,
  MSLBackendWidgetLayout.JSON_PROPERTY_IS_COLUMN_BREAK,
  MSLBackendWidgetLayout.JSON_PROPERTY_WIDTH,
  MSLBackendWidgetLayout.JSON_PROPERTY_X,
  MSLBackendWidgetLayout.JSON_PROPERTY_Y
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MSLBackendWidgetLayout {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Double height;

  public static final String JSON_PROPERTY_IS_COLUMN_BREAK = "is_column_break";
  private Boolean isColumnBreak;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Double width;

  public static final String JSON_PROPERTY_X = "x";
  private Double x;

  public static final String JSON_PROPERTY_Y = "y";
  private Double y;

  public MSLBackendWidgetLayout() {}

  @JsonCreator
  public MSLBackendWidgetLayout(
      @JsonProperty(required = true, value = JSON_PROPERTY_HEIGHT) Double height,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDTH) Double width,
      @JsonProperty(required = true, value = JSON_PROPERTY_X) Double x,
      @JsonProperty(required = true, value = JSON_PROPERTY_Y) Double y) {
    this.height = height;
    this.width = width;
    this.x = x;
    this.y = y;
  }

  public MSLBackendWidgetLayout height(Double height) {
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

  public MSLBackendWidgetLayout isColumnBreak(Boolean isColumnBreak) {
    this.isColumnBreak = isColumnBreak;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return isColumnBreak
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_COLUMN_BREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsColumnBreak() {
    return isColumnBreak;
  }

  public void setIsColumnBreak(Boolean isColumnBreak) {
    this.isColumnBreak = isColumnBreak;
  }

  public MSLBackendWidgetLayout width(Double width) {
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

  public MSLBackendWidgetLayout x(Double x) {
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

  public MSLBackendWidgetLayout y(Double y) {
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

  /** Return true if this MSLBackendWidgetLayout object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MSLBackendWidgetLayout mslBackendWidgetLayout = (MSLBackendWidgetLayout) o;
    return Objects.equals(this.height, mslBackendWidgetLayout.height)
        && Objects.equals(this.isColumnBreak, mslBackendWidgetLayout.isColumnBreak)
        && Objects.equals(this.width, mslBackendWidgetLayout.width)
        && Objects.equals(this.x, mslBackendWidgetLayout.x)
        && Objects.equals(this.y, mslBackendWidgetLayout.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, isColumnBreak, width, x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MSLBackendWidgetLayout {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isColumnBreak: ").append(toIndentedString(isColumnBreak)).append("\n");
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
