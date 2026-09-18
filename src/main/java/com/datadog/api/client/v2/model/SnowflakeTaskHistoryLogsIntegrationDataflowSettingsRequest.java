/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Settings of the task history logs dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  SnowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_TASK_HISTORY_LOGS_INTERVAL_MIN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TASK_HISTORY_LOGS_INTERVAL_MIN =
      "task_history_logs_interval_min";
  private Long taskHistoryLogsIntervalMin;

  public SnowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest taskHistoryLogsIntervalMin(
      Long taskHistoryLogsIntervalMin) {
    this.taskHistoryLogsIntervalMin = taskHistoryLogsIntervalMin;
    return this;
  }

  /**
   * How often task history logs are collected, in minutes. One of <code>5</code>, <code>15</code>,
   * <code>30</code>, <code>60</code>, or <code>1440</code>. Defaults to <code>5</code>.
   *
   * @return taskHistoryLogsIntervalMin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_HISTORY_LOGS_INTERVAL_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTaskHistoryLogsIntervalMin() {
    return taskHistoryLogsIntervalMin;
  }

  public void setTaskHistoryLogsIntervalMin(Long taskHistoryLogsIntervalMin) {
    this.taskHistoryLogsIntervalMin = taskHistoryLogsIntervalMin;
  }

  /**
   * Return true if this SnowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest
        snowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest =
            (SnowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
        this.taskHistoryLogsIntervalMin,
        snowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest.taskHistoryLogsIntervalMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskHistoryLogsIntervalMin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest {\n");
    sb.append("    taskHistoryLogsIntervalMin: ")
        .append(toIndentedString(taskHistoryLogsIntervalMin))
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
