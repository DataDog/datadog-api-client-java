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

/** Settings of the Data Observability dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_DO_TABLE_CRAWLER_CRON,
  SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_SYNC_SNOWFLAKE_SYSTEM_DATABASE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DO_TABLE_CRAWLER_CRON = "do_table_crawler_cron";
  private String doTableCrawlerCron;

  public static final String JSON_PROPERTY_SYNC_SNOWFLAKE_SYSTEM_DATABASE =
      "sync_snowflake_system_database";
  private Boolean syncSnowflakeSystemDatabase;

  public SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest
      doTableCrawlerCron(String doTableCrawlerCron) {
    this.doTableCrawlerCron = doTableCrawlerCron;
    return this;
  }

  /**
   * Cron expression setting how often Datadog crawls your Snowflake table metadata. It takes the
   * five standard fields, with the restriction that the month must be <code>*</code> and that the
   * day of the month and the day of the week cannot both be constrained. The Datadog UI offers
   * hourly (<code>0 * * * *</code>) and daily (<code>0 0 * * *</code>). Defaults to hourly.
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

  public SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest
      syncSnowflakeSystemDatabase(Boolean syncSnowflakeSystemDatabase) {
    this.syncSnowflakeSystemDatabase = syncSnowflakeSystemDatabase;
    return this;
  }

  /**
   * Whether metadata from the Snowflake <code>SNOWFLAKE</code> system database is included in Data
   * Observability alongside your own databases. Defaults to <code>true</code>.
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
   * Return true if this
   * SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest object is equal
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
    SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest
        snowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest =
            (SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
            this.doTableCrawlerCron,
            snowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest
                .doTableCrawlerCron)
        && Objects.equals(
            this.syncSnowflakeSystemDatabase,
            snowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest
                .syncSnowflakeSystemDatabase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doTableCrawlerCron, syncSnowflakeSystemDatabase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest {\n");
    sb.append("    doTableCrawlerCron: ").append(toIndentedString(doTableCrawlerCron)).append("\n");
    sb.append("    syncSnowflakeSystemDatabase: ")
        .append(toIndentedString(syncSnowflakeSystemDatabase))
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
