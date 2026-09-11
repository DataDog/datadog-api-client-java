/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Settings of the query history logs dataflow. */
@JsonPropertyOrder({
  SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_JOIN_QUERY_HISTORY_WITH_ACCESS_HISTORY_ENABLED,
  SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_QUERY_HISTORY_LOGS_INTERVAL_MIN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_JOIN_QUERY_HISTORY_WITH_ACCESS_HISTORY_ENABLED =
      "join_query_history_with_access_history_enabled";
  private Boolean joinQueryHistoryWithAccessHistoryEnabled;

  public static final String JSON_PROPERTY_QUERY_HISTORY_LOGS_INTERVAL_MIN =
      "query_history_logs_interval_min";
  private Long queryHistoryLogsIntervalMin;

  public SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse
      joinQueryHistoryWithAccessHistoryEnabled(Boolean joinQueryHistoryWithAccessHistoryEnabled) {
    this.joinQueryHistoryWithAccessHistoryEnabled = joinQueryHistoryWithAccessHistoryEnabled;
    return this;
  }

  /**
   * Whether query logs are joined with Snowflake access history, which adds the objects each query
   * read and wrote so you can follow how data is used and where it came from.
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

  public SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse queryHistoryLogsIntervalMin(
      Long queryHistoryLogsIntervalMin) {
    this.queryHistoryLogsIntervalMin = queryHistoryLogsIntervalMin;
    return this;
  }

  /**
   * How often query history logs are collected, in minutes.
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
   * @return SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse
   */
  @JsonAnySetter
  public SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse putAdditionalProperty(
      String key, Object value) {
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

  /**
   * Return true if this SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse
        snowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse =
            (SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse) o;
    return Objects.equals(
            this.joinQueryHistoryWithAccessHistoryEnabled,
            snowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse
                .joinQueryHistoryWithAccessHistoryEnabled)
        && Objects.equals(
            this.queryHistoryLogsIntervalMin,
            snowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse
                .queryHistoryLogsIntervalMin)
        && Objects.equals(
            this.additionalProperties,
            snowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        joinQueryHistoryWithAccessHistoryEnabled,
        queryHistoryLogsIntervalMin,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeQueryHistoryLogsIntegrationDataflowSettingsResponse {\n");
    sb.append("    joinQueryHistoryWithAccessHistoryEnabled: ")
        .append(toIndentedString(joinQueryHistoryWithAccessHistoryEnabled))
        .append("\n");
    sb.append("    queryHistoryLogsIntervalMin: ")
        .append(toIndentedString(queryHistoryLogsIntervalMin))
        .append("\n");
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
