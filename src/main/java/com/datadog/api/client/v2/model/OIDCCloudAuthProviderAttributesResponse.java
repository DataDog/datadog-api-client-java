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

/** Stored Custom OIDC provider attributes. */
@JsonPropertyOrder({
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_AUDIENCES,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_CREATED_AT,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_CREATED_BY,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_DISCOVERY_TYPE,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_IDENTITY_CLAIM_NAME,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_ISSUER_URL,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_JWKS_URL,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_ORG_UUID_CLAIM_NAME,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_ORG_UUID_SOURCE,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_PROVIDER_NAME,
  OIDCCloudAuthProviderAttributesResponse.JSON_PROPERTY_REQUIRED_CLAIMS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OIDCCloudAuthProviderAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCES = "audiences";
  private List<String> audiences = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private UUID createdBy;

  public static final String JSON_PROPERTY_DISCOVERY_TYPE = "discovery_type";
  private OIDCCloudAuthDiscoveryType discoveryType;

  public static final String JSON_PROPERTY_IDENTITY_CLAIM_NAME = "identity_claim_name";
  private String identityClaimName = "sub";

  public static final String JSON_PROPERTY_ISSUER_URL = "issuer_url";
  private String issuerUrl;

  public static final String JSON_PROPERTY_JWKS_URL = "jwks_url";
  private String jwksUrl;

  public static final String JSON_PROPERTY_ORG_UUID_CLAIM_NAME = "org_uuid_claim_name";
  private String orgUuidClaimName;

  public static final String JSON_PROPERTY_ORG_UUID_SOURCE = "org_uuid_source";
  private OIDCCloudAuthOrgUUIDSource orgUuidSource = OIDCCloudAuthOrgUUIDSource.DD_ORG_UUID;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "provider_name";
  private String providerName;

  public static final String JSON_PROPERTY_REQUIRED_CLAIMS = "required_claims";
  private List<OIDCCloudAuthClaimMatcher> requiredClaims = null;

  public OIDCCloudAuthProviderAttributesResponse audiences(List<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  public OIDCCloudAuthProviderAttributesResponse addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

  /**
   * Expected token audiences. At least one audience is required. When <code>org_uuid_source</code>
   * is <code>aud</code>, include datadog/{org_uuid} for the organization creating the provider.
   *
   * @return audiences
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
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

  public OIDCCloudAuthProviderAttributesResponse discoveryType(
      OIDCCloudAuthDiscoveryType discoveryType) {
    this.discoveryType = discoveryType;
    this.unparsed |= !discoveryType.isValid();
    return this;
  }

  /**
   * How the signing keys are discovered.
   *
   * @return discoveryType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOVERY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OIDCCloudAuthDiscoveryType getDiscoveryType() {
    return discoveryType;
  }

  public void setDiscoveryType(OIDCCloudAuthDiscoveryType discoveryType) {
    if (!discoveryType.isValid()) {
      this.unparsed = true;
    }
    this.discoveryType = discoveryType;
  }

  public OIDCCloudAuthProviderAttributesResponse identityClaimName(String identityClaimName) {
    this.identityClaimName = identityClaimName;
    return this;
  }

  /**
   * Claim used by legacy identity_pattern mappings and in identity logs.
   *
   * @return identityClaimName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTITY_CLAIM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIdentityClaimName() {
    return identityClaimName;
  }

  public void setIdentityClaimName(String identityClaimName) {
    this.identityClaimName = identityClaimName;
  }

  public OIDCCloudAuthProviderAttributesResponse issuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
    return this;
  }

  /**
   * HTTPS issuer URL that must match the token issuer. For oidc_discovery, signing keys are located
   * through the issuer discovery document.
   *
   * @return issuerUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuerUrl() {
    return issuerUrl;
  }

  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }

  public OIDCCloudAuthProviderAttributesResponse jwksUrl(String jwksUrl) {
    this.jwksUrl = jwksUrl;
    return this;
  }

  /**
   * HTTPS JSON Web Key Set URL. Required when <code>discovery_type</code> is <code>direct_jwks
   * </code>.
   *
   * @return jwksUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JWKS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getJwksUrl() {
    return jwksUrl;
  }

  public void setJwksUrl(String jwksUrl) {
    this.jwksUrl = jwksUrl;
  }

  public OIDCCloudAuthProviderAttributesResponse orgUuidClaimName(String orgUuidClaimName) {
    this.orgUuidClaimName = orgUuidClaimName;
    return this;
  }

  /**
   * Optional name of the token claim containing the Datadog organization UUID.
   *
   * @return orgUuidClaimName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_UUID_CLAIM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgUuidClaimName() {
    return orgUuidClaimName;
  }

  public void setOrgUuidClaimName(String orgUuidClaimName) {
    this.orgUuidClaimName = orgUuidClaimName;
  }

  public OIDCCloudAuthProviderAttributesResponse orgUuidSource(
      OIDCCloudAuthOrgUUIDSource orgUuidSource) {
    this.orgUuidSource = orgUuidSource;
    this.unparsed |= !orgUuidSource.isValid();
    return this;
  }

  /**
   * Source of the organization UUID in the signed token. The <code>aud</code> source accepts a
   * datadog/{org_uuid} audience.
   *
   * @return orgUuidSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_UUID_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OIDCCloudAuthOrgUUIDSource getOrgUuidSource() {
    return orgUuidSource;
  }

  public void setOrgUuidSource(OIDCCloudAuthOrgUUIDSource orgUuidSource) {
    if (!orgUuidSource.isValid()) {
      this.unparsed = true;
    }
    this.orgUuidSource = orgUuidSource;
  }

  public OIDCCloudAuthProviderAttributesResponse providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * Name identifying the provider within the organization.
   *
   * @return providerName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public OIDCCloudAuthProviderAttributesResponse requiredClaims(
      List<OIDCCloudAuthClaimMatcher> requiredClaims) {
    this.requiredClaims = requiredClaims;
    if (requiredClaims != null) {
      for (OIDCCloudAuthClaimMatcher item : requiredClaims) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public OIDCCloudAuthProviderAttributesResponse addRequiredClaimsItem(
      OIDCCloudAuthClaimMatcher requiredClaimsItem) {
    if (this.requiredClaims == null) {
      this.requiredClaims = new ArrayList<>();
    }
    this.requiredClaims.add(requiredClaimsItem);
    this.unparsed |= requiredClaimsItem.unparsed;
    return this;
  }

  /**
   * Claim matchers required for every token from this provider, in addition to the persona mapping
   * matchers. Shared issuers can require an exact tenant claim.
   *
   * @return requiredClaims
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED_CLAIMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OIDCCloudAuthClaimMatcher> getRequiredClaims() {
    return requiredClaims;
  }

  public void setRequiredClaims(List<OIDCCloudAuthClaimMatcher> requiredClaims) {
    this.requiredClaims = requiredClaims;
    if (requiredClaims != null) {
      for (OIDCCloudAuthClaimMatcher item : requiredClaims) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return OIDCCloudAuthProviderAttributesResponse
   */
  @JsonAnySetter
  public OIDCCloudAuthProviderAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OIDCCloudAuthProviderAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCCloudAuthProviderAttributesResponse oidcCloudAuthProviderAttributesResponse =
        (OIDCCloudAuthProviderAttributesResponse) o;
    return Objects.equals(this.audiences, oidcCloudAuthProviderAttributesResponse.audiences)
        && Objects.equals(this.createdAt, oidcCloudAuthProviderAttributesResponse.createdAt)
        && Objects.equals(this.createdBy, oidcCloudAuthProviderAttributesResponse.createdBy)
        && Objects.equals(this.discoveryType, oidcCloudAuthProviderAttributesResponse.discoveryType)
        && Objects.equals(
            this.identityClaimName, oidcCloudAuthProviderAttributesResponse.identityClaimName)
        && Objects.equals(this.issuerUrl, oidcCloudAuthProviderAttributesResponse.issuerUrl)
        && Objects.equals(this.jwksUrl, oidcCloudAuthProviderAttributesResponse.jwksUrl)
        && Objects.equals(
            this.orgUuidClaimName, oidcCloudAuthProviderAttributesResponse.orgUuidClaimName)
        && Objects.equals(this.orgUuidSource, oidcCloudAuthProviderAttributesResponse.orgUuidSource)
        && Objects.equals(this.providerName, oidcCloudAuthProviderAttributesResponse.providerName)
        && Objects.equals(
            this.requiredClaims, oidcCloudAuthProviderAttributesResponse.requiredClaims)
        && Objects.equals(
            this.additionalProperties,
            oidcCloudAuthProviderAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        audiences,
        createdAt,
        createdBy,
        discoveryType,
        identityClaimName,
        issuerUrl,
        jwksUrl,
        orgUuidClaimName,
        orgUuidSource,
        providerName,
        requiredClaims,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCCloudAuthProviderAttributesResponse {\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    discoveryType: ").append(toIndentedString(discoveryType)).append("\n");
    sb.append("    identityClaimName: ").append(toIndentedString(identityClaimName)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    jwksUrl: ").append(toIndentedString(jwksUrl)).append("\n");
    sb.append("    orgUuidClaimName: ").append(toIndentedString(orgUuidClaimName)).append("\n");
    sb.append("    orgUuidSource: ").append(toIndentedString(orgUuidSource)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    requiredClaims: ").append(toIndentedString(requiredClaims)).append("\n");
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
