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

/**
 * Attributes of a facet info response, containing the value distribution for the requested facet.
 */
@JsonPropertyOrder({CsmHostFacetInfoAttributes.JSON_PROPERTY_ITEMS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmHostFacetInfoAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CsmHostFacetInfoItem> items = new ArrayList<>();

  public CsmHostFacetInfoAttributes() {}

  @JsonCreator
  public CsmHostFacetInfoAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ITEMS)
          List<CsmHostFacetInfoItem> items) {
    this.items = items;
  }

  public CsmHostFacetInfoAttributes items(List<CsmHostFacetInfoItem> items) {
    this.items = items;
    for (CsmHostFacetInfoItem item : items) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CsmHostFacetInfoAttributes addItemsItem(CsmHostFacetInfoItem itemsItem) {
    this.items.add(itemsItem);
    this.unparsed |= itemsItem.unparsed;
    return this;
  }

  /**
   * The list of facet value entries for the current page.
   *
   * @return items
   */
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CsmHostFacetInfoItem> getItems() {
    return items;
  }

  public void setItems(List<CsmHostFacetInfoItem> items) {
    this.items = items;
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
   * @return CsmHostFacetInfoAttributes
   */
  @JsonAnySetter
  public CsmHostFacetInfoAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CsmHostFacetInfoAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsmHostFacetInfoAttributes csmHostFacetInfoAttributes = (CsmHostFacetInfoAttributes) o;
    return Objects.equals(this.items, csmHostFacetInfoAttributes.items)
        && Objects.equals(
            this.additionalProperties, csmHostFacetInfoAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsmHostFacetInfoAttributes {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
