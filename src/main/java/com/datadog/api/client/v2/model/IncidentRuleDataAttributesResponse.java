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
   * <p>Attributes of an incident rule in a response.</p>
 */
@JsonPropertyOrder({
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_CONDITION,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_CONDITION_TABLE_TYPE,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_CONDITIONS,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_CREATED_BY_UUID,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_DELETED,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_ENABLED,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_EXECUTION_TYPE,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_INCIDENT_SETTINGS_ASSOCIATION_UUID,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_MATCH_ANY_CONDITION,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_MODIFIED,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_MODIFIED_BY_UUID,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_ORG_ID,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_TASK_ID,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_TASK_PAYLOAD,
  IncidentRuleDataAttributesResponse.JSON_PROPERTY_TRIGGER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRuleDataAttributesResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITION = "condition";
  private IncidentRuleQueryCondition condition;

  public static final String JSON_PROPERTY_CONDITION_TABLE_TYPE = "condition_table_type";
  private Long conditionTableType;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<IncidentRuleCondition> conditions = null;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CREATED_BY_UUID = "created_by_uuid";
  private UUID createdByUuid;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private JsonNullable<OffsetDateTime> deleted = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXECUTION_TYPE = "execution_type";
  private Long executionType;

  public static final String JSON_PROPERTY_INCIDENT_SETTINGS_ASSOCIATION_UUID = "incident_settings_association_uuid";
  private JsonNullable<UUID> incidentSettingsAssociationUuid = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_MATCH_ANY_CONDITION = "match_any_condition";
  private Boolean matchAnyCondition;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_MODIFIED_BY_UUID = "modified_by_uuid";
  private UUID modifiedByUuid;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_TASK_ID = "task_id";
  private JsonNullable<String> taskId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TASK_PAYLOAD = "task_payload";
  private JsonNullable<String> taskPayload = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private String trigger;

  public IncidentRuleDataAttributesResponse condition(IncidentRuleQueryCondition condition) {
    this.condition = condition;
    this.unparsed |= condition.unparsed;
    return this;
  }

  /**
   * <p>A query-based condition for an incident rule.</p>
   * @return condition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONDITION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IncidentRuleQueryCondition getCondition() {
        return condition;
      }
  public void setCondition(IncidentRuleQueryCondition condition) {
    this.condition = condition;
    if (condition != null) {
      this.unparsed |= condition.unparsed;
    }
  }
  public IncidentRuleDataAttributesResponse conditionTableType(Long conditionTableType) {
    this.conditionTableType = conditionTableType;
    return this;
  }

  /**
   * <p>The condition table type.</p>
   * @return conditionTableType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONDITION_TABLE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getConditionTableType() {
        return conditionTableType;
      }
  public void setConditionTableType(Long conditionTableType) {
    this.conditionTableType = conditionTableType;
  }
  public IncidentRuleDataAttributesResponse conditions(List<IncidentRuleCondition> conditions) {
    this.conditions = conditions;
    if (conditions != null) {
    for (IncidentRuleCondition item : conditions) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public IncidentRuleDataAttributesResponse addConditionsItem(IncidentRuleCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    this.unparsed |= conditionsItem.unparsed;
    return this;
  }

  /**
   * <p>List of field-based conditions.</p>
   * @return conditions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONDITIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<IncidentRuleCondition> getConditions() {
        return conditions;
      }
  public void setConditions(List<IncidentRuleCondition> conditions) {
    this.conditions = conditions;
    if (conditions != null) {
      for (IncidentRuleCondition item : conditions) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public IncidentRuleDataAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * <p>Timestamp when the rule was created.</p>
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
  public IncidentRuleDataAttributesResponse createdByUuid(UUID createdByUuid) {
    this.createdByUuid = createdByUuid;
    return this;
  }

  /**
   * <p>UUID of the user who created the rule.</p>
   * @return createdByUuid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY_UUID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UUID getCreatedByUuid() {
        return createdByUuid;
      }
  public void setCreatedByUuid(UUID createdByUuid) {
    this.createdByUuid = createdByUuid;
  }
  public IncidentRuleDataAttributesResponse deleted(OffsetDateTime deleted) {
    this.deleted = JsonNullable.<OffsetDateTime>of(deleted);
    return this;
  }

  /**
   * <p>Timestamp when the rule was deleted.</p>
   * @return deleted
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getDeleted() {
        return deleted.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDeleted_JsonNullable() {
    return deleted;
  }
  @JsonProperty(JSON_PROPERTY_DELETED)public void setDeleted_JsonNullable(JsonNullable<OffsetDateTime> deleted) {
    this.deleted = deleted;
  }
  public void setDeleted(OffsetDateTime deleted) {
    this.deleted = JsonNullable.<OffsetDateTime>of(deleted);
  }
  public IncidentRuleDataAttributesResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the rule is enabled.</p>
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
  public IncidentRuleDataAttributesResponse executionType(Long executionType) {
    this.executionType = executionType;
    return this;
  }

  /**
   * <p>The execution type of the rule.</p>
   * @return executionType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXECUTION_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getExecutionType() {
        return executionType;
      }
  public void setExecutionType(Long executionType) {
    this.executionType = executionType;
  }
  public IncidentRuleDataAttributesResponse incidentSettingsAssociationUuid(UUID incidentSettingsAssociationUuid) {
    this.incidentSettingsAssociationUuid = JsonNullable.<UUID>of(incidentSettingsAssociationUuid);
    return this;
  }

  /**
   * <p>The incident settings association UUID.</p>
   * @return incidentSettingsAssociationUuid
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public UUID getIncidentSettingsAssociationUuid() {
        return incidentSettingsAssociationUuid.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_INCIDENT_SETTINGS_ASSOCIATION_UUID)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getIncidentSettingsAssociationUuid_JsonNullable() {
    return incidentSettingsAssociationUuid;
  }
  @JsonProperty(JSON_PROPERTY_INCIDENT_SETTINGS_ASSOCIATION_UUID)public void setIncidentSettingsAssociationUuid_JsonNullable(JsonNullable<UUID> incidentSettingsAssociationUuid) {
    this.incidentSettingsAssociationUuid = incidentSettingsAssociationUuid;
  }
  public void setIncidentSettingsAssociationUuid(UUID incidentSettingsAssociationUuid) {
    this.incidentSettingsAssociationUuid = JsonNullable.<UUID>of(incidentSettingsAssociationUuid);
  }
  public IncidentRuleDataAttributesResponse matchAnyCondition(Boolean matchAnyCondition) {
    this.matchAnyCondition = matchAnyCondition;
    return this;
  }

  /**
   * <p>Whether any condition should match.</p>
   * @return matchAnyCondition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MATCH_ANY_CONDITION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getMatchAnyCondition() {
        return matchAnyCondition;
      }
  public void setMatchAnyCondition(Boolean matchAnyCondition) {
    this.matchAnyCondition = matchAnyCondition;
  }
  public IncidentRuleDataAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * <p>Timestamp when the rule was last modified.</p>
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
  public IncidentRuleDataAttributesResponse modifiedByUuid(UUID modifiedByUuid) {
    this.modifiedByUuid = modifiedByUuid;
    return this;
  }

  /**
   * <p>UUID of the user who last modified the rule.</p>
   * @return modifiedByUuid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_BY_UUID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UUID getModifiedByUuid() {
        return modifiedByUuid;
      }
  public void setModifiedByUuid(UUID modifiedByUuid) {
    this.modifiedByUuid = modifiedByUuid;
  }
  public IncidentRuleDataAttributesResponse orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * <p>The organization ID.</p>
   * @return orgId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOrgId() {
        return orgId;
      }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }
  public IncidentRuleDataAttributesResponse taskId(String taskId) {
    this.taskId = JsonNullable.<String>of(taskId);
    return this;
  }

  /**
   * <p>The task ID.</p>
   * @return taskId
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getTaskId() {
        return taskId.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTaskId_JsonNullable() {
    return taskId;
  }
  @JsonProperty(JSON_PROPERTY_TASK_ID)public void setTaskId_JsonNullable(JsonNullable<String> taskId) {
    this.taskId = taskId;
  }
  public void setTaskId(String taskId) {
    this.taskId = JsonNullable.<String>of(taskId);
  }
  public IncidentRuleDataAttributesResponse taskPayload(String taskPayload) {
    this.taskPayload = JsonNullable.<String>of(taskPayload);
    return this;
  }

  /**
   * <p>The JSON-encoded task payload.</p>
   * @return taskPayload
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getTaskPayload() {
        return taskPayload.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TASK_PAYLOAD)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTaskPayload_JsonNullable() {
    return taskPayload;
  }
  @JsonProperty(JSON_PROPERTY_TASK_PAYLOAD)public void setTaskPayload_JsonNullable(JsonNullable<String> taskPayload) {
    this.taskPayload = taskPayload;
  }
  public void setTaskPayload(String taskPayload) {
    this.taskPayload = JsonNullable.<String>of(taskPayload);
  }
  public IncidentRuleDataAttributesResponse trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * <p>The trigger event for the rule.</p>
   * @return trigger
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TRIGGER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTrigger() {
        return trigger;
      }
  public void setTrigger(String trigger) {
    this.trigger = trigger;
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
   * @return IncidentRuleDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentRuleDataAttributesResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentRuleDataAttributesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRuleDataAttributesResponse incidentRuleDataAttributesResponse = (IncidentRuleDataAttributesResponse) o;
    return Objects.equals(this.condition, incidentRuleDataAttributesResponse.condition) && Objects.equals(this.conditionTableType, incidentRuleDataAttributesResponse.conditionTableType) && Objects.equals(this.conditions, incidentRuleDataAttributesResponse.conditions) && Objects.equals(this.created, incidentRuleDataAttributesResponse.created) && Objects.equals(this.createdByUuid, incidentRuleDataAttributesResponse.createdByUuid) && Objects.equals(this.deleted, incidentRuleDataAttributesResponse.deleted) && Objects.equals(this.enabled, incidentRuleDataAttributesResponse.enabled) && Objects.equals(this.executionType, incidentRuleDataAttributesResponse.executionType) && Objects.equals(this.incidentSettingsAssociationUuid, incidentRuleDataAttributesResponse.incidentSettingsAssociationUuid) && Objects.equals(this.matchAnyCondition, incidentRuleDataAttributesResponse.matchAnyCondition) && Objects.equals(this.modified, incidentRuleDataAttributesResponse.modified) && Objects.equals(this.modifiedByUuid, incidentRuleDataAttributesResponse.modifiedByUuid) && Objects.equals(this.orgId, incidentRuleDataAttributesResponse.orgId) && Objects.equals(this.taskId, incidentRuleDataAttributesResponse.taskId) && Objects.equals(this.taskPayload, incidentRuleDataAttributesResponse.taskPayload) && Objects.equals(this.trigger, incidentRuleDataAttributesResponse.trigger) && Objects.equals(this.additionalProperties, incidentRuleDataAttributesResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(condition,conditionTableType,conditions,created,createdByUuid,deleted,enabled,executionType,incidentSettingsAssociationUuid,matchAnyCondition,modified,modifiedByUuid,orgId,taskId,taskPayload,trigger, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRuleDataAttributesResponse {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    conditionTableType: ").append(toIndentedString(conditionTableType)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdByUuid: ").append(toIndentedString(createdByUuid)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
    sb.append("    incidentSettingsAssociationUuid: ").append(toIndentedString(incidentSettingsAssociationUuid)).append("\n");
    sb.append("    matchAnyCondition: ").append(toIndentedString(matchAnyCondition)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedByUuid: ").append(toIndentedString(modifiedByUuid)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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
