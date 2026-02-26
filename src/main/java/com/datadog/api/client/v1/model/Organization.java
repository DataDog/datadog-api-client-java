/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Create, edit, and manage organizations. */
@JsonPropertyOrder({
  Organization.JSON_PROPERTY_BILLING,
  Organization.JSON_PROPERTY_CREATED,
  Organization.JSON_PROPERTY_DESCRIPTION,
  Organization.JSON_PROPERTY_NAME,
  Organization.JSON_PROPERTY_PUBLIC_ID,
  Organization.JSON_PROPERTY_SETTINGS,
  Organization.JSON_PROPERTY_SUBSCRIPTION,
  Organization.JSON_PROPERTY_TRIAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Organization {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BILLING = "billing";
  private OrganizationBilling billing;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private OrganizationSettings settings;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private OrganizationSubscription subscription;

  public static final String JSON_PROPERTY_TRIAL = "trial";
  private Boolean trial;

  public Organization billing(OrganizationBilling billing) {
    this.billing = billing;
    this.unparsed |= billing.unparsed;
    return this;
  }

  /**
   * A JSON array of billing type.
   *
   * @return billing
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrganizationBilling getBilling() {
    return billing;
  }

  @Deprecated
  public void setBilling(OrganizationBilling billing) {
    this.billing = billing;
  }

  /**
   * Date of the organization creation.
   *
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreated() {
    return created;
  }

  public Organization description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the organization.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Organization name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the child organization, limited to 32 characters.
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

  public Organization publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The <code>public_id</code> of the organization you are operating within.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public Organization settings(OrganizationSettings settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * A JSON array of settings.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrganizationSettings getSettings() {
    return settings;
  }

  public void setSettings(OrganizationSettings settings) {
    this.settings = settings;
  }

  public Organization subscription(OrganizationSubscription subscription) {
    this.subscription = subscription;
    this.unparsed |= subscription.unparsed;
    return this;
  }

  /**
   * Subscription definition.
   *
   * @return subscription
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrganizationSubscription getSubscription() {
    return subscription;
  }

  @Deprecated
  public void setSubscription(OrganizationSubscription subscription) {
    this.subscription = subscription;
  }

  public Organization trial(Boolean trial) {
    this.trial = trial;
    return this;
  }

  /**
   * Only available for MSP customers. Allows child organizations to be created on a trial plan.
   *
   * @return trial
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTrial() {
    return trial;
  }

  public void setTrial(Boolean trial) {
    this.trial = trial;
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
   * @return Organization
   */
  @JsonAnySetter
  public Organization putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Organization object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.billing, organization.billing)
        && Objects.equals(this.created, organization.created)
        && Objects.equals(this.description, organization.description)
        && Objects.equals(this.name, organization.name)
        && Objects.equals(this.publicId, organization.publicId)
        && Objects.equals(this.settings, organization.settings)
        && Objects.equals(this.subscription, organization.subscription)
        && Objects.equals(this.trial, organization.trial)
        && Objects.equals(this.additionalProperties, organization.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        billing,
        created,
        description,
        name,
        publicId,
        settings,
        subscription,
        trial,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    trial: ").append(toIndentedString(trial)).append("\n");
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
