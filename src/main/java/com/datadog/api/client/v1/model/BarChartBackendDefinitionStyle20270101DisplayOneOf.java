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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  BarChartBackendDefinitionStyle20270101DisplayOneOf.JSON_PROPERTY_LEGEND,
  BarChartBackendDefinitionStyle20270101DisplayOneOf.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BarChartBackendDefinitionStyle20270101DisplayOneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LEGEND = "legend";
  private BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend_20270101 legend;

  public static final String JSON_PROPERTY_TYPE = "type";
  private BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType_20270101 type;

  public BarChartBackendDefinitionStyle20270101DisplayOneOf() {}

  @JsonCreator
  public BarChartBackendDefinitionStyle20270101DisplayOneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType_20270101 type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public BarChartBackendDefinitionStyle20270101DisplayOneOf legend(
      BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend_20270101 legend) {
    this.legend = legend;
    this.unparsed |= !legend.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return legend
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend_20270101 getLegend() {
    return legend;
  }

  public void setLegend(BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend_20270101 legend) {
    if (!legend.isValid()) {
      this.unparsed = true;
    }
    this.legend = legend;
  }

  public BarChartBackendDefinitionStyle20270101DisplayOneOf type(
      BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType_20270101 type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType_20270101 getType() {
    return type;
  }

  public void setType(BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType_20270101 type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this BarChartBackendDefinitionStyle20270101DisplayOneOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarChartBackendDefinitionStyle20270101DisplayOneOf
        barChartBackendDefinitionStyle20270101DisplayOneOf =
            (BarChartBackendDefinitionStyle20270101DisplayOneOf) o;
    return Objects.equals(this.legend, barChartBackendDefinitionStyle20270101DisplayOneOf.legend)
        && Objects.equals(this.type, barChartBackendDefinitionStyle20270101DisplayOneOf.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legend, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarChartBackendDefinitionStyle20270101DisplayOneOf {\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
