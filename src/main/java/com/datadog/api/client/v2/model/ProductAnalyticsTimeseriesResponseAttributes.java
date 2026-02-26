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

/** */
@JsonPropertyOrder({
  ProductAnalyticsTimeseriesResponseAttributes.JSON_PROPERTY_INTERVALS,
  ProductAnalyticsTimeseriesResponseAttributes.JSON_PROPERTY_SERIES,
  ProductAnalyticsTimeseriesResponseAttributes.JSON_PROPERTY_TIMES,
  ProductAnalyticsTimeseriesResponseAttributes.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsTimeseriesResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTERVALS = "intervals";
  private List<ProductAnalyticsInterval> intervals = null;

  public static final String JSON_PROPERTY_SERIES = "series";
  private List<ProductAnalyticsSerie> series = null;

  public static final String JSON_PROPERTY_TIMES = "times";
  private List<Long> times = null;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<List<Double>> values = null;

  public ProductAnalyticsTimeseriesResponseAttributes intervals(
      List<ProductAnalyticsInterval> intervals) {
    this.intervals = intervals;
    for (ProductAnalyticsInterval item : intervals) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsTimeseriesResponseAttributes addIntervalsItem(
      ProductAnalyticsInterval intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<>();
    }
    this.intervals.add(intervalsItem);
    this.unparsed |= intervalsItem.unparsed;
    return this;
  }

  /**
   * Getintervals
   *
   * @return intervals
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsInterval> getIntervals() {
    return intervals;
  }

  public void setIntervals(List<ProductAnalyticsInterval> intervals) {
    this.intervals = intervals;
  }

  public ProductAnalyticsTimeseriesResponseAttributes series(List<ProductAnalyticsSerie> series) {
    this.series = series;
    for (ProductAnalyticsSerie item : series) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsTimeseriesResponseAttributes addSeriesItem(
      ProductAnalyticsSerie seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<>();
    }
    this.series.add(seriesItem);
    this.unparsed |= seriesItem.unparsed;
    return this;
  }

  /**
   * Getseries
   *
   * @return series
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsSerie> getSeries() {
    return series;
  }

  public void setSeries(List<ProductAnalyticsSerie> series) {
    this.series = series;
  }

  public ProductAnalyticsTimeseriesResponseAttributes times(List<Long> times) {
    this.times = times;
    return this;
  }

  public ProductAnalyticsTimeseriesResponseAttributes addTimesItem(Long timesItem) {
    if (this.times == null) {
      this.times = new ArrayList<>();
    }
    this.times.add(timesItem);
    return this;
  }

  /**
   * Timestamps for each data point (epoch milliseconds).
   *
   * @return times
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getTimes() {
    return times;
  }

  public void setTimes(List<Long> times) {
    this.times = times;
  }

  public ProductAnalyticsTimeseriesResponseAttributes values(List<List<Double>> values) {
    this.values = values;
    return this;
  }

  public ProductAnalyticsTimeseriesResponseAttributes addValuesItem(List<Double> valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Values for each series at each time point.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<Double>> getValues() {
    return values;
  }

  public void setValues(List<List<Double>> values) {
    this.values = values;
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
   * @return ProductAnalyticsTimeseriesResponseAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsTimeseriesResponseAttributes putAdditionalProperty(
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

  /** Return true if this ProductAnalyticsTimeseriesResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsTimeseriesResponseAttributes productAnalyticsTimeseriesResponseAttributes =
        (ProductAnalyticsTimeseriesResponseAttributes) o;
    return Objects.equals(this.intervals, productAnalyticsTimeseriesResponseAttributes.intervals)
        && Objects.equals(this.series, productAnalyticsTimeseriesResponseAttributes.series)
        && Objects.equals(this.times, productAnalyticsTimeseriesResponseAttributes.times)
        && Objects.equals(this.values, productAnalyticsTimeseriesResponseAttributes.values)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsTimeseriesResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervals, series, times, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsTimeseriesResponseAttributes {\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
