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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** One counter of a template rate limit and its live usage. */
@JsonPropertyOrder({
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_FIRST_SEEN,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_INPUT_TOKENS,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_INPUT_TOKENS_PER_MINUTE,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_INSTANCE_KEY,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_LAST_SEEN,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_LIMITED_REQUESTS,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_OUTPUT_TOKENS,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_OUTPUT_TOKENS_PER_MINUTE,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_RATE_LIMIT_ID,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_REQUESTS,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_REQUESTS_PER_MINUTE,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_SPLIT_DIMS,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_USAGE_KNOWN,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_UTILIZATION,
  AiGatewayRateLimitInstanceAttributes.JSON_PROPERTY_WOULD_LIMIT_REQUESTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRateLimitInstanceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST_SEEN = "first_seen";
  private OffsetDateTime firstSeen;

  public static final String JSON_PROPERTY_INPUT_TOKENS = "input_tokens";
  private Long inputTokens;

  public static final String JSON_PROPERTY_INPUT_TOKENS_PER_MINUTE = "input_tokens_per_minute";
  private JsonNullable<Long> inputTokensPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INSTANCE_KEY = "instance_key";
  private String instanceKey;

  public static final String JSON_PROPERTY_LAST_SEEN = "last_seen";
  private OffsetDateTime lastSeen;

  public static final String JSON_PROPERTY_LIMITED_REQUESTS = "limited_requests";
  private Long limitedRequests;

  public static final String JSON_PROPERTY_OUTPUT_TOKENS = "output_tokens";
  private Long outputTokens;

  public static final String JSON_PROPERTY_OUTPUT_TOKENS_PER_MINUTE = "output_tokens_per_minute";
  private JsonNullable<Long> outputTokensPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RATE_LIMIT_ID = "rate_limit_id";
  private UUID rateLimitId;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private Long requests;

  public static final String JSON_PROPERTY_REQUESTS_PER_MINUTE = "requests_per_minute";
  private JsonNullable<Long> requestsPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SPLIT_DIMS = "split_dims";
  private Map<String, String> splitDims = new HashMap<String, String>();

  public static final String JSON_PROPERTY_USAGE_KNOWN = "usage_known";
  private Boolean usageKnown;

  public static final String JSON_PROPERTY_UTILIZATION = "utilization";
  private Double utilization;

  public static final String JSON_PROPERTY_WOULD_LIMIT_REQUESTS = "would_limit_requests";
  private Long wouldLimitRequests;

  public AiGatewayRateLimitInstanceAttributes() {}

  @JsonCreator
  public AiGatewayRateLimitInstanceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIRST_SEEN) OffsetDateTime firstSeen,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT_TOKENS) Long inputTokens,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_KEY) String instanceKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_SEEN) OffsetDateTime lastSeen,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMITED_REQUESTS) Long limitedRequests,
      @JsonProperty(required = true, value = JSON_PROPERTY_OUTPUT_TOKENS) Long outputTokens,
      @JsonProperty(required = true, value = JSON_PROPERTY_RATE_LIMIT_ID) UUID rateLimitId,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS) Long requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPLIT_DIMS)
          Map<String, String> splitDims,
      @JsonProperty(required = true, value = JSON_PROPERTY_USAGE_KNOWN) Boolean usageKnown,
      @JsonProperty(required = true, value = JSON_PROPERTY_UTILIZATION) Double utilization,
      @JsonProperty(required = true, value = JSON_PROPERTY_WOULD_LIMIT_REQUESTS)
          Long wouldLimitRequests) {
    this.firstSeen = firstSeen;
    this.inputTokens = inputTokens;
    this.instanceKey = instanceKey;
    this.lastSeen = lastSeen;
    this.limitedRequests = limitedRequests;
    this.outputTokens = outputTokens;
    this.rateLimitId = rateLimitId;
    this.requests = requests;
    this.splitDims = splitDims;
    this.usageKnown = usageKnown;
    this.utilization = utilization;
    this.wouldLimitRequests = wouldLimitRequests;
  }

  public AiGatewayRateLimitInstanceAttributes firstSeen(OffsetDateTime firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

  /**
   * When the gateway first recorded a request for this counter.
   *
   * @return firstSeen
   */
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(OffsetDateTime firstSeen) {
    this.firstSeen = firstSeen;
  }

  public AiGatewayRateLimitInstanceAttributes inputTokens(Long inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * Input tokens counted in the rolling one-minute window.
   *
   * @return inputTokens
   */
  @JsonProperty(JSON_PROPERTY_INPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Long inputTokens) {
    this.inputTokens = inputTokens;
  }

  public AiGatewayRateLimitInstanceAttributes inputTokensPerMinute(Long inputTokensPerMinute) {
    this.inputTokensPerMinute = JsonNullable.<Long>of(inputTokensPerMinute);
    return this;
  }

  /**
   * The rate limit's per-counter input token limit. Null when it doesn't limit input tokens.
   *
   * @return inputTokensPerMinute
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getInputTokensPerMinute() {
    return inputTokensPerMinute.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INPUT_TOKENS_PER_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getInputTokensPerMinute_JsonNullable() {
    return inputTokensPerMinute;
  }

  @JsonProperty(JSON_PROPERTY_INPUT_TOKENS_PER_MINUTE)
  public void setInputTokensPerMinute_JsonNullable(JsonNullable<Long> inputTokensPerMinute) {
    this.inputTokensPerMinute = inputTokensPerMinute;
  }

  public void setInputTokensPerMinute(Long inputTokensPerMinute) {
    this.inputTokensPerMinute = JsonNullable.<Long>of(inputTokensPerMinute);
  }

  public AiGatewayRateLimitInstanceAttributes instanceKey(String instanceKey) {
    this.instanceKey = instanceKey;
    return this;
  }

  /**
   * Opaque canonical key identifying the counter.
   *
   * @return instanceKey
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInstanceKey() {
    return instanceKey;
  }

  public void setInstanceKey(String instanceKey) {
    this.instanceKey = instanceKey;
  }

  public AiGatewayRateLimitInstanceAttributes lastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

  /**
   * When the gateway last recorded a request for this counter; up to a few minutes behind live
   * traffic.
   *
   * @return lastSeen
   */
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
  }

  public AiGatewayRateLimitInstanceAttributes limitedRequests(Long limitedRequests) {
    this.limitedRequests = limitedRequests;
    return this;
  }

  /**
   * Requests this counter rejected in the last 15 minutes (ENFORCE).
   *
   * @return limitedRequests
   */
  @JsonProperty(JSON_PROPERTY_LIMITED_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLimitedRequests() {
    return limitedRequests;
  }

  public void setLimitedRequests(Long limitedRequests) {
    this.limitedRequests = limitedRequests;
  }

  public AiGatewayRateLimitInstanceAttributes outputTokens(Long outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  /**
   * Output tokens counted in the rolling one-minute window.
   *
   * @return outputTokens
   */
  @JsonProperty(JSON_PROPERTY_OUTPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Long outputTokens) {
    this.outputTokens = outputTokens;
  }

  public AiGatewayRateLimitInstanceAttributes outputTokensPerMinute(Long outputTokensPerMinute) {
    this.outputTokensPerMinute = JsonNullable.<Long>of(outputTokensPerMinute);
    return this;
  }

  /**
   * The rate limit's per-counter output token limit. Null when it doesn't limit output tokens.
   *
   * @return outputTokensPerMinute
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getOutputTokensPerMinute() {
    return outputTokensPerMinute.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OUTPUT_TOKENS_PER_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getOutputTokensPerMinute_JsonNullable() {
    return outputTokensPerMinute;
  }

  @JsonProperty(JSON_PROPERTY_OUTPUT_TOKENS_PER_MINUTE)
  public void setOutputTokensPerMinute_JsonNullable(JsonNullable<Long> outputTokensPerMinute) {
    this.outputTokensPerMinute = outputTokensPerMinute;
  }

  public void setOutputTokensPerMinute(Long outputTokensPerMinute) {
    this.outputTokensPerMinute = JsonNullable.<Long>of(outputTokensPerMinute);
  }

  public AiGatewayRateLimitInstanceAttributes rateLimitId(UUID rateLimitId) {
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

  public AiGatewayRateLimitInstanceAttributes requests(Long requests) {
    this.requests = requests;
    return this;
  }

  /**
   * Requests counted in the rolling one-minute window.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRequests() {
    return requests;
  }

  public void setRequests(Long requests) {
    this.requests = requests;
  }

  public AiGatewayRateLimitInstanceAttributes requestsPerMinute(Long requestsPerMinute) {
    this.requestsPerMinute = JsonNullable.<Long>of(requestsPerMinute);
    return this;
  }

  /**
   * The rate limit's per-counter request limit. Null when it doesn't limit requests.
   *
   * @return requestsPerMinute
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRequestsPerMinute() {
    return requestsPerMinute.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REQUESTS_PER_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRequestsPerMinute_JsonNullable() {
    return requestsPerMinute;
  }

  @JsonProperty(JSON_PROPERTY_REQUESTS_PER_MINUTE)
  public void setRequestsPerMinute_JsonNullable(JsonNullable<Long> requestsPerMinute) {
    this.requestsPerMinute = requestsPerMinute;
  }

  public void setRequestsPerMinute(Long requestsPerMinute) {
    this.requestsPerMinute = JsonNullable.<Long>of(requestsPerMinute);
  }

  public AiGatewayRateLimitInstanceAttributes splitDims(Map<String, String> splitDims) {
    this.splitDims = splitDims;
    return this;
  }

  public AiGatewayRateLimitInstanceAttributes putSplitDimsItem(String key, String splitDimsItem) {
    this.splitDims.put(key, splitDimsItem);
    return this;
  }

  /**
   * The counter's value for each per-value dimension. user_id and team_id values are raw UUIDs.
   *
   * @return splitDims
   */
  @JsonProperty(JSON_PROPERTY_SPLIT_DIMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getSplitDims() {
    return splitDims;
  }

  public void setSplitDims(Map<String, String> splitDims) {
    this.splitDims = splitDims;
  }

  public AiGatewayRateLimitInstanceAttributes usageKnown(Boolean usageKnown) {
    this.usageKnown = usageKnown;
    return this;
  }

  /**
   * False when this counter's usage wasn't read because the request already read the most counters
   * it may. Its usage then reads as zero.
   *
   * @return usageKnown
   */
  @JsonProperty(JSON_PROPERTY_USAGE_KNOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getUsageKnown() {
    return usageKnown;
  }

  public void setUsageKnown(Boolean usageKnown) {
    this.usageKnown = usageKnown;
  }

  public AiGatewayRateLimitInstanceAttributes utilization(Double utilization) {
    this.utilization = utilization;
    return this;
  }

  /**
   * The fullest of the rate limit's limits in the rolling window, as a fraction. 1 or more means
   * the counter is at its limit.
   *
   * @return utilization
   */
  @JsonProperty(JSON_PROPERTY_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getUtilization() {
    return utilization;
  }

  public void setUtilization(Double utilization) {
    this.utilization = utilization;
  }

  public AiGatewayRateLimitInstanceAttributes wouldLimitRequests(Long wouldLimitRequests) {
    this.wouldLimitRequests = wouldLimitRequests;
    return this;
  }

  /**
   * Requests this counter would have rejected in the last 15 minutes (ALERT).
   *
   * @return wouldLimitRequests
   */
  @JsonProperty(JSON_PROPERTY_WOULD_LIMIT_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return AiGatewayRateLimitInstanceAttributes
   */
  @JsonAnySetter
  public AiGatewayRateLimitInstanceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRateLimitInstanceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRateLimitInstanceAttributes aiGatewayRateLimitInstanceAttributes =
        (AiGatewayRateLimitInstanceAttributes) o;
    return Objects.equals(this.firstSeen, aiGatewayRateLimitInstanceAttributes.firstSeen)
        && Objects.equals(this.inputTokens, aiGatewayRateLimitInstanceAttributes.inputTokens)
        && Objects.equals(
            this.inputTokensPerMinute, aiGatewayRateLimitInstanceAttributes.inputTokensPerMinute)
        && Objects.equals(this.instanceKey, aiGatewayRateLimitInstanceAttributes.instanceKey)
        && Objects.equals(this.lastSeen, aiGatewayRateLimitInstanceAttributes.lastSeen)
        && Objects.equals(
            this.limitedRequests, aiGatewayRateLimitInstanceAttributes.limitedRequests)
        && Objects.equals(this.outputTokens, aiGatewayRateLimitInstanceAttributes.outputTokens)
        && Objects.equals(
            this.outputTokensPerMinute, aiGatewayRateLimitInstanceAttributes.outputTokensPerMinute)
        && Objects.equals(this.rateLimitId, aiGatewayRateLimitInstanceAttributes.rateLimitId)
        && Objects.equals(this.requests, aiGatewayRateLimitInstanceAttributes.requests)
        && Objects.equals(
            this.requestsPerMinute, aiGatewayRateLimitInstanceAttributes.requestsPerMinute)
        && Objects.equals(this.splitDims, aiGatewayRateLimitInstanceAttributes.splitDims)
        && Objects.equals(this.usageKnown, aiGatewayRateLimitInstanceAttributes.usageKnown)
        && Objects.equals(this.utilization, aiGatewayRateLimitInstanceAttributes.utilization)
        && Objects.equals(
            this.wouldLimitRequests, aiGatewayRateLimitInstanceAttributes.wouldLimitRequests)
        && Objects.equals(
            this.additionalProperties, aiGatewayRateLimitInstanceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstSeen,
        inputTokens,
        inputTokensPerMinute,
        instanceKey,
        lastSeen,
        limitedRequests,
        outputTokens,
        outputTokensPerMinute,
        rateLimitId,
        requests,
        requestsPerMinute,
        splitDims,
        usageKnown,
        utilization,
        wouldLimitRequests,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRateLimitInstanceAttributes {\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    inputTokensPerMinute: ")
        .append(toIndentedString(inputTokensPerMinute))
        .append("\n");
    sb.append("    instanceKey: ").append(toIndentedString(instanceKey)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    limitedRequests: ").append(toIndentedString(limitedRequests)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    outputTokensPerMinute: ")
        .append(toIndentedString(outputTokensPerMinute))
        .append("\n");
    sb.append("    rateLimitId: ").append(toIndentedString(rateLimitId)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    requestsPerMinute: ").append(toIndentedString(requestsPerMinute)).append("\n");
    sb.append("    splitDims: ").append(toIndentedString(splitDims)).append("\n");
    sb.append("    usageKnown: ").append(toIndentedString(usageKnown)).append("\n");
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
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
