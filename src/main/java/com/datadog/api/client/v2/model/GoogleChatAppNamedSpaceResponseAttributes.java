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
   * <p>Google Chat space attributes.</p>
 */
@JsonPropertyOrder({
  GoogleChatAppNamedSpaceResponseAttributes.JSON_PROPERTY_DISPLAY_NAME,
  GoogleChatAppNamedSpaceResponseAttributes.JSON_PROPERTY_ORGANIZATION_BINDING_ID,
  GoogleChatAppNamedSpaceResponseAttributes.JSON_PROPERTY_RESOURCE_NAME,
  GoogleChatAppNamedSpaceResponseAttributes.JSON_PROPERTY_SPACE_URI
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GoogleChatAppNamedSpaceResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ORGANIZATION_BINDING_ID = "organization_binding_id";
  private String organizationBindingId;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public static final String JSON_PROPERTY_SPACE_URI = "space_uri";
  private String spaceUri;

  public GoogleChatAppNamedSpaceResponseAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * <p>Google space display name.</p>
   * @return displayName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDisplayName() {
        return displayName;
      }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  public GoogleChatAppNamedSpaceResponseAttributes organizationBindingId(String organizationBindingId) {
    this.organizationBindingId = organizationBindingId;
    return this;
  }

  /**
   * <p>Organization binding ID.</p>
   * @return organizationBindingId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORGANIZATION_BINDING_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOrganizationBindingId() {
        return organizationBindingId;
      }
  public void setOrganizationBindingId(String organizationBindingId) {
    this.organizationBindingId = organizationBindingId;
  }
  public GoogleChatAppNamedSpaceResponseAttributes resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * <p>Google space resource name.</p>
   * @return resourceName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getResourceName() {
        return resourceName;
      }
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }
  public GoogleChatAppNamedSpaceResponseAttributes spaceUri(String spaceUri) {
    this.spaceUri = spaceUri;
    return this;
  }

  /**
   * <p>Google space URI.</p>
   * @return spaceUri
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SPACE_URI)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSpaceUri() {
        return spaceUri;
      }
  public void setSpaceUri(String spaceUri) {
    this.spaceUri = spaceUri;
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
   * @return GoogleChatAppNamedSpaceResponseAttributes
   */
  @JsonAnySetter
  public GoogleChatAppNamedSpaceResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this GoogleChatAppNamedSpaceResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChatAppNamedSpaceResponseAttributes googleChatAppNamedSpaceResponseAttributes = (GoogleChatAppNamedSpaceResponseAttributes) o;
    return Objects.equals(this.displayName, googleChatAppNamedSpaceResponseAttributes.displayName) && Objects.equals(this.organizationBindingId, googleChatAppNamedSpaceResponseAttributes.organizationBindingId) && Objects.equals(this.resourceName, googleChatAppNamedSpaceResponseAttributes.resourceName) && Objects.equals(this.spaceUri, googleChatAppNamedSpaceResponseAttributes.spaceUri) && Objects.equals(this.additionalProperties, googleChatAppNamedSpaceResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(displayName,organizationBindingId,resourceName,spaceUri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChatAppNamedSpaceResponseAttributes {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    organizationBindingId: ").append(toIndentedString(organizationBindingId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    spaceUri: ").append(toIndentedString(spaceUri)).append("\n");
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
