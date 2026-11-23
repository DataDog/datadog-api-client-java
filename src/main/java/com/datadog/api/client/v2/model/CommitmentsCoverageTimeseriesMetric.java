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
 * A coverage timeseries metric. For AWS and Azure, <code>series</code> holds the <code>
 * on_demand_only</code>, <code>spot_only</code>, <code>ri</code>, and <code>sp</code> buckets, plus
 * <code>ppp</code> for Azure pre-purchase plans when enabled. For GCP, <code>series</code> holds
 * the <code>on_demand_only</code> and <code>flex_cud</code> buckets.
 */
@JsonPropertyOrder({
  CommitmentsCoverageTimeseriesMetric.JSON_PROPERTY_PROVIDER,
  CommitmentsCoverageTimeseriesMetric.JSON_PROPERTY_SERIES,
  CommitmentsCoverageTimeseriesMetric.JSON_PROPERTY_TIMES,
  CommitmentsCoverageTimeseriesMetric.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsCoverageTimeseriesMetric {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private CommitmentsProvider provider;

  public static final String JSON_PROPERTY_SERIES = "series";
  private Map<String, List<Double>> series = new HashMap<String, List<Double>>();

  public static final String JSON_PROPERTY_TIMES = "times";
  private List<Long> times = new ArrayList<>();

  public static final String JSON_PROPERTY_UNIT = "unit";
  private JsonNullable<CommitmentsUnit> unit = JsonNullable.<CommitmentsUnit>undefined();

  public CommitmentsCoverageTimeseriesMetric() {}

  @JsonCreator
  public CommitmentsCoverageTimeseriesMetric(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER) CommitmentsProvider provider,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERIES) Map<String, List<Double>> series,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMES) List<Long> times) {
    this.provider = provider;
    this.unparsed |= !provider.isValid();
    this.series = series;
    this.times = times;
  }

  public CommitmentsCoverageTimeseriesMetric provider(CommitmentsProvider provider) {
    this.provider = provider;
    this.unparsed |= !provider.isValid();
    return this;
  }

  /**
   * Cloud provider for commitment programs.
   *
   * @return provider
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsProvider getProvider() {
    return provider;
  }

  public void setProvider(CommitmentsProvider provider) {
    if (!provider.isValid()) {
      this.unparsed = true;
    }
    this.provider = provider;
  }

  public CommitmentsCoverageTimeseriesMetric series(Map<String, List<Double>> series) {
    this.series = series;
    return this;
  }

  public CommitmentsCoverageTimeseriesMetric putSeriesItem(String key, List<Double> seriesItem) {
    this.series.put(key, seriesItem);
    return this;
  }

  /**
   * Timeseries data as a map of series names to their corresponding value arrays.
   *
   * @return series
   */
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, List<Double>> getSeries() {
    return series;
  }

  public void setSeries(Map<String, List<Double>> series) {
    this.series = series;
  }

  public CommitmentsCoverageTimeseriesMetric times(List<Long> times) {
    this.times = times;
    return this;
  }

  public CommitmentsCoverageTimeseriesMetric addTimesItem(Long timesItem) {
    this.times.add(timesItem);
    return this;
  }

  /**
   * Unix timestamps in seconds for the timeseries data points.
   *
   * @return times
   */
  @JsonProperty(JSON_PROPERTY_TIMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Long> getTimes() {
    return times;
  }

  public void setTimes(List<Long> times) {
    this.times = times;
  }

  public CommitmentsCoverageTimeseriesMetric unit(CommitmentsUnit unit) {
    this.unit = JsonNullable.<CommitmentsUnit>of(unit);
    return this;
  }

  /**
   * Unit metadata for a numeric metric. Unset fields are omitted, and the unit is <code>null</code>
   * when it is unknown.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public CommitmentsUnit getUnit() {
    return unit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<CommitmentsUnit> getUnit_JsonNullable() {
    return unit;
  }

  @JsonProperty(JSON_PROPERTY_UNIT)
  public void setUnit_JsonNullable(JsonNullable<CommitmentsUnit> unit) {
    this.unit = unit;
  }

  public void setUnit(CommitmentsUnit unit) {
    this.unit = JsonNullable.<CommitmentsUnit>of(unit);
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
   * @return CommitmentsCoverageTimeseriesMetric
   */
  @JsonAnySetter
  public CommitmentsCoverageTimeseriesMetric putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsCoverageTimeseriesMetric object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsCoverageTimeseriesMetric commitmentsCoverageTimeseriesMetric =
        (CommitmentsCoverageTimeseriesMetric) o;
    return Objects.equals(this.provider, commitmentsCoverageTimeseriesMetric.provider)
        && Objects.equals(this.series, commitmentsCoverageTimeseriesMetric.series)
        && Objects.equals(this.times, commitmentsCoverageTimeseriesMetric.times)
        && Objects.equals(this.unit, commitmentsCoverageTimeseriesMetric.unit)
        && Objects.equals(
            this.additionalProperties, commitmentsCoverageTimeseriesMetric.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, series, times, unit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsCoverageTimeseriesMetric {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
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
