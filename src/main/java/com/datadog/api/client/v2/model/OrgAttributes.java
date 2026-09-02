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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of an organization. */
@JsonPropertyOrder({
  OrgAttributes.JSON_PROPERTY_CREATED_AT,
  OrgAttributes.JSON_PROPERTY_DESCRIPTION,
  OrgAttributes.JSON_PROPERTY_DISABLED,
  OrgAttributes.JSON_PROPERTY_MODIFIED_AT,
  OrgAttributes.JSON_PROPERTY_NAME,
  OrgAttributes.JSON_PROPERTY_PUBLIC_ID,
  OrgAttributes.JSON_PROPERTY_SHARING,
  OrgAttributes.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_SHARING = "sharing";
  private String sharing;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public OrgAttributes() {}

  @JsonCreator
  public OrgAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISABLED) Boolean disabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PUBLIC_ID) String publicId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHARING) String sharing,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url) {
    this.createdAt = createdAt;
    this.description = description;
    this.disabled = disabled;
    this.modifiedAt = modifiedAt;
    this.name = name;
    this.publicId = publicId;
    this.sharing = sharing;
    this.url = url;
  }

  public OrgAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation timestamp of the organization.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OrgAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the organization.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgAttributes disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Whether the organization is disabled.
   *
   * @return disabled
   */
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public OrgAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The last modification timestamp of the organization.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public OrgAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the organization.
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

  public OrgAttributes publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The public identifier of the organization.
   *
   * @return publicId
   */
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public OrgAttributes sharing(String sharing) {
    this.sharing = sharing;
    return this;
  }

  /**
   * The sharing setting of the organization.
   *
   * @return sharing
   */
  @JsonProperty(JSON_PROPERTY_SHARING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSharing() {
    return sharing;
  }

  public void setSharing(String sharing) {
    this.sharing = sharing;
  }

  public OrgAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the organization.
   *
   * @return url
   */
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return OrgAttributes
   */
  @JsonAnySetter
  public OrgAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgAttributes orgAttributes = (OrgAttributes) o;
    return Objects.equals(this.createdAt, orgAttributes.createdAt)
        && Objects.equals(this.description, orgAttributes.description)
        && Objects.equals(this.disabled, orgAttributes.disabled)
        && Objects.equals(this.modifiedAt, orgAttributes.modifiedAt)
        && Objects.equals(this.name, orgAttributes.name)
        && Objects.equals(this.publicId, orgAttributes.publicId)
        && Objects.equals(this.sharing, orgAttributes.sharing)
        && Objects.equals(this.url, orgAttributes.url)
        && Objects.equals(this.additionalProperties, orgAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        description,
        disabled,
        modifiedAt,
        name,
        publicId,
        sharing,
        url,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
