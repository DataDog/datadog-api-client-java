/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  StructuredAnalysisTimeAggregation.JSON_PROPERTY_INTERVAL,
  StructuredAnalysisTimeAggregation.JSON_PROPERTY_TIME_COLUMN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisTimeAggregation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Double interval;

  public static final String JSON_PROPERTY_TIME_COLUMN = "time_column";
  private String timeColumn;

  public StructuredAnalysisTimeAggregation() {}

  @JsonCreator
  public StructuredAnalysisTimeAggregation(
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_COLUMN) String timeColumn) {
    this.timeColumn = timeColumn;
  }

  public StructuredAnalysisTimeAggregation interval(Double interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterval() {
    return interval;
  }

  public void setInterval(Double interval) {
    this.interval = interval;
  }

  public StructuredAnalysisTimeAggregation timeColumn(String timeColumn) {
    this.timeColumn = timeColumn;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeColumn
   */
  @JsonProperty(JSON_PROPERTY_TIME_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeColumn() {
    return timeColumn;
  }

  public void setTimeColumn(String timeColumn) {
    this.timeColumn = timeColumn;
  }

  /** Return true if this StructuredAnalysisTimeAggregation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisTimeAggregation structuredAnalysisTimeAggregation =
        (StructuredAnalysisTimeAggregation) o;
    return Objects.equals(this.interval, structuredAnalysisTimeAggregation.interval)
        && Objects.equals(this.timeColumn, structuredAnalysisTimeAggregation.timeColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, timeColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisTimeAggregation {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    timeColumn: ").append(toIndentedString(timeColumn)).append("\n");
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
