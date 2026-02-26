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
   * <p>Attributes object of a Cloudflare account.</p>
 */
@JsonPropertyOrder({
  CloudflareAccountResponseAttributes.JSON_PROPERTY_EMAIL,
  CloudflareAccountResponseAttributes.JSON_PROPERTY_NAME,
  CloudflareAccountResponseAttributes.JSON_PROPERTY_RESOURCES,
  CloudflareAccountResponseAttributes.JSON_PROPERTY_ZONES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudflareAccountResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<String> resources = null;

  public static final String JSON_PROPERTY_ZONES = "zones";
  private List<String> zones = null;

  public CloudflareAccountResponseAttributes() {}

  @JsonCreator
  public CloudflareAccountResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }
  public CloudflareAccountResponseAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>The email associated with the Cloudflare account.</p>
   * @return email
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEmail() {
        return email;
      }
  public void setEmail(String email) {
    this.email = email;
  }
  public CloudflareAccountResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the Cloudflare account.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public CloudflareAccountResponseAttributes resources(List<String> resources) {
    this.resources = resources;
    return this;
  }
  public CloudflareAccountResponseAttributes addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * <p>An allowlist of resources, such as <code>web</code>, <code>dns</code>, <code>lb</code> (load balancer), <code>worker</code>, that restricts pulling metrics from those resources.</p>
   * @return resources
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getResources() {
        return resources;
      }
  public void setResources(List<String> resources) {
    this.resources = resources;
  }
  public CloudflareAccountResponseAttributes zones(List<String> zones) {
    this.zones = zones;
    return this;
  }
  public CloudflareAccountResponseAttributes addZonesItem(String zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<>();
    }
    this.zones.add(zonesItem);
    return this;
  }

  /**
   * <p>An allowlist of zones to restrict pulling metrics for.</p>
   * @return zones
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ZONES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getZones() {
        return zones;
      }
  public void setZones(List<String> zones) {
    this.zones = zones;
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
   * @return CloudflareAccountResponseAttributes
   */
  @JsonAnySetter
  public CloudflareAccountResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CloudflareAccountResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareAccountResponseAttributes cloudflareAccountResponseAttributes = (CloudflareAccountResponseAttributes) o;
    return Objects.equals(this.email, cloudflareAccountResponseAttributes.email) && Objects.equals(this.name, cloudflareAccountResponseAttributes.name) && Objects.equals(this.resources, cloudflareAccountResponseAttributes.resources) && Objects.equals(this.zones, cloudflareAccountResponseAttributes.zones) && Objects.equals(this.additionalProperties, cloudflareAccountResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(email,name,resources,zones, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareAccountResponseAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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
