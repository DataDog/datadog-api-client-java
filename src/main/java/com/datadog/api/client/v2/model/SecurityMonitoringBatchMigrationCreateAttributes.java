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

/** Attributes of the batch migration to create. */
@JsonPropertyOrder({
  SecurityMonitoringBatchMigrationCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringBatchMigrationCreateAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringBatchMigrationCreateAttributes.JSON_PROPERTY_RESOURCES,
  SecurityMonitoringBatchMigrationCreateAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringBatchMigrationCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<SecurityMonitoringBatchMigrationResourceCreateItem> resources = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public SecurityMonitoringBatchMigrationCreateAttributes() {}

  @JsonCreator
  public SecurityMonitoringBatchMigrationCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCES)
          List<SecurityMonitoringBatchMigrationResourceCreateItem> resources) {
    this.resources = resources;
    for (SecurityMonitoringBatchMigrationResourceCreateItem item : resources) {
      this.unparsed |= item.unparsed;
    }
  }

  public SecurityMonitoringBatchMigrationCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the batch migration.
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

  public SecurityMonitoringBatchMigrationCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the batch migration.
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

  public SecurityMonitoringBatchMigrationCreateAttributes resources(
      List<SecurityMonitoringBatchMigrationResourceCreateItem> resources) {
    this.resources = resources;
    for (SecurityMonitoringBatchMigrationResourceCreateItem item : resources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringBatchMigrationCreateAttributes addResourcesItem(
      SecurityMonitoringBatchMigrationResourceCreateItem resourcesItem) {
    this.resources.add(resourcesItem);
    this.unparsed |= resourcesItem.unparsed;
    return this;
  }

  /**
   * The initial resources of the batch migration. From 1 to 100 resources.
   *
   * @return resources
   */
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringBatchMigrationResourceCreateItem> getResources() {
    return resources;
  }

  public void setResources(List<SecurityMonitoringBatchMigrationResourceCreateItem> resources) {
    this.resources = resources;
    if (resources != null) {
      for (SecurityMonitoringBatchMigrationResourceCreateItem item : resources) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityMonitoringBatchMigrationCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringBatchMigrationCreateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags of the batch migration. Up to 50 tags, each up to 256 characters.
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
   * @return SecurityMonitoringBatchMigrationCreateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringBatchMigrationCreateAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this SecurityMonitoringBatchMigrationCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringBatchMigrationCreateAttributes
        securityMonitoringBatchMigrationCreateAttributes =
            (SecurityMonitoringBatchMigrationCreateAttributes) o;
    return Objects.equals(
            this.description, securityMonitoringBatchMigrationCreateAttributes.description)
        && Objects.equals(this.name, securityMonitoringBatchMigrationCreateAttributes.name)
        && Objects.equals(
            this.resources, securityMonitoringBatchMigrationCreateAttributes.resources)
        && Objects.equals(this.tags, securityMonitoringBatchMigrationCreateAttributes.tags)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringBatchMigrationCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, resources, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringBatchMigrationCreateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
