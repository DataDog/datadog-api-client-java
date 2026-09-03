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

/** Settings of the Databricks cloud cost metrics dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  DatabricksCloudCostMetricsIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_CCM_COLLECT_ALL_WORKSPACES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksCloudCostMetricsIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CCM_COLLECT_ALL_WORKSPACES =
      "ccm_collect_all_workspaces";
  private Boolean ccmCollectAllWorkspaces;

  public DatabricksCloudCostMetricsIntegrationDataflowSettingsRequest ccmCollectAllWorkspaces(
      Boolean ccmCollectAllWorkspaces) {
    this.ccmCollectAllWorkspaces = ccmCollectAllWorkspaces;
    return this;
  }

  /**
   * Whether cost data is collected for every workspace in the Databricks account rather than this
   * workspace only.
   *
   * @return ccmCollectAllWorkspaces
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_COLLECT_ALL_WORKSPACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCcmCollectAllWorkspaces() {
    return ccmCollectAllWorkspaces;
  }

  public void setCcmCollectAllWorkspaces(Boolean ccmCollectAllWorkspaces) {
    this.ccmCollectAllWorkspaces = ccmCollectAllWorkspaces;
  }

  /**
   * Return true if this DatabricksCloudCostMetricsIntegrationDataflowSettingsRequest object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksCloudCostMetricsIntegrationDataflowSettingsRequest
        databricksCloudCostMetricsIntegrationDataflowSettingsRequest =
            (DatabricksCloudCostMetricsIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
        this.ccmCollectAllWorkspaces,
        databricksCloudCostMetricsIntegrationDataflowSettingsRequest.ccmCollectAllWorkspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccmCollectAllWorkspaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksCloudCostMetricsIntegrationDataflowSettingsRequest {\n");
    sb.append("    ccmCollectAllWorkspaces: ")
        .append(toIndentedString(ccmCollectAllWorkspaces))
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
