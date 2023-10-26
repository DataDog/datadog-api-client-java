/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The EventBridge configuration for one AWS account. */
@JsonPropertyOrder({
  AWSEventBridgeAccountConfiguration.JSON_PROPERTY_ACCOUNT_ID,
  AWSEventBridgeAccountConfiguration.JSON_PROPERTY_EVENT_HUBS,
  AWSEventBridgeAccountConfiguration.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSEventBridgeAccountConfiguration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_EVENT_HUBS = "eventHubs";
  private List<AWSEventBridgeSource> eventHubs = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public AWSEventBridgeAccountConfiguration accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Your AWS Account ID without dashes.
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AWSEventBridgeAccountConfiguration eventHubs(List<AWSEventBridgeSource> eventHubs) {
    this.eventHubs = eventHubs;
    for (AWSEventBridgeSource item : eventHubs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AWSEventBridgeAccountConfiguration addEventHubsItem(AWSEventBridgeSource eventHubsItem) {
    if (this.eventHubs == null) {
      this.eventHubs = new ArrayList<>();
    }
    this.eventHubs.add(eventHubsItem);
    this.unparsed |= eventHubsItem.unparsed;
    return this;
  }

  /**
   * Array of AWS event sources associated with this account.
   *
   * @return eventHubs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_HUBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AWSEventBridgeSource> getEventHubs() {
    return eventHubs;
  }

  public void setEventHubs(List<AWSEventBridgeSource> eventHubs) {
    this.eventHubs = eventHubs;
  }

  public AWSEventBridgeAccountConfiguration tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AWSEventBridgeAccountConfiguration addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags (in the form <code>key:value</code>) which are added to all hosts and metrics
   * reporting through the main AWS integration.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return AWSEventBridgeAccountConfiguration
   */
  @JsonAnySetter
  public AWSEventBridgeAccountConfiguration putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSEventBridgeAccountConfiguration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSEventBridgeAccountConfiguration awsEventBridgeAccountConfiguration =
        (AWSEventBridgeAccountConfiguration) o;
    return Objects.equals(this.accountId, awsEventBridgeAccountConfiguration.accountId)
        && Objects.equals(this.eventHubs, awsEventBridgeAccountConfiguration.eventHubs)
        && Objects.equals(this.tags, awsEventBridgeAccountConfiguration.tags)
        && Objects.equals(
            this.additionalProperties, awsEventBridgeAccountConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, eventHubs, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSEventBridgeAccountConfiguration {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    eventHubs: ").append(toIndentedString(eventHubs)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
