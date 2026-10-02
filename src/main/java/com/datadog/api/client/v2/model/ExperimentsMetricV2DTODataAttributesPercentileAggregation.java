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

/** Source measure and settings for a percentile metric. */
@JsonPropertyOrder({
  ExperimentsMetricV2DTODataAttributesPercentileAggregation.JSON_PROPERTY_DATADOG_METRIC_MEASURE,
  ExperimentsMetricV2DTODataAttributesPercentileAggregation.JSON_PROPERTY_PERCENTILE,
  ExperimentsMetricV2DTODataAttributesPercentileAggregation.JSON_PROPERTY_PIPELINE_COLUMN_SUFFIX,
  ExperimentsMetricV2DTODataAttributesPercentileAggregation.JSON_PROPERTY_PROPERTY_FILTERS,
  ExperimentsMetricV2DTODataAttributesPercentileAggregation.JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricV2DTODataAttributesPercentileAggregation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATADOG_METRIC_MEASURE = "datadog_metric_measure";
  private ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      datadogMetricMeasure;

  public static final String JSON_PROPERTY_PERCENTILE = "percentile";
  private Double percentile;

  public static final String JSON_PROPERTY_PIPELINE_COLUMN_SUFFIX = "pipeline_column_suffix";
  private String pipelineColumnSuffix;

  public static final String JSON_PROPERTY_PROPERTY_FILTERS = "property_filters";
  private List<List<ExperimentsMetricPropertyFilter>> propertyFilters = null;

  public static final String JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE = "warehouse_metric_measure";
  private ExperimentsMetricV2DTODataAttributesPercentileAggregationWarehouseMetricMeasure
      warehouseMetricMeasure;

  public ExperimentsMetricV2DTODataAttributesPercentileAggregation datadogMetricMeasure(
      ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
          datadogMetricMeasure) {
    this.datadogMetricMeasure = datadogMetricMeasure;
    this.unparsed |= datadogMetricMeasure.unparsed;
    return this;
  }

  /**
   * Datadog source and query that supply values for the metric.
   *
   * @return datadogMetricMeasure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATADOG_METRIC_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      getDatadogMetricMeasure() {
    return datadogMetricMeasure;
  }

  public void setDatadogMetricMeasure(
      ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
          datadogMetricMeasure) {
    this.datadogMetricMeasure = datadogMetricMeasure;
    if (datadogMetricMeasure != null) {
      this.unparsed |= datadogMetricMeasure.unparsed;
    }
  }

  public ExperimentsMetricV2DTODataAttributesPercentileAggregation percentile(Double percentile) {
    this.percentile = percentile;
    return this;
  }

  /**
   * Percentile calculated from the selected measure.
   *
   * @return percentile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPercentile() {
    return percentile;
  }

  public void setPercentile(Double percentile) {
    this.percentile = percentile;
  }

  public ExperimentsMetricV2DTODataAttributesPercentileAggregation pipelineColumnSuffix(
      String pipelineColumnSuffix) {
    this.pipelineColumnSuffix = pipelineColumnSuffix;
    return this;
  }

  /**
   * Suffix used to identify this value in pipeline output columns.
   *
   * @return pipelineColumnSuffix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIPELINE_COLUMN_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPipelineColumnSuffix() {
    return pipelineColumnSuffix;
  }

  public void setPipelineColumnSuffix(String pipelineColumnSuffix) {
    this.pipelineColumnSuffix = pipelineColumnSuffix;
  }

  public ExperimentsMetricV2DTODataAttributesPercentileAggregation propertyFilters(
      List<List<ExperimentsMetricPropertyFilter>> propertyFilters) {
    this.propertyFilters = propertyFilters;
    return this;
  }

  public ExperimentsMetricV2DTODataAttributesPercentileAggregation addPropertyFiltersItem(
      List<ExperimentsMetricPropertyFilter> propertyFiltersItem) {
    if (this.propertyFilters == null) {
      this.propertyFilters = new ArrayList<>();
    }
    this.propertyFilters.add(propertyFiltersItem);
    return this;
  }

  /**
   * Filters applied to the metric aggregation.
   *
   * @return propertyFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<ExperimentsMetricPropertyFilter>> getPropertyFilters() {
    return propertyFilters;
  }

  public void setPropertyFilters(List<List<ExperimentsMetricPropertyFilter>> propertyFilters) {
    this.propertyFilters = propertyFilters;
  }

  public ExperimentsMetricV2DTODataAttributesPercentileAggregation warehouseMetricMeasure(
      ExperimentsMetricV2DTODataAttributesPercentileAggregationWarehouseMetricMeasure
          warehouseMetricMeasure) {
    this.warehouseMetricMeasure = warehouseMetricMeasure;
    this.unparsed |= warehouseMetricMeasure.unparsed;
    return this;
  }

  /**
   * Warehouse measure that supplies values for the metric.
   *
   * @return warehouseMetricMeasure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsMetricV2DTODataAttributesPercentileAggregationWarehouseMetricMeasure
      getWarehouseMetricMeasure() {
    return warehouseMetricMeasure;
  }

  public void setWarehouseMetricMeasure(
      ExperimentsMetricV2DTODataAttributesPercentileAggregationWarehouseMetricMeasure
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
   * @return ExperimentsMetricV2DTODataAttributesPercentileAggregation
   */
  @JsonAnySetter
  public ExperimentsMetricV2DTODataAttributesPercentileAggregation putAdditionalProperty(
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

  /**
   * Return true if this ExperimentsMetricV2DTODataAttributesPercentileAggregation object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricV2DTODataAttributesPercentileAggregation
        experimentsMetricV2DtoDataAttributesPercentileAggregation =
            (ExperimentsMetricV2DTODataAttributesPercentileAggregation) o;
    return Objects.equals(
            this.datadogMetricMeasure,
            experimentsMetricV2DtoDataAttributesPercentileAggregation.datadogMetricMeasure)
        && Objects.equals(
            this.percentile, experimentsMetricV2DtoDataAttributesPercentileAggregation.percentile)
        && Objects.equals(
            this.pipelineColumnSuffix,
            experimentsMetricV2DtoDataAttributesPercentileAggregation.pipelineColumnSuffix)
        && Objects.equals(
            this.propertyFilters,
            experimentsMetricV2DtoDataAttributesPercentileAggregation.propertyFilters)
        && Objects.equals(
            this.warehouseMetricMeasure,
            experimentsMetricV2DtoDataAttributesPercentileAggregation.warehouseMetricMeasure)
        && Objects.equals(
            this.additionalProperties,
            experimentsMetricV2DtoDataAttributesPercentileAggregation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datadogMetricMeasure,
        percentile,
        pipelineColumnSuffix,
        propertyFilters,
        warehouseMetricMeasure,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricV2DTODataAttributesPercentileAggregation {\n");
    sb.append("    datadogMetricMeasure: ")
        .append(toIndentedString(datadogMetricMeasure))
        .append("\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    pipelineColumnSuffix: ")
        .append(toIndentedString(pipelineColumnSuffix))
        .append("\n");
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
