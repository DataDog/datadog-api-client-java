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

/** The supported attributes for updating a status page. */
@JsonPropertyOrder({
  PatchStatusPageRequestDataAttributes.JSON_PROPERTY_COMPANY_LOGO,
  PatchStatusPageRequestDataAttributes.JSON_PROPERTY_DOMAIN_PREFIX,
  PatchStatusPageRequestDataAttributes.JSON_PROPERTY_EMAIL_HEADER_IMAGE,
  PatchStatusPageRequestDataAttributes.JSON_PROPERTY_ENABLED,
  PatchStatusPageRequestDataAttributes.JSON_PROPERTY_FAVICON,
  PatchStatusPageRequestDataAttributes.JSON_PROPERTY_NAME,
  PatchStatusPageRequestDataAttributes.JSON_PROPERTY_SUBSCRIPTIONS_ENABLED,
  PatchStatusPageRequestDataAttributes.JSON_PROPERTY_TYPE,
  PatchStatusPageRequestDataAttributes.JSON_PROPERTY_VISUALIZATION_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchStatusPageRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPANY_LOGO = "company_logo";
  private String companyLogo;

  public static final String JSON_PROPERTY_DOMAIN_PREFIX = "domain_prefix";
  private String domainPrefix;

  public static final String JSON_PROPERTY_EMAIL_HEADER_IMAGE = "email_header_image";
  private String emailHeaderImage;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FAVICON = "favicon";
  private String favicon;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBSCRIPTIONS_ENABLED = "subscriptions_enabled";
  private Boolean subscriptionsEnabled;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CreateStatusPageRequestDataAttributesType type;

  public static final String JSON_PROPERTY_VISUALIZATION_TYPE = "visualization_type";
  private CreateStatusPageRequestDataAttributesVisualizationType visualizationType;

  public PatchStatusPageRequestDataAttributes companyLogo(String companyLogo) {
    this.companyLogo = companyLogo;
    return this;
  }

  /**
   * The base64-encoded image data displayed on the status page.
   *
   * @return companyLogo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompanyLogo() {
    return companyLogo;
  }

  public void setCompanyLogo(String companyLogo) {
    this.companyLogo = companyLogo;
  }

  public PatchStatusPageRequestDataAttributes domainPrefix(String domainPrefix) {
    this.domainPrefix = domainPrefix;
    return this;
  }

  /**
   * The subdomain of the status page's url taking the form <code>
   * https://{domain_prefix}.statuspage.datadoghq.com</code>. Globally unique across Datadog Status
   * Pages.
   *
   * @return domainPrefix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomainPrefix() {
    return domainPrefix;
  }

  public void setDomainPrefix(String domainPrefix) {
    this.domainPrefix = domainPrefix;
  }

  public PatchStatusPageRequestDataAttributes emailHeaderImage(String emailHeaderImage) {
    this.emailHeaderImage = emailHeaderImage;
    return this;
  }

  /**
   * The base64-encoded image data displayed in email notifications sent to status page subscribers.
   *
   * @return emailHeaderImage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_HEADER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmailHeaderImage() {
    return emailHeaderImage;
  }

  public void setEmailHeaderImage(String emailHeaderImage) {
    this.emailHeaderImage = emailHeaderImage;
  }

  public PatchStatusPageRequestDataAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the status page is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public PatchStatusPageRequestDataAttributes favicon(String favicon) {
    this.favicon = favicon;
    return this;
  }

  /**
   * The base64-encoded image data displayed in the browser tab.
   *
   * @return favicon
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAVICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFavicon() {
    return favicon;
  }

  public void setFavicon(String favicon) {
    this.favicon = favicon;
  }

  public PatchStatusPageRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the status page.
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

  public PatchStatusPageRequestDataAttributes subscriptionsEnabled(Boolean subscriptionsEnabled) {
    this.subscriptionsEnabled = subscriptionsEnabled;
    return this;
  }

  /**
   * Whether users can subscribe to the status page.
   *
   * @return subscriptionsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSubscriptionsEnabled() {
    return subscriptionsEnabled;
  }

  public void setSubscriptionsEnabled(Boolean subscriptionsEnabled) {
    this.subscriptionsEnabled = subscriptionsEnabled;
  }

  public PatchStatusPageRequestDataAttributes type(CreateStatusPageRequestDataAttributesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the status page controlling how the status page is accessed.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateStatusPageRequestDataAttributesType getType() {
    return type;
  }

  public void setType(CreateStatusPageRequestDataAttributesType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public PatchStatusPageRequestDataAttributes visualizationType(
      CreateStatusPageRequestDataAttributesVisualizationType visualizationType) {
    this.visualizationType = visualizationType;
    this.unparsed |= !visualizationType.isValid();
    return this;
  }

  /**
   * The visualization type of the status page.
   *
   * @return visualizationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISUALIZATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateStatusPageRequestDataAttributesVisualizationType getVisualizationType() {
    return visualizationType;
  }

  public void setVisualizationType(
      CreateStatusPageRequestDataAttributesVisualizationType visualizationType) {
    if (!visualizationType.isValid()) {
      this.unparsed = true;
    }
    this.visualizationType = visualizationType;
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
   * @return PatchStatusPageRequestDataAttributes
   */
  @JsonAnySetter
  public PatchStatusPageRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PatchStatusPageRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchStatusPageRequestDataAttributes patchStatusPageRequestDataAttributes =
        (PatchStatusPageRequestDataAttributes) o;
    return Objects.equals(this.companyLogo, patchStatusPageRequestDataAttributes.companyLogo)
        && Objects.equals(this.domainPrefix, patchStatusPageRequestDataAttributes.domainPrefix)
        && Objects.equals(
            this.emailHeaderImage, patchStatusPageRequestDataAttributes.emailHeaderImage)
        && Objects.equals(this.enabled, patchStatusPageRequestDataAttributes.enabled)
        && Objects.equals(this.favicon, patchStatusPageRequestDataAttributes.favicon)
        && Objects.equals(this.name, patchStatusPageRequestDataAttributes.name)
        && Objects.equals(
            this.subscriptionsEnabled, patchStatusPageRequestDataAttributes.subscriptionsEnabled)
        && Objects.equals(this.type, patchStatusPageRequestDataAttributes.type)
        && Objects.equals(
            this.visualizationType, patchStatusPageRequestDataAttributes.visualizationType)
        && Objects.equals(
            this.additionalProperties, patchStatusPageRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        companyLogo,
        domainPrefix,
        emailHeaderImage,
        enabled,
        favicon,
        name,
        subscriptionsEnabled,
        type,
        visualizationType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchStatusPageRequestDataAttributes {\n");
    sb.append("    companyLogo: ").append(toIndentedString(companyLogo)).append("\n");
    sb.append("    domainPrefix: ").append(toIndentedString(domainPrefix)).append("\n");
    sb.append("    emailHeaderImage: ").append(toIndentedString(emailHeaderImage)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    favicon: ").append(toIndentedString(favicon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscriptionsEnabled: ")
        .append(toIndentedString(subscriptionsEnabled))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visualizationType: ").append(toIndentedString(visualizationType)).append("\n");
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
