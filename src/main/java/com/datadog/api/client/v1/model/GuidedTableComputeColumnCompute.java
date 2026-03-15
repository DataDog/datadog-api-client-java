/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Aggregation configuration. */
@JsonPropertyOrder({
  GuidedTableComputeColumnCompute.JSON_PROPERTY_AGGREGATION,
  GuidedTableComputeColumnCompute.JSON_PROPERTY_FILTER,
  GuidedTableComputeColumnCompute.JSON_PROPERTY_PROPERTY,
  GuidedTableComputeColumnCompute.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableComputeColumnCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public GuidedTableComputeColumnCompute() {}

  @JsonCreator
  public GuidedTableComputeColumnCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION) String aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.aggregation = aggregation;
    this.query = query;
  }

  public GuidedTableComputeColumnCompute aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Aggregation type (e.g. <code>avg</code>, <code>sum</code>, <code>count</code>).
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAggregation() {
    return aggregation;
  }

  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }

  public GuidedTableComputeColumnCompute filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Additional filter criteria.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public GuidedTableComputeColumnCompute property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Attribute to aggregate on. Depends on the data source (e.g. a log attribute).
   *
   * @return property
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public GuidedTableComputeColumnCompute query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Name of the source query.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
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
   * @return GuidedTableComputeColumnCompute
   */
  @JsonAnySetter
  public GuidedTableComputeColumnCompute putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableComputeColumnCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableComputeColumnCompute guidedTableComputeColumnCompute =
        (GuidedTableComputeColumnCompute) o;
    return Objects.equals(this.aggregation, guidedTableComputeColumnCompute.aggregation)
        && Objects.equals(this.filter, guidedTableComputeColumnCompute.filter)
        && Objects.equals(this.property, guidedTableComputeColumnCompute.property)
        && Objects.equals(this.query, guidedTableComputeColumnCompute.query)
        && Objects.equals(
            this.additionalProperties, guidedTableComputeColumnCompute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, filter, property, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableComputeColumnCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
