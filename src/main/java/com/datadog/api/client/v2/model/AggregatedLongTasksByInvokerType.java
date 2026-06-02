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

/** Aggregated long task statistics for a single invoker type. */
@JsonPropertyOrder({
  AggregatedLongTasksByInvokerType.JSON_PROPERTY_CRITERIA_VIEW_OCCURRENCES,
  AggregatedLongTasksByInvokerType.JSON_PROPERTY_IMPACT_SCORE,
  AggregatedLongTasksByInvokerType.JSON_PROPERTY_INVOKER_TYPE,
  AggregatedLongTasksByInvokerType.JSON_PROPERTY_STATS_PER_VIEW,
  AggregatedLongTasksByInvokerType.JSON_PROPERTY_TOP_INVOKERS,
  AggregatedLongTasksByInvokerType.JSON_PROPERTY_VIEW_OCCURRENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedLongTasksByInvokerType {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CRITERIA_VIEW_OCCURRENCES = "criteria_view_occurrences";
  private Integer criteriaViewOccurrences;

  public static final String JSON_PROPERTY_IMPACT_SCORE = "impact_score";
  private Double impactScore;

  public static final String JSON_PROPERTY_INVOKER_TYPE = "invoker_type";
  private String invokerType;

  public static final String JSON_PROPERTY_STATS_PER_VIEW = "stats_per_view";
  private LongTaskStatsPerView statsPerView;

  public static final String JSON_PROPERTY_TOP_INVOKERS = "top_invokers";
  private List<TopLongTaskInvoker> topInvokers = new ArrayList<>();

  public static final String JSON_PROPERTY_VIEW_OCCURRENCES = "view_occurrences";
  private Integer viewOccurrences;

  public AggregatedLongTasksByInvokerType() {}

  @JsonCreator
  public AggregatedLongTasksByInvokerType(
      @JsonProperty(required = true, value = JSON_PROPERTY_INVOKER_TYPE) String invokerType,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATS_PER_VIEW)
          LongTaskStatsPerView statsPerView,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOP_INVOKERS)
          List<TopLongTaskInvoker> topInvokers,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_OCCURRENCES)
          Integer viewOccurrences) {
    this.invokerType = invokerType;
    this.statsPerView = statsPerView;
    this.unparsed |= statsPerView.unparsed;
    this.topInvokers = topInvokers;
    this.viewOccurrences = viewOccurrences;
  }

  public AggregatedLongTasksByInvokerType criteriaViewOccurrences(Integer criteriaViewOccurrences) {
    this.criteriaViewOccurrences = criteriaViewOccurrences;
    return this;
  }

  /**
   * Number of sampled views where this invoker type had long tasks contributing to the criteria
   * metric. maximum: 2147483647
   *
   * @return criteriaViewOccurrences
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITERIA_VIEW_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCriteriaViewOccurrences() {
    return criteriaViewOccurrences;
  }

  public void setCriteriaViewOccurrences(Integer criteriaViewOccurrences) {
    this.criteriaViewOccurrences = criteriaViewOccurrences;
  }

  public AggregatedLongTasksByInvokerType impactScore(Double impactScore) {
    this.impactScore = impactScore;
    return this;
  }

  /**
   * Rank-product impact score combining view frequency and blocking time severity.
   *
   * @return impactScore
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPACT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getImpactScore() {
    return impactScore;
  }

  public void setImpactScore(Double impactScore) {
    this.impactScore = impactScore;
  }

  public AggregatedLongTasksByInvokerType invokerType(String invokerType) {
    this.invokerType = invokerType;
    return this;
  }

  /**
   * Category of the long task invoker (for example, resolve-promise, user-callback).
   *
   * @return invokerType
   */
  @JsonProperty(JSON_PROPERTY_INVOKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInvokerType() {
    return invokerType;
  }

  public void setInvokerType(String invokerType) {
    this.invokerType = invokerType;
  }

  public AggregatedLongTasksByInvokerType statsPerView(LongTaskStatsPerView statsPerView) {
    this.statsPerView = statsPerView;
    this.unparsed |= statsPerView.unparsed;
    return this;
  }

  /**
   * Statistical distributions of long task metrics computed per view across sampled views.
   *
   * @return statsPerView
   */
  @JsonProperty(JSON_PROPERTY_STATS_PER_VIEW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LongTaskStatsPerView getStatsPerView() {
    return statsPerView;
  }

  public void setStatsPerView(LongTaskStatsPerView statsPerView) {
    this.statsPerView = statsPerView;
  }

  public AggregatedLongTasksByInvokerType topInvokers(List<TopLongTaskInvoker> topInvokers) {
    this.topInvokers = topInvokers;
    for (TopLongTaskInvoker item : topInvokers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AggregatedLongTasksByInvokerType addTopInvokersItem(TopLongTaskInvoker topInvokersItem) {
    this.topInvokers.add(topInvokersItem);
    this.unparsed |= topInvokersItem.unparsed;
    return this;
  }

  /**
   * Top invokers within this invoker type, sorted by impact score descending.
   *
   * @return topInvokers
   */
  @JsonProperty(JSON_PROPERTY_TOP_INVOKERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TopLongTaskInvoker> getTopInvokers() {
    return topInvokers;
  }

  public void setTopInvokers(List<TopLongTaskInvoker> topInvokers) {
    this.topInvokers = topInvokers;
  }

  public AggregatedLongTasksByInvokerType viewOccurrences(Integer viewOccurrences) {
    this.viewOccurrences = viewOccurrences;
    return this;
  }

  /**
   * Number of sampled views where this invoker type had any long tasks. maximum: 2147483647
   *
   * @return viewOccurrences
   */
  @JsonProperty(JSON_PROPERTY_VIEW_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getViewOccurrences() {
    return viewOccurrences;
  }

  public void setViewOccurrences(Integer viewOccurrences) {
    this.viewOccurrences = viewOccurrences;
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
   * @return AggregatedLongTasksByInvokerType
   */
  @JsonAnySetter
  public AggregatedLongTasksByInvokerType putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedLongTasksByInvokerType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedLongTasksByInvokerType aggregatedLongTasksByInvokerType =
        (AggregatedLongTasksByInvokerType) o;
    return Objects.equals(
            this.criteriaViewOccurrences, aggregatedLongTasksByInvokerType.criteriaViewOccurrences)
        && Objects.equals(this.impactScore, aggregatedLongTasksByInvokerType.impactScore)
        && Objects.equals(this.invokerType, aggregatedLongTasksByInvokerType.invokerType)
        && Objects.equals(this.statsPerView, aggregatedLongTasksByInvokerType.statsPerView)
        && Objects.equals(this.topInvokers, aggregatedLongTasksByInvokerType.topInvokers)
        && Objects.equals(this.viewOccurrences, aggregatedLongTasksByInvokerType.viewOccurrences)
        && Objects.equals(
            this.additionalProperties, aggregatedLongTasksByInvokerType.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        criteriaViewOccurrences,
        impactScore,
        invokerType,
        statsPerView,
        topInvokers,
        viewOccurrences,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedLongTasksByInvokerType {\n");
    sb.append("    criteriaViewOccurrences: ")
        .append(toIndentedString(criteriaViewOccurrences))
        .append("\n");
    sb.append("    impactScore: ").append(toIndentedString(impactScore)).append("\n");
    sb.append("    invokerType: ").append(toIndentedString(invokerType)).append("\n");
    sb.append("    statsPerView: ").append(toIndentedString(statsPerView)).append("\n");
    sb.append("    topInvokers: ").append(toIndentedString(topInvokers)).append("\n");
    sb.append("    viewOccurrences: ").append(toIndentedString(viewOccurrences)).append("\n");
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
