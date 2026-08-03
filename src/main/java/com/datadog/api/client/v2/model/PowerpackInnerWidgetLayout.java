/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Powerpack inner widget layout.</p>
 */
@JsonPropertyOrder({
  PowerpackInnerWidgetLayout.JSON_PROPERTY_HEIGHT,
  PowerpackInnerWidgetLayout.JSON_PROPERTY_WIDTH,
  PowerpackInnerWidgetLayout.JSON_PROPERTY_X,
  PowerpackInnerWidgetLayout.JSON_PROPERTY_Y
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackInnerWidgetLayout {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public static final String JSON_PROPERTY_X = "x";
  private Long x;

  public static final String JSON_PROPERTY_Y = "y";
  private Long y;

  public PowerpackInnerWidgetLayout() {}

  @JsonCreator
  public PowerpackInnerWidgetLayout(
            @JsonProperty(required=true, value=JSON_PROPERTY_HEIGHT)Long height,
            @JsonProperty(required=true, value=JSON_PROPERTY_WIDTH)Long width,
            @JsonProperty(required=true, value=JSON_PROPERTY_X)Long x,
            @JsonProperty(required=true, value=JSON_PROPERTY_Y)Long y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
  }
  public PowerpackInnerWidgetLayout height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * <p>The height of the widget. Should be a non-negative integer.</p>
   * minimum: 0
   * @return height
  **/
      @JsonProperty(JSON_PROPERTY_HEIGHT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getHeight() {
        return height;
      }
  public void setHeight(Long height) {
    this.height = height;
  }
  public PowerpackInnerWidgetLayout width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * <p>The width of the widget. Should be a non-negative integer.</p>
   * minimum: 0
   * @return width
  **/
      @JsonProperty(JSON_PROPERTY_WIDTH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getWidth() {
        return width;
      }
  public void setWidth(Long width) {
    this.width = width;
  }
  public PowerpackInnerWidgetLayout x(Long x) {
    this.x = x;
    return this;
  }

  /**
   * <p>The position of the widget on the x (horizontal) axis. Should be a non-negative integer.</p>
   * minimum: 0
   * @return x
  **/
      @JsonProperty(JSON_PROPERTY_X)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getX() {
        return x;
      }
  public void setX(Long x) {
    this.x = x;
  }
  public PowerpackInnerWidgetLayout y(Long y) {
    this.y = y;
    return this;
  }

  /**
   * <p>The position of the widget on the y (vertical) axis. Should be a non-negative integer.</p>
   * minimum: 0
   * @return y
  **/
      @JsonProperty(JSON_PROPERTY_Y)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getY() {
        return y;
      }
  public void setY(Long y) {
    this.y = y;
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
   * @return PowerpackInnerWidgetLayout
   */
  @JsonAnySetter
  public PowerpackInnerWidgetLayout putAdditionalProperty(String key, Object value) {
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
   * Return true if this PowerpackInnerWidgetLayout object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackInnerWidgetLayout powerpackInnerWidgetLayout = (PowerpackInnerWidgetLayout) o;
    return Objects.equals(this.height, powerpackInnerWidgetLayout.height) && Objects.equals(this.width, powerpackInnerWidgetLayout.width) && Objects.equals(this.x, powerpackInnerWidgetLayout.x) && Objects.equals(this.y, powerpackInnerWidgetLayout.y) && Objects.equals(this.additionalProperties, powerpackInnerWidgetLayout.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(height,width,x,y, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackInnerWidgetLayout {\n");
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
