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
  CellScope20270101CohortTargetOneOf4454617856.JSON_PROPERTY_TYPE,
  CellScope20270101CohortTargetOneOf4454617856.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CellScope20270101CohortTargetOneOf4454617856 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private CellScopeCohortTargetAggregationType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private CellScopeCohortTargetAnyOfAnyOfItemValue value;

  public CellScope20270101CohortTargetOneOf4454617856() {}

  @JsonCreator
  public CellScope20270101CohortTargetOneOf4454617856(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CellScopeCohortTargetAggregationType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE)
          CellScopeCohortTargetAnyOfAnyOfItemValue value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.value = value;
    this.unparsed |= !value.isValid();
  }

  public CellScope20270101CohortTargetOneOf4454617856 type(
      CellScopeCohortTargetAggregationType type) {
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
  public CellScopeCohortTargetAggregationType getType() {
    return type;
  }

  public void setType(CellScopeCohortTargetAggregationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public CellScope20270101CohortTargetOneOf4454617856 value(
      CellScopeCohortTargetAnyOfAnyOfItemValue value) {
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
  public CellScopeCohortTargetAnyOfAnyOfItemValue getValue() {
    return value;
  }

  public void setValue(CellScopeCohortTargetAnyOfAnyOfItemValue value) {
    if (!value.isValid()) {
      this.unparsed = true;
    }
    this.value = value;
  }

  /** Return true if this CellScope20270101CohortTargetOneOf4454617856 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellScope20270101CohortTargetOneOf4454617856 cellScope20270101CohortTargetOneOf4454617856 =
        (CellScope20270101CohortTargetOneOf4454617856) o;
    return Objects.equals(this.type, cellScope20270101CohortTargetOneOf4454617856.type)
        && Objects.equals(this.value, cellScope20270101CohortTargetOneOf4454617856.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellScope20270101CohortTargetOneOf4454617856 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
