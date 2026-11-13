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
import java.util.UUID;

/** Aggregate of a template rate limit's counters. */
@JsonPropertyOrder({
  AiGatewayRateLimitInstancesSummaryAttributes.JSON_PROPERTY_INSTANCE_COUNT,
  AiGatewayRateLimitInstancesSummaryAttributes.JSON_PROPERTY_LIMITED_REQUESTS,
  AiGatewayRateLimitInstancesSummaryAttributes.JSON_PROPERTY_LIMITING_COUNT,
  AiGatewayRateLimitInstancesSummaryAttributes.JSON_PROPERTY_MAX_UTILIZATION,
  AiGatewayRateLimitInstancesSummaryAttributes.JSON_PROPERTY_NEAR_LIMIT_COUNT,
  AiGatewayRateLimitInstancesSummaryAttributes.JSON_PROPERTY_RATE_LIMIT_ID,
  AiGatewayRateLimitInstancesSummaryAttributes.JSON_PROPERTY_SCOPE_RESTRICTED,
  AiGatewayRateLimitInstancesSummaryAttributes.JSON_PROPERTY_TRUNCATED,
  AiGatewayRateLimitInstancesSummaryAttributes.JSON_PROPERTY_WOULD_LIMIT_REQUESTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRateLimitInstancesSummaryAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INSTANCE_COUNT = "instance_count";
  private Long instanceCount;

  public static final String JSON_PROPERTY_LIMITED_REQUESTS = "limited_requests";
  private Long limitedRequests;

  public static final String JSON_PROPERTY_LIMITING_COUNT = "limiting_count";
  private Long limitingCount;

  public static final String JSON_PROPERTY_MAX_UTILIZATION = "max_utilization";
  private Double maxUtilization;

  public static final String JSON_PROPERTY_NEAR_LIMIT_COUNT = "near_limit_count";
  private Long nearLimitCount;

  public static final String JSON_PROPERTY_RATE_LIMIT_ID = "rate_limit_id";
  private UUID rateLimitId;

  public static final String JSON_PROPERTY_SCOPE_RESTRICTED = "scope_restricted";
  private Boolean scopeRestricted;

  public static final String JSON_PROPERTY_TRUNCATED = "truncated";
  private Boolean truncated;

  public static final String JSON_PROPERTY_WOULD_LIMIT_REQUESTS = "would_limit_requests";
  private Long wouldLimitRequests;

  public AiGatewayRateLimitInstancesSummaryAttributes() {}

  @JsonCreator
  public AiGatewayRateLimitInstancesSummaryAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_COUNT) Long instanceCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMITING_COUNT) Long limitingCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_UTILIZATION) Double maxUtilization,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEAR_LIMIT_COUNT) Long nearLimitCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_RATE_LIMIT_ID) UUID rateLimitId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRUNCATED) Boolean truncated) {
    this.instanceCount = instanceCount;
    this.limitingCount = limitingCount;
    this.maxUtilization = maxUtilization;
    this.nearLimitCount = nearLimitCount;
    this.rateLimitId = rateLimitId;
    this.truncated = truncated;
  }

  public AiGatewayRateLimitInstancesSummaryAttributes instanceCount(Long instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

  /**
   * Number of counters.
   *
   * @return instanceCount
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Long instanceCount) {
    this.instanceCount = instanceCount;
  }

  public AiGatewayRateLimitInstancesSummaryAttributes limitedRequests(Long limitedRequests) {
    this.limitedRequests = limitedRequests;
    return this;
  }

  /**
   * Requests the counters rejected in the last 15 minutes (ENFORCE), totaled over the counters
   * whose usage was read.
   *
   * @return limitedRequests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMITED_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimitedRequests() {
    return limitedRequests;
  }

  public void setLimitedRequests(Long limitedRequests) {
    this.limitedRequests = limitedRequests;
  }

  public AiGatewayRateLimitInstancesSummaryAttributes limitingCount(Long limitingCount) {
    this.limitingCount = limitingCount;
    return this;
  }

  /**
   * Counters that limited, or would have limited, a request in the last 15 minutes.
   *
   * @return limitingCount
   */
  @JsonProperty(JSON_PROPERTY_LIMITING_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLimitingCount() {
    return limitingCount;
  }

  public void setLimitingCount(Long limitingCount) {
    this.limitingCount = limitingCount;
  }

  public AiGatewayRateLimitInstancesSummaryAttributes maxUtilization(Double maxUtilization) {
    this.maxUtilization = maxUtilization;
    return this;
  }

  /**
   * Utilization of the fullest counter.
   *
   * @return maxUtilization
   */
  @JsonProperty(JSON_PROPERTY_MAX_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMaxUtilization() {
    return maxUtilization;
  }

  public void setMaxUtilization(Double maxUtilization) {
    this.maxUtilization = maxUtilization;
  }

  public AiGatewayRateLimitInstancesSummaryAttributes nearLimitCount(Long nearLimitCount) {
    this.nearLimitCount = nearLimitCount;
    return this;
  }

  /**
   * Counters at 80% or more of a limit in the rolling window.
   *
   * @return nearLimitCount
   */
  @JsonProperty(JSON_PROPERTY_NEAR_LIMIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNearLimitCount() {
    return nearLimitCount;
  }

  public void setNearLimitCount(Long nearLimitCount) {
    this.nearLimitCount = nearLimitCount;
  }

  public AiGatewayRateLimitInstancesSummaryAttributes rateLimitId(UUID rateLimitId) {
    this.rateLimitId = rateLimitId;
    return this;
  }

  /**
   * Rate limit UUID.
   *
   * @return rateLimitId
   */
  @JsonProperty(JSON_PROPERTY_RATE_LIMIT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getRateLimitId() {
    return rateLimitId;
  }

  public void setRateLimitId(UUID rateLimitId) {
    this.rateLimitId = rateLimitId;
  }

  public AiGatewayRateLimitInstancesSummaryAttributes scopeRestricted(Boolean scopeRestricted) {
    this.scopeRestricted = scopeRestricted;
    return this;
  }

  /**
   * True when the caller can't see the template's selector because it lists a provider or model the
   * caller can't access. The counters are then hidden, and every count is zero.
   *
   * @return scopeRestricted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE_RESTRICTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getScopeRestricted() {
    return scopeRestricted;
  }

  public void setScopeRestricted(Boolean scopeRestricted) {
    this.scopeRestricted = scopeRestricted;
  }

  public AiGatewayRateLimitInstancesSummaryAttributes truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  /**
   * True when some recently active counters' usage wasn't read, so the counts may be low.
   *
   * @return truncated
   */
  @JsonProperty(JSON_PROPERTY_TRUNCATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getTruncated() {
    return truncated;
  }

  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }

  public AiGatewayRateLimitInstancesSummaryAttributes wouldLimitRequests(Long wouldLimitRequests) {
    this.wouldLimitRequests = wouldLimitRequests;
    return this;
  }

  /**
   * Requests the counters would have rejected in the last 15 minutes (ALERT), totaled over the
   * counters whose usage was read.
   *
   * @return wouldLimitRequests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WOULD_LIMIT_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWouldLimitRequests() {
    return wouldLimitRequests;
  }

  public void setWouldLimitRequests(Long wouldLimitRequests) {
    this.wouldLimitRequests = wouldLimitRequests;
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
   * @return AiGatewayRateLimitInstancesSummaryAttributes
   */
  @JsonAnySetter
  public AiGatewayRateLimitInstancesSummaryAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this AiGatewayRateLimitInstancesSummaryAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRateLimitInstancesSummaryAttributes aiGatewayRateLimitInstancesSummaryAttributes =
        (AiGatewayRateLimitInstancesSummaryAttributes) o;
    return Objects.equals(
            this.instanceCount, aiGatewayRateLimitInstancesSummaryAttributes.instanceCount)
        && Objects.equals(
            this.limitedRequests, aiGatewayRateLimitInstancesSummaryAttributes.limitedRequests)
        && Objects.equals(
            this.limitingCount, aiGatewayRateLimitInstancesSummaryAttributes.limitingCount)
        && Objects.equals(
            this.maxUtilization, aiGatewayRateLimitInstancesSummaryAttributes.maxUtilization)
        && Objects.equals(
            this.nearLimitCount, aiGatewayRateLimitInstancesSummaryAttributes.nearLimitCount)
        && Objects.equals(
            this.rateLimitId, aiGatewayRateLimitInstancesSummaryAttributes.rateLimitId)
        && Objects.equals(
            this.scopeRestricted, aiGatewayRateLimitInstancesSummaryAttributes.scopeRestricted)
        && Objects.equals(this.truncated, aiGatewayRateLimitInstancesSummaryAttributes.truncated)
        && Objects.equals(
            this.wouldLimitRequests,
            aiGatewayRateLimitInstancesSummaryAttributes.wouldLimitRequests)
        && Objects.equals(
            this.additionalProperties,
            aiGatewayRateLimitInstancesSummaryAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        instanceCount,
        limitedRequests,
        limitingCount,
        maxUtilization,
        nearLimitCount,
        rateLimitId,
        scopeRestricted,
        truncated,
        wouldLimitRequests,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRateLimitInstancesSummaryAttributes {\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    limitedRequests: ").append(toIndentedString(limitedRequests)).append("\n");
    sb.append("    limitingCount: ").append(toIndentedString(limitingCount)).append("\n");
    sb.append("    maxUtilization: ").append(toIndentedString(maxUtilization)).append("\n");
    sb.append("    nearLimitCount: ").append(toIndentedString(nearLimitCount)).append("\n");
    sb.append("    rateLimitId: ").append(toIndentedString(rateLimitId)).append("\n");
    sb.append("    scopeRestricted: ").append(toIndentedString(scopeRestricted)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
    sb.append("    wouldLimitRequests: ").append(toIndentedString(wouldLimitRequests)).append("\n");
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
