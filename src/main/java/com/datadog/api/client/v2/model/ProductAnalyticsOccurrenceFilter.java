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
   * <p>Filter for occurrence-based queries.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsOccurrenceFilter.JSON_PROPERTY_META,
  ProductAnalyticsOccurrenceFilter.JSON_PROPERTY_OPERATOR,
  ProductAnalyticsOccurrenceFilter.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsOccurrenceFilter {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_META = "meta";
  private Map<String, String> meta = null;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public ProductAnalyticsOccurrenceFilter() {}

  @JsonCreator
  public ProductAnalyticsOccurrenceFilter(
            @JsonProperty(required=true, value=JSON_PROPERTY_OPERATOR)String operator,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)String value) {
        this.operator = operator;
        this.value = value;
  }
  public ProductAnalyticsOccurrenceFilter meta(Map<String, String> meta) {
    this.meta = meta;
    return this;
  }
  public ProductAnalyticsOccurrenceFilter putMetaItem(String key, String metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * <p>Additional metadata.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getMeta() {
        return meta;
      }
  public void setMeta(Map<String, String> meta) {
    this.meta = meta;
  }
  public ProductAnalyticsOccurrenceFilter operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * <p>Comparison operator (=, &gt;=, &lt;=, &gt;, &lt;).</p>
   * @return operator
  **/
      @JsonProperty(JSON_PROPERTY_OPERATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getOperator() {
        return operator;
      }
  public void setOperator(String operator) {
    this.operator = operator;
  }
  public ProductAnalyticsOccurrenceFilter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>The occurrence count threshold as a string.</p>
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getValue() {
        return value;
      }
  public void setValue(String value) {
    this.value = value;
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
   * @return ProductAnalyticsOccurrenceFilter
   */
  @JsonAnySetter
  public ProductAnalyticsOccurrenceFilter putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsOccurrenceFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsOccurrenceFilter productAnalyticsOccurrenceFilter = (ProductAnalyticsOccurrenceFilter) o;
    return Objects.equals(this.meta, productAnalyticsOccurrenceFilter.meta) && Objects.equals(this.operator, productAnalyticsOccurrenceFilter.operator) && Objects.equals(this.value, productAnalyticsOccurrenceFilter.value) && Objects.equals(this.additionalProperties, productAnalyticsOccurrenceFilter.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(meta,operator,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsOccurrenceFilter {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
