/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Filters for user journey search. */
@JsonPropertyOrder({
  UserJourneySearchFilters.JSON_PROPERTY_AUDIENCE_FILTERS,
  UserJourneySearchFilters.JSON_PROPERTY_GRAPH_FILTERS,
  UserJourneySearchFilters.JSON_PROPERTY_STRING_FILTER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserJourneySearchFilters {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private ProductAnalyticsAudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_GRAPH_FILTERS = "graph_filters";
  private List<UserJourneySearchGraphFilter> graphFilters = null;

  public static final String JSON_PROPERTY_STRING_FILTER = "string_filter";
  private String stringFilter;

  public UserJourneySearchFilters audienceFilters(ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * Product Analytics/RUM audience filters.
   *
   * @return audienceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsAudienceFilters getAudienceFilters() {
    return audienceFilters;
  }

  public void setAudienceFilters(ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
  }

  public UserJourneySearchFilters graphFilters(List<UserJourneySearchGraphFilter> graphFilters) {
    this.graphFilters = graphFilters;
    for (UserJourneySearchGraphFilter item : graphFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UserJourneySearchFilters addGraphFiltersItem(
      UserJourneySearchGraphFilter graphFiltersItem) {
    if (this.graphFilters == null) {
      this.graphFilters = new ArrayList<>();
    }
    this.graphFilters.add(graphFiltersItem);
    this.unparsed |= graphFiltersItem.unparsed;
    return this;
  }

  /**
   * Graph filters.
   *
   * @return graphFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAPH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UserJourneySearchGraphFilter> getGraphFilters() {
    return graphFilters;
  }

  public void setGraphFilters(List<UserJourneySearchGraphFilter> graphFilters) {
    this.graphFilters = graphFilters;
  }

  public UserJourneySearchFilters stringFilter(String stringFilter) {
    this.stringFilter = stringFilter;
    return this;
  }

  /**
   * String filter.
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
   * @return UserJourneySearchFilters
   */
  @JsonAnySetter
  public UserJourneySearchFilters putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UserJourneySearchFilters object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserJourneySearchFilters userJourneySearchFilters = (UserJourneySearchFilters) o;
    return Objects.equals(this.audienceFilters, userJourneySearchFilters.audienceFilters)
        && Objects.equals(this.graphFilters, userJourneySearchFilters.graphFilters)
        && Objects.equals(this.stringFilter, userJourneySearchFilters.stringFilter)
        && Objects.equals(this.additionalProperties, userJourneySearchFilters.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceFilters, graphFilters, stringFilter, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserJourneySearchFilters {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    graphFilters: ").append(toIndentedString(graphFilters)).append("\n");
    sb.append("    stringFilter: ").append(toIndentedString(stringFilter)).append("\n");
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
