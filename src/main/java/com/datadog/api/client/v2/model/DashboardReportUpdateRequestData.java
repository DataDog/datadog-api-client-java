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

/** JSON:API data key. */
@JsonPropertyOrder({
  DashboardReportUpdateRequestData.JSON_PROPERTY_ATTRIBUTES,
  DashboardReportUpdateRequestData.JSON_PROPERTY_ID,
  DashboardReportUpdateRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardReportUpdateRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private DashboardReportUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DashboardReportType type = DashboardReportType.DASHBOARD_REPORTS_TYPE;

  public DashboardReportUpdateRequestData() {}

  @JsonCreator
  public DashboardReportUpdateRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DashboardReportType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DashboardReportUpdateRequestData attributes(DashboardReportUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of a dashboard report that can be updated. Fields that are not to be updated can be
   * omitted, with some exceptions for <code>repeat_on_day_of_week</code> and <code>
   * repeat_on_day_of_month</code>, as noted in their respective sections.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardReportUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(DashboardReportUpdateAttributes attributes) {
    this.attributes = attributes;
  }

  public DashboardReportUpdateRequestData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the report to update.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DashboardReportUpdateRequestData type(DashboardReportType type) {
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

  /** Return true if this DashboardReportUpdateRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardReportUpdateRequestData dashboardReportUpdateRequestData =
        (DashboardReportUpdateRequestData) o;
    return Objects.equals(this.attributes, dashboardReportUpdateRequestData.attributes)
        && Objects.equals(this.id, dashboardReportUpdateRequestData.id)
        && Objects.equals(this.type, dashboardReportUpdateRequestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardReportUpdateRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
