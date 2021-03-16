/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Monitor state for a single group. */
@ApiModel(description = "Monitor state for a single group.")
@JsonPropertyOrder({
  MonitorStateGroup.JSON_PROPERTY_LAST_NODATA_TS,
  MonitorStateGroup.JSON_PROPERTY_LAST_NOTIFIED_TS,
  MonitorStateGroup.JSON_PROPERTY_LAST_RESOLVED_TS,
  MonitorStateGroup.JSON_PROPERTY_LAST_TRIGGERED_TS,
  MonitorStateGroup.JSON_PROPERTY_NAME,
  MonitorStateGroup.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MonitorStateGroup {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latest timestamp the monitor was in NO_DATA state.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latest timestamp of the notification sent for this monitor group.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latest timestamp the monitor group was resolved.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latest timestamp the monitor group triggered.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the monitor.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MonitorStateGroup status(MonitorOverallStates status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorOverallStates getStatus() {
    return status;
  }

  public void setStatus(MonitorOverallStates status) {
    this.status = status;
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
        && Objects.equals(this.status, monitorStateGroup.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lastNodataTs, lastNotifiedTs, lastResolvedTs, lastTriggeredTs, name, status);
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
    sb.append("}");
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
