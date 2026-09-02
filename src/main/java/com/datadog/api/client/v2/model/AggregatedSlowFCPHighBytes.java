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

/** Aggregated slow first contentful paint with high byte count detection. */
@JsonPropertyOrder({
  AggregatedSlowFCPHighBytes.JSON_PROPERTY_AVG_BYTES_BEFORE_FCP_BYTES,
  AggregatedSlowFCPHighBytes.JSON_PROPERTY_AVG_FIRST_CONTENTFUL_PAINT_MS,
  AggregatedSlowFCPHighBytes.JSON_PROPERTY_AVG_RESOURCE_COUNT_BEFORE_FCP,
  AggregatedSlowFCPHighBytes.JSON_PROPERTY_FINGERPRINT,
  AggregatedSlowFCPHighBytes.JSON_PROPERTY_IMPACT_SCORE,
  AggregatedSlowFCPHighBytes.JSON_PROPERTY_PLATFORM,
  AggregatedSlowFCPHighBytes.JSON_PROPERTY_VIEW_OCCURRENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedSlowFCPHighBytes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_BYTES_BEFORE_FCP_BYTES =
      "avg_bytes_before_fcp_bytes";
  private Long avgBytesBeforeFcpBytes;

  public static final String JSON_PROPERTY_AVG_FIRST_CONTENTFUL_PAINT_MS =
      "avg_first_contentful_paint_ms";
  private Long avgFirstContentfulPaintMs;

  public static final String JSON_PROPERTY_AVG_RESOURCE_COUNT_BEFORE_FCP =
      "avg_resource_count_before_fcp";
  private Long avgResourceCountBeforeFcp;

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  private String fingerprint;

  public static final String JSON_PROPERTY_IMPACT_SCORE = "impact_score";
  private Double impactScore;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_VIEW_OCCURRENCES = "view_occurrences";
  private Integer viewOccurrences;

  public AggregatedSlowFCPHighBytes() {}

  @JsonCreator
  public AggregatedSlowFCPHighBytes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_BYTES_BEFORE_FCP_BYTES)
          Long avgBytesBeforeFcpBytes,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_FIRST_CONTENTFUL_PAINT_MS)
          Long avgFirstContentfulPaintMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_RESOURCE_COUNT_BEFORE_FCP)
          Long avgResourceCountBeforeFcp,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINGERPRINT) String fingerprint,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPACT_SCORE) Double impactScore,
      @JsonProperty(required = true, value = JSON_PROPERTY_PLATFORM) String platform,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_OCCURRENCES)
          Integer viewOccurrences) {
    this.avgBytesBeforeFcpBytes = avgBytesBeforeFcpBytes;
    this.avgFirstContentfulPaintMs = avgFirstContentfulPaintMs;
    this.avgResourceCountBeforeFcp = avgResourceCountBeforeFcp;
    this.fingerprint = fingerprint;
    this.impactScore = impactScore;
    this.platform = platform;
    this.viewOccurrences = viewOccurrences;
  }

  public AggregatedSlowFCPHighBytes avgBytesBeforeFcpBytes(Long avgBytesBeforeFcpBytes) {
    this.avgBytesBeforeFcpBytes = avgBytesBeforeFcpBytes;
    return this;
  }

  /**
   * Average total bytes loaded before first contentful paint.
   *
   * @return avgBytesBeforeFcpBytes
   */
  @JsonProperty(JSON_PROPERTY_AVG_BYTES_BEFORE_FCP_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgBytesBeforeFcpBytes() {
    return avgBytesBeforeFcpBytes;
  }

  public void setAvgBytesBeforeFcpBytes(Long avgBytesBeforeFcpBytes) {
    this.avgBytesBeforeFcpBytes = avgBytesBeforeFcpBytes;
  }

  public AggregatedSlowFCPHighBytes avgFirstContentfulPaintMs(Long avgFirstContentfulPaintMs) {
    this.avgFirstContentfulPaintMs = avgFirstContentfulPaintMs;
    return this;
  }

  /**
   * Average first contentful paint time in milliseconds.
   *
   * @return avgFirstContentfulPaintMs
   */
  @JsonProperty(JSON_PROPERTY_AVG_FIRST_CONTENTFUL_PAINT_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgFirstContentfulPaintMs() {
    return avgFirstContentfulPaintMs;
  }

  public void setAvgFirstContentfulPaintMs(Long avgFirstContentfulPaintMs) {
    this.avgFirstContentfulPaintMs = avgFirstContentfulPaintMs;
  }

  public AggregatedSlowFCPHighBytes avgResourceCountBeforeFcp(Long avgResourceCountBeforeFcp) {
    this.avgResourceCountBeforeFcp = avgResourceCountBeforeFcp;
    return this;
  }

  /**
   * Average number of resources loaded before first contentful paint.
   *
   * @return avgResourceCountBeforeFcp
   */
  @JsonProperty(JSON_PROPERTY_AVG_RESOURCE_COUNT_BEFORE_FCP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgResourceCountBeforeFcp() {
    return avgResourceCountBeforeFcp;
  }

  public void setAvgResourceCountBeforeFcp(Long avgResourceCountBeforeFcp) {
    this.avgResourceCountBeforeFcp = avgResourceCountBeforeFcp;
  }

  public AggregatedSlowFCPHighBytes fingerprint(String fingerprint) {
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

  public AggregatedSlowFCPHighBytes impactScore(Double impactScore) {
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

  public AggregatedSlowFCPHighBytes platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Platform identifier for the affected views.
   *
   * @return platform
   */
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public AggregatedSlowFCPHighBytes viewOccurrences(Integer viewOccurrences) {
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
   * @return AggregatedSlowFCPHighBytes
   */
  @JsonAnySetter
  public AggregatedSlowFCPHighBytes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedSlowFCPHighBytes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedSlowFCPHighBytes aggregatedSlowFcpHighBytes = (AggregatedSlowFCPHighBytes) o;
    return Objects.equals(
            this.avgBytesBeforeFcpBytes, aggregatedSlowFcpHighBytes.avgBytesBeforeFcpBytes)
        && Objects.equals(
            this.avgFirstContentfulPaintMs, aggregatedSlowFcpHighBytes.avgFirstContentfulPaintMs)
        && Objects.equals(
            this.avgResourceCountBeforeFcp, aggregatedSlowFcpHighBytes.avgResourceCountBeforeFcp)
        && Objects.equals(this.fingerprint, aggregatedSlowFcpHighBytes.fingerprint)
        && Objects.equals(this.impactScore, aggregatedSlowFcpHighBytes.impactScore)
        && Objects.equals(this.platform, aggregatedSlowFcpHighBytes.platform)
        && Objects.equals(this.viewOccurrences, aggregatedSlowFcpHighBytes.viewOccurrences)
        && Objects.equals(
            this.additionalProperties, aggregatedSlowFcpHighBytes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avgBytesBeforeFcpBytes,
        avgFirstContentfulPaintMs,
        avgResourceCountBeforeFcp,
        fingerprint,
        impactScore,
        platform,
        viewOccurrences,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedSlowFCPHighBytes {\n");
    sb.append("    avgBytesBeforeFcpBytes: ")
        .append(toIndentedString(avgBytesBeforeFcpBytes))
        .append("\n");
    sb.append("    avgFirstContentfulPaintMs: ")
        .append(toIndentedString(avgFirstContentfulPaintMs))
        .append("\n");
    sb.append("    avgResourceCountBeforeFcp: ")
        .append(toIndentedString(avgResourceCountBeforeFcp))
        .append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    impactScore: ").append(toIndentedString(impactScore)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
