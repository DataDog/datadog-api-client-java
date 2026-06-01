/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Attributes for patching an incident rule. All fields are optional. */
@JsonPropertyOrder({
  IncidentRulePatchDataAttributesRequest.JSON_PROPERTY_CONDITION,
  IncidentRulePatchDataAttributesRequest.JSON_PROPERTY_CONDITIONS,
  IncidentRulePatchDataAttributesRequest.JSON_PROPERTY_ENABLED,
  IncidentRulePatchDataAttributesRequest.JSON_PROPERTY_TASK_PAYLOAD,
  IncidentRulePatchDataAttributesRequest.JSON_PROPERTY_TRIGGER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRulePatchDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITION = "condition";
  private IncidentRuleQueryCondition condition;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<IncidentRuleCondition> conditions = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_TASK_PAYLOAD = "task_payload";
  private String taskPayload;

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private IncidentRuleTriggerType trigger;

  public IncidentRulePatchDataAttributesRequest condition(IncidentRuleQueryCondition condition) {
    this.condition = condition;
    this.unparsed |= condition.unparsed;
    return this;
  }

  /**
   * A query-based condition for an incident rule.
   *
   * @return condition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentRuleQueryCondition getCondition() {
    return condition;
  }

  public void setCondition(IncidentRuleQueryCondition condition) {
    this.condition = condition;
  }

  public IncidentRulePatchDataAttributesRequest conditions(List<IncidentRuleCondition> conditions) {
    this.conditions = conditions;
    for (IncidentRuleCondition item : conditions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentRulePatchDataAttributesRequest addConditionsItem(
      IncidentRuleCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    this.unparsed |= conditionsItem.unparsed;
    return this;
  }

  /**
   * List of field-based conditions.
   *
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentRuleCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IncidentRuleCondition> conditions) {
    this.conditions = conditions;
  }

  public IncidentRulePatchDataAttributesRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the rule is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public IncidentRulePatchDataAttributesRequest taskPayload(String taskPayload) {
    this.taskPayload = taskPayload;
    return this;
  }

  /**
   * The JSON-encoded payload for the task.
   *
   * @return taskPayload
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTaskPayload() {
    return taskPayload;
  }

  public void setTaskPayload(String taskPayload) {
    this.taskPayload = taskPayload;
  }

  public IncidentRulePatchDataAttributesRequest trigger(IncidentRuleTriggerType trigger) {
    this.trigger = trigger;
    this.unparsed |= !trigger.isValid();
    return this;
  }

  /**
   * The trigger event for an incident rule.
   *
   * @return trigger
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentRuleTriggerType getTrigger() {
    return trigger;
  }

  public void setTrigger(IncidentRuleTriggerType trigger) {
    if (!trigger.isValid()) {
      this.unparsed = true;
    }
    this.trigger = trigger;
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
   * @return IncidentRulePatchDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentRulePatchDataAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentRulePatchDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRulePatchDataAttributesRequest incidentRulePatchDataAttributesRequest =
        (IncidentRulePatchDataAttributesRequest) o;
    return Objects.equals(this.condition, incidentRulePatchDataAttributesRequest.condition)
        && Objects.equals(this.conditions, incidentRulePatchDataAttributesRequest.conditions)
        && Objects.equals(this.enabled, incidentRulePatchDataAttributesRequest.enabled)
        && Objects.equals(this.taskPayload, incidentRulePatchDataAttributesRequest.taskPayload)
        && Objects.equals(this.trigger, incidentRulePatchDataAttributesRequest.trigger)
        && Objects.equals(
            this.additionalProperties, incidentRulePatchDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, conditions, enabled, taskPayload, trigger, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRulePatchDataAttributesRequest {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    taskPayload: ").append(toIndentedString(taskPayload)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
