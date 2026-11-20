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
@JsonPropertyOrder({OccurrenceFilter.JSON_PROPERTY_OPERATOR, OccurrenceFilter.JSON_PROPERTY_VALUE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OccurrenceFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private OccurrenceFilterOperator operator;

  public static final String JSON_PROPERTY_VALUE = "value";
  private OccurrenceFilterValue value;

  public OccurrenceFilter() {}

  @JsonCreator
  public OccurrenceFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATOR)
          OccurrenceFilterOperator operator,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) OccurrenceFilterValue value) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    this.value = value;
    this.unparsed |= !value.isValid();
  }

  public OccurrenceFilter operator(OccurrenceFilterOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return operator
   */
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OccurrenceFilterOperator getOperator() {
    return operator;
  }

  public void setOperator(OccurrenceFilterOperator operator) {
    if (!operator.isValid()) {
      this.unparsed = true;
    }
    this.operator = operator;
  }

  public OccurrenceFilter value(OccurrenceFilterValue value) {
    this.value = value;
    this.unparsed |= !value.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OccurrenceFilterValue getValue() {
    return value;
  }

  public void setValue(OccurrenceFilterValue value) {
    if (!value.isValid()) {
      this.unparsed = true;
    }
    this.value = value;
  }

  /** Return true if this OccurrenceFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OccurrenceFilter occurrenceFilter = (OccurrenceFilter) o;
    return Objects.equals(this.operator, occurrenceFilter.operator)
        && Objects.equals(this.value, occurrenceFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccurrenceFilter {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
