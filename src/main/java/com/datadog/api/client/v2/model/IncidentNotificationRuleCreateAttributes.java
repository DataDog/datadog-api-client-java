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
   * <p>The attributes for creating a notification rule.</p>
 */
@JsonPropertyOrder({
  IncidentNotificationRuleCreateAttributes.JSON_PROPERTY_CONDITIONS,
  IncidentNotificationRuleCreateAttributes.JSON_PROPERTY_ENABLED,
  IncidentNotificationRuleCreateAttributes.JSON_PROPERTY_HANDLES,
  IncidentNotificationRuleCreateAttributes.JSON_PROPERTY_RENOTIFY_ON,
  IncidentNotificationRuleCreateAttributes.JSON_PROPERTY_TRIGGER,
  IncidentNotificationRuleCreateAttributes.JSON_PROPERTY_VISIBILITY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentNotificationRuleCreateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<IncidentNotificationRuleConditionsItems> conditions = new ArrayList<>();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = false;

  public static final String JSON_PROPERTY_HANDLES = "handles";
  private List<String> handles = new ArrayList<>();

  public static final String JSON_PROPERTY_RENOTIFY_ON = "renotify_on";
  private List<String> renotifyOn = null;

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private String trigger;

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private IncidentNotificationRuleCreateAttributesVisibility visibility;

  public IncidentNotificationRuleCreateAttributes() {}

  @JsonCreator
  public IncidentNotificationRuleCreateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CONDITIONS)List<IncidentNotificationRuleConditionsItems> conditions,
            @JsonProperty(required=true, value=JSON_PROPERTY_HANDLES)List<String> handles,
            @JsonProperty(required=true, value=JSON_PROPERTY_TRIGGER)String trigger) {
        this.conditions = conditions;
        this.handles = handles;
        this.trigger = trigger;
  }
  public IncidentNotificationRuleCreateAttributes conditions(List<IncidentNotificationRuleConditionsItems> conditions) {
    this.conditions = conditions;
    for (IncidentNotificationRuleConditionsItems item : conditions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public IncidentNotificationRuleCreateAttributes addConditionsItem(IncidentNotificationRuleConditionsItems conditionsItem) {
    this.conditions.add(conditionsItem);
    this.unparsed |= conditionsItem.unparsed;
    return this;
  }

  /**
   * <p>The conditions that trigger this notification rule.</p>
   * @return conditions
  **/
      @JsonProperty(JSON_PROPERTY_CONDITIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<IncidentNotificationRuleConditionsItems> getConditions() {
        return conditions;
      }
  public void setConditions(List<IncidentNotificationRuleConditionsItems> conditions) {
    this.conditions = conditions;
  }
  public IncidentNotificationRuleCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the notification rule is enabled.</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public IncidentNotificationRuleCreateAttributes handles(List<String> handles) {
    this.handles = handles;
    return this;
  }
  public IncidentNotificationRuleCreateAttributes addHandlesItem(String handlesItem) {
    this.handles.add(handlesItem);
    return this;
  }

  /**
   * <p>The notification handles (targets) for this rule.</p>
   * @return handles
  **/
      @JsonProperty(JSON_PROPERTY_HANDLES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getHandles() {
        return handles;
      }
  public void setHandles(List<String> handles) {
    this.handles = handles;
  }
  public IncidentNotificationRuleCreateAttributes renotifyOn(List<String> renotifyOn) {
    this.renotifyOn = renotifyOn;
    return this;
  }
  public IncidentNotificationRuleCreateAttributes addRenotifyOnItem(String renotifyOnItem) {
    if (this.renotifyOn == null) {
      this.renotifyOn = new ArrayList<>();
    }
    this.renotifyOn.add(renotifyOnItem);
    return this;
  }

  /**
   * <p>List of incident fields that trigger re-notification when changed.</p>
   * @return renotifyOn
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RENOTIFY_ON)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getRenotifyOn() {
        return renotifyOn;
      }
  public void setRenotifyOn(List<String> renotifyOn) {
    this.renotifyOn = renotifyOn;
  }
  public IncidentNotificationRuleCreateAttributes trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * <p>The trigger event for this notification rule.</p>
   * @return trigger
  **/
      @JsonProperty(JSON_PROPERTY_TRIGGER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTrigger() {
        return trigger;
      }
  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }
  public IncidentNotificationRuleCreateAttributes visibility(IncidentNotificationRuleCreateAttributesVisibility visibility) {
    this.visibility = visibility;
    this.unparsed |= !visibility.isValid();
    return this;
  }

  /**
   * <p>The visibility of the notification rule.</p>
   * @return visibility
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VISIBILITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IncidentNotificationRuleCreateAttributesVisibility getVisibility() {
        return visibility;
      }
  public void setVisibility(IncidentNotificationRuleCreateAttributesVisibility visibility) {
    if (!visibility.isValid()) {
        this.unparsed = true;
    }
    this.visibility = visibility;
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
   * @return IncidentNotificationRuleCreateAttributes
   */
  @JsonAnySetter
  public IncidentNotificationRuleCreateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentNotificationRuleCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentNotificationRuleCreateAttributes incidentNotificationRuleCreateAttributes = (IncidentNotificationRuleCreateAttributes) o;
    return Objects.equals(this.conditions, incidentNotificationRuleCreateAttributes.conditions) && Objects.equals(this.enabled, incidentNotificationRuleCreateAttributes.enabled) && Objects.equals(this.handles, incidentNotificationRuleCreateAttributes.handles) && Objects.equals(this.renotifyOn, incidentNotificationRuleCreateAttributes.renotifyOn) && Objects.equals(this.trigger, incidentNotificationRuleCreateAttributes.trigger) && Objects.equals(this.visibility, incidentNotificationRuleCreateAttributes.visibility) && Objects.equals(this.additionalProperties, incidentNotificationRuleCreateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(conditions,enabled,handles,renotifyOn,trigger,visibility, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentNotificationRuleCreateAttributes {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    handles: ").append(toIndentedString(handles)).append("\n");
    sb.append("    renotifyOn: ").append(toIndentedString(renotifyOn)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
