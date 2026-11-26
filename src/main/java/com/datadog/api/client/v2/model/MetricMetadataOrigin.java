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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Where the metric comes from. Each value is the display label shown on the Metrics Summary page.
 * The set of labels can grow as Datadog adds products. Each field is <code>null</code> when it
 * isn't known.
 */
@JsonPropertyOrder({
  MetricMetadataOrigin.JSON_PROPERTY_PRODUCT,
  MetricMetadataOrigin.JSON_PROPERTY_PRODUCT_DETAIL,
  MetricMetadataOrigin.JSON_PROPERTY_SUB_PRODUCT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricMetadataOrigin {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_PRODUCT_DETAIL = "product_detail";
  private String productDetail;

  public static final String JSON_PROPERTY_SUB_PRODUCT = "sub_product";
  private String subProduct;

  public MetricMetadataOrigin() {}

  @JsonCreator
  public MetricMetadataOrigin(
      @JsonProperty(required = true, value = JSON_PROPERTY_PRODUCT) String product,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRODUCT_DETAIL) String productDetail,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUB_PRODUCT) String subProduct) {
    this.product = product;
    if (product != null) {}
    this.productDetail = productDetail;
    if (productDetail != null) {}
    this.subProduct = subProduct;
    if (subProduct != null) {}
  }

  public MetricMetadataOrigin product(String product) {
    this.product = product;
    if (product != null) {}
    return this;
  }

  /**
   * Product that reports the metric, such as <code>Agent</code>.
   *
   * @return product
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public MetricMetadataOrigin productDetail(String productDetail) {
    this.productDetail = productDetail;
    if (productDetail != null) {}
    return this;
  }

  /**
   * Finer-grained origin within the sub-product, such as <code>Cpu</code>.
   *
   * @return productDetail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_DETAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProductDetail() {
    return productDetail;
  }

  public void setProductDetail(String productDetail) {
    this.productDetail = productDetail;
  }

  public MetricMetadataOrigin subProduct(String subProduct) {
    this.subProduct = subProduct;
    if (subProduct != null) {}
    return this;
  }

  /**
   * Part of the product that reports the metric, such as <code>Integration</code>.
   *
   * @return subProduct
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubProduct() {
    return subProduct;
  }

  public void setSubProduct(String subProduct) {
    this.subProduct = subProduct;
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
   * @return MetricMetadataOrigin
   */
  @JsonAnySetter
  public MetricMetadataOrigin putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricMetadataOrigin object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricMetadataOrigin metricMetadataOrigin = (MetricMetadataOrigin) o;
    return Objects.equals(this.product, metricMetadataOrigin.product)
        && Objects.equals(this.productDetail, metricMetadataOrigin.productDetail)
        && Objects.equals(this.subProduct, metricMetadataOrigin.subProduct)
        && Objects.equals(this.additionalProperties, metricMetadataOrigin.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productDetail, subProduct, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricMetadataOrigin {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productDetail: ").append(toIndentedString(productDetail)).append("\n");
    sb.append("    subProduct: ").append(toIndentedString(subProduct)).append("\n");
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
