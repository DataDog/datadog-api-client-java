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
   * <p>Product-specific filters for the dataset.</p>
 */
@JsonPropertyOrder({
  FiltersPerProduct.JSON_PROPERTY_FILTERS,
  FiltersPerProduct.JSON_PROPERTY_PRODUCT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FiltersPerProduct {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<String> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public FiltersPerProduct() {}

  @JsonCreator
  public FiltersPerProduct(
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTERS)List<String> filters,
            @JsonProperty(required=true, value=JSON_PROPERTY_PRODUCT)String product) {
        this.filters = filters;
        this.product = product;
  }
  public FiltersPerProduct filters(List<String> filters) {
    this.filters = filters;
    return this;
  }
  public FiltersPerProduct addFiltersItem(String filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * <p>Defines the list of tag-based filters used to restrict access to telemetry data for a specific product.
   * These filters act as access control rules. Each filter must follow the tag query syntax used by
   * Datadog (such as <code>@tag.key:value</code>), and only one tag or attribute may be used to define the access strategy
   * per telemetry type.</p>
   * @return filters
  **/
      @JsonProperty(JSON_PROPERTY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getFilters() {
        return filters;
      }
  public void setFilters(List<String> filters) {
    this.filters = filters;
  }
  public FiltersPerProduct product(String product) {
    this.product = product;
    return this;
  }

  /**
   * <p>Name of the product the dataset is for. Possible values are 'apm', 'rum',
   * 'metrics', 'logs', 'error_tracking', and 'cloud_cost'.</p>
   * @return product
  **/
      @JsonProperty(JSON_PROPERTY_PRODUCT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getProduct() {
        return product;
      }
  public void setProduct(String product) {
    this.product = product;
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
   * @return FiltersPerProduct
   */
  @JsonAnySetter
  public FiltersPerProduct putAdditionalProperty(String key, Object value) {
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
   * Return true if this FiltersPerProduct object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltersPerProduct filtersPerProduct = (FiltersPerProduct) o;
    return Objects.equals(this.filters, filtersPerProduct.filters) && Objects.equals(this.product, filtersPerProduct.product) && Objects.equals(this.additionalProperties, filtersPerProduct.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filters,product, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltersPerProduct {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
