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

/** Response containing a list of added dashboards. */
@JsonPropertyOrder({DashboardListAddItemsResponse.JSON_PROPERTY_ADDED_DASHBOARDS_TO_LIST})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardListAddItemsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDED_DASHBOARDS_TO_LIST = "added_dashboards_to_list";
  private List<DashboardListItemResponse> addedDashboardsToList = null;

  public DashboardListAddItemsResponse addedDashboardsToList(
      List<DashboardListItemResponse> addedDashboardsToList) {
    this.addedDashboardsToList = addedDashboardsToList;
    for (DashboardListItemResponse item : addedDashboardsToList) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardListAddItemsResponse addAddedDashboardsToListItem(
      DashboardListItemResponse addedDashboardsToListItem) {
    if (this.addedDashboardsToList == null) {
      this.addedDashboardsToList = new ArrayList<>();
    }
    this.addedDashboardsToList.add(addedDashboardsToListItem);
    this.unparsed |= addedDashboardsToListItem.unparsed;
    return this;
  }

  /**
   * List of dashboards added to the dashboard list.
   *
   * @return addedDashboardsToList
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDED_DASHBOARDS_TO_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardListItemResponse> getAddedDashboardsToList() {
    return addedDashboardsToList;
  }

  public void setAddedDashboardsToList(List<DashboardListItemResponse> addedDashboardsToList) {
    this.addedDashboardsToList = addedDashboardsToList;
  }

  /** Return true if this DashboardListAddItemsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListAddItemsResponse dashboardListAddItemsResponse = (DashboardListAddItemsResponse) o;
    return Objects.equals(
        this.addedDashboardsToList, dashboardListAddItemsResponse.addedDashboardsToList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedDashboardsToList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListAddItemsResponse {\n");
    sb.append("    addedDashboardsToList: ")
        .append(toIndentedString(addedDashboardsToList))
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
