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

/** Environment-specific settings for a feature flag. */
@JsonPropertyOrder({
  FeatureFlagEnvironment.JSON_PROPERTY_ALLOCATIONS,
  FeatureFlagEnvironment.JSON_PROPERTY_DEFAULT_ALLOCATION_KEY,
  FeatureFlagEnvironment.JSON_PROPERTY_DEFAULT_VARIANT_ID,
  FeatureFlagEnvironment.JSON_PROPERTY_ENVIRONMENT_ID,
  FeatureFlagEnvironment.JSON_PROPERTY_ENVIRONMENT_NAME,
  FeatureFlagEnvironment.JSON_PROPERTY_ENVIRONMENT_QUERIES,
  FeatureFlagEnvironment.JSON_PROPERTY_IS_PRODUCTION,
  FeatureFlagEnvironment.JSON_PROPERTY_OVERRIDE_ALLOCATION_KEY,
  FeatureFlagEnvironment.JSON_PROPERTY_OVERRIDE_VARIANT_ID,
  FeatureFlagEnvironment.JSON_PROPERTY_PENDING_SUGGESTION_ID,
  FeatureFlagEnvironment.JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL,
  FeatureFlagEnvironment.JSON_PROPERTY_ROLLOUT_PERCENTAGE,
  FeatureFlagEnvironment.JSON_PROPERTY_RULES,
  FeatureFlagEnvironment.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagEnvironment {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOCATIONS = "allocations";
  private JsonNullable<Map<String, Object>> allocations =
      JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_DEFAULT_ALLOCATION_KEY = "default_allocation_key";
  private String defaultAllocationKey;

  public static final String JSON_PROPERTY_DEFAULT_VARIANT_ID = "default_variant_id";
  private JsonNullable<String> defaultVariantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private UUID environmentId;

  public static final String JSON_PROPERTY_ENVIRONMENT_NAME = "environment_name";
  private String environmentName;

  public static final String JSON_PROPERTY_ENVIRONMENT_QUERIES = "environment_queries";
  private List<String> environmentQueries = null;

  public static final String JSON_PROPERTY_IS_PRODUCTION = "is_production";
  private Boolean isProduction;

  public static final String JSON_PROPERTY_OVERRIDE_ALLOCATION_KEY = "override_allocation_key";
  private String overrideAllocationKey;

  public static final String JSON_PROPERTY_OVERRIDE_VARIANT_ID = "override_variant_id";
  private JsonNullable<String> overrideVariantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PENDING_SUGGESTION_ID = "pending_suggestion_id";
  private JsonNullable<String> pendingSuggestionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL =
      "require_feature_flag_approval";
  private Boolean requireFeatureFlagApproval;

  public static final String JSON_PROPERTY_ROLLOUT_PERCENTAGE = "rollout_percentage";
  private Long rolloutPercentage;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<Map<String, Object>> rules = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FeatureFlagStatus status;

  public FeatureFlagEnvironment() {}

  @JsonCreator
  public FeatureFlagEnvironment(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENVIRONMENT_ID) UUID environmentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) FeatureFlagStatus status) {
    this.environmentId = environmentId;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public FeatureFlagEnvironment allocations(Map<String, Object> allocations) {
    this.allocations = JsonNullable.<Map<String, Object>>of(allocations);
    return this;
  }

  public FeatureFlagEnvironment putAllocationsItem(String key, Object allocationsItem) {
    if (this.allocations == null || !this.allocations.isPresent()) {
      this.allocations = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.allocations.get().put(key, allocationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Allocation metadata for this environment.
   *
   * @return allocations
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getAllocations() {
    return allocations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getAllocations_JsonNullable() {
    return allocations;
  }

  @JsonProperty(JSON_PROPERTY_ALLOCATIONS)
  public void setAllocations_JsonNullable(JsonNullable<Map<String, Object>> allocations) {
    this.allocations = allocations;
  }

  public void setAllocations(Map<String, Object> allocations) {
    this.allocations = JsonNullable.<Map<String, Object>>of(allocations);
  }

  public FeatureFlagEnvironment defaultAllocationKey(String defaultAllocationKey) {
    this.defaultAllocationKey = defaultAllocationKey;
    return this;
  }

  /**
   * The allocation key used for the default variant.
   *
   * @return defaultAllocationKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_ALLOCATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultAllocationKey() {
    return defaultAllocationKey;
  }

  public void setDefaultAllocationKey(String defaultAllocationKey) {
    this.defaultAllocationKey = defaultAllocationKey;
  }

  public FeatureFlagEnvironment defaultVariantId(String defaultVariantId) {
    this.defaultVariantId = JsonNullable.<String>of(defaultVariantId);
    return this;
  }

  /**
   * The ID of the default variant for this environment.
   *
   * @return defaultVariantId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDefaultVariantId() {
    return defaultVariantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDefaultVariantId_JsonNullable() {
    return defaultVariantId;
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VARIANT_ID)
  public void setDefaultVariantId_JsonNullable(JsonNullable<String> defaultVariantId) {
    this.defaultVariantId = defaultVariantId;
  }

  public void setDefaultVariantId(String defaultVariantId) {
    this.defaultVariantId = JsonNullable.<String>of(defaultVariantId);
  }

  public FeatureFlagEnvironment environmentId(UUID environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * The ID of the environment.
   *
   * @return environmentId
   */
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(UUID environmentId) {
    this.environmentId = environmentId;
  }

  public FeatureFlagEnvironment environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  /**
   * The name of the environment.
   *
   * @return environmentName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  public FeatureFlagEnvironment environmentQueries(List<String> environmentQueries) {
    this.environmentQueries = environmentQueries;
    return this;
  }

  public FeatureFlagEnvironment addEnvironmentQueriesItem(String environmentQueriesItem) {
    if (this.environmentQueries == null) {
      this.environmentQueries = new ArrayList<>();
    }
    this.environmentQueries.add(environmentQueriesItem);
    return this;
  }

  /**
   * Queries that target this environment.
   *
   * @return environmentQueries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnvironmentQueries() {
    return environmentQueries;
  }

  public void setEnvironmentQueries(List<String> environmentQueries) {
    this.environmentQueries = environmentQueries;
  }

  public FeatureFlagEnvironment isProduction(Boolean isProduction) {
    this.isProduction = isProduction;
    return this;
  }

  /**
   * Indicates whether the environment is production.
   *
   * @return isProduction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsProduction() {
    return isProduction;
  }

  public void setIsProduction(Boolean isProduction) {
    this.isProduction = isProduction;
  }

  public FeatureFlagEnvironment overrideAllocationKey(String overrideAllocationKey) {
    this.overrideAllocationKey = overrideAllocationKey;
    return this;
  }

  /**
   * The allocation key used for the override variant.
   *
   * @return overrideAllocationKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE_ALLOCATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOverrideAllocationKey() {
    return overrideAllocationKey;
  }

  public void setOverrideAllocationKey(String overrideAllocationKey) {
    this.overrideAllocationKey = overrideAllocationKey;
  }

  public FeatureFlagEnvironment overrideVariantId(String overrideVariantId) {
    this.overrideVariantId = JsonNullable.<String>of(overrideVariantId);
    return this;
  }

  /**
   * The ID of the override variant for this environment.
   *
   * @return overrideVariantId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getOverrideVariantId() {
    return overrideVariantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OVERRIDE_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOverrideVariantId_JsonNullable() {
    return overrideVariantId;
  }

  @JsonProperty(JSON_PROPERTY_OVERRIDE_VARIANT_ID)
  public void setOverrideVariantId_JsonNullable(JsonNullable<String> overrideVariantId) {
    this.overrideVariantId = overrideVariantId;
  }

  public void setOverrideVariantId(String overrideVariantId) {
    this.overrideVariantId = JsonNullable.<String>of(overrideVariantId);
  }

  public FeatureFlagEnvironment pendingSuggestionId(String pendingSuggestionId) {
    this.pendingSuggestionId = JsonNullable.<String>of(pendingSuggestionId);
    return this;
  }

  /**
   * Pending suggestion identifier, if approval is required.
   *
   * @return pendingSuggestionId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPendingSuggestionId() {
    return pendingSuggestionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PENDING_SUGGESTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPendingSuggestionId_JsonNullable() {
    return pendingSuggestionId;
  }

  @JsonProperty(JSON_PROPERTY_PENDING_SUGGESTION_ID)
  public void setPendingSuggestionId_JsonNullable(JsonNullable<String> pendingSuggestionId) {
    this.pendingSuggestionId = pendingSuggestionId;
  }

  public void setPendingSuggestionId(String pendingSuggestionId) {
    this.pendingSuggestionId = JsonNullable.<String>of(pendingSuggestionId);
  }

  public FeatureFlagEnvironment requireFeatureFlagApproval(Boolean requireFeatureFlagApproval) {
    this.requireFeatureFlagApproval = requireFeatureFlagApproval;
    return this;
  }

  /**
   * Indicates whether feature flag changes require approval in this environment.
   *
   * @return requireFeatureFlagApproval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequireFeatureFlagApproval() {
    return requireFeatureFlagApproval;
  }

  public void setRequireFeatureFlagApproval(Boolean requireFeatureFlagApproval) {
    this.requireFeatureFlagApproval = requireFeatureFlagApproval;
  }

  public FeatureFlagEnvironment rolloutPercentage(Long rolloutPercentage) {
    this.rolloutPercentage = rolloutPercentage;
    return this;
  }

  /**
   * Rollout percentage for this environment. minimum: 0 maximum: 100
   *
   * @return rolloutPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLLOUT_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRolloutPercentage() {
    return rolloutPercentage;
  }

  public void setRolloutPercentage(Long rolloutPercentage) {
    this.rolloutPercentage = rolloutPercentage;
  }

  public FeatureFlagEnvironment rules(List<Map<String, Object>> rules) {
    this.rules = rules;
    return this;
  }

  public FeatureFlagEnvironment addRulesItem(Map<String, Object> rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Environment targeting rules for this feature flag.
   *
   * @return rules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getRules() {
    return rules;
  }

  public void setRules(List<Map<String, Object>> rules) {
    this.rules = rules;
  }

  public FeatureFlagEnvironment status(FeatureFlagStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of a feature flag in an environment.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FeatureFlagStatus getStatus() {
    return status;
  }

  public void setStatus(FeatureFlagStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return FeatureFlagEnvironment
   */
  @JsonAnySetter
  public FeatureFlagEnvironment putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagEnvironment object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagEnvironment featureFlagEnvironment = (FeatureFlagEnvironment) o;
    return Objects.equals(this.allocations, featureFlagEnvironment.allocations)
        && Objects.equals(this.defaultAllocationKey, featureFlagEnvironment.defaultAllocationKey)
        && Objects.equals(this.defaultVariantId, featureFlagEnvironment.defaultVariantId)
        && Objects.equals(this.environmentId, featureFlagEnvironment.environmentId)
        && Objects.equals(this.environmentName, featureFlagEnvironment.environmentName)
        && Objects.equals(this.environmentQueries, featureFlagEnvironment.environmentQueries)
        && Objects.equals(this.isProduction, featureFlagEnvironment.isProduction)
        && Objects.equals(this.overrideAllocationKey, featureFlagEnvironment.overrideAllocationKey)
        && Objects.equals(this.overrideVariantId, featureFlagEnvironment.overrideVariantId)
        && Objects.equals(this.pendingSuggestionId, featureFlagEnvironment.pendingSuggestionId)
        && Objects.equals(
            this.requireFeatureFlagApproval, featureFlagEnvironment.requireFeatureFlagApproval)
        && Objects.equals(this.rolloutPercentage, featureFlagEnvironment.rolloutPercentage)
        && Objects.equals(this.rules, featureFlagEnvironment.rules)
        && Objects.equals(this.status, featureFlagEnvironment.status)
        && Objects.equals(this.additionalProperties, featureFlagEnvironment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allocations,
        defaultAllocationKey,
        defaultVariantId,
        environmentId,
        environmentName,
        environmentQueries,
        isProduction,
        overrideAllocationKey,
        overrideVariantId,
        pendingSuggestionId,
        requireFeatureFlagApproval,
        rolloutPercentage,
        rules,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagEnvironment {\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    defaultAllocationKey: ")
        .append(toIndentedString(defaultAllocationKey))
        .append("\n");
    sb.append("    defaultVariantId: ").append(toIndentedString(defaultVariantId)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    environmentQueries: ").append(toIndentedString(environmentQueries)).append("\n");
    sb.append("    isProduction: ").append(toIndentedString(isProduction)).append("\n");
    sb.append("    overrideAllocationKey: ")
        .append(toIndentedString(overrideAllocationKey))
        .append("\n");
    sb.append("    overrideVariantId: ").append(toIndentedString(overrideVariantId)).append("\n");
    sb.append("    pendingSuggestionId: ")
        .append(toIndentedString(pendingSuggestionId))
        .append("\n");
    sb.append("    requireFeatureFlagApproval: ")
        .append(toIndentedString(requireFeatureFlagApproval))
        .append("\n");
    sb.append("    rolloutPercentage: ").append(toIndentedString(rolloutPercentage)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
