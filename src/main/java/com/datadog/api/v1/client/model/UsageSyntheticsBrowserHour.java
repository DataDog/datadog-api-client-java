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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Objects;

/** Number of Synthetics Browser tests run for each hour for a given organization. */
@ApiModel(
    description = "Number of Synthetics Browser tests run for each hour for a given organization.")
@JsonPropertyOrder({
  UsageSyntheticsBrowserHour.JSON_PROPERTY_BROWSER_CHECK_CALLS_COUNT,
  UsageSyntheticsBrowserHour.JSON_PROPERTY_HOUR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageSyntheticsBrowserHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BROWSER_CHECK_CALLS_COUNT = "browser_check_calls_count";
  private Long browserCheckCallsCount;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public UsageSyntheticsBrowserHour browserCheckCallsCount(Long browserCheckCallsCount) {
    this.browserCheckCallsCount = browserCheckCallsCount;
    return this;
  }

  /**
   * Contains the number of Synthetics Browser tests run.
   *
   * @return browserCheckCallsCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of Synthetics Browser tests run.")
  @JsonProperty(JSON_PROPERTY_BROWSER_CHECK_CALLS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserCheckCallsCount() {
    return browserCheckCallsCount;
  }

  public void setBrowserCheckCallsCount(Long browserCheckCallsCount) {
    this.browserCheckCallsCount = browserCheckCallsCount;
  }

  public UsageSyntheticsBrowserHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
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

  /** Return true if this UsageSyntheticsBrowserHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSyntheticsBrowserHour usageSyntheticsBrowserHour = (UsageSyntheticsBrowserHour) o;
    return Objects.equals(
            this.browserCheckCallsCount, usageSyntheticsBrowserHour.browserCheckCallsCount)
        && Objects.equals(this.hour, usageSyntheticsBrowserHour.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserCheckCallsCount, hour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSyntheticsBrowserHour {\n");
    sb.append("    browserCheckCallsCount: ")
        .append(toIndentedString(browserCheckCallsCount))
        .append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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
