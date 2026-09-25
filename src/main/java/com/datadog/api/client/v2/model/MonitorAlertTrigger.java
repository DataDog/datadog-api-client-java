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

/** A trigger created from a monitor alert. */
@JsonPropertyOrder({
  MonitorAlertTrigger.JSON_PROPERTY_MONITOR_ALERT_TRIGGER,
  MonitorAlertTrigger.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorAlertTrigger {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MONITOR_ALERT_TRIGGER = "monitor_alert_trigger";
  private MonitorAlertTriggerAttributes monitorAlertTrigger;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MonitorAlertTriggerType type;

  public MonitorAlertTrigger() {}

  @JsonCreator
  public MonitorAlertTrigger(
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITOR_ALERT_TRIGGER)
          MonitorAlertTriggerAttributes monitorAlertTrigger,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) MonitorAlertTriggerType type) {
    this.monitorAlertTrigger = monitorAlertTrigger;
    this.unparsed |= monitorAlertTrigger.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public MonitorAlertTrigger monitorAlertTrigger(
      MonitorAlertTriggerAttributes monitorAlertTrigger) {
    this.monitorAlertTrigger = monitorAlertTrigger;
    this.unparsed |= monitorAlertTrigger.unparsed;
    return this;
  }

  /**
   * Attributes for a monitor alert trigger.
   *
   * @return monitorAlertTrigger
   */
  @JsonProperty(JSON_PROPERTY_MONITOR_ALERT_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorAlertTriggerAttributes getMonitorAlertTrigger() {
    return monitorAlertTrigger;
  }

  public void setMonitorAlertTrigger(MonitorAlertTriggerAttributes monitorAlertTrigger) {
    this.monitorAlertTrigger = monitorAlertTrigger;
    if (monitorAlertTrigger != null) {
      this.unparsed |= monitorAlertTrigger.unparsed;
    }
  }

  public MonitorAlertTrigger type(MonitorAlertTriggerType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of monitor alert trigger.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorAlertTriggerType getType() {
    return type;
  }

  public void setType(MonitorAlertTriggerType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this MonitorAlertTrigger object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorAlertTrigger monitorAlertTrigger = (MonitorAlertTrigger) o;
    return Objects.equals(this.monitorAlertTrigger, monitorAlertTrigger.monitorAlertTrigger)
        && Objects.equals(this.type, monitorAlertTrigger.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorAlertTrigger, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorAlertTrigger {\n");
    sb.append("    monitorAlertTrigger: ")
        .append(toIndentedString(monitorAlertTrigger))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
