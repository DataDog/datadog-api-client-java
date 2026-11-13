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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes used to create an AI Gateway rate limit. */
@JsonPropertyOrder({
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_COST_MICROCENTS_PER_MINUTE,
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_INPUT_TOKENS_PER_MINUTE,
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_MODE,
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_NAME,
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_OUTPUT_TOKENS_PER_MINUTE,
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_REQUESTS_PER_MINUTE,
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_SELECTOR,
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_TAGS,
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_TEAM_ID,
  AiGatewayRateLimitCreateAttributes.JSON_PROPERTY_USER_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRateLimitCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COST_MICROCENTS_PER_MINUTE =
      "cost_microcents_per_minute";
  private JsonNullable<Long> costMicrocentsPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INPUT_TOKENS_PER_MINUTE = "input_tokens_per_minute";
  private JsonNullable<Long> inputTokensPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MODE = "mode";
  private AiGatewayRateLimitMode mode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OUTPUT_TOKENS_PER_MINUTE = "output_tokens_per_minute";
  private JsonNullable<Long> outputTokensPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_REQUESTS_PER_MINUTE = "requests_per_minute";
  private JsonNullable<Long> requestsPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SELECTOR = "selector";
  private JsonNullable<List<AiGatewayRateLimitSelectorEntry>> selector =
      JsonNullable.<List<AiGatewayRateLimitSelectorEntry>>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = null;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private UUID teamId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public AiGatewayRateLimitCreateAttributes() {}

  @JsonCreator
  public AiGatewayRateLimitCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public AiGatewayRateLimitCreateAttributes costMicrocentsPerMinute(Long costMicrocentsPerMinute) {
    this.costMicrocentsPerMinute = JsonNullable.<Long>of(costMicrocentsPerMinute);
    return this;
  }

  /**
   * Maximum priced spend per rolling minute, in microcents of 1e-8 USD each. At most
   * 10000000000000, that is $100,000. In <code>ENFORCE</code> mode, requests to a model with no
   * pricing are rejected, because their cost can't be counted. minimum: 1 maximum: 10000000000000
   *
   * @return costMicrocentsPerMinute
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCostMicrocentsPerMinute() {
    return costMicrocentsPerMinute.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COST_MICROCENTS_PER_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCostMicrocentsPerMinute_JsonNullable() {
    return costMicrocentsPerMinute;
  }

  @JsonProperty(JSON_PROPERTY_COST_MICROCENTS_PER_MINUTE)
  public void setCostMicrocentsPerMinute_JsonNullable(JsonNullable<Long> costMicrocentsPerMinute) {
    this.costMicrocentsPerMinute = costMicrocentsPerMinute;
  }

  public void setCostMicrocentsPerMinute(Long costMicrocentsPerMinute) {
    this.costMicrocentsPerMinute = JsonNullable.<Long>of(costMicrocentsPerMinute);
  }

  public AiGatewayRateLimitCreateAttributes inputTokensPerMinute(Long inputTokensPerMinute) {
    this.inputTokensPerMinute = JsonNullable.<Long>of(inputTokensPerMinute);
    return this;
  }

  /**
   * Maximum input tokens per rolling minute. minimum: 1 maximum: 100000000000
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

  public AiGatewayRateLimitCreateAttributes mode(AiGatewayRateLimitMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Action taken when request rate exceeds the limit.
   *
   * @return mode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayRateLimitMode getMode() {
    return mode;
  }

  public void setMode(AiGatewayRateLimitMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public AiGatewayRateLimitCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Rate limit name. Must not be empty.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AiGatewayRateLimitCreateAttributes outputTokensPerMinute(Long outputTokensPerMinute) {
    this.outputTokensPerMinute = JsonNullable.<Long>of(outputTokensPerMinute);
    return this;
  }

  /**
   * Maximum output tokens per rolling minute. minimum: 1 maximum: 100000000000
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

  public AiGatewayRateLimitCreateAttributes requestsPerMinute(Long requestsPerMinute) {
    this.requestsPerMinute = JsonNullable.<Long>of(requestsPerMinute);
    return this;
  }

  /**
   * Maximum requests per rolling minute. At least one of <code>requests_per_minute</code>, <code>
   * input_tokens_per_minute</code>, <code>output_tokens_per_minute</code>, and <code>
   * cost_microcents_per_minute</code> is required. minimum: 1 maximum: 10000000
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

  public AiGatewayRateLimitCreateAttributes selector(
      List<AiGatewayRateLimitSelectorEntry> selector) {
    this.selector = JsonNullable.<List<AiGatewayRateLimitSelectorEntry>>of(selector);
    return this;
  }

  public AiGatewayRateLimitCreateAttributes addSelectorItem(
      AiGatewayRateLimitSelectorEntry selectorItem) {
    if (this.selector == null || !this.selector.isPresent()) {
      this.selector = JsonNullable.<List<AiGatewayRateLimitSelectorEntry>>of(new ArrayList<>());
    }
    try {
      this.selector.get().add(selectorItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Dimension rules for a template rate limit, which gives each matched user, Team, or value its
   * own allowance with the rule's limits. Can't be combined with user_id, team_id, or tags, and
   * can't be changed after creation. Omit for a rule with one shared allowance.
   *
   * @return selector
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<AiGatewayRateLimitSelectorEntry> getSelector() {
    return selector.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<AiGatewayRateLimitSelectorEntry>> getSelector_JsonNullable() {
    return selector;
  }

  @JsonProperty(JSON_PROPERTY_SELECTOR)
  public void setSelector_JsonNullable(
      JsonNullable<List<AiGatewayRateLimitSelectorEntry>> selector) {
    this.selector = selector;
  }

  public void setSelector(List<AiGatewayRateLimitSelectorEntry> selector) {
    this.selector = JsonNullable.<List<AiGatewayRateLimitSelectorEntry>>of(selector);
  }

  public AiGatewayRateLimitCreateAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AiGatewayRateLimitCreateAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Optional scope tags, such as <code>provider</code>, <code>model</code>, <code>ml_app</code>, or
   * custom dimensions. A request matches when it has all of these tags. The reserved metadata keys
   * <code>name</code>, <code>budget_name</code>, and <code>span_filter</code> are rejected.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public AiGatewayRateLimitCreateAttributes teamId(UUID teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Optional UUID. Count only requests attributed to this Datadog Team.
   *
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getTeamId() {
    return teamId;
  }

  public void setTeamId(UUID teamId) {
    this.teamId = teamId;
  }

  public AiGatewayRateLimitCreateAttributes userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Optional UUID. Count only this user's requests.
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
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
   * @return AiGatewayRateLimitCreateAttributes
   */
  @JsonAnySetter
  public AiGatewayRateLimitCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRateLimitCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRateLimitCreateAttributes aiGatewayRateLimitCreateAttributes =
        (AiGatewayRateLimitCreateAttributes) o;
    return Objects.equals(
            this.costMicrocentsPerMinute,
            aiGatewayRateLimitCreateAttributes.costMicrocentsPerMinute)
        && Objects.equals(
            this.inputTokensPerMinute, aiGatewayRateLimitCreateAttributes.inputTokensPerMinute)
        && Objects.equals(this.mode, aiGatewayRateLimitCreateAttributes.mode)
        && Objects.equals(this.name, aiGatewayRateLimitCreateAttributes.name)
        && Objects.equals(
            this.outputTokensPerMinute, aiGatewayRateLimitCreateAttributes.outputTokensPerMinute)
        && Objects.equals(
            this.requestsPerMinute, aiGatewayRateLimitCreateAttributes.requestsPerMinute)
        && Objects.equals(this.selector, aiGatewayRateLimitCreateAttributes.selector)
        && Objects.equals(this.tags, aiGatewayRateLimitCreateAttributes.tags)
        && Objects.equals(this.teamId, aiGatewayRateLimitCreateAttributes.teamId)
        && Objects.equals(this.userId, aiGatewayRateLimitCreateAttributes.userId)
        && Objects.equals(
            this.additionalProperties, aiGatewayRateLimitCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        costMicrocentsPerMinute,
        inputTokensPerMinute,
        mode,
        name,
        outputTokensPerMinute,
        requestsPerMinute,
        selector,
        tags,
        teamId,
        userId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRateLimitCreateAttributes {\n");
    sb.append("    costMicrocentsPerMinute: ")
        .append(toIndentedString(costMicrocentsPerMinute))
        .append("\n");
    sb.append("    inputTokensPerMinute: ")
        .append(toIndentedString(inputTokensPerMinute))
        .append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputTokensPerMinute: ")
        .append(toIndentedString(outputTokensPerMinute))
        .append("\n");
    sb.append("    requestsPerMinute: ").append(toIndentedString(requestsPerMinute)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
