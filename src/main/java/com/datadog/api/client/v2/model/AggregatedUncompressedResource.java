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

/** Aggregated uncompressed resource detection grouped by URL path. */
@JsonPropertyOrder({
  AggregatedUncompressedResource.JSON_PROPERTY_AVG_BODY_SIZE,
  AggregatedUncompressedResource.JSON_PROPERTY_AVG_DURATION,
  AggregatedUncompressedResource.JSON_PROPERTY_FINGERPRINT,
  AggregatedUncompressedResource.JSON_PROPERTY_IMPACT_SCORE,
  AggregatedUncompressedResource.JSON_PROPERTY_INSTANCE_COUNT,
  AggregatedUncompressedResource.JSON_PROPERTY_PROVIDER_TYPE,
  AggregatedUncompressedResource.JSON_PROPERTY_RENDER_BLOCKING,
  AggregatedUncompressedResource.JSON_PROPERTY_RESOURCE_TYPE,
  AggregatedUncompressedResource.JSON_PROPERTY_URL_PATH_GROUP,
  AggregatedUncompressedResource.JSON_PROPERTY_VIEW_OCCURRENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedUncompressedResource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_BODY_SIZE = "avg_body_size";
  private Long avgBodySize;

  public static final String JSON_PROPERTY_AVG_DURATION = "avg_duration";
  private Long avgDuration;

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  private String fingerprint;

  public static final String JSON_PROPERTY_IMPACT_SCORE = "impact_score";
  private Double impactScore;

  public static final String JSON_PROPERTY_INSTANCE_COUNT = "instance_count";
  private Integer instanceCount;

  public static final String JSON_PROPERTY_PROVIDER_TYPE = "provider_type";
  private String providerType;

  public static final String JSON_PROPERTY_RENDER_BLOCKING = "render_blocking";
  private String renderBlocking;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_URL_PATH_GROUP = "url_path_group";
  private String urlPathGroup;

  public static final String JSON_PROPERTY_VIEW_OCCURRENCES = "view_occurrences";
  private Integer viewOccurrences;

  public AggregatedUncompressedResource() {}

  @JsonCreator
  public AggregatedUncompressedResource(
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_BODY_SIZE) Long avgBodySize,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_DURATION) Long avgDuration,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINGERPRINT) String fingerprint,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPACT_SCORE) Double impactScore,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_COUNT) Integer instanceCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER_TYPE) String providerType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RENDER_BLOCKING) String renderBlocking,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE) String resourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL_PATH_GROUP) String urlPathGroup,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_OCCURRENCES)
          Integer viewOccurrences) {
    this.avgBodySize = avgBodySize;
    this.avgDuration = avgDuration;
    this.fingerprint = fingerprint;
    this.impactScore = impactScore;
    this.instanceCount = instanceCount;
    this.providerType = providerType;
    if (providerType != null) {}
    this.renderBlocking = renderBlocking;
    if (renderBlocking != null) {}
    this.resourceType = resourceType;
    this.urlPathGroup = urlPathGroup;
    this.viewOccurrences = viewOccurrences;
  }

  public AggregatedUncompressedResource avgBodySize(Long avgBodySize) {
    this.avgBodySize = avgBodySize;
    return this;
  }

  /**
   * Average uncompressed body size in bytes.
   *
   * @return avgBodySize
   */
  @JsonProperty(JSON_PROPERTY_AVG_BODY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgBodySize() {
    return avgBodySize;
  }

  public void setAvgBodySize(Long avgBodySize) {
    this.avgBodySize = avgBodySize;
  }

  public AggregatedUncompressedResource avgDuration(Long avgDuration) {
    this.avgDuration = avgDuration;
    return this;
  }

  /**
   * Average resource loading duration in nanoseconds.
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

  public AggregatedUncompressedResource fingerprint(String fingerprint) {
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

  public AggregatedUncompressedResource impactScore(Double impactScore) {
    this.impactScore = impactScore;
    return this;
  }

  /**
   * Impact score combining view frequency and resource size.
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

  public AggregatedUncompressedResource instanceCount(Integer instanceCount) {
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

  public AggregatedUncompressedResource providerType(String providerType) {
    this.providerType = providerType;
    if (providerType != null) {}
    return this;
  }

  /**
   * CDN or hosting provider type for the resource.
   *
   * @return providerType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProviderType() {
    return providerType;
  }

  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }

  public AggregatedUncompressedResource renderBlocking(String renderBlocking) {
    this.renderBlocking = renderBlocking;
    if (renderBlocking != null) {}
    return this;
  }

  /**
   * Whether the resource is render-blocking.
   *
   * @return renderBlocking
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENDER_BLOCKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRenderBlocking() {
    return renderBlocking;
  }

  public void setRenderBlocking(String renderBlocking) {
    this.renderBlocking = renderBlocking;
  }

  public AggregatedUncompressedResource resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Type of the resource (JS, CSS, image, fetch, and so on).
   *
   * @return resourceType
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public AggregatedUncompressedResource urlPathGroup(String urlPathGroup) {
    this.urlPathGroup = urlPathGroup;
    return this;
  }

  /**
   * Normalized URL path pattern for the uncompressed resource.
   *
   * @return urlPathGroup
   */
  @JsonProperty(JSON_PROPERTY_URL_PATH_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrlPathGroup() {
    return urlPathGroup;
  }

  public void setUrlPathGroup(String urlPathGroup) {
    this.urlPathGroup = urlPathGroup;
  }

  public AggregatedUncompressedResource viewOccurrences(Integer viewOccurrences) {
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
   * @return AggregatedUncompressedResource
   */
  @JsonAnySetter
  public AggregatedUncompressedResource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedUncompressedResource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedUncompressedResource aggregatedUncompressedResource =
        (AggregatedUncompressedResource) o;
    return Objects.equals(this.avgBodySize, aggregatedUncompressedResource.avgBodySize)
        && Objects.equals(this.avgDuration, aggregatedUncompressedResource.avgDuration)
        && Objects.equals(this.fingerprint, aggregatedUncompressedResource.fingerprint)
        && Objects.equals(this.impactScore, aggregatedUncompressedResource.impactScore)
        && Objects.equals(this.instanceCount, aggregatedUncompressedResource.instanceCount)
        && Objects.equals(this.providerType, aggregatedUncompressedResource.providerType)
        && Objects.equals(this.renderBlocking, aggregatedUncompressedResource.renderBlocking)
        && Objects.equals(this.resourceType, aggregatedUncompressedResource.resourceType)
        && Objects.equals(this.urlPathGroup, aggregatedUncompressedResource.urlPathGroup)
        && Objects.equals(this.viewOccurrences, aggregatedUncompressedResource.viewOccurrences)
        && Objects.equals(
            this.additionalProperties, aggregatedUncompressedResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avgBodySize,
        avgDuration,
        fingerprint,
        impactScore,
        instanceCount,
        providerType,
        renderBlocking,
        resourceType,
        urlPathGroup,
        viewOccurrences,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedUncompressedResource {\n");
    sb.append("    avgBodySize: ").append(toIndentedString(avgBodySize)).append("\n");
    sb.append("    avgDuration: ").append(toIndentedString(avgDuration)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    impactScore: ").append(toIndentedString(impactScore)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    renderBlocking: ").append(toIndentedString(renderBlocking)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    urlPathGroup: ").append(toIndentedString(urlPathGroup)).append("\n");
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
