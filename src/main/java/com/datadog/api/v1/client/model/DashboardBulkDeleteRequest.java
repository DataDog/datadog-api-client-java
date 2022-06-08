/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Dashboard bulk delete request body. */
@JsonPropertyOrder({DashboardBulkDeleteRequest.JSON_PROPERTY_DATA})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardBulkDeleteRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<DashboardBulkActionData> data = new ArrayList<>();

  public DashboardBulkDeleteRequest() {}

  @JsonCreator
  public DashboardBulkDeleteRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<DashboardBulkActionData> data) {
    this.data = data;
  }

  public DashboardBulkDeleteRequest data(List<DashboardBulkActionData> data) {
    this.data = data;
    for (DashboardBulkActionData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardBulkDeleteRequest addDataItem(DashboardBulkActionData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * List of dashboard bulk action request data objects.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DashboardBulkActionData> getData() {
    return data;
  }

  public void setData(List<DashboardBulkActionData> data) {
    this.data = data;
  }

  /** Return true if this DashboardBulkDeleteRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardBulkDeleteRequest dashboardBulkDeleteRequest = (DashboardBulkDeleteRequest) o;
    return Objects.equals(this.data, dashboardBulkDeleteRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardBulkDeleteRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
