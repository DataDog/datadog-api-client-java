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

/** Aggregated slow interaction with long task detection grouped by action and selector. */
@JsonPropertyOrder({
  AggregatedSlowInteractionLongTask.JSON_PROPERTY_ACTION_TYPE,
  AggregatedSlowInteractionLongTask.JSON_PROPERTY_AVG_BLOCKING_DURATION,
  AggregatedSlowInteractionLongTask.JSON_PROPERTY_AVG_DURATION,
  AggregatedSlowInteractionLongTask.JSON_PROPERTY_FINGERPRINT,
  AggregatedSlowInteractionLongTask.JSON_PROPERTY_IMPACT_SCORE,
  AggregatedSlowInteractionLongTask.JSON_PROPERTY_INSTANCE_COUNT,
  AggregatedSlowInteractionLongTask.JSON_PROPERTY_SELECTOR,
  AggregatedSlowInteractionLongTask.JSON_PROPERTY_SELECTOR_NORMALIZED,
  AggregatedSlowInteractionLongTask.JSON_PROPERTY_VIEW_OCCURRENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedSlowInteractionLongTask {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION_TYPE = "action_type";
  private String actionType;

  public static final String JSON_PROPERTY_AVG_BLOCKING_DURATION = "avg_blocking_duration";
  private Long avgBlockingDuration;

  public static final String JSON_PROPERTY_AVG_DURATION = "avg_duration";
  private Long avgDuration;

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  private String fingerprint;

  public static final String JSON_PROPERTY_IMPACT_SCORE = "impact_score";
  private Double impactScore;

  public static final String JSON_PROPERTY_INSTANCE_COUNT = "instance_count";
  private Integer instanceCount;

  public static final String JSON_PROPERTY_SELECTOR = "selector";
  private String selector;

  public static final String JSON_PROPERTY_SELECTOR_NORMALIZED = "selector_normalized";
  private String selectorNormalized;

  public static final String JSON_PROPERTY_VIEW_OCCURRENCES = "view_occurrences";
  private Integer viewOccurrences;

  public AggregatedSlowInteractionLongTask() {}

  @JsonCreator
  public AggregatedSlowInteractionLongTask(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION_TYPE) String actionType,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_BLOCKING_DURATION)
          Long avgBlockingDuration,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_DURATION) Long avgDuration,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINGERPRINT) String fingerprint,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPACT_SCORE) Double impactScore,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_COUNT) Integer instanceCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_SELECTOR) String selector,
      @JsonProperty(required = true, value = JSON_PROPERTY_SELECTOR_NORMALIZED)
          String selectorNormalized,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_OCCURRENCES)
          Integer viewOccurrences) {
    this.actionType = actionType;
    this.avgBlockingDuration = avgBlockingDuration;
    this.avgDuration = avgDuration;
    this.fingerprint = fingerprint;
    this.impactScore = impactScore;
    this.instanceCount = instanceCount;
    this.selector = selector;
    if (selector != null) {}
    this.selectorNormalized = selectorNormalized;
    if (selectorNormalized != null) {}
    this.viewOccurrences = viewOccurrences;
  }

  public AggregatedSlowInteractionLongTask actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Type of user interaction that triggered the slow response.
   *
   * @return actionType
   */
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public AggregatedSlowInteractionLongTask avgBlockingDuration(Long avgBlockingDuration) {
    this.avgBlockingDuration = avgBlockingDuration;
    return this;
  }

  /**
   * Average long task blocking duration in nanoseconds.
   *
   * @return avgBlockingDuration
   */
  @JsonProperty(JSON_PROPERTY_AVG_BLOCKING_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgBlockingDuration() {
    return avgBlockingDuration;
  }

  public void setAvgBlockingDuration(Long avgBlockingDuration) {
    this.avgBlockingDuration = avgBlockingDuration;
  }

  public AggregatedSlowInteractionLongTask avgDuration(Long avgDuration) {
    this.avgDuration = avgDuration;
    return this;
  }

  /**
   * Average total interaction duration in nanoseconds.
   *
   * @return avgDuration
   */
  @JsonProperty(JSON_PROPERTY_AVG_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgDuration() {
    return avgDuration;
  }

  public void setAvgDuration(Long avgDuration) {
    this.avgDuration = avgDuration;
  }

  public AggregatedSlowInteractionLongTask fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Unique fingerprint identifying this detection group.
   *
   * @return fingerprint
   */
  @JsonProperty(JSON_PROPERTY_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public AggregatedSlowInteractionLongTask impactScore(Double impactScore) {
    this.impactScore = impactScore;
    return this;
  }

  /**
   * Impact score combining view frequency and blocking severity.
   *
   * @return impactScore
   */
  @JsonProperty(JSON_PROPERTY_IMPACT_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getImpactScore() {
    return impactScore;
  }

  public void setImpactScore(Double impactScore) {
    this.impactScore = impactScore;
  }

  public AggregatedSlowInteractionLongTask instanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

  /**
   * Total number of detection instances across sampled views. maximum: 2147483647
   *
   * @return instanceCount
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  public AggregatedSlowInteractionLongTask selector(String selector) {
    this.selector = selector;
    if (selector != null) {}
    return this;
  }

  /**
   * CSS selector of the element that was interacted with.
   *
   * @return selector
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }

  public AggregatedSlowInteractionLongTask selectorNormalized(String selectorNormalized) {
    this.selectorNormalized = selectorNormalized;
    if (selectorNormalized != null) {}
    return this;
  }

  /**
   * Normalized CSS selector with dynamic parts replaced.
   *
   * @return selectorNormalized
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTOR_NORMALIZED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSelectorNormalized() {
    return selectorNormalized;
  }

  public void setSelectorNormalized(String selectorNormalized) {
    this.selectorNormalized = selectorNormalized;
  }

  public AggregatedSlowInteractionLongTask viewOccurrences(Integer viewOccurrences) {
    this.viewOccurrences = viewOccurrences;
    return this;
  }

  /**
   * Number of sampled views where this detection occurred. maximum: 2147483647
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
   * @return AggregatedSlowInteractionLongTask
   */
  @JsonAnySetter
  public AggregatedSlowInteractionLongTask putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedSlowInteractionLongTask object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedSlowInteractionLongTask aggregatedSlowInteractionLongTask =
        (AggregatedSlowInteractionLongTask) o;
    return Objects.equals(this.actionType, aggregatedSlowInteractionLongTask.actionType)
        && Objects.equals(
            this.avgBlockingDuration, aggregatedSlowInteractionLongTask.avgBlockingDuration)
        && Objects.equals(this.avgDuration, aggregatedSlowInteractionLongTask.avgDuration)
        && Objects.equals(this.fingerprint, aggregatedSlowInteractionLongTask.fingerprint)
        && Objects.equals(this.impactScore, aggregatedSlowInteractionLongTask.impactScore)
        && Objects.equals(this.instanceCount, aggregatedSlowInteractionLongTask.instanceCount)
        && Objects.equals(this.selector, aggregatedSlowInteractionLongTask.selector)
        && Objects.equals(
            this.selectorNormalized, aggregatedSlowInteractionLongTask.selectorNormalized)
        && Objects.equals(this.viewOccurrences, aggregatedSlowInteractionLongTask.viewOccurrences)
        && Objects.equals(
            this.additionalProperties, aggregatedSlowInteractionLongTask.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionType,
        avgBlockingDuration,
        avgDuration,
        fingerprint,
        impactScore,
        instanceCount,
        selector,
        selectorNormalized,
        viewOccurrences,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedSlowInteractionLongTask {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    avgBlockingDuration: ")
        .append(toIndentedString(avgBlockingDuration))
        .append("\n");
    sb.append("    avgDuration: ").append(toIndentedString(avgDuration)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    impactScore: ").append(toIndentedString(impactScore)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    selectorNormalized: ").append(toIndentedString(selectorNormalized)).append("\n");
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
