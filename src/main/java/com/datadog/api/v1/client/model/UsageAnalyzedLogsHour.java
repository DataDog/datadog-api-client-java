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

/** The number of analyzed logs for each hour for a given organization. */
@ApiModel(description = "The number of analyzed logs for each hour for a given organization.")
@JsonPropertyOrder({
  UsageAnalyzedLogsHour.JSON_PROPERTY_ANALYZED_LOGS,
  UsageAnalyzedLogsHour.JSON_PROPERTY_HOUR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageAnalyzedLogsHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYZED_LOGS = "analyzed_logs";
  private Long analyzedLogs;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public UsageAnalyzedLogsHour analyzedLogs(Long analyzedLogs) {
    this.analyzedLogs = analyzedLogs;
    return this;
  }

  /**
   * Contains the number of analyzed logs.
   *
   * @return analyzedLogs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of analyzed logs.")
  @JsonProperty(JSON_PROPERTY_ANALYZED_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAnalyzedLogs() {
    return analyzedLogs;
  }

  public void setAnalyzedLogs(Long analyzedLogs) {
    this.analyzedLogs = analyzedLogs;
  }

  public UsageAnalyzedLogsHour hour(OffsetDateTime hour) {
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

  /** Return true if this UsageAnalyzedLogsHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAnalyzedLogsHour usageAnalyzedLogsHour = (UsageAnalyzedLogsHour) o;
    return Objects.equals(this.analyzedLogs, usageAnalyzedLogsHour.analyzedLogs)
        && Objects.equals(this.hour, usageAnalyzedLogsHour.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzedLogs, hour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAnalyzedLogsHour {\n");
    sb.append("    analyzedLogs: ").append(toIndentedString(analyzedLogs)).append("\n");
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
