/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
import org.openapitools.jackson.nullable.JsonNullable;

/** Query metadata. */
@JsonPropertyOrder({
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_AGGR,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_EXPRESSION,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_METRIC,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_QUERY_INDEX,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_SCOPE,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOHistoryMetricsSeriesMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGR = "aggr";
  private String aggr;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_QUERY_INDEX = "query_index";
  private Long queryIndex;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private JsonNullable<List<SLOHistoryMetricsSeriesMetadataUnit>> unit =
      JsonNullable.<List<SLOHistoryMetricsSeriesMetadataUnit>>undefined();

  public SLOHistoryMetricsSeriesMetadata aggr(String aggr) {
    this.aggr = aggr;
    return this;
  }

  /**
   * Query aggregator function.
   *
   * @return aggr
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAggr() {
    return aggr;
  }

  @Deprecated
  public void setAggr(String aggr) {
    this.aggr = aggr;
  }

  public SLOHistoryMetricsSeriesMetadata expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Query expression.
   *
   * @return expression
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpression() {
    return expression;
  }

  @Deprecated
  public void setExpression(String expression) {
    this.expression = expression;
  }

  public SLOHistoryMetricsSeriesMetadata metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Query metric used.
   *
   * @return metric
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetric() {
    return metric;
  }

  @Deprecated
  public void setMetric(String metric) {
    this.metric = metric;
  }

  public SLOHistoryMetricsSeriesMetadata queryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
    return this;
  }

  /**
   * Query index from original combined query.
   *
   * @return queryIndex
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getQueryIndex() {
    return queryIndex;
  }

  @Deprecated
  public void setQueryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
  }

  public SLOHistoryMetricsSeriesMetadata scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Query scope.
   *
   * @return scope
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }

  @Deprecated
  public void setScope(String scope) {
    this.scope = scope;
  }

  public SLOHistoryMetricsSeriesMetadata unit(List<SLOHistoryMetricsSeriesMetadataUnit> unit) {
    this.unit = JsonNullable.<List<SLOHistoryMetricsSeriesMetadataUnit>>of(unit);
    return this;
  }

  public SLOHistoryMetricsSeriesMetadata addUnitItem(SLOHistoryMetricsSeriesMetadataUnit unitItem) {
    if (this.unit == null || !this.unit.isPresent()) {
      this.unit = JsonNullable.<List<SLOHistoryMetricsSeriesMetadataUnit>>of(new ArrayList<>());
    }
    try {
      this.unit.get().add(unitItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * An array of metric units that contains up to two unit objects. For example, bytes represents
   * one unit object and bytes per second represents two unit objects. If a metric query only has
   * one unit object, the second array element is null.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<SLOHistoryMetricsSeriesMetadataUnit> getUnit() {
    return unit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SLOHistoryMetricsSeriesMetadataUnit>> getUnit_JsonNullable() {
    return unit;
  }

  @JsonProperty(JSON_PROPERTY_UNIT)
  public void setUnit_JsonNullable(JsonNullable<List<SLOHistoryMetricsSeriesMetadataUnit>> unit) {
    this.unit = unit;
  }

  public void setUnit(List<SLOHistoryMetricsSeriesMetadataUnit> unit) {
    this.unit = JsonNullable.<List<SLOHistoryMetricsSeriesMetadataUnit>>of(unit);
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
   * @return SLOHistoryMetricsSeriesMetadata
   */
  @JsonAnySetter
  public SLOHistoryMetricsSeriesMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SLOHistoryMetricsSeriesMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryMetricsSeriesMetadata sloHistoryMetricsSeriesMetadata =
        (SLOHistoryMetricsSeriesMetadata) o;
    return Objects.equals(this.aggr, sloHistoryMetricsSeriesMetadata.aggr)
        && Objects.equals(this.expression, sloHistoryMetricsSeriesMetadata.expression)
        && Objects.equals(this.metric, sloHistoryMetricsSeriesMetadata.metric)
        && Objects.equals(this.queryIndex, sloHistoryMetricsSeriesMetadata.queryIndex)
        && Objects.equals(this.scope, sloHistoryMetricsSeriesMetadata.scope)
        && Objects.equals(this.unit, sloHistoryMetricsSeriesMetadata.unit)
        && Objects.equals(
            this.additionalProperties, sloHistoryMetricsSeriesMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggr, expression, metric, queryIndex, scope, unit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistoryMetricsSeriesMetadata {\n");
    sb.append("    aggr: ").append(toIndentedString(aggr)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    queryIndex: ").append(toIndentedString(queryIndex)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
