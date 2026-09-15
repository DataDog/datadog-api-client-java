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

/**
 * Records from your Snowflake event tables, used to monitor application behavior and identify
 * issues. <code>enabled</code> turns the dataflow on and off as a whole, and the per-record-type
 * toggles in <code>settings</code> select which kinds of record it collects while it is on. The
 * Snowflake role needs usage granted on the database, the schema, and the event table itself;
 * without those grants this dataflow collects no data.
 */
@JsonPropertyOrder({
  SnowflakeEventTableLogsIntegrationDataflowRequest.JSON_PROPERTY_ENABLED,
  SnowflakeEventTableLogsIntegrationDataflowRequest.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeEventTableLogsIntegrationDataflowRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private SnowflakeEventTableLogsIntegrationDataflowSettingsRequest settings;

  public SnowflakeEventTableLogsIntegrationDataflowRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether Datadog collects this data. Defaults to <code>false</code>; set to <code>true</code> to
   * start collection.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SnowflakeEventTableLogsIntegrationDataflowRequest settings(
      SnowflakeEventTableLogsIntegrationDataflowSettingsRequest settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings of the event table dataflow. Each record type is collected independently so that you
   * can control ingestion costs, and every record type is ingested into Datadog as logs tagged with
   * its <code>record_type</code>. Only the fields provided are changed.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeEventTableLogsIntegrationDataflowSettingsRequest getSettings() {
    return settings;
  }

  public void setSettings(SnowflakeEventTableLogsIntegrationDataflowSettingsRequest settings) {
    this.settings = settings;
    if (settings != null) {
      this.unparsed |= settings.unparsed;
    }
  }

  /** Return true if this SnowflakeEventTableLogsIntegrationDataflowRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeEventTableLogsIntegrationDataflowRequest
        snowflakeEventTableLogsIntegrationDataflowRequest =
            (SnowflakeEventTableLogsIntegrationDataflowRequest) o;
    return Objects.equals(this.enabled, snowflakeEventTableLogsIntegrationDataflowRequest.enabled)
        && Objects.equals(
            this.settings, snowflakeEventTableLogsIntegrationDataflowRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeEventTableLogsIntegrationDataflowRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
