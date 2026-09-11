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

/** Settings of the account usage metrics dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  SnowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_ACCOUNT_USAGE_METRICS_AGGREGATE_LAST_24H
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_USAGE_METRICS_AGGREGATE_LAST_24H =
      "account_usage_metrics_aggregate_last_24h";
  private Boolean accountUsageMetricsAggregateLast24h;

  public SnowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest
      accountUsageMetricsAggregateLast24h(Boolean accountUsageMetricsAggregateLast24h) {
    this.accountUsageMetricsAggregateLast24h = accountUsageMetricsAggregateLast24h;
    return this;
  }

  /**
   * Period each metric aggregates over. Set to <code>true</code> to aggregate the past 24 hours on
   * a rolling basis, or <code>false</code> to aggregate the current day so far. Defaults to <code>
   * false</code>.
   *
   * @return accountUsageMetricsAggregateLast24h
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_USAGE_METRICS_AGGREGATE_LAST_24H)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAccountUsageMetricsAggregateLast24h() {
    return accountUsageMetricsAggregateLast24h;
  }

  public void setAccountUsageMetricsAggregateLast24h(Boolean accountUsageMetricsAggregateLast24h) {
    this.accountUsageMetricsAggregateLast24h = accountUsageMetricsAggregateLast24h;
  }

  /**
   * Return true if this SnowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest object is
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
    SnowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest
        snowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest =
            (SnowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
        this.accountUsageMetricsAggregateLast24h,
        snowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest
            .accountUsageMetricsAggregateLast24h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUsageMetricsAggregateLast24h);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest {\n");
    sb.append("    accountUsageMetricsAggregateLast24h: ")
        .append(toIndentedString(accountUsageMetricsAggregateLast24h))
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
