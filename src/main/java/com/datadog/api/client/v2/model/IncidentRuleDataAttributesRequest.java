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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for creating an incident rule. */
@JsonPropertyOrder({
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_CONDITION,
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_CONDITION_TABLE_TYPE,
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_CONDITIONS,
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_ENABLED,
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_EXECUTION_TYPE,
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_INCIDENT_TYPE_UUID,
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_MATCH_ANY_CONDITION,
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_TASK_ID,
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_TASK_PAYLOAD,
  IncidentRuleDataAttributesRequest.JSON_PROPERTY_TRIGGER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRuleDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITION = "condition";
  private IncidentRuleQueryCondition condition;

  public static final String JSON_PROPERTY_CONDITION_TABLE_TYPE = "condition_table_type";
  private Integer conditionTableType;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<IncidentRuleCondition> conditions = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXECUTION_TYPE = "execution_type";
  private IncidentRuleExecutionType executionType;

  public static final String JSON_PROPERTY_INCIDENT_TYPE_UUID = "incident_type_uuid";
  private JsonNullable<UUID> incidentTypeUuid = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_MATCH_ANY_CONDITION = "match_any_condition";
  private Boolean matchAnyCondition;

  public static final String JSON_PROPERTY_TASK_ID = "task_id";
  private IncidentRuleTaskIDType taskId;

  public static final String JSON_PROPERTY_TASK_PAYLOAD = "task_payload";
  private String taskPayload;

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private IncidentRuleTriggerType trigger;

  public IncidentRuleDataAttributesRequest() {}

  @JsonCreator
  public IncidentRuleDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONDITION)
          IncidentRuleQueryCondition condition,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONDITION_TABLE_TYPE)
          Integer conditionTableType,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXECUTION_TYPE)
          IncidentRuleExecutionType executionType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TASK_ID) IncidentRuleTaskIDType taskId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TASK_PAYLOAD) String taskPayload) {
    this.condition = condition;
    this.unparsed |= condition.unparsed;
    this.conditionTableType = conditionTableType;
    this.enabled = enabled;
    this.executionType = executionType;
    this.unparsed |= !executionType.isValid();
    this.taskId = taskId;
    this.unparsed |= !taskId.isValid();
    this.taskPayload = taskPayload;
  }

  public IncidentRuleDataAttributesRequest condition(IncidentRuleQueryCondition condition) {
    this.condition = condition;
    this.unparsed |= condition.unparsed;
    return this;
  }

  /**
   * A query-based condition for an incident rule.
   *
   * @return condition
   */
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentRuleQueryCondition getCondition() {
    return condition;
  }

  public void setCondition(IncidentRuleQueryCondition condition) {
    this.condition = condition;
  }

  public IncidentRuleDataAttributesRequest conditionTableType(Integer conditionTableType) {
    this.conditionTableType = conditionTableType;
    return this;
  }

  /**
   * The condition table type. 1 = raw query.
   *
   * @return conditionTableType
   */
  @JsonProperty(JSON_PROPERTY_CONDITION_TABLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getConditionTableType() {
    return conditionTableType;
  }

  public void setConditionTableType(Integer conditionTableType) {
    this.conditionTableType = conditionTableType;
  }

  public IncidentRuleDataAttributesRequest conditions(List<IncidentRuleCondition> conditions) {
    this.conditions = conditions;
    for (IncidentRuleCondition item : conditions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentRuleDataAttributesRequest addConditionsItem(IncidentRuleCondition conditionsItem) {
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

  public IncidentRuleDataAttributesRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the rule is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public IncidentRuleDataAttributesRequest executionType(IncidentRuleExecutionType executionType) {
    this.executionType = executionType;
    this.unparsed |= !executionType.isValid();
    return this;
  }

  /**
   * The execution type of an incident rule.
   *
   * @return executionType
   */
  @JsonProperty(JSON_PROPERTY_EXECUTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentRuleExecutionType getExecutionType() {
    return executionType;
  }

  public void setExecutionType(IncidentRuleExecutionType executionType) {
    if (!executionType.isValid()) {
      this.unparsed = true;
    }
    this.executionType = executionType;
  }

  public IncidentRuleDataAttributesRequest incidentTypeUuid(UUID incidentTypeUuid) {
    this.incidentTypeUuid = JsonNullable.<UUID>of(incidentTypeUuid);
    return this;
  }

  /**
   * The UUID of the incident type this rule applies to.
   *
   * @return incidentTypeUuid
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getIncidentTypeUuid() {
    return incidentTypeUuid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getIncidentTypeUuid_JsonNullable() {
    return incidentTypeUuid;
  }

  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE_UUID)
  public void setIncidentTypeUuid_JsonNullable(JsonNullable<UUID> incidentTypeUuid) {
    this.incidentTypeUuid = incidentTypeUuid;
  }

  public void setIncidentTypeUuid(UUID incidentTypeUuid) {
    this.incidentTypeUuid = JsonNullable.<UUID>of(incidentTypeUuid);
  }

  public IncidentRuleDataAttributesRequest matchAnyCondition(Boolean matchAnyCondition) {
    this.matchAnyCondition = matchAnyCondition;
    return this;
  }

  /**
   * Whether any condition (OR logic) should match instead of all (AND logic).
   *
   * @return matchAnyCondition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_ANY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMatchAnyCondition() {
    return matchAnyCondition;
  }

  public void setMatchAnyCondition(Boolean matchAnyCondition) {
    this.matchAnyCondition = matchAnyCondition;
  }

  public IncidentRuleDataAttributesRequest taskId(IncidentRuleTaskIDType taskId) {
    this.taskId = taskId;
    this.unparsed |= !taskId.isValid();
    return this;
  }

  /**
   * The task ID for an incident rule.
   *
   * @return taskId
   */
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentRuleTaskIDType getTaskId() {
    return taskId;
  }

  public void setTaskId(IncidentRuleTaskIDType taskId) {
    if (!taskId.isValid()) {
      this.unparsed = true;
    }
    this.taskId = taskId;
  }

  public IncidentRuleDataAttributesRequest taskPayload(String taskPayload) {
    this.taskPayload = taskPayload;
    return this;
  }

  /**
   * The JSON-encoded payload for the task.
   *
   * @return taskPayload
   */
  @JsonProperty(JSON_PROPERTY_TASK_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTaskPayload() {
    return taskPayload;
  }

  public void setTaskPayload(String taskPayload) {
    this.taskPayload = taskPayload;
  }

  public IncidentRuleDataAttributesRequest trigger(IncidentRuleTriggerType trigger) {
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
   * @return IncidentRuleDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentRuleDataAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentRuleDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRuleDataAttributesRequest incidentRuleDataAttributesRequest =
        (IncidentRuleDataAttributesRequest) o;
    return Objects.equals(this.condition, incidentRuleDataAttributesRequest.condition)
        && Objects.equals(
            this.conditionTableType, incidentRuleDataAttributesRequest.conditionTableType)
        && Objects.equals(this.conditions, incidentRuleDataAttributesRequest.conditions)
        && Objects.equals(this.enabled, incidentRuleDataAttributesRequest.enabled)
        && Objects.equals(this.executionType, incidentRuleDataAttributesRequest.executionType)
        && Objects.equals(this.incidentTypeUuid, incidentRuleDataAttributesRequest.incidentTypeUuid)
        && Objects.equals(
            this.matchAnyCondition, incidentRuleDataAttributesRequest.matchAnyCondition)
        && Objects.equals(this.taskId, incidentRuleDataAttributesRequest.taskId)
        && Objects.equals(this.taskPayload, incidentRuleDataAttributesRequest.taskPayload)
        && Objects.equals(this.trigger, incidentRuleDataAttributesRequest.trigger)
        && Objects.equals(
            this.additionalProperties, incidentRuleDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        condition,
        conditionTableType,
        conditions,
        enabled,
        executionType,
        incidentTypeUuid,
        matchAnyCondition,
        taskId,
        taskPayload,
        trigger,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRuleDataAttributesRequest {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    conditionTableType: ").append(toIndentedString(conditionTableType)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
    sb.append("    incidentTypeUuid: ").append(toIndentedString(incidentTypeUuid)).append("\n");
    sb.append("    matchAnyCondition: ").append(toIndentedString(matchAnyCondition)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
