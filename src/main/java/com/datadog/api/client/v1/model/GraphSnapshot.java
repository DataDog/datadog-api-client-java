/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object representing a graph snapshot. */
@JsonPropertyOrder({
  GraphSnapshot.JSON_PROPERTY_GRAPH_DEF,
  GraphSnapshot.JSON_PROPERTY_METRIC_QUERY,
  GraphSnapshot.JSON_PROPERTY_SNAPSHOT_URL
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GraphSnapshot {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GRAPH_DEF = "graph_def";
  private String graphDef;

  public static final String JSON_PROPERTY_METRIC_QUERY = "metric_query";
  private String metricQuery;

  public static final String JSON_PROPERTY_SNAPSHOT_URL = "snapshot_url";
  private String snapshotUrl;

  public GraphSnapshot graphDef(String graphDef) {
    this.graphDef = graphDef;
    return this;
  }

  /**
   * A JSON document defining the graph. <code>graph_def</code> can be used instead of <code>
   * metric_query</code>. The JSON document uses the <a
   * href="https://docs.datadoghq.com/graphing/graphing_json/#grammar">grammar defined here</a> and
   * should be formatted to a single line then URL encoded.
   *
   * @return graphDef
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAPH_DEF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGraphDef() {
    return graphDef;
  }

  public void setGraphDef(String graphDef) {
    this.graphDef = graphDef;
  }

  public GraphSnapshot metricQuery(String metricQuery) {
    this.metricQuery = metricQuery;
    return this;
  }

  /**
   * The metric query. One of <code>metric_query</code> or <code>graph_def</code> is required.
   *
   * @return metricQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetricQuery() {
    return metricQuery;
  }

  public void setMetricQuery(String metricQuery) {
    this.metricQuery = metricQuery;
  }

  public GraphSnapshot snapshotUrl(String snapshotUrl) {
    this.snapshotUrl = snapshotUrl;
    return this;
  }

  /**
   * URL of your <a href="https://docs.datadoghq.com/metrics/explorer/#snapshot">graph snapshot</a>.
   *
   * @return snapshotUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSnapshotUrl() {
    return snapshotUrl;
  }

  public void setSnapshotUrl(String snapshotUrl) {
    this.snapshotUrl = snapshotUrl;
  }

  /** Return true if this GraphSnapshot object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphSnapshot graphSnapshot = (GraphSnapshot) o;
    return Objects.equals(this.graphDef, graphSnapshot.graphDef)
        && Objects.equals(this.metricQuery, graphSnapshot.metricQuery)
        && Objects.equals(this.snapshotUrl, graphSnapshot.snapshotUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graphDef, metricQuery, snapshotUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphSnapshot {\n");
    sb.append("    graphDef: ").append(toIndentedString(graphDef)).append("\n");
    sb.append("    metricQuery: ").append(toIndentedString(metricQuery)).append("\n");
    sb.append("    snapshotUrl: ").append(toIndentedString(snapshotUrl)).append("\n");
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
