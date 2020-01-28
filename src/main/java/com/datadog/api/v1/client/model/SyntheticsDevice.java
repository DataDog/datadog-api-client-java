/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.SyntheticsDeviceID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SyntheticsDevice
 */
@JsonPropertyOrder({
  SyntheticsDevice.JSON_PROPERTY_HEIGHT,
  SyntheticsDevice.JSON_PROPERTY_ID,
  SyntheticsDevice.JSON_PROPERTY_IS_MOBILE,
  SyntheticsDevice.JSON_PROPERTY_NAME,
  SyntheticsDevice.JSON_PROPERTY_WIDTH
})

public class SyntheticsDevice {
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_ID = "id";
  private SyntheticsDeviceID id;

  public static final String JSON_PROPERTY_IS_MOBILE = "isMobile";
  private Boolean isMobile;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;


  public SyntheticsDevice height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public SyntheticsDevice id(SyntheticsDeviceID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SyntheticsDeviceID getId() {
    return id;
  }


  public void setId(SyntheticsDeviceID id) {
    this.id = id;
  }


  public SyntheticsDevice isMobile(Boolean isMobile) {
    
    this.isMobile = isMobile;
    return this;
  }

   /**
   * Get isMobile
   * @return isMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMobile() {
    return isMobile;
  }


  public void setIsMobile(Boolean isMobile) {
    this.isMobile = isMobile;
  }


  public SyntheticsDevice name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SyntheticsDevice width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDevice syntheticsDevice = (SyntheticsDevice) o;
    return Objects.equals(this.height, syntheticsDevice.height) &&
        Objects.equals(this.id, syntheticsDevice.id) &&
        Objects.equals(this.isMobile, syntheticsDevice.isMobile) &&
        Objects.equals(this.name, syntheticsDevice.name) &&
        Objects.equals(this.width, syntheticsDevice.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, id, isMobile, name, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDevice {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMobile: ").append(toIndentedString(isMobile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

