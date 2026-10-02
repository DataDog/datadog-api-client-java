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
 * Settings for a percentile aggregation that uses a Warehouse measure. The other measure must be
 * omitted or null.
 */
@JsonPropertyOrder({
  ExperimentsWarehousePercentileAggregationInput.JSON_PROPERTY_DATADOG_METRIC_MEASURE,
  ExperimentsWarehousePercentileAggregationInput.JSON_PROPERTY_PERCENTILE,
  ExperimentsWarehousePercentileAggregationInput.JSON_PROPERTY_PROPERTY_FILTERS,
  ExperimentsWarehousePercentileAggregationInput.JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsWarehousePercentileAggregationInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATADOG_METRIC_MEASURE = "datadog_metric_measure";
  private JsonNullable<ExperimentsNullableDatadogPercentileMeasureInput> datadogMetricMeasure =
      JsonNullable.<ExperimentsNullableDatadogPercentileMeasureInput>undefined();

  public static final String JSON_PROPERTY_PERCENTILE = "percentile";
  private Double percentile;

  public static final String JSON_PROPERTY_PROPERTY_FILTERS = "property_filters";
  private JsonNullable<List<List<ExperimentsPropertyFilterInput>>> propertyFilters =
      JsonNullable.<List<List<ExperimentsPropertyFilterInput>>>undefined();

  public static final String JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE = "warehouse_metric_measure";
  private ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregationWarehouseMetricMeasure
      warehouseMetricMeasure;

  public ExperimentsWarehousePercentileAggregationInput() {}

  @JsonCreator
  public ExperimentsWarehousePercentileAggregationInput(
      @JsonProperty(required = true, value = JSON_PROPERTY_PERCENTILE) Double percentile,
      @JsonProperty(required = true, value = JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE)
          ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregationWarehouseMetricMeasure
              warehouseMetricMeasure) {
    this.percentile = percentile;
    this.warehouseMetricMeasure = warehouseMetricMeasure;
    this.unparsed |= warehouseMetricMeasure.unparsed;
  }

  public ExperimentsWarehousePercentileAggregationInput datadogMetricMeasure(
      ExperimentsNullableDatadogPercentileMeasureInput datadogMetricMeasure) {
    this.datadogMetricMeasure =
        JsonNullable.<ExperimentsNullableDatadogPercentileMeasureInput>of(datadogMetricMeasure);
    return this;
  }

  /**
   * Optional Datadog percentile measure. Use null when the warehouse measure is selected.
   *
   * @return datadogMetricMeasure
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsNullableDatadogPercentileMeasureInput getDatadogMetricMeasure() {
    return datadogMetricMeasure.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_METRIC_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsNullableDatadogPercentileMeasureInput>
      getDatadogMetricMeasure_JsonNullable() {
    return datadogMetricMeasure;
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_METRIC_MEASURE)
  public void setDatadogMetricMeasure_JsonNullable(
      JsonNullable<ExperimentsNullableDatadogPercentileMeasureInput> datadogMetricMeasure) {
    this.datadogMetricMeasure = datadogMetricMeasure;
  }

  public void setDatadogMetricMeasure(
      ExperimentsNullableDatadogPercentileMeasureInput datadogMetricMeasure) {
    this.datadogMetricMeasure =
        JsonNullable.<ExperimentsNullableDatadogPercentileMeasureInput>of(datadogMetricMeasure);
  }

  public ExperimentsWarehousePercentileAggregationInput percentile(Double percentile) {
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

  public ExperimentsWarehousePercentileAggregationInput propertyFilters(
      List<List<ExperimentsPropertyFilterInput>> propertyFilters) {
    this.propertyFilters =
        JsonNullable.<List<List<ExperimentsPropertyFilterInput>>>of(propertyFilters);
    return this;
  }

  public ExperimentsWarehousePercentileAggregationInput addPropertyFiltersItem(
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

  public ExperimentsWarehousePercentileAggregationInput warehouseMetricMeasure(
      ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregationWarehouseMetricMeasure
          warehouseMetricMeasure) {
    this.warehouseMetricMeasure = warehouseMetricMeasure;
    this.unparsed |= warehouseMetricMeasure.unparsed;
    return this;
  }

  /**
   * Reference to a measure defined in a warehouse metric SQL model.
   *
   * @return warehouseMetricMeasure
   */
  @JsonProperty(JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregationWarehouseMetricMeasure
      getWarehouseMetricMeasure() {
    return warehouseMetricMeasure;
  }

  public void setWarehouseMetricMeasure(
      ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregationWarehouseMetricMeasure
          warehouseMetricMeasure) {
    this.warehouseMetricMeasure = warehouseMetricMeasure;
    if (warehouseMetricMeasure != null) {
      this.unparsed |= warehouseMetricMeasure.unparsed;
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
   * @return ExperimentsWarehousePercentileAggregationInput
   */
  @JsonAnySetter
  public ExperimentsWarehousePercentileAggregationInput putAdditionalProperty(
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

  /** Return true if this ExperimentsWarehousePercentileAggregationInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsWarehousePercentileAggregationInput experimentsWarehousePercentileAggregationInput =
        (ExperimentsWarehousePercentileAggregationInput) o;
    return Objects.equals(
            this.datadogMetricMeasure,
            experimentsWarehousePercentileAggregationInput.datadogMetricMeasure)
        && Objects.equals(
            this.percentile, experimentsWarehousePercentileAggregationInput.percentile)
        && Objects.equals(
            this.propertyFilters, experimentsWarehousePercentileAggregationInput.propertyFilters)
        && Objects.equals(
            this.warehouseMetricMeasure,
            experimentsWarehousePercentileAggregationInput.warehouseMetricMeasure)
        && Objects.equals(
            this.additionalProperties,
            experimentsWarehousePercentileAggregationInput.additionalProperties);
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
    sb.append("class ExperimentsWarehousePercentileAggregationInput {\n");
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
