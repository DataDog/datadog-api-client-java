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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a Jira account */
@JsonPropertyOrder({
  JiraAccountAttributes.JSON_PROPERTY_CONSUMER_KEY,
  JiraAccountAttributes.JSON_PROPERTY_INSTANCE_URL,
  JiraAccountAttributes.JSON_PROPERTY_LAST_WEBHOOK_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraAccountAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONSUMER_KEY = "consumer_key";
  private String consumerKey;

  public static final String JSON_PROPERTY_INSTANCE_URL = "instance_url";
  private String instanceUrl;

  public static final String JSON_PROPERTY_LAST_WEBHOOK_TIMESTAMP = "last_webhook_timestamp";
  private OffsetDateTime lastWebhookTimestamp;

  public JiraAccountAttributes() {}

  @JsonCreator
  public JiraAccountAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONSUMER_KEY) String consumerKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_URL) String instanceUrl) {
    this.consumerKey = consumerKey;
    this.instanceUrl = instanceUrl;
  }

  public JiraAccountAttributes consumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }

  /**
   * The consumer key for the Jira account
   *
   * @return consumerKey
   */
  @JsonProperty(JSON_PROPERTY_CONSUMER_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConsumerKey() {
    return consumerKey;
  }

  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }

  public JiraAccountAttributes instanceUrl(String instanceUrl) {
    this.instanceUrl = instanceUrl;
    return this;
  }

  /**
   * The URL of the Jira instance
   *
   * @return instanceUrl
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInstanceUrl() {
    return instanceUrl;
  }

  public void setInstanceUrl(String instanceUrl) {
    this.instanceUrl = instanceUrl;
  }

  public JiraAccountAttributes lastWebhookTimestamp(OffsetDateTime lastWebhookTimestamp) {
    this.lastWebhookTimestamp = lastWebhookTimestamp;
    return this;
  }

  /**
   * Timestamp of the last webhook received
   *
   * @return lastWebhookTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_WEBHOOK_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastWebhookTimestamp() {
    return lastWebhookTimestamp;
  }

  public void setLastWebhookTimestamp(OffsetDateTime lastWebhookTimestamp) {
    this.lastWebhookTimestamp = lastWebhookTimestamp;
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
   * @return JiraAccountAttributes
   */
  @JsonAnySetter
  public JiraAccountAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JiraAccountAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraAccountAttributes jiraAccountAttributes = (JiraAccountAttributes) o;
    return Objects.equals(this.consumerKey, jiraAccountAttributes.consumerKey)
        && Objects.equals(this.instanceUrl, jiraAccountAttributes.instanceUrl)
        && Objects.equals(this.lastWebhookTimestamp, jiraAccountAttributes.lastWebhookTimestamp)
        && Objects.equals(this.additionalProperties, jiraAccountAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerKey, instanceUrl, lastWebhookTimestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraAccountAttributes {\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
    sb.append("    lastWebhookTimestamp: ")
        .append(toIndentedString(lastWebhookTimestamp))
        .append("\n");
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
