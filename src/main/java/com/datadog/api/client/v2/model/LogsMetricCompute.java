/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The compute rule to compute the log-based metric.</p>
 */
@JsonPropertyOrder({
  LogsMetricCompute.JSON_PROPERTY_AGGREGATION_TYPE,
  LogsMetricCompute.JSON_PROPERTY_PATH
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMetricCompute {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_TYPE = "aggregation_type";
  private LogsMetricComputeAggregationType aggregationType;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public LogsMetricCompute() {}

  @JsonCreator
  public LogsMetricCompute(
            @JsonProperty(required=true, value=JSON_PROPERTY_AGGREGATION_TYPE)LogsMetricComputeAggregationType aggregationType) {
        this.aggregationType = aggregationType;
        this.unparsed |= !aggregationType.isValid();
  }
  public LogsMetricCompute aggregationType(LogsMetricComputeAggregationType aggregationType) {
    this.aggregationType = aggregationType;
    this.unparsed |= !aggregationType.isValid();
    return this;
  }

  /**
   * <p>The type of aggregation to use.</p>
   * @return aggregationType
  **/
      @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsMetricComputeAggregationType getAggregationType() {
        return aggregationType;
      }
  public void setAggregationType(LogsMetricComputeAggregationType aggregationType) {
    if (!aggregationType.isValid()) {
        this.unparsed = true;
    }
    this.aggregationType = aggregationType;
  }
  public LogsMetricCompute path(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>The path to the value the log-based metric will aggregate on (only used if the aggregation type is a "distribution").</p>
   * @return path
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPath() {
        return path;
      }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * Return true if this LogsMetricCompute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMetricCompute logsMetricCompute = (LogsMetricCompute) o;
    return Objects.equals(this.aggregationType, logsMetricCompute.aggregationType) && Objects.equals(this.path, logsMetricCompute.path);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregationType,path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMetricCompute {\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
