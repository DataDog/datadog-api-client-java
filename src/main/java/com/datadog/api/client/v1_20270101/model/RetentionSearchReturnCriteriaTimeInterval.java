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
  RetentionSearchReturnCriteriaTimeInterval.JSON_PROPERTY_TYPE,
  RetentionSearchReturnCriteriaTimeInterval.JSON_PROPERTY_UNIT,
  RetentionSearchReturnCriteriaTimeInterval.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionSearchReturnCriteriaTimeInterval {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private RetentionSearchReturnCriteriaTimeIntervalType type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private RetentionSearchReturnCriteriaTimeIntervalUnit unit;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public RetentionSearchReturnCriteriaTimeInterval() {}

  @JsonCreator
  public RetentionSearchReturnCriteriaTimeInterval(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          RetentionSearchReturnCriteriaTimeIntervalType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT)
          RetentionSearchReturnCriteriaTimeIntervalUnit unit,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.unit = unit;
    this.unparsed |= !unit.isValid();
    this.value = value;
  }

  public RetentionSearchReturnCriteriaTimeInterval type(
      RetentionSearchReturnCriteriaTimeIntervalType type) {
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
  public RetentionSearchReturnCriteriaTimeIntervalType getType() {
    return type;
  }

  public void setType(RetentionSearchReturnCriteriaTimeIntervalType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public RetentionSearchReturnCriteriaTimeInterval unit(
      RetentionSearchReturnCriteriaTimeIntervalUnit unit) {
    this.unit = unit;
    this.unparsed |= !unit.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return unit
   */
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionSearchReturnCriteriaTimeIntervalUnit getUnit() {
    return unit;
  }

  public void setUnit(RetentionSearchReturnCriteriaTimeIntervalUnit unit) {
    if (!unit.isValid()) {
      this.unparsed = true;
    }
    this.unit = unit;
  }

  public RetentionSearchReturnCriteriaTimeInterval value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  /** Return true if this RetentionSearchReturnCriteriaTimeInterval object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionSearchReturnCriteriaTimeInterval retentionSearchReturnCriteriaTimeInterval =
        (RetentionSearchReturnCriteriaTimeInterval) o;
    return Objects.equals(this.type, retentionSearchReturnCriteriaTimeInterval.type)
        && Objects.equals(this.unit, retentionSearchReturnCriteriaTimeInterval.unit)
        && Objects.equals(this.value, retentionSearchReturnCriteriaTimeInterval.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionSearchReturnCriteriaTimeInterval {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
