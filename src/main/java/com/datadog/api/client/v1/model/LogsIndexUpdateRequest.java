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

/** Object for updating a Datadog Log index. */
@JsonPropertyOrder({
  LogsIndexUpdateRequest.JSON_PROPERTY_DAILY_LIMIT,
  LogsIndexUpdateRequest.JSON_PROPERTY_DAILY_LIMIT_RESET,
  LogsIndexUpdateRequest.JSON_PROPERTY_DAILY_LIMIT_WARNING_THRESHOLD_PERCENTAGE,
  LogsIndexUpdateRequest.JSON_PROPERTY_DISABLE_DAILY_LIMIT,
  LogsIndexUpdateRequest.JSON_PROPERTY_EXCLUSION_FILTERS,
  LogsIndexUpdateRequest.JSON_PROPERTY_FILTER,
  LogsIndexUpdateRequest.JSON_PROPERTY_NUM_FLEX_LOGS_RETENTION_DAYS,
  LogsIndexUpdateRequest.JSON_PROPERTY_NUM_RETENTION_DAYS,
  LogsIndexUpdateRequest.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsIndexUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAILY_LIMIT = "daily_limit";
  private Long dailyLimit;

  public static final String JSON_PROPERTY_DAILY_LIMIT_RESET = "daily_limit_reset";
  private LogsDailyLimitReset dailyLimitReset;

  public static final String JSON_PROPERTY_DAILY_LIMIT_WARNING_THRESHOLD_PERCENTAGE =
      "daily_limit_warning_threshold_percentage";
  private Double dailyLimitWarningThresholdPercentage;

  public static final String JSON_PROPERTY_DISABLE_DAILY_LIMIT = "disable_daily_limit";
  private Boolean disableDailyLimit;

  public static final String JSON_PROPERTY_EXCLUSION_FILTERS = "exclusion_filters";
  private List<LogsExclusion> exclusionFilters = null;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsFilter filter;

  public static final String JSON_PROPERTY_NUM_FLEX_LOGS_RETENTION_DAYS =
      "num_flex_logs_retention_days";
  private Long numFlexLogsRetentionDays;

  public static final String JSON_PROPERTY_NUM_RETENTION_DAYS = "num_retention_days";
  private Long numRetentionDays;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public LogsIndexUpdateRequest() {}

  @JsonCreator
  public LogsIndexUpdateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER) LogsFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
  }

  public LogsIndexUpdateRequest dailyLimit(Long dailyLimit) {
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

  public LogsIndexUpdateRequest dailyLimitReset(LogsDailyLimitReset dailyLimitReset) {
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

  public LogsIndexUpdateRequest dailyLimitWarningThresholdPercentage(
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

  public LogsIndexUpdateRequest disableDailyLimit(Boolean disableDailyLimit) {
    this.disableDailyLimit = disableDailyLimit;
    return this;
  }

  /**
   * If true, sets the <code>daily_limit</code> value to null and the index is not limited on a
   * daily basis (any specified <code>daily_limit</code> value in the request is ignored). If false
   * or omitted, the index's current <code>daily_limit</code> is maintained.
   *
   * @return disableDailyLimit
   */
  @jakarta.annotation.Nullable
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

  public LogsIndexUpdateRequest filter(LogsFilter filter) {
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

  public LogsIndexUpdateRequest numFlexLogsRetentionDays(Long numFlexLogsRetentionDays) {
    this.numFlexLogsRetentionDays = numFlexLogsRetentionDays;
    return this;
  }

  /**
   * The total number of days logs are stored in Standard and Flex Tier before being deleted from
   * the index. If Standard Tier is enabled on this index, logs are first retained in Standard Tier
   * for the number of days specified through <code>num_retention_days</code>, and then stored in
   * Flex Tier until the number of days specified in <code>num_flex_logs_retention_days</code> is
   * reached. The available values depend on retention plans specified in your organization's
   * contract/subscriptions.
   *
   * <p><strong>Note</strong>: Changing this value affects all logs already in this index. It may
   * also affect billing.
   *
   * @return numFlexLogsRetentionDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_FLEX_LOGS_RETENTION_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumFlexLogsRetentionDays() {
    return numFlexLogsRetentionDays;
  }

  public void setNumFlexLogsRetentionDays(Long numFlexLogsRetentionDays) {
    this.numFlexLogsRetentionDays = numFlexLogsRetentionDays;
  }

  public LogsIndexUpdateRequest numRetentionDays(Long numRetentionDays) {
    this.numRetentionDays = numRetentionDays;
    return this;
  }

  /**
   * The number of days logs are stored in Standard Tier before aging into the Flex Tier or being
   * deleted from the index. The available values depend on retention plans specified in your
   * organization's contract/subscriptions.
   *
   * <p><strong>Note</strong>: Changing this value affects all logs already in this index. It may
   * also affect billing.
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

  public LogsIndexUpdateRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LogsIndexUpdateRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags associated with the index. Tags must be in <code>key:value</code> format.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return LogsIndexUpdateRequest
   */
  @JsonAnySetter
  public LogsIndexUpdateRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsIndexUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsIndexUpdateRequest logsIndexUpdateRequest = (LogsIndexUpdateRequest) o;
    return Objects.equals(this.dailyLimit, logsIndexUpdateRequest.dailyLimit)
        && Objects.equals(this.dailyLimitReset, logsIndexUpdateRequest.dailyLimitReset)
        && Objects.equals(
            this.dailyLimitWarningThresholdPercentage,
            logsIndexUpdateRequest.dailyLimitWarningThresholdPercentage)
        && Objects.equals(this.disableDailyLimit, logsIndexUpdateRequest.disableDailyLimit)
        && Objects.equals(this.exclusionFilters, logsIndexUpdateRequest.exclusionFilters)
        && Objects.equals(this.filter, logsIndexUpdateRequest.filter)
        && Objects.equals(
            this.numFlexLogsRetentionDays, logsIndexUpdateRequest.numFlexLogsRetentionDays)
        && Objects.equals(this.numRetentionDays, logsIndexUpdateRequest.numRetentionDays)
        && Objects.equals(this.tags, logsIndexUpdateRequest.tags)
        && Objects.equals(this.additionalProperties, logsIndexUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dailyLimit,
        dailyLimitReset,
        dailyLimitWarningThresholdPercentage,
        disableDailyLimit,
        exclusionFilters,
        filter,
        numFlexLogsRetentionDays,
        numRetentionDays,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsIndexUpdateRequest {\n");
    sb.append("    dailyLimit: ").append(toIndentedString(dailyLimit)).append("\n");
    sb.append("    dailyLimitReset: ").append(toIndentedString(dailyLimitReset)).append("\n");
    sb.append("    dailyLimitWarningThresholdPercentage: ")
        .append(toIndentedString(dailyLimitWarningThresholdPercentage))
        .append("\n");
    sb.append("    disableDailyLimit: ").append(toIndentedString(disableDailyLimit)).append("\n");
    sb.append("    exclusionFilters: ").append(toIndentedString(exclusionFilters)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    numFlexLogsRetentionDays: ")
        .append(toIndentedString(numFlexLogsRetentionDays))
        .append("\n");
    sb.append("    numRetentionDays: ").append(toIndentedString(numRetentionDays)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
