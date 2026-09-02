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

/** Service's external links. */
@JsonPropertyOrder({
  ServiceDefinitionV2Dot1Link.JSON_PROPERTY_NAME,
  ServiceDefinitionV2Dot1Link.JSON_PROPERTY_PROVIDER,
  ServiceDefinitionV2Dot1Link.JSON_PROPERTY_TYPE,
  ServiceDefinitionV2Dot1Link.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2Dot1Link {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceDefinitionV2Dot1LinkType type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ServiceDefinitionV2Dot1Link() {}

  @JsonCreator
  public ServiceDefinitionV2Dot1Link(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ServiceDefinitionV2Dot1LinkType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.url = url;
  }

  public ServiceDefinitionV2Dot1Link name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Link name.
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

  public ServiceDefinitionV2Dot1Link provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Link provider.
   *
   * @return provider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public ServiceDefinitionV2Dot1Link type(ServiceDefinitionV2Dot1LinkType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Link type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ServiceDefinitionV2Dot1LinkType getType() {
    return type;
  }

  public void setType(ServiceDefinitionV2Dot1LinkType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ServiceDefinitionV2Dot1Link url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Link URL.
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
   * @return ServiceDefinitionV2Dot1Link
   */
  @JsonAnySetter
  public ServiceDefinitionV2Dot1Link putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceDefinitionV2Dot1Link object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2Dot1Link serviceDefinitionV2Dot1Link = (ServiceDefinitionV2Dot1Link) o;
    return Objects.equals(this.name, serviceDefinitionV2Dot1Link.name)
        && Objects.equals(this.provider, serviceDefinitionV2Dot1Link.provider)
        && Objects.equals(this.type, serviceDefinitionV2Dot1Link.type)
        && Objects.equals(this.url, serviceDefinitionV2Dot1Link.url)
        && Objects.equals(
            this.additionalProperties, serviceDefinitionV2Dot1Link.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, provider, type, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2Dot1Link {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
