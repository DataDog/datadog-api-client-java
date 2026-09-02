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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Dataflows configured on the Elastic Cloud integration account, keyed by dataflow id. */
@JsonPropertyOrder({
  ElasticCloudIntegrationDataflowsResponse.JSON_PROPERTY_ELASTIC_CLOUD_DETAILED_INDEX_STATS,
  ElasticCloudIntegrationDataflowsResponse.JSON_PROPERTY_ELASTIC_CLOUD_INDEX_STATS,
  ElasticCloudIntegrationDataflowsResponse.JSON_PROPERTY_ELASTIC_CLOUD_METRICS,
  ElasticCloudIntegrationDataflowsResponse.JSON_PROPERTY_ELASTIC_CLOUD_PENDING_TASK_STATS,
  ElasticCloudIntegrationDataflowsResponse
      .JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_GRACEFUL_TIMEOUT,
  ElasticCloudIntegrationDataflowsResponse.JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_STATS,
  ElasticCloudIntegrationDataflowsResponse.JSON_PROPERTY_ELASTIC_CLOUD_SHARD_ALLOCATION_STATS,
  ElasticCloudIntegrationDataflowsResponse.JSON_PROPERTY_ELASTIC_CLOUD_SLM_STATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELASTIC_CLOUD_DETAILED_INDEX_STATS =
      "elastic-cloud-detailed-index-stats";
  private ElasticCloudDetailedIndexStatsIntegrationDataflowResponse elasticCloudDetailedIndexStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_INDEX_STATS = "elastic-cloud-index-stats";
  private ElasticCloudIndexStatsIntegrationDataflowResponse elasticCloudIndexStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_METRICS = "elastic-cloud-metrics";
  private ElasticCloudMetricsIntegrationDataflowResponse elasticCloudMetrics;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_PENDING_TASK_STATS =
      "elastic-cloud-pending-task-stats";
  private ElasticCloudPendingTaskStatsIntegrationDataflowResponse elasticCloudPendingTaskStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_GRACEFUL_TIMEOUT =
      "elastic-cloud-primary-shard-graceful-timeout";
  private ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowResponse
      elasticCloudPrimaryShardGracefulTimeout;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_STATS =
      "elastic-cloud-primary-shard-stats";
  private ElasticCloudPrimaryShardStatsIntegrationDataflowResponse elasticCloudPrimaryShardStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_SHARD_ALLOCATION_STATS =
      "elastic-cloud-shard-allocation-stats";
  private ElasticCloudShardAllocationStatsIntegrationDataflowResponse
      elasticCloudShardAllocationStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_SLM_STATS = "elastic-cloud-slm-stats";
  private ElasticCloudSlmStatsIntegrationDataflowResponse elasticCloudSlmStats;

  public ElasticCloudIntegrationDataflowsResponse elasticCloudDetailedIndexStats(
      ElasticCloudDetailedIndexStatsIntegrationDataflowResponse elasticCloudDetailedIndexStats) {
    this.elasticCloudDetailedIndexStats = elasticCloudDetailedIndexStats;
    this.unparsed |= elasticCloudDetailedIndexStats.unparsed;
    return this;
  }

  /**
   * The Elastic Cloud detailed index stats dataflow.
   *
   * @return elasticCloudDetailedIndexStats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_DETAILED_INDEX_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudDetailedIndexStatsIntegrationDataflowResponse
      getElasticCloudDetailedIndexStats() {
    return elasticCloudDetailedIndexStats;
  }

  public void setElasticCloudDetailedIndexStats(
      ElasticCloudDetailedIndexStatsIntegrationDataflowResponse elasticCloudDetailedIndexStats) {
    this.elasticCloudDetailedIndexStats = elasticCloudDetailedIndexStats;
    if (elasticCloudDetailedIndexStats != null) {
      this.unparsed |= elasticCloudDetailedIndexStats.unparsed;
    }
  }

  public ElasticCloudIntegrationDataflowsResponse elasticCloudIndexStats(
      ElasticCloudIndexStatsIntegrationDataflowResponse elasticCloudIndexStats) {
    this.elasticCloudIndexStats = elasticCloudIndexStats;
    this.unparsed |= elasticCloudIndexStats.unparsed;
    return this;
  }

  /**
   * The Elastic Cloud index stats dataflow.
   *
   * @return elasticCloudIndexStats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_INDEX_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudIndexStatsIntegrationDataflowResponse getElasticCloudIndexStats() {
    return elasticCloudIndexStats;
  }

  public void setElasticCloudIndexStats(
      ElasticCloudIndexStatsIntegrationDataflowResponse elasticCloudIndexStats) {
    this.elasticCloudIndexStats = elasticCloudIndexStats;
    if (elasticCloudIndexStats != null) {
      this.unparsed |= elasticCloudIndexStats.unparsed;
    }
  }

  public ElasticCloudIntegrationDataflowsResponse elasticCloudMetrics(
      ElasticCloudMetricsIntegrationDataflowResponse elasticCloudMetrics) {
    this.elasticCloudMetrics = elasticCloudMetrics;
    this.unparsed |= elasticCloudMetrics.unparsed;
    return this;
  }

  /**
   * The Elastic Cloud metrics dataflow.
   *
   * @return elasticCloudMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudMetricsIntegrationDataflowResponse getElasticCloudMetrics() {
    return elasticCloudMetrics;
  }

  public void setElasticCloudMetrics(
      ElasticCloudMetricsIntegrationDataflowResponse elasticCloudMetrics) {
    this.elasticCloudMetrics = elasticCloudMetrics;
    if (elasticCloudMetrics != null) {
      this.unparsed |= elasticCloudMetrics.unparsed;
    }
  }

  public ElasticCloudIntegrationDataflowsResponse elasticCloudPendingTaskStats(
      ElasticCloudPendingTaskStatsIntegrationDataflowResponse elasticCloudPendingTaskStats) {
    this.elasticCloudPendingTaskStats = elasticCloudPendingTaskStats;
    this.unparsed |= elasticCloudPendingTaskStats.unparsed;
    return this;
  }

  /**
   * The Elastic Cloud pending task stats dataflow.
   *
   * @return elasticCloudPendingTaskStats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_PENDING_TASK_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudPendingTaskStatsIntegrationDataflowResponse getElasticCloudPendingTaskStats() {
    return elasticCloudPendingTaskStats;
  }

  public void setElasticCloudPendingTaskStats(
      ElasticCloudPendingTaskStatsIntegrationDataflowResponse elasticCloudPendingTaskStats) {
    this.elasticCloudPendingTaskStats = elasticCloudPendingTaskStats;
    if (elasticCloudPendingTaskStats != null) {
      this.unparsed |= elasticCloudPendingTaskStats.unparsed;
    }
  }

  public ElasticCloudIntegrationDataflowsResponse elasticCloudPrimaryShardGracefulTimeout(
      ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowResponse
          elasticCloudPrimaryShardGracefulTimeout) {
    this.elasticCloudPrimaryShardGracefulTimeout = elasticCloudPrimaryShardGracefulTimeout;
    this.unparsed |= elasticCloudPrimaryShardGracefulTimeout.unparsed;
    return this;
  }

  /**
   * The Elastic Cloud primary shard graceful timeout dataflow.
   *
   * @return elasticCloudPrimaryShardGracefulTimeout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_GRACEFUL_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowResponse
      getElasticCloudPrimaryShardGracefulTimeout() {
    return elasticCloudPrimaryShardGracefulTimeout;
  }

  public void setElasticCloudPrimaryShardGracefulTimeout(
      ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowResponse
          elasticCloudPrimaryShardGracefulTimeout) {
    this.elasticCloudPrimaryShardGracefulTimeout = elasticCloudPrimaryShardGracefulTimeout;
    if (elasticCloudPrimaryShardGracefulTimeout != null) {
      this.unparsed |= elasticCloudPrimaryShardGracefulTimeout.unparsed;
    }
  }

  public ElasticCloudIntegrationDataflowsResponse elasticCloudPrimaryShardStats(
      ElasticCloudPrimaryShardStatsIntegrationDataflowResponse elasticCloudPrimaryShardStats) {
    this.elasticCloudPrimaryShardStats = elasticCloudPrimaryShardStats;
    this.unparsed |= elasticCloudPrimaryShardStats.unparsed;
    return this;
  }

  /**
   * The Elastic Cloud primary shard stats dataflow.
   *
   * @return elasticCloudPrimaryShardStats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudPrimaryShardStatsIntegrationDataflowResponse
      getElasticCloudPrimaryShardStats() {
    return elasticCloudPrimaryShardStats;
  }

  public void setElasticCloudPrimaryShardStats(
      ElasticCloudPrimaryShardStatsIntegrationDataflowResponse elasticCloudPrimaryShardStats) {
    this.elasticCloudPrimaryShardStats = elasticCloudPrimaryShardStats;
    if (elasticCloudPrimaryShardStats != null) {
      this.unparsed |= elasticCloudPrimaryShardStats.unparsed;
    }
  }

  public ElasticCloudIntegrationDataflowsResponse elasticCloudShardAllocationStats(
      ElasticCloudShardAllocationStatsIntegrationDataflowResponse
          elasticCloudShardAllocationStats) {
    this.elasticCloudShardAllocationStats = elasticCloudShardAllocationStats;
    this.unparsed |= elasticCloudShardAllocationStats.unparsed;
    return this;
  }

  /**
   * The Elastic Cloud shard allocation stats dataflow.
   *
   * @return elasticCloudShardAllocationStats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_SHARD_ALLOCATION_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudShardAllocationStatsIntegrationDataflowResponse
      getElasticCloudShardAllocationStats() {
    return elasticCloudShardAllocationStats;
  }

  public void setElasticCloudShardAllocationStats(
      ElasticCloudShardAllocationStatsIntegrationDataflowResponse
          elasticCloudShardAllocationStats) {
    this.elasticCloudShardAllocationStats = elasticCloudShardAllocationStats;
    if (elasticCloudShardAllocationStats != null) {
      this.unparsed |= elasticCloudShardAllocationStats.unparsed;
    }
  }

  public ElasticCloudIntegrationDataflowsResponse elasticCloudSlmStats(
      ElasticCloudSlmStatsIntegrationDataflowResponse elasticCloudSlmStats) {
    this.elasticCloudSlmStats = elasticCloudSlmStats;
    this.unparsed |= elasticCloudSlmStats.unparsed;
    return this;
  }

  /**
   * The Elastic Cloud snapshot lifecycle management stats dataflow.
   *
   * @return elasticCloudSlmStats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_SLM_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudSlmStatsIntegrationDataflowResponse getElasticCloudSlmStats() {
    return elasticCloudSlmStats;
  }

  public void setElasticCloudSlmStats(
      ElasticCloudSlmStatsIntegrationDataflowResponse elasticCloudSlmStats) {
    this.elasticCloudSlmStats = elasticCloudSlmStats;
    if (elasticCloudSlmStats != null) {
      this.unparsed |= elasticCloudSlmStats.unparsed;
    }
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
   * @return ElasticCloudIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public ElasticCloudIntegrationDataflowsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ElasticCloudIntegrationDataflowsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudIntegrationDataflowsResponse elasticCloudIntegrationDataflowsResponse =
        (ElasticCloudIntegrationDataflowsResponse) o;
    return Objects.equals(
            this.elasticCloudDetailedIndexStats,
            elasticCloudIntegrationDataflowsResponse.elasticCloudDetailedIndexStats)
        && Objects.equals(
            this.elasticCloudIndexStats,
            elasticCloudIntegrationDataflowsResponse.elasticCloudIndexStats)
        && Objects.equals(
            this.elasticCloudMetrics, elasticCloudIntegrationDataflowsResponse.elasticCloudMetrics)
        && Objects.equals(
            this.elasticCloudPendingTaskStats,
            elasticCloudIntegrationDataflowsResponse.elasticCloudPendingTaskStats)
        && Objects.equals(
            this.elasticCloudPrimaryShardGracefulTimeout,
            elasticCloudIntegrationDataflowsResponse.elasticCloudPrimaryShardGracefulTimeout)
        && Objects.equals(
            this.elasticCloudPrimaryShardStats,
            elasticCloudIntegrationDataflowsResponse.elasticCloudPrimaryShardStats)
        && Objects.equals(
            this.elasticCloudShardAllocationStats,
            elasticCloudIntegrationDataflowsResponse.elasticCloudShardAllocationStats)
        && Objects.equals(
            this.elasticCloudSlmStats,
            elasticCloudIntegrationDataflowsResponse.elasticCloudSlmStats)
        && Objects.equals(
            this.additionalProperties,
            elasticCloudIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        elasticCloudDetailedIndexStats,
        elasticCloudIndexStats,
        elasticCloudMetrics,
        elasticCloudPendingTaskStats,
        elasticCloudPrimaryShardGracefulTimeout,
        elasticCloudPrimaryShardStats,
        elasticCloudShardAllocationStats,
        elasticCloudSlmStats,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudIntegrationDataflowsResponse {\n");
    sb.append("    elasticCloudDetailedIndexStats: ")
        .append(toIndentedString(elasticCloudDetailedIndexStats))
        .append("\n");
    sb.append("    elasticCloudIndexStats: ")
        .append(toIndentedString(elasticCloudIndexStats))
        .append("\n");
    sb.append("    elasticCloudMetrics: ")
        .append(toIndentedString(elasticCloudMetrics))
        .append("\n");
    sb.append("    elasticCloudPendingTaskStats: ")
        .append(toIndentedString(elasticCloudPendingTaskStats))
        .append("\n");
    sb.append("    elasticCloudPrimaryShardGracefulTimeout: ")
        .append(toIndentedString(elasticCloudPrimaryShardGracefulTimeout))
        .append("\n");
    sb.append("    elasticCloudPrimaryShardStats: ")
        .append(toIndentedString(elasticCloudPrimaryShardStats))
        .append("\n");
    sb.append("    elasticCloudShardAllocationStats: ")
        .append(toIndentedString(elasticCloudShardAllocationStats))
        .append("\n");
    sb.append("    elasticCloudSlmStats: ")
        .append(toIndentedString(elasticCloudSlmStats))
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
