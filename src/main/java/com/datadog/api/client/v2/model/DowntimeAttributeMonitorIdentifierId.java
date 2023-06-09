/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object of the monitor identifier. */
@JsonPropertyOrder({DowntimeAttributeMonitorIdentifierId.JSON_PROPERTY_MONITOR_ID})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeAttributeMonitorIdentifierId {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public DowntimeAttributeMonitorIdentifierId() {}

  @JsonCreator
  public DowntimeAttributeMonitorIdentifierId(
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITOR_ID) Long monitorId) {
    this.monitorId = monitorId;
  }

  public DowntimeAttributeMonitorIdentifierId monitorId(Long monitorId) {
    this.monitorId = monitorId;
    return this;
  }

  /**
   * ID of the monitor to prevent notifications.
   *
   * @return monitorId
   */
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMonitorId() {
    return monitorId;
  }

  public void setMonitorId(Long monitorId) {
    this.monitorId = monitorId;
  }

  /** Return true if this DowntimeAttributeMonitorIdentifierId object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeAttributeMonitorIdentifierId downtimeAttributeMonitorIdentifierId =
        (DowntimeAttributeMonitorIdentifierId) o;
    return Objects.equals(this.monitorId, downtimeAttributeMonitorIdentifierId.monitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeAttributeMonitorIdentifierId {\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
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
