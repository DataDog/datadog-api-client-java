/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Object containing the definition of a metric's actively queried tags and aggregations.</p>
 */
@JsonPropertyOrder({
  MetricSuggestedTagsAttributes.JSON_PROPERTY_ACTIVE_AGGREGATIONS,
  MetricSuggestedTagsAttributes.JSON_PROPERTY_ACTIVE_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricSuggestedTagsAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIVE_AGGREGATIONS = "active_aggregations";
  private List<MetricCustomAggregation> activeAggregations = null;

  public static final String JSON_PROPERTY_ACTIVE_TAGS = "active_tags";
  private List<String> activeTags = null;

  public MetricSuggestedTagsAttributes activeAggregations(List<MetricCustomAggregation> activeAggregations) {
    this.activeAggregations = activeAggregations;
    for (MetricCustomAggregation item : activeAggregations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public MetricSuggestedTagsAttributes addActiveAggregationsItem(MetricCustomAggregation activeAggregationsItem) {
    if (this.activeAggregations == null) {
      this.activeAggregations = new ArrayList<>();
    }
    this.activeAggregations.add(activeAggregationsItem);
    this.unparsed |= activeAggregationsItem.unparsed;
    return this;
  }

  /**
   * <p>List of aggregation combinations that have been actively queried.</p>
   * @return activeAggregations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACTIVE_AGGREGATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<MetricCustomAggregation> getActiveAggregations() {
        return activeAggregations;
      }
  public void setActiveAggregations(List<MetricCustomAggregation> activeAggregations) {
    this.activeAggregations = activeAggregations;
  }
  public MetricSuggestedTagsAttributes activeTags(List<String> activeTags) {
    this.activeTags = activeTags;
    return this;
  }
  public MetricSuggestedTagsAttributes addActiveTagsItem(String activeTagsItem) {
    if (this.activeTags == null) {
      this.activeTags = new ArrayList<>();
    }
    this.activeTags.add(activeTagsItem);
    return this;
  }

  /**
   * <p>List of tag keys that have been actively queried.</p>
   * @return activeTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACTIVE_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getActiveTags() {
        return activeTags;
      }
  public void setActiveTags(List<String> activeTags) {
    this.activeTags = activeTags;
  }

  /**
   * Return true if this MetricSuggestedTagsAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricSuggestedTagsAttributes metricSuggestedTagsAttributes = (MetricSuggestedTagsAttributes) o;
    return Objects.equals(this.activeAggregations, metricSuggestedTagsAttributes.activeAggregations) && Objects.equals(this.activeTags, metricSuggestedTagsAttributes.activeTags);
  }


  @Override
  public int hashCode() {
    return Objects.hash(activeAggregations,activeTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricSuggestedTagsAttributes {\n");
    sb.append("    activeAggregations: ").append(toIndentedString(activeAggregations)).append("\n");
    sb.append("    activeTags: ").append(toIndentedString(activeTags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
