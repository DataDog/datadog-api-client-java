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
  CellScope20270101CohortTargetOneOf.JSON_PROPERTY_TYPE,
  CellScope20270101CohortTargetOneOf.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CellScope20270101CohortTargetOneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private CellScopeCohortTargetIndexType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public CellScope20270101CohortTargetOneOf() {}

  @JsonCreator
  public CellScope20270101CohortTargetOneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CellScopeCohortTargetIndexType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.value = value;
  }

  public CellScope20270101CohortTargetOneOf type(CellScopeCohortTargetIndexType type) {
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
  public CellScopeCohortTargetIndexType getType() {
    return type;
  }

  public void setType(CellScopeCohortTargetIndexType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public CellScope20270101CohortTargetOneOf value(Double value) {
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

  /** Return true if this CellScope20270101CohortTargetOneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellScope20270101CohortTargetOneOf cellScope20270101CohortTargetOneOf =
        (CellScope20270101CohortTargetOneOf) o;
    return Objects.equals(this.type, cellScope20270101CohortTargetOneOf.type)
        && Objects.equals(this.value, cellScope20270101CohortTargetOneOf.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellScope20270101CohortTargetOneOf {\n");
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
