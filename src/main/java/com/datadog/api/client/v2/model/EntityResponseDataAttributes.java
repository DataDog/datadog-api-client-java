/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  EntityResponseDataAttributes.JSON_PROPERTY_API_VERSION,
  EntityResponseDataAttributes.JSON_PROPERTY_DESCRIPTION,
  EntityResponseDataAttributes.JSON_PROPERTY_DISPLAY_NAME,
  EntityResponseDataAttributes.JSON_PROPERTY_KIND,
  EntityResponseDataAttributes.JSON_PROPERTY_NAME,
  EntityResponseDataAttributes.JSON_PROPERTY_NAMESPACE,
  EntityResponseDataAttributes.JSON_PROPERTY_OWNER,
  EntityResponseDataAttributes.JSON_PROPERTY_PROPERTIES,
  EntityResponseDataAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_VERSION = "apiVersion";
  private String apiVersion;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private String namespace;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Map<String, Object> properties = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public EntityResponseDataAttributes apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * GetapiVersion
   *
   * @return apiVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public EntityResponseDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Getdescription
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

  public EntityResponseDataAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * GetdisplayName
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public EntityResponseDataAttributes kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Getkind
   *
   * @return kind
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public EntityResponseDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Getname
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EntityResponseDataAttributes namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Getnamespace
   *
   * @return namespace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public EntityResponseDataAttributes owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Getowner
   *
   * @return owner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public EntityResponseDataAttributes properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public EntityResponseDataAttributes putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Getproperties
   *
   * @return properties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public EntityResponseDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EntityResponseDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Gettags
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return EntityResponseDataAttributes
   */
  @JsonAnySetter
  public EntityResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EntityResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityResponseDataAttributes entityResponseDataAttributes = (EntityResponseDataAttributes) o;
    return Objects.equals(this.apiVersion, entityResponseDataAttributes.apiVersion)
        && Objects.equals(this.description, entityResponseDataAttributes.description)
        && Objects.equals(this.displayName, entityResponseDataAttributes.displayName)
        && Objects.equals(this.kind, entityResponseDataAttributes.kind)
        && Objects.equals(this.name, entityResponseDataAttributes.name)
        && Objects.equals(this.namespace, entityResponseDataAttributes.namespace)
        && Objects.equals(this.owner, entityResponseDataAttributes.owner)
        && Objects.equals(this.properties, entityResponseDataAttributes.properties)
        && Objects.equals(this.tags, entityResponseDataAttributes.tags)
        && Objects.equals(
            this.additionalProperties, entityResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiVersion,
        description,
        displayName,
        kind,
        name,
        namespace,
        owner,
        properties,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityResponseDataAttributes {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
