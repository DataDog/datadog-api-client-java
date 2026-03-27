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
   * <p>Organization handle attributes.</p>
 */
@JsonPropertyOrder({
  GoogleChatOrganizationHandleResponseAttributes.JSON_PROPERTY_NAME,
  GoogleChatOrganizationHandleResponseAttributes.JSON_PROPERTY_SPACE_DISPLAY_NAME,
  GoogleChatOrganizationHandleResponseAttributes.JSON_PROPERTY_SPACE_RESOURCE_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GoogleChatOrganizationHandleResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SPACE_DISPLAY_NAME = "space_display_name";
  private String spaceDisplayName;

  public static final String JSON_PROPERTY_SPACE_RESOURCE_NAME = "space_resource_name";
  private String spaceResourceName;

  public GoogleChatOrganizationHandleResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Organization handle name.</p>
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
  public GoogleChatOrganizationHandleResponseAttributes spaceDisplayName(String spaceDisplayName) {
    this.spaceDisplayName = spaceDisplayName;
    return this;
  }

  /**
   * <p>Google space display name.</p>
   * @return spaceDisplayName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SPACE_DISPLAY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSpaceDisplayName() {
        return spaceDisplayName;
      }
  public void setSpaceDisplayName(String spaceDisplayName) {
    this.spaceDisplayName = spaceDisplayName;
  }
  public GoogleChatOrganizationHandleResponseAttributes spaceResourceName(String spaceResourceName) {
    this.spaceResourceName = spaceResourceName;
    return this;
  }

  /**
   * <p>Google space resource name.</p>
   * @return spaceResourceName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SPACE_RESOURCE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSpaceResourceName() {
        return spaceResourceName;
      }
  public void setSpaceResourceName(String spaceResourceName) {
    this.spaceResourceName = spaceResourceName;
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
   * @return GoogleChatOrganizationHandleResponseAttributes
   */
  @JsonAnySetter
  public GoogleChatOrganizationHandleResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this GoogleChatOrganizationHandleResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChatOrganizationHandleResponseAttributes googleChatOrganizationHandleResponseAttributes = (GoogleChatOrganizationHandleResponseAttributes) o;
    return Objects.equals(this.name, googleChatOrganizationHandleResponseAttributes.name) && Objects.equals(this.spaceDisplayName, googleChatOrganizationHandleResponseAttributes.spaceDisplayName) && Objects.equals(this.spaceResourceName, googleChatOrganizationHandleResponseAttributes.spaceResourceName) && Objects.equals(this.additionalProperties, googleChatOrganizationHandleResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,spaceDisplayName,spaceResourceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChatOrganizationHandleResponseAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    spaceDisplayName: ").append(toIndentedString(spaceDisplayName)).append("\n");
    sb.append("    spaceResourceName: ").append(toIndentedString(spaceResourceName)).append("\n");
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
