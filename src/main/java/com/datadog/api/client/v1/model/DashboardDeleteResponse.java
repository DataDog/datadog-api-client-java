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
import java.util.Objects;

/** Response from the delete dashboard call. */
@JsonPropertyOrder({DashboardDeleteResponse.JSON_PROPERTY_DELETED_DASHBOARD_ID})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardDeleteResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELETED_DASHBOARD_ID = "deleted_dashboard_id";
  private String deletedDashboardId;

  public DashboardDeleteResponse deletedDashboardId(String deletedDashboardId) {
    this.deletedDashboardId = deletedDashboardId;
    return this;
  }

  /**
   * ID of the deleted dashboard.
   *
   * @return deletedDashboardId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_DASHBOARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeletedDashboardId() {
    return deletedDashboardId;
  }

  public void setDeletedDashboardId(String deletedDashboardId) {
    this.deletedDashboardId = deletedDashboardId;
  }

  /** Return true if this DashboardDeleteResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardDeleteResponse dashboardDeleteResponse = (DashboardDeleteResponse) o;
    return Objects.equals(this.deletedDashboardId, dashboardDeleteResponse.deletedDashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedDashboardId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardDeleteResponse {\n");
    sb.append("    deletedDashboardId: ").append(toIndentedString(deletedDashboardId)).append("\n");
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
