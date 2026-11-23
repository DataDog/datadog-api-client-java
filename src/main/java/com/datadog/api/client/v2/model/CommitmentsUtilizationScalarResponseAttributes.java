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

/** Attributes of a scalar utilization response. */
@JsonPropertyOrder({
  CommitmentsUtilizationScalarResponseAttributes.JSON_PROPERTY_COLUMNS,
  CommitmentsUtilizationScalarResponseAttributes.JSON_PROPERTY_META,
  CommitmentsUtilizationScalarResponseAttributes.JSON_PROPERTY_PRODUCT_BREAKDOWN,
  CommitmentsUtilizationScalarResponseAttributes.JSON_PROPERTY_QUERY_DEFINITION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsUtilizationScalarResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<CommitmentsScalarColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private CommitmentsUnusedCostMeta meta;

  public static final String JSON_PROPERTY_PRODUCT_BREAKDOWN = "product_breakdown";
  private List<CommitmentsUtilizationScalarProductBreakdownEntry> productBreakdown = null;

  public static final String JSON_PROPERTY_QUERY_DEFINITION = "query_definition";
  private CommitmentsQueryDefinition queryDefinition;

  public CommitmentsUtilizationScalarResponseAttributes() {}

  @JsonCreator
  public CommitmentsUtilizationScalarResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<CommitmentsScalarColumn> columns) {
    this.columns = columns;
    for (CommitmentsScalarColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
  }

  public CommitmentsUtilizationScalarResponseAttributes columns(
      List<CommitmentsScalarColumn> columns) {
    this.columns = columns;
    for (CommitmentsScalarColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CommitmentsUtilizationScalarResponseAttributes addColumnsItem(
      CommitmentsScalarColumn columnsItem) {
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
    if (columns != null) {
      for (CommitmentsScalarColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CommitmentsUtilizationScalarResponseAttributes meta(CommitmentsUnusedCostMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata reporting that the cost data lacks the unused costs of some commitments, as with Azure
   * exports scoped below the billing profile. Utilization is then overstated, and realized savings
   * and effective savings rate are upper bounds. Omitted when the unused costs are available.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CommitmentsUnusedCostMeta getMeta() {
    return meta;
  }

  public void setMeta(CommitmentsUnusedCostMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
  }

  public CommitmentsUtilizationScalarResponseAttributes productBreakdown(
      List<CommitmentsUtilizationScalarProductBreakdownEntry> productBreakdown) {
    this.productBreakdown = productBreakdown;
    if (productBreakdown != null) {
      for (CommitmentsUtilizationScalarProductBreakdownEntry item : productBreakdown) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CommitmentsUtilizationScalarResponseAttributes addProductBreakdownItem(
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
    if (productBreakdown != null) {
      for (CommitmentsUtilizationScalarProductBreakdownEntry item : productBreakdown) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CommitmentsUtilizationScalarResponseAttributes queryDefinition(
      CommitmentsQueryDefinition queryDefinition) {
    this.queryDefinition = queryDefinition;
    this.unparsed |= queryDefinition.unparsed;
    return this;
  }

  /**
   * The query that produces the response values, in the same format as dashboard and notebook
   * widget requests, so a client can graph the values in a widget. Each formula's <code>id</code>
   * names the response value that it produces.
   *
   * @return queryDefinition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CommitmentsQueryDefinition getQueryDefinition() {
    return queryDefinition;
  }

  public void setQueryDefinition(CommitmentsQueryDefinition queryDefinition) {
    this.queryDefinition = queryDefinition;
    if (queryDefinition != null) {
      this.unparsed |= queryDefinition.unparsed;
    }
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
   * @return CommitmentsUtilizationScalarResponseAttributes
   */
  @JsonAnySetter
  public CommitmentsUtilizationScalarResponseAttributes putAdditionalProperty(
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

  /** Return true if this CommitmentsUtilizationScalarResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsUtilizationScalarResponseAttributes commitmentsUtilizationScalarResponseAttributes =
        (CommitmentsUtilizationScalarResponseAttributes) o;
    return Objects.equals(this.columns, commitmentsUtilizationScalarResponseAttributes.columns)
        && Objects.equals(this.meta, commitmentsUtilizationScalarResponseAttributes.meta)
        && Objects.equals(
            this.productBreakdown, commitmentsUtilizationScalarResponseAttributes.productBreakdown)
        && Objects.equals(
            this.queryDefinition, commitmentsUtilizationScalarResponseAttributes.queryDefinition)
        && Objects.equals(
            this.additionalProperties,
            commitmentsUtilizationScalarResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, meta, productBreakdown, queryDefinition, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsUtilizationScalarResponseAttributes {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    productBreakdown: ").append(toIndentedString(productBreakdown)).append("\n");
    sb.append("    queryDefinition: ").append(toIndentedString(queryDefinition)).append("\n");
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
