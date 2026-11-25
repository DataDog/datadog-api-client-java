/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ComputeTableColumnCompute.JSON_PROPERTY_AGGREGATION,
  ComputeTableColumnCompute.JSON_PROPERTY_FILTER,
  ComputeTableColumnCompute.JSON_PROPERTY_MODIFIERS,
  ComputeTableColumnCompute.JSON_PROPERTY_PROPERTY,
  ComputeTableColumnCompute.JSON_PROPERTY_QUERY,
  ComputeTableColumnCompute.JSON_PROPERTY_SCALAR_AGGREGATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ComputeTableColumnCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_MODIFIERS = "modifiers";
  private List<TableColumnModifier> modifiers = null;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SCALAR_AGGREGATION = "scalar_aggregation";
  private ScalarAggregator scalarAggregation;

  public ComputeTableColumnCompute() {}

  @JsonCreator
  public ComputeTableColumnCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION) String aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.aggregation = aggregation;
    this.query = query;
  }

  public ComputeTableColumnCompute aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ComputeTableColumnCompute filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ComputeTableColumnCompute modifiers(List<TableColumnModifier> modifiers) {
    this.modifiers = modifiers;
    if (modifiers != null) {
      for (TableColumnModifier item : modifiers) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ComputeTableColumnCompute addModifiersItem(TableColumnModifier modifiersItem) {
    if (this.modifiers == null) {
      this.modifiers = new ArrayList<>();
    }
    this.modifiers.add(modifiersItem);
    this.unparsed |= modifiersItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return modifiers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TableColumnModifier> getModifiers() {
    return modifiers;
  }

  public void setModifiers(List<TableColumnModifier> modifiers) {
    this.modifiers = modifiers;
    if (modifiers != null) {
      for (TableColumnModifier item : modifiers) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ComputeTableColumnCompute property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ComputeTableColumnCompute query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ComputeTableColumnCompute scalarAggregation(ScalarAggregator scalarAggregation) {
    this.scalarAggregation = scalarAggregation;
    this.unparsed |= !scalarAggregation.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return scalarAggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALAR_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScalarAggregator getScalarAggregation() {
    return scalarAggregation;
  }

  public void setScalarAggregation(ScalarAggregator scalarAggregation) {
    if (!scalarAggregation.isValid()) {
      this.unparsed = true;
    }
    this.scalarAggregation = scalarAggregation;
  }

  /** Return true if this ComputeTableColumnCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeTableColumnCompute computeTableColumnCompute = (ComputeTableColumnCompute) o;
    return Objects.equals(this.aggregation, computeTableColumnCompute.aggregation)
        && Objects.equals(this.filter, computeTableColumnCompute.filter)
        && Objects.equals(this.modifiers, computeTableColumnCompute.modifiers)
        && Objects.equals(this.property, computeTableColumnCompute.property)
        && Objects.equals(this.query, computeTableColumnCompute.query)
        && Objects.equals(this.scalarAggregation, computeTableColumnCompute.scalarAggregation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, filter, modifiers, property, query, scalarAggregation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeTableColumnCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    scalarAggregation: ").append(toIndentedString(scalarAggregation)).append("\n");
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
