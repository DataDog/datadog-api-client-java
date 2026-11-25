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
@JsonPropertyOrder({
  NumberFormatUnitCustom.JSON_PROPERTY_LABEL,
  NumberFormatUnitCustom.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NumberFormatUnitCustom {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NumberFormatUnitCustomType type;

  public NumberFormatUnitCustom() {}

  @JsonCreator
  public NumberFormatUnitCustom(
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL) String label,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) NumberFormatUnitCustomType type) {
    this.label = label;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public NumberFormatUnitCustom label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return label
   */
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public NumberFormatUnitCustom type(NumberFormatUnitCustomType type) {
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
  public NumberFormatUnitCustomType getType() {
    return type;
  }

  public void setType(NumberFormatUnitCustomType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this NumberFormatUnitCustom object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberFormatUnitCustom numberFormatUnitCustom = (NumberFormatUnitCustom) o;
    return Objects.equals(this.label, numberFormatUnitCustom.label)
        && Objects.equals(this.type, numberFormatUnitCustom.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberFormatUnitCustom {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
