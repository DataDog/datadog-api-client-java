/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** User journey search configuration. */
@JsonPropertyOrder({
  UserJourneySearch.JSON_PROPERTY_EXPRESSION,
  UserJourneySearch.JSON_PROPERTY_FILTERS,
  UserJourneySearch.JSON_PROPERTY_JOIN_KEYS,
  UserJourneySearch.JSON_PROPERTY_NODE_OBJECTS,
  UserJourneySearch.JSON_PROPERTY_STEP_ALIASES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserJourneySearch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private UserJourneySearchFilters filters;

  public static final String JSON_PROPERTY_JOIN_KEYS = "join_keys";
  private UserJourneyJoinKeys joinKeys;

  public static final String JSON_PROPERTY_NODE_OBJECTS = "node_objects";
  private Map<String, ProductAnalyticsBaseQuery> nodeObjects =
      new HashMap<String, ProductAnalyticsBaseQuery>();

  public static final String JSON_PROPERTY_STEP_ALIASES = "step_aliases";
  private Map<String, String> stepAliases = null;

  public UserJourneySearch() {}

  @JsonCreator
  public UserJourneySearch(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression,
      @JsonProperty(required = true, value = JSON_PROPERTY_NODE_OBJECTS)
          Map<String, ProductAnalyticsBaseQuery> nodeObjects) {
    this.expression = expression;
    this.nodeObjects = nodeObjects;
  }

  public UserJourneySearch expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Expression string.
   *
   * @return expression
   */
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public UserJourneySearch filters(UserJourneySearchFilters filters) {
    this.filters = filters;
    this.unparsed |= filters.unparsed;
    return this;
  }

  /**
   * Filters for user journey search.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserJourneySearchFilters getFilters() {
    return filters;
  }

  public void setFilters(UserJourneySearchFilters filters) {
    this.filters = filters;
  }

  public UserJourneySearch joinKeys(UserJourneyJoinKeys joinKeys) {
    this.joinKeys = joinKeys;
    this.unparsed |= joinKeys.unparsed;
    return this;
  }

  /**
   * Join keys for user journey queries.
   *
   * @return joinKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOIN_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserJourneyJoinKeys getJoinKeys() {
    return joinKeys;
  }

  public void setJoinKeys(UserJourneyJoinKeys joinKeys) {
    this.joinKeys = joinKeys;
  }

  public UserJourneySearch nodeObjects(Map<String, ProductAnalyticsBaseQuery> nodeObjects) {
    this.nodeObjects = nodeObjects;
    return this;
  }

  public UserJourneySearch putNodeObjectsItem(
      String key, ProductAnalyticsBaseQuery nodeObjectsItem) {
    this.nodeObjects.put(key, nodeObjectsItem);
    return this;
  }

  /**
   * Node objects mapping.
   *
   * @return nodeObjects
   */
  @JsonProperty(JSON_PROPERTY_NODE_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, ProductAnalyticsBaseQuery> getNodeObjects() {
    return nodeObjects;
  }

  public void setNodeObjects(Map<String, ProductAnalyticsBaseQuery> nodeObjects) {
    this.nodeObjects = nodeObjects;
  }

  public UserJourneySearch stepAliases(Map<String, String> stepAliases) {
    this.stepAliases = stepAliases;
    return this;
  }

  public UserJourneySearch putStepAliasesItem(String key, String stepAliasesItem) {
    if (this.stepAliases == null) {
      this.stepAliases = new HashMap<>();
    }
    this.stepAliases.put(key, stepAliasesItem);
    return this;
  }

  /**
   * Step aliases mapping.
   *
   * @return stepAliases
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_ALIASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getStepAliases() {
    return stepAliases;
  }

  public void setStepAliases(Map<String, String> stepAliases) {
    this.stepAliases = stepAliases;
  }

  /** Return true if this UserJourneySearch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserJourneySearch userJourneySearch = (UserJourneySearch) o;
    return Objects.equals(this.expression, userJourneySearch.expression)
        && Objects.equals(this.filters, userJourneySearch.filters)
        && Objects.equals(this.joinKeys, userJourneySearch.joinKeys)
        && Objects.equals(this.nodeObjects, userJourneySearch.nodeObjects)
        && Objects.equals(this.stepAliases, userJourneySearch.stepAliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, filters, joinKeys, nodeObjects, stepAliases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserJourneySearch {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    joinKeys: ").append(toIndentedString(joinKeys)).append("\n");
    sb.append("    nodeObjects: ").append(toIndentedString(nodeObjects)).append("\n");
    sb.append("    stepAliases: ").append(toIndentedString(stepAliases)).append("\n");
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
