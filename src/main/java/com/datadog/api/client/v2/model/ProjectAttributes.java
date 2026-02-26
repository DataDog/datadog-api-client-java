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
   * <p>Project attributes</p>
 */
@JsonPropertyOrder({
  ProjectAttributes.JSON_PROPERTY_COLUMNS_CONFIG,
  ProjectAttributes.JSON_PROPERTY_ENABLED_CUSTOM_CASE_TYPES,
  ProjectAttributes.JSON_PROPERTY_KEY,
  ProjectAttributes.JSON_PROPERTY_NAME,
  ProjectAttributes.JSON_PROPERTY_RESTRICTED,
  ProjectAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProjectAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS_CONFIG = "columns_config";
  private ProjectColumnsConfig columnsConfig;

  public static final String JSON_PROPERTY_ENABLED_CUSTOM_CASE_TYPES = "enabled_custom_case_types";
  private List<String> enabledCustomCaseTypes = null;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESTRICTED = "restricted";
  private Boolean restricted;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private ProjectSettings settings;

  public ProjectAttributes columnsConfig(ProjectColumnsConfig columnsConfig) {
    this.columnsConfig = columnsConfig;
    this.unparsed |= columnsConfig.unparsed;
    return this;
  }

  /**
   * <p>Project columns configuration</p>
   * @return columnsConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COLUMNS_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProjectColumnsConfig getColumnsConfig() {
        return columnsConfig;
      }
  public void setColumnsConfig(ProjectColumnsConfig columnsConfig) {
    this.columnsConfig = columnsConfig;
  }
  public ProjectAttributes enabledCustomCaseTypes(List<String> enabledCustomCaseTypes) {
    this.enabledCustomCaseTypes = enabledCustomCaseTypes;
    return this;
  }
  public ProjectAttributes addEnabledCustomCaseTypesItem(String enabledCustomCaseTypesItem) {
    if (this.enabledCustomCaseTypes == null) {
      this.enabledCustomCaseTypes = new ArrayList<>();
    }
    this.enabledCustomCaseTypes.add(enabledCustomCaseTypesItem);
    return this;
  }

  /**
   * <p>List of enabled custom case type IDs</p>
   * @return enabledCustomCaseTypes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED_CUSTOM_CASE_TYPES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getEnabledCustomCaseTypes() {
        return enabledCustomCaseTypes;
      }
  public void setEnabledCustomCaseTypes(List<String> enabledCustomCaseTypes) {
    this.enabledCustomCaseTypes = enabledCustomCaseTypes;
  }
  public ProjectAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>The project's key</p>
   * @return key
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getKey() {
        return key;
      }
  public void setKey(String key) {
    this.key = key;
  }
  public ProjectAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Project's name</p>
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
  public ProjectAttributes restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

  /**
   * <p>Whether the project is restricted</p>
   * @return restricted
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESTRICTED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getRestricted() {
        return restricted;
      }
  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }
  public ProjectAttributes settings(ProjectSettings settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * <p>Project settings</p>
   * @return settings
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SETTINGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProjectSettings getSettings() {
        return settings;
      }
  public void setSettings(ProjectSettings settings) {
    this.settings = settings;
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
   * @return ProjectAttributes
   */
  @JsonAnySetter
  public ProjectAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProjectAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectAttributes projectAttributes = (ProjectAttributes) o;
    return Objects.equals(this.columnsConfig, projectAttributes.columnsConfig) && Objects.equals(this.enabledCustomCaseTypes, projectAttributes.enabledCustomCaseTypes) && Objects.equals(this.key, projectAttributes.key) && Objects.equals(this.name, projectAttributes.name) && Objects.equals(this.restricted, projectAttributes.restricted) && Objects.equals(this.settings, projectAttributes.settings) && Objects.equals(this.additionalProperties, projectAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(columnsConfig,enabledCustomCaseTypes,key,name,restricted,settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectAttributes {\n");
    sb.append("    columnsConfig: ").append(toIndentedString(columnsConfig)).append("\n");
    sb.append("    enabledCustomCaseTypes: ").append(toIndentedString(enabledCustomCaseTypes)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
