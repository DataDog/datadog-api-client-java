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

/** Request containing the list of dashboards to update to. */
@JsonPropertyOrder({DashboardListUpdateItemsRequest.JSON_PROPERTY_DASHBOARDS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardListUpdateItemsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DASHBOARDS = "dashboards";
  private List<DashboardListItemRequest> dashboards = null;

  public DashboardListUpdateItemsRequest dashboards(List<DashboardListItemRequest> dashboards) {
    this.dashboards = dashboards;
    for (DashboardListItemRequest item : dashboards) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardListUpdateItemsRequest addDashboardsItem(
      DashboardListItemRequest dashboardsItem) {
    if (this.dashboards == null) {
      this.dashboards = new ArrayList<>();
    }
    this.dashboards.add(dashboardsItem);
    this.unparsed |= dashboardsItem.unparsed;
    return this;
  }

  /**
   * List of dashboards to update the dashboard list to.
   *
   * @return dashboards
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardListItemRequest> getDashboards() {
    return dashboards;
  }

  public void setDashboards(List<DashboardListItemRequest> dashboards) {
    this.dashboards = dashboards;
  }

  /** Return true if this DashboardListUpdateItemsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListUpdateItemsRequest dashboardListUpdateItemsRequest =
        (DashboardListUpdateItemsRequest) o;
    return Objects.equals(this.dashboards, dashboardListUpdateItemsRequest.dashboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListUpdateItemsRequest {\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("}");
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
