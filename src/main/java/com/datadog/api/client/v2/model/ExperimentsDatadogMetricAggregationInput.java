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
 * Settings for a metric aggregation that uses a Datadog measure. The other measure must be omitted
 * or null.
 */
@JsonPropertyOrder({
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_AGING_THRESHOLD_DAYS,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_DATADOG_METRIC_MEASURE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_ENABLE_AGING_SUBJECT_FILTER,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_OPERATION,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_PROPERTY_FILTERS,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_THRESHOLD_AGGREGATION_TYPE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_THRESHOLD_BREACH_VALUE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_THRESHOLD_COMPARISON_OPERATOR,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_THRESHOLD_TIMEFRAME_DIMENSION,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_THRESHOLD_TIMEFRAME_VALUE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_TIMEFRAME_END_VALUE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_TIMEFRAME_START_VALUE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_TIMEFRAME_UNIT,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_WAREHOUSE_METRIC_MEASURE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_WINSOR_LOWER_FIXED_VALUE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_WINSOR_LOWER_PERCENTILE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_WINSOR_UPPER_FIXED_VALUE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_WINSOR_UPPER_PERCENTILE,
  ExperimentsDatadogMetricAggregationInput.JSON_PROPERTY_WINSORIZATION_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsDatadogMetricAggregationInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGING_THRESHOLD_DAYS = "aging_threshold_days";
  private Long agingThresholdDays;

  public static final String JSON_PROPERTY_DATADOG_METRIC_MEASURE = "datadog_metric_measure";
  private ExperimentsDatadogMetricMeasureInput datadogMetricMeasure;

  public static final String JSON_PROPERTY_ENABLE_AGING_SUBJECT_FILTER =
      "enable_aging_subject_filter";
  private Boolean enableAgingSubjectFilter;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_PROPERTY_FILTERS = "property_filters";
  private JsonNullable<List<List<ExperimentsPropertyFilterInput>>> propertyFilters =
      JsonNullable.<List<List<ExperimentsPropertyFilterInput>>>undefined();

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
  private JsonNullable<ExperimentsNullableWarehouseMetricMeasureInput> warehouseMetricMeasure =
      JsonNullable.<ExperimentsNullableWarehouseMetricMeasureInput>undefined();

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

  public ExperimentsDatadogMetricAggregationInput() {}

  @JsonCreator
  public ExperimentsDatadogMetricAggregationInput(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATADOG_METRIC_MEASURE)
          ExperimentsDatadogMetricMeasureInput datadogMetricMeasure,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATION) String operation) {
    this.datadogMetricMeasure = datadogMetricMeasure;
    this.unparsed |= datadogMetricMeasure.unparsed;
    this.operation = operation;
  }

  public ExperimentsDatadogMetricAggregationInput agingThresholdDays(Long agingThresholdDays) {
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

  public ExperimentsDatadogMetricAggregationInput datadogMetricMeasure(
      ExperimentsDatadogMetricMeasureInput datadogMetricMeasure) {
    this.datadogMetricMeasure = datadogMetricMeasure;
    this.unparsed |= datadogMetricMeasure.unparsed;
    return this;
  }

  /**
   * Datadog source and query that supply values for the metric.
   *
   * @return datadogMetricMeasure
   */
  @JsonProperty(JSON_PROPERTY_DATADOG_METRIC_MEASURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsDatadogMetricMeasureInput getDatadogMetricMeasure() {
    return datadogMetricMeasure;
  }

  public void setDatadogMetricMeasure(ExperimentsDatadogMetricMeasureInput datadogMetricMeasure) {
    this.datadogMetricMeasure = datadogMetricMeasure;
    if (datadogMetricMeasure != null) {
      this.unparsed |= datadogMetricMeasure.unparsed;
    }
  }

  public ExperimentsDatadogMetricAggregationInput enableAgingSubjectFilter(
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

  public ExperimentsDatadogMetricAggregationInput operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Calculation applied to the measure values, such as sum.
   *
   * @return operation
   */
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public ExperimentsDatadogMetricAggregationInput propertyFilters(
      List<List<ExperimentsPropertyFilterInput>> propertyFilters) {
    this.propertyFilters =
        JsonNullable.<List<List<ExperimentsPropertyFilterInput>>>of(propertyFilters);
    return this;
  }

  public ExperimentsDatadogMetricAggregationInput addPropertyFiltersItem(
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
   * Property filters that select data for this aggregation.
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

  public ExperimentsDatadogMetricAggregationInput thresholdAggregationType(
      String thresholdAggregationType) {
    this.thresholdAggregationType = thresholdAggregationType;
    return this;
  }

  /**
   * Calculation used to evaluate the threshold.
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

  public ExperimentsDatadogMetricAggregationInput thresholdBreachValue(
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

  public ExperimentsDatadogMetricAggregationInput thresholdComparisonOperator(
      String thresholdComparisonOperator) {
    this.thresholdComparisonOperator = thresholdComparisonOperator;
    return this;
  }

  /**
   * Operator used to compare the calculated value with the threshold.
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

  public ExperimentsDatadogMetricAggregationInput thresholdTimeframeDimension(
      String thresholdTimeframeDimension) {
    this.thresholdTimeframeDimension = thresholdTimeframeDimension;
    return this;
  }

  /**
   * Time unit for the threshold evaluation window. Supports seconds, minutes, hours, days,
   * calendar_days, and weeks. Calendar days start at midnight on the assignment day. Other units
   * start at the assignment time.
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

  public ExperimentsDatadogMetricAggregationInput thresholdTimeframeValue(
      Double thresholdTimeframeValue) {
    this.thresholdTimeframeValue = thresholdTimeframeValue;
    return this;
  }

  /**
   * End of the threshold evaluation window, measured from assignment in the configured time unit.
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

  public ExperimentsDatadogMetricAggregationInput timeframeEndValue(Double timeframeEndValue) {
    this.timeframeEndValue = timeframeEndValue;
    return this;
  }

  /**
   * End offset of the aggregation window from assignment, in timeframe_unit.
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

  public ExperimentsDatadogMetricAggregationInput timeframeStartValue(Double timeframeStartValue) {
    this.timeframeStartValue = timeframeStartValue;
    return this;
  }

  /**
   * Start offset of the aggregation window from assignment, in timeframe_unit.
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

  public ExperimentsDatadogMetricAggregationInput timeframeUnit(String timeframeUnit) {
    this.timeframeUnit = timeframeUnit;
    return this;
  }

  /**
   * Time unit for the aggregation window. Calendar days are measured from midnight on the
   * assignment day. Other units are measured from the assignment time.
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

  public ExperimentsDatadogMetricAggregationInput warehouseMetricMeasure(
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

  public ExperimentsDatadogMetricAggregationInput winsorLowerFixedValue(
      Double winsorLowerFixedValue) {
    this.winsorLowerFixedValue = winsorLowerFixedValue;
    return this;
  }

  /**
   * Fixed lower bound used to cap extreme measure values.
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

  public ExperimentsDatadogMetricAggregationInput winsorLowerPercentile(
      Double winsorLowerPercentile) {
    this.winsorLowerPercentile = winsorLowerPercentile;
    return this;
  }

  /**
   * Percentile used to determine the lower bound for extreme measure values.
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

  public ExperimentsDatadogMetricAggregationInput winsorUpperFixedValue(
      Double winsorUpperFixedValue) {
    this.winsorUpperFixedValue = winsorUpperFixedValue;
    return this;
  }

  /**
   * Fixed upper bound used to cap extreme measure values.
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

  public ExperimentsDatadogMetricAggregationInput winsorUpperPercentile(
      Double winsorUpperPercentile) {
    this.winsorUpperPercentile = winsorUpperPercentile;
    return this;
  }

  /**
   * Percentile used to determine the upper bound for extreme measure values.
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

  public ExperimentsDatadogMetricAggregationInput winsorizationStrategy(
      String winsorizationStrategy) {
    this.winsorizationStrategy = winsorizationStrategy;
    return this;
  }

  /**
   * Method used to cap extreme measure values before aggregation.
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
   * @return ExperimentsDatadogMetricAggregationInput
   */
  @JsonAnySetter
  public ExperimentsDatadogMetricAggregationInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsDatadogMetricAggregationInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsDatadogMetricAggregationInput experimentsDatadogMetricAggregationInput =
        (ExperimentsDatadogMetricAggregationInput) o;
    return Objects.equals(
            this.agingThresholdDays, experimentsDatadogMetricAggregationInput.agingThresholdDays)
        && Objects.equals(
            this.datadogMetricMeasure,
            experimentsDatadogMetricAggregationInput.datadogMetricMeasure)
        && Objects.equals(
            this.enableAgingSubjectFilter,
            experimentsDatadogMetricAggregationInput.enableAgingSubjectFilter)
        && Objects.equals(this.operation, experimentsDatadogMetricAggregationInput.operation)
        && Objects.equals(
            this.propertyFilters, experimentsDatadogMetricAggregationInput.propertyFilters)
        && Objects.equals(
            this.thresholdAggregationType,
            experimentsDatadogMetricAggregationInput.thresholdAggregationType)
        && Objects.equals(
            this.thresholdBreachValue,
            experimentsDatadogMetricAggregationInput.thresholdBreachValue)
        && Objects.equals(
            this.thresholdComparisonOperator,
            experimentsDatadogMetricAggregationInput.thresholdComparisonOperator)
        && Objects.equals(
            this.thresholdTimeframeDimension,
            experimentsDatadogMetricAggregationInput.thresholdTimeframeDimension)
        && Objects.equals(
            this.thresholdTimeframeValue,
            experimentsDatadogMetricAggregationInput.thresholdTimeframeValue)
        && Objects.equals(
            this.timeframeEndValue, experimentsDatadogMetricAggregationInput.timeframeEndValue)
        && Objects.equals(
            this.timeframeStartValue, experimentsDatadogMetricAggregationInput.timeframeStartValue)
        && Objects.equals(
            this.timeframeUnit, experimentsDatadogMetricAggregationInput.timeframeUnit)
        && Objects.equals(
            this.warehouseMetricMeasure,
            experimentsDatadogMetricAggregationInput.warehouseMetricMeasure)
        && Objects.equals(
            this.winsorLowerFixedValue,
            experimentsDatadogMetricAggregationInput.winsorLowerFixedValue)
        && Objects.equals(
            this.winsorLowerPercentile,
            experimentsDatadogMetricAggregationInput.winsorLowerPercentile)
        && Objects.equals(
            this.winsorUpperFixedValue,
            experimentsDatadogMetricAggregationInput.winsorUpperFixedValue)
        && Objects.equals(
            this.winsorUpperPercentile,
            experimentsDatadogMetricAggregationInput.winsorUpperPercentile)
        && Objects.equals(
            this.winsorizationStrategy,
            experimentsDatadogMetricAggregationInput.winsorizationStrategy)
        && Objects.equals(
            this.additionalProperties,
            experimentsDatadogMetricAggregationInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agingThresholdDays,
        datadogMetricMeasure,
        enableAgingSubjectFilter,
        operation,
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
    sb.append("class ExperimentsDatadogMetricAggregationInput {\n");
    sb.append("    agingThresholdDays: ").append(toIndentedString(agingThresholdDays)).append("\n");
    sb.append("    datadogMetricMeasure: ")
        .append(toIndentedString(datadogMetricMeasure))
        .append("\n");
    sb.append("    enableAgingSubjectFilter: ")
        .append(toIndentedString(enableAgingSubjectFilter))
        .append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
