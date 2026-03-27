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
   * <p>A rule version with a list of updates.</p>
 */
@JsonPropertyOrder({
  RuleVersions.JSON_PROPERTY_CHANGES,
  RuleVersions.JSON_PROPERTY_RULE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RuleVersions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGES = "changes";
  private List<VersionHistoryUpdate> changes = null;

  public static final String JSON_PROPERTY_RULE = "rule";
  private SecurityMonitoringRuleResponse rule;

  public RuleVersions changes(List<VersionHistoryUpdate> changes) {
    this.changes = changes;
    for (VersionHistoryUpdate item : changes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public RuleVersions addChangesItem(VersionHistoryUpdate changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    this.unparsed |= changesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of changes.</p>
   * @return changes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANGES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<VersionHistoryUpdate> getChanges() {
        return changes;
      }
  public void setChanges(List<VersionHistoryUpdate> changes) {
    this.changes = changes;
  }
  public RuleVersions rule(SecurityMonitoringRuleResponse rule) {
    this.rule = rule;
    this.unparsed |= rule.unparsed;
    return this;
  }

  /**
   * <p>Create a new rule.</p>
   * @return rule
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleResponse getRule() {
        return rule;
      }
  public void setRule(SecurityMonitoringRuleResponse rule) {
    this.rule = rule;
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
   * @return RuleVersions
   */
  @JsonAnySetter
  public RuleVersions putAdditionalProperty(String key, Object value) {
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
   * Return true if this RuleVersions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleVersions ruleVersions = (RuleVersions) o;
    return Objects.equals(this.changes, ruleVersions.changes) && Objects.equals(this.rule, ruleVersions.rule) && Objects.equals(this.additionalProperties, ruleVersions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(changes,rule, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleVersions {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
