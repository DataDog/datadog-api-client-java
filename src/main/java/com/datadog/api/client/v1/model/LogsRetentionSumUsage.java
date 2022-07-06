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

/** Object containing indexed logs usage grouped by retention period and summed. */
@JsonPropertyOrder({
  LogsRetentionSumUsage.JSON_PROPERTY_LOGS_INDEXED_LOGS_USAGE_SUM,
  LogsRetentionSumUsage.JSON_PROPERTY_LOGS_LIVE_INDEXED_LOGS_USAGE_SUM,
  LogsRetentionSumUsage.JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_LOGS_USAGE_SUM,
  LogsRetentionSumUsage.JSON_PROPERTY_RETENTION
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsRetentionSumUsage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOGS_INDEXED_LOGS_USAGE_SUM =
      "logs_indexed_logs_usage_sum";
  private Long logsIndexedLogsUsageSum;

  public static final String JSON_PROPERTY_LOGS_LIVE_INDEXED_LOGS_USAGE_SUM =
      "logs_live_indexed_logs_usage_sum";
  private Long logsLiveIndexedLogsUsageSum;

  public static final String JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_LOGS_USAGE_SUM =
      "logs_rehydrated_indexed_logs_usage_sum";
  private Long logsRehydratedIndexedLogsUsageSum;

  public static final String JSON_PROPERTY_RETENTION = "retention";
  private String retention;

  public LogsRetentionSumUsage logsIndexedLogsUsageSum(Long logsIndexedLogsUsageSum) {
    this.logsIndexedLogsUsageSum = logsIndexedLogsUsageSum;
    return this;
  }

  /**
   * Total indexed logs for this retention period.
   *
   * @return logsIndexedLogsUsageSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_LOGS_USAGE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogsIndexedLogsUsageSum() {
    return logsIndexedLogsUsageSum;
  }

  public void setLogsIndexedLogsUsageSum(Long logsIndexedLogsUsageSum) {
    this.logsIndexedLogsUsageSum = logsIndexedLogsUsageSum;
  }

  public LogsRetentionSumUsage logsLiveIndexedLogsUsageSum(Long logsLiveIndexedLogsUsageSum) {
    this.logsLiveIndexedLogsUsageSum = logsLiveIndexedLogsUsageSum;
    return this;
  }

  /**
   * Live indexed logs for this retention period.
   *
   * @return logsLiveIndexedLogsUsageSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_LIVE_INDEXED_LOGS_USAGE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogsLiveIndexedLogsUsageSum() {
    return logsLiveIndexedLogsUsageSum;
  }

  public void setLogsLiveIndexedLogsUsageSum(Long logsLiveIndexedLogsUsageSum) {
    this.logsLiveIndexedLogsUsageSum = logsLiveIndexedLogsUsageSum;
  }

  public LogsRetentionSumUsage logsRehydratedIndexedLogsUsageSum(
      Long logsRehydratedIndexedLogsUsageSum) {
    this.logsRehydratedIndexedLogsUsageSum = logsRehydratedIndexedLogsUsageSum;
    return this;
  }

  /**
   * Rehydrated indexed logs for this retention period.
   *
   * @return logsRehydratedIndexedLogsUsageSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_LOGS_USAGE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogsRehydratedIndexedLogsUsageSum() {
    return logsRehydratedIndexedLogsUsageSum;
  }

  public void setLogsRehydratedIndexedLogsUsageSum(Long logsRehydratedIndexedLogsUsageSum) {
    this.logsRehydratedIndexedLogsUsageSum = logsRehydratedIndexedLogsUsageSum;
  }

  public LogsRetentionSumUsage retention(String retention) {
    this.retention = retention;
    return this;
  }

  /**
   * The retention period in days or "custom" for all custom retention periods.
   *
   * @return retention
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRetention() {
    return retention;
  }

  public void setRetention(String retention) {
    this.retention = retention;
  }

  /** Return true if this LogsRetentionSumUsage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsRetentionSumUsage logsRetentionSumUsage = (LogsRetentionSumUsage) o;
    return Objects.equals(
            this.logsIndexedLogsUsageSum, logsRetentionSumUsage.logsIndexedLogsUsageSum)
        && Objects.equals(
            this.logsLiveIndexedLogsUsageSum, logsRetentionSumUsage.logsLiveIndexedLogsUsageSum)
        && Objects.equals(
            this.logsRehydratedIndexedLogsUsageSum,
            logsRetentionSumUsage.logsRehydratedIndexedLogsUsageSum)
        && Objects.equals(this.retention, logsRetentionSumUsage.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        logsIndexedLogsUsageSum,
        logsLiveIndexedLogsUsageSum,
        logsRehydratedIndexedLogsUsageSum,
        retention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsRetentionSumUsage {\n");
    sb.append("    logsIndexedLogsUsageSum: ")
        .append(toIndentedString(logsIndexedLogsUsageSum))
        .append("\n");
    sb.append("    logsLiveIndexedLogsUsageSum: ")
        .append(toIndentedString(logsLiveIndexedLogsUsageSum))
        .append("\n");
    sb.append("    logsRehydratedIndexedLogsUsageSum: ")
        .append(toIndentedString(logsRehydratedIndexedLogsUsageSum))
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
