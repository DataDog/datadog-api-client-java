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

/** Attributes for creating a Custom OIDC persona mapping. */
@JsonPropertyOrder({
  OIDCCloudAuthPersonaMappingCreateAttributes.JSON_PROPERTY_ACCOUNT_UUID,
  OIDCCloudAuthPersonaMappingCreateAttributes.JSON_PROPERTY_CLAIM_MATCHERS,
  OIDCCloudAuthPersonaMappingCreateAttributes.JSON_PROPERTY_IDENTITY_PATTERN,
  OIDCCloudAuthPersonaMappingCreateAttributes.JSON_PROPERTY_PROVIDER_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OIDCCloudAuthPersonaMappingCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_UUID = "account_uuid";
  private String accountUuid;

  public static final String JSON_PROPERTY_CLAIM_MATCHERS = "claim_matchers";
  private List<OIDCCloudAuthClaimMatcherCreate> claimMatchers = null;

  public static final String JSON_PROPERTY_IDENTITY_PATTERN = "identity_pattern";
  private String identityPattern;

  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private UUID providerId;

  public OIDCCloudAuthPersonaMappingCreateAttributes() {}

  @JsonCreator
  public OIDCCloudAuthPersonaMappingCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_UUID) String accountUuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER_ID) UUID providerId) {
    this.accountUuid = accountUuid;
    this.providerId = providerId;
  }

  public OIDCCloudAuthPersonaMappingCreateAttributes accountUuid(String accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * UUID of the Datadog user or service account to authenticate as.
   *
   * @return accountUuid
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(String accountUuid) {
    this.accountUuid = accountUuid;
  }

  public OIDCCloudAuthPersonaMappingCreateAttributes claimMatchers(
      List<OIDCCloudAuthClaimMatcherCreate> claimMatchers) {
    this.claimMatchers = claimMatchers;
    if (claimMatchers != null) {
      for (OIDCCloudAuthClaimMatcherCreate item : claimMatchers) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public OIDCCloudAuthPersonaMappingCreateAttributes addClaimMatchersItem(
      OIDCCloudAuthClaimMatcherCreate claimMatchersItem) {
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
  public List<OIDCCloudAuthClaimMatcherCreate> getClaimMatchers() {
    return claimMatchers;
  }

  public void setClaimMatchers(List<OIDCCloudAuthClaimMatcherCreate> claimMatchers) {
    this.claimMatchers = claimMatchers;
    if (claimMatchers != null) {
      for (OIDCCloudAuthClaimMatcherCreate item : claimMatchers) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public OIDCCloudAuthPersonaMappingCreateAttributes identityPattern(String identityPattern) {
    this.identityPattern = identityPattern;
    return this;
  }

  /**
   * Legacy glob pattern, limited to 500 UTF-8 bytes when creating a mapping, matched against the
   * provider identity claim. Supply this or claim_matchers, but not both. Prefer claim_matchers
   * with exact mode for a single Kubernetes service account.
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

  public OIDCCloudAuthPersonaMappingCreateAttributes providerId(UUID providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * UUID of the registered Custom OIDC provider.
   *
   * @return providerId
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return OIDCCloudAuthPersonaMappingCreateAttributes
   */
  @JsonAnySetter
  public OIDCCloudAuthPersonaMappingCreateAttributes putAdditionalProperty(
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

  /** Return true if this OIDCCloudAuthPersonaMappingCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCCloudAuthPersonaMappingCreateAttributes oidcCloudAuthPersonaMappingCreateAttributes =
        (OIDCCloudAuthPersonaMappingCreateAttributes) o;
    return Objects.equals(this.accountUuid, oidcCloudAuthPersonaMappingCreateAttributes.accountUuid)
        && Objects.equals(
            this.claimMatchers, oidcCloudAuthPersonaMappingCreateAttributes.claimMatchers)
        && Objects.equals(
            this.identityPattern, oidcCloudAuthPersonaMappingCreateAttributes.identityPattern)
        && Objects.equals(this.providerId, oidcCloudAuthPersonaMappingCreateAttributes.providerId)
        && Objects.equals(
            this.additionalProperties,
            oidcCloudAuthPersonaMappingCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountUuid, claimMatchers, identityPattern, providerId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCCloudAuthPersonaMappingCreateAttributes {\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    claimMatchers: ").append(toIndentedString(claimMatchers)).append("\n");
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
