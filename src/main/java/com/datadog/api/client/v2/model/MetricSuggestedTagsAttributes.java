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

/** Object containing the definition of a metric's actively queried tags and aggregations. */
@JsonPropertyOrder({
  MetricSuggestedTagsAttributes.JSON_PROPERTY_ACTIVE_AGGREGATIONS,
  MetricSuggestedTagsAttributes.JSON_PROPERTY_ACTIVE_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricSuggestedTagsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIVE_AGGREGATIONS = "active_aggregations";
  private List<MetricCustomAggregation> activeAggregations = null;

  public static final String JSON_PROPERTY_ACTIVE_TAGS = "active_tags";
  private List<String> activeTags = null;

  public MetricSuggestedTagsAttributes activeAggregations(
      List<MetricCustomAggregation> activeAggregations) {
    this.activeAggregations = activeAggregations;
    for (MetricCustomAggregation item : activeAggregations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MetricSuggestedTagsAttributes addActiveAggregationsItem(
      MetricCustomAggregation activeAggregationsItem) {
    if (this.activeAggregations == null) {
      this.activeAggregations = new ArrayList<>();
    }
    this.activeAggregations.add(activeAggregationsItem);
    this.unparsed |= activeAggregationsItem.unparsed;
    return this;
  }

  /**
   * List of aggregation combinations that have been actively queried.
   *
   * @return activeAggregations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_AGGREGATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * List of tag keys that have been actively queried.
   *
   * @return activeTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getActiveTags() {
    return activeTags;
  }

  public void setActiveTags(List<String> activeTags) {
    this.activeTags = activeTags;
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
   * @return MetricSuggestedTagsAttributes
   */
  @JsonAnySetter
  public MetricSuggestedTagsAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricSuggestedTagsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricSuggestedTagsAttributes metricSuggestedTagsAttributes = (MetricSuggestedTagsAttributes) o;
    return Objects.equals(this.activeAggregations, metricSuggestedTagsAttributes.activeAggregations)
        && Objects.equals(this.activeTags, metricSuggestedTagsAttributes.activeTags)
        && Objects.equals(
            this.additionalProperties, metricSuggestedTagsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeAggregations, activeTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricSuggestedTagsAttributes {\n");
    sb.append("    activeAggregations: ").append(toIndentedString(activeAggregations)).append("\n");
    sb.append("    activeTags: ").append(toIndentedString(activeTags)).append("\n");
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
