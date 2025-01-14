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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Framework Data. */
@JsonPropertyOrder({
  CreateCustomFrameworkRequest.JSON_PROPERTY_DESCRIPTION,
  CreateCustomFrameworkRequest.JSON_PROPERTY_HANDLE,
  CreateCustomFrameworkRequest.JSON_PROPERTY_ICON_URL,
  CreateCustomFrameworkRequest.JSON_PROPERTY_NAME,
  CreateCustomFrameworkRequest.JSON_PROPERTY_REQUIREMENTS,
  CreateCustomFrameworkRequest.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateCustomFrameworkRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ICON_URL = "icon_url";
  private String iconUrl;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REQUIREMENTS = "requirements";
  private List<FrameworkRequirement> requirements = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public CreateCustomFrameworkRequest() {}

  @JsonCreator
  public CreateCustomFrameworkRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUIREMENTS)
          List<FrameworkRequirement> requirements,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this.handle = handle;
    this.name = name;
    this.requirements = requirements;
    this.version = version;
  }

  public CreateCustomFrameworkRequest description(String description) {
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

  public CreateCustomFrameworkRequest handle(String handle) {
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

  public CreateCustomFrameworkRequest iconUrl(String iconUrl) {
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

  public CreateCustomFrameworkRequest name(String name) {
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

  public CreateCustomFrameworkRequest requirements(List<FrameworkRequirement> requirements) {
    this.requirements = requirements;
    for (FrameworkRequirement item : requirements) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateCustomFrameworkRequest addRequirementsItem(FrameworkRequirement requirementsItem) {
    this.requirements.add(requirementsItem);
    this.unparsed |= requirementsItem.unparsed;
    return this;
  }

  /**
   * Framework Requirements
   *
   * @return requirements
   */
  @JsonProperty(JSON_PROPERTY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FrameworkRequirement> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<FrameworkRequirement> requirements) {
    this.requirements = requirements;
  }

  public CreateCustomFrameworkRequest version(String version) {
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
   * @return CreateCustomFrameworkRequest
   */
  @JsonAnySetter
  public CreateCustomFrameworkRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateCustomFrameworkRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomFrameworkRequest createCustomFrameworkRequest = (CreateCustomFrameworkRequest) o;
    return Objects.equals(this.description, createCustomFrameworkRequest.description)
        && Objects.equals(this.handle, createCustomFrameworkRequest.handle)
        && Objects.equals(this.iconUrl, createCustomFrameworkRequest.iconUrl)
        && Objects.equals(this.name, createCustomFrameworkRequest.name)
        && Objects.equals(this.requirements, createCustomFrameworkRequest.requirements)
        && Objects.equals(this.version, createCustomFrameworkRequest.version)
        && Objects.equals(
            this.additionalProperties, createCustomFrameworkRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, handle, iconUrl, name, requirements, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomFrameworkRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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