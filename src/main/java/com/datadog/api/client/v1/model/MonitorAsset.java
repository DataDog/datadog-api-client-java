/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Represents key links tied to a monitor to help users take action on alerts.
   * This feature is in Preview and only available to users with the feature enabled.</p>
 */
@JsonPropertyOrder({
  MonitorAsset.JSON_PROPERTY_CATEGORY,
  MonitorAsset.JSON_PROPERTY_NAME,
  MonitorAsset.JSON_PROPERTY_RESOURCE_KEY,
  MonitorAsset.JSON_PROPERTY_RESOURCE_TYPE,
  MonitorAsset.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorAsset {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private MonitorAssetCategory category;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCE_KEY = "resource_key";
  private String resourceKey;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private MonitorAssetResourceType resourceType;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public MonitorAsset() {}

  @JsonCreator
  public MonitorAsset(
            @JsonProperty(required=true, value=JSON_PROPERTY_CATEGORY)MonitorAssetCategory category,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_URL)String url) {
        this.category = category;
        this.unparsed |= !category.isValid();
        this.name = name;
        this.url = url;
  }
  public MonitorAsset category(MonitorAssetCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * <p>Indicates the type of asset this entity represents on a monitor.</p>
   * @return category
  **/
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorAssetCategory getCategory() {
        return category;
      }
  public void setCategory(MonitorAssetCategory category) {
    if (!category.isValid()) {
        this.unparsed = true;
    }
    this.category = category;
  }
  public MonitorAsset name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name for the monitor asset</p>
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
  public MonitorAsset resourceKey(String resourceKey) {
    this.resourceKey = resourceKey;
    return this;
  }

  /**
   * <p>Represents the identifier of the internal Datadog resource that this asset represents. IDs in this field should be passed in as strings.</p>
   * @return resourceKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getResourceKey() {
        return resourceKey;
      }
  public void setResourceKey(String resourceKey) {
    this.resourceKey = resourceKey;
  }
  public MonitorAsset resourceType(MonitorAssetResourceType resourceType) {
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
    return this;
  }

  /**
   * <p>Type of internal Datadog resource associated with a monitor asset.</p>
   * @return resourceType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorAssetResourceType getResourceType() {
        return resourceType;
      }
  public void setResourceType(MonitorAssetResourceType resourceType) {
    if (!resourceType.isValid()) {
        this.unparsed = true;
    }
    this.resourceType = resourceType;
  }
  public MonitorAsset url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>URL link for the asset. For links with an internal resource type set, this should be the relative path to where the Datadog domain is appended internally. For external links, this should be the full URL path.</p>
   * @return url
  **/
      @JsonProperty(JSON_PROPERTY_URL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUrl() {
        return url;
      }
  public void setUrl(String url) {
    this.url = url;
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
   * @return MonitorAsset
   */
  @JsonAnySetter
  public MonitorAsset putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorAsset object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorAsset monitorAsset = (MonitorAsset) o;
    return Objects.equals(this.category, monitorAsset.category) && Objects.equals(this.name, monitorAsset.name) && Objects.equals(this.resourceKey, monitorAsset.resourceKey) && Objects.equals(this.resourceType, monitorAsset.resourceType) && Objects.equals(this.url, monitorAsset.url) && Objects.equals(this.additionalProperties, monitorAsset.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(category,name,resourceKey,resourceType,url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorAsset {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceKey: ").append(toIndentedString(resourceKey)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
