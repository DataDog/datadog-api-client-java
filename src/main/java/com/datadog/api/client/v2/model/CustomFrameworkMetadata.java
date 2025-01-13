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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Response object for an organization's custom frameworks. */
@JsonPropertyOrder({
  CustomFrameworkMetadata.JSON_PROPERTY_CREATED_AT,
  CustomFrameworkMetadata.JSON_PROPERTY_CREATED_BY,
  CustomFrameworkMetadata.JSON_PROPERTY_DESCRIPTION,
  CustomFrameworkMetadata.JSON_PROPERTY_HANDLE,
  CustomFrameworkMetadata.JSON_PROPERTY_ICON_URL,
  CustomFrameworkMetadata.JSON_PROPERTY_ID,
  CustomFrameworkMetadata.JSON_PROPERTY_NAME,
  CustomFrameworkMetadata.JSON_PROPERTY_ORG_ID,
  CustomFrameworkMetadata.JSON_PROPERTY_UPDATED_AT,
  CustomFrameworkMetadata.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomFrameworkMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ICON_URL = "icon_url";
  private String iconUrl;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public CustomFrameworkMetadata() {}

  @JsonCreator
  public CustomFrameworkMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this.handle = handle;
    this.id = id;
    this.name = name;
    this.orgId = orgId;
    this.version = version;
  }

  public CustomFrameworkMetadata createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Framework Creation Date
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public CustomFrameworkMetadata createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Framework Creator
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public CustomFrameworkMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Framework Description
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

  public CustomFrameworkMetadata handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * Framework Handle
   *
   * @return handle
   */
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public CustomFrameworkMetadata iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * Framework Icon URL
   *
   * @return iconUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public CustomFrameworkMetadata id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Custom Framework ID
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomFrameworkMetadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Framework Name
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

  public CustomFrameworkMetadata orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Org ID
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public CustomFrameworkMetadata updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Framework Update Date
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CustomFrameworkMetadata version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Framework Version
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return CustomFrameworkMetadata
   */
  @JsonAnySetter
  public CustomFrameworkMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomFrameworkMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFrameworkMetadata customFrameworkMetadata = (CustomFrameworkMetadata) o;
    return Objects.equals(this.createdAt, customFrameworkMetadata.createdAt)
        && Objects.equals(this.createdBy, customFrameworkMetadata.createdBy)
        && Objects.equals(this.description, customFrameworkMetadata.description)
        && Objects.equals(this.handle, customFrameworkMetadata.handle)
        && Objects.equals(this.iconUrl, customFrameworkMetadata.iconUrl)
        && Objects.equals(this.id, customFrameworkMetadata.id)
        && Objects.equals(this.name, customFrameworkMetadata.name)
        && Objects.equals(this.orgId, customFrameworkMetadata.orgId)
        && Objects.equals(this.updatedAt, customFrameworkMetadata.updatedAt)
        && Objects.equals(this.version, customFrameworkMetadata.version)
        && Objects.equals(this.additionalProperties, customFrameworkMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        description,
        handle,
        iconUrl,
        id,
        name,
        orgId,
        updatedAt,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFrameworkMetadata {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
