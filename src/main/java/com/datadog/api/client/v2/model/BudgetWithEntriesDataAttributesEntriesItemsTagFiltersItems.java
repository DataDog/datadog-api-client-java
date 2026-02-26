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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems.JSON_PROPERTY_TAG_KEY,
  BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems.JSON_PROPERTY_TAG_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_VALUE = "tag_value";
  private String tagValue;

  public BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * GettagKey
   *
   * @return tagKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems tagValue(String tagValue) {
    this.tagValue = tagValue;
    return this;
  }

  /**
   * GettagValue
   *
   * @return tagValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagValue() {
    return tagValue;
  }

  public void setTagValue(String tagValue) {
    this.tagValue = tagValue;
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
   * @return BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems
   */
  @JsonAnySetter
  public BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems putAdditionalProperty(
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
   * Return true if this BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems
        budgetWithEntriesDataAttributesEntriesItemsTagFiltersItems =
            (BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems) o;
    return Objects.equals(
            this.tagKey, budgetWithEntriesDataAttributesEntriesItemsTagFiltersItems.tagKey)
        && Objects.equals(
            this.tagValue, budgetWithEntriesDataAttributesEntriesItemsTagFiltersItems.tagValue)
        && Objects.equals(
            this.additionalProperties,
            budgetWithEntriesDataAttributesEntriesItemsTagFiltersItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagValue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems {\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
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
