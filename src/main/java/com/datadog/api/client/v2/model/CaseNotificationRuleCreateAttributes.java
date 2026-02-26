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

/** Notification rule creation attributes */
@JsonPropertyOrder({
  CaseNotificationRuleCreateAttributes.JSON_PROPERTY_IS_ENABLED,
  CaseNotificationRuleCreateAttributes.JSON_PROPERTY_QUERY,
  CaseNotificationRuleCreateAttributes.JSON_PROPERTY_RECIPIENTS,
  CaseNotificationRuleCreateAttributes.JSON_PROPERTY_TRIGGERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseNotificationRuleCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = true;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RECIPIENTS = "recipients";
  private List<CaseNotificationRuleRecipient> recipients = new ArrayList<>();

  public static final String JSON_PROPERTY_TRIGGERS = "triggers";
  private List<CaseNotificationRuleTrigger> triggers = new ArrayList<>();

  public CaseNotificationRuleCreateAttributes() {}

  @JsonCreator
  public CaseNotificationRuleCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_RECIPIENTS)
          List<CaseNotificationRuleRecipient> recipients,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRIGGERS)
          List<CaseNotificationRuleTrigger> triggers) {
    this.recipients = recipients;
    this.triggers = triggers;
  }

  public CaseNotificationRuleCreateAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the notification rule is enabled
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public CaseNotificationRuleCreateAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query to filter cases for this notification rule
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public CaseNotificationRuleCreateAttributes recipients(
      List<CaseNotificationRuleRecipient> recipients) {
    this.recipients = recipients;
    for (CaseNotificationRuleRecipient item : recipients) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CaseNotificationRuleCreateAttributes addRecipientsItem(
      CaseNotificationRuleRecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    this.unparsed |= recipientsItem.unparsed;
    return this;
  }

  /**
   * List of notification recipients
   *
   * @return recipients
   */
  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CaseNotificationRuleRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<CaseNotificationRuleRecipient> recipients) {
    this.recipients = recipients;
  }

  public CaseNotificationRuleCreateAttributes triggers(List<CaseNotificationRuleTrigger> triggers) {
    this.triggers = triggers;
    for (CaseNotificationRuleTrigger item : triggers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CaseNotificationRuleCreateAttributes addTriggersItem(
      CaseNotificationRuleTrigger triggersItem) {
    this.triggers.add(triggersItem);
    this.unparsed |= triggersItem.unparsed;
    return this;
  }

  /**
   * List of triggers for this notification rule
   *
   * @return triggers
   */
  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CaseNotificationRuleTrigger> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<CaseNotificationRuleTrigger> triggers) {
    this.triggers = triggers;
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
   * @return CaseNotificationRuleCreateAttributes
   */
  @JsonAnySetter
  public CaseNotificationRuleCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseNotificationRuleCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseNotificationRuleCreateAttributes caseNotificationRuleCreateAttributes =
        (CaseNotificationRuleCreateAttributes) o;
    return Objects.equals(this.isEnabled, caseNotificationRuleCreateAttributes.isEnabled)
        && Objects.equals(this.query, caseNotificationRuleCreateAttributes.query)
        && Objects.equals(this.recipients, caseNotificationRuleCreateAttributes.recipients)
        && Objects.equals(this.triggers, caseNotificationRuleCreateAttributes.triggers)
        && Objects.equals(
            this.additionalProperties, caseNotificationRuleCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, query, recipients, triggers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseNotificationRuleCreateAttributes {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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
