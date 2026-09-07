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
   * <p>The definition of <code>ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems</code> object.</p>
 */
@JsonPropertyOrder({
  ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems.JSON_PROPERTY_CONDITION,
  ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems.JSON_PROPERTY_TAG,
  ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems.JSON_PROPERTY_VALUE,
  ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITION = "condition";
  private String condition;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_VALUES = "values";
  private JsonNullable<List<String>> values = JsonNullable.<List<String>>undefined();

  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems() {}

  @JsonCreator
  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_CONDITION)String condition,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAG)String tag) {
        this.condition = condition;
        this.tag = tag;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * <p>The <code>items</code> <code>condition</code>.</p>
   * @return condition
  **/
      @JsonProperty(JSON_PROPERTY_CONDITION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCondition() {
        return condition;
      }
  public void setCondition(String condition) {
    this.condition = condition;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <p>The <code>items</code> <code>tag</code>.</p>
   * @return tag
  **/
      @JsonProperty(JSON_PROPERTY_TAG)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTag() {
        return tag;
      }
  public void setTag(String tag) {
    this.tag = tag;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>The <code>items</code> <code>value</code>.</p>
   * @return value
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getValue() {
        return value;
      }
  public void setValue(String value) {
    this.value = value;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems values(List<String> values) {
    this.values = JsonNullable.<List<String>>of(values);
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems addValuesItem(String valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.values.get().add(valuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>The <code>items</code> <code>values</code>.</p>
   * @return values
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getValues() {
        return values.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getValues_JsonNullable() {
    return values;
  }
  @JsonProperty(JSON_PROPERTY_VALUES)public void setValues_JsonNullable(JsonNullable<List<String>> values) {
    this.values = values;
  }
  public void setValues(List<String> values) {
    this.values = JsonNullable.<List<String>>of(values);
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
   * @return ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems
   */
  @JsonAnySetter
  public ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems = (ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems) o;
    return Objects.equals(this.condition, arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems.condition) && Objects.equals(this.tag, arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems.tag) && Objects.equals(this.value, arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems.value) && Objects.equals(this.values, arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems.values) && Objects.equals(this.additionalProperties, arbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(condition,tag,value,values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
