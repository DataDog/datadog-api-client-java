/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Object containing indexed logs usage aggregated across organizations and months for a retention
 * period.
 */
@JsonPropertyOrder({
  LogsRetentionAggSumUsage.JSON_PROPERTY_LOGS_INDEXED_LOGS_USAGE_AGG_SUM,
  LogsRetentionAggSumUsage.JSON_PROPERTY_LOGS_LIVE_INDEXED_LOGS_USAGE_AGG_SUM,
  LogsRetentionAggSumUsage.JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_LOGS_USAGE_AGG_SUM,
  LogsRetentionAggSumUsage.JSON_PROPERTY_RETENTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsRetentionAggSumUsage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOGS_INDEXED_LOGS_USAGE_AGG_SUM =
      "logs_indexed_logs_usage_agg_sum";
  private Long logsIndexedLogsUsageAggSum;

  public static final String JSON_PROPERTY_LOGS_LIVE_INDEXED_LOGS_USAGE_AGG_SUM =
      "logs_live_indexed_logs_usage_agg_sum";
  private Long logsLiveIndexedLogsUsageAggSum;

  public static final String JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_LOGS_USAGE_AGG_SUM =
      "logs_rehydrated_indexed_logs_usage_agg_sum";
  private Long logsRehydratedIndexedLogsUsageAggSum;

  public static final String JSON_PROPERTY_RETENTION = "retention";
  private String retention;

  public LogsRetentionAggSumUsage logsIndexedLogsUsageAggSum(Long logsIndexedLogsUsageAggSum) {
    this.logsIndexedLogsUsageAggSum = logsIndexedLogsUsageAggSum;
    return this;
  }

  /**
   * Total indexed logs for this retention period.
   *
   * @return logsIndexedLogsUsageAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_LOGS_USAGE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogsIndexedLogsUsageAggSum() {
    return logsIndexedLogsUsageAggSum;
  }

  public void setLogsIndexedLogsUsageAggSum(Long logsIndexedLogsUsageAggSum) {
    this.logsIndexedLogsUsageAggSum = logsIndexedLogsUsageAggSum;
  }

  public LogsRetentionAggSumUsage logsLiveIndexedLogsUsageAggSum(
      Long logsLiveIndexedLogsUsageAggSum) {
    this.logsLiveIndexedLogsUsageAggSum = logsLiveIndexedLogsUsageAggSum;
    return this;
  }

  /**
   * Live indexed logs for this retention period.
   *
   * @return logsLiveIndexedLogsUsageAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_LIVE_INDEXED_LOGS_USAGE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogsLiveIndexedLogsUsageAggSum() {
    return logsLiveIndexedLogsUsageAggSum;
  }

  public void setLogsLiveIndexedLogsUsageAggSum(Long logsLiveIndexedLogsUsageAggSum) {
    this.logsLiveIndexedLogsUsageAggSum = logsLiveIndexedLogsUsageAggSum;
  }

  public LogsRetentionAggSumUsage logsRehydratedIndexedLogsUsageAggSum(
      Long logsRehydratedIndexedLogsUsageAggSum) {
    this.logsRehydratedIndexedLogsUsageAggSum = logsRehydratedIndexedLogsUsageAggSum;
    return this;
  }

  /**
   * Rehydrated indexed logs for this retention period.
   *
   * @return logsRehydratedIndexedLogsUsageAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_LOGS_USAGE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogsRehydratedIndexedLogsUsageAggSum() {
    return logsRehydratedIndexedLogsUsageAggSum;
  }

  public void setLogsRehydratedIndexedLogsUsageAggSum(Long logsRehydratedIndexedLogsUsageAggSum) {
    this.logsRehydratedIndexedLogsUsageAggSum = logsRehydratedIndexedLogsUsageAggSum;
  }

  public LogsRetentionAggSumUsage retention(String retention) {
    this.retention = retention;
    return this;
  }

  /**
   * The retention period in days or "custom" for all custom retention periods.
   *
   * @return retention
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRetention() {
    return retention;
  }

  public void setRetention(String retention) {
    this.retention = retention;
  }

  /** Return true if this LogsRetentionAggSumUsage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsRetentionAggSumUsage logsRetentionAggSumUsage = (LogsRetentionAggSumUsage) o;
    return Objects.equals(
            this.logsIndexedLogsUsageAggSum, logsRetentionAggSumUsage.logsIndexedLogsUsageAggSum)
        && Objects.equals(
            this.logsLiveIndexedLogsUsageAggSum,
            logsRetentionAggSumUsage.logsLiveIndexedLogsUsageAggSum)
        && Objects.equals(
            this.logsRehydratedIndexedLogsUsageAggSum,
            logsRetentionAggSumUsage.logsRehydratedIndexedLogsUsageAggSum)
        && Objects.equals(this.retention, logsRetentionAggSumUsage.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        logsIndexedLogsUsageAggSum,
        logsLiveIndexedLogsUsageAggSum,
        logsRehydratedIndexedLogsUsageAggSum,
        retention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsRetentionAggSumUsage {\n");
    sb.append("    logsIndexedLogsUsageAggSum: ")
        .append(toIndentedString(logsIndexedLogsUsageAggSum))
        .append("\n");
    sb.append("    logsLiveIndexedLogsUsageAggSum: ")
        .append(toIndentedString(logsLiveIndexedLogsUsageAggSum))
        .append("\n");
    sb.append("    logsRehydratedIndexedLogsUsageAggSum: ")
        .append(toIndentedString(logsRehydratedIndexedLogsUsageAggSum))
        .append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
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
