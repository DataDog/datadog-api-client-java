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

/** Defines the steps of the journey and the filters applied to it. */
@JsonPropertyOrder({
  ProductAnalyticsJourneySearch.JSON_PROPERTY_EXPRESSION,
  ProductAnalyticsJourneySearch.JSON_PROPERTY_FILTERS,
  ProductAnalyticsJourneySearch.JSON_PROPERTY_JOIN_KEYS,
  ProductAnalyticsJourneySearch.JSON_PROPERTY_NODE_OBJECTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneySearch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private ProductAnalyticsJourneySearchFilters filters;

  public static final String JSON_PROPERTY_JOIN_KEYS = "join_keys";
  private ProductAnalyticsJoinKeys joinKeys;

  public static final String JSON_PROPERTY_NODE_OBJECTS = "node_objects";
  private Map<String, ProductAnalyticsBaseQuery> nodeObjects =
      new HashMap<String, ProductAnalyticsBaseQuery>();

  public ProductAnalyticsJourneySearch() {}

  @JsonCreator
  public ProductAnalyticsJourneySearch(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression,
      @JsonProperty(required = true, value = JSON_PROPERTY_NODE_OBJECTS)
          Map<String, ProductAnalyticsBaseQuery> nodeObjects) {
    this.expression = expression;
    this.nodeObjects = nodeObjects;
  }

  public ProductAnalyticsJourneySearch expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Expression combining the node aliases in order, for example <code>A -&gt; B -&gt; C</code>.
   *
   * @return expression
   */
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public ProductAnalyticsJourneySearch filters(ProductAnalyticsJourneySearchFilters filters) {
    this.filters = filters;
    this.unparsed |= filters.unparsed;
    return this;
  }

  /**
   * Filters applied on top of the journey step expression.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsJourneySearchFilters getFilters() {
    return filters;
  }

  public void setFilters(ProductAnalyticsJourneySearchFilters filters) {
    this.filters = filters;
    if (filters != null) {
      this.unparsed |= filters.unparsed;
    }
  }

  public ProductAnalyticsJourneySearch joinKeys(ProductAnalyticsJoinKeys joinKeys) {
    this.joinKeys = joinKeys;
    this.unparsed |= joinKeys.unparsed;
    return this;
  }

  /**
   * Identity join keys used to stitch events belonging to the same user or session.
   *
   * @return joinKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOIN_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsJoinKeys getJoinKeys() {
    return joinKeys;
  }

  public void setJoinKeys(ProductAnalyticsJoinKeys joinKeys) {
    this.joinKeys = joinKeys;
    if (joinKeys != null) {
      this.unparsed |= joinKeys.unparsed;
    }
  }

  public ProductAnalyticsJourneySearch nodeObjects(
      Map<String, ProductAnalyticsBaseQuery> nodeObjects) {
    this.nodeObjects = nodeObjects;
    return this;
  }

  public ProductAnalyticsJourneySearch putNodeObjectsItem(
      String key, ProductAnalyticsBaseQuery nodeObjectsItem) {
    this.nodeObjects.put(key, nodeObjectsItem);
    return this;
  }

  /**
   * Map of node alias to the query matching that step of the journey. Every alias used in <code>
   * expression</code> must have an entry here.
   *
   * @return nodeObjects
   */
  @JsonProperty(JSON_PROPERTY_NODE_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, ProductAnalyticsBaseQuery> getNodeObjects() {
    return nodeObjects;
  }

  public void setNodeObjects(Map<String, ProductAnalyticsBaseQuery> nodeObjects) {
    this.nodeObjects = nodeObjects;
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
   * @return ProductAnalyticsJourneySearch
   */
  @JsonAnySetter
  public ProductAnalyticsJourneySearch putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsJourneySearch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneySearch productAnalyticsJourneySearch = (ProductAnalyticsJourneySearch) o;
    return Objects.equals(this.expression, productAnalyticsJourneySearch.expression)
        && Objects.equals(this.filters, productAnalyticsJourneySearch.filters)
        && Objects.equals(this.joinKeys, productAnalyticsJourneySearch.joinKeys)
        && Objects.equals(this.nodeObjects, productAnalyticsJourneySearch.nodeObjects)
        && Objects.equals(
            this.additionalProperties, productAnalyticsJourneySearch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, filters, joinKeys, nodeObjects, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneySearch {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    joinKeys: ").append(toIndentedString(joinKeys)).append("\n");
    sb.append("    nodeObjects: ").append(toIndentedString(nodeObjects)).append("\n");
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
