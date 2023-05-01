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
import java.util.Objects;

/** The compute rule to compute the log-based metric. */
@JsonPropertyOrder({
  LogsMetricResponseCompute.JSON_PROPERTY_AGGREGATION_TYPE,
  LogsMetricResponseCompute.JSON_PROPERTY_INCLUDE_PERCENTILES,
  LogsMetricResponseCompute.JSON_PROPERTY_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMetricResponseCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_TYPE = "aggregation_type";
  private LogsMetricResponseComputeAggregationType aggregationType;

  public static final String JSON_PROPERTY_INCLUDE_PERCENTILES = "include_percentiles";
  private Boolean includePercentiles;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public LogsMetricResponseCompute aggregationType(
      LogsMetricResponseComputeAggregationType aggregationType) {
    this.aggregationType = aggregationType;
    this.unparsed |= !aggregationType.isValid();
    return this;
  }

  /**
   * The type of aggregation to use.
   *
   * @return aggregationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsMetricResponseComputeAggregationType getAggregationType() {
    return aggregationType;
  }

  public void setAggregationType(LogsMetricResponseComputeAggregationType aggregationType) {
    if (!aggregationType.isValid()) {
      this.unparsed = true;
    }
    this.aggregationType = aggregationType;
  }

  public LogsMetricResponseCompute includePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
    return this;
  }

  /**
   * Toggle to include or exclude percentile aggregations for distribution metrics. Only present
   * when the <code>aggregation_type</code> is <code>distribution</code>.
   *
   * @return includePercentiles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_PERCENTILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludePercentiles() {
    return includePercentiles;
  }

  public void setIncludePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
  }

  public LogsMetricResponseCompute path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path to the value the log-based metric will aggregate on (only used if the aggregation type
   * is a "distribution").
   *
   * @return path
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  /** Return true if this LogsMetricResponseCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMetricResponseCompute logsMetricResponseCompute = (LogsMetricResponseCompute) o;
    return Objects.equals(this.aggregationType, logsMetricResponseCompute.aggregationType)
        && Objects.equals(this.includePercentiles, logsMetricResponseCompute.includePercentiles)
        && Objects.equals(this.path, logsMetricResponseCompute.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationType, includePercentiles, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMetricResponseCompute {\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    includePercentiles: ").append(toIndentedString(includePercentiles)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
