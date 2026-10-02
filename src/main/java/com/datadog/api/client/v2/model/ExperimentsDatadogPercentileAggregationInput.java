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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Settings for a percentile aggregation that uses a Datadog measure. The other measure must be
 * omitted or null.
 */
@JsonPropertyOrder({
  ExperimentsDatadogPercentileAggregationInput.JSON_PROPERTY_DATADOG_METRIC_MEASURE,
  ExperimentsDatadogPercentileAggregationInput.JSON_PROPERTY_PERCENTILE,
  ExperimentsDatadogPercentileAggregationInput.JSON_PROPERTY_PROPERTY_FILTERS,
  ExperimentsDatadogPercentileAggregationInput.JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsDatadogPercentileAggregationInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATADOG_METRIC_MEASURE = "datadog_metric_measure";
  private ExperimentsDatadogPercentileMeasureInput datadogMetricMeasure;

  public static final String JSON_PROPERTY_PERCENTILE = "percentile";
  private Double percentile;

  public static final String JSON_PROPERTY_PROPERTY_FILTERS = "property_filters";
  private JsonNullable<List<List<ExperimentsPropertyFilterInput>>> propertyFilters =
      JsonNullable.<List<List<ExperimentsPropertyFilterInput>>>undefined();

  public static final String JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE = "warehouse_metric_measure";
  private JsonNullable<ExperimentsNullableWarehouseMetricMeasureInput> warehouseMetricMeasure =
      JsonNullable.<ExperimentsNullableWarehouseMetricMeasureInput>undefined();

  public ExperimentsDatadogPercentileAggregationInput() {}

  @JsonCreator
  public ExperimentsDatadogPercentileAggregationInput(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATADOG_METRIC_MEASURE)
          ExperimentsDatadogPercentileMeasureInput datadogMetricMeasure,
      @JsonProperty(required = true, value = JSON_PROPERTY_PERCENTILE) Double percentile) {
    this.datadogMetricMeasure = datadogMetricMeasure;
    this.unparsed |= datadogMetricMeasure.unparsed;
    this.percentile = percentile;
  }

  public ExperimentsDatadogPercentileAggregationInput datadogMetricMeasure(
      ExperimentsDatadogPercentileMeasureInput datadogMetricMeasure) {
    this.datadogMetricMeasure = datadogMetricMeasure;
    this.unparsed |= datadogMetricMeasure.unparsed;
    return this;
  }

  /**
   * Datadog measure used to calculate a percentile.
   *
   * @return datadogMetricMeasure
   */
  @JsonProperty(JSON_PROPERTY_DATADOG_METRIC_MEASURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsDatadogPercentileMeasureInput getDatadogMetricMeasure() {
    return datadogMetricMeasure;
  }

  public void setDatadogMetricMeasure(
      ExperimentsDatadogPercentileMeasureInput datadogMetricMeasure) {
    this.datadogMetricMeasure = datadogMetricMeasure;
    if (datadogMetricMeasure != null) {
      this.unparsed |= datadogMetricMeasure.unparsed;
    }
  }

  public ExperimentsDatadogPercentileAggregationInput percentile(Double percentile) {
    this.percentile = percentile;
    return this;
  }

  /**
   * Percentile to calculate from the measure values. minimum: 0 maximum: 1
   *
   * @return percentile
   */
  @JsonProperty(JSON_PROPERTY_PERCENTILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getPercentile() {
    return percentile;
  }

  public void setPercentile(Double percentile) {
    this.percentile = percentile;
  }

  public ExperimentsDatadogPercentileAggregationInput propertyFilters(
      List<List<ExperimentsPropertyFilterInput>> propertyFilters) {
    this.propertyFilters =
        JsonNullable.<List<List<ExperimentsPropertyFilterInput>>>of(propertyFilters);
    return this;
  }

  public ExperimentsDatadogPercentileAggregationInput addPropertyFiltersItem(
      List<ExperimentsPropertyFilterInput> propertyFiltersItem) {
    if (this.propertyFilters == null || !this.propertyFilters.isPresent()) {
      this.propertyFilters =
          JsonNullable.<List<List<ExperimentsPropertyFilterInput>>>of(new ArrayList<>());
    }
    try {
      this.propertyFilters.get().add(propertyFiltersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Property filters that select data for the percentile calculation.
   *
   * @return propertyFilters
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<List<ExperimentsPropertyFilterInput>> getPropertyFilters() {
    return propertyFilters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<List<ExperimentsPropertyFilterInput>>>
      getPropertyFilters_JsonNullable() {
    return propertyFilters;
  }

  @JsonProperty(JSON_PROPERTY_PROPERTY_FILTERS)
  public void setPropertyFilters_JsonNullable(
      JsonNullable<List<List<ExperimentsPropertyFilterInput>>> propertyFilters) {
    this.propertyFilters = propertyFilters;
  }

  public void setPropertyFilters(List<List<ExperimentsPropertyFilterInput>> propertyFilters) {
    this.propertyFilters =
        JsonNullable.<List<List<ExperimentsPropertyFilterInput>>>of(propertyFilters);
  }

  public ExperimentsDatadogPercentileAggregationInput warehouseMetricMeasure(
      ExperimentsNullableWarehouseMetricMeasureInput warehouseMetricMeasure) {
    this.warehouseMetricMeasure =
        JsonNullable.<ExperimentsNullableWarehouseMetricMeasureInput>of(warehouseMetricMeasure);
    return this;
  }

  /**
   * Optional warehouse measure. Use null when the other measure is selected.
   *
   * @return warehouseMetricMeasure
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsNullableWarehouseMetricMeasureInput getWarehouseMetricMeasure() {
    return warehouseMetricMeasure.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsNullableWarehouseMetricMeasureInput>
      getWarehouseMetricMeasure_JsonNullable() {
    return warehouseMetricMeasure;
  }

  @JsonProperty(JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE)
  public void setWarehouseMetricMeasure_JsonNullable(
      JsonNullable<ExperimentsNullableWarehouseMetricMeasureInput> warehouseMetricMeasure) {
    this.warehouseMetricMeasure = warehouseMetricMeasure;
  }

  public void setWarehouseMetricMeasure(
      ExperimentsNullableWarehouseMetricMeasureInput warehouseMetricMeasure) {
    this.warehouseMetricMeasure =
        JsonNullable.<ExperimentsNullableWarehouseMetricMeasureInput>of(warehouseMetricMeasure);
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
   * @return ExperimentsDatadogPercentileAggregationInput
   */
  @JsonAnySetter
  public ExperimentsDatadogPercentileAggregationInput putAdditionalProperty(
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

  /** Return true if this ExperimentsDatadogPercentileAggregationInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsDatadogPercentileAggregationInput experimentsDatadogPercentileAggregationInput =
        (ExperimentsDatadogPercentileAggregationInput) o;
    return Objects.equals(
            this.datadogMetricMeasure,
            experimentsDatadogPercentileAggregationInput.datadogMetricMeasure)
        && Objects.equals(this.percentile, experimentsDatadogPercentileAggregationInput.percentile)
        && Objects.equals(
            this.propertyFilters, experimentsDatadogPercentileAggregationInput.propertyFilters)
        && Objects.equals(
            this.warehouseMetricMeasure,
            experimentsDatadogPercentileAggregationInput.warehouseMetricMeasure)
        && Objects.equals(
            this.additionalProperties,
            experimentsDatadogPercentileAggregationInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datadogMetricMeasure,
        percentile,
        propertyFilters,
        warehouseMetricMeasure,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsDatadogPercentileAggregationInput {\n");
    sb.append("    datadogMetricMeasure: ")
        .append(toIndentedString(datadogMetricMeasure))
        .append("\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    propertyFilters: ").append(toIndentedString(propertyFilters)).append("\n");
    sb.append("    warehouseMetricMeasure: ")
        .append(toIndentedString(warehouseMetricMeasure))
        .append("\n");
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
