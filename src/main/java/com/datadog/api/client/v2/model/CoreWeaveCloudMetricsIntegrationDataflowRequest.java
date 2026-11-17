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
 * Metrics from your CoreWeave organization: CoreWeave service metrics collected through its
 * PromQL-compatible Prometheus endpoint, plus the <code>coreweave.*</code> namespaces from
 * CoreWeave products such as Kubernetes, Database, Distributed File Storage, Inference, and Object
 * Storage. Compute metrics (<code>coreweave.bare_metal</code>, <code>coreweave.gpu</code>, <code>
 * coreweave.nccl</code>, and <code>coreweave.node</code>) are in Preview. Container metrics are not
 * collected; install the Datadog Agent on your clusters for those.
 */
@JsonPropertyOrder({CoreWeaveCloudMetricsIntegrationDataflowRequest.JSON_PROPERTY_ENABLED})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CoreWeaveCloudMetricsIntegrationDataflowRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public CoreWeaveCloudMetricsIntegrationDataflowRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether Datadog collects this data. Defaults to <code>true</code>; set to <code>false</code> to
   * stop collection.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /** Return true if this CoreWeaveCloudMetricsIntegrationDataflowRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreWeaveCloudMetricsIntegrationDataflowRequest
        coreWeaveCloudMetricsIntegrationDataflowRequest =
            (CoreWeaveCloudMetricsIntegrationDataflowRequest) o;
    return Objects.equals(this.enabled, coreWeaveCloudMetricsIntegrationDataflowRequest.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreWeaveCloudMetricsIntegrationDataflowRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
