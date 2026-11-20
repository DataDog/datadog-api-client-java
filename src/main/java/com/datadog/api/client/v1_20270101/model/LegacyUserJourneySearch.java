/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  LegacyUserJourneySearch.JSON_PROPERTY_EXPRESSION,
  LegacyUserJourneySearch.JSON_PROPERTY_FILTERS,
  LegacyUserJourneySearch.JSON_PROPERTY_JOIN_KEYS,
  LegacyUserJourneySearch.JSON_PROPERTY_NODES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LegacyUserJourneySearch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private LegacyUserJourneySearchFilters filters;

  public static final String JSON_PROPERTY_JOIN_KEYS = "join_keys";
  private LegacyUserJourneySearchJoinKeys joinKeys;

  public static final String JSON_PROPERTY_NODES = "nodes";
  private Map<String, String> nodes = new HashMap<String, String>();

  public LegacyUserJourneySearch() {}

  @JsonCreator
  public LegacyUserJourneySearch(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression,
      @JsonProperty(required = true, value = JSON_PROPERTY_NODES) Map<String, String> nodes) {
    this.expression = expression;
    this.nodes = nodes;
  }

  public LegacyUserJourneySearch expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public LegacyUserJourneySearch filters(LegacyUserJourneySearchFilters filters) {
    this.filters = filters;
    this.unparsed |= filters.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LegacyUserJourneySearchFilters getFilters() {
    return filters;
  }

  public void setFilters(LegacyUserJourneySearchFilters filters) {
    this.filters = filters;
    if (filters != null) {
      this.unparsed |= filters.unparsed;
    }
  }

  public LegacyUserJourneySearch joinKeys(LegacyUserJourneySearchJoinKeys joinKeys) {
    this.joinKeys = joinKeys;
    this.unparsed |= joinKeys.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return joinKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOIN_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LegacyUserJourneySearchJoinKeys getJoinKeys() {
    return joinKeys;
  }

  public void setJoinKeys(LegacyUserJourneySearchJoinKeys joinKeys) {
    this.joinKeys = joinKeys;
    if (joinKeys != null) {
      this.unparsed |= joinKeys.unparsed;
    }
  }

  public LegacyUserJourneySearch nodes(Map<String, String> nodes) {
    this.nodes = nodes;
    return this;
  }

  public LegacyUserJourneySearch putNodesItem(String key, String nodesItem) {
    this.nodes.put(key, nodesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return nodes
   */
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getNodes() {
    return nodes;
  }

  public void setNodes(Map<String, String> nodes) {
    this.nodes = nodes;
  }

  /** Return true if this LegacyUserJourneySearch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyUserJourneySearch legacyUserJourneySearch = (LegacyUserJourneySearch) o;
    return Objects.equals(this.expression, legacyUserJourneySearch.expression)
        && Objects.equals(this.filters, legacyUserJourneySearch.filters)
        && Objects.equals(this.joinKeys, legacyUserJourneySearch.joinKeys)
        && Objects.equals(this.nodes, legacyUserJourneySearch.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, filters, joinKeys, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyUserJourneySearch {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    joinKeys: ").append(toIndentedString(joinKeys)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
