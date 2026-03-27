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
   * <p>Dataset metadata and configurations.</p>
 */
@JsonPropertyOrder({
  DatasetAttributesRequest.JSON_PROPERTY_NAME,
  DatasetAttributesRequest.JSON_PROPERTY_PRINCIPALS,
  DatasetAttributesRequest.JSON_PROPERTY_PRODUCT_FILTERS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatasetAttributesRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRINCIPALS = "principals";
  private List<String> principals = new ArrayList<>();

  public static final String JSON_PROPERTY_PRODUCT_FILTERS = "product_filters";
  private List<FiltersPerProduct> productFilters = new ArrayList<>();

  public DatasetAttributesRequest() {}

  @JsonCreator
  public DatasetAttributesRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_PRINCIPALS)List<String> principals,
            @JsonProperty(required=true, value=JSON_PROPERTY_PRODUCT_FILTERS)List<FiltersPerProduct> productFilters) {
        this.name = name;
        this.principals = principals;
        this.productFilters = productFilters;
  }
  public DatasetAttributesRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the dataset.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public DatasetAttributesRequest principals(List<String> principals) {
    this.principals = principals;
    return this;
  }
  public DatasetAttributesRequest addPrincipalsItem(String principalsItem) {
    this.principals.add(principalsItem);
    return this;
  }

  /**
   * <p>List of access principals, formatted as <code>principal_type:id</code>. Principal can be 'team' or 'role'.</p>
   * @return principals
  **/
      @JsonProperty(JSON_PROPERTY_PRINCIPALS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getPrincipals() {
        return principals;
      }
  public void setPrincipals(List<String> principals) {
    this.principals = principals;
  }
  public DatasetAttributesRequest productFilters(List<FiltersPerProduct> productFilters) {
    this.productFilters = productFilters;
    for (FiltersPerProduct item : productFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public DatasetAttributesRequest addProductFiltersItem(FiltersPerProduct productFiltersItem) {
    this.productFilters.add(productFiltersItem);
    this.unparsed |= productFiltersItem.unparsed;
    return this;
  }

  /**
   * <p>List of product-specific filters.</p>
   * @return productFilters
  **/
      @JsonProperty(JSON_PROPERTY_PRODUCT_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<FiltersPerProduct> getProductFilters() {
        return productFilters;
      }
  public void setProductFilters(List<FiltersPerProduct> productFilters) {
    this.productFilters = productFilters;
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
   * @return DatasetAttributesRequest
   */
  @JsonAnySetter
  public DatasetAttributesRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this DatasetAttributesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetAttributesRequest datasetAttributesRequest = (DatasetAttributesRequest) o;
    return Objects.equals(this.name, datasetAttributesRequest.name) && Objects.equals(this.principals, datasetAttributesRequest.principals) && Objects.equals(this.productFilters, datasetAttributesRequest.productFilters) && Objects.equals(this.additionalProperties, datasetAttributesRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,principals,productFilters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetAttributesRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    productFilters: ").append(toIndentedString(productFilters)).append("\n");
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
