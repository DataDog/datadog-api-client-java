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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A node aggregated into an "other" node. */
@JsonPropertyOrder({
  ProductAnalyticsSankeyAggregatedNode.JSON_PROPERTY_ID,
  ProductAnalyticsSankeyAggregatedNode.JSON_PROPERTY_INCOMING_VALUE,
  ProductAnalyticsSankeyAggregatedNode.JSON_PROPERTY_NAME,
  ProductAnalyticsSankeyAggregatedNode.JSON_PROPERTY_OUTGOING_VALUE,
  ProductAnalyticsSankeyAggregatedNode.JSON_PROPERTY_TYPE,
  ProductAnalyticsSankeyAggregatedNode.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsSankeyAggregatedNode {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCOMING_VALUE = "incoming_value";
  private Long incomingValue;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OUTGOING_VALUE = "outgoing_value";
  private Long outgoingValue;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsSankeyAggregatedNodeType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public ProductAnalyticsSankeyAggregatedNode id(String id) {
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

  public ProductAnalyticsSankeyAggregatedNode incomingValue(Long incomingValue) {
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

  public ProductAnalyticsSankeyAggregatedNode name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Getname
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

  public ProductAnalyticsSankeyAggregatedNode outgoingValue(Long outgoingValue) {
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

  public ProductAnalyticsSankeyAggregatedNode type(ProductAnalyticsSankeyAggregatedNodeType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Gettype
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsSankeyAggregatedNodeType getType() {
    return type;
  }

  public void setType(ProductAnalyticsSankeyAggregatedNodeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ProductAnalyticsSankeyAggregatedNode value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * Getvalue
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
   * @return ProductAnalyticsSankeyAggregatedNode
   */
  @JsonAnySetter
  public ProductAnalyticsSankeyAggregatedNode putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsSankeyAggregatedNode object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsSankeyAggregatedNode productAnalyticsSankeyAggregatedNode =
        (ProductAnalyticsSankeyAggregatedNode) o;
    return Objects.equals(this.id, productAnalyticsSankeyAggregatedNode.id)
        && Objects.equals(this.incomingValue, productAnalyticsSankeyAggregatedNode.incomingValue)
        && Objects.equals(this.name, productAnalyticsSankeyAggregatedNode.name)
        && Objects.equals(this.outgoingValue, productAnalyticsSankeyAggregatedNode.outgoingValue)
        && Objects.equals(this.type, productAnalyticsSankeyAggregatedNode.type)
        && Objects.equals(this.value, productAnalyticsSankeyAggregatedNode.value)
        && Objects.equals(
            this.additionalProperties, productAnalyticsSankeyAggregatedNode.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, incomingValue, name, outgoingValue, type, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsSankeyAggregatedNode {\n");
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
