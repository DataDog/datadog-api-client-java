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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The preview result for a single rule type. */
@JsonPropertyOrder({
  NotificationRulePreviewResult.JSON_PROPERTY_NOTIFICATION_STATUS,
  NotificationRulePreviewResult.JSON_PROPERTY_RULE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotificationRulePreviewResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NOTIFICATION_STATUS = "notification_status";
  private NotificationRulePreviewNotificationStatus notificationStatus;

  public static final String JSON_PROPERTY_RULE_TYPE = "rule_type";
  private RuleTypesItems ruleType;

  public NotificationRulePreviewResult() {}

  @JsonCreator
  public NotificationRulePreviewResult(
      @JsonProperty(required = true, value = JSON_PROPERTY_NOTIFICATION_STATUS)
          NotificationRulePreviewNotificationStatus notificationStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_TYPE) RuleTypesItems ruleType) {
    this.notificationStatus = notificationStatus;
    this.unparsed |= !notificationStatus.isValid();
    this.ruleType = ruleType;
    this.unparsed |= !ruleType.isValid();
  }

  public NotificationRulePreviewResult notificationStatus(
      NotificationRulePreviewNotificationStatus notificationStatus) {
    this.notificationStatus = notificationStatus;
    this.unparsed |= !notificationStatus.isValid();
    return this;
  }

  /**
   * The notification status for the given rule type. <code>SUCCESS</code> means a matching event
   * was found and the notification was sent successfully. <code>DEFAULT</code> means no matching
   * event was found and a default placeholder notification was sent instead. <code>ERROR</code>
   * means an error occurred while sending the notification.
   *
   * @return notificationStatus
   */
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationRulePreviewNotificationStatus getNotificationStatus() {
    return notificationStatus;
  }

  public void setNotificationStatus(NotificationRulePreviewNotificationStatus notificationStatus) {
    if (!notificationStatus.isValid()) {
      this.unparsed = true;
    }
    this.notificationStatus = notificationStatus;
  }

  public NotificationRulePreviewResult ruleType(RuleTypesItems ruleType) {
    this.ruleType = ruleType;
    this.unparsed |= !ruleType.isValid();
    return this;
  }

  /**
   * Security rule type which can be used in security rules. Signal-based notification rules can
   * filter signals based on rule types application_security, log_detection, workload_security,
   * signal_correlation, cloud_configuration and infrastructure_configuration. Vulnerability-based
   * notification rules can filter vulnerabilities based on rule types
   * application_code_vulnerability, application_library_vulnerability, attack_path,
   * container_image_vulnerability, identity_risk, misconfiguration, api_security,
   * host_vulnerability, iac_misconfiguration, sast_vulnerability and secret_vulnerability.
   *
   * @return ruleType
   */
  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RuleTypesItems getRuleType() {
    return ruleType;
  }

  public void setRuleType(RuleTypesItems ruleType) {
    if (!ruleType.isValid()) {
      this.unparsed = true;
    }
    this.ruleType = ruleType;
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
   * @return NotificationRulePreviewResult
   */
  @JsonAnySetter
  public NotificationRulePreviewResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotificationRulePreviewResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRulePreviewResult notificationRulePreviewResult = (NotificationRulePreviewResult) o;
    return Objects.equals(this.notificationStatus, notificationRulePreviewResult.notificationStatus)
        && Objects.equals(this.ruleType, notificationRulePreviewResult.ruleType)
        && Objects.equals(
            this.additionalProperties, notificationRulePreviewResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationStatus, ruleType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRulePreviewResult {\n");
    sb.append("    notificationStatus: ").append(toIndentedString(notificationStatus)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
