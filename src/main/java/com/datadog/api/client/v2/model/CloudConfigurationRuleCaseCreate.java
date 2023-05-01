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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Description of signals. */
@JsonPropertyOrder({
  CloudConfigurationRuleCaseCreate.JSON_PROPERTY_NOTIFICATIONS,
  CloudConfigurationRuleCaseCreate.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudConfigurationRuleCaseCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<String> notifications = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecurityMonitoringRuleSeverity status;

  public CloudConfigurationRuleCaseCreate() {}

  @JsonCreator
  public CloudConfigurationRuleCaseCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          SecurityMonitoringRuleSeverity status) {
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public CloudConfigurationRuleCaseCreate notifications(List<String> notifications) {
    this.notifications = notifications;
    return this;
  }

  public CloudConfigurationRuleCaseCreate addNotificationsItem(String notificationsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<String> notifications) {
    this.notifications = notifications;
  }

  public CloudConfigurationRuleCaseCreate status(SecurityMonitoringRuleSeverity status) {
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

  /** Return true if this CloudConfigurationRuleCaseCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConfigurationRuleCaseCreate cloudConfigurationRuleCaseCreate =
        (CloudConfigurationRuleCaseCreate) o;
    return Objects.equals(this.notifications, cloudConfigurationRuleCaseCreate.notifications)
        && Objects.equals(this.status, cloudConfigurationRuleCaseCreate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConfigurationRuleCaseCreate {\n");
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
