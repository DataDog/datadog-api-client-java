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
 * The definition of <code>ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems</code>
 * object.
 */
@JsonPropertyOrder({
  ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems.JSON_PROPERTY_ALLOCATED_TAGS,
  ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems.JSON_PROPERTY_PERCENTAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOCATED_TAGS = "allocated_tags";
  private List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItemsAllocatedTagsItems>
      allocatedTags = new ArrayList<>();

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  private Double percentage;

  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems() {}

  @JsonCreator
  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOCATED_TAGS)
          List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItemsAllocatedTagsItems>
              allocatedTags,
      @JsonProperty(required = true, value = JSON_PROPERTY_PERCENTAGE) Double percentage) {
    this.allocatedTags = allocatedTags;
    this.percentage = percentage;
  }

  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems allocatedTags(
      List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItemsAllocatedTagsItems>
          allocatedTags) {
    this.allocatedTags = allocatedTags;
    for (ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItemsAllocatedTagsItems item :
        allocatedTags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems addAllocatedTagsItem(
      ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItemsAllocatedTagsItems
          allocatedTagsItem) {
    this.allocatedTags.add(allocatedTagsItem);
    this.unparsed |= allocatedTagsItem.unparsed;
    return this;
  }

  /**
   * The <code>items</code> <code>allocated_tags</code>.
   *
   * @return allocatedTags
   */
  @JsonProperty(JSON_PROPERTY_ALLOCATED_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItemsAllocatedTagsItems>
      getAllocatedTags() {
    return allocatedTags;
  }

  public void setAllocatedTags(
      List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItemsAllocatedTagsItems>
          allocatedTags) {
    this.allocatedTags = allocatedTags;
  }

  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems percentage(
      Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * The <code>items</code> <code>percentage</code>. The numeric value format should be a 32bit
   * float value.
   *
   * @return percentage
   */
  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
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
   * @return ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems
   */
  @JsonAnySetter
  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems putAdditionalProperty(
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

  /**
   * Return true if this ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems
        arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems =
            (ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems) o;
    return Objects.equals(
            this.allocatedTags,
            arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems.allocatedTags)
        && Objects.equals(
            this.percentage,
            arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems.percentage)
        && Objects.equals(
            this.additionalProperties,
            arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedTags, percentage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems {\n");
    sb.append("    allocatedTags: ").append(toIndentedString(allocatedTags)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
