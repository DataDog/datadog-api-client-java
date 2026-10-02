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

/** Source measure and aggregation settings for a metric value. */
@JsonPropertyOrder({
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_AGING_THRESHOLD_DAYS,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_DATADOG_METRIC_MEASURE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation
      .JSON_PROPERTY_ENABLE_AGING_SUBJECT_FILTER,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_OPERATION,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_PIPELINE_COLUMN_SUFFIX,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_PROPERTY_FILTERS,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_THRESHOLD_AGGREGATION_TYPE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_THRESHOLD_BREACH_VALUE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation
      .JSON_PROPERTY_THRESHOLD_COMPARISON_OPERATOR,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation
      .JSON_PROPERTY_THRESHOLD_TIMEFRAME_DIMENSION,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_THRESHOLD_TIMEFRAME_VALUE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_TIMEFRAME_END_VALUE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_TIMEFRAME_START_VALUE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_TIMEFRAME_UNIT,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_WINSOR_LOWER_FIXED_VALUE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_WINSOR_LOWER_PERCENTILE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_WINSOR_UPPER_FIXED_VALUE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_WINSOR_UPPER_PERCENTILE,
  ExperimentsMetricV2DTODataAttributesNumeratorAggregation.JSON_PROPERTY_WINSORIZATION_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricV2DTODataAttributesNumeratorAggregation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGING_THRESHOLD_DAYS = "aging_threshold_days";
  private Long agingThresholdDays;

  public static final String JSON_PROPERTY_DATADOG_METRIC_MEASURE = "datadog_metric_measure";
  private ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      datadogMetricMeasure;

  public static final String JSON_PROPERTY_ENABLE_AGING_SUBJECT_FILTER =
      "enable_aging_subject_filter";
  private Boolean enableAgingSubjectFilter;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_PIPELINE_COLUMN_SUFFIX = "pipeline_column_suffix";
  private String pipelineColumnSuffix;

  public static final String JSON_PROPERTY_PROPERTY_FILTERS = "property_filters";
  private List<List<ExperimentsMetricPropertyFilter>> propertyFilters = null;

  public static final String JSON_PROPERTY_THRESHOLD_AGGREGATION_TYPE =
      "threshold_aggregation_type";
  private String thresholdAggregationType;

  public static final String JSON_PROPERTY_THRESHOLD_BREACH_VALUE = "threshold_breach_value";
  private Double thresholdBreachValue;

  public static final String JSON_PROPERTY_THRESHOLD_COMPARISON_OPERATOR =
      "threshold_comparison_operator";
  private String thresholdComparisonOperator;

  public static final String JSON_PROPERTY_THRESHOLD_TIMEFRAME_DIMENSION =
      "threshold_timeframe_dimension";
  private String thresholdTimeframeDimension;

  public static final String JSON_PROPERTY_THRESHOLD_TIMEFRAME_VALUE = "threshold_timeframe_value";
  private Double thresholdTimeframeValue;

  public static final String JSON_PROPERTY_TIMEFRAME_END_VALUE = "timeframe_end_value";
  private Double timeframeEndValue;

  public static final String JSON_PROPERTY_TIMEFRAME_START_VALUE = "timeframe_start_value";
  private Double timeframeStartValue;

  public static final String JSON_PROPERTY_TIMEFRAME_UNIT = "timeframe_unit";
  private String timeframeUnit;

  public static final String JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE = "warehouse_metric_measure";
  private ExperimentsMetricV2DTODataAttributesPercentileAggregationWarehouseMetricMeasure
      warehouseMetricMeasure;

  public static final String JSON_PROPERTY_WINSOR_LOWER_FIXED_VALUE = "winsor_lower_fixed_value";
  private Double winsorLowerFixedValue;

  public static final String JSON_PROPERTY_WINSOR_LOWER_PERCENTILE = "winsor_lower_percentile";
  private Double winsorLowerPercentile;

  public static final String JSON_PROPERTY_WINSOR_UPPER_FIXED_VALUE = "winsor_upper_fixed_value";
  private Double winsorUpperFixedValue;

  public static final String JSON_PROPERTY_WINSOR_UPPER_PERCENTILE = "winsor_upper_percentile";
  private Double winsorUpperPercentile;

  public static final String JSON_PROPERTY_WINSORIZATION_STRATEGY = "winsorization_strategy";
  private String winsorizationStrategy;

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation agingThresholdDays(
      Long agingThresholdDays) {
    this.agingThresholdDays = agingThresholdDays;
    return this;
  }

  /**
   * Stored aging threshold in days. The subject aging filter uses the aggregation window end and
   * unit.
   *
   * @return agingThresholdDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGING_THRESHOLD_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAgingThresholdDays() {
    return agingThresholdDays;
  }

  public void setAgingThresholdDays(Long agingThresholdDays) {
    this.agingThresholdDays = agingThresholdDays;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation datadogMetricMeasure(
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

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation enableAgingSubjectFilter(
      Boolean enableAgingSubjectFilter) {
    this.enableAgingSubjectFilter = enableAgingSubjectFilter;
    return this;
  }

  /**
   * Whether to exclude subjects whose observation time is shorter than the aggregation window.
   *
   * @return enableAgingSubjectFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_AGING_SUBJECT_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnableAgingSubjectFilter() {
    return enableAgingSubjectFilter;
  }

  public void setEnableAgingSubjectFilter(Boolean enableAgingSubjectFilter) {
    this.enableAgingSubjectFilter = enableAgingSubjectFilter;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Aggregation applied to the selected measure.
   *
   * @return operation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation pipelineColumnSuffix(
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

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation propertyFilters(
      List<List<ExperimentsMetricPropertyFilter>> propertyFilters) {
    this.propertyFilters = propertyFilters;
    return this;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation addPropertyFiltersItem(
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

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation thresholdAggregationType(
      String thresholdAggregationType) {
    this.thresholdAggregationType = thresholdAggregationType;
    return this;
  }

  /**
   * Aggregation used to evaluate the threshold.
   *
   * @return thresholdAggregationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getThresholdAggregationType() {
    return thresholdAggregationType;
  }

  public void setThresholdAggregationType(String thresholdAggregationType) {
    this.thresholdAggregationType = thresholdAggregationType;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation thresholdBreachValue(
      Double thresholdBreachValue) {
    this.thresholdBreachValue = thresholdBreachValue;
    return this;
  }

  /**
   * Value used to determine whether the threshold is breached.
   *
   * @return thresholdBreachValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD_BREACH_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getThresholdBreachValue() {
    return thresholdBreachValue;
  }

  public void setThresholdBreachValue(Double thresholdBreachValue) {
    this.thresholdBreachValue = thresholdBreachValue;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation thresholdComparisonOperator(
      String thresholdComparisonOperator) {
    this.thresholdComparisonOperator = thresholdComparisonOperator;
    return this;
  }

  /**
   * Comparison applied between the aggregated value and the threshold.
   *
   * @return thresholdComparisonOperator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD_COMPARISON_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getThresholdComparisonOperator() {
    return thresholdComparisonOperator;
  }

  public void setThresholdComparisonOperator(String thresholdComparisonOperator) {
    this.thresholdComparisonOperator = thresholdComparisonOperator;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation thresholdTimeframeDimension(
      String thresholdTimeframeDimension) {
    this.thresholdTimeframeDimension = thresholdTimeframeDimension;
    return this;
  }

  /**
   * Time unit used for the threshold evaluation window.
   *
   * @return thresholdTimeframeDimension
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD_TIMEFRAME_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getThresholdTimeframeDimension() {
    return thresholdTimeframeDimension;
  }

  public void setThresholdTimeframeDimension(String thresholdTimeframeDimension) {
    this.thresholdTimeframeDimension = thresholdTimeframeDimension;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation thresholdTimeframeValue(
      Double thresholdTimeframeValue) {
    this.thresholdTimeframeValue = thresholdTimeframeValue;
    return this;
  }

  /**
   * Size of the threshold evaluation window.
   *
   * @return thresholdTimeframeValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD_TIMEFRAME_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getThresholdTimeframeValue() {
    return thresholdTimeframeValue;
  }

  public void setThresholdTimeframeValue(Double thresholdTimeframeValue) {
    this.thresholdTimeframeValue = thresholdTimeframeValue;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation timeframeEndValue(
      Double timeframeEndValue) {
    this.timeframeEndValue = timeframeEndValue;
    return this;
  }

  /**
   * End of the aggregation window in the specified time unit.
   *
   * @return timeframeEndValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME_END_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTimeframeEndValue() {
    return timeframeEndValue;
  }

  public void setTimeframeEndValue(Double timeframeEndValue) {
    this.timeframeEndValue = timeframeEndValue;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation timeframeStartValue(
      Double timeframeStartValue) {
    this.timeframeStartValue = timeframeStartValue;
    return this;
  }

  /**
   * Start of the aggregation window in the specified time unit.
   *
   * @return timeframeStartValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME_START_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTimeframeStartValue() {
    return timeframeStartValue;
  }

  public void setTimeframeStartValue(Double timeframeStartValue) {
    this.timeframeStartValue = timeframeStartValue;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation timeframeUnit(
      String timeframeUnit) {
    this.timeframeUnit = timeframeUnit;
    return this;
  }

  /**
   * Time unit used for the aggregation window.
   *
   * @return timeframeUnit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimeframeUnit() {
    return timeframeUnit;
  }

  public void setTimeframeUnit(String timeframeUnit) {
    this.timeframeUnit = timeframeUnit;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation warehouseMetricMeasure(
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

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation winsorLowerFixedValue(
      Double winsorLowerFixedValue) {
    this.winsorLowerFixedValue = winsorLowerFixedValue;
    return this;
  }

  /**
   * Fixed lower bound used to cap metric values.
   *
   * @return winsorLowerFixedValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINSOR_LOWER_FIXED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWinsorLowerFixedValue() {
    return winsorLowerFixedValue;
  }

  public void setWinsorLowerFixedValue(Double winsorLowerFixedValue) {
    this.winsorLowerFixedValue = winsorLowerFixedValue;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation winsorLowerPercentile(
      Double winsorLowerPercentile) {
    this.winsorLowerPercentile = winsorLowerPercentile;
    return this;
  }

  /**
   * Percentile used to determine the lower bound for capped metric values.
   *
   * @return winsorLowerPercentile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINSOR_LOWER_PERCENTILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWinsorLowerPercentile() {
    return winsorLowerPercentile;
  }

  public void setWinsorLowerPercentile(Double winsorLowerPercentile) {
    this.winsorLowerPercentile = winsorLowerPercentile;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation winsorUpperFixedValue(
      Double winsorUpperFixedValue) {
    this.winsorUpperFixedValue = winsorUpperFixedValue;
    return this;
  }

  /**
   * Fixed upper bound used to cap metric values.
   *
   * @return winsorUpperFixedValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINSOR_UPPER_FIXED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWinsorUpperFixedValue() {
    return winsorUpperFixedValue;
  }

  public void setWinsorUpperFixedValue(Double winsorUpperFixedValue) {
    this.winsorUpperFixedValue = winsorUpperFixedValue;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation winsorUpperPercentile(
      Double winsorUpperPercentile) {
    this.winsorUpperPercentile = winsorUpperPercentile;
    return this;
  }

  /**
   * Percentile used to determine the upper bound for capped metric values.
   *
   * @return winsorUpperPercentile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINSOR_UPPER_PERCENTILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWinsorUpperPercentile() {
    return winsorUpperPercentile;
  }

  public void setWinsorUpperPercentile(Double winsorUpperPercentile) {
    this.winsorUpperPercentile = winsorUpperPercentile;
  }

  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation winsorizationStrategy(
      String winsorizationStrategy) {
    this.winsorizationStrategy = winsorizationStrategy;
    return this;
  }

  /**
   * Method used to cap extreme metric values.
   *
   * @return winsorizationStrategy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINSORIZATION_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWinsorizationStrategy() {
    return winsorizationStrategy;
  }

  public void setWinsorizationStrategy(String winsorizationStrategy) {
    this.winsorizationStrategy = winsorizationStrategy;
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
   * @return ExperimentsMetricV2DTODataAttributesNumeratorAggregation
   */
  @JsonAnySetter
  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation putAdditionalProperty(
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
   * Return true if this ExperimentsMetricV2DTODataAttributesNumeratorAggregation object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricV2DTODataAttributesNumeratorAggregation
        experimentsMetricV2DtoDataAttributesNumeratorAggregation =
            (ExperimentsMetricV2DTODataAttributesNumeratorAggregation) o;
    return Objects.equals(
            this.agingThresholdDays,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.agingThresholdDays)
        && Objects.equals(
            this.datadogMetricMeasure,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.datadogMetricMeasure)
        && Objects.equals(
            this.enableAgingSubjectFilter,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.enableAgingSubjectFilter)
        && Objects.equals(
            this.operation, experimentsMetricV2DtoDataAttributesNumeratorAggregation.operation)
        && Objects.equals(
            this.pipelineColumnSuffix,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.pipelineColumnSuffix)
        && Objects.equals(
            this.propertyFilters,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.propertyFilters)
        && Objects.equals(
            this.thresholdAggregationType,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.thresholdAggregationType)
        && Objects.equals(
            this.thresholdBreachValue,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.thresholdBreachValue)
        && Objects.equals(
            this.thresholdComparisonOperator,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.thresholdComparisonOperator)
        && Objects.equals(
            this.thresholdTimeframeDimension,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.thresholdTimeframeDimension)
        && Objects.equals(
            this.thresholdTimeframeValue,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.thresholdTimeframeValue)
        && Objects.equals(
            this.timeframeEndValue,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.timeframeEndValue)
        && Objects.equals(
            this.timeframeStartValue,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.timeframeStartValue)
        && Objects.equals(
            this.timeframeUnit,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.timeframeUnit)
        && Objects.equals(
            this.warehouseMetricMeasure,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.warehouseMetricMeasure)
        && Objects.equals(
            this.winsorLowerFixedValue,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.winsorLowerFixedValue)
        && Objects.equals(
            this.winsorLowerPercentile,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.winsorLowerPercentile)
        && Objects.equals(
            this.winsorUpperFixedValue,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.winsorUpperFixedValue)
        && Objects.equals(
            this.winsorUpperPercentile,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.winsorUpperPercentile)
        && Objects.equals(
            this.winsorizationStrategy,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.winsorizationStrategy)
        && Objects.equals(
            this.additionalProperties,
            experimentsMetricV2DtoDataAttributesNumeratorAggregation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agingThresholdDays,
        datadogMetricMeasure,
        enableAgingSubjectFilter,
        operation,
        pipelineColumnSuffix,
        propertyFilters,
        thresholdAggregationType,
        thresholdBreachValue,
        thresholdComparisonOperator,
        thresholdTimeframeDimension,
        thresholdTimeframeValue,
        timeframeEndValue,
        timeframeStartValue,
        timeframeUnit,
        warehouseMetricMeasure,
        winsorLowerFixedValue,
        winsorLowerPercentile,
        winsorUpperFixedValue,
        winsorUpperPercentile,
        winsorizationStrategy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricV2DTODataAttributesNumeratorAggregation {\n");
    sb.append("    agingThresholdDays: ").append(toIndentedString(agingThresholdDays)).append("\n");
    sb.append("    datadogMetricMeasure: ")
        .append(toIndentedString(datadogMetricMeasure))
        .append("\n");
    sb.append("    enableAgingSubjectFilter: ")
        .append(toIndentedString(enableAgingSubjectFilter))
        .append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    pipelineColumnSuffix: ")
        .append(toIndentedString(pipelineColumnSuffix))
        .append("\n");
    sb.append("    propertyFilters: ").append(toIndentedString(propertyFilters)).append("\n");
    sb.append("    thresholdAggregationType: ")
        .append(toIndentedString(thresholdAggregationType))
        .append("\n");
    sb.append("    thresholdBreachValue: ")
        .append(toIndentedString(thresholdBreachValue))
        .append("\n");
    sb.append("    thresholdComparisonOperator: ")
        .append(toIndentedString(thresholdComparisonOperator))
        .append("\n");
    sb.append("    thresholdTimeframeDimension: ")
        .append(toIndentedString(thresholdTimeframeDimension))
        .append("\n");
    sb.append("    thresholdTimeframeValue: ")
        .append(toIndentedString(thresholdTimeframeValue))
        .append("\n");
    sb.append("    timeframeEndValue: ").append(toIndentedString(timeframeEndValue)).append("\n");
    sb.append("    timeframeStartValue: ")
        .append(toIndentedString(timeframeStartValue))
        .append("\n");
    sb.append("    timeframeUnit: ").append(toIndentedString(timeframeUnit)).append("\n");
    sb.append("    warehouseMetricMeasure: ")
        .append(toIndentedString(warehouseMetricMeasure))
        .append("\n");
    sb.append("    winsorLowerFixedValue: ")
        .append(toIndentedString(winsorLowerFixedValue))
        .append("\n");
    sb.append("    winsorLowerPercentile: ")
        .append(toIndentedString(winsorLowerPercentile))
        .append("\n");
    sb.append("    winsorUpperFixedValue: ")
        .append(toIndentedString(winsorUpperFixedValue))
        .append("\n");
    sb.append("    winsorUpperPercentile: ")
        .append(toIndentedString(winsorUpperPercentile))
        .append("\n");
    sb.append("    winsorizationStrategy: ")
        .append(toIndentedString(winsorizationStrategy))
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
