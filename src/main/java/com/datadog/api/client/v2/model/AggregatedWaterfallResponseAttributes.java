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

/** Attributes of an aggregated waterfall response. */
@JsonPropertyOrder({
  AggregatedWaterfallResponseAttributes.JSON_PROPERTY_APPLICATION_ID,
  AggregatedWaterfallResponseAttributes.JSON_PROPERTY_CRITERIA,
  AggregatedWaterfallResponseAttributes.JSON_PROPERTY_FROM,
  AggregatedWaterfallResponseAttributes.JSON_PROPERTY_RESOURCES,
  AggregatedWaterfallResponseAttributes.JSON_PROPERTY_SAMPLED_VIEW_IDS,
  AggregatedWaterfallResponseAttributes.JSON_PROPERTY_TO,
  AggregatedWaterfallResponseAttributes.JSON_PROPERTY_TOTAL_CACHE_HIT_RATE_PCT,
  AggregatedWaterfallResponseAttributes.JSON_PROPERTY_VIEW_COUNT,
  AggregatedWaterfallResponseAttributes.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedWaterfallResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CRITERIA = "criteria";
  private AggregatedWaterfallPerformanceCriteria criteria;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<AggregatedResource> resources = new ArrayList<>();

  public static final String JSON_PROPERTY_SAMPLED_VIEW_IDS = "sampled_view_ids";
  private List<String> sampledViewIds = new ArrayList<>();

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public static final String JSON_PROPERTY_TOTAL_CACHE_HIT_RATE_PCT = "total_cache_hit_rate_pct";
  private Double totalCacheHitRatePct;

  public static final String JSON_PROPERTY_VIEW_COUNT = "view_count";
  private Integer viewCount;

  public static final String JSON_PROPERTY_VIEW_NAME = "view_name";
  private String viewName;

  public AggregatedWaterfallResponseAttributes() {}

  @JsonCreator
  public AggregatedWaterfallResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) String applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCES)
          List<AggregatedResource> resources,
      @JsonProperty(required = true, value = JSON_PROPERTY_SAMPLED_VIEW_IDS)
          List<String> sampledViewIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_CACHE_HIT_RATE_PCT)
          Double totalCacheHitRatePct,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_COUNT) Integer viewCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_NAME) String viewName) {
    this.applicationId = applicationId;
    this.from = from;
    this.resources = resources;
    this.sampledViewIds = sampledViewIds;
    this.to = to;
    this.totalCacheHitRatePct = totalCacheHitRatePct;
    this.viewCount = viewCount;
    this.viewName = viewName;
  }

  public AggregatedWaterfallResponseAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The RUM application ID that was analyzed.
   *
   * @return applicationId
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public AggregatedWaterfallResponseAttributes criteria(
      AggregatedWaterfallPerformanceCriteria criteria) {
    this.criteria = criteria;
    this.unparsed |= criteria.unparsed;
    return this;
  }

  /**
   * Performance criteria to filter view instances by a metric threshold.
   *
   * @return criteria
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AggregatedWaterfallPerformanceCriteria getCriteria() {
    return criteria;
  }

  public void setCriteria(AggregatedWaterfallPerformanceCriteria criteria) {
    this.criteria = criteria;
  }

  public AggregatedWaterfallResponseAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the analyzed time range as a Unix timestamp in seconds.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public AggregatedWaterfallResponseAttributes resources(List<AggregatedResource> resources) {
    this.resources = resources;
    for (AggregatedResource item : resources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AggregatedWaterfallResponseAttributes addResourcesItem(AggregatedResource resourcesItem) {
    this.resources.add(resourcesItem);
    this.unparsed |= resourcesItem.unparsed;
    return this;
  }

  /**
   * Network resources in chronological waterfall order.
   *
   * @return resources
   */
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AggregatedResource> getResources() {
    return resources;
  }

  public void setResources(List<AggregatedResource> resources) {
    this.resources = resources;
  }

  public AggregatedWaterfallResponseAttributes sampledViewIds(List<String> sampledViewIds) {
    this.sampledViewIds = sampledViewIds;
    return this;
  }

  public AggregatedWaterfallResponseAttributes addSampledViewIdsItem(String sampledViewIdsItem) {
    this.sampledViewIds.add(sampledViewIdsItem);
    return this;
  }

  /**
   * List of RUM view IDs sampled for this aggregation, capped at 50.
   *
   * @return sampledViewIds
   */
  @JsonProperty(JSON_PROPERTY_SAMPLED_VIEW_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSampledViewIds() {
    return sampledViewIds;
  }

  public void setSampledViewIds(List<String> sampledViewIds) {
    this.sampledViewIds = sampledViewIds;
  }

  public AggregatedWaterfallResponseAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the analyzed time range as a Unix timestamp in seconds.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }

  public AggregatedWaterfallResponseAttributes totalCacheHitRatePct(Double totalCacheHitRatePct) {
    this.totalCacheHitRatePct = totalCacheHitRatePct;
    return this;
  }

  /**
   * Overall cache hit rate across all sampled views.
   *
   * @return totalCacheHitRatePct
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_CACHE_HIT_RATE_PCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getTotalCacheHitRatePct() {
    return totalCacheHitRatePct;
  }

  public void setTotalCacheHitRatePct(Double totalCacheHitRatePct) {
    this.totalCacheHitRatePct = totalCacheHitRatePct;
  }

  public AggregatedWaterfallResponseAttributes viewCount(Integer viewCount) {
    this.viewCount = viewCount;
    return this;
  }

  /**
   * Number of view instances included in the analysis. maximum: 2147483647
   *
   * @return viewCount
   */
  @JsonProperty(JSON_PROPERTY_VIEW_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public AggregatedWaterfallResponseAttributes viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * The RUM view name that was analyzed.
   *
   * @return viewName
   */
  @JsonProperty(JSON_PROPERTY_VIEW_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getViewName() {
    return viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
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
   * @return AggregatedWaterfallResponseAttributes
   */
  @JsonAnySetter
  public AggregatedWaterfallResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedWaterfallResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedWaterfallResponseAttributes aggregatedWaterfallResponseAttributes =
        (AggregatedWaterfallResponseAttributes) o;
    return Objects.equals(this.applicationId, aggregatedWaterfallResponseAttributes.applicationId)
        && Objects.equals(this.criteria, aggregatedWaterfallResponseAttributes.criteria)
        && Objects.equals(this.from, aggregatedWaterfallResponseAttributes.from)
        && Objects.equals(this.resources, aggregatedWaterfallResponseAttributes.resources)
        && Objects.equals(this.sampledViewIds, aggregatedWaterfallResponseAttributes.sampledViewIds)
        && Objects.equals(this.to, aggregatedWaterfallResponseAttributes.to)
        && Objects.equals(
            this.totalCacheHitRatePct, aggregatedWaterfallResponseAttributes.totalCacheHitRatePct)
        && Objects.equals(this.viewCount, aggregatedWaterfallResponseAttributes.viewCount)
        && Objects.equals(this.viewName, aggregatedWaterfallResponseAttributes.viewName)
        && Objects.equals(
            this.additionalProperties, aggregatedWaterfallResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        criteria,
        from,
        resources,
        sampledViewIds,
        to,
        totalCacheHitRatePct,
        viewCount,
        viewName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedWaterfallResponseAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    sampledViewIds: ").append(toIndentedString(sampledViewIds)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    totalCacheHitRatePct: ")
        .append(toIndentedString(totalCacheHitRatePct))
        .append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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
