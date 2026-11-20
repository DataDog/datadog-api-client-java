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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({WidgetTime20270101OneOf4464105952.JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetTime20270101OneOf4464105952 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA = "hide_incomplete_cost_data";
  private Boolean hideIncompleteCostData;

  public WidgetTime20270101OneOf4464105952 hideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hideIncompleteCostData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideIncompleteCostData() {
    return hideIncompleteCostData;
  }

  public void setHideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
  }

  /** Return true if this WidgetTime20270101OneOf4464105952 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetTime20270101OneOf4464105952 widgetTime20270101OneOf4464105952 =
        (WidgetTime20270101OneOf4464105952) o;
    return Objects.equals(
        this.hideIncompleteCostData, widgetTime20270101OneOf4464105952.hideIncompleteCostData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideIncompleteCostData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetTime20270101OneOf4464105952 {\n");
    sb.append("    hideIncompleteCostData: ")
        .append(toIndentedString(hideIncompleteCostData))
        .append("\n");
    sb.append('}');
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
