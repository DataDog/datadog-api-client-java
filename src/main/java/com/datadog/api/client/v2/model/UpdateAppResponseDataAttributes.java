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

/** The updated app definition attributes, such as name, description, and components. */
@JsonPropertyOrder({
  UpdateAppResponseDataAttributes.JSON_PROPERTY_COMPONENTS,
  UpdateAppResponseDataAttributes.JSON_PROPERTY_DESCRIPTION,
  UpdateAppResponseDataAttributes.JSON_PROPERTY_FAVORITE,
  UpdateAppResponseDataAttributes.JSON_PROPERTY_NAME,
  UpdateAppResponseDataAttributes.JSON_PROPERTY_QUERIES,
  UpdateAppResponseDataAttributes.JSON_PROPERTY_ROOT_INSTANCE_NAME,
  UpdateAppResponseDataAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateAppResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<ComponentGrid> components = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FAVORITE = "favorite";
  private Boolean favorite;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<Query> queries = null;

  public static final String JSON_PROPERTY_ROOT_INSTANCE_NAME = "rootInstanceName";
  private String rootInstanceName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public UpdateAppResponseDataAttributes components(List<ComponentGrid> components) {
    this.components = components;
    for (ComponentGrid item : components) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UpdateAppResponseDataAttributes addComponentsItem(ComponentGrid componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    this.unparsed |= componentsItem.unparsed;
    return this;
  }

  /**
   * The UI components that make up the app.
   *
   * @return components
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ComponentGrid> getComponents() {
    return components;
  }

  public void setComponents(List<ComponentGrid> components) {
    this.components = components;
  }

  public UpdateAppResponseDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The human-readable description for the app.
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

  public UpdateAppResponseDataAttributes favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

  /**
   * Whether the app is marked as a favorite by the current user.
   *
   * @return favorite
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public UpdateAppResponseDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the app.
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

  public UpdateAppResponseDataAttributes queries(List<Query> queries) {
    this.queries = queries;
    for (Query item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UpdateAppResponseDataAttributes addQueriesItem(Query queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * An array of queries, such as external actions and state variables, that the app uses.
   *
   * @return queries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Query> getQueries() {
    return queries;
  }

  public void setQueries(List<Query> queries) {
    this.queries = queries;
  }

  public UpdateAppResponseDataAttributes rootInstanceName(String rootInstanceName) {
    this.rootInstanceName = rootInstanceName;
    return this;
  }

  /**
   * The name of the root component of the app. This must be a <code>grid</code> component that
   * contains all other components.
   *
   * @return rootInstanceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOT_INSTANCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRootInstanceName() {
    return rootInstanceName;
  }

  public void setRootInstanceName(String rootInstanceName) {
    this.rootInstanceName = rootInstanceName;
  }

  public UpdateAppResponseDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateAppResponseDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags for the app, which can be used to filter apps.
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
   * @return UpdateAppResponseDataAttributes
   */
  @JsonAnySetter
  public UpdateAppResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateAppResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAppResponseDataAttributes updateAppResponseDataAttributes =
        (UpdateAppResponseDataAttributes) o;
    return Objects.equals(this.components, updateAppResponseDataAttributes.components)
        && Objects.equals(this.description, updateAppResponseDataAttributes.description)
        && Objects.equals(this.favorite, updateAppResponseDataAttributes.favorite)
        && Objects.equals(this.name, updateAppResponseDataAttributes.name)
        && Objects.equals(this.queries, updateAppResponseDataAttributes.queries)
        && Objects.equals(this.rootInstanceName, updateAppResponseDataAttributes.rootInstanceName)
        && Objects.equals(this.tags, updateAppResponseDataAttributes.tags)
        && Objects.equals(
            this.additionalProperties, updateAppResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        components,
        description,
        favorite,
        name,
        queries,
        rootInstanceName,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAppResponseDataAttributes {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    rootInstanceName: ").append(toIndentedString(rootInstanceName)).append("\n");
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
