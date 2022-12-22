/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The object describing a timeseries response. */
@JsonPropertyOrder({
  TimeseriesResponseAttributes.JSON_PROPERTY_SERIES,
  TimeseriesResponseAttributes.JSON_PROPERTY_TIMES,
  TimeseriesResponseAttributes.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SERIES = "series";
  private List<TimeseriesResponseSeries> series = null;

  public static final String JSON_PROPERTY_TIMES = "times";
  private List<Long> times = null;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<List<Double>> values = null;

  public TimeseriesResponseAttributes series(List<TimeseriesResponseSeries> series) {
    this.series = series;
    for (TimeseriesResponseSeries item : series) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesResponseAttributes addSeriesItem(TimeseriesResponseSeries seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<>();
    }
    this.series.add(seriesItem);
    this.unparsed |= seriesItem.unparsed;
    return this;
  }

  /**
   * Array of response series. The index here corresponds to the index in the <code>formulas</code>
   * or <code>queries</code> array from the request.
   *
   * @return series
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeseriesResponseSeries> getSeries() {
    return series;
  }

  public void setSeries(List<TimeseriesResponseSeries> series) {
    this.series = series;
  }

  public TimeseriesResponseAttributes times(List<Long> times) {
    this.times = times;
    return this;
  }

  public TimeseriesResponseAttributes addTimesItem(Long timesItem) {
    if (this.times == null) {
      this.times = new ArrayList<>();
    }
    this.times.add(timesItem);
    return this;
  }

  /**
   * Array of times, 1-1 match with individual values arrays.
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

  public TimeseriesResponseAttributes values(List<List<Double>> values) {
    this.values = values;
    return this;
  }

  public TimeseriesResponseAttributes addValuesItem(List<Double> valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Array of value-arrays. The index here corresponds to the index in the <code>formulas</code> or
   * <code>queries</code> array from the request.
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

  /** Return true if this TimeseriesResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesResponseAttributes timeseriesResponseAttributes = (TimeseriesResponseAttributes) o;
    return Objects.equals(this.series, timeseriesResponseAttributes.series)
        && Objects.equals(this.times, timeseriesResponseAttributes.times)
        && Objects.equals(this.values, timeseriesResponseAttributes.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(series, times, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesResponseAttributes {\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
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
