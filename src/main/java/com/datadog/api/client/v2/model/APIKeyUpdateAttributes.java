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

/** Attributes used to update an API Key. */
@JsonPropertyOrder({
  APIKeyUpdateAttributes.JSON_PROPERTY_CATEGORY,
  APIKeyUpdateAttributes.JSON_PROPERTY_NAME,
  APIKeyUpdateAttributes.JSON_PROPERTY_REMOTE_CONFIG_READ_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class APIKeyUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REMOTE_CONFIG_READ_ENABLED =
      "remote_config_read_enabled";
  private Boolean remoteConfigReadEnabled;

  public APIKeyUpdateAttributes() {}

  @JsonCreator
  public APIKeyUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public APIKeyUpdateAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The APIKeyUpdateAttributes category.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public APIKeyUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the API key.
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

  public APIKeyUpdateAttributes remoteConfigReadEnabled(Boolean remoteConfigReadEnabled) {
    this.remoteConfigReadEnabled = remoteConfigReadEnabled;
    return this;
  }

  /**
   * The APIKeyUpdateAttributes remote_config_read_enabled.
   *
   * @return remoteConfigReadEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_CONFIG_READ_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRemoteConfigReadEnabled() {
    return remoteConfigReadEnabled;
  }

  public void setRemoteConfigReadEnabled(Boolean remoteConfigReadEnabled) {
    this.remoteConfigReadEnabled = remoteConfigReadEnabled;
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
   * @return APIKeyUpdateAttributes
   */
  @JsonAnySetter
  public APIKeyUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this APIKeyUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKeyUpdateAttributes apiKeyUpdateAttributes = (APIKeyUpdateAttributes) o;
    return Objects.equals(this.category, apiKeyUpdateAttributes.category)
        && Objects.equals(this.name, apiKeyUpdateAttributes.name)
        && Objects.equals(
            this.remoteConfigReadEnabled, apiKeyUpdateAttributes.remoteConfigReadEnabled)
        && Objects.equals(this.additionalProperties, apiKeyUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, name, remoteConfigReadEnabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKeyUpdateAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remoteConfigReadEnabled: ")
        .append(toIndentedString(remoteConfigReadEnabled))
        .append("\n");
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
