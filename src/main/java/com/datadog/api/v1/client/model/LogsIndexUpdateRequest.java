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
import com.datadog.api.v1.client.model.LogsExclusion;
import com.datadog.api.v1.client.model.LogsFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object for updating a Datadog Log index.
 */
@ApiModel(description = "Object for updating a Datadog Log index.")
@JsonPropertyOrder({
  LogsIndexUpdateRequest.JSON_PROPERTY_DAILY_LIMIT,
  LogsIndexUpdateRequest.JSON_PROPERTY_DISABLE_DAILY_LIMIT,
  LogsIndexUpdateRequest.JSON_PROPERTY_EXCLUSION_FILTERS,
  LogsIndexUpdateRequest.JSON_PROPERTY_FILTER,
  LogsIndexUpdateRequest.JSON_PROPERTY_NUM_RETENTION_DAYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsIndexUpdateRequest {
  public static final String JSON_PROPERTY_DAILY_LIMIT = "daily_limit";
  private Long dailyLimit;

  public static final String JSON_PROPERTY_DISABLE_DAILY_LIMIT = "disable_daily_limit";
  private Boolean disableDailyLimit;

  public static final String JSON_PROPERTY_EXCLUSION_FILTERS = "exclusion_filters";
  private List<LogsExclusion> exclusionFilters = null;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsFilter filter;

  public static final String JSON_PROPERTY_NUM_RETENTION_DAYS = "num_retention_days";
  private Long numRetentionDays;


  public LogsIndexUpdateRequest dailyLimit(Long dailyLimit) {
    this.dailyLimit = dailyLimit;
    return this;
  }

   /**
   * The number of log events you can send in this index per day before you are rate-limited.
   * @return dailyLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of log events you can send in this index per day before you are rate-limited.")
  @JsonProperty(JSON_PROPERTY_DAILY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDailyLimit() {
    return dailyLimit;
  }


  public void setDailyLimit(Long dailyLimit) {
    this.dailyLimit = dailyLimit;
  }


  public LogsIndexUpdateRequest disableDailyLimit(Boolean disableDailyLimit) {
    this.disableDailyLimit = disableDailyLimit;
    return this;
  }

   /**
   * If true, sets the &#x60;daily_limit&#x60; value to null and the index is not limited on a daily basis (any specified &#x60;daily_limit&#x60; value in the request is ignored). If false or omitted, the index&#39;s current &#x60;daily_limit&#x60; is maintained.
   * @return disableDailyLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, sets the `daily_limit` value to null and the index is not limited on a daily basis (any specified `daily_limit` value in the request is ignored). If false or omitted, the index's current `daily_limit` is maintained.")
  @JsonProperty(JSON_PROPERTY_DISABLE_DAILY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisableDailyLimit() {
    return disableDailyLimit;
  }


  public void setDisableDailyLimit(Boolean disableDailyLimit) {
    this.disableDailyLimit = disableDailyLimit;
  }


  public LogsIndexUpdateRequest exclusionFilters(List<LogsExclusion> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
    return this;
  }

  public LogsIndexUpdateRequest addExclusionFiltersItem(LogsExclusion exclusionFiltersItem) {
    if (this.exclusionFilters == null) {
      this.exclusionFilters = new ArrayList<>();
    }
    this.exclusionFilters.add(exclusionFiltersItem);
    return this;
  }

   /**
   * An array of exclusion objects. The logs are tested against the query of each filter, following the order of the array. Only the first matching active exclusion matters, others (if any) are ignored.
   * @return exclusionFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of exclusion objects. The logs are tested against the query of each filter, following the order of the array. Only the first matching active exclusion matters, others (if any) are ignored.")
  @JsonProperty(JSON_PROPERTY_EXCLUSION_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LogsExclusion> getExclusionFilters() {
    return exclusionFilters;
  }


  public void setExclusionFilters(List<LogsExclusion> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
  }


  public LogsIndexUpdateRequest filter(LogsFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LogsFilter getFilter() {
    return filter;
  }


  public void setFilter(LogsFilter filter) {
    this.filter = filter;
  }


  public LogsIndexUpdateRequest numRetentionDays(Long numRetentionDays) {
    this.numRetentionDays = numRetentionDays;
    return this;
  }

   /**
   * The number of days before logs are deleted from this index. Available values depend on retention plans specified in your organization&#39;s contract/subscriptions.  **Note:** Changing the retention for an index adjusts the length of retention for all logs already in this index. It may also affect billing.
   * @return numRetentionDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days before logs are deleted from this index. Available values depend on retention plans specified in your organization's contract/subscriptions.  **Note:** Changing the retention for an index adjusts the length of retention for all logs already in this index. It may also affect billing.")
  @JsonProperty(JSON_PROPERTY_NUM_RETENTION_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumRetentionDays() {
    return numRetentionDays;
  }


  public void setNumRetentionDays(Long numRetentionDays) {
    this.numRetentionDays = numRetentionDays;
  }


  /**
   * Return true if this LogsIndexUpdateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsIndexUpdateRequest logsIndexUpdateRequest = (LogsIndexUpdateRequest) o;
    return Objects.equals(this.dailyLimit, logsIndexUpdateRequest.dailyLimit) &&
        Objects.equals(this.disableDailyLimit, logsIndexUpdateRequest.disableDailyLimit) &&
        Objects.equals(this.exclusionFilters, logsIndexUpdateRequest.exclusionFilters) &&
        Objects.equals(this.filter, logsIndexUpdateRequest.filter) &&
        Objects.equals(this.numRetentionDays, logsIndexUpdateRequest.numRetentionDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyLimit, disableDailyLimit, exclusionFilters, filter, numRetentionDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsIndexUpdateRequest {\n");
    sb.append("    dailyLimit: ").append(toIndentedString(dailyLimit)).append("\n");
    sb.append("    disableDailyLimit: ").append(toIndentedString(disableDailyLimit)).append("\n");
    sb.append("    exclusionFilters: ").append(toIndentedString(exclusionFilters)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    numRetentionDays: ").append(toIndentedString(numRetentionDays)).append("\n");
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

