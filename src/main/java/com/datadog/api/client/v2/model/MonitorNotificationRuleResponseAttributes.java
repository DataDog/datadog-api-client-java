/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes of the monitor notification rule.</p>
 */
@JsonPropertyOrder({
  MonitorNotificationRuleResponseAttributes.JSON_PROPERTY_CONDITIONAL_RECIPIENTS,
  MonitorNotificationRuleResponseAttributes.JSON_PROPERTY_CREATED,
  MonitorNotificationRuleResponseAttributes.JSON_PROPERTY_FILTER,
  MonitorNotificationRuleResponseAttributes.JSON_PROPERTY_MODIFIED,
  MonitorNotificationRuleResponseAttributes.JSON_PROPERTY_NAME,
  MonitorNotificationRuleResponseAttributes.JSON_PROPERTY_RECIPIENTS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorNotificationRuleResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_RECIPIENTS = "conditional_recipients";
  private MonitorNotificationRuleConditionalRecipients conditionalRecipients;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private MonitorNotificationRuleFilter filter;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RECIPIENTS = "recipients";
  private List<String> recipients = null;

  public MonitorNotificationRuleResponseAttributes conditionalRecipients(MonitorNotificationRuleConditionalRecipients conditionalRecipients) {
    this.conditionalRecipients = conditionalRecipients;
    this.unparsed |= conditionalRecipients.unparsed;
    return this;
  }

  /**
   * <p>Use conditional recipients to define different recipients for different situations. Cannot be used with <code>recipients</code>.</p>
   * @return conditionalRecipients
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONDITIONAL_RECIPIENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorNotificationRuleConditionalRecipients getConditionalRecipients() {
        return conditionalRecipients;
      }
  public void setConditionalRecipients(MonitorNotificationRuleConditionalRecipients conditionalRecipients) {
    this.conditionalRecipients = conditionalRecipients;
  }
  public MonitorNotificationRuleResponseAttributes created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * <p>Creation time of the monitor notification rule.</p>
   * @return created
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreated() {
        return created;
      }
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }
  public MonitorNotificationRuleResponseAttributes filter(MonitorNotificationRuleFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>Specifies the matching criteria for monitor notifications.</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorNotificationRuleFilter getFilter() {
        return filter;
      }
  public void setFilter(MonitorNotificationRuleFilter filter) {
    this.filter = filter;
  }
  public MonitorNotificationRuleResponseAttributes modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * <p>Time the monitor notification rule was last modified.</p>
   * @return modified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModified() {
        return modified;
      }
  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }
  public MonitorNotificationRuleResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the monitor notification rule.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public MonitorNotificationRuleResponseAttributes recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }
  public MonitorNotificationRuleResponseAttributes addRecipientsItem(String recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * <p>A list of recipients to notify. Uses the same format as the monitor <code>message</code> field. Must not start with an '@'. Cannot be used with <code>conditional_recipients</code>.</p>
   * @return recipients
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RECIPIENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getRecipients() {
        return recipients;
      }
  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return MonitorNotificationRuleResponseAttributes
   */
  @JsonAnySetter
  public MonitorNotificationRuleResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this MonitorNotificationRuleResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorNotificationRuleResponseAttributes monitorNotificationRuleResponseAttributes = (MonitorNotificationRuleResponseAttributes) o;
    return Objects.equals(this.conditionalRecipients, monitorNotificationRuleResponseAttributes.conditionalRecipients) && Objects.equals(this.created, monitorNotificationRuleResponseAttributes.created) && Objects.equals(this.filter, monitorNotificationRuleResponseAttributes.filter) && Objects.equals(this.modified, monitorNotificationRuleResponseAttributes.modified) && Objects.equals(this.name, monitorNotificationRuleResponseAttributes.name) && Objects.equals(this.recipients, monitorNotificationRuleResponseAttributes.recipients) && Objects.equals(this.additionalProperties, monitorNotificationRuleResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(conditionalRecipients,created,filter,modified,name,recipients, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorNotificationRuleResponseAttributes {\n");
    sb.append("    conditionalRecipients: ").append(toIndentedString(conditionalRecipients)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
