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

/** Aggregated high frozen frame rate detection at view level. */
@JsonPropertyOrder({
  AggregatedHighFrozenFrameRate.JSON_PROPERTY_AVG_FROZEN_FRAME_RATE,
  AggregatedHighFrozenFrameRate.JSON_PROPERTY_AVG_SEGMENT_DURATION,
  AggregatedHighFrozenFrameRate.JSON_PROPERTY_AVG_TOTAL_FROZEN_DURATION,
  AggregatedHighFrozenFrameRate.JSON_PROPERTY_FINGERPRINT,
  AggregatedHighFrozenFrameRate.JSON_PROPERTY_IMPACT_SCORE,
  AggregatedHighFrozenFrameRate.JSON_PROPERTY_VIEW_OCCURRENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedHighFrozenFrameRate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_FROZEN_FRAME_RATE = "avg_frozen_frame_rate";
  private Double avgFrozenFrameRate;

  public static final String JSON_PROPERTY_AVG_SEGMENT_DURATION = "avg_segment_duration";
  private Long avgSegmentDuration;

  public static final String JSON_PROPERTY_AVG_TOTAL_FROZEN_DURATION = "avg_total_frozen_duration";
  private Long avgTotalFrozenDuration;

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  private String fingerprint;

  public static final String JSON_PROPERTY_IMPACT_SCORE = "impact_score";
  private Double impactScore;

  public static final String JSON_PROPERTY_VIEW_OCCURRENCES = "view_occurrences";
  private Integer viewOccurrences;

  public AggregatedHighFrozenFrameRate() {}

  @JsonCreator
  public AggregatedHighFrozenFrameRate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_FROZEN_FRAME_RATE)
          Double avgFrozenFrameRate,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_SEGMENT_DURATION)
          Long avgSegmentDuration,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_TOTAL_FROZEN_DURATION)
          Long avgTotalFrozenDuration,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINGERPRINT) String fingerprint,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPACT_SCORE) Double impactScore,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_OCCURRENCES)
          Integer viewOccurrences) {
    this.avgFrozenFrameRate = avgFrozenFrameRate;
    this.avgSegmentDuration = avgSegmentDuration;
    this.avgTotalFrozenDuration = avgTotalFrozenDuration;
    this.fingerprint = fingerprint;
    this.impactScore = impactScore;
    this.viewOccurrences = viewOccurrences;
  }

  public AggregatedHighFrozenFrameRate avgFrozenFrameRate(Double avgFrozenFrameRate) {
    this.avgFrozenFrameRate = avgFrozenFrameRate;
    return this;
  }

  /**
   * Average frozen frame rate as a fraction of total frames.
   *
   * @return avgFrozenFrameRate
   */
  @JsonProperty(JSON_PROPERTY_AVG_FROZEN_FRAME_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgFrozenFrameRate() {
    return avgFrozenFrameRate;
  }

  public void setAvgFrozenFrameRate(Double avgFrozenFrameRate) {
    this.avgFrozenFrameRate = avgFrozenFrameRate;
  }

  public AggregatedHighFrozenFrameRate avgSegmentDuration(Long avgSegmentDuration) {
    this.avgSegmentDuration = avgSegmentDuration;
    return this;
  }

  /**
   * Average segment duration in nanoseconds.
   *
   * @return avgSegmentDuration
   */
  @JsonProperty(JSON_PROPERTY_AVG_SEGMENT_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgSegmentDuration() {
    return avgSegmentDuration;
  }

  public void setAvgSegmentDuration(Long avgSegmentDuration) {
    this.avgSegmentDuration = avgSegmentDuration;
  }

  public AggregatedHighFrozenFrameRate avgTotalFrozenDuration(Long avgTotalFrozenDuration) {
    this.avgTotalFrozenDuration = avgTotalFrozenDuration;
    return this;
  }

  /**
   * Average total frozen duration in nanoseconds.
   *
   * @return avgTotalFrozenDuration
   */
  @JsonProperty(JSON_PROPERTY_AVG_TOTAL_FROZEN_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgTotalFrozenDuration() {
    return avgTotalFrozenDuration;
  }

  public void setAvgTotalFrozenDuration(Long avgTotalFrozenDuration) {
    this.avgTotalFrozenDuration = avgTotalFrozenDuration;
  }

  public AggregatedHighFrozenFrameRate fingerprint(String fingerprint) {
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

  public AggregatedHighFrozenFrameRate impactScore(Double impactScore) {
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

  public AggregatedHighFrozenFrameRate viewOccurrences(Integer viewOccurrences) {
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
   * @return AggregatedHighFrozenFrameRate
   */
  @JsonAnySetter
  public AggregatedHighFrozenFrameRate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedHighFrozenFrameRate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedHighFrozenFrameRate aggregatedHighFrozenFrameRate = (AggregatedHighFrozenFrameRate) o;
    return Objects.equals(this.avgFrozenFrameRate, aggregatedHighFrozenFrameRate.avgFrozenFrameRate)
        && Objects.equals(this.avgSegmentDuration, aggregatedHighFrozenFrameRate.avgSegmentDuration)
        && Objects.equals(
            this.avgTotalFrozenDuration, aggregatedHighFrozenFrameRate.avgTotalFrozenDuration)
        && Objects.equals(this.fingerprint, aggregatedHighFrozenFrameRate.fingerprint)
        && Objects.equals(this.impactScore, aggregatedHighFrozenFrameRate.impactScore)
        && Objects.equals(this.viewOccurrences, aggregatedHighFrozenFrameRate.viewOccurrences)
        && Objects.equals(
            this.additionalProperties, aggregatedHighFrozenFrameRate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avgFrozenFrameRate,
        avgSegmentDuration,
        avgTotalFrozenDuration,
        fingerprint,
        impactScore,
        viewOccurrences,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedHighFrozenFrameRate {\n");
    sb.append("    avgFrozenFrameRate: ").append(toIndentedString(avgFrozenFrameRate)).append("\n");
    sb.append("    avgSegmentDuration: ").append(toIndentedString(avgSegmentDuration)).append("\n");
    sb.append("    avgTotalFrozenDuration: ")
        .append(toIndentedString(avgTotalFrozenDuration))
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
