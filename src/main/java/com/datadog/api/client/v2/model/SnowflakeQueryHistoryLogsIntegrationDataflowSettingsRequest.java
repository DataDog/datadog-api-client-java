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

/** Settings of the query history logs dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_JOIN_QUERY_HISTORY_WITH_ACCESS_HISTORY_ENABLED,
  SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_QUERY_HISTORY_LOGS_INTERVAL_MIN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_JOIN_QUERY_HISTORY_WITH_ACCESS_HISTORY_ENABLED =
      "join_query_history_with_access_history_enabled";
  private Boolean joinQueryHistoryWithAccessHistoryEnabled;

  public static final String JSON_PROPERTY_QUERY_HISTORY_LOGS_INTERVAL_MIN =
      "query_history_logs_interval_min";
  private Long queryHistoryLogsIntervalMin;

  public SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest
      joinQueryHistoryWithAccessHistoryEnabled(Boolean joinQueryHistoryWithAccessHistoryEnabled) {
    this.joinQueryHistoryWithAccessHistoryEnabled = joinQueryHistoryWithAccessHistoryEnabled;
    return this;
  }

  /**
   * Whether query logs are joined with Snowflake access history, which adds the objects each query
   * read and wrote so you can follow how data is used and where it came from. Defaults to <code>
   * false</code>.
   *
   * @return joinQueryHistoryWithAccessHistoryEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOIN_QUERY_HISTORY_WITH_ACCESS_HISTORY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getJoinQueryHistoryWithAccessHistoryEnabled() {
    return joinQueryHistoryWithAccessHistoryEnabled;
  }

  public void setJoinQueryHistoryWithAccessHistoryEnabled(
      Boolean joinQueryHistoryWithAccessHistoryEnabled) {
    this.joinQueryHistoryWithAccessHistoryEnabled = joinQueryHistoryWithAccessHistoryEnabled;
  }

  public SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest queryHistoryLogsIntervalMin(
      Long queryHistoryLogsIntervalMin) {
    this.queryHistoryLogsIntervalMin = queryHistoryLogsIntervalMin;
    return this;
  }

  /**
   * How often query history logs are collected, in minutes. One of <code>5</code>, <code>15</code>,
   * <code>30</code>, <code>60</code>, <code>720</code>, or <code>1440</code>. Defaults to <code>5
   * </code>.
   *
   * @return queryHistoryLogsIntervalMin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_HISTORY_LOGS_INTERVAL_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getQueryHistoryLogsIntervalMin() {
    return queryHistoryLogsIntervalMin;
  }

  public void setQueryHistoryLogsIntervalMin(Long queryHistoryLogsIntervalMin) {
    this.queryHistoryLogsIntervalMin = queryHistoryLogsIntervalMin;
  }

  /**
   * Return true if this SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest object is equal
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
    SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest
        snowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest =
            (SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
            this.joinQueryHistoryWithAccessHistoryEnabled,
            snowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest
                .joinQueryHistoryWithAccessHistoryEnabled)
        && Objects.equals(
            this.queryHistoryLogsIntervalMin,
            snowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest
                .queryHistoryLogsIntervalMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joinQueryHistoryWithAccessHistoryEnabled, queryHistoryLogsIntervalMin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest {\n");
    sb.append("    joinQueryHistoryWithAccessHistoryEnabled: ")
        .append(toIndentedString(joinQueryHistoryWithAccessHistoryEnabled))
        .append("\n");
    sb.append("    queryHistoryLogsIntervalMin: ")
        .append(toIndentedString(queryHistoryLogsIntervalMin))
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
