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

/**
 * Aggregated performance statistics for a single network resource across sampled view instances.
 */
@JsonPropertyOrder({
  AggregatedResource.JSON_PROPERTY_AVG_DURATION_MS,
  AggregatedResource.JSON_PROPERTY_AVG_START_TIME_MS,
  AggregatedResource.JSON_PROPERTY_CACHE_HIT_RATE_PCT,
  AggregatedResource.JSON_PROPERTY_CACHED_COUNT,
  AggregatedResource.JSON_PROPERTY_DOWNLOADED_COUNT,
  AggregatedResource.JSON_PROPERTY_GLOBAL_P75_DURATION_MS,
  AggregatedResource.JSON_PROPERTY_GLOBAL_VIEW_NAME_COUNT,
  AggregatedResource.JSON_PROPERTY_GLOBAL_VIEW_NAME_PCT,
  AggregatedResource.JSON_PROPERTY_HTTP_METHOD,
  AggregatedResource.JSON_PROPERTY_LOAD_FREQUENCY_PCT,
  AggregatedResource.JSON_PROPERTY_MAX_DURATION_MS,
  AggregatedResource.JSON_PROPERTY_MEDIAN_DURATION_MS,
  AggregatedResource.JSON_PROPERTY_MIN_DURATION_MS,
  AggregatedResource.JSON_PROPERTY_P75_DURATION_MS,
  AggregatedResource.JSON_PROPERTY_P95_DURATION_MS,
  AggregatedResource.JSON_PROPERTY_RESOURCE_TYPE,
  AggregatedResource.JSON_PROPERTY_RESOURCE_URL_PATH_GROUP,
  AggregatedResource.JSON_PROPERTY_TIMING_BREAKDOWN,
  AggregatedResource.JSON_PROPERTY_TOTAL_REQUESTS,
  AggregatedResource.JSON_PROPERTY_VIEWS_WITH_RESOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedResource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_DURATION_MS = "avg_duration_ms";
  private Double avgDurationMs;

  public static final String JSON_PROPERTY_AVG_START_TIME_MS = "avg_start_time_ms";
  private Double avgStartTimeMs;

  public static final String JSON_PROPERTY_CACHE_HIT_RATE_PCT = "cache_hit_rate_pct";
  private Double cacheHitRatePct;

  public static final String JSON_PROPERTY_CACHED_COUNT = "cached_count";
  private Integer cachedCount;

  public static final String JSON_PROPERTY_DOWNLOADED_COUNT = "downloaded_count";
  private Integer downloadedCount;

  public static final String JSON_PROPERTY_GLOBAL_P75_DURATION_MS = "global_p75_duration_ms";
  private Double globalP75DurationMs;

  public static final String JSON_PROPERTY_GLOBAL_VIEW_NAME_COUNT = "global_view_name_count";
  private Integer globalViewNameCount;

  public static final String JSON_PROPERTY_GLOBAL_VIEW_NAME_PCT = "global_view_name_pct";
  private Double globalViewNamePct;

  public static final String JSON_PROPERTY_HTTP_METHOD = "http_method";
  private String httpMethod;

  public static final String JSON_PROPERTY_LOAD_FREQUENCY_PCT = "load_frequency_pct";
  private Double loadFrequencyPct;

  public static final String JSON_PROPERTY_MAX_DURATION_MS = "max_duration_ms";
  private Double maxDurationMs;

  public static final String JSON_PROPERTY_MEDIAN_DURATION_MS = "median_duration_ms";
  private Double medianDurationMs;

  public static final String JSON_PROPERTY_MIN_DURATION_MS = "min_duration_ms";
  private Double minDurationMs;

  public static final String JSON_PROPERTY_P75_DURATION_MS = "p75_duration_ms";
  private Double p75DurationMs;

  public static final String JSON_PROPERTY_P95_DURATION_MS = "p95_duration_ms";
  private Double p95DurationMs;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_RESOURCE_URL_PATH_GROUP = "resource_url_path_group";
  private String resourceUrlPathGroup;

  public static final String JSON_PROPERTY_TIMING_BREAKDOWN = "timing_breakdown";
  private AggregatedResourceTimingBreakdown timingBreakdown;

  public static final String JSON_PROPERTY_TOTAL_REQUESTS = "total_requests";
  private Integer totalRequests;

  public static final String JSON_PROPERTY_VIEWS_WITH_RESOURCE = "views_with_resource";
  private Integer viewsWithResource;

  public AggregatedResource() {}

  @JsonCreator
  public AggregatedResource(
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_DURATION_MS) Double avgDurationMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_START_TIME_MS) Double avgStartTimeMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_CACHE_HIT_RATE_PCT)
          Double cacheHitRatePct,
      @JsonProperty(required = true, value = JSON_PROPERTY_CACHED_COUNT) Integer cachedCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_DOWNLOADED_COUNT)
          Integer downloadedCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_HTTP_METHOD) String httpMethod,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOAD_FREQUENCY_PCT)
          Double loadFrequencyPct,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_DURATION_MS) Double maxDurationMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEDIAN_DURATION_MS)
          Double medianDurationMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_MIN_DURATION_MS) Double minDurationMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_P75_DURATION_MS) Double p75DurationMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_P95_DURATION_MS) Double p95DurationMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE) String resourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_URL_PATH_GROUP)
          String resourceUrlPathGroup,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMING_BREAKDOWN)
          AggregatedResourceTimingBreakdown timingBreakdown,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_REQUESTS) Integer totalRequests,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEWS_WITH_RESOURCE)
          Integer viewsWithResource) {
    this.avgDurationMs = avgDurationMs;
    this.avgStartTimeMs = avgStartTimeMs;
    this.cacheHitRatePct = cacheHitRatePct;
    this.cachedCount = cachedCount;
    this.downloadedCount = downloadedCount;
    this.httpMethod = httpMethod;
    if (httpMethod != null) {}
    this.loadFrequencyPct = loadFrequencyPct;
    this.maxDurationMs = maxDurationMs;
    this.medianDurationMs = medianDurationMs;
    this.minDurationMs = minDurationMs;
    this.p75DurationMs = p75DurationMs;
    this.p95DurationMs = p95DurationMs;
    this.resourceType = resourceType;
    if (resourceType != null) {}
    this.resourceUrlPathGroup = resourceUrlPathGroup;
    this.timingBreakdown = timingBreakdown;
    this.unparsed |= timingBreakdown.unparsed;
    this.totalRequests = totalRequests;
    this.viewsWithResource = viewsWithResource;
  }

  public AggregatedResource avgDurationMs(Double avgDurationMs) {
    this.avgDurationMs = avgDurationMs;
    return this;
  }

  /**
   * Average total duration in milliseconds.
   *
   * @return avgDurationMs
   */
  @JsonProperty(JSON_PROPERTY_AVG_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgDurationMs() {
    return avgDurationMs;
  }

  public void setAvgDurationMs(Double avgDurationMs) {
    this.avgDurationMs = avgDurationMs;
  }

  public AggregatedResource avgStartTimeMs(Double avgStartTimeMs) {
    this.avgStartTimeMs = avgStartTimeMs;
    return this;
  }

  /**
   * Average start time relative to view start in milliseconds.
   *
   * @return avgStartTimeMs
   */
  @JsonProperty(JSON_PROPERTY_AVG_START_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgStartTimeMs() {
    return avgStartTimeMs;
  }

  public void setAvgStartTimeMs(Double avgStartTimeMs) {
    this.avgStartTimeMs = avgStartTimeMs;
  }

  public AggregatedResource cacheHitRatePct(Double cacheHitRatePct) {
    this.cacheHitRatePct = cacheHitRatePct;
    return this;
  }

  /**
   * Cache hit rate as a percentage.
   *
   * @return cacheHitRatePct
   */
  @JsonProperty(JSON_PROPERTY_CACHE_HIT_RATE_PCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getCacheHitRatePct() {
    return cacheHitRatePct;
  }

  public void setCacheHitRatePct(Double cacheHitRatePct) {
    this.cacheHitRatePct = cacheHitRatePct;
  }

  public AggregatedResource cachedCount(Integer cachedCount) {
    this.cachedCount = cachedCount;
    return this;
  }

  /**
   * Number of requests served from cache. maximum: 2147483647
   *
   * @return cachedCount
   */
  @JsonProperty(JSON_PROPERTY_CACHED_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getCachedCount() {
    return cachedCount;
  }

  public void setCachedCount(Integer cachedCount) {
    this.cachedCount = cachedCount;
  }

  public AggregatedResource downloadedCount(Integer downloadedCount) {
    this.downloadedCount = downloadedCount;
    return this;
  }

  /**
   * Number of requests downloaded from the network. maximum: 2147483647
   *
   * @return downloadedCount
   */
  @JsonProperty(JSON_PROPERTY_DOWNLOADED_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getDownloadedCount() {
    return downloadedCount;
  }

  public void setDownloadedCount(Integer downloadedCount) {
    this.downloadedCount = downloadedCount;
  }

  public AggregatedResource globalP75DurationMs(Double globalP75DurationMs) {
    this.globalP75DurationMs = globalP75DurationMs;
    return this;
  }

  /**
   * 75th percentile duration across all view names in the application, present when
   * include_global_appearance is true.
   *
   * @return globalP75DurationMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_P75_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGlobalP75DurationMs() {
    return globalP75DurationMs;
  }

  public void setGlobalP75DurationMs(Double globalP75DurationMs) {
    this.globalP75DurationMs = globalP75DurationMs;
  }

  public AggregatedResource globalViewNameCount(Integer globalViewNameCount) {
    this.globalViewNameCount = globalViewNameCount;
    return this;
  }

  /**
   * Number of distinct view names in the application that load this resource, present when
   * include_global_appearance is true. maximum: 2147483647
   *
   * @return globalViewNameCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_VIEW_NAME_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getGlobalViewNameCount() {
    return globalViewNameCount;
  }

  public void setGlobalViewNameCount(Integer globalViewNameCount) {
    this.globalViewNameCount = globalViewNameCount;
  }

  public AggregatedResource globalViewNamePct(Double globalViewNamePct) {
    this.globalViewNamePct = globalViewNamePct;
    return this;
  }

  /**
   * Percentage of distinct view names in the application that load this resource, present when
   * include_global_appearance is true.
   *
   * @return globalViewNamePct
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_VIEW_NAME_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGlobalViewNamePct() {
    return globalViewNamePct;
  }

  public void setGlobalViewNamePct(Double globalViewNamePct) {
    this.globalViewNamePct = globalViewNamePct;
  }

  public AggregatedResource httpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
    if (httpMethod != null) {}
    return this;
  }

  /**
   * HTTP method for the resource request.
   *
   * @return httpMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }

  public AggregatedResource loadFrequencyPct(Double loadFrequencyPct) {
    this.loadFrequencyPct = loadFrequencyPct;
    return this;
  }

  /**
   * Percentage of sampled view instances that loaded this resource.
   *
   * @return loadFrequencyPct
   */
  @JsonProperty(JSON_PROPERTY_LOAD_FREQUENCY_PCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLoadFrequencyPct() {
    return loadFrequencyPct;
  }

  public void setLoadFrequencyPct(Double loadFrequencyPct) {
    this.loadFrequencyPct = loadFrequencyPct;
  }

  public AggregatedResource maxDurationMs(Double maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
    return this;
  }

  /**
   * Maximum duration in milliseconds.
   *
   * @return maxDurationMs
   */
  @JsonProperty(JSON_PROPERTY_MAX_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMaxDurationMs() {
    return maxDurationMs;
  }

  public void setMaxDurationMs(Double maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
  }

  public AggregatedResource medianDurationMs(Double medianDurationMs) {
    this.medianDurationMs = medianDurationMs;
    return this;
  }

  /**
   * Median duration in milliseconds.
   *
   * @return medianDurationMs
   */
  @JsonProperty(JSON_PROPERTY_MEDIAN_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMedianDurationMs() {
    return medianDurationMs;
  }

  public void setMedianDurationMs(Double medianDurationMs) {
    this.medianDurationMs = medianDurationMs;
  }

  public AggregatedResource minDurationMs(Double minDurationMs) {
    this.minDurationMs = minDurationMs;
    return this;
  }

  /**
   * Minimum duration in milliseconds.
   *
   * @return minDurationMs
   */
  @JsonProperty(JSON_PROPERTY_MIN_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMinDurationMs() {
    return minDurationMs;
  }

  public void setMinDurationMs(Double minDurationMs) {
    this.minDurationMs = minDurationMs;
  }

  public AggregatedResource p75DurationMs(Double p75DurationMs) {
    this.p75DurationMs = p75DurationMs;
    return this;
  }

  /**
   * 75th percentile duration in milliseconds.
   *
   * @return p75DurationMs
   */
  @JsonProperty(JSON_PROPERTY_P75_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getP75DurationMs() {
    return p75DurationMs;
  }

  public void setP75DurationMs(Double p75DurationMs) {
    this.p75DurationMs = p75DurationMs;
  }

  public AggregatedResource p95DurationMs(Double p95DurationMs) {
    this.p95DurationMs = p95DurationMs;
    return this;
  }

  /**
   * 95th percentile duration in milliseconds.
   *
   * @return p95DurationMs
   */
  @JsonProperty(JSON_PROPERTY_P95_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getP95DurationMs() {
    return p95DurationMs;
  }

  public void setP95DurationMs(Double p95DurationMs) {
    this.p95DurationMs = p95DurationMs;
  }

  public AggregatedResource resourceType(String resourceType) {
    this.resourceType = resourceType;
    if (resourceType != null) {}
    return this;
  }

  /**
   * Resource type (JS, CSS, image, fetch, XHR, document, and so on).
   *
   * @return resourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public AggregatedResource resourceUrlPathGroup(String resourceUrlPathGroup) {
    this.resourceUrlPathGroup = resourceUrlPathGroup;
    return this;
  }

  /**
   * URL path group used to aggregate similar resources.
   *
   * @return resourceUrlPathGroup
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_URL_PATH_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceUrlPathGroup() {
    return resourceUrlPathGroup;
  }

  public void setResourceUrlPathGroup(String resourceUrlPathGroup) {
    this.resourceUrlPathGroup = resourceUrlPathGroup;
  }

  public AggregatedResource timingBreakdown(AggregatedResourceTimingBreakdown timingBreakdown) {
    this.timingBreakdown = timingBreakdown;
    this.unparsed |= timingBreakdown.unparsed;
    return this;
  }

  /**
   * Average timing breakdown per network phase for a resource.
   *
   * @return timingBreakdown
   */
  @JsonProperty(JSON_PROPERTY_TIMING_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AggregatedResourceTimingBreakdown getTimingBreakdown() {
    return timingBreakdown;
  }

  public void setTimingBreakdown(AggregatedResourceTimingBreakdown timingBreakdown) {
    this.timingBreakdown = timingBreakdown;
  }

  public AggregatedResource totalRequests(Integer totalRequests) {
    this.totalRequests = totalRequests;
    return this;
  }

  /**
   * Total number of requests for this resource across all sampled views. maximum: 2147483647
   *
   * @return totalRequests
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getTotalRequests() {
    return totalRequests;
  }

  public void setTotalRequests(Integer totalRequests) {
    this.totalRequests = totalRequests;
  }

  public AggregatedResource viewsWithResource(Integer viewsWithResource) {
    this.viewsWithResource = viewsWithResource;
    return this;
  }

  /**
   * Number of sampled view instances that loaded this resource. maximum: 2147483647
   *
   * @return viewsWithResource
   */
  @JsonProperty(JSON_PROPERTY_VIEWS_WITH_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getViewsWithResource() {
    return viewsWithResource;
  }

  public void setViewsWithResource(Integer viewsWithResource) {
    this.viewsWithResource = viewsWithResource;
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
   * @return AggregatedResource
   */
  @JsonAnySetter
  public AggregatedResource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedResource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedResource aggregatedResource = (AggregatedResource) o;
    return Objects.equals(this.avgDurationMs, aggregatedResource.avgDurationMs)
        && Objects.equals(this.avgStartTimeMs, aggregatedResource.avgStartTimeMs)
        && Objects.equals(this.cacheHitRatePct, aggregatedResource.cacheHitRatePct)
        && Objects.equals(this.cachedCount, aggregatedResource.cachedCount)
        && Objects.equals(this.downloadedCount, aggregatedResource.downloadedCount)
        && Objects.equals(this.globalP75DurationMs, aggregatedResource.globalP75DurationMs)
        && Objects.equals(this.globalViewNameCount, aggregatedResource.globalViewNameCount)
        && Objects.equals(this.globalViewNamePct, aggregatedResource.globalViewNamePct)
        && Objects.equals(this.httpMethod, aggregatedResource.httpMethod)
        && Objects.equals(this.loadFrequencyPct, aggregatedResource.loadFrequencyPct)
        && Objects.equals(this.maxDurationMs, aggregatedResource.maxDurationMs)
        && Objects.equals(this.medianDurationMs, aggregatedResource.medianDurationMs)
        && Objects.equals(this.minDurationMs, aggregatedResource.minDurationMs)
        && Objects.equals(this.p75DurationMs, aggregatedResource.p75DurationMs)
        && Objects.equals(this.p95DurationMs, aggregatedResource.p95DurationMs)
        && Objects.equals(this.resourceType, aggregatedResource.resourceType)
        && Objects.equals(this.resourceUrlPathGroup, aggregatedResource.resourceUrlPathGroup)
        && Objects.equals(this.timingBreakdown, aggregatedResource.timingBreakdown)
        && Objects.equals(this.totalRequests, aggregatedResource.totalRequests)
        && Objects.equals(this.viewsWithResource, aggregatedResource.viewsWithResource)
        && Objects.equals(this.additionalProperties, aggregatedResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avgDurationMs,
        avgStartTimeMs,
        cacheHitRatePct,
        cachedCount,
        downloadedCount,
        globalP75DurationMs,
        globalViewNameCount,
        globalViewNamePct,
        httpMethod,
        loadFrequencyPct,
        maxDurationMs,
        medianDurationMs,
        minDurationMs,
        p75DurationMs,
        p95DurationMs,
        resourceType,
        resourceUrlPathGroup,
        timingBreakdown,
        totalRequests,
        viewsWithResource,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedResource {\n");
    sb.append("    avgDurationMs: ").append(toIndentedString(avgDurationMs)).append("\n");
    sb.append("    avgStartTimeMs: ").append(toIndentedString(avgStartTimeMs)).append("\n");
    sb.append("    cacheHitRatePct: ").append(toIndentedString(cacheHitRatePct)).append("\n");
    sb.append("    cachedCount: ").append(toIndentedString(cachedCount)).append("\n");
    sb.append("    downloadedCount: ").append(toIndentedString(downloadedCount)).append("\n");
    sb.append("    globalP75DurationMs: ")
        .append(toIndentedString(globalP75DurationMs))
        .append("\n");
    sb.append("    globalViewNameCount: ")
        .append(toIndentedString(globalViewNameCount))
        .append("\n");
    sb.append("    globalViewNamePct: ").append(toIndentedString(globalViewNamePct)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    loadFrequencyPct: ").append(toIndentedString(loadFrequencyPct)).append("\n");
    sb.append("    maxDurationMs: ").append(toIndentedString(maxDurationMs)).append("\n");
    sb.append("    medianDurationMs: ").append(toIndentedString(medianDurationMs)).append("\n");
    sb.append("    minDurationMs: ").append(toIndentedString(minDurationMs)).append("\n");
    sb.append("    p75DurationMs: ").append(toIndentedString(p75DurationMs)).append("\n");
    sb.append("    p95DurationMs: ").append(toIndentedString(p95DurationMs)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceUrlPathGroup: ")
        .append(toIndentedString(resourceUrlPathGroup))
        .append("\n");
    sb.append("    timingBreakdown: ").append(toIndentedString(timingBreakdown)).append("\n");
    sb.append("    totalRequests: ").append(toIndentedString(totalRequests)).append("\n");
    sb.append("    viewsWithResource: ").append(toIndentedString(viewsWithResource)).append("\n");
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
