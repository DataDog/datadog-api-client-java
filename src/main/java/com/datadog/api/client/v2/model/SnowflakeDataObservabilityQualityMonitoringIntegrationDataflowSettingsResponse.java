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

/** Settings of the Data Observability dataflow. */
@JsonPropertyOrder({
  SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_DO_TABLE_CRAWLER_CRON,
  SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_SYNC_SNOWFLAKE_SYSTEM_DATABASE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DO_TABLE_CRAWLER_CRON = "do_table_crawler_cron";
  private String doTableCrawlerCron;

  public static final String JSON_PROPERTY_SYNC_SNOWFLAKE_SYSTEM_DATABASE =
      "sync_snowflake_system_database";
  private Boolean syncSnowflakeSystemDatabase;

  public SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      doTableCrawlerCron(String doTableCrawlerCron) {
    this.doTableCrawlerCron = doTableCrawlerCron;
    return this;
  }

  /**
   * Cron expression setting how often Datadog crawls your Snowflake table metadata.
   *
   * @return doTableCrawlerCron
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DO_TABLE_CRAWLER_CRON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDoTableCrawlerCron() {
    return doTableCrawlerCron;
  }

  public void setDoTableCrawlerCron(String doTableCrawlerCron) {
    this.doTableCrawlerCron = doTableCrawlerCron;
  }

  public SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      syncSnowflakeSystemDatabase(Boolean syncSnowflakeSystemDatabase) {
    this.syncSnowflakeSystemDatabase = syncSnowflakeSystemDatabase;
    return this;
  }

  /**
   * Whether metadata from the Snowflake <code>SNOWFLAKE</code> system database is included in Data
   * Observability alongside your own databases.
   *
   * @return syncSnowflakeSystemDatabase
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_SNOWFLAKE_SYSTEM_DATABASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSyncSnowflakeSystemDatabase() {
    return syncSnowflakeSystemDatabase;
  }

  public void setSyncSnowflakeSystemDatabase(Boolean syncSnowflakeSystemDatabase) {
    this.syncSnowflakeSystemDatabase = syncSnowflakeSystemDatabase;
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
   * @return SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
   */
  @JsonAnySetter
  public SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this
   * SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse object is equal
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
    SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
        snowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse =
            (SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse) o;
    return Objects.equals(
            this.doTableCrawlerCron,
            snowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
                .doTableCrawlerCron)
        && Objects.equals(
            this.syncSnowflakeSystemDatabase,
            snowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
                .syncSnowflakeSystemDatabase)
        && Objects.equals(
            this.additionalProperties,
            snowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doTableCrawlerCron, syncSnowflakeSystemDatabase, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse {\n");
    sb.append("    doTableCrawlerCron: ").append(toIndentedString(doTableCrawlerCron)).append("\n");
    sb.append("    syncSnowflakeSystemDatabase: ")
        .append(toIndentedString(syncSnowflakeSystemDatabase))
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
