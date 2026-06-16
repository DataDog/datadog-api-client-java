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

/** The attributes of an ownership history response. */
@JsonPropertyOrder({
  OwnershipHistoryAttributes.JSON_PROPERTY_ITEMS,
  OwnershipHistoryAttributes.JSON_PROPERTY_PAGINATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OwnershipHistoryAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<OwnershipHistoryItem> items = new ArrayList<>();

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private OwnershipHistoryPagination pagination;

  public OwnershipHistoryAttributes() {}

  @JsonCreator
  public OwnershipHistoryAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ITEMS) List<OwnershipHistoryItem> items,
      @JsonProperty(required = true, value = JSON_PROPERTY_PAGINATION)
          OwnershipHistoryPagination pagination) {
    this.items = items;
    this.pagination = pagination;
    this.unparsed |= pagination.unparsed;
  }

  public OwnershipHistoryAttributes items(List<OwnershipHistoryItem> items) {
    this.items = items;
    for (OwnershipHistoryItem item : items) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public OwnershipHistoryAttributes addItemsItem(OwnershipHistoryItem itemsItem) {
    this.items.add(itemsItem);
    this.unparsed |= itemsItem.unparsed;
    return this;
  }

  /**
   * The list of history entries returned for this page.
   *
   * @return items
   */
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<OwnershipHistoryItem> getItems() {
    return items;
  }

  public void setItems(List<OwnershipHistoryItem> items) {
    this.items = items;
  }

  public OwnershipHistoryAttributes pagination(OwnershipHistoryPagination pagination) {
    this.pagination = pagination;
    this.unparsed |= pagination.unparsed;
    return this;
  }

  /**
   * Cursor-based pagination metadata for the history response.
   *
   * @return pagination
   */
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OwnershipHistoryPagination getPagination() {
    return pagination;
  }

  public void setPagination(OwnershipHistoryPagination pagination) {
    this.pagination = pagination;
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
   * @return OwnershipHistoryAttributes
   */
  @JsonAnySetter
  public OwnershipHistoryAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OwnershipHistoryAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipHistoryAttributes ownershipHistoryAttributes = (OwnershipHistoryAttributes) o;
    return Objects.equals(this.items, ownershipHistoryAttributes.items)
        && Objects.equals(this.pagination, ownershipHistoryAttributes.pagination)
        && Objects.equals(
            this.additionalProperties, ownershipHistoryAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, pagination, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipHistoryAttributes {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
