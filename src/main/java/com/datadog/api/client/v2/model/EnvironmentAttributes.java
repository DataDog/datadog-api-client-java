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

/** Attributes of an environment. */
@JsonPropertyOrder({
  EnvironmentAttributes.JSON_PROPERTY_CREATED_AT,
  EnvironmentAttributes.JSON_PROPERTY_IS_PRODUCTION,
  EnvironmentAttributes.JSON_PROPERTY_NAME,
  EnvironmentAttributes.JSON_PROPERTY_OBSERVE_FULL_EVALUATION_DATA,
  EnvironmentAttributes.JSON_PROPERTY_QUERIES,
  EnvironmentAttributes.JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL,
  EnvironmentAttributes.JSON_PROPERTY_SUBJECT_AUTHORIZATION_OIDC_PROVIDER_ID,
  EnvironmentAttributes.JSON_PROPERTY_SUBJECT_AUTHORIZATION_STATE,
  EnvironmentAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EnvironmentAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_IS_PRODUCTION = "is_production";
  private Boolean isProduction;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OBSERVE_FULL_EVALUATION_DATA =
      "observe_full_evaluation_data";
  private Boolean observeFullEvaluationData;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<String> queries = null;

  public static final String JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL =
      "require_feature_flag_approval";
  private Boolean requireFeatureFlagApproval;

  public static final String JSON_PROPERTY_SUBJECT_AUTHORIZATION_OIDC_PROVIDER_ID =
      "subject_authorization_oidc_provider_id";
  private JsonNullable<UUID> subjectAuthorizationOidcProviderId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_SUBJECT_AUTHORIZATION_STATE =
      "subject_authorization_state";
  private EnvironmentSubjectAuthorizationState subjectAuthorizationState;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public EnvironmentAttributes() {}

  @JsonCreator
  public EnvironmentAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public EnvironmentAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the environment was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public EnvironmentAttributes isProduction(Boolean isProduction) {
    this.isProduction = isProduction;
    return this;
  }

  /**
   * Indicates whether this is a production environment.
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

  public EnvironmentAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the environment.
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

  public EnvironmentAttributes observeFullEvaluationData(Boolean observeFullEvaluationData) {
    this.observeFullEvaluationData = observeFullEvaluationData;
    return this;
  }

  /**
   * Indicates whether feature flag evaluation events include original targeting identifiers and
   * full evaluation context.
   *
   * @return observeFullEvaluationData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBSERVE_FULL_EVALUATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getObserveFullEvaluationData() {
    return observeFullEvaluationData;
  }

  public void setObserveFullEvaluationData(Boolean observeFullEvaluationData) {
    this.observeFullEvaluationData = observeFullEvaluationData;
  }

  public EnvironmentAttributes queries(List<String> queries) {
    this.queries = queries;
    return this;
  }

  public EnvironmentAttributes addQueriesItem(String queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

  /**
   * List of queries to define the environment scope.
   *
   * @return queries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getQueries() {
    return queries;
  }

  public void setQueries(List<String> queries) {
    this.queries = queries;
  }

  public EnvironmentAttributes requireFeatureFlagApproval(Boolean requireFeatureFlagApproval) {
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

  public EnvironmentAttributes subjectAuthorizationOidcProviderId(
      UUID subjectAuthorizationOidcProviderId) {
    this.subjectAuthorizationOidcProviderId =
        JsonNullable.<UUID>of(subjectAuthorizationOidcProviderId);
    return this;
  }

  /**
   * The associated Custom OIDC provider ID, or <code>null</code> when no provider is associated.
   * Disabled environments may retain a provider association.
   *
   * @return subjectAuthorizationOidcProviderId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getSubjectAuthorizationOidcProviderId() {
    return subjectAuthorizationOidcProviderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_AUTHORIZATION_OIDC_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getSubjectAuthorizationOidcProviderId_JsonNullable() {
    return subjectAuthorizationOidcProviderId;
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_AUTHORIZATION_OIDC_PROVIDER_ID)
  public void setSubjectAuthorizationOidcProviderId_JsonNullable(
      JsonNullable<UUID> subjectAuthorizationOidcProviderId) {
    this.subjectAuthorizationOidcProviderId = subjectAuthorizationOidcProviderId;
  }

  public void setSubjectAuthorizationOidcProviderId(UUID subjectAuthorizationOidcProviderId) {
    this.subjectAuthorizationOidcProviderId =
        JsonNullable.<UUID>of(subjectAuthorizationOidcProviderId);
  }

  public EnvironmentAttributes subjectAuthorizationState(
      EnvironmentSubjectAuthorizationState subjectAuthorizationState) {
    this.subjectAuthorizationState = subjectAuthorizationState;
    this.unparsed |= !subjectAuthorizationState.isValid();
    return this;
  }

  /**
   * Whether assignment requests for this environment require subject authorization. Allowed values
   * are <code>disabled</code> and <code>enabled</code>. Enabling requires a provider ID formatted
   * as a nonzero UUID. If omitted on create, defaults to <code>disabled</code>. If omitted on
   * update, the stored state is preserved. <code>null</code> is not accepted. This setting applies
   * only to the current Datadog site and is not copied to other sites. Before you enable it,
   * configure an eligible Custom OIDC provider in the same organization and site, and verify that
   * the provider's keys are published. Assignment requests fail when the required verification
   * configuration is unavailable.
   *
   * @return subjectAuthorizationState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_AUTHORIZATION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EnvironmentSubjectAuthorizationState getSubjectAuthorizationState() {
    return subjectAuthorizationState;
  }

  public void setSubjectAuthorizationState(
      EnvironmentSubjectAuthorizationState subjectAuthorizationState) {
    if (!subjectAuthorizationState.isValid()) {
      this.unparsed = true;
    }
    this.subjectAuthorizationState = subjectAuthorizationState;
  }

  public EnvironmentAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the environment was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return EnvironmentAttributes
   */
  @JsonAnySetter
  public EnvironmentAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EnvironmentAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentAttributes environmentAttributes = (EnvironmentAttributes) o;
    return Objects.equals(this.createdAt, environmentAttributes.createdAt)
        && Objects.equals(this.isProduction, environmentAttributes.isProduction)
        && Objects.equals(this.name, environmentAttributes.name)
        && Objects.equals(
            this.observeFullEvaluationData, environmentAttributes.observeFullEvaluationData)
        && Objects.equals(this.queries, environmentAttributes.queries)
        && Objects.equals(
            this.requireFeatureFlagApproval, environmentAttributes.requireFeatureFlagApproval)
        && Objects.equals(
            this.subjectAuthorizationOidcProviderId,
            environmentAttributes.subjectAuthorizationOidcProviderId)
        && Objects.equals(
            this.subjectAuthorizationState, environmentAttributes.subjectAuthorizationState)
        && Objects.equals(this.updatedAt, environmentAttributes.updatedAt)
        && Objects.equals(this.additionalProperties, environmentAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        isProduction,
        name,
        observeFullEvaluationData,
        queries,
        requireFeatureFlagApproval,
        subjectAuthorizationOidcProviderId,
        subjectAuthorizationState,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isProduction: ").append(toIndentedString(isProduction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    observeFullEvaluationData: ")
        .append(toIndentedString(observeFullEvaluationData))
        .append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    requireFeatureFlagApproval: ")
        .append(toIndentedString(requireFeatureFlagApproval))
        .append("\n");
    sb.append("    subjectAuthorizationOidcProviderId: ")
        .append(toIndentedString(subjectAuthorizationOidcProviderId))
        .append("\n");
    sb.append("    subjectAuthorizationState: ")
        .append(toIndentedString(subjectAuthorizationState))
        .append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
