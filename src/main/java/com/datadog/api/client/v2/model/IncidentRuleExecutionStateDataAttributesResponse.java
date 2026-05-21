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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of an incident rule execution state. */
@JsonPropertyOrder({
  IncidentRuleExecutionStateDataAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentRuleExecutionStateDataAttributesResponse.JSON_PROPERTY_INCIDENT_UUID,
  IncidentRuleExecutionStateDataAttributesResponse.JSON_PROPERTY_LAST_EXECUTED_AT,
  IncidentRuleExecutionStateDataAttributesResponse.JSON_PROPERTY_MODIFIED,
  IncidentRuleExecutionStateDataAttributesResponse.JSON_PROPERTY_RULE_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRuleExecutionStateDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_INCIDENT_UUID = "incident_uuid";
  private UUID incidentUuid;

  public static final String JSON_PROPERTY_LAST_EXECUTED_AT = "last_executed_at";
  private JsonNullable<OffsetDateTime> lastExecutedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_RULE_UUID = "rule_uuid";
  private UUID ruleUuid;

  public IncidentRuleExecutionStateDataAttributesResponse() {}

  @JsonCreator
  public IncidentRuleExecutionStateDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_UUID) UUID incidentUuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_UUID) UUID ruleUuid) {
    this.created = created;
    this.incidentUuid = incidentUuid;
    this.modified = modified;
    this.ruleUuid = ruleUuid;
  }

  public IncidentRuleExecutionStateDataAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the state was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentRuleExecutionStateDataAttributesResponse incidentUuid(UUID incidentUuid) {
    this.incidentUuid = incidentUuid;
    return this;
  }

  /**
   * The incident identifier.
   *
   * @return incidentUuid
   */
  @JsonProperty(JSON_PROPERTY_INCIDENT_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getIncidentUuid() {
    return incidentUuid;
  }

  public void setIncidentUuid(UUID incidentUuid) {
    this.incidentUuid = incidentUuid;
  }

  public IncidentRuleExecutionStateDataAttributesResponse lastExecutedAt(
      OffsetDateTime lastExecutedAt) {
    this.lastExecutedAt = JsonNullable.<OffsetDateTime>of(lastExecutedAt);
    return this;
  }

  /**
   * Timestamp of the last rule execution.
   *
   * @return lastExecutedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getLastExecutedAt() {
    return lastExecutedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_EXECUTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getLastExecutedAt_JsonNullable() {
    return lastExecutedAt;
  }

  @JsonProperty(JSON_PROPERTY_LAST_EXECUTED_AT)
  public void setLastExecutedAt_JsonNullable(JsonNullable<OffsetDateTime> lastExecutedAt) {
    this.lastExecutedAt = lastExecutedAt;
  }

  public void setLastExecutedAt(OffsetDateTime lastExecutedAt) {
    this.lastExecutedAt = JsonNullable.<OffsetDateTime>of(lastExecutedAt);
  }

  public IncidentRuleExecutionStateDataAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the state was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public IncidentRuleExecutionStateDataAttributesResponse ruleUuid(UUID ruleUuid) {
    this.ruleUuid = ruleUuid;
    return this;
  }

  /**
   * The rule identifier.
   *
   * @return ruleUuid
   */
  @JsonProperty(JSON_PROPERTY_RULE_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getRuleUuid() {
    return ruleUuid;
  }

  public void setRuleUuid(UUID ruleUuid) {
    this.ruleUuid = ruleUuid;
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
   * @return IncidentRuleExecutionStateDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentRuleExecutionStateDataAttributesResponse putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this IncidentRuleExecutionStateDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRuleExecutionStateDataAttributesResponse
        incidentRuleExecutionStateDataAttributesResponse =
            (IncidentRuleExecutionStateDataAttributesResponse) o;
    return Objects.equals(this.created, incidentRuleExecutionStateDataAttributesResponse.created)
        && Objects.equals(
            this.incidentUuid, incidentRuleExecutionStateDataAttributesResponse.incidentUuid)
        && Objects.equals(
            this.lastExecutedAt, incidentRuleExecutionStateDataAttributesResponse.lastExecutedAt)
        && Objects.equals(this.modified, incidentRuleExecutionStateDataAttributesResponse.modified)
        && Objects.equals(this.ruleUuid, incidentRuleExecutionStateDataAttributesResponse.ruleUuid)
        && Objects.equals(
            this.additionalProperties,
            incidentRuleExecutionStateDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        created, incidentUuid, lastExecutedAt, modified, ruleUuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRuleExecutionStateDataAttributesResponse {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    incidentUuid: ").append(toIndentedString(incidentUuid)).append("\n");
    sb.append("    lastExecutedAt: ").append(toIndentedString(lastExecutedAt)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    ruleUuid: ").append(toIndentedString(ruleUuid)).append("\n");
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
