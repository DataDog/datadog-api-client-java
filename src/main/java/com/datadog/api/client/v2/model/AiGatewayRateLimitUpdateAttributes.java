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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes used to update an AI Gateway rate limit. Only sent fields are changed. */
@JsonPropertyOrder({
  AiGatewayRateLimitUpdateAttributes.JSON_PROPERTY_ENABLED,
  AiGatewayRateLimitUpdateAttributes.JSON_PROPERTY_INPUT_TOKENS_PER_MINUTE,
  AiGatewayRateLimitUpdateAttributes.JSON_PROPERTY_MODE,
  AiGatewayRateLimitUpdateAttributes.JSON_PROPERTY_NAME,
  AiGatewayRateLimitUpdateAttributes.JSON_PROPERTY_OUTPUT_TOKENS_PER_MINUTE,
  AiGatewayRateLimitUpdateAttributes.JSON_PROPERTY_REQUESTS_PER_MINUTE,
  AiGatewayRateLimitUpdateAttributes.JSON_PROPERTY_TAGS,
  AiGatewayRateLimitUpdateAttributes.JSON_PROPERTY_TEAM_ID,
  AiGatewayRateLimitUpdateAttributes.JSON_PROPERTY_USER_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRateLimitUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

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

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<Map<String, String>> tags = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private JsonNullable<String> teamId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  public AiGatewayRateLimitUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this rate limit is active.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AiGatewayRateLimitUpdateAttributes inputTokensPerMinute(Long inputTokensPerMinute) {
    this.inputTokensPerMinute = JsonNullable.<Long>of(inputTokensPerMinute);
    return this;
  }

  /**
   * Set to 0 to remove the request limit. Null is ignored. At least one limit must remain. minimum:
   * 0 maximum: 100000000000
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

  public AiGatewayRateLimitUpdateAttributes mode(AiGatewayRateLimitMode mode) {
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

  public AiGatewayRateLimitUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Rate limit name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AiGatewayRateLimitUpdateAttributes outputTokensPerMinute(Long outputTokensPerMinute) {
    this.outputTokensPerMinute = JsonNullable.<Long>of(outputTokensPerMinute);
    return this;
  }

  /**
   * Set to 0 to remove the request limit. Null is ignored. At least one limit must remain. minimum:
   * 0 maximum: 100000000000
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

  public AiGatewayRateLimitUpdateAttributes requestsPerMinute(Long requestsPerMinute) {
    this.requestsPerMinute = JsonNullable.<Long>of(requestsPerMinute);
    return this;
  }

  /**
   * Set to 0 to remove the request limit. Null is ignored. At least one limit must remain. minimum:
   * 0 maximum: 10000000
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

  public AiGatewayRateLimitUpdateAttributes tags(Map<String, String> tags) {
    this.tags = JsonNullable.<Map<String, String>>of(tags);
    return this;
  }

  public AiGatewayRateLimitUpdateAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.tags.get().put(key, tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Replaces all scope tags. An empty object clears them. Null is ignored.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, String> getTags() {
    return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, String>> getTags_JsonNullable() {
    return tags;
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<Map<String, String>> tags) {
    this.tags = tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = JsonNullable.<Map<String, String>>of(tags);
  }

  public AiGatewayRateLimitUpdateAttributes teamId(String teamId) {
    this.teamId = JsonNullable.<String>of(teamId);
    return this;
  }

  /**
   * Replaces the Team scope. An empty string clears it. Null is ignored.
   *
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTeamId() {
    return teamId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTeamId_JsonNullable() {
    return teamId;
  }

  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  public void setTeamId_JsonNullable(JsonNullable<String> teamId) {
    this.teamId = teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = JsonNullable.<String>of(teamId);
  }

  public AiGatewayRateLimitUpdateAttributes userId(String userId) {
    this.userId = JsonNullable.<String>of(userId);
    return this;
  }

  /**
   * Replaces the user scope. An empty string clears it. Null is ignored.
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getUserId() {
    return userId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUserId_JsonNullable() {
    return userId;
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public void setUserId(String userId) {
    this.userId = JsonNullable.<String>of(userId);
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
   * @return AiGatewayRateLimitUpdateAttributes
   */
  @JsonAnySetter
  public AiGatewayRateLimitUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRateLimitUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRateLimitUpdateAttributes aiGatewayRateLimitUpdateAttributes =
        (AiGatewayRateLimitUpdateAttributes) o;
    return Objects.equals(this.enabled, aiGatewayRateLimitUpdateAttributes.enabled)
        && Objects.equals(
            this.inputTokensPerMinute, aiGatewayRateLimitUpdateAttributes.inputTokensPerMinute)
        && Objects.equals(this.mode, aiGatewayRateLimitUpdateAttributes.mode)
        && Objects.equals(this.name, aiGatewayRateLimitUpdateAttributes.name)
        && Objects.equals(
            this.outputTokensPerMinute, aiGatewayRateLimitUpdateAttributes.outputTokensPerMinute)
        && Objects.equals(
            this.requestsPerMinute, aiGatewayRateLimitUpdateAttributes.requestsPerMinute)
        && Objects.equals(this.tags, aiGatewayRateLimitUpdateAttributes.tags)
        && Objects.equals(this.teamId, aiGatewayRateLimitUpdateAttributes.teamId)
        && Objects.equals(this.userId, aiGatewayRateLimitUpdateAttributes.userId)
        && Objects.equals(
            this.additionalProperties, aiGatewayRateLimitUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        enabled,
        inputTokensPerMinute,
        mode,
        name,
        outputTokensPerMinute,
        requestsPerMinute,
        tags,
        teamId,
        userId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRateLimitUpdateAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inputTokensPerMinute: ")
        .append(toIndentedString(inputTokensPerMinute))
        .append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputTokensPerMinute: ")
        .append(toIndentedString(outputTokensPerMinute))
        .append("\n");
    sb.append("    requestsPerMinute: ").append(toIndentedString(requestsPerMinute)).append("\n");
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
