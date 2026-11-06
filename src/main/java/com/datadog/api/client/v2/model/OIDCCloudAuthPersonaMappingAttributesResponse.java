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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Stored Custom OIDC persona mapping attributes. */
@JsonPropertyOrder({
  OIDCCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_ACCOUNT_IDENTIFIER,
  OIDCCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_ACCOUNT_UUID,
  OIDCCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_CLAIM_MATCHERS,
  OIDCCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_CREATED_AT,
  OIDCCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_CREATED_BY,
  OIDCCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_IDENTITY_PATTERN,
  OIDCCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_PROVIDER_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OIDCCloudAuthPersonaMappingAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_IDENTIFIER = "account_identifier";
  private String accountIdentifier;

  public static final String JSON_PROPERTY_ACCOUNT_UUID = "account_uuid";
  private String accountUuid;

  public static final String JSON_PROPERTY_CLAIM_MATCHERS = "claim_matchers";
  private List<OIDCCloudAuthClaimMatcher> claimMatchers = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private UUID createdBy;

  public static final String JSON_PROPERTY_IDENTITY_PATTERN = "identity_pattern";
  private String identityPattern;

  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private UUID providerId;

  /**
   * Handle resolved when the mapping was created; not updated if the account handle changes.
   *
   * @return accountIdentifier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public OIDCCloudAuthPersonaMappingAttributesResponse accountUuid(String accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * UUID of the Datadog user or service account to authenticate as.
   *
   * @return accountUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(String accountUuid) {
    this.accountUuid = accountUuid;
  }

  public OIDCCloudAuthPersonaMappingAttributesResponse claimMatchers(
      List<OIDCCloudAuthClaimMatcher> claimMatchers) {
    this.claimMatchers = claimMatchers;
    if (claimMatchers != null) {
      for (OIDCCloudAuthClaimMatcher item : claimMatchers) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public OIDCCloudAuthPersonaMappingAttributesResponse addClaimMatchersItem(
      OIDCCloudAuthClaimMatcher claimMatchersItem) {
    if (this.claimMatchers == null) {
      this.claimMatchers = new ArrayList<>();
    }
    this.claimMatchers.add(claimMatchersItem);
    this.unparsed |= claimMatchersItem.unparsed;
    return this;
  }

  /**
   * Every claim condition must match. Supply claim_matchers or identity_pattern, but not both.
   *
   * @return claimMatchers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLAIM_MATCHERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OIDCCloudAuthClaimMatcher> getClaimMatchers() {
    return claimMatchers;
  }

  public void setClaimMatchers(List<OIDCCloudAuthClaimMatcher> claimMatchers) {
    this.claimMatchers = claimMatchers;
    if (claimMatchers != null) {
      for (OIDCCloudAuthClaimMatcher item : claimMatchers) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /**
   * Time the configuration was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * UUID of the user who created the configuration.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getCreatedBy() {
    return createdBy;
  }

  public OIDCCloudAuthPersonaMappingAttributesResponse identityPattern(String identityPattern) {
    this.identityPattern = identityPattern;
    return this;
  }

  /**
   * Legacy glob pattern matched against the provider identity claim. Supply this or claim_matchers,
   * but not both. Prefer claim_matchers with exact mode for a single Kubernetes service account.
   *
   * @return identityPattern
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTITY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIdentityPattern() {
    return identityPattern;
  }

  public void setIdentityPattern(String identityPattern) {
    this.identityPattern = identityPattern;
  }

  public OIDCCloudAuthPersonaMappingAttributesResponse providerId(UUID providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * UUID of the registered Custom OIDC provider.
   *
   * @return providerId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getProviderId() {
    return providerId;
  }

  public void setProviderId(UUID providerId) {
    this.providerId = providerId;
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
   * @return OIDCCloudAuthPersonaMappingAttributesResponse
   */
  @JsonAnySetter
  public OIDCCloudAuthPersonaMappingAttributesResponse putAdditionalProperty(
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

  /** Return true if this OIDCCloudAuthPersonaMappingAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCCloudAuthPersonaMappingAttributesResponse oidcCloudAuthPersonaMappingAttributesResponse =
        (OIDCCloudAuthPersonaMappingAttributesResponse) o;
    return Objects.equals(
            this.accountIdentifier, oidcCloudAuthPersonaMappingAttributesResponse.accountIdentifier)
        && Objects.equals(
            this.accountUuid, oidcCloudAuthPersonaMappingAttributesResponse.accountUuid)
        && Objects.equals(
            this.claimMatchers, oidcCloudAuthPersonaMappingAttributesResponse.claimMatchers)
        && Objects.equals(this.createdAt, oidcCloudAuthPersonaMappingAttributesResponse.createdAt)
        && Objects.equals(this.createdBy, oidcCloudAuthPersonaMappingAttributesResponse.createdBy)
        && Objects.equals(
            this.identityPattern, oidcCloudAuthPersonaMappingAttributesResponse.identityPattern)
        && Objects.equals(this.providerId, oidcCloudAuthPersonaMappingAttributesResponse.providerId)
        && Objects.equals(
            this.additionalProperties,
            oidcCloudAuthPersonaMappingAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountIdentifier,
        accountUuid,
        claimMatchers,
        createdAt,
        createdBy,
        identityPattern,
        providerId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCCloudAuthPersonaMappingAttributesResponse {\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    claimMatchers: ").append(toIndentedString(claimMatchers)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    identityPattern: ").append(toIndentedString(identityPattern)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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
