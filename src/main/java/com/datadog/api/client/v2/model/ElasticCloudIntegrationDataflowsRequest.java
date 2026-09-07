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
import java.util.UUID;
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
   * <p>Dataflows to configure on the Elastic Cloud integration account, keyed by dataflow id.</p>
 */
@JsonPropertyOrder({
  ElasticCloudIntegrationDataflowsRequest.JSON_PROPERTY_ELASTIC_CLOUD_DETAILED_INDEX_STATS,
  ElasticCloudIntegrationDataflowsRequest.JSON_PROPERTY_ELASTIC_CLOUD_INDEX_STATS,
  ElasticCloudIntegrationDataflowsRequest.JSON_PROPERTY_ELASTIC_CLOUD_PENDING_TASK_STATS,
  ElasticCloudIntegrationDataflowsRequest.JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_GRACEFUL_TIMEOUT,
  ElasticCloudIntegrationDataflowsRequest.JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_STATS,
  ElasticCloudIntegrationDataflowsRequest.JSON_PROPERTY_ELASTIC_CLOUD_SHARD_ALLOCATION_STATS,
  ElasticCloudIntegrationDataflowsRequest.JSON_PROPERTY_ELASTIC_CLOUD_SLM_STATS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudIntegrationDataflowsRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELASTIC_CLOUD_DETAILED_INDEX_STATS = "elastic-cloud-detailed-index-stats";
  private ElasticCloudDetailedIndexStatsIntegrationDataflowRequest elasticCloudDetailedIndexStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_INDEX_STATS = "elastic-cloud-index-stats";
  private ElasticCloudIndexStatsIntegrationDataflowRequest elasticCloudIndexStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_PENDING_TASK_STATS = "elastic-cloud-pending-task-stats";
  private ElasticCloudPendingTaskStatsIntegrationDataflowRequest elasticCloudPendingTaskStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_GRACEFUL_TIMEOUT = "elastic-cloud-primary-shard-graceful-timeout";
  private ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowRequest elasticCloudPrimaryShardGracefulTimeout;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_STATS = "elastic-cloud-primary-shard-stats";
  private ElasticCloudPrimaryShardStatsIntegrationDataflowRequest elasticCloudPrimaryShardStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_SHARD_ALLOCATION_STATS = "elastic-cloud-shard-allocation-stats";
  private ElasticCloudShardAllocationStatsIntegrationDataflowRequest elasticCloudShardAllocationStats;

  public static final String JSON_PROPERTY_ELASTIC_CLOUD_SLM_STATS = "elastic-cloud-slm-stats";
  private ElasticCloudSlmStatsIntegrationDataflowRequest elasticCloudSlmStats;

  public ElasticCloudIntegrationDataflowsRequest elasticCloudDetailedIndexStats(ElasticCloudDetailedIndexStatsIntegrationDataflowRequest elasticCloudDetailedIndexStats) {
    this.elasticCloudDetailedIndexStats = elasticCloudDetailedIndexStats;
    this.unparsed |= elasticCloudDetailedIndexStats.unparsed;
    return this;
  }

  /**
   * <p>The Elastic Cloud detailed index stats dataflow.</p>
   * @return elasticCloudDetailedIndexStats
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_DETAILED_INDEX_STATS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ElasticCloudDetailedIndexStatsIntegrationDataflowRequest getElasticCloudDetailedIndexStats() {
        return elasticCloudDetailedIndexStats;
      }
  public void setElasticCloudDetailedIndexStats(ElasticCloudDetailedIndexStatsIntegrationDataflowRequest elasticCloudDetailedIndexStats) {
    this.elasticCloudDetailedIndexStats = elasticCloudDetailedIndexStats;
    if (elasticCloudDetailedIndexStats != null) {
      this.unparsed |= elasticCloudDetailedIndexStats.unparsed;
    }
  }
  public ElasticCloudIntegrationDataflowsRequest elasticCloudIndexStats(ElasticCloudIndexStatsIntegrationDataflowRequest elasticCloudIndexStats) {
    this.elasticCloudIndexStats = elasticCloudIndexStats;
    this.unparsed |= elasticCloudIndexStats.unparsed;
    return this;
  }

  /**
   * <p>The Elastic Cloud index stats dataflow.</p>
   * @return elasticCloudIndexStats
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_INDEX_STATS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ElasticCloudIndexStatsIntegrationDataflowRequest getElasticCloudIndexStats() {
        return elasticCloudIndexStats;
      }
  public void setElasticCloudIndexStats(ElasticCloudIndexStatsIntegrationDataflowRequest elasticCloudIndexStats) {
    this.elasticCloudIndexStats = elasticCloudIndexStats;
    if (elasticCloudIndexStats != null) {
      this.unparsed |= elasticCloudIndexStats.unparsed;
    }
  }
  public ElasticCloudIntegrationDataflowsRequest elasticCloudPendingTaskStats(ElasticCloudPendingTaskStatsIntegrationDataflowRequest elasticCloudPendingTaskStats) {
    this.elasticCloudPendingTaskStats = elasticCloudPendingTaskStats;
    this.unparsed |= elasticCloudPendingTaskStats.unparsed;
    return this;
  }

  /**
   * <p>The Elastic Cloud pending task stats dataflow.</p>
   * @return elasticCloudPendingTaskStats
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_PENDING_TASK_STATS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ElasticCloudPendingTaskStatsIntegrationDataflowRequest getElasticCloudPendingTaskStats() {
        return elasticCloudPendingTaskStats;
      }
  public void setElasticCloudPendingTaskStats(ElasticCloudPendingTaskStatsIntegrationDataflowRequest elasticCloudPendingTaskStats) {
    this.elasticCloudPendingTaskStats = elasticCloudPendingTaskStats;
    if (elasticCloudPendingTaskStats != null) {
      this.unparsed |= elasticCloudPendingTaskStats.unparsed;
    }
  }
  public ElasticCloudIntegrationDataflowsRequest elasticCloudPrimaryShardGracefulTimeout(ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowRequest elasticCloudPrimaryShardGracefulTimeout) {
    this.elasticCloudPrimaryShardGracefulTimeout = elasticCloudPrimaryShardGracefulTimeout;
    this.unparsed |= elasticCloudPrimaryShardGracefulTimeout.unparsed;
    return this;
  }

  /**
   * <p>The Elastic Cloud primary shard graceful timeout dataflow.</p>
   * @return elasticCloudPrimaryShardGracefulTimeout
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_GRACEFUL_TIMEOUT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowRequest getElasticCloudPrimaryShardGracefulTimeout() {
        return elasticCloudPrimaryShardGracefulTimeout;
      }
  public void setElasticCloudPrimaryShardGracefulTimeout(ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowRequest elasticCloudPrimaryShardGracefulTimeout) {
    this.elasticCloudPrimaryShardGracefulTimeout = elasticCloudPrimaryShardGracefulTimeout;
    if (elasticCloudPrimaryShardGracefulTimeout != null) {
      this.unparsed |= elasticCloudPrimaryShardGracefulTimeout.unparsed;
    }
  }
  public ElasticCloudIntegrationDataflowsRequest elasticCloudPrimaryShardStats(ElasticCloudPrimaryShardStatsIntegrationDataflowRequest elasticCloudPrimaryShardStats) {
    this.elasticCloudPrimaryShardStats = elasticCloudPrimaryShardStats;
    this.unparsed |= elasticCloudPrimaryShardStats.unparsed;
    return this;
  }

  /**
   * <p>The Elastic Cloud primary shard stats dataflow.</p>
   * @return elasticCloudPrimaryShardStats
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_PRIMARY_SHARD_STATS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ElasticCloudPrimaryShardStatsIntegrationDataflowRequest getElasticCloudPrimaryShardStats() {
        return elasticCloudPrimaryShardStats;
      }
  public void setElasticCloudPrimaryShardStats(ElasticCloudPrimaryShardStatsIntegrationDataflowRequest elasticCloudPrimaryShardStats) {
    this.elasticCloudPrimaryShardStats = elasticCloudPrimaryShardStats;
    if (elasticCloudPrimaryShardStats != null) {
      this.unparsed |= elasticCloudPrimaryShardStats.unparsed;
    }
  }
  public ElasticCloudIntegrationDataflowsRequest elasticCloudShardAllocationStats(ElasticCloudShardAllocationStatsIntegrationDataflowRequest elasticCloudShardAllocationStats) {
    this.elasticCloudShardAllocationStats = elasticCloudShardAllocationStats;
    this.unparsed |= elasticCloudShardAllocationStats.unparsed;
    return this;
  }

  /**
   * <p>The Elastic Cloud shard allocation stats dataflow.</p>
   * @return elasticCloudShardAllocationStats
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_SHARD_ALLOCATION_STATS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ElasticCloudShardAllocationStatsIntegrationDataflowRequest getElasticCloudShardAllocationStats() {
        return elasticCloudShardAllocationStats;
      }
  public void setElasticCloudShardAllocationStats(ElasticCloudShardAllocationStatsIntegrationDataflowRequest elasticCloudShardAllocationStats) {
    this.elasticCloudShardAllocationStats = elasticCloudShardAllocationStats;
    if (elasticCloudShardAllocationStats != null) {
      this.unparsed |= elasticCloudShardAllocationStats.unparsed;
    }
  }
  public ElasticCloudIntegrationDataflowsRequest elasticCloudSlmStats(ElasticCloudSlmStatsIntegrationDataflowRequest elasticCloudSlmStats) {
    this.elasticCloudSlmStats = elasticCloudSlmStats;
    this.unparsed |= elasticCloudSlmStats.unparsed;
    return this;
  }

  /**
   * <p>The Elastic Cloud snapshot lifecycle management stats dataflow.</p>
   * @return elasticCloudSlmStats
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELASTIC_CLOUD_SLM_STATS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ElasticCloudSlmStatsIntegrationDataflowRequest getElasticCloudSlmStats() {
        return elasticCloudSlmStats;
      }
  public void setElasticCloudSlmStats(ElasticCloudSlmStatsIntegrationDataflowRequest elasticCloudSlmStats) {
    this.elasticCloudSlmStats = elasticCloudSlmStats;
    if (elasticCloudSlmStats != null) {
      this.unparsed |= elasticCloudSlmStats.unparsed;
    }
  }

  /**
   * Return true if this ElasticCloudIntegrationDataflowsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudIntegrationDataflowsRequest elasticCloudIntegrationDataflowsRequest = (ElasticCloudIntegrationDataflowsRequest) o;
    return Objects.equals(this.elasticCloudDetailedIndexStats, elasticCloudIntegrationDataflowsRequest.elasticCloudDetailedIndexStats) && Objects.equals(this.elasticCloudIndexStats, elasticCloudIntegrationDataflowsRequest.elasticCloudIndexStats) && Objects.equals(this.elasticCloudPendingTaskStats, elasticCloudIntegrationDataflowsRequest.elasticCloudPendingTaskStats) && Objects.equals(this.elasticCloudPrimaryShardGracefulTimeout, elasticCloudIntegrationDataflowsRequest.elasticCloudPrimaryShardGracefulTimeout) && Objects.equals(this.elasticCloudPrimaryShardStats, elasticCloudIntegrationDataflowsRequest.elasticCloudPrimaryShardStats) && Objects.equals(this.elasticCloudShardAllocationStats, elasticCloudIntegrationDataflowsRequest.elasticCloudShardAllocationStats) && Objects.equals(this.elasticCloudSlmStats, elasticCloudIntegrationDataflowsRequest.elasticCloudSlmStats);
  }


  @Override
  public int hashCode() {
    return Objects.hash(elasticCloudDetailedIndexStats,elasticCloudIndexStats,elasticCloudPendingTaskStats,elasticCloudPrimaryShardGracefulTimeout,elasticCloudPrimaryShardStats,elasticCloudShardAllocationStats,elasticCloudSlmStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudIntegrationDataflowsRequest {\n");
    sb.append("    elasticCloudDetailedIndexStats: ").append(toIndentedString(elasticCloudDetailedIndexStats)).append("\n");
    sb.append("    elasticCloudIndexStats: ").append(toIndentedString(elasticCloudIndexStats)).append("\n");
    sb.append("    elasticCloudPendingTaskStats: ").append(toIndentedString(elasticCloudPendingTaskStats)).append("\n");
    sb.append("    elasticCloudPrimaryShardGracefulTimeout: ").append(toIndentedString(elasticCloudPrimaryShardGracefulTimeout)).append("\n");
    sb.append("    elasticCloudPrimaryShardStats: ").append(toIndentedString(elasticCloudPrimaryShardStats)).append("\n");
    sb.append("    elasticCloudShardAllocationStats: ").append(toIndentedString(elasticCloudShardAllocationStats)).append("\n");
    sb.append("    elasticCloudSlmStats: ").append(toIndentedString(elasticCloudSlmStats)).append("\n");
    sb.append('}');
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
