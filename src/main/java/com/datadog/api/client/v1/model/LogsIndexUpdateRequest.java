/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Object for updating a Datadog Log index.</p>
 */
@JsonPropertyOrder({
  LogsIndexUpdateRequest.JSON_PROPERTY_DAILY_LIMIT,
  LogsIndexUpdateRequest.JSON_PROPERTY_DISABLE_DAILY_LIMIT,
  LogsIndexUpdateRequest.JSON_PROPERTY_EXCLUSION_FILTERS,
  LogsIndexUpdateRequest.JSON_PROPERTY_FILTER,
  LogsIndexUpdateRequest.JSON_PROPERTY_NUM_RETENTION_DAYS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsIndexUpdateRequest {
  @JsonIgnore
  public boolean unparsed = false;
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

  public LogsIndexUpdateRequest() {}

  @JsonCreator
  public LogsIndexUpdateRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTER)LogsFilter filter) {
        this.filter = filter;
        this.unparsed |= filter.unparsed;
  }
  public LogsIndexUpdateRequest dailyLimit(Long dailyLimit) {
    this.dailyLimit = dailyLimit;
    return this;
  }

  /**
   * <p>The number of log events you can send in this index per day before you are rate-limited.</p>
   * @return dailyLimit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DAILY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>If true, sets the <code>daily_limit</code> value to null and the index is not limited on a daily basis (any
   * specified <code>daily_limit</code> value in the request is ignored). If false or omitted, the index's current
   * <code>daily_limit</code> is maintained.</p>
   * @return disableDailyLimit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISABLE_DAILY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getDisableDailyLimit() {
        return disableDailyLimit;
      }
  public void setDisableDailyLimit(Boolean disableDailyLimit) {
    this.disableDailyLimit = disableDailyLimit;
  }
  public LogsIndexUpdateRequest exclusionFilters(List<LogsExclusion> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
    for (LogsExclusion item : exclusionFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public LogsIndexUpdateRequest addExclusionFiltersItem(LogsExclusion exclusionFiltersItem) {
    if (this.exclusionFilters == null) {
      this.exclusionFilters = new ArrayList<>();
    }
    this.exclusionFilters.add(exclusionFiltersItem);
    this.unparsed |= exclusionFiltersItem.unparsed;
    return this;
  }

  /**
   * <p>An array of exclusion objects. The logs are tested against the query of each filter,
   * following the order of the array. Only the first matching active exclusion matters,
   * others (if any) are ignored.</p>
   * @return exclusionFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXCLUSION_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<LogsExclusion> getExclusionFilters() {
        return exclusionFilters;
      }
  public void setExclusionFilters(List<LogsExclusion> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
  }
  public LogsIndexUpdateRequest filter(LogsFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>Filter for logs.</p>
   * @return filter
  **/
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The number of days before logs are deleted from this index. Available values depend on
   * retention plans specified in your organization's contract/subscriptions.</p>
   * <p><strong>Note:</strong> Changing the retention for an index adjusts the length of retention for all logs
   * already in this index. It may also affect billing.</p>
   * @return numRetentionDays
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NUM_RETENTION_DAYS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
    return Objects.equals(this.dailyLimit, logsIndexUpdateRequest.dailyLimit) && Objects.equals(this.disableDailyLimit, logsIndexUpdateRequest.disableDailyLimit) && Objects.equals(this.exclusionFilters, logsIndexUpdateRequest.exclusionFilters) && Objects.equals(this.filter, logsIndexUpdateRequest.filter) && Objects.equals(this.numRetentionDays, logsIndexUpdateRequest.numRetentionDays);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dailyLimit,disableDailyLimit,exclusionFilters,filter,numRetentionDays);
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
