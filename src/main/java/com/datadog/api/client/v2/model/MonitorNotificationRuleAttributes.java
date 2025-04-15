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

/** Attributes of the monitor notification rule. */
@JsonPropertyOrder({
  MonitorNotificationRuleAttributes.JSON_PROPERTY_FILTER,
  MonitorNotificationRuleAttributes.JSON_PROPERTY_NAME,
  MonitorNotificationRuleAttributes.JSON_PROPERTY_RECIPIENTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorNotificationRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private MonitorNotificationRuleFilter filter;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RECIPIENTS = "recipients";
  private List<String> recipients = new ArrayList<>();

  public MonitorNotificationRuleAttributes() {}

  @JsonCreator
  public MonitorNotificationRuleAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECIPIENTS) List<String> recipients) {
    this.name = name;
    this.recipients = recipients;
  }

  public MonitorNotificationRuleAttributes filter(MonitorNotificationRuleFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * Filter used to associate the notification rule with monitors.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorNotificationRuleFilter getFilter() {
    return filter;
  }

  public void setFilter(MonitorNotificationRuleFilter filter) {
    this.filter = filter;
  }

  public MonitorNotificationRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the monitor notification rule.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MonitorNotificationRuleAttributes recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public MonitorNotificationRuleAttributes addRecipientsItem(String recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * A list of recipients to notify. Uses the same format as the monitor <code>message</code> field.
   * Must not start with an '@'.
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

  /** Return true if this MonitorNotificationRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorNotificationRuleAttributes monitorNotificationRuleAttributes =
        (MonitorNotificationRuleAttributes) o;
    return Objects.equals(this.filter, monitorNotificationRuleAttributes.filter)
        && Objects.equals(this.name, monitorNotificationRuleAttributes.name)
        && Objects.equals(this.recipients, monitorNotificationRuleAttributes.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, name, recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorNotificationRuleAttributes {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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
