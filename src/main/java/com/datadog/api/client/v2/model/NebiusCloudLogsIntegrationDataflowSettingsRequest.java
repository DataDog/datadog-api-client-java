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

/** Settings of the logs dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  NebiusCloudLogsIntegrationDataflowSettingsRequest.JSON_PROPERTY_ENABLED_SERVICES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudLogsIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED_SERVICES = "enabled_services";
  private List<String> enabledServices = null;

  public NebiusCloudLogsIntegrationDataflowSettingsRequest enabledServices(
      List<String> enabledServices) {
    this.enabledServices = enabledServices;
    return this;
  }

  public NebiusCloudLogsIntegrationDataflowSettingsRequest addEnabledServicesItem(
      String enabledServicesItem) {
    if (this.enabledServices == null) {
      this.enabledServices = new ArrayList<>();
    }
    this.enabledServices.add(enabledServicesItem);
    return this;
  }

  /**
   * Nebius log integrations to collect. One of <code>nebius-cloud-compute</code>, <code>
   * nebius-cloud-kubernetes</code>, <code>nebius-cloud-mlflow</code>, <code>nebius-cloud-postgresql
   * </code>, <code>nebius-cloud-applications</code>, or <code>default</code> for the streams shared
   * by every service. A non-empty list is the sole source of truth and replaces the stored list:
   * those services are collected and any others stop. An empty list stops log collection entirely.
   * Omit it to keep the stored list.
   *
   * @return enabledServices
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnabledServices() {
    return enabledServices;
  }

  public void setEnabledServices(List<String> enabledServices) {
    this.enabledServices = enabledServices;
  }

  /** Return true if this NebiusCloudLogsIntegrationDataflowSettingsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudLogsIntegrationDataflowSettingsRequest
        nebiusCloudLogsIntegrationDataflowSettingsRequest =
            (NebiusCloudLogsIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
        this.enabledServices, nebiusCloudLogsIntegrationDataflowSettingsRequest.enabledServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudLogsIntegrationDataflowSettingsRequest {\n");
    sb.append("    enabledServices: ").append(toIndentedString(enabledServices)).append("\n");
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
