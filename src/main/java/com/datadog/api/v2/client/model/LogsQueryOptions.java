/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Global query options that are used during the query. Note: You should only supply timezone or
 * time offset but not both otherwise the query will fail.
 */
@ApiModel(
    description =
        "Global query options that are used during the query. Note: You should only supply"
            + " timezone or time offset but not both otherwise the query will fail.")
@JsonPropertyOrder({
  LogsQueryOptions.JSON_PROPERTY_TIME_OFFSET,
  LogsQueryOptions.JSON_PROPERTY_TIMEZONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsQueryOptions {
  public static final String JSON_PROPERTY_TIME_OFFSET = "timeOffset";
  private Long timeOffset;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";

  public LogsQueryOptions timeOffset(Long timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  /**
   * The time offset (in seconds) to apply to the query.
   *
   * @return timeOffset
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time offset (in seconds) to apply to the query.")
  @JsonProperty(JSON_PROPERTY_TIME_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeOffset() {
    return timeOffset;
  }

  public void setTimeOffset(Long timeOffset) {
    this.timeOffset = timeOffset;
  }

  public LogsQueryOptions timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone can be specified both as an offset, for example: \&quot;UTC+03:00\&quot;.
   *
   * @return timezone
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "GMT",
      value = "The timezone can be specified both as an offset, for example: \"UTC+03:00\".")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /** Return true if this LogsQueryOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsQueryOptions logsQueryOptions = (LogsQueryOptions) o;
    return Objects.equals(this.timeOffset, logsQueryOptions.timeOffset)
        && Objects.equals(this.timezone, logsQueryOptions.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffset, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsQueryOptions {\n");
    sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("}");
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
