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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * IoT usage for a given organization for a given hour.
 */
@ApiModel(description = "IoT usage for a given organization for a given hour.")
@JsonPropertyOrder({
  UsageIoTHour.JSON_PROPERTY_HOUR,
  UsageIoTHour.JSON_PROPERTY_IOT_DEVICE_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageIoTHour {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_IOT_DEVICE_COUNT = "iot_device_count";
  private Long iotDeviceCount;


  public UsageIoTHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

   /**
   * The hour for the usage.
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour for the usage.")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getHour() {
    return hour;
  }


  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }


  public UsageIoTHour iotDeviceCount(Long iotDeviceCount) {
    this.iotDeviceCount = iotDeviceCount;
    return this;
  }

   /**
   * The total number of IoT device hours from the start of the given hour&#39;s month until the given hour.
   * @return iotDeviceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of IoT device hours from the start of the given hour's month until the given hour.")
  @JsonProperty(JSON_PROPERTY_IOT_DEVICE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIotDeviceCount() {
    return iotDeviceCount;
  }


  public void setIotDeviceCount(Long iotDeviceCount) {
    this.iotDeviceCount = iotDeviceCount;
  }


  /**
   * Return true if this UsageIoTHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageIoTHour usageIoTHour = (UsageIoTHour) o;
    return Objects.equals(this.hour, usageIoTHour.hour) &&
        Objects.equals(this.iotDeviceCount, usageIoTHour.iotDeviceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, iotDeviceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageIoTHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    iotDeviceCount: ").append(toIndentedString(iotDeviceCount)).append("\n");
    sb.append("}");
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

