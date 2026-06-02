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

/** Aggregated mobile scroll friction detection at view level. */
@JsonPropertyOrder({
  AggregatedMobileScrollFriction.JSON_PROPERTY_AVG_SCROLL_FROZEN_FRAME_COUNT,
  AggregatedMobileScrollFriction.JSON_PROPERTY_FINGERPRINT,
  AggregatedMobileScrollFriction.JSON_PROPERTY_IMPACT_SCORE,
  AggregatedMobileScrollFriction.JSON_PROPERTY_VIEW_OCCURRENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedMobileScrollFriction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_SCROLL_FROZEN_FRAME_COUNT =
      "avg_scroll_frozen_frame_count";
  private Integer avgScrollFrozenFrameCount;

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  private String fingerprint;

  public static final String JSON_PROPERTY_IMPACT_SCORE = "impact_score";
  private Double impactScore;

  public static final String JSON_PROPERTY_VIEW_OCCURRENCES = "view_occurrences";
  private Integer viewOccurrences;

  public AggregatedMobileScrollFriction() {}

  @JsonCreator
  public AggregatedMobileScrollFriction(
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_SCROLL_FROZEN_FRAME_COUNT)
          Integer avgScrollFrozenFrameCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINGERPRINT) String fingerprint,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPACT_SCORE) Double impactScore,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_OCCURRENCES)
          Integer viewOccurrences) {
    this.avgScrollFrozenFrameCount = avgScrollFrozenFrameCount;
    this.fingerprint = fingerprint;
    this.impactScore = impactScore;
    this.viewOccurrences = viewOccurrences;
  }

  public AggregatedMobileScrollFriction avgScrollFrozenFrameCount(
      Integer avgScrollFrozenFrameCount) {
    this.avgScrollFrozenFrameCount = avgScrollFrozenFrameCount;
    return this;
  }

  /**
   * Average number of frozen frames during scroll interactions. maximum: 2147483647
   *
   * @return avgScrollFrozenFrameCount
   */
  @JsonProperty(JSON_PROPERTY_AVG_SCROLL_FROZEN_FRAME_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getAvgScrollFrozenFrameCount() {
    return avgScrollFrozenFrameCount;
  }

  public void setAvgScrollFrozenFrameCount(Integer avgScrollFrozenFrameCount) {
    this.avgScrollFrozenFrameCount = avgScrollFrozenFrameCount;
  }

  public AggregatedMobileScrollFriction fingerprint(String fingerprint) {
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

  public AggregatedMobileScrollFriction impactScore(Double impactScore) {
    this.impactScore = impactScore;
    return this;
  }

  /**
   * Impact score for this detection.
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

  public AggregatedMobileScrollFriction viewOccurrences(Integer viewOccurrences) {
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
   * @return AggregatedMobileScrollFriction
   */
  @JsonAnySetter
  public AggregatedMobileScrollFriction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedMobileScrollFriction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedMobileScrollFriction aggregatedMobileScrollFriction =
        (AggregatedMobileScrollFriction) o;
    return Objects.equals(
            this.avgScrollFrozenFrameCount,
            aggregatedMobileScrollFriction.avgScrollFrozenFrameCount)
        && Objects.equals(this.fingerprint, aggregatedMobileScrollFriction.fingerprint)
        && Objects.equals(this.impactScore, aggregatedMobileScrollFriction.impactScore)
        && Objects.equals(this.viewOccurrences, aggregatedMobileScrollFriction.viewOccurrences)
        && Objects.equals(
            this.additionalProperties, aggregatedMobileScrollFriction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avgScrollFrozenFrameCount, fingerprint, impactScore, viewOccurrences, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedMobileScrollFriction {\n");
    sb.append("    avgScrollFrozenFrameCount: ")
        .append(toIndentedString(avgScrollFrozenFrameCount))
        .append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    impactScore: ").append(toIndentedString(impactScore)).append("\n");
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
