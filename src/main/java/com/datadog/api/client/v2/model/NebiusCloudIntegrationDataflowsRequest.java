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

/**
 * Data Datadog collects from Nebius Cloud, keyed by dataflow id. Each dataflow turns on a distinct
 * kind of collection: set <code>enabled</code> to stop or start it, and use <code>settings</code>
 * to configure what it collects. Defaults listed on each dataflow apply when the account is
 * created; on update, omitted fields keep their current values. Every dataflow except <code>
 * nebius-cloud-cost-collection</code> runs as the service account in <code>authentication</code>,
 * using its authorized key pair and the static API key; enabling one of them without those keys is
 * rejected with a <code>422</code> response, and one enabled with keys that later expire is stored
 * but collects no data.
 */
@JsonPropertyOrder({
  NebiusCloudIntegrationDataflowsRequest.JSON_PROPERTY_NEBIUS_CLOUD_COST_COLLECTION,
  NebiusCloudIntegrationDataflowsRequest.JSON_PROPERTY_NEBIUS_CLOUD_LOGS,
  NebiusCloudIntegrationDataflowsRequest.JSON_PROPERTY_NEBIUS_CLOUD_RESOURCES,
  NebiusCloudIntegrationDataflowsRequest.JSON_PROPERTY_NEBIUS_CLOUD_SERVICE_QUOTA_COLLECTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEBIUS_CLOUD_COST_COLLECTION =
      "nebius-cloud-cost-collection";
  private NebiusCloudCostCollectionIntegrationDataflowRequest nebiusCloudCostCollection;

  public static final String JSON_PROPERTY_NEBIUS_CLOUD_LOGS = "nebius-cloud-logs";
  private NebiusCloudLogsIntegrationDataflowRequest nebiusCloudLogs;

  public static final String JSON_PROPERTY_NEBIUS_CLOUD_RESOURCES = "nebius-cloud-resources";
  private NebiusCloudResourcesIntegrationDataflowRequest nebiusCloudResources;

  public static final String JSON_PROPERTY_NEBIUS_CLOUD_SERVICE_QUOTA_COLLECTION =
      "nebius-cloud-service-quota-collection";
  private NebiusCloudServiceQuotaCollectionIntegrationDataflowRequest
      nebiusCloudServiceQuotaCollection;

  public NebiusCloudIntegrationDataflowsRequest nebiusCloudCostCollection(
      NebiusCloudCostCollectionIntegrationDataflowRequest nebiusCloudCostCollection) {
    this.nebiusCloudCostCollection = nebiusCloudCostCollection;
    this.unparsed |= nebiusCloudCostCollection.unparsed;
    return this;
  }

  /**
   * Cloud cost data read from a Nebius Object Storage bucket export and used by <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a>. Enabling it
   * requires a bucket holding your cost export and a Nebius access key pair that can read it; a
   * request that enables this dataflow without them is rejected with a <code>422</code> response.
   *
   * @return nebiusCloudCostCollection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEBIUS_CLOUD_COST_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NebiusCloudCostCollectionIntegrationDataflowRequest getNebiusCloudCostCollection() {
    return nebiusCloudCostCollection;
  }

  public void setNebiusCloudCostCollection(
      NebiusCloudCostCollectionIntegrationDataflowRequest nebiusCloudCostCollection) {
    this.nebiusCloudCostCollection = nebiusCloudCostCollection;
    if (nebiusCloudCostCollection != null) {
      this.unparsed |= nebiusCloudCostCollection.unparsed;
    }
  }

  public NebiusCloudIntegrationDataflowsRequest nebiusCloudLogs(
      NebiusCloudLogsIntegrationDataflowRequest nebiusCloudLogs) {
    this.nebiusCloudLogs = nebiusCloudLogs;
    this.unparsed |= nebiusCloudLogs.unparsed;
    return this;
  }

  /**
   * Logs from your Nebius tenant: Kubernetes control plane and audit logs, tenant-level audit
   * events, compute serial console logs, cloud apps and AI inference logs, PostgreSQL logs, and
   * MLflow logs, collected from the services named in <code>settings.enabled_services</code>.
   * <code>enabled_services</code> is the sole source of truth for what is collected; <code>enabled
   * </code> set to <code>false</code> stops log collection, while <code>true</code> on its own
   * changes nothing. Defaults to no services.
   *
   * @return nebiusCloudLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEBIUS_CLOUD_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NebiusCloudLogsIntegrationDataflowRequest getNebiusCloudLogs() {
    return nebiusCloudLogs;
  }

  public void setNebiusCloudLogs(NebiusCloudLogsIntegrationDataflowRequest nebiusCloudLogs) {
    this.nebiusCloudLogs = nebiusCloudLogs;
    if (nebiusCloudLogs != null) {
      this.unparsed |= nebiusCloudLogs.unparsed;
    }
  }

  public NebiusCloudIntegrationDataflowsRequest nebiusCloudResources(
      NebiusCloudResourcesIntegrationDataflowRequest nebiusCloudResources) {
    this.nebiusCloudResources = nebiusCloudResources;
    this.unparsed |= nebiusCloudResources.unparsed;
    return this;
  }

  /**
   * Metadata about resources in your Nebius tenant, such as compute instances and Kubernetes
   * clusters.
   *
   * @return nebiusCloudResources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEBIUS_CLOUD_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NebiusCloudResourcesIntegrationDataflowRequest getNebiusCloudResources() {
    return nebiusCloudResources;
  }

  public void setNebiusCloudResources(
      NebiusCloudResourcesIntegrationDataflowRequest nebiusCloudResources) {
    this.nebiusCloudResources = nebiusCloudResources;
    if (nebiusCloudResources != null) {
      this.unparsed |= nebiusCloudResources.unparsed;
    }
  }

  public NebiusCloudIntegrationDataflowsRequest nebiusCloudServiceQuotaCollection(
      NebiusCloudServiceQuotaCollectionIntegrationDataflowRequest
          nebiusCloudServiceQuotaCollection) {
    this.nebiusCloudServiceQuotaCollection = nebiusCloudServiceQuotaCollection;
    this.unparsed |= nebiusCloudServiceQuotaCollection.unparsed;
    return this;
  }

  /**
   * Usage metrics tracked against your Nebius service quotas, such as <code>
   * nebius_cloud.servicequota.percentage_used</code> and <code>nebius_cloud.servicequota.limit
   * </code>.
   *
   * @return nebiusCloudServiceQuotaCollection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEBIUS_CLOUD_SERVICE_QUOTA_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NebiusCloudServiceQuotaCollectionIntegrationDataflowRequest
      getNebiusCloudServiceQuotaCollection() {
    return nebiusCloudServiceQuotaCollection;
  }

  public void setNebiusCloudServiceQuotaCollection(
      NebiusCloudServiceQuotaCollectionIntegrationDataflowRequest
          nebiusCloudServiceQuotaCollection) {
    this.nebiusCloudServiceQuotaCollection = nebiusCloudServiceQuotaCollection;
    if (nebiusCloudServiceQuotaCollection != null) {
      this.unparsed |= nebiusCloudServiceQuotaCollection.unparsed;
    }
  }

  /** Return true if this NebiusCloudIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudIntegrationDataflowsRequest nebiusCloudIntegrationDataflowsRequest =
        (NebiusCloudIntegrationDataflowsRequest) o;
    return Objects.equals(
            this.nebiusCloudCostCollection,
            nebiusCloudIntegrationDataflowsRequest.nebiusCloudCostCollection)
        && Objects.equals(
            this.nebiusCloudLogs, nebiusCloudIntegrationDataflowsRequest.nebiusCloudLogs)
        && Objects.equals(
            this.nebiusCloudResources, nebiusCloudIntegrationDataflowsRequest.nebiusCloudResources)
        && Objects.equals(
            this.nebiusCloudServiceQuotaCollection,
            nebiusCloudIntegrationDataflowsRequest.nebiusCloudServiceQuotaCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        nebiusCloudCostCollection,
        nebiusCloudLogs,
        nebiusCloudResources,
        nebiusCloudServiceQuotaCollection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudIntegrationDataflowsRequest {\n");
    sb.append("    nebiusCloudCostCollection: ")
        .append(toIndentedString(nebiusCloudCostCollection))
        .append("\n");
    sb.append("    nebiusCloudLogs: ").append(toIndentedString(nebiusCloudLogs)).append("\n");
    sb.append("    nebiusCloudResources: ")
        .append(toIndentedString(nebiusCloudResources))
        .append("\n");
    sb.append("    nebiusCloudServiceQuotaCollection: ")
        .append(toIndentedString(nebiusCloudServiceQuotaCollection))
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
