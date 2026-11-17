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

/** Data Datadog collects from Nebius Cloud, keyed by dataflow id. */
@JsonPropertyOrder({
  NebiusCloudIntegrationDataflowsResponse.JSON_PROPERTY_NEBIUS_CLOUD_COST_COLLECTION,
  NebiusCloudIntegrationDataflowsResponse.JSON_PROPERTY_NEBIUS_CLOUD_LOGS,
  NebiusCloudIntegrationDataflowsResponse.JSON_PROPERTY_NEBIUS_CLOUD_RESOURCES,
  NebiusCloudIntegrationDataflowsResponse.JSON_PROPERTY_NEBIUS_CLOUD_SERVICE_QUOTA_COLLECTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEBIUS_CLOUD_COST_COLLECTION =
      "nebius-cloud-cost-collection";
  private NebiusCloudCostCollectionIntegrationDataflowResponse nebiusCloudCostCollection;

  public static final String JSON_PROPERTY_NEBIUS_CLOUD_LOGS = "nebius-cloud-logs";
  private NebiusCloudLogsIntegrationDataflowResponse nebiusCloudLogs;

  public static final String JSON_PROPERTY_NEBIUS_CLOUD_RESOURCES = "nebius-cloud-resources";
  private NebiusCloudResourcesIntegrationDataflowResponse nebiusCloudResources;

  public static final String JSON_PROPERTY_NEBIUS_CLOUD_SERVICE_QUOTA_COLLECTION =
      "nebius-cloud-service-quota-collection";
  private NebiusCloudServiceQuotaCollectionIntegrationDataflowResponse
      nebiusCloudServiceQuotaCollection;

  public NebiusCloudIntegrationDataflowsResponse nebiusCloudCostCollection(
      NebiusCloudCostCollectionIntegrationDataflowResponse nebiusCloudCostCollection) {
    this.nebiusCloudCostCollection = nebiusCloudCostCollection;
    this.unparsed |= nebiusCloudCostCollection.unparsed;
    return this;
  }

  /**
   * Cloud cost data read from a Nebius Object Storage bucket export and used by <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a>. Requires a
   * bucket holding your cost export and a Nebius access key pair that can read it; without both
   * this dataflow collects no data.
   *
   * @return nebiusCloudCostCollection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEBIUS_CLOUD_COST_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NebiusCloudCostCollectionIntegrationDataflowResponse getNebiusCloudCostCollection() {
    return nebiusCloudCostCollection;
  }

  public void setNebiusCloudCostCollection(
      NebiusCloudCostCollectionIntegrationDataflowResponse nebiusCloudCostCollection) {
    this.nebiusCloudCostCollection = nebiusCloudCostCollection;
    if (nebiusCloudCostCollection != null) {
      this.unparsed |= nebiusCloudCostCollection.unparsed;
    }
  }

  public NebiusCloudIntegrationDataflowsResponse nebiusCloudLogs(
      NebiusCloudLogsIntegrationDataflowResponse nebiusCloudLogs) {
    this.nebiusCloudLogs = nebiusCloudLogs;
    this.unparsed |= nebiusCloudLogs.unparsed;
    return this;
  }

  /**
   * Logs from your Nebius tenant: Kubernetes control plane and audit logs, tenant-level audit
   * events, compute serial console logs, cloud apps and AI inference logs, PostgreSQL logs, and
   * MLflow logs, collected from the services named in <code>settings.enabled_services</code>.
   *
   * @return nebiusCloudLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEBIUS_CLOUD_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NebiusCloudLogsIntegrationDataflowResponse getNebiusCloudLogs() {
    return nebiusCloudLogs;
  }

  public void setNebiusCloudLogs(NebiusCloudLogsIntegrationDataflowResponse nebiusCloudLogs) {
    this.nebiusCloudLogs = nebiusCloudLogs;
    if (nebiusCloudLogs != null) {
      this.unparsed |= nebiusCloudLogs.unparsed;
    }
  }

  public NebiusCloudIntegrationDataflowsResponse nebiusCloudResources(
      NebiusCloudResourcesIntegrationDataflowResponse nebiusCloudResources) {
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
  public NebiusCloudResourcesIntegrationDataflowResponse getNebiusCloudResources() {
    return nebiusCloudResources;
  }

  public void setNebiusCloudResources(
      NebiusCloudResourcesIntegrationDataflowResponse nebiusCloudResources) {
    this.nebiusCloudResources = nebiusCloudResources;
    if (nebiusCloudResources != null) {
      this.unparsed |= nebiusCloudResources.unparsed;
    }
  }

  public NebiusCloudIntegrationDataflowsResponse nebiusCloudServiceQuotaCollection(
      NebiusCloudServiceQuotaCollectionIntegrationDataflowResponse
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
  public NebiusCloudServiceQuotaCollectionIntegrationDataflowResponse
      getNebiusCloudServiceQuotaCollection() {
    return nebiusCloudServiceQuotaCollection;
  }

  public void setNebiusCloudServiceQuotaCollection(
      NebiusCloudServiceQuotaCollectionIntegrationDataflowResponse
          nebiusCloudServiceQuotaCollection) {
    this.nebiusCloudServiceQuotaCollection = nebiusCloudServiceQuotaCollection;
    if (nebiusCloudServiceQuotaCollection != null) {
      this.unparsed |= nebiusCloudServiceQuotaCollection.unparsed;
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
   * @return NebiusCloudIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public NebiusCloudIntegrationDataflowsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NebiusCloudIntegrationDataflowsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudIntegrationDataflowsResponse nebiusCloudIntegrationDataflowsResponse =
        (NebiusCloudIntegrationDataflowsResponse) o;
    return Objects.equals(
            this.nebiusCloudCostCollection,
            nebiusCloudIntegrationDataflowsResponse.nebiusCloudCostCollection)
        && Objects.equals(
            this.nebiusCloudLogs, nebiusCloudIntegrationDataflowsResponse.nebiusCloudLogs)
        && Objects.equals(
            this.nebiusCloudResources, nebiusCloudIntegrationDataflowsResponse.nebiusCloudResources)
        && Objects.equals(
            this.nebiusCloudServiceQuotaCollection,
            nebiusCloudIntegrationDataflowsResponse.nebiusCloudServiceQuotaCollection)
        && Objects.equals(
            this.additionalProperties,
            nebiusCloudIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        nebiusCloudCostCollection,
        nebiusCloudLogs,
        nebiusCloudResources,
        nebiusCloudServiceQuotaCollection,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudIntegrationDataflowsResponse {\n");
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
