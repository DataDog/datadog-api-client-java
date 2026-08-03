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
   * <p>Attributes for an integration.</p>
 */
@JsonPropertyOrder({
  IntegrationAttributes.JSON_PROPERTY_CATEGORIES,
  IntegrationAttributes.JSON_PROPERTY_DESCRIPTION,
  IntegrationAttributes.JSON_PROPERTY_INSTALLED,
  IntegrationAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INSTALLED = "installed";
  private Boolean installed;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IntegrationAttributes() {}

  @JsonCreator
  public IntegrationAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CATEGORIES)List<String> categories,
            @JsonProperty(required=true, value=JSON_PROPERTY_DESCRIPTION)String description,
            @JsonProperty(required=true, value=JSON_PROPERTY_INSTALLED)Boolean installed,
            @JsonProperty(required=true, value=JSON_PROPERTY_TITLE)String title) {
        this.categories = categories;
        this.description = description;
        this.installed = installed;
        this.title = title;
  }
  public IntegrationAttributes categories(List<String> categories) {
    this.categories = categories;
    return this;
  }
  public IntegrationAttributes addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * <p>List of categories associated with the integration.</p>
   * @return categories
  **/
      @JsonProperty(JSON_PROPERTY_CATEGORIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getCategories() {
        return categories;
      }
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }
  public IntegrationAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>A description of the integration.</p>
   * @return description
  **/
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public IntegrationAttributes installed(Boolean installed) {
    this.installed = installed;
    return this;
  }

  /**
   * <p>Whether the integration is installed.</p>
   * @return installed
  **/
      @JsonProperty(JSON_PROPERTY_INSTALLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getInstalled() {
        return installed;
      }
  public void setInstalled(Boolean installed) {
    this.installed = installed;
  }
  public IntegrationAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The name of the integration.</p>
   * @return title
  **/
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
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
   * @return IntegrationAttributes
   */
  @JsonAnySetter
  public IntegrationAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this IntegrationAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationAttributes integrationAttributes = (IntegrationAttributes) o;
    return Objects.equals(this.categories, integrationAttributes.categories) && Objects.equals(this.description, integrationAttributes.description) && Objects.equals(this.installed, integrationAttributes.installed) && Objects.equals(this.title, integrationAttributes.title) && Objects.equals(this.additionalProperties, integrationAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(categories,description,installed,title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationAttributes {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
