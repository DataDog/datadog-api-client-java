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

/** Settings of the organization usage metrics dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  SnowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_ORGANIZATION_USAGE_METRICS_AGGREGATE_LAST_24H
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORGANIZATION_USAGE_METRICS_AGGREGATE_LAST_24H =
      "organization_usage_metrics_aggregate_last_24h";
  private Boolean organizationUsageMetricsAggregateLast24h;

  public SnowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest
      organizationUsageMetricsAggregateLast24h(Boolean organizationUsageMetricsAggregateLast24h) {
    this.organizationUsageMetricsAggregateLast24h = organizationUsageMetricsAggregateLast24h;
    return this;
  }

  /**
   * Period each metric aggregates over. Set to <code>true</code> to aggregate the past 24 hours on
   * a rolling basis, or <code>false</code> to aggregate the current day so far. Defaults to <code>
   * false</code>.
   *
   * @return organizationUsageMetricsAggregateLast24h
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_USAGE_METRICS_AGGREGATE_LAST_24H)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOrganizationUsageMetricsAggregateLast24h() {
    return organizationUsageMetricsAggregateLast24h;
  }

  public void setOrganizationUsageMetricsAggregateLast24h(
      Boolean organizationUsageMetricsAggregateLast24h) {
    this.organizationUsageMetricsAggregateLast24h = organizationUsageMetricsAggregateLast24h;
  }

  /**
   * Return true if this SnowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest object
   * is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest
        snowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest =
            (SnowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
        this.organizationUsageMetricsAggregateLast24h,
        snowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest
            .organizationUsageMetricsAggregateLast24h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationUsageMetricsAggregateLast24h);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest {\n");
    sb.append("    organizationUsageMetricsAggregateLast24h: ")
        .append(toIndentedString(organizationUsageMetricsAggregateLast24h))
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
