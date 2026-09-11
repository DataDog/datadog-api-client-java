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

/** Settings of the account usage metrics dataflow. */
@JsonPropertyOrder({
  SnowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_ACCOUNT_USAGE_METRICS_AGGREGATE_LAST_24H
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_USAGE_METRICS_AGGREGATE_LAST_24H =
      "account_usage_metrics_aggregate_last_24h";
  private Boolean accountUsageMetricsAggregateLast24h;

  public SnowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse
      accountUsageMetricsAggregateLast24h(Boolean accountUsageMetricsAggregateLast24h) {
    this.accountUsageMetricsAggregateLast24h = accountUsageMetricsAggregateLast24h;
    return this;
  }

  /**
   * Period each metric aggregates over. When <code>true</code>, metrics aggregate the past 24 hours
   * on a rolling basis; when <code>false</code>, they aggregate the current day so far.
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
   * @return SnowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse
   */
  @JsonAnySetter
  public SnowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse putAdditionalProperty(
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
   * Return true if this SnowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse object is
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
    SnowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse
        snowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse =
            (SnowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse) o;
    return Objects.equals(
            this.accountUsageMetricsAggregateLast24h,
            snowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse
                .accountUsageMetricsAggregateLast24h)
        && Objects.equals(
            this.additionalProperties,
            snowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUsageMetricsAggregateLast24h, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeAccountUsageMetricsIntegrationDataflowSettingsResponse {\n");
    sb.append("    accountUsageMetricsAggregateLast24h: ")
        .append(toIndentedString(accountUsageMetricsAggregateLast24h))
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
