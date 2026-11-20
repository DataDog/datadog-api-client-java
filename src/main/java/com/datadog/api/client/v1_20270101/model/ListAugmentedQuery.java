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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ListAugmentedQuery.JSON_PROPERTY_AUGMENT_QUERY,
  ListAugmentedQuery.JSON_PROPERTY_BASE_QUERY,
  ListAugmentedQuery.JSON_PROPERTY_CONTEXT,
  ListAugmentedQuery.JSON_PROPERTY_DATA_SOURCE,
  ListAugmentedQuery.JSON_PROPERTY_JOIN_CONDITION,
  ListAugmentedQuery.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListAugmentedQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUGMENT_QUERY = "augment_query";
  private CompositeSourceSubQuery augmentQuery;

  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private CompositeSourceBaseQuery baseQuery;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private EventsContext context;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ListAugmentedQueryDataSource dataSource;

  public static final String JSON_PROPERTY_JOIN_CONDITION = "join_condition";
  private ListAugmentedQueryJoinCondition joinCondition;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ListAugmentedQuery() {}

  @JsonCreator
  public ListAugmentedQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUGMENT_QUERY)
          CompositeSourceSubQuery augmentQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          CompositeSourceBaseQuery baseQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ListAugmentedQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_CONDITION)
          ListAugmentedQueryJoinCondition joinCondition,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.augmentQuery = augmentQuery;
    this.unparsed |= augmentQuery.unparsed;
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
    this.name = name;
  }

  public ListAugmentedQuery augmentQuery(CompositeSourceSubQuery augmentQuery) {
    this.augmentQuery = augmentQuery;
    this.unparsed |= augmentQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return augmentQuery
   */
  @JsonProperty(JSON_PROPERTY_AUGMENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CompositeSourceSubQuery getAugmentQuery() {
    return augmentQuery;
  }

  public void setAugmentQuery(CompositeSourceSubQuery augmentQuery) {
    this.augmentQuery = augmentQuery;
    if (augmentQuery != null) {
      this.unparsed |= augmentQuery.unparsed;
    }
  }

  public ListAugmentedQuery baseQuery(CompositeSourceBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return baseQuery
   */
  @JsonProperty(JSON_PROPERTY_BASE_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CompositeSourceBaseQuery getBaseQuery() {
    return baseQuery;
  }

  public void setBaseQuery(CompositeSourceBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
    if (baseQuery != null) {
      this.unparsed |= baseQuery.unparsed;
    }
  }

  public ListAugmentedQuery context(EventsContext context) {
    this.context = context;
    this.unparsed |= context.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return context
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventsContext getContext() {
    return context;
  }

  public void setContext(EventsContext context) {
    this.context = context;
    if (context != null) {
      this.unparsed |= context.unparsed;
    }
  }

  public ListAugmentedQuery dataSource(ListAugmentedQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListAugmentedQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ListAugmentedQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ListAugmentedQuery joinCondition(ListAugmentedQueryJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return joinCondition
   */
  @JsonProperty(JSON_PROPERTY_JOIN_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListAugmentedQueryJoinCondition getJoinCondition() {
    return joinCondition;
  }

  public void setJoinCondition(ListAugmentedQueryJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
    if (joinCondition != null) {
      this.unparsed |= joinCondition.unparsed;
    }
  }

  public ListAugmentedQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /** Return true if this ListAugmentedQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAugmentedQuery listAugmentedQuery = (ListAugmentedQuery) o;
    return Objects.equals(this.augmentQuery, listAugmentedQuery.augmentQuery)
        && Objects.equals(this.baseQuery, listAugmentedQuery.baseQuery)
        && Objects.equals(this.context, listAugmentedQuery.context)
        && Objects.equals(this.dataSource, listAugmentedQuery.dataSource)
        && Objects.equals(this.joinCondition, listAugmentedQuery.joinCondition)
        && Objects.equals(this.name, listAugmentedQuery.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(augmentQuery, baseQuery, context, dataSource, joinCondition, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAugmentedQuery {\n");
    sb.append("    augmentQuery: ").append(toIndentedString(augmentQuery)).append("\n");
    sb.append("    baseQuery: ").append(toIndentedString(baseQuery)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    joinCondition: ").append(toIndentedString(joinCondition)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
