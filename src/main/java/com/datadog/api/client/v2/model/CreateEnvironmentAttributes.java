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

/** Attributes for creating a new environment. */
@JsonPropertyOrder({
  CreateEnvironmentAttributes.JSON_PROPERTY_IS_PRODUCTION,
  CreateEnvironmentAttributes.JSON_PROPERTY_NAME,
  CreateEnvironmentAttributes.JSON_PROPERTY_OBSERVE_FULL_EVALUATION_DATA,
  CreateEnvironmentAttributes.JSON_PROPERTY_QUERIES,
  CreateEnvironmentAttributes.JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL,
  CreateEnvironmentAttributes.JSON_PROPERTY_SUBJECT_AUTHORIZATION_OIDC_PROVIDER_ID,
  CreateEnvironmentAttributes.JSON_PROPERTY_SUBJECT_AUTHORIZATION_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateEnvironmentAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_PRODUCTION = "is_production";
  private Boolean isProduction = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OBSERVE_FULL_EVALUATION_DATA =
      "observe_full_evaluation_data";
  private Boolean observeFullEvaluationData;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<String> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL =
      "require_feature_flag_approval";
  private Boolean requireFeatureFlagApproval = false;

  public static final String JSON_PROPERTY_SUBJECT_AUTHORIZATION_OIDC_PROVIDER_ID =
      "subject_authorization_oidc_provider_id";
  private JsonNullable<UUID> subjectAuthorizationOidcProviderId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_SUBJECT_AUTHORIZATION_STATE =
      "subject_authorization_state";
  private EnvironmentSubjectAuthorizationState subjectAuthorizationState;

  public CreateEnvironmentAttributes() {}

  @JsonCreator
  public CreateEnvironmentAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES) List<String> queries) {
    this.name = name;
    this.queries = queries;
  }

  public CreateEnvironmentAttributes isProduction(Boolean isProduction) {
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

  public CreateEnvironmentAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the environment. Required on every request and unique within the organization. Must
   * contain 1 to 200 ASCII characters, start with a letter or digit, and contain only letters,
   * digits, spaces, underscores, hyphens, and periods.
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

  public CreateEnvironmentAttributes observeFullEvaluationData(Boolean observeFullEvaluationData) {
    this.observeFullEvaluationData = observeFullEvaluationData;
    return this;
  }

  /**
   * Controls whether feature flag evaluation events may include original targeting identifiers and
   * full evaluation context. When true, SDKs may include this data. When false, SDKs hash targeting
   * identifiers and omit evaluation context. If omitted, defaults to false.
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

  public CreateEnvironmentAttributes queries(List<String> queries) {
    this.queries = queries;
    return this;
  }

  public CreateEnvironmentAttributes addQueriesItem(String queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

  /**
   * Required list of at least one exact DD_ENV value associated with this environment. Values
   * cannot be used by another environment in the same organization. Wildcards and search
   * expressions are not supported.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getQueries() {
    return queries;
  }

  public void setQueries(List<String> queries) {
    this.queries = queries;
  }

  public CreateEnvironmentAttributes requireFeatureFlagApproval(
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

  public CreateEnvironmentAttributes subjectAuthorizationOidcProviderId(
      UUID subjectAuthorizationOidcProviderId) {
    this.subjectAuthorizationOidcProviderId =
        JsonNullable.<UUID>of(subjectAuthorizationOidcProviderId);
    return this;
  }

  /**
   * The ID of a Custom OIDC provider, formatted as a nonzero UUID. Required when <code>
   * subject_authorization_state</code> is <code>enabled</code>. If omitted or <code>null</code>, no
   * provider is associated. A non-null ID must be registered in the current organization and site,
   * even when subject authorization is disabled. An unregistered ID returns <code>400 Bad Request
   * </code>, and an unavailable registry returns <code>503 Service Unavailable</code>. Saving does
   * not verify provider eligibility or key publication.
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

  public CreateEnvironmentAttributes subjectAuthorizationState(
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
   * @return CreateEnvironmentAttributes
   */
  @JsonAnySetter
  public CreateEnvironmentAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateEnvironmentAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEnvironmentAttributes createEnvironmentAttributes = (CreateEnvironmentAttributes) o;
    return Objects.equals(this.isProduction, createEnvironmentAttributes.isProduction)
        && Objects.equals(this.name, createEnvironmentAttributes.name)
        && Objects.equals(
            this.observeFullEvaluationData, createEnvironmentAttributes.observeFullEvaluationData)
        && Objects.equals(this.queries, createEnvironmentAttributes.queries)
        && Objects.equals(
            this.requireFeatureFlagApproval, createEnvironmentAttributes.requireFeatureFlagApproval)
        && Objects.equals(
            this.subjectAuthorizationOidcProviderId,
            createEnvironmentAttributes.subjectAuthorizationOidcProviderId)
        && Objects.equals(
            this.subjectAuthorizationState, createEnvironmentAttributes.subjectAuthorizationState)
        && Objects.equals(
            this.additionalProperties, createEnvironmentAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        isProduction,
        name,
        observeFullEvaluationData,
        queries,
        requireFeatureFlagApproval,
        subjectAuthorizationOidcProviderId,
        subjectAuthorizationState,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEnvironmentAttributes {\n");
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
