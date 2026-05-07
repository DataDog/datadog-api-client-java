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

/** Metadata about the organization that sent the email. */
@JsonPropertyOrder({
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_BILLING_COUNTRY,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_BILLING_PLAN,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_CUSTOMER_TIER,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_DOMAIN,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_INDUSTRY,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_IS_BUGBOUNTY,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_IS_MSP,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_NAME,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_ORG_UUID,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_PARENT_ORG_ID,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_PREMIUM_SUPPORT,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_ROOT_ORG_ID,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_ROOT_ORG_NAME,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_SHIPPING_COUNTRY,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_WEBSITE,
  TransportWebhookLogOrgMetadata.JSON_PROPERTY_WHEN_CREATED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TransportWebhookLogOrgMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BILLING_COUNTRY = "billing_country";
  private String billingCountry;

  public static final String JSON_PROPERTY_BILLING_PLAN = "billing_plan";
  private String billingPlan;

  public static final String JSON_PROPERTY_CUSTOMER_TIER = "customer_tier";
  private String customerTier;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private String industry;

  public static final String JSON_PROPERTY_IS_BUGBOUNTY = "is_bugbounty";
  private String isBugbounty;

  public static final String JSON_PROPERTY_IS_MSP = "is_msp";
  private String isMsp;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_UUID = "org_uuid";
  private String orgUuid;

  public static final String JSON_PROPERTY_PARENT_ORG_ID = "parent_org_id";
  private String parentOrgId;

  public static final String JSON_PROPERTY_PREMIUM_SUPPORT = "premium_support";
  private String premiumSupport;

  public static final String JSON_PROPERTY_ROOT_ORG_ID = "root_org_id";
  private String rootOrgId;

  public static final String JSON_PROPERTY_ROOT_ORG_NAME = "root_org_name";
  private String rootOrgName;

  public static final String JSON_PROPERTY_SHIPPING_COUNTRY = "shipping_country";
  private String shippingCountry;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public static final String JSON_PROPERTY_WHEN_CREATED = "when_created";
  private String whenCreated;

  public TransportWebhookLogOrgMetadata billingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
    return this;
  }

  /**
   * Country code or name used for billing purposes.
   *
   * @return billingCountry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingCountry() {
    return billingCountry;
  }

  public void setBillingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
  }

  public TransportWebhookLogOrgMetadata billingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
    return this;
  }

  /**
   * The Datadog billing plan for the organization (for example, "pro", "enterprise").
   *
   * @return billingPlan
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingPlan() {
    return billingPlan;
  }

  public void setBillingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
  }

  public TransportWebhookLogOrgMetadata customerTier(String customerTier) {
    this.customerTier = customerTier;
    return this;
  }

  /**
   * Support or account tier assigned to the organization (for example, "tier-1").
   *
   * @return customerTier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerTier() {
    return customerTier;
  }

  public void setCustomerTier(String customerTier) {
    this.customerTier = customerTier;
  }

  public TransportWebhookLogOrgMetadata domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Primary email domain associated with the organization (for example, "example.com").
   *
   * @return domain
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public TransportWebhookLogOrgMetadata industry(String industry) {
    this.industry = industry;
    return this;
  }

  /**
   * Industry classification of the organization (for example, "technology", "finance").
   *
   * @return industry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public TransportWebhookLogOrgMetadata isBugbounty(String isBugbounty) {
    this.isBugbounty = isBugbounty;
    return this;
  }

  /**
   * Whether the organization is enrolled in the Datadog bug bounty program.
   *
   * @return isBugbounty
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BUGBOUNTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIsBugbounty() {
    return isBugbounty;
  }

  public void setIsBugbounty(String isBugbounty) {
    this.isBugbounty = isBugbounty;
  }

  public TransportWebhookLogOrgMetadata isMsp(String isMsp) {
    this.isMsp = isMsp;
    return this;
  }

  /**
   * Whether the organization operates as a Managed Service Provider managing child orgs.
   *
   * @return isMsp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MSP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIsMsp() {
    return isMsp;
  }

  public void setIsMsp(String isMsp) {
    this.isMsp = isMsp;
  }

  public TransportWebhookLogOrgMetadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the organization as configured in Datadog account settings.
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

  public TransportWebhookLogOrgMetadata orgUuid(String orgUuid) {
    this.orgUuid = orgUuid;
    return this;
  }

  /**
   * Globally unique identifier for the Datadog organization (UUID v1 format).
   *
   * @return orgUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgUuid() {
    return orgUuid;
  }

  public void setOrgUuid(String orgUuid) {
    this.orgUuid = orgUuid;
  }

  public TransportWebhookLogOrgMetadata parentOrgId(String parentOrgId) {
    this.parentOrgId = parentOrgId;
    return this;
  }

  /**
   * Identifier of the immediate parent organization, if this is a child org.
   *
   * @return parentOrgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getParentOrgId() {
    return parentOrgId;
  }

  public void setParentOrgId(String parentOrgId) {
    this.parentOrgId = parentOrgId;
  }

  public TransportWebhookLogOrgMetadata premiumSupport(String premiumSupport) {
    this.premiumSupport = premiumSupport;
    return this;
  }

  /**
   * Whether the organization has a premium support plan with Datadog.
   *
   * @return premiumSupport
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREMIUM_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPremiumSupport() {
    return premiumSupport;
  }

  public void setPremiumSupport(String premiumSupport) {
    this.premiumSupport = premiumSupport;
  }

  public TransportWebhookLogOrgMetadata rootOrgId(String rootOrgId) {
    this.rootOrgId = rootOrgId;
    return this;
  }

  /**
   * Identifier of the top-level parent organization in a multi-org account hierarchy.
   *
   * @return rootOrgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOT_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRootOrgId() {
    return rootOrgId;
  }

  public void setRootOrgId(String rootOrgId) {
    this.rootOrgId = rootOrgId;
  }

  public TransportWebhookLogOrgMetadata rootOrgName(String rootOrgName) {
    this.rootOrgName = rootOrgName;
    return this;
  }

  /**
   * Display name of the top-level parent organization in a multi-org account hierarchy.
   *
   * @return rootOrgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOT_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRootOrgName() {
    return rootOrgName;
  }

  public void setRootOrgName(String rootOrgName) {
    this.rootOrgName = rootOrgName;
  }

  public TransportWebhookLogOrgMetadata shippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
    return this;
  }

  /**
   * Country code or name used for shipping or regional assignment.
   *
   * @return shippingCountry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShippingCountry() {
    return shippingCountry;
  }

  public void setShippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
  }

  public TransportWebhookLogOrgMetadata website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Website URL provided during organization registration.
   *
   * @return website
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public TransportWebhookLogOrgMetadata whenCreated(String whenCreated) {
    this.whenCreated = whenCreated;
    return this;
  }

  /**
   * ISO 8601 timestamp of when the Datadog organization was created.
   *
   * @return whenCreated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WHEN_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWhenCreated() {
    return whenCreated;
  }

  public void setWhenCreated(String whenCreated) {
    this.whenCreated = whenCreated;
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
   * @return TransportWebhookLogOrgMetadata
   */
  @JsonAnySetter
  public TransportWebhookLogOrgMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TransportWebhookLogOrgMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportWebhookLogOrgMetadata transportWebhookLogOrgMetadata =
        (TransportWebhookLogOrgMetadata) o;
    return Objects.equals(this.billingCountry, transportWebhookLogOrgMetadata.billingCountry)
        && Objects.equals(this.billingPlan, transportWebhookLogOrgMetadata.billingPlan)
        && Objects.equals(this.customerTier, transportWebhookLogOrgMetadata.customerTier)
        && Objects.equals(this.domain, transportWebhookLogOrgMetadata.domain)
        && Objects.equals(this.industry, transportWebhookLogOrgMetadata.industry)
        && Objects.equals(this.isBugbounty, transportWebhookLogOrgMetadata.isBugbounty)
        && Objects.equals(this.isMsp, transportWebhookLogOrgMetadata.isMsp)
        && Objects.equals(this.name, transportWebhookLogOrgMetadata.name)
        && Objects.equals(this.orgUuid, transportWebhookLogOrgMetadata.orgUuid)
        && Objects.equals(this.parentOrgId, transportWebhookLogOrgMetadata.parentOrgId)
        && Objects.equals(this.premiumSupport, transportWebhookLogOrgMetadata.premiumSupport)
        && Objects.equals(this.rootOrgId, transportWebhookLogOrgMetadata.rootOrgId)
        && Objects.equals(this.rootOrgName, transportWebhookLogOrgMetadata.rootOrgName)
        && Objects.equals(this.shippingCountry, transportWebhookLogOrgMetadata.shippingCountry)
        && Objects.equals(this.website, transportWebhookLogOrgMetadata.website)
        && Objects.equals(this.whenCreated, transportWebhookLogOrgMetadata.whenCreated)
        && Objects.equals(
            this.additionalProperties, transportWebhookLogOrgMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        billingCountry,
        billingPlan,
        customerTier,
        domain,
        industry,
        isBugbounty,
        isMsp,
        name,
        orgUuid,
        parentOrgId,
        premiumSupport,
        rootOrgId,
        rootOrgName,
        shippingCountry,
        website,
        whenCreated,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportWebhookLogOrgMetadata {\n");
    sb.append("    billingCountry: ").append(toIndentedString(billingCountry)).append("\n");
    sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    sb.append("    customerTier: ").append(toIndentedString(customerTier)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    isBugbounty: ").append(toIndentedString(isBugbounty)).append("\n");
    sb.append("    isMsp: ").append(toIndentedString(isMsp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgUuid: ").append(toIndentedString(orgUuid)).append("\n");
    sb.append("    parentOrgId: ").append(toIndentedString(parentOrgId)).append("\n");
    sb.append("    premiumSupport: ").append(toIndentedString(premiumSupport)).append("\n");
    sb.append("    rootOrgId: ").append(toIndentedString(rootOrgId)).append("\n");
    sb.append("    rootOrgName: ").append(toIndentedString(rootOrgName)).append("\n");
    sb.append("    shippingCountry: ").append(toIndentedString(shippingCountry)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    whenCreated: ").append(toIndentedString(whenCreated)).append("\n");
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
