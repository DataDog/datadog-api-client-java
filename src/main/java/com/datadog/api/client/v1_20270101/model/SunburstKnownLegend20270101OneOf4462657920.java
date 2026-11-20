/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({SunburstKnownLegend20270101OneOf4462657920.JSON_PROPERTY_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SunburstKnownLegend20270101OneOf4462657920 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private SunburstKnownLegendAnyOfAnyOfItemType4452236352 type;

  public SunburstKnownLegend20270101OneOf4462657920() {}

  @JsonCreator
  public SunburstKnownLegend20270101OneOf4462657920(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SunburstKnownLegendAnyOfAnyOfItemType4452236352 type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SunburstKnownLegend20270101OneOf4462657920 type(
      SunburstKnownLegendAnyOfAnyOfItemType4452236352 type) {
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
  public SunburstKnownLegendAnyOfAnyOfItemType4452236352 getType() {
    return type;
  }

  public void setType(SunburstKnownLegendAnyOfAnyOfItemType4452236352 type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SunburstKnownLegend20270101OneOf4462657920 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SunburstKnownLegend20270101OneOf4462657920 sunburstKnownLegend20270101OneOf4462657920 =
        (SunburstKnownLegend20270101OneOf4462657920) o;
    return Objects.equals(this.type, sunburstKnownLegend20270101OneOf4462657920.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SunburstKnownLegend20270101OneOf4462657920 {\n");
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
