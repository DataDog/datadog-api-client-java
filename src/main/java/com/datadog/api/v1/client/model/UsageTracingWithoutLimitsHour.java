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
 * Tracing without limits usage for a given organization for a given hour.
 */
@ApiModel(description = "Tracing without limits usage for a given organization for a given hour.")
@JsonPropertyOrder({
  UsageTracingWithoutLimitsHour.JSON_PROPERTY_HOUR,
  UsageTracingWithoutLimitsHour.JSON_PROPERTY_INGESTED_EVENTS_BYTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageTracingWithoutLimitsHour {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES = "ingested_events_bytes";
  private Long ingestedEventsBytes;


  public UsageTracingWithoutLimitsHour hour(OffsetDateTime hour) {
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


  public UsageTracingWithoutLimitsHour ingestedEventsBytes(Long ingestedEventsBytes) {
    this.ingestedEventsBytes = ingestedEventsBytes;
    return this;
  }

   /**
   * Contains the total number of bytes ingested during a given hour.
   * @return ingestedEventsBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the total number of bytes ingested during a given hour.")
  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIngestedEventsBytes() {
    return ingestedEventsBytes;
  }


  public void setIngestedEventsBytes(Long ingestedEventsBytes) {
    this.ingestedEventsBytes = ingestedEventsBytes;
  }


  /**
   * Return true if this UsageTracingWithoutLimitsHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageTracingWithoutLimitsHour usageTracingWithoutLimitsHour = (UsageTracingWithoutLimitsHour) o;
    return Objects.equals(this.hour, usageTracingWithoutLimitsHour.hour) &&
        Objects.equals(this.ingestedEventsBytes, usageTracingWithoutLimitsHour.ingestedEventsBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, ingestedEventsBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageTracingWithoutLimitsHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    ingestedEventsBytes: ").append(toIndentedString(ingestedEventsBytes)).append("\n");
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

