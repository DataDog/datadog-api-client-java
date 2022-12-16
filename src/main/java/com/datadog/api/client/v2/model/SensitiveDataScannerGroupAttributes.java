/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Attributes of the Sensitive Data Scanner group. */
@JsonPropertyOrder({
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_DESCRIPTION,
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_FILTER,
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_IS_ENABLED,
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_NAME,
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_PRODUCT_LIST
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerGroupAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private SensitiveDataScannerFilter filter;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRODUCT_LIST = "product_list";
  private List<SensitiveDataScannerProduct> productList = null;

  public SensitiveDataScannerGroupAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the group.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SensitiveDataScannerGroupAttributes filter(SensitiveDataScannerFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * Filter for the Scanning Group.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerFilter getFilter() {
    return filter;
  }

  public void setFilter(SensitiveDataScannerFilter filter) {
    this.filter = filter;
  }

  public SensitiveDataScannerGroupAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the group is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public SensitiveDataScannerGroupAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the group.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SensitiveDataScannerGroupAttributes productList(
      List<SensitiveDataScannerProduct> productList) {
    this.productList = productList;
    return this;
  }

  public SensitiveDataScannerGroupAttributes addProductListItem(
      SensitiveDataScannerProduct productListItem) {
    if (this.productList == null) {
      this.productList = new ArrayList<>();
    }
    this.productList.add(productListItem);
    this.unparsed |= !productListItem.isValid();
    return this;
  }

  /**
   * List of products the scanning group applies.
   *
   * @return productList
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SensitiveDataScannerProduct> getProductList() {
    return productList;
  }

  public void setProductList(List<SensitiveDataScannerProduct> productList) {
    this.productList = productList;
  }

  /** Return true if this SensitiveDataScannerGroupAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerGroupAttributes sensitiveDataScannerGroupAttributes =
        (SensitiveDataScannerGroupAttributes) o;
    return Objects.equals(this.description, sensitiveDataScannerGroupAttributes.description)
        && Objects.equals(this.filter, sensitiveDataScannerGroupAttributes.filter)
        && Objects.equals(this.isEnabled, sensitiveDataScannerGroupAttributes.isEnabled)
        && Objects.equals(this.name, sensitiveDataScannerGroupAttributes.name)
        && Objects.equals(this.productList, sensitiveDataScannerGroupAttributes.productList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, filter, isEnabled, name, productList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerGroupAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
    sb.append("}");
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
