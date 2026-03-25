/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Compute aggregation for network queries. */
@JsonPropertyOrder({
  SankeyNetworkQueryCompute.JSON_PROPERTY_AGGREGATION,
  SankeyNetworkQueryCompute.JSON_PROPERTY_METRIC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyNetworkQueryCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private EventsAggregation aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public SankeyNetworkQueryCompute() {}

  @JsonCreator
  public SankeyNetworkQueryCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          EventsAggregation aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC) String metric) {
    this.aggregation = aggregation;
    this.unparsed |= aggregation.unparsed;
    this.metric = metric;
  }

  public SankeyNetworkQueryCompute aggregation(EventsAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= aggregation.unparsed;
    return this;
  }

  /**
   * The type of aggregation that can be performed on events-based queries.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventsAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(EventsAggregation aggregation) {
    this.aggregation = aggregation;
  }

  public SankeyNetworkQueryCompute metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Metric to aggregate.
   *
   * @return metric
   */
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  /** Return true if this SankeyNetworkQueryCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyNetworkQueryCompute sankeyNetworkQueryCompute = (SankeyNetworkQueryCompute) o;
    return Objects.equals(this.aggregation, sankeyNetworkQueryCompute.aggregation)
        && Objects.equals(this.metric, sankeyNetworkQueryCompute.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SankeyNetworkQueryCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
