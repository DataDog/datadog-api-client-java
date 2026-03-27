/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Monitor state for a single group. */
@JsonPropertyOrder({
  MonitorStateGroup.JSON_PROPERTY_LAST_NODATA_TS,
  MonitorStateGroup.JSON_PROPERTY_LAST_NOTIFIED_TS,
  MonitorStateGroup.JSON_PROPERTY_LAST_RESOLVED_TS,
  MonitorStateGroup.JSON_PROPERTY_LAST_TRIGGERED_TS,
  MonitorStateGroup.JSON_PROPERTY_NAME,
  MonitorStateGroup.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorStateGroup {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAST_NODATA_TS = "last_nodata_ts";
  private Long lastNodataTs;

  public static final String JSON_PROPERTY_LAST_NOTIFIED_TS = "last_notified_ts";
  private Long lastNotifiedTs;

  public static final String JSON_PROPERTY_LAST_RESOLVED_TS = "last_resolved_ts";
  private Long lastResolvedTs;

  public static final String JSON_PROPERTY_LAST_TRIGGERED_TS = "last_triggered_ts";
  private Long lastTriggeredTs;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private MonitorOverallStates status;

  public MonitorStateGroup lastNodataTs(Long lastNodataTs) {
    this.lastNodataTs = lastNodataTs;
    return this;
  }

  /**
   * Latest timestamp the monitor was in NO_DATA state.
   *
   * @return lastNodataTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NODATA_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastNodataTs() {
    return lastNodataTs;
  }

  public void setLastNodataTs(Long lastNodataTs) {
    this.lastNodataTs = lastNodataTs;
  }

  public MonitorStateGroup lastNotifiedTs(Long lastNotifiedTs) {
    this.lastNotifiedTs = lastNotifiedTs;
    return this;
  }

  /**
   * Latest timestamp of the notification sent for this monitor group.
   *
   * @return lastNotifiedTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NOTIFIED_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastNotifiedTs() {
    return lastNotifiedTs;
  }

  public void setLastNotifiedTs(Long lastNotifiedTs) {
    this.lastNotifiedTs = lastNotifiedTs;
  }

  public MonitorStateGroup lastResolvedTs(Long lastResolvedTs) {
    this.lastResolvedTs = lastResolvedTs;
    return this;
  }

  /**
   * Latest timestamp the monitor group was resolved.
   *
   * @return lastResolvedTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RESOLVED_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastResolvedTs() {
    return lastResolvedTs;
  }

  public void setLastResolvedTs(Long lastResolvedTs) {
    this.lastResolvedTs = lastResolvedTs;
  }

  public MonitorStateGroup lastTriggeredTs(Long lastTriggeredTs) {
    this.lastTriggeredTs = lastTriggeredTs;
    return this;
  }

  /**
   * Latest timestamp the monitor group triggered.
   *
   * @return lastTriggeredTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_TRIGGERED_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastTriggeredTs() {
    return lastTriggeredTs;
  }

  public void setLastTriggeredTs(Long lastTriggeredTs) {
    this.lastTriggeredTs = lastTriggeredTs;
  }

  public MonitorStateGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the monitor.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The different states your monitor can be in.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorOverallStates getStatus() {
    return status;
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
   * @return MonitorStateGroup
   */
  @JsonAnySetter
  public MonitorStateGroup putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonitorStateGroup object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorStateGroup monitorStateGroup = (MonitorStateGroup) o;
    return Objects.equals(this.lastNodataTs, monitorStateGroup.lastNodataTs)
        && Objects.equals(this.lastNotifiedTs, monitorStateGroup.lastNotifiedTs)
        && Objects.equals(this.lastResolvedTs, monitorStateGroup.lastResolvedTs)
        && Objects.equals(this.lastTriggeredTs, monitorStateGroup.lastTriggeredTs)
        && Objects.equals(this.name, monitorStateGroup.name)
        && Objects.equals(this.status, monitorStateGroup.status)
        && Objects.equals(this.additionalProperties, monitorStateGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lastNodataTs,
        lastNotifiedTs,
        lastResolvedTs,
        lastTriggeredTs,
        name,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorStateGroup {\n");
    sb.append("    lastNodataTs: ").append(toIndentedString(lastNodataTs)).append("\n");
    sb.append("    lastNotifiedTs: ").append(toIndentedString(lastNotifiedTs)).append("\n");
    sb.append("    lastResolvedTs: ").append(toIndentedString(lastResolvedTs)).append("\n");
    sb.append("    lastTriggeredTs: ").append(toIndentedString(lastTriggeredTs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
