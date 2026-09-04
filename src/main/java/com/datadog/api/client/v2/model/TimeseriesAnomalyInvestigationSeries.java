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

/** Logical series on which the anomaly was detected. */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationSeries.JSON_PROPERTY_GROUP_TAGS,
  TimeseriesAnomalyInvestigationSeries.JSON_PROPERTY_LABEL,
  TimeseriesAnomalyInvestigationSeries.JSON_PROPERTY_QUERY_INDEX
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationSeries {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_TAGS = "group_tags";
  private List<String> groupTags = new ArrayList<>();

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_QUERY_INDEX = "query_index";
  private Long queryIndex;

  public TimeseriesAnomalyInvestigationSeries() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationSeries(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_TAGS) List<String> groupTags,
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL) String label,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_INDEX) Long queryIndex) {
    this.groupTags = groupTags;
    this.label = label;
    this.queryIndex = queryIndex;
  }

  public TimeseriesAnomalyInvestigationSeries groupTags(List<String> groupTags) {
    this.groupTags = groupTags;
    return this;
  }

  public TimeseriesAnomalyInvestigationSeries addGroupTagsItem(String groupTagsItem) {
    this.groupTags.add(groupTagsItem);
    return this;
  }

  /**
   * Tags identifying the selected group. Empty for a query without grouping.
   *
   * @return groupTags
   */
  @JsonProperty(JSON_PROPERTY_GROUP_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getGroupTags() {
    return groupTags;
  }

  public void setGroupTags(List<String> groupTags) {
    this.groupTags = groupTags;
  }

  public TimeseriesAnomalyInvestigationSeries label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Display label for the selected series.
   *
   * @return label
   */
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public TimeseriesAnomalyInvestigationSeries queryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
    return this;
  }

  /**
   * Zero-based index of the caller's formula that produced the series. minimum: 0
   *
   * @return queryIndex
   */
  @JsonProperty(JSON_PROPERTY_QUERY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getQueryIndex() {
    return queryIndex;
  }

  public void setQueryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
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
   * @return TimeseriesAnomalyInvestigationSeries
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationSeries putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TimeseriesAnomalyInvestigationSeries object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationSeries timeseriesAnomalyInvestigationSeries =
        (TimeseriesAnomalyInvestigationSeries) o;
    return Objects.equals(this.groupTags, timeseriesAnomalyInvestigationSeries.groupTags)
        && Objects.equals(this.label, timeseriesAnomalyInvestigationSeries.label)
        && Objects.equals(this.queryIndex, timeseriesAnomalyInvestigationSeries.queryIndex)
        && Objects.equals(
            this.additionalProperties, timeseriesAnomalyInvestigationSeries.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupTags, label, queryIndex, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationSeries {\n");
    sb.append("    groupTags: ").append(toIndentedString(groupTags)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    queryIndex: ").append(toIndentedString(queryIndex)).append("\n");
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
