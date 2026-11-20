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
  ListSegmentQuery.JSON_PROPERTY_BASE_QUERY,
  ListSegmentQuery.JSON_PROPERTY_CONTEXT,
  ListSegmentQuery.JSON_PROPERTY_DATA_SOURCE,
  ListSegmentQuery.JSON_PROPERTY_NAME,
  ListSegmentQuery.JSON_PROPERTY_SEGMENT_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListSegmentQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private CompositeEventsPlatformQuery baseQuery;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private EventsContext context;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ListSegmentQueryDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEGMENT_QUERY = "segment_query";
  private ListSegmentQuerySegmentQuery segmentQuery;

  public ListSegmentQuery() {}

  @JsonCreator
  public ListSegmentQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          CompositeEventsPlatformQuery baseQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ListSegmentQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEGMENT_QUERY)
          ListSegmentQuerySegmentQuery segmentQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.segmentQuery = segmentQuery;
    this.unparsed |= segmentQuery.unparsed;
  }

  public ListSegmentQuery baseQuery(CompositeEventsPlatformQuery baseQuery) {
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
  public CompositeEventsPlatformQuery getBaseQuery() {
    return baseQuery;
  }

  public void setBaseQuery(CompositeEventsPlatformQuery baseQuery) {
    this.baseQuery = baseQuery;
    if (baseQuery != null) {
      this.unparsed |= baseQuery.unparsed;
    }
  }

  public ListSegmentQuery context(EventsContext context) {
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

  public ListSegmentQuery dataSource(ListSegmentQueryDataSource dataSource) {
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
  public ListSegmentQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ListSegmentQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ListSegmentQuery name(String name) {
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

  public ListSegmentQuery segmentQuery(ListSegmentQuerySegmentQuery segmentQuery) {
    this.segmentQuery = segmentQuery;
    this.unparsed |= segmentQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return segmentQuery
   */
  @JsonProperty(JSON_PROPERTY_SEGMENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListSegmentQuerySegmentQuery getSegmentQuery() {
    return segmentQuery;
  }

  public void setSegmentQuery(ListSegmentQuerySegmentQuery segmentQuery) {
    this.segmentQuery = segmentQuery;
    if (segmentQuery != null) {
      this.unparsed |= segmentQuery.unparsed;
    }
  }

  /** Return true if this ListSegmentQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSegmentQuery listSegmentQuery = (ListSegmentQuery) o;
    return Objects.equals(this.baseQuery, listSegmentQuery.baseQuery)
        && Objects.equals(this.context, listSegmentQuery.context)
        && Objects.equals(this.dataSource, listSegmentQuery.dataSource)
        && Objects.equals(this.name, listSegmentQuery.name)
        && Objects.equals(this.segmentQuery, listSegmentQuery.segmentQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseQuery, context, dataSource, name, segmentQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSegmentQuery {\n");
    sb.append("    baseQuery: ").append(toIndentedString(baseQuery)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    segmentQuery: ").append(toIndentedString(segmentQuery)).append("\n");
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
