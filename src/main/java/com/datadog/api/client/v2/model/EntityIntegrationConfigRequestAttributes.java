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

/** Attributes used to create or update an entity integration configuration. */
@JsonPropertyOrder({EntityIntegrationConfigRequestAttributes.JSON_PROPERTY_CONFIG})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityIntegrationConfigRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private Map<String, Object> config = new HashMap<String, Object>();

  public EntityIntegrationConfigRequestAttributes() {}

  @JsonCreator
  public EntityIntegrationConfigRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG) Map<String, Object> config) {
    this.config = config;
  }

  public EntityIntegrationConfigRequestAttributes config(Map<String, Object> config) {
    this.config = config;
    return this;
  }

  public EntityIntegrationConfigRequestAttributes putConfigItem(String key, Object configItem) {
    this.config.put(key, configItem);
    return this;
  }

  /**
   * Integration-specific configuration payload. The shape of this object depends on the integration
   * identified by the path parameter. For <code>github</code>, the object must contain an <code>
   * enabled_repos</code> array. For <code>jira</code>, it must contain an <code>enabled_projects
   * </code> array. For <code>pagerduty</code>, it must contain an <code>accounts</code> array.
   *
   * @return config
   */
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getConfig() {
    return config;
  }

  public void setConfig(Map<String, Object> config) {
    this.config = config;
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
   * @return EntityIntegrationConfigRequestAttributes
   */
  @JsonAnySetter
  public EntityIntegrationConfigRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EntityIntegrationConfigRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityIntegrationConfigRequestAttributes entityIntegrationConfigRequestAttributes =
        (EntityIntegrationConfigRequestAttributes) o;
    return Objects.equals(this.config, entityIntegrationConfigRequestAttributes.config)
        && Objects.equals(
            this.additionalProperties,
            entityIntegrationConfigRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityIntegrationConfigRequestAttributes {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
