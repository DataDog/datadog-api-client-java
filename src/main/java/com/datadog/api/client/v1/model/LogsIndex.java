/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Object describing a Datadog Log index. */
@JsonPropertyOrder({
  LogsIndex.JSON_PROPERTY_DAILY_LIMIT,
  LogsIndex.JSON_PROPERTY_DAILY_LIMIT_RESET,
  LogsIndex.JSON_PROPERTY_DAILY_LIMIT_WARNING_THRESHOLD_PERCENTAGE,
  LogsIndex.JSON_PROPERTY_EXCLUSION_FILTERS,
  LogsIndex.JSON_PROPERTY_FILTER,
  LogsIndex.JSON_PROPERTY_IS_RATE_LIMITED,
  LogsIndex.JSON_PROPERTY_NAME,
  LogsIndex.JSON_PROPERTY_NUM_RETENTION_DAYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsIndex {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAILY_LIMIT = "daily_limit";
  private Long dailyLimit;

  public static final String JSON_PROPERTY_DAILY_LIMIT_RESET = "daily_limit_reset";
  private LogsDailyLimitReset dailyLimitReset;

  public static final String JSON_PROPERTY_DAILY_LIMIT_WARNING_THRESHOLD_PERCENTAGE =
      "daily_limit_warning_threshold_percentage";
  private Double dailyLimitWarningThresholdPercentage;

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
    this.unparsed |= filter.unparsed;
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAILY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDailyLimit() {
    return dailyLimit;
  }

  public void setDailyLimit(Long dailyLimit) {
    this.dailyLimit = dailyLimit;
  }

  public LogsIndex dailyLimitReset(LogsDailyLimitReset dailyLimitReset) {
    this.dailyLimitReset = dailyLimitReset;
    this.unparsed |= dailyLimitReset.unparsed;
    return this;
  }

  /**
   * Object containing options to override the default daily limit reset time.
   *
   * @return dailyLimitReset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAILY_LIMIT_RESET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsDailyLimitReset getDailyLimitReset() {
    return dailyLimitReset;
  }

  public void setDailyLimitReset(LogsDailyLimitReset dailyLimitReset) {
    this.dailyLimitReset = dailyLimitReset;
  }

  public LogsIndex dailyLimitWarningThresholdPercentage(
      Double dailyLimitWarningThresholdPercentage) {
    this.dailyLimitWarningThresholdPercentage = dailyLimitWarningThresholdPercentage;
    return this;
  }

  /**
   * A percentage threshold of the daily quota at which a Datadog warning event is generated.
   * minimum: 50 maximum: 99.99
   *
   * @return dailyLimitWarningThresholdPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAILY_LIMIT_WARNING_THRESHOLD_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDailyLimitWarningThresholdPercentage() {
    return dailyLimitWarningThresholdPercentage;
  }

  public void setDailyLimitWarningThresholdPercentage(Double dailyLimitWarningThresholdPercentage) {
    this.dailyLimitWarningThresholdPercentage = dailyLimitWarningThresholdPercentage;
  }

  public LogsIndex exclusionFilters(List<LogsExclusion> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
    for (LogsExclusion item : exclusionFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsIndex addExclusionFiltersItem(LogsExclusion exclusionFiltersItem) {
    if (this.exclusionFilters == null) {
      this.exclusionFilters = new ArrayList<>();
    }
    this.exclusionFilters.add(exclusionFiltersItem);
    this.unparsed |= exclusionFiltersItem.unparsed;
    return this;
  }

  /**
   * An array of exclusion objects. The logs are tested against the query of each filter, following
   * the order of the array. Only the first matching active exclusion matters, others (if any) are
   * ignored.
   *
   * @return exclusionFilters
   */
  @jakarta.annotation.Nullable
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
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * Filter for logs.
   *
   * @return filter
   */
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
  @jakarta.annotation.Nullable
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
   * retention plans specified in your organization's contract/subscriptions.
   *
   * @return numRetentionDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_RETENTION_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumRetentionDays() {
    return numRetentionDays;
  }

  public void setNumRetentionDays(Long numRetentionDays) {
    this.numRetentionDays = numRetentionDays;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return LogsIndex
   */
  @JsonAnySetter
  public LogsIndex putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
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
        && Objects.equals(this.dailyLimitReset, logsIndex.dailyLimitReset)
        && Objects.equals(
            this.dailyLimitWarningThresholdPercentage,
            logsIndex.dailyLimitWarningThresholdPercentage)
        && Objects.equals(this.exclusionFilters, logsIndex.exclusionFilters)
        && Objects.equals(this.filter, logsIndex.filter)
        && Objects.equals(this.isRateLimited, logsIndex.isRateLimited)
        && Objects.equals(this.name, logsIndex.name)
        && Objects.equals(this.numRetentionDays, logsIndex.numRetentionDays)
        && Objects.equals(this.additionalProperties, logsIndex.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dailyLimit,
        dailyLimitReset,
        dailyLimitWarningThresholdPercentage,
        exclusionFilters,
        filter,
        isRateLimited,
        name,
        numRetentionDays,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsIndex {\n");
    sb.append("    dailyLimit: ").append(toIndentedString(dailyLimit)).append("\n");
    sb.append("    dailyLimitReset: ").append(toIndentedString(dailyLimitReset)).append("\n");
    sb.append("    dailyLimitWarningThresholdPercentage: ")
        .append(toIndentedString(dailyLimitWarningThresholdPercentage))
        .append("\n");
    sb.append("    exclusionFilters: ").append(toIndentedString(exclusionFilters)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    isRateLimited: ").append(toIndentedString(isRateLimited)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numRetentionDays: ").append(toIndentedString(numRetentionDays)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
