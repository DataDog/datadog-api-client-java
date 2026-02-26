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
   * <p>Attributes of the Sensitive Data Scanner group.</p>
 */
@JsonPropertyOrder({
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_DESCRIPTION,
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_FILTER,
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_IS_ENABLED,
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_NAME,
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_PRODUCT_LIST,
  SensitiveDataScannerGroupAttributes.JSON_PROPERTY_SAMPLINGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerGroupAttributes {
  @JsonIgnore
  public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_SAMPLINGS = "samplings";
  private List<SensitiveDataScannerSamplings> samplings = null;

  public SensitiveDataScannerGroupAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Description of the group.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Filter for the Scanning Group.</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether or not the group is enabled.</p>
   * @return isEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Name of the group.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SensitiveDataScannerGroupAttributes productList(List<SensitiveDataScannerProduct> productList) {
    this.productList = productList;
    return this;
  }
  public SensitiveDataScannerGroupAttributes addProductListItem(SensitiveDataScannerProduct productListItem) {
    if (this.productList == null) {
      this.productList = new ArrayList<>();
    }
    this.productList.add(productListItem);
    this.unparsed |= !productListItem.isValid();
    return this;
  }

  /**
   * <p>List of products the scanning group applies.</p>
   * @return productList
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRODUCT_LIST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SensitiveDataScannerProduct> getProductList() {
        return productList;
      }
  public void setProductList(List<SensitiveDataScannerProduct> productList) {
    this.productList = productList;
  }
  public SensitiveDataScannerGroupAttributes samplings(List<SensitiveDataScannerSamplings> samplings) {
    this.samplings = samplings;
    for (SensitiveDataScannerSamplings item : samplings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SensitiveDataScannerGroupAttributes addSamplingsItem(SensitiveDataScannerSamplings samplingsItem) {
    if (this.samplings == null) {
      this.samplings = new ArrayList<>();
    }
    this.samplings.add(samplingsItem);
    this.unparsed |= samplingsItem.unparsed;
    return this;
  }

  /**
   * <p>List of sampling rates per product type.</p>
   * @return samplings
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SAMPLINGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SensitiveDataScannerSamplings> getSamplings() {
        return samplings;
      }
  public void setSamplings(List<SensitiveDataScannerSamplings> samplings) {
    this.samplings = samplings;
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
   * @return SensitiveDataScannerGroupAttributes
   */
  @JsonAnySetter
  public SensitiveDataScannerGroupAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SensitiveDataScannerGroupAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerGroupAttributes sensitiveDataScannerGroupAttributes = (SensitiveDataScannerGroupAttributes) o;
    return Objects.equals(this.description, sensitiveDataScannerGroupAttributes.description) && Objects.equals(this.filter, sensitiveDataScannerGroupAttributes.filter) && Objects.equals(this.isEnabled, sensitiveDataScannerGroupAttributes.isEnabled) && Objects.equals(this.name, sensitiveDataScannerGroupAttributes.name) && Objects.equals(this.productList, sensitiveDataScannerGroupAttributes.productList) && Objects.equals(this.samplings, sensitiveDataScannerGroupAttributes.samplings) && Objects.equals(this.additionalProperties, sensitiveDataScannerGroupAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,filter,isEnabled,name,productList,samplings, additionalProperties);
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
    sb.append("    samplings: ").append(toIndentedString(samplings)).append("\n");
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
