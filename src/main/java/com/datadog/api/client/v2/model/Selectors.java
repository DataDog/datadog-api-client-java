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
   * <p>Selectors are used to filter security issues for which notifications should be generated.
   * Users can specify rule severities, rule types, a query to filter security issues on tags and attributes, and the trigger source.
   * Only the trigger_source field is required.</p>
 */
@JsonPropertyOrder({
  Selectors.JSON_PROPERTY_QUERY,
  Selectors.JSON_PROPERTY_RULE_TYPES,
  Selectors.JSON_PROPERTY_SEVERITIES,
  Selectors.JSON_PROPERTY_TRIGGER_SOURCE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Selectors {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RULE_TYPES = "rule_types";
  private List<RuleTypesItems> ruleTypes = null;

  public static final String JSON_PROPERTY_SEVERITIES = "severities";
  private List<RuleSeverity> severities = null;

  public static final String JSON_PROPERTY_TRIGGER_SOURCE = "trigger_source";
  private TriggerSource triggerSource;

  public Selectors() {}

  @JsonCreator
  public Selectors(
            @JsonProperty(required=true, value=JSON_PROPERTY_TRIGGER_SOURCE)TriggerSource triggerSource) {
        this.triggerSource = triggerSource;
        this.unparsed |= !triggerSource.isValid();
  }
  public Selectors query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The query is composed of one or several key:value pairs, which can be used to filter security issues on tags and attributes.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public Selectors ruleTypes(List<RuleTypesItems> ruleTypes) {
    this.ruleTypes = ruleTypes;
    return this;
  }
  public Selectors addRuleTypesItem(RuleTypesItems ruleTypesItem) {
    if (this.ruleTypes == null) {
      this.ruleTypes = new ArrayList<>();
    }
    this.ruleTypes.add(ruleTypesItem);
    this.unparsed |= !ruleTypesItem.isValid();
    return this;
  }

  /**
   * <p>Security rule types used as filters in security rules.</p>
   * @return ruleTypes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULE_TYPES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<RuleTypesItems> getRuleTypes() {
        return ruleTypes;
      }
  public void setRuleTypes(List<RuleTypesItems> ruleTypes) {
    this.ruleTypes = ruleTypes;
  }
  public Selectors severities(List<RuleSeverity> severities) {
    this.severities = severities;
    return this;
  }
  public Selectors addSeveritiesItem(RuleSeverity severitiesItem) {
    if (this.severities == null) {
      this.severities = new ArrayList<>();
    }
    this.severities.add(severitiesItem);
    this.unparsed |= !severitiesItem.isValid();
    return this;
  }

  /**
   * <p>The security rules severities to consider.</p>
   * @return severities
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEVERITIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<RuleSeverity> getSeverities() {
        return severities;
      }
  public void setSeverities(List<RuleSeverity> severities) {
    this.severities = severities;
  }
  public Selectors triggerSource(TriggerSource triggerSource) {
    this.triggerSource = triggerSource;
    this.unparsed |= !triggerSource.isValid();
    return this;
  }

  /**
   * <p>The type of security issues on which the rule applies. Notification rules based on security signals need to use the trigger source "security_signals",
   * while notification rules based on security vulnerabilities need to use the trigger source "security_findings".</p>
   * @return triggerSource
  **/
      @JsonProperty(JSON_PROPERTY_TRIGGER_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TriggerSource getTriggerSource() {
        return triggerSource;
      }
  public void setTriggerSource(TriggerSource triggerSource) {
    if (!triggerSource.isValid()) {
        this.unparsed = true;
    }
    this.triggerSource = triggerSource;
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
   * @return Selectors
   */
  @JsonAnySetter
  public Selectors putAdditionalProperty(String key, Object value) {
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
   * Return true if this Selectors object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Selectors selectors = (Selectors) o;
    return Objects.equals(this.query, selectors.query) && Objects.equals(this.ruleTypes, selectors.ruleTypes) && Objects.equals(this.severities, selectors.severities) && Objects.equals(this.triggerSource, selectors.triggerSource) && Objects.equals(this.additionalProperties, selectors.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(query,ruleTypes,severities,triggerSource, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Selectors {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    ruleTypes: ").append(toIndentedString(ruleTypes)).append("\n");
    sb.append("    severities: ").append(toIndentedString(severities)).append("\n");
    sb.append("    triggerSource: ").append(toIndentedString(triggerSource)).append("\n");
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
