/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response containing a list of deleted dashboards. */
@JsonPropertyOrder({DashboardListDeleteItemsResponse.JSON_PROPERTY_DELETED_DASHBOARDS_FROM_LIST})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardListDeleteItemsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELETED_DASHBOARDS_FROM_LIST =
      "deleted_dashboards_from_list";
  private List<DashboardListItemResponse> deletedDashboardsFromList = null;

  public DashboardListDeleteItemsResponse deletedDashboardsFromList(
      List<DashboardListItemResponse> deletedDashboardsFromList) {
    this.deletedDashboardsFromList = deletedDashboardsFromList;
    for (DashboardListItemResponse item : deletedDashboardsFromList) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardListDeleteItemsResponse addDeletedDashboardsFromListItem(
      DashboardListItemResponse deletedDashboardsFromListItem) {
    if (this.deletedDashboardsFromList == null) {
      this.deletedDashboardsFromList = new ArrayList<>();
    }
    this.deletedDashboardsFromList.add(deletedDashboardsFromListItem);
    this.unparsed |= deletedDashboardsFromListItem.unparsed;
    return this;
  }

  /**
   * List of dashboards deleted from the dashboard list.
   *
   * @return deletedDashboardsFromList
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_DASHBOARDS_FROM_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardListItemResponse> getDeletedDashboardsFromList() {
    return deletedDashboardsFromList;
  }

  public void setDeletedDashboardsFromList(
      List<DashboardListItemResponse> deletedDashboardsFromList) {
    this.deletedDashboardsFromList = deletedDashboardsFromList;
  }

  /** Return true if this DashboardListDeleteItemsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListDeleteItemsResponse dashboardListDeleteItemsResponse =
        (DashboardListDeleteItemsResponse) o;
    return Objects.equals(
        this.deletedDashboardsFromList, dashboardListDeleteItemsResponse.deletedDashboardsFromList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedDashboardsFromList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListDeleteItemsResponse {\n");
    sb.append("    deletedDashboardsFromList: ")
        .append(toIndentedString(deletedDashboardsFromList))
        .append("\n");
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
