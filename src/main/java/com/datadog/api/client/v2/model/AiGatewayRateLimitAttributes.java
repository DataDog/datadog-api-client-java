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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of an AI Gateway rate limit. */
@JsonPropertyOrder({
  AiGatewayRateLimitAttributes.JSON_PROPERTY_CREATED_AT,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_CREATED_BY,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_ENABLED,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_INPUT_TOKENS_PER_MINUTE,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_IS_TEMPLATE,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_MODE,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_MONITOR_ID,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_NAME,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_OUTPUT_TOKENS_PER_MINUTE,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_REQUESTS_PER_MINUTE,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_REVISION,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_SCOPE_RESTRICTED,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_SELECTOR,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_TAGS,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_TEAM_ID,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_TEMPLATE_SPLIT_DIMS,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_UPDATED_AT,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_UPDATED_BY,
  AiGatewayRateLimitAttributes.JSON_PROPERTY_USER_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRateLimitAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_INPUT_TOKENS_PER_MINUTE = "input_tokens_per_minute";
  private JsonNullable<Long> inputTokensPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_IS_TEMPLATE = "is_template";
  private Boolean isTemplate;

  public static final String JSON_PROPERTY_MODE = "mode";
  private AiGatewayRateLimitMode mode;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private JsonNullable<Long> monitorId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OUTPUT_TOKENS_PER_MINUTE = "output_tokens_per_minute";
  private JsonNullable<Long> outputTokensPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_REQUESTS_PER_MINUTE = "requests_per_minute";
  private JsonNullable<Long> requestsPerMinute = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_REVISION = "revision";
  private Long revision;

  public static final String JSON_PROPERTY_SCOPE_RESTRICTED = "scope_restricted";
  private Boolean scopeRestricted;

  public static final String JSON_PROPERTY_SELECTOR = "selector";
  private JsonNullable<List<AiGatewayRateLimitSelectorEntry>> selector =
      JsonNullable.<List<AiGatewayRateLimitSelectorEntry>>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<String, String>();

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private JsonNullable<UUID> teamId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_TEMPLATE_SPLIT_DIMS = "template_split_dims";
  private List<String> templateSplitDims = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private String updatedBy;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<UUID> userId = JsonNullable.<UUID>undefined();

  public AiGatewayRateLimitAttributes() {}

  @JsonCreator
  public AiGatewayRateLimitAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) AiGatewayRateLimitMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REVISION) Long revision,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE_RESTRICTED)
          Boolean scopeRestricted,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) Map<String, String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY) String updatedBy) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.enabled = enabled;
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.name = name;
    this.revision = revision;
    this.scopeRestricted = scopeRestricted;
    this.tags = tags;
    this.updatedAt = updatedAt;
    this.updatedBy = updatedBy;
  }

  public AiGatewayRateLimitAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation timestamp.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AiGatewayRateLimitAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Email of the user who created this rate limit.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AiGatewayRateLimitAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this rate limit is active.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AiGatewayRateLimitAttributes inputTokensPerMinute(Long inputTokensPerMinute) {
    this.inputTokensPerMinute = JsonNullable.<Long>of(inputTokensPerMinute);
    return this;
  }

  /**
   * Maximum input tokens per rolling minute shared by all matching traffic, or per counter for a
   * template rate limit. Null when this rule does not limit input tokens. minimum: 1 maximum:
   * 100000000000
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

  public AiGatewayRateLimitAttributes isTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
    return this;
  }

  /**
   * Whether the selector gives each matching value its own allowance, that is, whether it has at
   * least one per_value entry. Returned even when scope_restricted hides the selector.
   *
   * @return isTemplate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

  public AiGatewayRateLimitAttributes mode(AiGatewayRateLimitMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Action taken when request rate exceeds the limit.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayRateLimitMode getMode() {
    return mode;
  }

  public void setMode(AiGatewayRateLimitMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public AiGatewayRateLimitAttributes monitorId(Long monitorId) {
    this.monitorId = JsonNullable.<Long>of(monitorId);
    return this;
  }

  /**
   * Datadog monitor that alerts on this rule. Null until one is provisioned.
   *
   * @return monitorId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMonitorId() {
    return monitorId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMonitorId_JsonNullable() {
    return monitorId;
  }

  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  public void setMonitorId_JsonNullable(JsonNullable<Long> monitorId) {
    this.monitorId = monitorId;
  }

  public void setMonitorId(Long monitorId) {
    this.monitorId = JsonNullable.<Long>of(monitorId);
  }

  public AiGatewayRateLimitAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Rate limit name.
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

  public AiGatewayRateLimitAttributes outputTokensPerMinute(Long outputTokensPerMinute) {
    this.outputTokensPerMinute = JsonNullable.<Long>of(outputTokensPerMinute);
    return this;
  }

  /**
   * Maximum output tokens per rolling minute shared by all matching traffic, or per counter for a
   * template rate limit. Null when this rule does not limit output tokens. minimum: 1 maximum:
   * 100000000000
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

  public AiGatewayRateLimitAttributes requestsPerMinute(Long requestsPerMinute) {
    this.requestsPerMinute = JsonNullable.<Long>of(requestsPerMinute);
    return this;
  }

  /**
   * Maximum requests per rolling minute shared by all matching traffic, or per counter for a
   * template rate limit. Null when this rule does not limit requests. minimum: 1 maximum: 10000000
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

  public AiGatewayRateLimitAttributes revision(Long revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Increases on every change to the definition.
   *
   * @return revision
   */
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  public AiGatewayRateLimitAttributes scopeRestricted(Boolean scopeRestricted) {
    this.scopeRestricted = scopeRestricted;
    return this;
  }

  /**
   * Whether provider or model scope metadata was withheld. Omit unchanged scope fields on an
   * unrelated update to preserve their saved values.
   *
   * @return scopeRestricted
   */
  @JsonProperty(JSON_PROPERTY_SCOPE_RESTRICTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getScopeRestricted() {
    return scopeRestricted;
  }

  public void setScopeRestricted(Boolean scopeRestricted) {
    this.scopeRestricted = scopeRestricted;
  }

  public AiGatewayRateLimitAttributes selector(List<AiGatewayRateLimitSelectorEntry> selector) {
    this.selector = JsonNullable.<List<AiGatewayRateLimitSelectorEntry>>of(selector);
    return this;
  }

  public AiGatewayRateLimitAttributes addSelectorItem(
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

  public AiGatewayRateLimitAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AiGatewayRateLimitAttributes putTagsItem(String key, String tagsItem) {
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Optional scope tags, such as provider, model, ml_app, or custom dimensions. A request matches
   * when it has all of these tags.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public AiGatewayRateLimitAttributes teamId(UUID teamId) {
    this.teamId = JsonNullable.<UUID>of(teamId);
    return this;
  }

  /**
   * Optional Team UUID. Count only requests attributed to this Datadog Team.
   *
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getTeamId() {
    return teamId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getTeamId_JsonNullable() {
    return teamId;
  }

  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  public void setTeamId_JsonNullable(JsonNullable<UUID> teamId) {
    this.teamId = teamId;
  }

  public void setTeamId(UUID teamId) {
    this.teamId = JsonNullable.<UUID>of(teamId);
  }

  public AiGatewayRateLimitAttributes templateSplitDims(List<String> templateSplitDims) {
    this.templateSplitDims = templateSplitDims;
    return this;
  }

  public AiGatewayRateLimitAttributes addTemplateSplitDimsItem(String templateSplitDimsItem) {
    if (this.templateSplitDims == null) {
      this.templateSplitDims = new ArrayList<>();
    }
    this.templateSplitDims.add(templateSplitDimsItem);
    return this;
  }

  /**
   * Dimensions of the selector's per_value entries, such as user_id or tag:env, each matching value
   * of which gets its own allowance. Empty unless is_template is true. Returned even when
   * scope_restricted hides the selector.
   *
   * @return templateSplitDims
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_SPLIT_DIMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTemplateSplitDims() {
    return templateSplitDims;
  }

  public void setTemplateSplitDims(List<String> templateSplitDims) {
    this.templateSplitDims = templateSplitDims;
  }

  public AiGatewayRateLimitAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Last modification timestamp.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AiGatewayRateLimitAttributes updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Email of the user who last modified this rate limit.
   *
   * @return updatedBy
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public AiGatewayRateLimitAttributes userId(UUID userId) {
    this.userId = JsonNullable.<UUID>of(userId);
    return this;
  }

  /**
   * Optional user UUID. Count only this user's requests.
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getUserId() {
    return userId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getUserId_JsonNullable() {
    return userId;
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<UUID> userId) {
    this.userId = userId;
  }

  public void setUserId(UUID userId) {
    this.userId = JsonNullable.<UUID>of(userId);
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
   * @return AiGatewayRateLimitAttributes
   */
  @JsonAnySetter
  public AiGatewayRateLimitAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRateLimitAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRateLimitAttributes aiGatewayRateLimitAttributes = (AiGatewayRateLimitAttributes) o;
    return Objects.equals(this.createdAt, aiGatewayRateLimitAttributes.createdAt)
        && Objects.equals(this.createdBy, aiGatewayRateLimitAttributes.createdBy)
        && Objects.equals(this.enabled, aiGatewayRateLimitAttributes.enabled)
        && Objects.equals(
            this.inputTokensPerMinute, aiGatewayRateLimitAttributes.inputTokensPerMinute)
        && Objects.equals(this.isTemplate, aiGatewayRateLimitAttributes.isTemplate)
        && Objects.equals(this.mode, aiGatewayRateLimitAttributes.mode)
        && Objects.equals(this.monitorId, aiGatewayRateLimitAttributes.monitorId)
        && Objects.equals(this.name, aiGatewayRateLimitAttributes.name)
        && Objects.equals(
            this.outputTokensPerMinute, aiGatewayRateLimitAttributes.outputTokensPerMinute)
        && Objects.equals(this.requestsPerMinute, aiGatewayRateLimitAttributes.requestsPerMinute)
        && Objects.equals(this.revision, aiGatewayRateLimitAttributes.revision)
        && Objects.equals(this.scopeRestricted, aiGatewayRateLimitAttributes.scopeRestricted)
        && Objects.equals(this.selector, aiGatewayRateLimitAttributes.selector)
        && Objects.equals(this.tags, aiGatewayRateLimitAttributes.tags)
        && Objects.equals(this.teamId, aiGatewayRateLimitAttributes.teamId)
        && Objects.equals(this.templateSplitDims, aiGatewayRateLimitAttributes.templateSplitDims)
        && Objects.equals(this.updatedAt, aiGatewayRateLimitAttributes.updatedAt)
        && Objects.equals(this.updatedBy, aiGatewayRateLimitAttributes.updatedBy)
        && Objects.equals(this.userId, aiGatewayRateLimitAttributes.userId)
        && Objects.equals(
            this.additionalProperties, aiGatewayRateLimitAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        enabled,
        inputTokensPerMinute,
        isTemplate,
        mode,
        monitorId,
        name,
        outputTokensPerMinute,
        requestsPerMinute,
        revision,
        scopeRestricted,
        selector,
        tags,
        teamId,
        templateSplitDims,
        updatedAt,
        updatedBy,
        userId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRateLimitAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inputTokensPerMinute: ")
        .append(toIndentedString(inputTokensPerMinute))
        .append("\n");
    sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputTokensPerMinute: ")
        .append(toIndentedString(outputTokensPerMinute))
        .append("\n");
    sb.append("    requestsPerMinute: ").append(toIndentedString(requestsPerMinute)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    scopeRestricted: ").append(toIndentedString(scopeRestricted)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    templateSplitDims: ").append(toIndentedString(templateSplitDims)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
