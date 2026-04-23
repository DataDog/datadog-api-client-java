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

/** Environment-specific settings for a feature flag in list responses. */
@JsonPropertyOrder({
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_DEFAULT_ALLOCATION_KEY,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_DEFAULT_VARIANT_ID,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_ENVIRONMENT_ID,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_ENVIRONMENT_NAME,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_ENVIRONMENT_QUERIES,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_IS_PRODUCTION,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_OVERRIDE_ALLOCATION_KEY,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_OVERRIDE_VARIANT_ID,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_PENDING_SUGGESTION_ID,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL,
  FeatureFlagEnvironmentListItem.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagEnvironmentListItem {
  @JsonIgnore public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_STATUS = "status";
  private FeatureFlagStatus status;

  public FeatureFlagEnvironmentListItem() {}

  @JsonCreator
  public FeatureFlagEnvironmentListItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENVIRONMENT_ID) UUID environmentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) FeatureFlagStatus status) {
    this.environmentId = environmentId;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public FeatureFlagEnvironmentListItem defaultAllocationKey(String defaultAllocationKey) {
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

  public FeatureFlagEnvironmentListItem defaultVariantId(String defaultVariantId) {
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

  public FeatureFlagEnvironmentListItem environmentId(UUID environmentId) {
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

  public FeatureFlagEnvironmentListItem environmentName(String environmentName) {
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

  public FeatureFlagEnvironmentListItem environmentQueries(List<String> environmentQueries) {
    this.environmentQueries = environmentQueries;
    return this;
  }

  public FeatureFlagEnvironmentListItem addEnvironmentQueriesItem(String environmentQueriesItem) {
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

  public FeatureFlagEnvironmentListItem isProduction(Boolean isProduction) {
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

  public FeatureFlagEnvironmentListItem overrideAllocationKey(String overrideAllocationKey) {
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

  public FeatureFlagEnvironmentListItem overrideVariantId(String overrideVariantId) {
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

  public FeatureFlagEnvironmentListItem pendingSuggestionId(String pendingSuggestionId) {
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

  public FeatureFlagEnvironmentListItem requireFeatureFlagApproval(
      Boolean requireFeatureFlagApproval) {
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

  public FeatureFlagEnvironmentListItem status(FeatureFlagStatus status) {
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
   * @return FeatureFlagEnvironmentListItem
   */
  @JsonAnySetter
  public FeatureFlagEnvironmentListItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagEnvironmentListItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagEnvironmentListItem featureFlagEnvironmentListItem =
        (FeatureFlagEnvironmentListItem) o;
    return Objects.equals(
            this.defaultAllocationKey, featureFlagEnvironmentListItem.defaultAllocationKey)
        && Objects.equals(this.defaultVariantId, featureFlagEnvironmentListItem.defaultVariantId)
        && Objects.equals(this.environmentId, featureFlagEnvironmentListItem.environmentId)
        && Objects.equals(this.environmentName, featureFlagEnvironmentListItem.environmentName)
        && Objects.equals(
            this.environmentQueries, featureFlagEnvironmentListItem.environmentQueries)
        && Objects.equals(this.isProduction, featureFlagEnvironmentListItem.isProduction)
        && Objects.equals(
            this.overrideAllocationKey, featureFlagEnvironmentListItem.overrideAllocationKey)
        && Objects.equals(this.overrideVariantId, featureFlagEnvironmentListItem.overrideVariantId)
        && Objects.equals(
            this.pendingSuggestionId, featureFlagEnvironmentListItem.pendingSuggestionId)
        && Objects.equals(
            this.requireFeatureFlagApproval,
            featureFlagEnvironmentListItem.requireFeatureFlagApproval)
        && Objects.equals(this.status, featureFlagEnvironmentListItem.status)
        && Objects.equals(
            this.additionalProperties, featureFlagEnvironmentListItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
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
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagEnvironmentListItem {\n");
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
