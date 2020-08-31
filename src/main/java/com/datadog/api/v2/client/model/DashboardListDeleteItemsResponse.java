/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.DashboardListItemResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Response containing a list of deleted dashboards.
 */
@ApiModel(description = "Response containing a list of deleted dashboards.")
@JsonPropertyOrder({
  DashboardListDeleteItemsResponse.JSON_PROPERTY_DELETED_DASHBOARDS_FROM_LIST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DashboardListDeleteItemsResponse {
  public static final String JSON_PROPERTY_DELETED_DASHBOARDS_FROM_LIST = "deleted_dashboards_from_list";
  private List<DashboardListItemResponse> deletedDashboardsFromList = null;


  public DashboardListDeleteItemsResponse deletedDashboardsFromList(List<DashboardListItemResponse> deletedDashboardsFromList) {
    this.deletedDashboardsFromList = deletedDashboardsFromList;
    return this;
  }

  public DashboardListDeleteItemsResponse addDeletedDashboardsFromListItem(DashboardListItemResponse deletedDashboardsFromListItem) {
    if (this.deletedDashboardsFromList == null) {
      this.deletedDashboardsFromList = new ArrayList<>();
    }
    this.deletedDashboardsFromList.add(deletedDashboardsFromListItem);
    return this;
  }

   /**
   * List of dashboards deleted from the dashboard list.
   * @return deletedDashboardsFromList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of dashboards deleted from the dashboard list.")
  @JsonProperty(JSON_PROPERTY_DELETED_DASHBOARDS_FROM_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DashboardListItemResponse> getDeletedDashboardsFromList() {
    return deletedDashboardsFromList;
  }


  public void setDeletedDashboardsFromList(List<DashboardListItemResponse> deletedDashboardsFromList) {
    this.deletedDashboardsFromList = deletedDashboardsFromList;
  }


  /**
   * Return true if this DashboardListDeleteItemsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListDeleteItemsResponse dashboardListDeleteItemsResponse = (DashboardListDeleteItemsResponse) o;
    return Objects.equals(this.deletedDashboardsFromList, dashboardListDeleteItemsResponse.deletedDashboardsFromList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedDashboardsFromList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListDeleteItemsResponse {\n");
    sb.append("    deletedDashboardsFromList: ").append(toIndentedString(deletedDashboardsFromList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

