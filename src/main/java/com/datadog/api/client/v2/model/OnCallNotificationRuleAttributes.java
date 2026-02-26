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
   * <p>Attributes for an on-call notification rule.</p>
 */
@JsonPropertyOrder({
  OnCallNotificationRuleAttributes.JSON_PROPERTY_CATEGORY,
  OnCallNotificationRuleAttributes.JSON_PROPERTY_CHANNEL_SETTINGS,
  OnCallNotificationRuleAttributes.JSON_PROPERTY_DELAY_MINUTES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnCallNotificationRuleAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private OnCallNotificationRuleCategory category = OnCallNotificationRuleCategory.HIGH_URGENCY;

  public static final String JSON_PROPERTY_CHANNEL_SETTINGS = "channel_settings";
  private OnCallNotificationRuleChannelSettings channelSettings;

  public static final String JSON_PROPERTY_DELAY_MINUTES = "delay_minutes";
  private Long delayMinutes;

  public OnCallNotificationRuleAttributes category(OnCallNotificationRuleCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * <p>Specifies the category a notification rule will apply to</p>
   * @return category
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OnCallNotificationRuleCategory getCategory() {
        return category;
      }
  public void setCategory(OnCallNotificationRuleCategory category) {
    if (!category.isValid()) {
        this.unparsed = true;
    }
    this.category = category;
  }
  public OnCallNotificationRuleAttributes channelSettings(OnCallNotificationRuleChannelSettings channelSettings) {
    this.channelSettings = channelSettings;
    this.unparsed |= channelSettings.unparsed;
    return this;
  }

  /**
   * <p>Defines the configuration for a channel associated with a notification rule</p>
   * @return channelSettings
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANNEL_SETTINGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OnCallNotificationRuleChannelSettings getChannelSettings() {
        return channelSettings;
      }
  public void setChannelSettings(OnCallNotificationRuleChannelSettings channelSettings) {
    this.channelSettings = channelSettings;
  }
  public OnCallNotificationRuleAttributes delayMinutes(Long delayMinutes) {
    this.delayMinutes = delayMinutes;
    return this;
  }

  /**
   * <p>The number of minutes that will elapse before this rule is evaluated.  0 indicates immediate evaluation</p>
   * @return delayMinutes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DELAY_MINUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getDelayMinutes() {
        return delayMinutes;
      }
  public void setDelayMinutes(Long delayMinutes) {
    this.delayMinutes = delayMinutes;
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
   * @return OnCallNotificationRuleAttributes
   */
  @JsonAnySetter
  public OnCallNotificationRuleAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this OnCallNotificationRuleAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnCallNotificationRuleAttributes onCallNotificationRuleAttributes = (OnCallNotificationRuleAttributes) o;
    return Objects.equals(this.category, onCallNotificationRuleAttributes.category) && Objects.equals(this.channelSettings, onCallNotificationRuleAttributes.channelSettings) && Objects.equals(this.delayMinutes, onCallNotificationRuleAttributes.delayMinutes) && Objects.equals(this.additionalProperties, onCallNotificationRuleAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(category,channelSettings,delayMinutes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnCallNotificationRuleAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    channelSettings: ").append(toIndentedString(channelSettings)).append("\n");
    sb.append("    delayMinutes: ").append(toIndentedString(delayMinutes)).append("\n");
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
