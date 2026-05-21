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

/** A rule in a batch request. */
@JsonPropertyOrder({
  IncidentRuleExecutionStateRule.JSON_PROPERTY_LAST_EXECUTED_AT,
  IncidentRuleExecutionStateRule.JSON_PROPERTY_RULE_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRuleExecutionStateRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAST_EXECUTED_AT = "last_executed_at";
  private JsonNullable<OffsetDateTime> lastExecutedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_RULE_UUID = "rule_uuid";
  private UUID ruleUuid;

  public IncidentRuleExecutionStateRule() {}

  @JsonCreator
  public IncidentRuleExecutionStateRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_UUID) UUID ruleUuid) {
    this.ruleUuid = ruleUuid;
  }

  public IncidentRuleExecutionStateRule lastExecutedAt(OffsetDateTime lastExecutedAt) {
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

  public IncidentRuleExecutionStateRule ruleUuid(UUID ruleUuid) {
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
   * @return IncidentRuleExecutionStateRule
   */
  @JsonAnySetter
  public IncidentRuleExecutionStateRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentRuleExecutionStateRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRuleExecutionStateRule incidentRuleExecutionStateRule =
        (IncidentRuleExecutionStateRule) o;
    return Objects.equals(this.lastExecutedAt, incidentRuleExecutionStateRule.lastExecutedAt)
        && Objects.equals(this.ruleUuid, incidentRuleExecutionStateRule.ruleUuid)
        && Objects.equals(
            this.additionalProperties, incidentRuleExecutionStateRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastExecutedAt, ruleUuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRuleExecutionStateRule {\n");
    sb.append("    lastExecutedAt: ").append(toIndentedString(lastExecutedAt)).append("\n");
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
