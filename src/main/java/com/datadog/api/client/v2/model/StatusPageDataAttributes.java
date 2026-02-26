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
  StatusPageDataAttributes.JSON_PROPERTY_COMPANY_LOGO,
  StatusPageDataAttributes.JSON_PROPERTY_COMPONENTS,
  StatusPageDataAttributes.JSON_PROPERTY_CREATED_AT,
  StatusPageDataAttributes.JSON_PROPERTY_CUSTOM_DOMAIN,
  StatusPageDataAttributes.JSON_PROPERTY_CUSTOM_DOMAIN_ENABLED,
  StatusPageDataAttributes.JSON_PROPERTY_DOMAIN_PREFIX,
  StatusPageDataAttributes.JSON_PROPERTY_EMAIL_HEADER_IMAGE,
  StatusPageDataAttributes.JSON_PROPERTY_ENABLED,
  StatusPageDataAttributes.JSON_PROPERTY_FAVICON,
  StatusPageDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  StatusPageDataAttributes.JSON_PROPERTY_NAME,
  StatusPageDataAttributes.JSON_PROPERTY_PAGE_URL,
  StatusPageDataAttributes.JSON_PROPERTY_SUBSCRIPTIONS_ENABLED,
  StatusPageDataAttributes.JSON_PROPERTY_TYPE,
  StatusPageDataAttributes.JSON_PROPERTY_VISUALIZATION_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatusPageDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPANY_LOGO = "company_logo";
  private JsonNullable<String> companyLogo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<StatusPageDataAttributesComponentsItems> components = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CUSTOM_DOMAIN = "custom_domain";
  private JsonNullable<String> customDomain = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOM_DOMAIN_ENABLED = "custom_domain_enabled";
  private Boolean customDomainEnabled;

  public static final String JSON_PROPERTY_DOMAIN_PREFIX = "domain_prefix";
  private String domainPrefix;

  public static final String JSON_PROPERTY_EMAIL_HEADER_IMAGE = "email_header_image";
  private JsonNullable<String> emailHeaderImage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FAVICON = "favicon";
  private JsonNullable<String> favicon = JsonNullable.<String>undefined();

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

  public StatusPageDataAttributes companyLogo(String companyLogo) {
    this.companyLogo = JsonNullable.<String>of(companyLogo);
    return this;
  }

  /**
   * <p>Base64-encoded image data displayed on the status page.</p>
   * @return companyLogo
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getCompanyLogo() {
        return companyLogo.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_COMPANY_LOGO)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCompanyLogo_JsonNullable() {
    return companyLogo;
  }
  @JsonProperty(JSON_PROPERTY_COMPANY_LOGO)public void setCompanyLogo_JsonNullable(JsonNullable<String> companyLogo) {
    this.companyLogo = companyLogo;
  }
  public void setCompanyLogo(String companyLogo) {
    this.companyLogo = JsonNullable.<String>of(companyLogo);
  }
  public StatusPageDataAttributes components(List<StatusPageDataAttributesComponentsItems> components) {
    this.components = components;
    for (StatusPageDataAttributesComponentsItems item : components) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public StatusPageDataAttributes addComponentsItem(StatusPageDataAttributesComponentsItems componentsItem) {
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
      public List<StatusPageDataAttributesComponentsItems> getComponents() {
        return components;
      }
  public void setComponents(List<StatusPageDataAttributesComponentsItems> components) {
    this.components = components;
  }
  public StatusPageDataAttributes createdAt(OffsetDateTime createdAt) {
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
  public StatusPageDataAttributes customDomain(String customDomain) {
    this.customDomain = JsonNullable.<String>of(customDomain);
    return this;
  }

  /**
   * <p>If configured, the url that the status page is accessible at.</p>
   * @return customDomain
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getCustomDomain() {
        return customDomain.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CUSTOM_DOMAIN)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCustomDomain_JsonNullable() {
    return customDomain;
  }
  @JsonProperty(JSON_PROPERTY_CUSTOM_DOMAIN)public void setCustomDomain_JsonNullable(JsonNullable<String> customDomain) {
    this.customDomain = customDomain;
  }
  public void setCustomDomain(String customDomain) {
    this.customDomain = JsonNullable.<String>of(customDomain);
  }
  public StatusPageDataAttributes customDomainEnabled(Boolean customDomainEnabled) {
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
  public StatusPageDataAttributes domainPrefix(String domainPrefix) {
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
  public StatusPageDataAttributes emailHeaderImage(String emailHeaderImage) {
    this.emailHeaderImage = JsonNullable.<String>of(emailHeaderImage);
    return this;
  }

  /**
   * <p>Base64-encoded image data included in email notifications sent to status page subscribers.</p>
   * @return emailHeaderImage
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getEmailHeaderImage() {
        return emailHeaderImage.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_EMAIL_HEADER_IMAGE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEmailHeaderImage_JsonNullable() {
    return emailHeaderImage;
  }
  @JsonProperty(JSON_PROPERTY_EMAIL_HEADER_IMAGE)public void setEmailHeaderImage_JsonNullable(JsonNullable<String> emailHeaderImage) {
    this.emailHeaderImage = emailHeaderImage;
  }
  public void setEmailHeaderImage(String emailHeaderImage) {
    this.emailHeaderImage = JsonNullable.<String>of(emailHeaderImage);
  }
  public StatusPageDataAttributes enabled(Boolean enabled) {
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
  public StatusPageDataAttributes favicon(String favicon) {
    this.favicon = JsonNullable.<String>of(favicon);
    return this;
  }

  /**
   * <p>Base64-encoded image data displayed in the browser tab.</p>
   * @return favicon
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getFavicon() {
        return favicon.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_FAVICON)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFavicon_JsonNullable() {
    return favicon;
  }
  @JsonProperty(JSON_PROPERTY_FAVICON)public void setFavicon_JsonNullable(JsonNullable<String> favicon) {
    this.favicon = favicon;
  }
  public void setFavicon(String favicon) {
    this.favicon = JsonNullable.<String>of(favicon);
  }
  public StatusPageDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
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
  public StatusPageDataAttributes name(String name) {
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
  public StatusPageDataAttributes pageUrl(String pageUrl) {
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
  public StatusPageDataAttributes subscriptionsEnabled(Boolean subscriptionsEnabled) {
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
  public StatusPageDataAttributes type(CreateStatusPageRequestDataAttributesType type) {
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
  public StatusPageDataAttributes visualizationType(CreateStatusPageRequestDataAttributesVisualizationType visualizationType) {
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
   * @return StatusPageDataAttributes
   */
  @JsonAnySetter
  public StatusPageDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this StatusPageDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPageDataAttributes statusPageDataAttributes = (StatusPageDataAttributes) o;
    return Objects.equals(this.companyLogo, statusPageDataAttributes.companyLogo) && Objects.equals(this.components, statusPageDataAttributes.components) && Objects.equals(this.createdAt, statusPageDataAttributes.createdAt) && Objects.equals(this.customDomain, statusPageDataAttributes.customDomain) && Objects.equals(this.customDomainEnabled, statusPageDataAttributes.customDomainEnabled) && Objects.equals(this.domainPrefix, statusPageDataAttributes.domainPrefix) && Objects.equals(this.emailHeaderImage, statusPageDataAttributes.emailHeaderImage) && Objects.equals(this.enabled, statusPageDataAttributes.enabled) && Objects.equals(this.favicon, statusPageDataAttributes.favicon) && Objects.equals(this.modifiedAt, statusPageDataAttributes.modifiedAt) && Objects.equals(this.name, statusPageDataAttributes.name) && Objects.equals(this.pageUrl, statusPageDataAttributes.pageUrl) && Objects.equals(this.subscriptionsEnabled, statusPageDataAttributes.subscriptionsEnabled) && Objects.equals(this.type, statusPageDataAttributes.type) && Objects.equals(this.visualizationType, statusPageDataAttributes.visualizationType) && Objects.equals(this.additionalProperties, statusPageDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(companyLogo,components,createdAt,customDomain,customDomainEnabled,domainPrefix,emailHeaderImage,enabled,favicon,modifiedAt,name,pageUrl,subscriptionsEnabled,type,visualizationType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPageDataAttributes {\n");
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
