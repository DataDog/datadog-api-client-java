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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Request body for filtering cost recommendations. */
@JsonPropertyOrder({
  RecommendationsFilterRequest.JSON_PROPERTY_FILTER,
  RecommendationsFilterRequest.JSON_PROPERTY_SORT,
  RecommendationsFilterRequest.JSON_PROPERTY_VIEW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RecommendationsFilterRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_SORT = "sort";
  private List<RecommendationsFilterRequestSortItems> sort = null;

  public static final String JSON_PROPERTY_VIEW = "view";
  private String view;

  public RecommendationsFilterRequest filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Filter expression applied to the recommendations.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public RecommendationsFilterRequest sort(List<RecommendationsFilterRequestSortItems> sort) {
    this.sort = sort;
    if (sort != null) {
      for (RecommendationsFilterRequestSortItems item : sort) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public RecommendationsFilterRequest addSortItem(RecommendationsFilterRequestSortItems sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    this.unparsed |= sortItem.unparsed;
    return this;
  }

  /**
   * Ordered list of sort clauses applied to the result set.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RecommendationsFilterRequestSortItems> getSort() {
    return sort;
  }

  public void setSort(List<RecommendationsFilterRequestSortItems> sort) {
    this.sort = sort;
    if (sort != null) {
      for (RecommendationsFilterRequestSortItems item : sort) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public RecommendationsFilterRequest view(String view) {
    this.view = view;
    return this;
  }

  /**
   * Active view name (for example, <code>active</code>, <code>dismissed</code>, <code>open</code>,
   * <code>in-progress</code>, or <code>completed</code>).
   *
   * @return view
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
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
   * @return RecommendationsFilterRequest
   */
  @JsonAnySetter
  public RecommendationsFilterRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RecommendationsFilterRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationsFilterRequest recommendationsFilterRequest = (RecommendationsFilterRequest) o;
    return Objects.equals(this.filter, recommendationsFilterRequest.filter)
        && Objects.equals(this.sort, recommendationsFilterRequest.sort)
        && Objects.equals(this.view, recommendationsFilterRequest.view)
        && Objects.equals(
            this.additionalProperties, recommendationsFilterRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, sort, view, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationsFilterRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
