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

/** A top long task invoker within an invoker type. */
@JsonPropertyOrder({
  TopLongTaskInvoker.JSON_PROPERTY_CRITERIA_VIEW_OCCURRENCES,
  TopLongTaskInvoker.JSON_PROPERTY_FILE,
  TopLongTaskInvoker.JSON_PROPERTY_IMPACT_SCORE,
  TopLongTaskInvoker.JSON_PROPERTY_INVOKER,
  TopLongTaskInvoker.JSON_PROPERTY_STATS_PER_VIEW,
  TopLongTaskInvoker.JSON_PROPERTY_VIEW_OCCURRENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopLongTaskInvoker {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CRITERIA_VIEW_OCCURRENCES = "criteria_view_occurrences";
  private Integer criteriaViewOccurrences;

  public static final String JSON_PROPERTY_FILE = "file";
  private String file;

  public static final String JSON_PROPERTY_IMPACT_SCORE = "impact_score";
  private Double impactScore;

  public static final String JSON_PROPERTY_INVOKER = "invoker";
  private String invoker;

  public static final String JSON_PROPERTY_STATS_PER_VIEW = "stats_per_view";
  private LongTaskStatsPerView statsPerView;

  public static final String JSON_PROPERTY_VIEW_OCCURRENCES = "view_occurrences";
  private Integer viewOccurrences;

  public TopLongTaskInvoker() {}

  @JsonCreator
  public TopLongTaskInvoker(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILE) String file,
      @JsonProperty(required = true, value = JSON_PROPERTY_INVOKER) String invoker,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATS_PER_VIEW)
          LongTaskStatsPerView statsPerView,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_OCCURRENCES)
          Integer viewOccurrences) {
    this.file = file;
    if (file != null) {}
    this.invoker = invoker;
    this.statsPerView = statsPerView;
    this.unparsed |= statsPerView.unparsed;
    this.viewOccurrences = viewOccurrences;
  }

  public TopLongTaskInvoker criteriaViewOccurrences(Integer criteriaViewOccurrences) {
    this.criteriaViewOccurrences = criteriaViewOccurrences;
    return this;
  }

  /**
   * Number of sampled views where this invoker had long tasks contributing to the criteria metric.
   * maximum: 2147483647
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

  public TopLongTaskInvoker file(String file) {
    this.file = file;
    if (file != null) {}
    return this;
  }

  /**
   * Cleaned source file path for the invoker script.
   *
   * @return file
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public TopLongTaskInvoker impactScore(Double impactScore) {
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

  public TopLongTaskInvoker invoker(String invoker) {
    this.invoker = invoker;
    return this;
  }

  /**
   * Name of the invoker function or script.
   *
   * @return invoker
   */
  @JsonProperty(JSON_PROPERTY_INVOKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInvoker() {
    return invoker;
  }

  public void setInvoker(String invoker) {
    this.invoker = invoker;
  }

  public TopLongTaskInvoker statsPerView(LongTaskStatsPerView statsPerView) {
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
    if (statsPerView != null) {
      this.unparsed |= statsPerView.unparsed;
    }
  }

  public TopLongTaskInvoker viewOccurrences(Integer viewOccurrences) {
    this.viewOccurrences = viewOccurrences;
    return this;
  }

  /**
   * Number of sampled views where this invoker had any long tasks. maximum: 2147483647
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
   * @return TopLongTaskInvoker
   */
  @JsonAnySetter
  public TopLongTaskInvoker putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TopLongTaskInvoker object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopLongTaskInvoker topLongTaskInvoker = (TopLongTaskInvoker) o;
    return Objects.equals(this.criteriaViewOccurrences, topLongTaskInvoker.criteriaViewOccurrences)
        && Objects.equals(this.file, topLongTaskInvoker.file)
        && Objects.equals(this.impactScore, topLongTaskInvoker.impactScore)
        && Objects.equals(this.invoker, topLongTaskInvoker.invoker)
        && Objects.equals(this.statsPerView, topLongTaskInvoker.statsPerView)
        && Objects.equals(this.viewOccurrences, topLongTaskInvoker.viewOccurrences)
        && Objects.equals(this.additionalProperties, topLongTaskInvoker.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        criteriaViewOccurrences,
        file,
        impactScore,
        invoker,
        statsPerView,
        viewOccurrences,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopLongTaskInvoker {\n");
    sb.append("    criteriaViewOccurrences: ")
        .append(toIndentedString(criteriaViewOccurrences))
        .append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    impactScore: ").append(toIndentedString(impactScore)).append("\n");
    sb.append("    invoker: ").append(toIndentedString(invoker)).append("\n");
    sb.append("    statsPerView: ").append(toIndentedString(statsPerView)).append("\n");
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
