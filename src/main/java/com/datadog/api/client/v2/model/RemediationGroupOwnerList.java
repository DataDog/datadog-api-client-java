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
 * Owners of the group's open findings. <code>items</code> lists at most 5 owners, the owners of the
 * most findings first, then by name. <code>total</code> counts every distinct owner, so the list is
 * cut when <code>total</code> is larger than the number of items.
 */
@JsonPropertyOrder({
  RemediationGroupOwnerList.JSON_PROPERTY_ITEMS,
  RemediationGroupOwnerList.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationGroupOwnerList {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<String> items = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public RemediationGroupOwnerList() {}

  @JsonCreator
  public RemediationGroupOwnerList(
      @JsonProperty(required = true, value = JSON_PROPERTY_ITEMS) List<String> items,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total) {
    this.items = items;
    this.total = total;
  }

  public RemediationGroupOwnerList items(List<String> items) {
    this.items = items;
    return this;
  }

  public RemediationGroupOwnerList addItemsItem(String itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Owners of the most findings in the group, at most 5.
   *
   * @return items
   */
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public RemediationGroupOwnerList total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Number of distinct owners across the group's findings.
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
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
   * @return RemediationGroupOwnerList
   */
  @JsonAnySetter
  public RemediationGroupOwnerList putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationGroupOwnerList object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationGroupOwnerList remediationGroupOwnerList = (RemediationGroupOwnerList) o;
    return Objects.equals(this.items, remediationGroupOwnerList.items)
        && Objects.equals(this.total, remediationGroupOwnerList.total)
        && Objects.equals(
            this.additionalProperties, remediationGroupOwnerList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationGroupOwnerList {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
