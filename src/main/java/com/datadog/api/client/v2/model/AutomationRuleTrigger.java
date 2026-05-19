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

/**
 * Defines when the rule activates. Combines a trigger type (the case event to listen for) with
 * optional trigger data (conditions that narrow when the trigger fires).
 */
@JsonPropertyOrder({
  AutomationRuleTrigger.JSON_PROPERTY_DATA,
  AutomationRuleTrigger.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AutomationRuleTrigger {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private AutomationRuleTriggerData data;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AutomationRuleTriggerType type;

  public AutomationRuleTrigger() {}

  @JsonCreator
  public AutomationRuleTrigger(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AutomationRuleTriggerType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AutomationRuleTrigger data(AutomationRuleTriggerData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Additional configuration for the trigger, dependent on the trigger type. For <code>
   * status_transitioned</code> triggers, specify <code>from_status_name</code> and <code>
   * to_status_name</code>. For <code>attribute_value_changed</code> triggers, specify <code>field
   * </code> and <code>change_type</code>.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AutomationRuleTriggerData getData() {
    return data;
  }

  public void setData(AutomationRuleTriggerData data) {
    this.data = data;
  }

  public AutomationRuleTrigger type(AutomationRuleTriggerType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The case event that activates the automation rule.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AutomationRuleTriggerType getType() {
    return type;
  }

  public void setType(AutomationRuleTriggerType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return AutomationRuleTrigger
   */
  @JsonAnySetter
  public AutomationRuleTrigger putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AutomationRuleTrigger object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRuleTrigger automationRuleTrigger = (AutomationRuleTrigger) o;
    return Objects.equals(this.data, automationRuleTrigger.data)
        && Objects.equals(this.type, automationRuleTrigger.type)
        && Objects.equals(this.additionalProperties, automationRuleTrigger.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRuleTrigger {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
