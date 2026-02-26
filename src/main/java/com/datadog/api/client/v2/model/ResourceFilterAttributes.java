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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a resource filter. */
@JsonPropertyOrder({
  ResourceFilterAttributes.JSON_PROPERTY_CLOUD_PROVIDER,
  ResourceFilterAttributes.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ResourceFilterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private Map<String, Map<String, List<String>>> cloudProvider =
      new HashMap<String, Map<String, List<String>>>();

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public ResourceFilterAttributes() {}

  @JsonCreator
  public ResourceFilterAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLOUD_PROVIDER)
          Map<String, Map<String, List<String>>> cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  public ResourceFilterAttributes cloudProvider(
      Map<String, Map<String, List<String>>> cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

  public ResourceFilterAttributes putCloudProviderItem(
      String key, Map<String, List<String>> cloudProviderItem) {
    this.cloudProvider.put(key, cloudProviderItem);
    return this;
  }

  /**
   * A map of cloud provider names (e.g., "aws", "gcp", "azure") to a map of account/resource IDs
   * and their associated tag filters.
   *
   * @return cloudProvider
   */
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Map<String, List<String>>> getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(Map<String, Map<String, List<String>>> cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  public ResourceFilterAttributes uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The UUID of the resource filter.
   *
   * @return uuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
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
   * @return ResourceFilterAttributes
   */
  @JsonAnySetter
  public ResourceFilterAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ResourceFilterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceFilterAttributes resourceFilterAttributes = (ResourceFilterAttributes) o;
    return Objects.equals(this.cloudProvider, resourceFilterAttributes.cloudProvider)
        && Objects.equals(this.uuid, resourceFilterAttributes.uuid)
        && Objects.equals(this.additionalProperties, resourceFilterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProvider, uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceFilterAttributes {\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
