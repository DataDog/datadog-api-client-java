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
 * Data Datadog collects from CoreWeave, keyed by dataflow id. Each dataflow turns on a distinct
 * kind of collection: set <code>enabled</code> to start or stop it. Defaults listed on each
 * dataflow apply when the account is created; on update, omitted dataflow ids keep their current
 * values. Collection runs with the API access token in <code>authentication</code>, whose user must
 * have the Observability Viewer role; a dataflow enabled without that role is stored but collects
 * no data.
 */
@JsonPropertyOrder({
  CoreWeaveCloudIntegrationDataflowsRequest.JSON_PROPERTY_COREWEAVE_CLOUD_LOGS,
  CoreWeaveCloudIntegrationDataflowsRequest.JSON_PROPERTY_COREWEAVE_CLOUD_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CoreWeaveCloudIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COREWEAVE_CLOUD_LOGS = "coreweave-cloud-logs";
  private CoreWeaveCloudLogsIntegrationDataflowRequest coreweaveCloudLogs;

  public static final String JSON_PROPERTY_COREWEAVE_CLOUD_METRICS = "coreweave-cloud-metrics";
  private CoreWeaveCloudMetricsIntegrationDataflowRequest coreweaveCloudMetrics;

  public CoreWeaveCloudIntegrationDataflowsRequest coreweaveCloudLogs(
      CoreWeaveCloudLogsIntegrationDataflowRequest coreweaveCloudLogs) {
    this.coreweaveCloudLogs = coreweaveCloudLogs;
    this.unparsed |= coreweaveCloudLogs.unparsed;
    return this;
  }

  /**
   * Service logs for CoreWeave-managed components in each CoreWeave region: the CKS control plane
   * (such as <code>kube-apiserver</code> and <code>etcd</code>), CoreWeave add-on services in the
   * <code>cw-*</code> and <code>kube-system</code> namespaces, SUNK, and node system logs such as
   * <code>kubelet</code> and <code>containerd</code>. Logs from your own workloads and Kubernetes
   * audit logs are not collected. Logs are sent with <code>source:coreweave</code>, with CoreWeave
   * log labels such as <code>namespace</code>, <code>app</code>, and <code>systemd_unit</code>
   * added as tags.
   *
   * @return coreweaveCloudLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COREWEAVE_CLOUD_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CoreWeaveCloudLogsIntegrationDataflowRequest getCoreweaveCloudLogs() {
    return coreweaveCloudLogs;
  }

  public void setCoreweaveCloudLogs(
      CoreWeaveCloudLogsIntegrationDataflowRequest coreweaveCloudLogs) {
    this.coreweaveCloudLogs = coreweaveCloudLogs;
    if (coreweaveCloudLogs != null) {
      this.unparsed |= coreweaveCloudLogs.unparsed;
    }
  }

  public CoreWeaveCloudIntegrationDataflowsRequest coreweaveCloudMetrics(
      CoreWeaveCloudMetricsIntegrationDataflowRequest coreweaveCloudMetrics) {
    this.coreweaveCloudMetrics = coreweaveCloudMetrics;
    this.unparsed |= coreweaveCloudMetrics.unparsed;
    return this;
  }

  /**
   * Metrics from your CoreWeave organization: CoreWeave service metrics collected through its
   * PromQL-compatible Prometheus endpoint, plus the <code>coreweave.*</code> namespaces from
   * CoreWeave products such as Kubernetes, Database, Distributed File Storage, Inference, and
   * Object Storage. Compute metrics (<code>coreweave.bare_metal</code>, <code>coreweave.gpu</code>,
   * <code>coreweave.nccl</code>, and <code>coreweave.node</code>) are in Preview. Container metrics
   * are not collected; install the Datadog Agent on your clusters for those.
   *
   * @return coreweaveCloudMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COREWEAVE_CLOUD_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CoreWeaveCloudMetricsIntegrationDataflowRequest getCoreweaveCloudMetrics() {
    return coreweaveCloudMetrics;
  }

  public void setCoreweaveCloudMetrics(
      CoreWeaveCloudMetricsIntegrationDataflowRequest coreweaveCloudMetrics) {
    this.coreweaveCloudMetrics = coreweaveCloudMetrics;
    if (coreweaveCloudMetrics != null) {
      this.unparsed |= coreweaveCloudMetrics.unparsed;
    }
  }

  /** Return true if this CoreWeaveCloudIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreWeaveCloudIntegrationDataflowsRequest coreWeaveCloudIntegrationDataflowsRequest =
        (CoreWeaveCloudIntegrationDataflowsRequest) o;
    return Objects.equals(
            this.coreweaveCloudLogs, coreWeaveCloudIntegrationDataflowsRequest.coreweaveCloudLogs)
        && Objects.equals(
            this.coreweaveCloudMetrics,
            coreWeaveCloudIntegrationDataflowsRequest.coreweaveCloudMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreweaveCloudLogs, coreweaveCloudMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreWeaveCloudIntegrationDataflowsRequest {\n");
    sb.append("    coreweaveCloudLogs: ").append(toIndentedString(coreweaveCloudLogs)).append("\n");
    sb.append("    coreweaveCloudMetrics: ")
        .append(toIndentedString(coreweaveCloudMetrics))
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
