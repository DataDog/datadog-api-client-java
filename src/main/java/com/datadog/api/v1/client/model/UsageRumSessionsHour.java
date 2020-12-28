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
 * Number of RUM Sessions recorded for each hour for a given organization.
 */
@ApiModel(description = "Number of RUM Sessions recorded for each hour for a given organization.")
@JsonPropertyOrder({
  UsageRumSessionsHour.JSON_PROPERTY_HOUR,
  UsageRumSessionsHour.JSON_PROPERTY_SESSION_COUNT,
  UsageRumSessionsHour.JSON_PROPERTY_SESSION_COUNT_ANDROID,
  UsageRumSessionsHour.JSON_PROPERTY_SESSION_COUNT_IOS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageRumSessionsHour {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_SESSION_COUNT = "session_count";
  private Long sessionCount;

  public static final String JSON_PROPERTY_SESSION_COUNT_ANDROID = "session_count_android";
  private Long sessionCountAndroid;

  public static final String JSON_PROPERTY_SESSION_COUNT_IOS = "session_count_ios";
  private Long sessionCountIos;


  public UsageRumSessionsHour hour(OffsetDateTime hour) {
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


  public UsageRumSessionsHour sessionCount(Long sessionCount) {
    this.sessionCount = sessionCount;
    return this;
  }

   /**
   * Contains the number of RUM Sessions.
   * @return sessionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of RUM Sessions.")
  @JsonProperty(JSON_PROPERTY_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSessionCount() {
    return sessionCount;
  }


  public void setSessionCount(Long sessionCount) {
    this.sessionCount = sessionCount;
  }


  public UsageRumSessionsHour sessionCountAndroid(Long sessionCountAndroid) {
    this.sessionCountAndroid = sessionCountAndroid;
    return this;
  }

   /**
   * Contains the number of mobile RUM Sessions on Android (data available beginning December 1, 2020).
   * @return sessionCountAndroid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of mobile RUM Sessions on Android (data available beginning December 1, 2020).")
  @JsonProperty(JSON_PROPERTY_SESSION_COUNT_ANDROID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSessionCountAndroid() {
    return sessionCountAndroid;
  }


  public void setSessionCountAndroid(Long sessionCountAndroid) {
    this.sessionCountAndroid = sessionCountAndroid;
  }


  public UsageRumSessionsHour sessionCountIos(Long sessionCountIos) {
    this.sessionCountIos = sessionCountIos;
    return this;
  }

   /**
   * Contains the number of mobile RUM Sessions on iOS (data available beginning December 1, 2020).
   * @return sessionCountIos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of mobile RUM Sessions on iOS (data available beginning December 1, 2020).")
  @JsonProperty(JSON_PROPERTY_SESSION_COUNT_IOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSessionCountIos() {
    return sessionCountIos;
  }


  public void setSessionCountIos(Long sessionCountIos) {
    this.sessionCountIos = sessionCountIos;
  }


  /**
   * Return true if this UsageRumSessionsHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageRumSessionsHour usageRumSessionsHour = (UsageRumSessionsHour) o;
    return Objects.equals(this.hour, usageRumSessionsHour.hour) &&
        Objects.equals(this.sessionCount, usageRumSessionsHour.sessionCount) &&
        Objects.equals(this.sessionCountAndroid, usageRumSessionsHour.sessionCountAndroid) &&
        Objects.equals(this.sessionCountIos, usageRumSessionsHour.sessionCountIos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, sessionCount, sessionCountAndroid, sessionCountIos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageRumSessionsHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    sessionCountAndroid: ").append(toIndentedString(sessionCountAndroid)).append("\n");
    sb.append("    sessionCountIos: ").append(toIndentedString(sessionCountIos)).append("\n");
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

