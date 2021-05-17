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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object describing a Datadog Log index. */
@ApiModel(description = "Object describing a Datadog Log index.")
@JsonPropertyOrder({
  LogsIndex.JSON_PROPERTY_DAILY_LIMIT,
  LogsIndex.JSON_PROPERTY_EXCLUSION_FILTERS,
  LogsIndex.JSON_PROPERTY_FILTER,
  LogsIndex.JSON_PROPERTY_IS_RATE_LIMITED,
  LogsIndex.JSON_PROPERTY_NAME,
  LogsIndex.JSON_PROPERTY_NUM_RETENTION_DAYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsIndex {
  public static final String JSON_PROPERTY_DAILY_LIMIT = "daily_limit";
  private Long dailyLimit;

  public static final String JSON_PROPERTY_EXCLUSION_FILTERS = "exclusion_filters";
  private List<LogsExclusion> exclusionFilters = null;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsFilter filter;

  public static final String JSON_PROPERTY_IS_RATE_LIMITED = "is_rate_limited";
  private Boolean isRateLimited;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUM_RETENTION_DAYS = "num_retention_days";
  private Long numRetentionDays;

  public LogsIndex() {}

  @JsonCreator
  public LogsIndex(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER) LogsFilter filter,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.filter = filter;
    this.name = name;
  }

  public LogsIndex dailyLimit(Long dailyLimit) {
    this.dailyLimit = dailyLimit;
    return this;
  }

  /**
   * The number of log events you can send in this index per day before you are rate-limited.
   *
   * @return dailyLimit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "300000000",
      value =
          "The number of log events you can send in this index per day before you are"
              + " rate-limited.")
  @JsonProperty(JSON_PROPERTY_DAILY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDailyLimit() {
    return dailyLimit;
  }

  public void setDailyLimit(Long dailyLimit) {
    this.dailyLimit = dailyLimit;
  }

  public LogsIndex exclusionFilters(List<LogsExclusion> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
    return this;
  }

  public LogsIndex addExclusionFiltersItem(LogsExclusion exclusionFiltersItem) {
    if (this.exclusionFilters == null) {
      this.exclusionFilters = new ArrayList<>();
    }
    this.exclusionFilters.add(exclusionFiltersItem);
    return this;
  }

  /**
   * An array of exclusion objects. The logs are tested against the query of each filter, following
   * the order of the array. Only the first matching active exclusion matters, others (if any) are
   * ignored.
   *
   * @return exclusionFilters
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "An array of exclusion objects. The logs are tested against the query of each filter,"
              + " following the order of the array. Only the first matching active exclusion"
              + " matters, others (if any) are ignored.")
  @JsonProperty(JSON_PROPERTY_EXCLUSION_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsExclusion> getExclusionFilters() {
    return exclusionFilters;
  }

  public void setExclusionFilters(List<LogsExclusion> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
  }

  public LogsIndex filter(LogsFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   *
   * @return filter
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsFilter getFilter() {
    return filter;
  }

  public void setFilter(LogsFilter filter) {
    this.filter = filter;
  }

  /**
   * A boolean stating if the index is rate limited, meaning more logs than the daily limit have
   * been sent. Rate limit is reset every-day at 2pm UTC.
   *
   * @return isRateLimited
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "false",
      value =
          "A boolean stating if the index is rate limited, meaning more logs than the daily limit"
              + " have been sent. Rate limit is reset every-day at 2pm UTC.")
  @JsonProperty(JSON_PROPERTY_IS_RATE_LIMITED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsRateLimited() {
    return isRateLimited;
  }

  public LogsIndex name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the index.
   *
   * @return name
   */
  @ApiModelProperty(example = "main", required = true, value = "The name of the index.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsIndex numRetentionDays(Long numRetentionDays) {
    this.numRetentionDays = numRetentionDays;
    return this;
  }

  /**
   * The number of days before logs are deleted from this index. Available values depend on
   * retention plans specified in your organization&#39;s contract/subscriptions.
   *
   * @return numRetentionDays
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "15",
      value =
          "The number of days before logs are deleted from this index. Available values depend on"
              + " retention plans specified in your organization's contract/subscriptions.")
  @JsonProperty(JSON_PROPERTY_NUM_RETENTION_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumRetentionDays() {
    return numRetentionDays;
  }

  public void setNumRetentionDays(Long numRetentionDays) {
    this.numRetentionDays = numRetentionDays;
  }

  /** Return true if this LogsIndex object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsIndex logsIndex = (LogsIndex) o;
    return Objects.equals(this.dailyLimit, logsIndex.dailyLimit)
        && Objects.equals(this.exclusionFilters, logsIndex.exclusionFilters)
        && Objects.equals(this.filter, logsIndex.filter)
        && Objects.equals(this.isRateLimited, logsIndex.isRateLimited)
        && Objects.equals(this.name, logsIndex.name)
        && Objects.equals(this.numRetentionDays, logsIndex.numRetentionDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dailyLimit, exclusionFilters, filter, isRateLimited, name, numRetentionDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsIndex {\n");
    sb.append("    dailyLimit: ").append(toIndentedString(dailyLimit)).append("\n");
    sb.append("    exclusionFilters: ").append(toIndentedString(exclusionFilters)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    isRateLimited: ").append(toIndentedString(isRateLimited)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numRetentionDays: ").append(toIndentedString(numRetentionDays)).append("\n");
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
