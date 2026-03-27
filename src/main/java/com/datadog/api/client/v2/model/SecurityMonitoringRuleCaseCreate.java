/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Case when signal is generated. */
@JsonPropertyOrder({
  SecurityMonitoringRuleCaseCreate.JSON_PROPERTY_ACTIONS,
  SecurityMonitoringRuleCaseCreate.JSON_PROPERTY_CONDITION,
  SecurityMonitoringRuleCaseCreate.JSON_PROPERTY_NAME,
  SecurityMonitoringRuleCaseCreate.JSON_PROPERTY_NOTIFICATIONS,
  SecurityMonitoringRuleCaseCreate.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleCaseCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<SecurityMonitoringRuleCaseAction> actions = null;

  public static final String JSON_PROPERTY_CONDITION = "condition";
  private String condition;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<String> notifications = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecurityMonitoringRuleSeverity status;

  public SecurityMonitoringRuleCaseCreate() {}

  @JsonCreator
  public SecurityMonitoringRuleCaseCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          SecurityMonitoringRuleSeverity status) {
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public SecurityMonitoringRuleCaseCreate actions(List<SecurityMonitoringRuleCaseAction> actions) {
    this.actions = actions;
    for (SecurityMonitoringRuleCaseAction item : actions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringRuleCaseCreate addActionsItem(
      SecurityMonitoringRuleCaseAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    this.unparsed |= actionsItem.unparsed;
    return this;
  }

  /**
   * Action to perform for each rule case.
   *
   * @return actions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringRuleCaseAction> getActions() {
    return actions;
  }

  public void setActions(List<SecurityMonitoringRuleCaseAction> actions) {
    this.actions = actions;
  }

  public SecurityMonitoringRuleCaseCreate condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * A case contains logical operations (<code>&gt;</code>,<code>&gt;=</code>, <code>&amp;&amp;
   * </code>, <code>||</code>) to determine if a signal should be generated based on the event
   * counts in the previously defined queries.
   *
   * @return condition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public SecurityMonitoringRuleCaseCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the case.
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

  public SecurityMonitoringRuleCaseCreate notifications(List<String> notifications) {
    this.notifications = notifications;
    return this;
  }

  public SecurityMonitoringRuleCaseCreate addNotificationsItem(String notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * Notification targets.
   *
   * @return notifications
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<String> notifications) {
    this.notifications = notifications;
  }

  public SecurityMonitoringRuleCaseCreate status(SecurityMonitoringRuleSeverity status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Severity of the Security Signal.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringRuleSeverity getStatus() {
    return status;
  }

  public void setStatus(SecurityMonitoringRuleSeverity status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return SecurityMonitoringRuleCaseCreate
   */
  @JsonAnySetter
  public SecurityMonitoringRuleCaseCreate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringRuleCaseCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleCaseCreate securityMonitoringRuleCaseCreate =
        (SecurityMonitoringRuleCaseCreate) o;
    return Objects.equals(this.actions, securityMonitoringRuleCaseCreate.actions)
        && Objects.equals(this.condition, securityMonitoringRuleCaseCreate.condition)
        && Objects.equals(this.name, securityMonitoringRuleCaseCreate.name)
        && Objects.equals(this.notifications, securityMonitoringRuleCaseCreate.notifications)
        && Objects.equals(this.status, securityMonitoringRuleCaseCreate.status)
        && Objects.equals(
            this.additionalProperties, securityMonitoringRuleCaseCreate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, condition, name, notifications, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleCaseCreate {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
