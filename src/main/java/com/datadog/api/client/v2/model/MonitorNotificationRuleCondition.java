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

/**
 * A conditional recipient rule composed of a <code>scope</code> (the matching condition) and <code>
 * recipients</code> (who to notify when it matches).
 */
@JsonPropertyOrder({
  MonitorNotificationRuleCondition.JSON_PROPERTY_RECIPIENTS,
  MonitorNotificationRuleCondition.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorNotificationRuleCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RECIPIENTS = "recipients";
  private List<String> recipients = new ArrayList<>();

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public MonitorNotificationRuleCondition() {}

  @JsonCreator
  public MonitorNotificationRuleCondition(
      @JsonProperty(required = true, value = JSON_PROPERTY_RECIPIENTS) List<String> recipients,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) String scope) {
    this.recipients = recipients;
    this.scope = scope;
  }

  public MonitorNotificationRuleCondition recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public MonitorNotificationRuleCondition addRecipientsItem(String recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * A list of recipients to notify. Uses the same format as the monitor <code>message</code> field.
   * Must not start with an '@'. Cannot be used with <code>conditional_recipients</code>.
   *
   * @return recipients
   */
  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }

  public MonitorNotificationRuleCondition scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Defines the condition under which the recipients are notified. Supported formats: - Monitor
   * status condition using <code>transition_type:&lt;status&gt;</code>, for example <code>
   * transition_type:is_alert</code>. - A single tag key:value pair, for example <code>env:prod
   * </code>.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
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
   * @return MonitorNotificationRuleCondition
   */
  @JsonAnySetter
  public MonitorNotificationRuleCondition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonitorNotificationRuleCondition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorNotificationRuleCondition monitorNotificationRuleCondition =
        (MonitorNotificationRuleCondition) o;
    return Objects.equals(this.recipients, monitorNotificationRuleCondition.recipients)
        && Objects.equals(this.scope, monitorNotificationRuleCondition.scope)
        && Objects.equals(
            this.additionalProperties, monitorNotificationRuleCondition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients, scope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorNotificationRuleCondition {\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
