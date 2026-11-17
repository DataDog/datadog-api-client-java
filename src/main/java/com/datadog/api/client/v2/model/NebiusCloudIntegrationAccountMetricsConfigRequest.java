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

/** Configuration for metric collection from this Nebius Cloud account. */
@JsonPropertyOrder({
  NebiusCloudIntegrationAccountMetricsConfigRequest.JSON_PROPERTY_CLUSTER_FILTERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudIntegrationAccountMetricsConfigRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLUSTER_FILTERS = "cluster_filters";
  private List<String> clusterFilters = null;

  public NebiusCloudIntegrationAccountMetricsConfigRequest clusterFilters(
      List<String> clusterFilters) {
    this.clusterFilters = clusterFilters;
    return this;
  }

  public NebiusCloudIntegrationAccountMetricsConfigRequest addClusterFiltersItem(
      String clusterFiltersItem) {
    if (this.clusterFilters == null) {
      this.clusterFilters = new ArrayList<>();
    }
    this.clusterFilters.add(clusterFiltersItem);
    return this;
  }

  /**
   * Tag-filter rules limiting metric collection to matching Kubernetes clusters, for cost savings.
   * Include rules (<code>key:value</code>) are combined with OR, exclusion rules (<code>!key:value
   * </code>) are then applied with AND, and <code>?</code> and <code>*</code> are wildcards; for
   * example <code>cluster:prod-*</code> collects only matching clusters and <code>!cluster:dev
   * </code> excludes a cluster. Defaults to no filters: every cluster is collected. Only
   * cluster-scoped metrics are filtered; billing and object storage metrics are always collected.
   *
   * @return clusterFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getClusterFilters() {
    return clusterFilters;
  }

  public void setClusterFilters(List<String> clusterFilters) {
    this.clusterFilters = clusterFilters;
  }

  /** Return true if this NebiusCloudIntegrationAccountMetricsConfigRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudIntegrationAccountMetricsConfigRequest
        nebiusCloudIntegrationAccountMetricsConfigRequest =
            (NebiusCloudIntegrationAccountMetricsConfigRequest) o;
    return Objects.equals(
        this.clusterFilters, nebiusCloudIntegrationAccountMetricsConfigRequest.clusterFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudIntegrationAccountMetricsConfigRequest {\n");
    sb.append("    clusterFilters: ").append(toIndentedString(clusterFilters)).append("\n");
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
