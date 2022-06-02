/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Case when signal is generated. */
@JsonPropertyOrder({
  SecurityMonitoringRuleCase.JSON_PROPERTY_CONDITION,
  SecurityMonitoringRuleCase.JSON_PROPERTY_NAME,
  SecurityMonitoringRuleCase.JSON_PROPERTY_NOTIFICATIONS,
  SecurityMonitoringRuleCase.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleCase {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITION = "condition";
  private String condition;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<String> notifications = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecurityMonitoringRuleSeverity status;

  public SecurityMonitoringRuleCase condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * A rule case contains logical operations (<code>&gt;</code>,<code>&gt;=</code>, <code>&amp;&amp;
   * </code>, <code>||</code>) to determine if a signal should be generated based on the event
   * counts in the previously defined queries.
   *
   * @return condition
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public SecurityMonitoringRuleCase name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the case.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityMonitoringRuleCase notifications(List<String> notifications) {
    this.notifications = notifications;
    return this;
  }

  public SecurityMonitoringRuleCase addNotificationsItem(String notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * Notification targets for each rule case.
   *
   * @return notifications
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<String> notifications) {
    this.notifications = notifications;
  }

  public SecurityMonitoringRuleCase status(SecurityMonitoringRuleSeverity status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Severity of the Security Signal.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleSeverity getStatus() {
    return status;
  }

  public void setStatus(SecurityMonitoringRuleSeverity status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  /** Return true if this SecurityMonitoringRuleCase object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleCase securityMonitoringRuleCase = (SecurityMonitoringRuleCase) o;
    return Objects.equals(this.condition, securityMonitoringRuleCase.condition)
        && Objects.equals(this.name, securityMonitoringRuleCase.name)
        && Objects.equals(this.notifications, securityMonitoringRuleCase.notifications)
        && Objects.equals(this.status, securityMonitoringRuleCase.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, name, notifications, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleCase {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
