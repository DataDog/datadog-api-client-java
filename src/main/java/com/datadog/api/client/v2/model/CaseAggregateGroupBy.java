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

/** Configuration for grouping aggregated results by one or more case fields. */
@JsonPropertyOrder({
  CaseAggregateGroupBy.JSON_PROPERTY_GROUPS,
  CaseAggregateGroupBy.JSON_PROPERTY_LIMIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseAggregateGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public CaseAggregateGroupBy() {}

  @JsonCreator
  public CaseAggregateGroupBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUPS) List<String> groups,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) Integer limit) {
    this.groups = groups;
    this.limit = limit;
  }

  public CaseAggregateGroupBy groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public CaseAggregateGroupBy addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Fields to group by.
   *
   * @return groups
   */
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public CaseAggregateGroupBy limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of groups to return. maximum: 1000
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
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
   * @return CaseAggregateGroupBy
   */
  @JsonAnySetter
  public CaseAggregateGroupBy putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseAggregateGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseAggregateGroupBy caseAggregateGroupBy = (CaseAggregateGroupBy) o;
    return Objects.equals(this.groups, caseAggregateGroupBy.groups)
        && Objects.equals(this.limit, caseAggregateGroupBy.limit)
        && Objects.equals(this.additionalProperties, caseAggregateGroupBy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, limit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseAggregateGroupBy {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
