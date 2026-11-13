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

/** Live consumption of one AI Gateway rate limit. */
@JsonPropertyOrder({
  AiGatewayRateLimitUsageAttributes.JSON_PROPERTY_COST_MICROCENTS,
  AiGatewayRateLimitUsageAttributes.JSON_PROPERTY_INPUT_TOKENS,
  AiGatewayRateLimitUsageAttributes.JSON_PROPERTY_LIMITED_REQUESTS,
  AiGatewayRateLimitUsageAttributes.JSON_PROPERTY_OUTPUT_TOKENS,
  AiGatewayRateLimitUsageAttributes.JSON_PROPERTY_REQUESTS,
  AiGatewayRateLimitUsageAttributes.JSON_PROPERTY_WOULD_LIMIT_REQUESTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRateLimitUsageAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COST_MICROCENTS = "cost_microcents";
  private Long costMicrocents;

  public static final String JSON_PROPERTY_INPUT_TOKENS = "input_tokens";
  private Long inputTokens;

  public static final String JSON_PROPERTY_LIMITED_REQUESTS = "limited_requests";
  private Long limitedRequests;

  public static final String JSON_PROPERTY_OUTPUT_TOKENS = "output_tokens";
  private Long outputTokens;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private Long requests;

  public static final String JSON_PROPERTY_WOULD_LIMIT_REQUESTS = "would_limit_requests";
  private Long wouldLimitRequests;

  public AiGatewayRateLimitUsageAttributes() {}

  @JsonCreator
  public AiGatewayRateLimitUsageAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT_TOKENS) Long inputTokens,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMITED_REQUESTS) Long limitedRequests,
      @JsonProperty(required = true, value = JSON_PROPERTY_OUTPUT_TOKENS) Long outputTokens,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS) Long requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_WOULD_LIMIT_REQUESTS)
          Long wouldLimitRequests) {
    this.inputTokens = inputTokens;
    this.limitedRequests = limitedRequests;
    this.outputTokens = outputTokens;
    this.requests = requests;
    this.wouldLimitRequests = wouldLimitRequests;
  }

  public AiGatewayRateLimitUsageAttributes costMicrocents(Long costMicrocents) {
    this.costMicrocents = costMicrocents;
    return this;
  }

  /**
   * Priced spend, in microcents, counted in the rolling one-minute window. Only rules with a cost
   * limit count it, so it is 0 for other rules and for the untracked and total entries.
   *
   * @return costMicrocents
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCostMicrocents() {
    return costMicrocents;
  }

  public void setCostMicrocents(Long costMicrocents) {
    this.costMicrocents = costMicrocents;
  }

  public AiGatewayRateLimitUsageAttributes inputTokens(Long inputTokens) {
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

  public AiGatewayRateLimitUsageAttributes limitedRequests(Long limitedRequests) {
    this.limitedRequests = limitedRequests;
    return this;
  }

  /**
   * Requests this rate limit rejected in the last 15 minutes. Applies when mode is ENFORCE.
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

  public AiGatewayRateLimitUsageAttributes outputTokens(Long outputTokens) {
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

  public AiGatewayRateLimitUsageAttributes requests(Long requests) {
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

  public AiGatewayRateLimitUsageAttributes wouldLimitRequests(Long wouldLimitRequests) {
    this.wouldLimitRequests = wouldLimitRequests;
    return this;
  }

  /**
   * Requests this rate limit would have rejected in the last 15 minutes. Applies when mode is
   * ALERT.
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
   * @return AiGatewayRateLimitUsageAttributes
   */
  @JsonAnySetter
  public AiGatewayRateLimitUsageAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRateLimitUsageAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRateLimitUsageAttributes aiGatewayRateLimitUsageAttributes =
        (AiGatewayRateLimitUsageAttributes) o;
    return Objects.equals(this.costMicrocents, aiGatewayRateLimitUsageAttributes.costMicrocents)
        && Objects.equals(this.inputTokens, aiGatewayRateLimitUsageAttributes.inputTokens)
        && Objects.equals(this.limitedRequests, aiGatewayRateLimitUsageAttributes.limitedRequests)
        && Objects.equals(this.outputTokens, aiGatewayRateLimitUsageAttributes.outputTokens)
        && Objects.equals(this.requests, aiGatewayRateLimitUsageAttributes.requests)
        && Objects.equals(
            this.wouldLimitRequests, aiGatewayRateLimitUsageAttributes.wouldLimitRequests)
        && Objects.equals(
            this.additionalProperties, aiGatewayRateLimitUsageAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        costMicrocents,
        inputTokens,
        limitedRequests,
        outputTokens,
        requests,
        wouldLimitRequests,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRateLimitUsageAttributes {\n");
    sb.append("    costMicrocents: ").append(toIndentedString(costMicrocents)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    limitedRequests: ").append(toIndentedString(limitedRequests)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
