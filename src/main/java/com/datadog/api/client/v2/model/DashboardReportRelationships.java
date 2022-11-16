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

/** Relationships of a dashboard report. */
@JsonPropertyOrder({DashboardReportRelationships.JSON_PROPERTY_DASHBOARD})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardReportRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DASHBOARD = "dashboard";
  private DashboardReportRelationshipsDashboard dashboard;

  public DashboardReportRelationships dashboard(DashboardReportRelationshipsDashboard dashboard) {
    this.dashboard = dashboard;
    this.unparsed |= dashboard.unparsed;
    return this;
  }

  /**
   * Dashboard associated with the report.
   *
   * @return dashboard
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardReportRelationshipsDashboard getDashboard() {
    return dashboard;
  }

  public void setDashboard(DashboardReportRelationshipsDashboard dashboard) {
    this.dashboard = dashboard;
  }

  /** Return true if this DashboardReportRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardReportRelationships dashboardReportRelationships = (DashboardReportRelationships) o;
    return Objects.equals(this.dashboard, dashboardReportRelationships.dashboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardReportRelationships {\n");
    sb.append("    dashboard: ").append(toIndentedString(dashboard)).append("\n");
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
