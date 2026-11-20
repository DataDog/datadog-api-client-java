/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  GraphQuerySearchFilters.JSON_PROPERTY_AUDIENCE_FILTERS,
  GraphQuerySearchFilters.JSON_PROPERTY_GRAPH_FILTERS,
  GraphQuerySearchFilters.JSON_PROPERTY_STRING_FILTER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GraphQuerySearchFilters {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private AudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_GRAPH_FILTERS = "graph_filters";
  private List<GraphQuerySearchFilter> graphFilters = null;

  public static final String JSON_PROPERTY_STRING_FILTER = "string_filter";
  private String stringFilter;

  public GraphQuerySearchFilters audienceFilters(AudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return audienceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AudienceFilters getAudienceFilters() {
    return audienceFilters;
  }

  public void setAudienceFilters(AudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    if (audienceFilters != null) {
      this.unparsed |= audienceFilters.unparsed;
    }
  }

  public GraphQuerySearchFilters graphFilters(List<GraphQuerySearchFilter> graphFilters) {
    this.graphFilters = graphFilters;
    if (graphFilters != null) {
      for (GraphQuerySearchFilter item : graphFilters) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GraphQuerySearchFilters addGraphFiltersItem(GraphQuerySearchFilter graphFiltersItem) {
    if (this.graphFilters == null) {
      this.graphFilters = new ArrayList<>();
    }
    this.graphFilters.add(graphFiltersItem);
    this.unparsed |= graphFiltersItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return graphFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAPH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GraphQuerySearchFilter> getGraphFilters() {
    return graphFilters;
  }

  public void setGraphFilters(List<GraphQuerySearchFilter> graphFilters) {
    this.graphFilters = graphFilters;
    if (graphFilters != null) {
      for (GraphQuerySearchFilter item : graphFilters) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GraphQuerySearchFilters stringFilter(String stringFilter) {
    this.stringFilter = stringFilter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return stringFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRING_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStringFilter() {
    return stringFilter;
  }

  public void setStringFilter(String stringFilter) {
    this.stringFilter = stringFilter;
  }

  /** Return true if this GraphQuerySearchFilters object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphQuerySearchFilters graphQuerySearchFilters = (GraphQuerySearchFilters) o;
    return Objects.equals(this.audienceFilters, graphQuerySearchFilters.audienceFilters)
        && Objects.equals(this.graphFilters, graphQuerySearchFilters.graphFilters)
        && Objects.equals(this.stringFilter, graphQuerySearchFilters.stringFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceFilters, graphFilters, stringFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphQuerySearchFilters {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    graphFilters: ").append(toIndentedString(graphFilters)).append("\n");
    sb.append("    stringFilter: ").append(toIndentedString(stringFilter)).append("\n");
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
