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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes for creating or updating a rule. Server-managed fields (created_at, modified_at,
 * custom) are excluded.
 */
@JsonPropertyOrder({
  RuleAttributesRequest.JSON_PROPERTY_DESCRIPTION,
  RuleAttributesRequest.JSON_PROPERTY_ENABLED,
  RuleAttributesRequest.JSON_PROPERTY_LEVEL,
  RuleAttributesRequest.JSON_PROPERTY_NAME,
  RuleAttributesRequest.JSON_PROPERTY_OWNER,
  RuleAttributesRequest.JSON_PROPERTY_SCOPE_QUERY,
  RuleAttributesRequest.JSON_PROPERTY_SCORECARD_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RuleAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Integer level;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_SCOPE_QUERY = "scope_query";
  private String scopeQuery;

  public static final String JSON_PROPERTY_SCORECARD_NAME = "scorecard_name";
  private String scorecardName;

  public RuleAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Explanation of the rule.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RuleAttributesRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * If enabled, the rule is calculated as part of the score.
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

  public RuleAttributesRequest level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * The maturity level of the rule (1, 2, or 3). minimum: 1 maximum: 3
   *
   * @return level
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public RuleAttributesRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the rule.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RuleAttributesRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Owner of the rule.
   *
   * @return owner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public RuleAttributesRequest scopeQuery(String scopeQuery) {
    this.scopeQuery = scopeQuery;
    return this;
  }

  /**
   * A query to filter which entities this rule applies to.
   *
   * @return scopeQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScopeQuery() {
    return scopeQuery;
  }

  public void setScopeQuery(String scopeQuery) {
    this.scopeQuery = scopeQuery;
  }

  public RuleAttributesRequest scorecardName(String scorecardName) {
    this.scorecardName = scorecardName;
    return this;
  }

  /**
   * The scorecard name to which this rule must belong.
   *
   * @return scorecardName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORECARD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScorecardName() {
    return scorecardName;
  }

  public void setScorecardName(String scorecardName) {
    this.scorecardName = scorecardName;
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
   * @return RuleAttributesRequest
   */
  @JsonAnySetter
  public RuleAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RuleAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleAttributesRequest ruleAttributesRequest = (RuleAttributesRequest) o;
    return Objects.equals(this.description, ruleAttributesRequest.description)
        && Objects.equals(this.enabled, ruleAttributesRequest.enabled)
        && Objects.equals(this.level, ruleAttributesRequest.level)
        && Objects.equals(this.name, ruleAttributesRequest.name)
        && Objects.equals(this.owner, ruleAttributesRequest.owner)
        && Objects.equals(this.scopeQuery, ruleAttributesRequest.scopeQuery)
        && Objects.equals(this.scorecardName, ruleAttributesRequest.scorecardName)
        && Objects.equals(this.additionalProperties, ruleAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, enabled, level, name, owner, scopeQuery, scorecardName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleAttributesRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    scopeQuery: ").append(toIndentedString(scopeQuery)).append("\n");
    sb.append("    scorecardName: ").append(toIndentedString(scorecardName)).append("\n");
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
