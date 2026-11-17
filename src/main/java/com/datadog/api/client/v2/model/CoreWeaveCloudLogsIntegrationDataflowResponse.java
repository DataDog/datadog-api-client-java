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

/**
 * Service logs for CoreWeave-managed components in each CoreWeave region: the CKS control plane
 * (such as <code>kube-apiserver</code> and <code>etcd</code>), CoreWeave add-on services in the
 * <code>cw-*</code> and <code>kube-system</code> namespaces, SUNK, and node system logs such as
 * <code>kubelet</code> and <code>containerd</code>. Logs from your own workloads and Kubernetes
 * audit logs are not collected. Logs are sent with <code>source:coreweave</code>, with CoreWeave
 * log labels such as <code>namespace</code>, <code>app</code>, and <code>systemd_unit</code> added
 * as tags.
 */
@JsonPropertyOrder({CoreWeaveCloudLogsIntegrationDataflowResponse.JSON_PROPERTY_ENABLED})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CoreWeaveCloudLogsIntegrationDataflowResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public CoreWeaveCloudLogsIntegrationDataflowResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether Datadog collects this data. Absent when the dataflow has never been configured, in
   * which case the documented default applies.
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
   * @return CoreWeaveCloudLogsIntegrationDataflowResponse
   */
  @JsonAnySetter
  public CoreWeaveCloudLogsIntegrationDataflowResponse putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this CoreWeaveCloudLogsIntegrationDataflowResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreWeaveCloudLogsIntegrationDataflowResponse coreWeaveCloudLogsIntegrationDataflowResponse =
        (CoreWeaveCloudLogsIntegrationDataflowResponse) o;
    return Objects.equals(this.enabled, coreWeaveCloudLogsIntegrationDataflowResponse.enabled)
        && Objects.equals(
            this.additionalProperties,
            coreWeaveCloudLogsIntegrationDataflowResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreWeaveCloudLogsIntegrationDataflowResponse {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
