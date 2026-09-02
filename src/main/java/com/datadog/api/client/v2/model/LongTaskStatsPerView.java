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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Statistical distributions of long task metrics computed per view across sampled views. */
@JsonPropertyOrder({
  LongTaskStatsPerView.JSON_PROPERTY_FCP_BLOCKING_TIME_MS,
  LongTaskStatsPerView.JSON_PROPERTY_FCP_COUNT,
  LongTaskStatsPerView.JSON_PROPERTY_INP_OVERLAP_BLOCKING_TIME_MS,
  LongTaskStatsPerView.JSON_PROPERTY_INP_OVERLAP_COUNT,
  LongTaskStatsPerView.JSON_PROPERTY_LCP_BLOCKING_TIME_MS,
  LongTaskStatsPerView.JSON_PROPERTY_LCP_COUNT,
  LongTaskStatsPerView.JSON_PROPERTY_LOADING_TIME_BLOCKING_TIME_MS,
  LongTaskStatsPerView.JSON_PROPERTY_LOADING_TIME_COUNT,
  LongTaskStatsPerView.JSON_PROPERTY_TOTAL_BLOCKING_TIME_MS,
  LongTaskStatsPerView.JSON_PROPERTY_TOTAL_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LongTaskStatsPerView {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FCP_BLOCKING_TIME_MS = "fcp_blocking_time_ms";
  private LongTaskMetricStats fcpBlockingTimeMs;

  public static final String JSON_PROPERTY_FCP_COUNT = "fcp_count";
  private LongTaskMetricStats fcpCount;

  public static final String JSON_PROPERTY_INP_OVERLAP_BLOCKING_TIME_MS =
      "inp_overlap_blocking_time_ms";
  private LongTaskMetricStats inpOverlapBlockingTimeMs;

  public static final String JSON_PROPERTY_INP_OVERLAP_COUNT = "inp_overlap_count";
  private LongTaskMetricStats inpOverlapCount;

  public static final String JSON_PROPERTY_LCP_BLOCKING_TIME_MS = "lcp_blocking_time_ms";
  private LongTaskMetricStats lcpBlockingTimeMs;

  public static final String JSON_PROPERTY_LCP_COUNT = "lcp_count";
  private LongTaskMetricStats lcpCount;

  public static final String JSON_PROPERTY_LOADING_TIME_BLOCKING_TIME_MS =
      "loading_time_blocking_time_ms";
  private LongTaskMetricStats loadingTimeBlockingTimeMs;

  public static final String JSON_PROPERTY_LOADING_TIME_COUNT = "loading_time_count";
  private LongTaskMetricStats loadingTimeCount;

  public static final String JSON_PROPERTY_TOTAL_BLOCKING_TIME_MS = "total_blocking_time_ms";
  private LongTaskMetricStats totalBlockingTimeMs;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private LongTaskMetricStats totalCount;

  public LongTaskStatsPerView fcpBlockingTimeMs(LongTaskMetricStats fcpBlockingTimeMs) {
    this.fcpBlockingTimeMs = fcpBlockingTimeMs;
    this.unparsed |= fcpBlockingTimeMs.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return fcpBlockingTimeMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FCP_BLOCKING_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getFcpBlockingTimeMs() {
    return fcpBlockingTimeMs;
  }

  public void setFcpBlockingTimeMs(LongTaskMetricStats fcpBlockingTimeMs) {
    this.fcpBlockingTimeMs = fcpBlockingTimeMs;
    if (fcpBlockingTimeMs != null) {
      this.unparsed |= fcpBlockingTimeMs.unparsed;
    }
  }

  public LongTaskStatsPerView fcpCount(LongTaskMetricStats fcpCount) {
    this.fcpCount = fcpCount;
    this.unparsed |= fcpCount.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return fcpCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FCP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getFcpCount() {
    return fcpCount;
  }

  public void setFcpCount(LongTaskMetricStats fcpCount) {
    this.fcpCount = fcpCount;
    if (fcpCount != null) {
      this.unparsed |= fcpCount.unparsed;
    }
  }

  public LongTaskStatsPerView inpOverlapBlockingTimeMs(
      LongTaskMetricStats inpOverlapBlockingTimeMs) {
    this.inpOverlapBlockingTimeMs = inpOverlapBlockingTimeMs;
    this.unparsed |= inpOverlapBlockingTimeMs.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return inpOverlapBlockingTimeMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INP_OVERLAP_BLOCKING_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getInpOverlapBlockingTimeMs() {
    return inpOverlapBlockingTimeMs;
  }

  public void setInpOverlapBlockingTimeMs(LongTaskMetricStats inpOverlapBlockingTimeMs) {
    this.inpOverlapBlockingTimeMs = inpOverlapBlockingTimeMs;
    if (inpOverlapBlockingTimeMs != null) {
      this.unparsed |= inpOverlapBlockingTimeMs.unparsed;
    }
  }

  public LongTaskStatsPerView inpOverlapCount(LongTaskMetricStats inpOverlapCount) {
    this.inpOverlapCount = inpOverlapCount;
    this.unparsed |= inpOverlapCount.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return inpOverlapCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INP_OVERLAP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getInpOverlapCount() {
    return inpOverlapCount;
  }

  public void setInpOverlapCount(LongTaskMetricStats inpOverlapCount) {
    this.inpOverlapCount = inpOverlapCount;
    if (inpOverlapCount != null) {
      this.unparsed |= inpOverlapCount.unparsed;
    }
  }

  public LongTaskStatsPerView lcpBlockingTimeMs(LongTaskMetricStats lcpBlockingTimeMs) {
    this.lcpBlockingTimeMs = lcpBlockingTimeMs;
    this.unparsed |= lcpBlockingTimeMs.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return lcpBlockingTimeMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LCP_BLOCKING_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getLcpBlockingTimeMs() {
    return lcpBlockingTimeMs;
  }

  public void setLcpBlockingTimeMs(LongTaskMetricStats lcpBlockingTimeMs) {
    this.lcpBlockingTimeMs = lcpBlockingTimeMs;
    if (lcpBlockingTimeMs != null) {
      this.unparsed |= lcpBlockingTimeMs.unparsed;
    }
  }

  public LongTaskStatsPerView lcpCount(LongTaskMetricStats lcpCount) {
    this.lcpCount = lcpCount;
    this.unparsed |= lcpCount.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return lcpCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LCP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getLcpCount() {
    return lcpCount;
  }

  public void setLcpCount(LongTaskMetricStats lcpCount) {
    this.lcpCount = lcpCount;
    if (lcpCount != null) {
      this.unparsed |= lcpCount.unparsed;
    }
  }

  public LongTaskStatsPerView loadingTimeBlockingTimeMs(
      LongTaskMetricStats loadingTimeBlockingTimeMs) {
    this.loadingTimeBlockingTimeMs = loadingTimeBlockingTimeMs;
    this.unparsed |= loadingTimeBlockingTimeMs.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return loadingTimeBlockingTimeMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOADING_TIME_BLOCKING_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getLoadingTimeBlockingTimeMs() {
    return loadingTimeBlockingTimeMs;
  }

  public void setLoadingTimeBlockingTimeMs(LongTaskMetricStats loadingTimeBlockingTimeMs) {
    this.loadingTimeBlockingTimeMs = loadingTimeBlockingTimeMs;
    if (loadingTimeBlockingTimeMs != null) {
      this.unparsed |= loadingTimeBlockingTimeMs.unparsed;
    }
  }

  public LongTaskStatsPerView loadingTimeCount(LongTaskMetricStats loadingTimeCount) {
    this.loadingTimeCount = loadingTimeCount;
    this.unparsed |= loadingTimeCount.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return loadingTimeCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOADING_TIME_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getLoadingTimeCount() {
    return loadingTimeCount;
  }

  public void setLoadingTimeCount(LongTaskMetricStats loadingTimeCount) {
    this.loadingTimeCount = loadingTimeCount;
    if (loadingTimeCount != null) {
      this.unparsed |= loadingTimeCount.unparsed;
    }
  }

  public LongTaskStatsPerView totalBlockingTimeMs(LongTaskMetricStats totalBlockingTimeMs) {
    this.totalBlockingTimeMs = totalBlockingTimeMs;
    this.unparsed |= totalBlockingTimeMs.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return totalBlockingTimeMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_BLOCKING_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getTotalBlockingTimeMs() {
    return totalBlockingTimeMs;
  }

  public void setTotalBlockingTimeMs(LongTaskMetricStats totalBlockingTimeMs) {
    this.totalBlockingTimeMs = totalBlockingTimeMs;
    if (totalBlockingTimeMs != null) {
      this.unparsed |= totalBlockingTimeMs.unparsed;
    }
  }

  public LongTaskStatsPerView totalCount(LongTaskMetricStats totalCount) {
    this.totalCount = totalCount;
    this.unparsed |= totalCount.unparsed;
    return this;
  }

  /**
   * Statistical distribution (average, min, max) of a long task metric across sampled views.
   *
   * @return totalCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LongTaskMetricStats getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(LongTaskMetricStats totalCount) {
    this.totalCount = totalCount;
    if (totalCount != null) {
      this.unparsed |= totalCount.unparsed;
    }
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
   * @return LongTaskStatsPerView
   */
  @JsonAnySetter
  public LongTaskStatsPerView putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LongTaskStatsPerView object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongTaskStatsPerView longTaskStatsPerView = (LongTaskStatsPerView) o;
    return Objects.equals(this.fcpBlockingTimeMs, longTaskStatsPerView.fcpBlockingTimeMs)
        && Objects.equals(this.fcpCount, longTaskStatsPerView.fcpCount)
        && Objects.equals(
            this.inpOverlapBlockingTimeMs, longTaskStatsPerView.inpOverlapBlockingTimeMs)
        && Objects.equals(this.inpOverlapCount, longTaskStatsPerView.inpOverlapCount)
        && Objects.equals(this.lcpBlockingTimeMs, longTaskStatsPerView.lcpBlockingTimeMs)
        && Objects.equals(this.lcpCount, longTaskStatsPerView.lcpCount)
        && Objects.equals(
            this.loadingTimeBlockingTimeMs, longTaskStatsPerView.loadingTimeBlockingTimeMs)
        && Objects.equals(this.loadingTimeCount, longTaskStatsPerView.loadingTimeCount)
        && Objects.equals(this.totalBlockingTimeMs, longTaskStatsPerView.totalBlockingTimeMs)
        && Objects.equals(this.totalCount, longTaskStatsPerView.totalCount)
        && Objects.equals(this.additionalProperties, longTaskStatsPerView.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fcpBlockingTimeMs,
        fcpCount,
        inpOverlapBlockingTimeMs,
        inpOverlapCount,
        lcpBlockingTimeMs,
        lcpCount,
        loadingTimeBlockingTimeMs,
        loadingTimeCount,
        totalBlockingTimeMs,
        totalCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTaskStatsPerView {\n");
    sb.append("    fcpBlockingTimeMs: ").append(toIndentedString(fcpBlockingTimeMs)).append("\n");
    sb.append("    fcpCount: ").append(toIndentedString(fcpCount)).append("\n");
    sb.append("    inpOverlapBlockingTimeMs: ")
        .append(toIndentedString(inpOverlapBlockingTimeMs))
        .append("\n");
    sb.append("    inpOverlapCount: ").append(toIndentedString(inpOverlapCount)).append("\n");
    sb.append("    lcpBlockingTimeMs: ").append(toIndentedString(lcpBlockingTimeMs)).append("\n");
    sb.append("    lcpCount: ").append(toIndentedString(lcpCount)).append("\n");
    sb.append("    loadingTimeBlockingTimeMs: ")
        .append(toIndentedString(loadingTimeBlockingTimeMs))
        .append("\n");
    sb.append("    loadingTimeCount: ").append(toIndentedString(loadingTimeCount)).append("\n");
    sb.append("    totalBlockingTimeMs: ")
        .append(toIndentedString(totalBlockingTimeMs))
        .append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
