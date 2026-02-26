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
import java.util.UUID;
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
   * <p>Object containing indexed logs usage grouped by retention period and summed.</p>
 */
@JsonPropertyOrder({
  LogsRetentionSumUsage.JSON_PROPERTY_LOGS_INDEXED_LOGS_USAGE_SUM,
  LogsRetentionSumUsage.JSON_PROPERTY_LOGS_LIVE_INDEXED_LOGS_USAGE_SUM,
  LogsRetentionSumUsage.JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_LOGS_USAGE_SUM,
  LogsRetentionSumUsage.JSON_PROPERTY_RETENTION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsRetentionSumUsage {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOGS_INDEXED_LOGS_USAGE_SUM = "logs_indexed_logs_usage_sum";
  private Long logsIndexedLogsUsageSum;

  public static final String JSON_PROPERTY_LOGS_LIVE_INDEXED_LOGS_USAGE_SUM = "logs_live_indexed_logs_usage_sum";
  private Long logsLiveIndexedLogsUsageSum;

  public static final String JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_LOGS_USAGE_SUM = "logs_rehydrated_indexed_logs_usage_sum";
  private Long logsRehydratedIndexedLogsUsageSum;

  public static final String JSON_PROPERTY_RETENTION = "retention";
  private String retention;

  public LogsRetentionSumUsage logsIndexedLogsUsageSum(Long logsIndexedLogsUsageSum) {
    this.logsIndexedLogsUsageSum = logsIndexedLogsUsageSum;
    return this;
  }

  /**
   * <p>Total indexed logs for this retention period.</p>
   * @return logsIndexedLogsUsageSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_LOGS_USAGE_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Live indexed logs for this retention period.</p>
   * @return logsLiveIndexedLogsUsageSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_LIVE_INDEXED_LOGS_USAGE_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLogsLiveIndexedLogsUsageSum() {
        return logsLiveIndexedLogsUsageSum;
      }
  public void setLogsLiveIndexedLogsUsageSum(Long logsLiveIndexedLogsUsageSum) {
    this.logsLiveIndexedLogsUsageSum = logsLiveIndexedLogsUsageSum;
  }
  public LogsRetentionSumUsage logsRehydratedIndexedLogsUsageSum(Long logsRehydratedIndexedLogsUsageSum) {
    this.logsRehydratedIndexedLogsUsageSum = logsRehydratedIndexedLogsUsageSum;
    return this;
  }

  /**
   * <p>Rehydrated indexed logs for this retention period.</p>
   * @return logsRehydratedIndexedLogsUsageSum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_LOGS_USAGE_SUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The retention period in days or "custom" for all custom retention periods.</p>
   * @return retention
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RETENTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRetention() {
        return retention;
      }
  public void setRetention(String retention) {
    this.retention = retention;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return LogsRetentionSumUsage
   */
  @JsonAnySetter
  public LogsRetentionSumUsage putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsRetentionSumUsage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsRetentionSumUsage logsRetentionSumUsage = (LogsRetentionSumUsage) o;
    return Objects.equals(this.logsIndexedLogsUsageSum, logsRetentionSumUsage.logsIndexedLogsUsageSum) && Objects.equals(this.logsLiveIndexedLogsUsageSum, logsRetentionSumUsage.logsLiveIndexedLogsUsageSum) && Objects.equals(this.logsRehydratedIndexedLogsUsageSum, logsRetentionSumUsage.logsRehydratedIndexedLogsUsageSum) && Objects.equals(this.retention, logsRetentionSumUsage.retention) && Objects.equals(this.additionalProperties, logsRetentionSumUsage.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(logsIndexedLogsUsageSum,logsLiveIndexedLogsUsageSum,logsRehydratedIndexedLogsUsageSum,retention, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsRetentionSumUsage {\n");
    sb.append("    logsIndexedLogsUsageSum: ").append(toIndentedString(logsIndexedLogsUsageSum)).append("\n");
    sb.append("    logsLiveIndexedLogsUsageSum: ").append(toIndentedString(logsLiveIndexedLogsUsageSum)).append("\n");
    sb.append("    logsRehydratedIndexedLogsUsageSum: ").append(toIndentedString(logsRehydratedIndexedLogsUsageSum)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
