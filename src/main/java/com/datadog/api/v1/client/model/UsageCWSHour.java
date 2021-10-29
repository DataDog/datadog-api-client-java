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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * Cloud Workload Security usage for a given organization for a given hour.
 */
@ApiModel(description = "Cloud Workload Security usage for a given organization for a given hour.")
@JsonPropertyOrder({
  UsageCWSHour.JSON_PROPERTY_CWS_CONTAINER_COUNT,
  UsageCWSHour.JSON_PROPERTY_CWS_HOST_COUNT,
  UsageCWSHour.JSON_PROPERTY_HOUR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UsageCWSHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CWS_CONTAINER_COUNT = "cws_container_count";
  private Long cwsContainerCount;

  public static final String JSON_PROPERTY_CWS_HOST_COUNT = "cws_host_count";
  private Long cwsHostCount;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;


  public UsageCWSHour cwsContainerCount(Long cwsContainerCount) {
    this.cwsContainerCount = cwsContainerCount;
    return this;
  }

   /**
   * The total number of Cloud Workload Security container hours from the start of the given hour’s month until the given hour.
   * @return cwsContainerCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of Cloud Workload Security container hours from the start of the given hour’s month until the given hour.")
  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCwsContainerCount() {
    return cwsContainerCount;
  }


  public void setCwsContainerCount(Long cwsContainerCount) {
    this.cwsContainerCount = cwsContainerCount;
  }


  public UsageCWSHour cwsHostCount(Long cwsHostCount) {
    this.cwsHostCount = cwsHostCount;
    return this;
  }

   /**
   * The total number of Cloud Workload Security host hours from the start of the given hour’s month until the given hour.
   * @return cwsHostCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of Cloud Workload Security host hours from the start of the given hour’s month until the given hour.")
  @JsonProperty(JSON_PROPERTY_CWS_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCwsHostCount() {
    return cwsHostCount;
  }


  public void setCwsHostCount(Long cwsHostCount) {
    this.cwsHostCount = cwsHostCount;
  }


  public UsageCWSHour hour(OffsetDateTime hour) {
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


  /**
   * Return true if this UsageCWSHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCWSHour usageCWSHour = (UsageCWSHour) o;
    return Objects.equals(this.cwsContainerCount, usageCWSHour.cwsContainerCount) &&
        Objects.equals(this.cwsHostCount, usageCWSHour.cwsHostCount) &&
        Objects.equals(this.hour, usageCWSHour.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cwsContainerCount, cwsHostCount, hour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCWSHour {\n");
    sb.append("    cwsContainerCount: ").append(toIndentedString(cwsContainerCount)).append("\n");
    sb.append("    cwsHostCount: ").append(toIndentedString(cwsHostCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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

