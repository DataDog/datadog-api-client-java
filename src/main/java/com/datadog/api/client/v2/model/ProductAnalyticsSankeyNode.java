/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A node in the Sankey diagram representing a page or aggregation. */
@JsonPropertyOrder({
  ProductAnalyticsSankeyNode.JSON_PROPERTY_AGGREGATED_NODES,
  ProductAnalyticsSankeyNode.JSON_PROPERTY_COLUMN,
  ProductAnalyticsSankeyNode.JSON_PROPERTY_DROPOFF_VALUE,
  ProductAnalyticsSankeyNode.JSON_PROPERTY_ID,
  ProductAnalyticsSankeyNode.JSON_PROPERTY_INCOMING_VALUE,
  ProductAnalyticsSankeyNode.JSON_PROPERTY_NAME,
  ProductAnalyticsSankeyNode.JSON_PROPERTY_OUTGOING_VALUE,
  ProductAnalyticsSankeyNode.JSON_PROPERTY_TYPE,
  ProductAnalyticsSankeyNode.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsSankeyNode {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATED_NODES = "aggregated_nodes";
  private List<ProductAnalyticsSankeyAggregatedNode> aggregatedNodes = null;

  public static final String JSON_PROPERTY_COLUMN = "column";
  private Long column;

  public static final String JSON_PROPERTY_DROPOFF_VALUE = "dropoff_value";
  private Long dropoffValue;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCOMING_VALUE = "incoming_value";
  private Long incomingValue;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OUTGOING_VALUE = "outgoing_value";
  private Long outgoingValue;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsSankeyNodeType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public ProductAnalyticsSankeyNode aggregatedNodes(
      List<ProductAnalyticsSankeyAggregatedNode> aggregatedNodes) {
    this.aggregatedNodes = aggregatedNodes;
    for (ProductAnalyticsSankeyAggregatedNode item : aggregatedNodes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsSankeyNode addAggregatedNodesItem(
      ProductAnalyticsSankeyAggregatedNode aggregatedNodesItem) {
    if (this.aggregatedNodes == null) {
      this.aggregatedNodes = new ArrayList<>();
    }
    this.aggregatedNodes.add(aggregatedNodesItem);
    this.unparsed |= aggregatedNodesItem.unparsed;
    return this;
  }

  /**
   * Nodes aggregated into this node (for "other" type).
   *
   * @return aggregatedNodes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATED_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsSankeyAggregatedNode> getAggregatedNodes() {
    return aggregatedNodes;
  }

  public void setAggregatedNodes(List<ProductAnalyticsSankeyAggregatedNode> aggregatedNodes) {
    this.aggregatedNodes = aggregatedNodes;
  }

  public ProductAnalyticsSankeyNode column(Long column) {
    this.column = column;
    return this;
  }

  /**
   * The step column (0-indexed).
   *
   * @return column
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getColumn() {
    return column;
  }

  public void setColumn(Long column) {
    this.column = column;
  }

  public ProductAnalyticsSankeyNode dropoffValue(Long dropoffValue) {
    this.dropoffValue = dropoffValue;
    return this;
  }

  /**
   * GetdropoffValue
   *
   * @return dropoffValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DROPOFF_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDropoffValue() {
    return dropoffValue;
  }

  public void setDropoffValue(Long dropoffValue) {
    this.dropoffValue = dropoffValue;
  }

  public ProductAnalyticsSankeyNode id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Getid
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductAnalyticsSankeyNode incomingValue(Long incomingValue) {
    this.incomingValue = incomingValue;
    return this;
  }

  /**
   * GetincomingValue
   *
   * @return incomingValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCOMING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIncomingValue() {
    return incomingValue;
  }

  public void setIncomingValue(Long incomingValue) {
    this.incomingValue = incomingValue;
  }

  public ProductAnalyticsSankeyNode name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The page name.
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

  public ProductAnalyticsSankeyNode outgoingValue(Long outgoingValue) {
    this.outgoingValue = outgoingValue;
    return this;
  }

  /**
   * GetoutgoingValue
   *
   * @return outgoingValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTGOING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOutgoingValue() {
    return outgoingValue;
  }

  public void setOutgoingValue(Long outgoingValue) {
    this.outgoingValue = outgoingValue;
  }

  public ProductAnalyticsSankeyNode type(ProductAnalyticsSankeyNodeType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Node type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsSankeyNodeType getType() {
    return type;
  }

  public void setType(ProductAnalyticsSankeyNodeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ProductAnalyticsSankeyNode value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * The number of sessions through this node.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
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
   * @return ProductAnalyticsSankeyNode
   */
  @JsonAnySetter
  public ProductAnalyticsSankeyNode putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsSankeyNode object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsSankeyNode productAnalyticsSankeyNode = (ProductAnalyticsSankeyNode) o;
    return Objects.equals(this.aggregatedNodes, productAnalyticsSankeyNode.aggregatedNodes)
        && Objects.equals(this.column, productAnalyticsSankeyNode.column)
        && Objects.equals(this.dropoffValue, productAnalyticsSankeyNode.dropoffValue)
        && Objects.equals(this.id, productAnalyticsSankeyNode.id)
        && Objects.equals(this.incomingValue, productAnalyticsSankeyNode.incomingValue)
        && Objects.equals(this.name, productAnalyticsSankeyNode.name)
        && Objects.equals(this.outgoingValue, productAnalyticsSankeyNode.outgoingValue)
        && Objects.equals(this.type, productAnalyticsSankeyNode.type)
        && Objects.equals(this.value, productAnalyticsSankeyNode.value)
        && Objects.equals(
            this.additionalProperties, productAnalyticsSankeyNode.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregatedNodes,
        column,
        dropoffValue,
        id,
        incomingValue,
        name,
        outgoingValue,
        type,
        value,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsSankeyNode {\n");
    sb.append("    aggregatedNodes: ").append(toIndentedString(aggregatedNodes)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    dropoffValue: ").append(toIndentedString(dropoffValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incomingValue: ").append(toIndentedString(incomingValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outgoingValue: ").append(toIndentedString(outgoingValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
