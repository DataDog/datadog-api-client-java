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
 * Use conditional recipients to define different recipients for different situations. Cannot be
 * used with <code>recipients</code>.
 */
@JsonPropertyOrder({
  MonitorNotificationRuleConditionalRecipients.JSON_PROPERTY_CONDITIONS,
  MonitorNotificationRuleConditionalRecipients.JSON_PROPERTY_FALLBACK_RECIPIENTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorNotificationRuleConditionalRecipients {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<MonitorNotificationRuleCondition> conditions = new ArrayList<>();

  public static final String JSON_PROPERTY_FALLBACK_RECIPIENTS = "fallback_recipients";
  private List<String> fallbackRecipients = null;

  public MonitorNotificationRuleConditionalRecipients() {}

  @JsonCreator
  public MonitorNotificationRuleConditionalRecipients(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONDITIONS)
          List<MonitorNotificationRuleCondition> conditions) {
    this.conditions = conditions;
  }

  public MonitorNotificationRuleConditionalRecipients conditions(
      List<MonitorNotificationRuleCondition> conditions) {
    this.conditions = conditions;
    for (MonitorNotificationRuleCondition item : conditions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonitorNotificationRuleConditionalRecipients addConditionsItem(
      MonitorNotificationRuleCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    this.unparsed |= conditionsItem.unparsed;
    return this;
  }

  /**
   * Conditions of the notification rule.
   *
   * @return conditions
   */
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<MonitorNotificationRuleCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<MonitorNotificationRuleCondition> conditions) {
    this.conditions = conditions;
  }

  public MonitorNotificationRuleConditionalRecipients fallbackRecipients(
      List<String> fallbackRecipients) {
    this.fallbackRecipients = fallbackRecipients;
    return this;
  }

  public MonitorNotificationRuleConditionalRecipients addFallbackRecipientsItem(
      String fallbackRecipientsItem) {
    if (this.fallbackRecipients == null) {
      this.fallbackRecipients = new ArrayList<>();
    }
    this.fallbackRecipients.add(fallbackRecipientsItem);
    return this;
  }

  /**
   * A list of recipients to notify. Uses the same format as the monitor <code>message</code> field.
   * Must not start with an '@'. Cannot be used with <code>conditional_recipients</code>.
   *
   * @return fallbackRecipients
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FALLBACK_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getFallbackRecipients() {
    return fallbackRecipients;
  }

  public void setFallbackRecipients(List<String> fallbackRecipients) {
    this.fallbackRecipients = fallbackRecipients;
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
   * @return MonitorNotificationRuleConditionalRecipients
   */
  @JsonAnySetter
  public MonitorNotificationRuleConditionalRecipients putAdditionalProperty(
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

  /** Return true if this MonitorNotificationRuleConditionalRecipients object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorNotificationRuleConditionalRecipients monitorNotificationRuleConditionalRecipients =
        (MonitorNotificationRuleConditionalRecipients) o;
    return Objects.equals(this.conditions, monitorNotificationRuleConditionalRecipients.conditions)
        && Objects.equals(
            this.fallbackRecipients,
            monitorNotificationRuleConditionalRecipients.fallbackRecipients)
        && Objects.equals(
            this.additionalProperties,
            monitorNotificationRuleConditionalRecipients.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, fallbackRecipients, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorNotificationRuleConditionalRecipients {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    fallbackRecipients: ").append(toIndentedString(fallbackRecipients)).append("\n");
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
