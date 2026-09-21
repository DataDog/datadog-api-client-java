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

/**
 * Settings of the event table dataflow. Each record type is collected independently so that you can
 * control ingestion costs, and every record type is ingested into Datadog as logs tagged with its
 * <code>record_type</code>.
 */
@JsonPropertyOrder({
  SnowflakeEventTableLogsIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_EVENT_TABLE_EVENTS_ENABLED,
  SnowflakeEventTableLogsIntegrationDataflowSettingsResponse.JSON_PROPERTY_EVENT_TABLE_LOGS_ENABLED,
  SnowflakeEventTableLogsIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_EVENT_TABLE_LOGS_INTERVAL_MIN,
  SnowflakeEventTableLogsIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_EVENT_TABLE_SPAN_EVENTS_ENABLED,
  SnowflakeEventTableLogsIntegrationDataflowSettingsResponse.JSON_PROPERTY_EVENT_TABLE_SPANS_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeEventTableLogsIntegrationDataflowSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_TABLE_EVENTS_ENABLED =
      "event_table_events_enabled";
  private Boolean eventTableEventsEnabled;

  public static final String JSON_PROPERTY_EVENT_TABLE_LOGS_ENABLED = "event_table_logs_enabled";
  private Boolean eventTableLogsEnabled;

  public static final String JSON_PROPERTY_EVENT_TABLE_LOGS_INTERVAL_MIN =
      "event_table_logs_interval_min";
  private Long eventTableLogsIntervalMin;

  public static final String JSON_PROPERTY_EVENT_TABLE_SPAN_EVENTS_ENABLED =
      "event_table_span_events_enabled";
  private Boolean eventTableSpanEventsEnabled;

  public static final String JSON_PROPERTY_EVENT_TABLE_SPANS_ENABLED = "event_table_spans_enabled";
  private Boolean eventTableSpansEnabled;

  public SnowflakeEventTableLogsIntegrationDataflowSettingsResponse eventTableEventsEnabled(
      Boolean eventTableEventsEnabled) {
    this.eventTableEventsEnabled = eventTableEventsEnabled;
    return this;
  }

  /**
   * Whether records with a <code>record_type</code> of <code>event</code> are collected.
   *
   * @return eventTableEventsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TABLE_EVENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEventTableEventsEnabled() {
    return eventTableEventsEnabled;
  }

  public void setEventTableEventsEnabled(Boolean eventTableEventsEnabled) {
    this.eventTableEventsEnabled = eventTableEventsEnabled;
  }

  public SnowflakeEventTableLogsIntegrationDataflowSettingsResponse eventTableLogsEnabled(
      Boolean eventTableLogsEnabled) {
    this.eventTableLogsEnabled = eventTableLogsEnabled;
    return this;
  }

  /**
   * Whether records with a <code>record_type</code> of <code>log</code> are collected.
   *
   * @return eventTableLogsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TABLE_LOGS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEventTableLogsEnabled() {
    return eventTableLogsEnabled;
  }

  public void setEventTableLogsEnabled(Boolean eventTableLogsEnabled) {
    this.eventTableLogsEnabled = eventTableLogsEnabled;
  }

  public SnowflakeEventTableLogsIntegrationDataflowSettingsResponse eventTableLogsIntervalMin(
      Long eventTableLogsIntervalMin) {
    this.eventTableLogsIntervalMin = eventTableLogsIntervalMin;
    return this;
  }

  /**
   * How often event table records are collected, in minutes.
   *
   * @return eventTableLogsIntervalMin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TABLE_LOGS_INTERVAL_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEventTableLogsIntervalMin() {
    return eventTableLogsIntervalMin;
  }

  public void setEventTableLogsIntervalMin(Long eventTableLogsIntervalMin) {
    this.eventTableLogsIntervalMin = eventTableLogsIntervalMin;
  }

  public SnowflakeEventTableLogsIntegrationDataflowSettingsResponse eventTableSpanEventsEnabled(
      Boolean eventTableSpanEventsEnabled) {
    this.eventTableSpanEventsEnabled = eventTableSpanEventsEnabled;
    return this;
  }

  /**
   * Whether records with a <code>record_type</code> of <code>span_event</code> are collected.
   *
   * @return eventTableSpanEventsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TABLE_SPAN_EVENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEventTableSpanEventsEnabled() {
    return eventTableSpanEventsEnabled;
  }

  public void setEventTableSpanEventsEnabled(Boolean eventTableSpanEventsEnabled) {
    this.eventTableSpanEventsEnabled = eventTableSpanEventsEnabled;
  }

  public SnowflakeEventTableLogsIntegrationDataflowSettingsResponse eventTableSpansEnabled(
      Boolean eventTableSpansEnabled) {
    this.eventTableSpansEnabled = eventTableSpansEnabled;
    return this;
  }

  /**
   * Whether records with a <code>record_type</code> of <code>span</code> are collected.
   *
   * @return eventTableSpansEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TABLE_SPANS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEventTableSpansEnabled() {
    return eventTableSpansEnabled;
  }

  public void setEventTableSpansEnabled(Boolean eventTableSpansEnabled) {
    this.eventTableSpansEnabled = eventTableSpansEnabled;
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
   * @return SnowflakeEventTableLogsIntegrationDataflowSettingsResponse
   */
  @JsonAnySetter
  public SnowflakeEventTableLogsIntegrationDataflowSettingsResponse putAdditionalProperty(
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
   * Return true if this SnowflakeEventTableLogsIntegrationDataflowSettingsResponse object is equal
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
    SnowflakeEventTableLogsIntegrationDataflowSettingsResponse
        snowflakeEventTableLogsIntegrationDataflowSettingsResponse =
            (SnowflakeEventTableLogsIntegrationDataflowSettingsResponse) o;
    return Objects.equals(
            this.eventTableEventsEnabled,
            snowflakeEventTableLogsIntegrationDataflowSettingsResponse.eventTableEventsEnabled)
        && Objects.equals(
            this.eventTableLogsEnabled,
            snowflakeEventTableLogsIntegrationDataflowSettingsResponse.eventTableLogsEnabled)
        && Objects.equals(
            this.eventTableLogsIntervalMin,
            snowflakeEventTableLogsIntegrationDataflowSettingsResponse.eventTableLogsIntervalMin)
        && Objects.equals(
            this.eventTableSpanEventsEnabled,
            snowflakeEventTableLogsIntegrationDataflowSettingsResponse.eventTableSpanEventsEnabled)
        && Objects.equals(
            this.eventTableSpansEnabled,
            snowflakeEventTableLogsIntegrationDataflowSettingsResponse.eventTableSpansEnabled)
        && Objects.equals(
            this.additionalProperties,
            snowflakeEventTableLogsIntegrationDataflowSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        eventTableEventsEnabled,
        eventTableLogsEnabled,
        eventTableLogsIntervalMin,
        eventTableSpanEventsEnabled,
        eventTableSpansEnabled,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeEventTableLogsIntegrationDataflowSettingsResponse {\n");
    sb.append("    eventTableEventsEnabled: ")
        .append(toIndentedString(eventTableEventsEnabled))
        .append("\n");
    sb.append("    eventTableLogsEnabled: ")
        .append(toIndentedString(eventTableLogsEnabled))
        .append("\n");
    sb.append("    eventTableLogsIntervalMin: ")
        .append(toIndentedString(eventTableLogsIntervalMin))
        .append("\n");
    sb.append("    eventTableSpanEventsEnabled: ")
        .append(toIndentedString(eventTableSpanEventsEnabled))
        .append("\n");
    sb.append("    eventTableSpansEnabled: ")
        .append(toIndentedString(eventTableSpansEnabled))
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
