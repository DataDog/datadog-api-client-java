/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The compute rule to compute the span-based metric. */
@JsonPropertyOrder({
  SpansMetricCompute.JSON_PROPERTY_AGGREGATION_TYPE,
  SpansMetricCompute.JSON_PROPERTY_INCLUDE_PERCENTILES,
  SpansMetricCompute.JSON_PROPERTY_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansMetricCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_TYPE = "aggregation_type";
  private SpansMetricComputeAggregationType aggregationType;

  public static final String JSON_PROPERTY_INCLUDE_PERCENTILES = "include_percentiles";
  private Boolean includePercentiles;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public SpansMetricCompute() {}

  @JsonCreator
  public SpansMetricCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION_TYPE)
          SpansMetricComputeAggregationType aggregationType) {
    this.aggregationType = aggregationType;
    this.unparsed |= !aggregationType.isValid();
  }

  public SpansMetricCompute aggregationType(SpansMetricComputeAggregationType aggregationType) {
    this.aggregationType = aggregationType;
    this.unparsed |= !aggregationType.isValid();
    return this;
  }

  /**
   * The type of aggregation to use.
   *
   * @return aggregationType
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SpansMetricComputeAggregationType getAggregationType() {
    return aggregationType;
  }

  public void setAggregationType(SpansMetricComputeAggregationType aggregationType) {
    if (!aggregationType.isValid()) {
      this.unparsed = true;
    }
    this.aggregationType = aggregationType;
  }

  public SpansMetricCompute includePercentiles(Boolean includePercentiles) {
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

  public SpansMetricCompute path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path to the value the span-based metric will aggregate on (only used if the aggregation
   * type is a "distribution").
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

  /** Return true if this SpansMetricCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansMetricCompute spansMetricCompute = (SpansMetricCompute) o;
    return Objects.equals(this.aggregationType, spansMetricCompute.aggregationType)
        && Objects.equals(this.includePercentiles, spansMetricCompute.includePercentiles)
        && Objects.equals(this.path, spansMetricCompute.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationType, includePercentiles, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansMetricCompute {\n");
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
