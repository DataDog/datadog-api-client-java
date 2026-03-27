/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The attributes of a status page.</p>
 */
@JsonPropertyOrder({
  StatusPageAsIncludedAttributes.JSON_PROPERTY_COMPANY_LOGO,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_COMPONENTS,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_CREATED_AT,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_CUSTOM_DOMAIN,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_CUSTOM_DOMAIN_ENABLED,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_DOMAIN_PREFIX,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_EMAIL_HEADER_IMAGE,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_ENABLED,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_FAVICON,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_MODIFIED_AT,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_NAME,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_PAGE_URL,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_SUBSCRIPTIONS_ENABLED,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_TYPE,
  StatusPageAsIncludedAttributes.JSON_PROPERTY_VISUALIZATION_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatusPageAsIncludedAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPANY_LOGO = "company_logo";
  private String companyLogo;

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<StatusPageAsIncludedAttributesComponentsItems> components = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CUSTOM_DOMAIN = "custom_domain";
  private String customDomain;

  public static final String JSON_PROPERTY_CUSTOM_DOMAIN_ENABLED = "custom_domain_enabled";
  private Boolean customDomainEnabled;

  public static final String JSON_PROPERTY_DOMAIN_PREFIX = "domain_prefix";
  private String domainPrefix;

  public static final String JSON_PROPERTY_EMAIL_HEADER_IMAGE = "email_header_image";
  private String emailHeaderImage;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FAVICON = "favicon";
  private String favicon;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PAGE_URL = "page_url";
  private String pageUrl;

  public static final String JSON_PROPERTY_SUBSCRIPTIONS_ENABLED = "subscriptions_enabled";
  private Boolean subscriptionsEnabled;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CreateStatusPageRequestDataAttributesType type;

  public static final String JSON_PROPERTY_VISUALIZATION_TYPE = "visualization_type";
  private CreateStatusPageRequestDataAttributesVisualizationType visualizationType;

  public StatusPageAsIncludedAttributes companyLogo(String companyLogo) {
    this.companyLogo = companyLogo;
    return this;
  }

  /**
   * <p>The base64-encoded image data displayed in the company logo.</p>
   * @return companyLogo
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPANY_LOGO)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCompanyLogo() {
        return companyLogo;
      }
  public void setCompanyLogo(String companyLogo) {
    this.companyLogo = companyLogo;
  }
  public StatusPageAsIncludedAttributes components(List<StatusPageAsIncludedAttributesComponentsItems> components) {
    this.components = components;
    for (StatusPageAsIncludedAttributesComponentsItems item : components) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public StatusPageAsIncludedAttributes addComponentsItem(StatusPageAsIncludedAttributesComponentsItems componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    this.unparsed |= componentsItem.unparsed;
    return this;
  }

  /**
   * <p>Components displayed on the status page.</p>
   * @return components
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPONENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<StatusPageAsIncludedAttributesComponentsItems> getComponents() {
        return components;
      }
  public void setComponents(List<StatusPageAsIncludedAttributesComponentsItems> components) {
    this.components = components;
  }
  public StatusPageAsIncludedAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Timestamp of when the status page was created.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public StatusPageAsIncludedAttributes customDomain(String customDomain) {
    this.customDomain = customDomain;
    return this;
  }

  /**
   * <p>If configured, the url that the status page is accessible at.</p>
   * @return customDomain
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_DOMAIN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomDomain() {
        return customDomain;
      }
  public void setCustomDomain(String customDomain) {
    this.customDomain = customDomain;
  }
  public StatusPageAsIncludedAttributes customDomainEnabled(Boolean customDomainEnabled) {
    this.customDomainEnabled = customDomainEnabled;
    return this;
  }

  /**
   * <p>Whether the custom domain is configured.</p>
   * @return customDomainEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_DOMAIN_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getCustomDomainEnabled() {
        return customDomainEnabled;
      }
  public void setCustomDomainEnabled(Boolean customDomainEnabled) {
    this.customDomainEnabled = customDomainEnabled;
  }
  public StatusPageAsIncludedAttributes domainPrefix(String domainPrefix) {
    this.domainPrefix = domainPrefix;
    return this;
  }

  /**
   * <p>The subdomain of the status page's url taking the form <code>https://{domain_prefix}.statuspage.datadoghq.com</code>. Globally unique across Datadog Status Pages.</p>
   * @return domainPrefix
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DOMAIN_PREFIX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDomainPrefix() {
        return domainPrefix;
      }
  public void setDomainPrefix(String domainPrefix) {
    this.domainPrefix = domainPrefix;
  }
  public StatusPageAsIncludedAttributes emailHeaderImage(String emailHeaderImage) {
    this.emailHeaderImage = emailHeaderImage;
    return this;
  }

  /**
   * <p>Base64-encoded image data included in email notifications sent to status page subscribers.</p>
   * @return emailHeaderImage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EMAIL_HEADER_IMAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEmailHeaderImage() {
        return emailHeaderImage;
      }
  public void setEmailHeaderImage(String emailHeaderImage) {
    this.emailHeaderImage = emailHeaderImage;
  }
  public StatusPageAsIncludedAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the status page is enabled.</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public StatusPageAsIncludedAttributes favicon(String favicon) {
    this.favicon = favicon;
    return this;
  }

  /**
   * <p>Base64-encoded image data displayed in the browser tab.</p>
   * @return favicon
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FAVICON)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFavicon() {
        return favicon;
      }
  public void setFavicon(String favicon) {
    this.favicon = favicon;
  }
  public StatusPageAsIncludedAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Timestamp of when the status page was last modified.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public StatusPageAsIncludedAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the status page.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public StatusPageAsIncludedAttributes pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  /**
   * <p>The url that the status page is accessible at.</p>
   * @return pageUrl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPageUrl() {
        return pageUrl;
      }
  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }
  public StatusPageAsIncludedAttributes subscriptionsEnabled(Boolean subscriptionsEnabled) {
    this.subscriptionsEnabled = subscriptionsEnabled;
    return this;
  }

  /**
   * <p>Whether users can subscribe to the status page.</p>
   * @return subscriptionsEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getSubscriptionsEnabled() {
        return subscriptionsEnabled;
      }
  public void setSubscriptionsEnabled(Boolean subscriptionsEnabled) {
    this.subscriptionsEnabled = subscriptionsEnabled;
  }
  public StatusPageAsIncludedAttributes type(CreateStatusPageRequestDataAttributesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of the status page controlling how the status page is accessed.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateStatusPageRequestDataAttributesType getType() {
        return type;
      }
  public void setType(CreateStatusPageRequestDataAttributesType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public StatusPageAsIncludedAttributes visualizationType(CreateStatusPageRequestDataAttributesVisualizationType visualizationType) {
    this.visualizationType = visualizationType;
    this.unparsed |= !visualizationType.isValid();
    return this;
  }

  /**
   * <p>The visualization type of the status page.</p>
   * @return visualizationType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VISUALIZATION_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateStatusPageRequestDataAttributesVisualizationType getVisualizationType() {
        return visualizationType;
      }
  public void setVisualizationType(CreateStatusPageRequestDataAttributesVisualizationType visualizationType) {
    if (!visualizationType.isValid()) {
        this.unparsed = true;
    }
    this.visualizationType = visualizationType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return StatusPageAsIncludedAttributes
   */
  @JsonAnySetter
  public StatusPageAsIncludedAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this StatusPageAsIncludedAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPageAsIncludedAttributes statusPageAsIncludedAttributes = (StatusPageAsIncludedAttributes) o;
    return Objects.equals(this.companyLogo, statusPageAsIncludedAttributes.companyLogo) && Objects.equals(this.components, statusPageAsIncludedAttributes.components) && Objects.equals(this.createdAt, statusPageAsIncludedAttributes.createdAt) && Objects.equals(this.customDomain, statusPageAsIncludedAttributes.customDomain) && Objects.equals(this.customDomainEnabled, statusPageAsIncludedAttributes.customDomainEnabled) && Objects.equals(this.domainPrefix, statusPageAsIncludedAttributes.domainPrefix) && Objects.equals(this.emailHeaderImage, statusPageAsIncludedAttributes.emailHeaderImage) && Objects.equals(this.enabled, statusPageAsIncludedAttributes.enabled) && Objects.equals(this.favicon, statusPageAsIncludedAttributes.favicon) && Objects.equals(this.modifiedAt, statusPageAsIncludedAttributes.modifiedAt) && Objects.equals(this.name, statusPageAsIncludedAttributes.name) && Objects.equals(this.pageUrl, statusPageAsIncludedAttributes.pageUrl) && Objects.equals(this.subscriptionsEnabled, statusPageAsIncludedAttributes.subscriptionsEnabled) && Objects.equals(this.type, statusPageAsIncludedAttributes.type) && Objects.equals(this.visualizationType, statusPageAsIncludedAttributes.visualizationType) && Objects.equals(this.additionalProperties, statusPageAsIncludedAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(companyLogo,components,createdAt,customDomain,customDomainEnabled,domainPrefix,emailHeaderImage,enabled,favicon,modifiedAt,name,pageUrl,subscriptionsEnabled,type,visualizationType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPageAsIncludedAttributes {\n");
    sb.append("    companyLogo: ").append(toIndentedString(companyLogo)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customDomain: ").append(toIndentedString(customDomain)).append("\n");
    sb.append("    customDomainEnabled: ").append(toIndentedString(customDomainEnabled)).append("\n");
    sb.append("    domainPrefix: ").append(toIndentedString(domainPrefix)).append("\n");
    sb.append("    emailHeaderImage: ").append(toIndentedString(emailHeaderImage)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    favicon: ").append(toIndentedString(favicon)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
    sb.append("    subscriptionsEnabled: ").append(toIndentedString(subscriptionsEnabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visualizationType: ").append(toIndentedString(visualizationType)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
