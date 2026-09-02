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

/** Defines the scope of findings to which the automation rule applies. */
@JsonPropertyOrder({
  AutomationRuleScope.JSON_PROPERTY_FINDING_TYPES,
  AutomationRuleScope.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AutomationRuleScope {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FINDING_TYPES = "finding_types";
  private List<SecurityFindingType> findingTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public AutomationRuleScope() {}

  @JsonCreator
  public AutomationRuleScope(
      @JsonProperty(required = true, value = JSON_PROPERTY_FINDING_TYPES)
          List<SecurityFindingType> findingTypes) {
    this.findingTypes = findingTypes;
  }

  public AutomationRuleScope findingTypes(List<SecurityFindingType> findingTypes) {
    this.findingTypes = findingTypes;
    return this;
  }

  public AutomationRuleScope addFindingTypesItem(SecurityFindingType findingTypesItem) {
    this.findingTypes.add(findingTypesItem);
    this.unparsed |= !findingTypesItem.isValid();
    return this;
  }

  /**
   * The list of security finding types that the automation rule applies to.
   *
   * @return findingTypes
   */
  @JsonProperty(JSON_PROPERTY_FINDING_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityFindingType> getFindingTypes() {
    return findingTypes;
  }

  public void setFindingTypes(List<SecurityFindingType> findingTypes) {
    this.findingTypes = findingTypes;
  }

  public AutomationRuleScope query(String query) {
    this.query = query;
    return this;
  }

  /**
   * A search query to further filter the findings matched by this rule. The <code>@workflow.*
   * </code> namespace and <code>@status</code> fields are not permitted. For a reference of
   * available fields, see the <a
   * href="https://docs.datadoghq.com/security/guide/findings-schema/">Security Findings schema
   * documentation</a>.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
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
   * @return AutomationRuleScope
   */
  @JsonAnySetter
  public AutomationRuleScope putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AutomationRuleScope object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRuleScope automationRuleScope = (AutomationRuleScope) o;
    return Objects.equals(this.findingTypes, automationRuleScope.findingTypes)
        && Objects.equals(this.query, automationRuleScope.query)
        && Objects.equals(this.additionalProperties, automationRuleScope.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(findingTypes, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRuleScope {\n");
    sb.append("    findingTypes: ").append(toIndentedString(findingTypes)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
