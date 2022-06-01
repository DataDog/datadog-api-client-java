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
import java.util.Objects;

/** Configuration of table-based legend. */
@JsonPropertyOrder({SunburstWidgetLegendTable.JSON_PROPERTY_TYPE})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SunburstWidgetLegendTable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private SunburstWidgetLegendTableType type;

  public SunburstWidgetLegendTable() {}

  @JsonCreator
  public SunburstWidgetLegendTable(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SunburstWidgetLegendTableType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SunburstWidgetLegendTable type(SunburstWidgetLegendTableType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Whether or not to show a table legend.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SunburstWidgetLegendTableType getType() {
    return type;
  }

  public void setType(SunburstWidgetLegendTableType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SunburstWidgetLegendTable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SunburstWidgetLegendTable sunburstWidgetLegendTable = (SunburstWidgetLegendTable) o;
    return Objects.equals(this.type, sunburstWidgetLegendTable.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SunburstWidgetLegendTable {\n");
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
