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
   * <p>Basic information about the app such as name, description, and tags.</p>
 */
@JsonPropertyOrder({
  ListAppsResponseDataItemsAttributes.JSON_PROPERTY_DESCRIPTION,
  ListAppsResponseDataItemsAttributes.JSON_PROPERTY_FAVORITE,
  ListAppsResponseDataItemsAttributes.JSON_PROPERTY_NAME,
  ListAppsResponseDataItemsAttributes.JSON_PROPERTY_SELF_SERVICE,
  ListAppsResponseDataItemsAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListAppsResponseDataItemsAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FAVORITE = "favorite";
  private Boolean favorite;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SELF_SERVICE = "selfService";
  private Boolean selfService;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ListAppsResponseDataItemsAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>A human-readable description for the app.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public ListAppsResponseDataItemsAttributes favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

  /**
   * <p>Whether the app is marked as a favorite by the current user.</p>
   * @return favorite
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FAVORITE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getFavorite() {
        return favorite;
      }
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }
  public ListAppsResponseDataItemsAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the app.</p>
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
  public ListAppsResponseDataItemsAttributes selfService(Boolean selfService) {
    this.selfService = selfService;
    return this;
  }

  /**
   * <p>Whether the app is enabled for use in the Datadog self-service hub.</p>
   * @return selfService
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SELF_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getSelfService() {
        return selfService;
      }
  public void setSelfService(Boolean selfService) {
    this.selfService = selfService;
  }
  public ListAppsResponseDataItemsAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public ListAppsResponseDataItemsAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tags for the app, which can be used to filter apps.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return ListAppsResponseDataItemsAttributes
   */
  @JsonAnySetter
  public ListAppsResponseDataItemsAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ListAppsResponseDataItemsAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAppsResponseDataItemsAttributes listAppsResponseDataItemsAttributes = (ListAppsResponseDataItemsAttributes) o;
    return Objects.equals(this.description, listAppsResponseDataItemsAttributes.description) && Objects.equals(this.favorite, listAppsResponseDataItemsAttributes.favorite) && Objects.equals(this.name, listAppsResponseDataItemsAttributes.name) && Objects.equals(this.selfService, listAppsResponseDataItemsAttributes.selfService) && Objects.equals(this.tags, listAppsResponseDataItemsAttributes.tags) && Objects.equals(this.additionalProperties, listAppsResponseDataItemsAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,favorite,name,selfService,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAppsResponseDataItemsAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfService: ").append(toIndentedString(selfService)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
