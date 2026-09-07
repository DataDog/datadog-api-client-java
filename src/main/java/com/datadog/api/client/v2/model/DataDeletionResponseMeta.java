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
   * <p>The metadata of the data deletion response.</p>
 */
@JsonPropertyOrder({
  DataDeletionResponseMeta.JSON_PROPERTY_COUNT_PRODUCT,
  DataDeletionResponseMeta.JSON_PROPERTY_COUNT_STATUS,
  DataDeletionResponseMeta.JSON_PROPERTY_NEXT_PAGE,
  DataDeletionResponseMeta.JSON_PROPERTY_PRODUCT,
  DataDeletionResponseMeta.JSON_PROPERTY_REQUEST_STATUS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DataDeletionResponseMeta {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT_PRODUCT = "count_product";
  private Map<String, Long> countProduct = null;

  public static final String JSON_PROPERTY_COUNT_STATUS = "count_status";
  private Map<String, Long> countStatus = null;

  public static final String JSON_PROPERTY_NEXT_PAGE = "next_page";
  private String nextPage;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_REQUEST_STATUS = "request_status";
  private String requestStatus;

  public DataDeletionResponseMeta countProduct(Map<String, Long> countProduct) {
    this.countProduct = countProduct;
    return this;
  }
  public DataDeletionResponseMeta putCountProductItem(String key, Long countProductItem) {
    if (this.countProduct == null) {
      this.countProduct = new HashMap<>();
    }
    this.countProduct.put(key, countProductItem);
    return this;
  }

  /**
   * <p>The total deletion requests created by product.</p>
   * @return countProduct
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COUNT_PRODUCT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Long> getCountProduct() {
        return countProduct;
      }
  public void setCountProduct(Map<String, Long> countProduct) {
    this.countProduct = countProduct;
  }
  public DataDeletionResponseMeta countStatus(Map<String, Long> countStatus) {
    this.countStatus = countStatus;
    return this;
  }
  public DataDeletionResponseMeta putCountStatusItem(String key, Long countStatusItem) {
    if (this.countStatus == null) {
      this.countStatus = new HashMap<>();
    }
    this.countStatus.put(key, countStatusItem);
    return this;
  }

  /**
   * <p>The total deletion requests created by status.</p>
   * @return countStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COUNT_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Long> getCountStatus() {
        return countStatus;
      }
  public void setCountStatus(Map<String, Long> countStatus) {
    this.countStatus = countStatus;
  }
  public DataDeletionResponseMeta nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * <p>The next page when searching deletion requests created in the current organization.</p>
   * @return nextPage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getNextPage() {
        return nextPage;
      }
  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }
  public DataDeletionResponseMeta product(String product) {
    this.product = product;
    return this;
  }

  /**
   * <p>The product of the deletion request.</p>
   * @return product
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRODUCT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProduct() {
        return product;
      }
  public void setProduct(String product) {
    this.product = product;
  }
  public DataDeletionResponseMeta requestStatus(String requestStatus) {
    this.requestStatus = requestStatus;
    return this;
  }

  /**
   * <p>The status of the executed request.</p>
   * @return requestStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REQUEST_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRequestStatus() {
        return requestStatus;
      }
  public void setRequestStatus(String requestStatus) {
    this.requestStatus = requestStatus;
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
   * @return DataDeletionResponseMeta
   */
  @JsonAnySetter
  public DataDeletionResponseMeta putAdditionalProperty(String key, Object value) {
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
   * Return true if this DataDeletionResponseMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataDeletionResponseMeta dataDeletionResponseMeta = (DataDeletionResponseMeta) o;
    return Objects.equals(this.countProduct, dataDeletionResponseMeta.countProduct) && Objects.equals(this.countStatus, dataDeletionResponseMeta.countStatus) && Objects.equals(this.nextPage, dataDeletionResponseMeta.nextPage) && Objects.equals(this.product, dataDeletionResponseMeta.product) && Objects.equals(this.requestStatus, dataDeletionResponseMeta.requestStatus) && Objects.equals(this.additionalProperties, dataDeletionResponseMeta.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(countProduct,countStatus,nextPage,product,requestStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataDeletionResponseMeta {\n");
    sb.append("    countProduct: ").append(toIndentedString(countProduct)).append("\n");
    sb.append("    countStatus: ").append(toIndentedString(countStatus)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    requestStatus: ").append(toIndentedString(requestStatus)).append("\n");
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
