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

/** Response containing scalar utilization metrics for cloud commitment programs. */
@JsonPropertyOrder({
  CommitmentsUtilizationScalarResponse.JSON_PROPERTY_COLUMNS,
  CommitmentsUtilizationScalarResponse.JSON_PROPERTY_PRODUCT_BREAKDOWN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsUtilizationScalarResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<CommitmentsScalarColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_PRODUCT_BREAKDOWN = "product_breakdown";
  private List<CommitmentsUtilizationScalarProductBreakdownEntry> productBreakdown = null;

  public CommitmentsUtilizationScalarResponse() {}

  @JsonCreator
  public CommitmentsUtilizationScalarResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<CommitmentsScalarColumn> columns) {
    this.columns = columns;
  }

  public CommitmentsUtilizationScalarResponse columns(List<CommitmentsScalarColumn> columns) {
    this.columns = columns;
    for (CommitmentsScalarColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CommitmentsUtilizationScalarResponse addColumnsItem(CommitmentsScalarColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Array of scalar columns in the response.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CommitmentsScalarColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<CommitmentsScalarColumn> columns) {
    this.columns = columns;
  }

  public CommitmentsUtilizationScalarResponse productBreakdown(
      List<CommitmentsUtilizationScalarProductBreakdownEntry> productBreakdown) {
    this.productBreakdown = productBreakdown;
    for (CommitmentsUtilizationScalarProductBreakdownEntry item : productBreakdown) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CommitmentsUtilizationScalarResponse addProductBreakdownItem(
      CommitmentsUtilizationScalarProductBreakdownEntry productBreakdownItem) {
    if (this.productBreakdown == null) {
      this.productBreakdown = new ArrayList<>();
    }
    this.productBreakdown.add(productBreakdownItem);
    this.unparsed |= productBreakdownItem.unparsed;
    return this;
  }

  /**
   * Array of per-product utilization breakdown entries.
   *
   * @return productBreakdown
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CommitmentsUtilizationScalarProductBreakdownEntry> getProductBreakdown() {
    return productBreakdown;
  }

  public void setProductBreakdown(
      List<CommitmentsUtilizationScalarProductBreakdownEntry> productBreakdown) {
    this.productBreakdown = productBreakdown;
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
   * @return CommitmentsUtilizationScalarResponse
   */
  @JsonAnySetter
  public CommitmentsUtilizationScalarResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsUtilizationScalarResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsUtilizationScalarResponse commitmentsUtilizationScalarResponse =
        (CommitmentsUtilizationScalarResponse) o;
    return Objects.equals(this.columns, commitmentsUtilizationScalarResponse.columns)
        && Objects.equals(
            this.productBreakdown, commitmentsUtilizationScalarResponse.productBreakdown)
        && Objects.equals(
            this.additionalProperties, commitmentsUtilizationScalarResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, productBreakdown, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsUtilizationScalarResponse {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    productBreakdown: ").append(toIndentedString(productBreakdown)).append("\n");
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
