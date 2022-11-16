/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Schema for request body to create a dashboard report. */
@JsonPropertyOrder({
  DashboardReportCreate.JSON_PROPERTY_ATTRIBUTES,
  DashboardReportCreate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardReportCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private DashboardReportCreateAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DashboardReportType type = DashboardReportType.DASHBOARD_REPORTS_TYPE;

  public DashboardReportCreate() {}

  @JsonCreator
  public DashboardReportCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DashboardReportType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DashboardReportCreate attributes(DashboardReportCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes for the dashboard report schema used to create a dashboard report.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardReportCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(DashboardReportCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public DashboardReportCreate type(DashboardReportType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * JSON:API type of the dashboard report.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardReportType getType() {
    return type;
  }

  public void setType(DashboardReportType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this DashboardReportCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardReportCreate dashboardReportCreate = (DashboardReportCreate) o;
    return Objects.equals(this.attributes, dashboardReportCreate.attributes)
        && Objects.equals(this.type, dashboardReportCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardReportCreate {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
