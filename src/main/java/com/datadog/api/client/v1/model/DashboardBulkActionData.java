/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Dashboard bulk action request data. */
@JsonPropertyOrder({
  DashboardBulkActionData.JSON_PROPERTY_ID,
  DashboardBulkActionData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardBulkActionData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DashboardResourceType type = DashboardResourceType.DASHBOARD;

  public DashboardBulkActionData() {}

  @JsonCreator
  public DashboardBulkActionData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DashboardResourceType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DashboardBulkActionData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Dashboard resource ID.
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

  public DashboardBulkActionData type(DashboardResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Dashboard resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardResourceType getType() {
    return type;
  }

  public void setType(DashboardResourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this DashboardBulkActionData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardBulkActionData dashboardBulkActionData = (DashboardBulkActionData) o;
    return Objects.equals(this.id, dashboardBulkActionData.id)
        && Objects.equals(this.type, dashboardBulkActionData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardBulkActionData {\n");
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
