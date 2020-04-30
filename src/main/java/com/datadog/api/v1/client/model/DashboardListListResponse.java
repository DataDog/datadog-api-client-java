/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.DashboardList;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  DashboardListListResponse.JSON_PROPERTY_DASHBOARD_LISTS
})

public class DashboardListListResponse {
  public static final String JSON_PROPERTY_DASHBOARD_LISTS = "dashboard_lists";
  private List<DashboardList> dashboardLists = null;


  public DashboardListListResponse dashboardLists(List<DashboardList> dashboardLists) {
    
    this.dashboardLists = dashboardLists;
    return this;
  }

  public DashboardListListResponse addDashboardListsItem(DashboardList dashboardListsItem) {
    if (this.dashboardLists == null) {
      this.dashboardLists = new ArrayList<>();
    }
    this.dashboardLists.add(dashboardListsItem);
    return this;
  }

   /**
   * List of all your dashboard lists.
   * @return dashboardLists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all your dashboard lists.")
  @JsonProperty(JSON_PROPERTY_DASHBOARD_LISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DashboardList> getDashboardLists() {
    return dashboardLists;
  }


  public void setDashboardLists(List<DashboardList> dashboardLists) {
    this.dashboardLists = dashboardLists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

