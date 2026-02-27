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

/** Facet attributes. */
@JsonPropertyOrder({
  FacetResponseAttributes.JSON_PROPERTY_ITEMS,
  FacetResponseAttributes.JSON_PROPERTY_KEY,
  FacetResponseAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FacetResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<FacetItem> items = new ArrayList<>();

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public FacetResponseAttributes() {}

  @JsonCreator
  public FacetResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ITEMS) List<FacetItem> items,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key) {
    this.items = items;
    this.key = key;
  }

  public FacetResponseAttributes items(List<FacetItem> items) {
    this.items = items;
    for (FacetItem item : items) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FacetResponseAttributes addItemsItem(FacetItem itemsItem) {
    this.items.add(itemsItem);
    this.unparsed |= itemsItem.unparsed;
    return this;
  }

  /**
   * Array of facet values.
   *
   * @return items
   */
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FacetItem> getItems() {
    return items;
  }

  public void setItems(List<FacetItem> items) {
    this.items = items;
  }

  public FacetResponseAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the facet.
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FacetResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the facet.
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
   * @return FacetResponseAttributes
   */
  @JsonAnySetter
  public FacetResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FacetResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetResponseAttributes facetResponseAttributes = (FacetResponseAttributes) o;
    return Objects.equals(this.items, facetResponseAttributes.items)
        && Objects.equals(this.key, facetResponseAttributes.key)
        && Objects.equals(this.name, facetResponseAttributes.name)
        && Objects.equals(this.additionalProperties, facetResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, key, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetResponseAttributes {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
