/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Information on your dashboard lists. */
@JsonPropertyOrder({DashboardListListResponse.JSON_PROPERTY_DASHBOARD_LISTS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardListListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DASHBOARD_LISTS = "dashboard_lists";
  private List<DashboardList> dashboardLists = null;

  public DashboardListListResponse dashboardLists(List<DashboardList> dashboardLists) {
    this.dashboardLists = dashboardLists;
    for (DashboardList item : dashboardLists) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardListListResponse addDashboardListsItem(DashboardList dashboardListsItem) {
    if (this.dashboardLists == null) {
      this.dashboardLists = new ArrayList<>();
    }
    this.dashboardLists.add(dashboardListsItem);
    this.unparsed |= dashboardListsItem.unparsed;
    return this;
  }

  /**
   * List of all your dashboard lists.
   *
   * @return dashboardLists
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_LISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardList> getDashboardLists() {
    return dashboardLists;
  }

  public void setDashboardLists(List<DashboardList> dashboardLists) {
    this.dashboardLists = dashboardLists;
  }

  /** Return true if this DashboardListListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListListResponse dashboardListListResponse = (DashboardListListResponse) o;
    return Objects.equals(this.dashboardLists, dashboardListListResponse.dashboardLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardLists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListListResponse {\n");
    sb.append("    dashboardLists: ").append(toIndentedString(dashboardLists)).append("\n");
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
