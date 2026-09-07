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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a SAML configuration. */
@JsonPropertyOrder({
  SAMLConfigurationAttributes.JSON_PROPERTY_ASSERTION_CONSUMER_SERVICE,
  SAMLConfigurationAttributes.JSON_PROPERTY_CREATED_AT,
  SAMLConfigurationAttributes.JSON_PROPERTY_ENTITY_ID,
  SAMLConfigurationAttributes.JSON_PROPERTY_EXPIRES_AT,
  SAMLConfigurationAttributes.JSON_PROPERTY_IDP_INITIATED,
  SAMLConfigurationAttributes.JSON_PROPERTY_JIT_DOMAINS,
  SAMLConfigurationAttributes.JSON_PROPERTY_MODIFIED_AT,
  SAMLConfigurationAttributes.JSON_PROPERTY_SSO_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SAMLConfigurationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSERTION_CONSUMER_SERVICE =
      "assertion_consumer_service";
  private List<String> assertionConsumerService = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ENTITY_ID = "entity_id";
  private String entityId;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_IDP_INITIATED = "idp_initiated";
  private Boolean idpInitiated;

  public static final String JSON_PROPERTY_JIT_DOMAINS = "jit_domains";
  private List<String> jitDomains = null;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_SSO_URL = "sso_url";
  private JsonNullable<String> ssoUrl = JsonNullable.<String>undefined();

  public SAMLConfigurationAttributes assertionConsumerService(
      List<String> assertionConsumerService) {
    this.assertionConsumerService = assertionConsumerService;
    return this;
  }

  public SAMLConfigurationAttributes addAssertionConsumerServiceItem(
      String assertionConsumerServiceItem) {
    if (this.assertionConsumerService == null) {
      this.assertionConsumerService = new ArrayList<>();
    }
    this.assertionConsumerService.add(assertionConsumerServiceItem);
    return this;
  }

  /**
   * The assertion consumer service (ACS) URLs that the identity provider posts SAML responses to.
   *
   * @return assertionConsumerService
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSERTION_CONSUMER_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAssertionConsumerService() {
    return assertionConsumerService;
  }

  public void setAssertionConsumerService(List<String> assertionConsumerService) {
    this.assertionConsumerService = assertionConsumerService;
  }

  /**
   * Creation time of the SAML configuration.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public SAMLConfigurationAttributes entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The service provider entity ID Datadog presents to the identity provider.
   *
   * @return entityId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public SAMLConfigurationAttributes expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = JsonNullable.<OffsetDateTime>of(expiresAt);
    return this;
  }

  /**
   * Expiration time of the uploaded identity provider metadata.
   *
   * @return expiresAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getExpiresAt() {
    return expiresAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getExpiresAt_JsonNullable() {
    return expiresAt;
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  public void setExpiresAt_JsonNullable(JsonNullable<OffsetDateTime> expiresAt) {
    this.expiresAt = expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = JsonNullable.<OffsetDateTime>of(expiresAt);
  }

  public SAMLConfigurationAttributes idpInitiated(Boolean idpInitiated) {
    this.idpInitiated = idpInitiated;
    return this;
  }

  /**
   * Whether identity-provider-initiated login is enabled for the organization.
   *
   * @return idpInitiated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDP_INITIATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIdpInitiated() {
    return idpInitiated;
  }

  public void setIdpInitiated(Boolean idpInitiated) {
    this.idpInitiated = idpInitiated;
  }

  public SAMLConfigurationAttributes jitDomains(List<String> jitDomains) {
    this.jitDomains = jitDomains;
    return this;
  }

  public SAMLConfigurationAttributes addJitDomainsItem(String jitDomainsItem) {
    if (this.jitDomains == null) {
      this.jitDomains = new ArrayList<>();
    }
    this.jitDomains.add(jitDomainsItem);
    return this;
  }

  /**
   * Email domains for which users are automatically provisioned on first SAML login (just-in-time
   * provisioning).
   *
   * @return jitDomains
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JIT_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getJitDomains() {
    return jitDomains;
  }

  public void setJitDomains(List<String> jitDomains) {
    this.jitDomains = jitDomains;
  }

  /**
   * Time of the last SAML configuration modification.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public SAMLConfigurationAttributes ssoUrl(String ssoUrl) {
    this.ssoUrl = JsonNullable.<String>of(ssoUrl);
    return this;
  }

  /**
   * The single sign-on URL users can visit to start a SAML login. Returns <code>null</code> when
   * the organization is identity-provider-initiated and has no subdomain.
   *
   * @return ssoUrl
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSsoUrl() {
    return ssoUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SSO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSsoUrl_JsonNullable() {
    return ssoUrl;
  }

  @JsonProperty(JSON_PROPERTY_SSO_URL)
  public void setSsoUrl_JsonNullable(JsonNullable<String> ssoUrl) {
    this.ssoUrl = ssoUrl;
  }

  public void setSsoUrl(String ssoUrl) {
    this.ssoUrl = JsonNullable.<String>of(ssoUrl);
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
   * @return SAMLConfigurationAttributes
   */
  @JsonAnySetter
  public SAMLConfigurationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SAMLConfigurationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAMLConfigurationAttributes samlConfigurationAttributes = (SAMLConfigurationAttributes) o;
    return Objects.equals(
            this.assertionConsumerService, samlConfigurationAttributes.assertionConsumerService)
        && Objects.equals(this.createdAt, samlConfigurationAttributes.createdAt)
        && Objects.equals(this.entityId, samlConfigurationAttributes.entityId)
        && Objects.equals(this.expiresAt, samlConfigurationAttributes.expiresAt)
        && Objects.equals(this.idpInitiated, samlConfigurationAttributes.idpInitiated)
        && Objects.equals(this.jitDomains, samlConfigurationAttributes.jitDomains)
        && Objects.equals(this.modifiedAt, samlConfigurationAttributes.modifiedAt)
        && Objects.equals(this.ssoUrl, samlConfigurationAttributes.ssoUrl)
        && Objects.equals(
            this.additionalProperties, samlConfigurationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assertionConsumerService,
        createdAt,
        entityId,
        expiresAt,
        idpInitiated,
        jitDomains,
        modifiedAt,
        ssoUrl,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLConfigurationAttributes {\n");
    sb.append("    assertionConsumerService: ")
        .append(toIndentedString(assertionConsumerService))
        .append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    idpInitiated: ").append(toIndentedString(idpInitiated)).append("\n");
    sb.append("    jitDomains: ").append(toIndentedString(jitDomains)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    ssoUrl: ").append(toIndentedString(ssoUrl)).append("\n");
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
