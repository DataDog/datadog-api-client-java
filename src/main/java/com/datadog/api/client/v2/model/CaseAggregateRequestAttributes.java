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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes for the aggregation request, including the search query and grouping configuration.
 */
@JsonPropertyOrder({
  CaseAggregateRequestAttributes.JSON_PROPERTY_GROUP_BY,
  CaseAggregateRequestAttributes.JSON_PROPERTY_QUERY_FILTER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseAggregateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private CaseAggregateGroupBy groupBy;

  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public CaseAggregateRequestAttributes() {}

  @JsonCreator
  public CaseAggregateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_BY) CaseAggregateGroupBy groupBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_FILTER) String queryFilter) {
    this.groupBy = groupBy;
    this.unparsed |= groupBy.unparsed;
    this.queryFilter = queryFilter;
  }

  public CaseAggregateRequestAttributes groupBy(CaseAggregateGroupBy groupBy) {
    this.groupBy = groupBy;
    this.unparsed |= groupBy.unparsed;
    return this;
  }

  /**
   * Configuration for grouping aggregated results by one or more case fields.
   *
   * @return groupBy
   */
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CaseAggregateGroupBy getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(CaseAggregateGroupBy groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      this.unparsed |= groupBy.unparsed;
    }
  }

  public CaseAggregateRequestAttributes queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * A search query to filter which cases are included in the aggregation. Uses the same syntax as
   * the Case Management search bar.
   *
   * @return queryFilter
   */
  @JsonProperty(JSON_PROPERTY_QUERY_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryFilter() {
    return queryFilter;
  }

  public void setQueryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
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
   * @return CaseAggregateRequestAttributes
   */
  @JsonAnySetter
  public CaseAggregateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseAggregateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseAggregateRequestAttributes caseAggregateRequestAttributes =
        (CaseAggregateRequestAttributes) o;
    return Objects.equals(this.groupBy, caseAggregateRequestAttributes.groupBy)
        && Objects.equals(this.queryFilter, caseAggregateRequestAttributes.queryFilter)
        && Objects.equals(
            this.additionalProperties, caseAggregateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBy, queryFilter, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseAggregateRequestAttributes {\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
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
