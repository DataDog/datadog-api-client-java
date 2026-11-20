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
  CohortScope20270101TargetOneOf4454865216.JSON_PROPERTY_TYPE,
  CohortScope20270101TargetOneOf4454865216.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CohortScope20270101TargetOneOf4454865216 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private CohortScopeTargetAggregationType_20270101 type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private CohortScopeTargetAnyOfAnyOfItemValue_20270101 value;

  public CohortScope20270101TargetOneOf4454865216() {}

  @JsonCreator
  public CohortScope20270101TargetOneOf4454865216(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CohortScopeTargetAggregationType_20270101 type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE)
          CohortScopeTargetAnyOfAnyOfItemValue_20270101 value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.value = value;
    this.unparsed |= !value.isValid();
  }

  public CohortScope20270101TargetOneOf4454865216 type(
      CohortScopeTargetAggregationType_20270101 type) {
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
  public CohortScopeTargetAggregationType_20270101 getType() {
    return type;
  }

  public void setType(CohortScopeTargetAggregationType_20270101 type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public CohortScope20270101TargetOneOf4454865216 value(
      CohortScopeTargetAnyOfAnyOfItemValue_20270101 value) {
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
  public CohortScopeTargetAnyOfAnyOfItemValue_20270101 getValue() {
    return value;
  }

  public void setValue(CohortScopeTargetAnyOfAnyOfItemValue_20270101 value) {
    if (!value.isValid()) {
      this.unparsed = true;
    }
    this.value = value;
  }

  /** Return true if this CohortScope20270101TargetOneOf4454865216 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CohortScope20270101TargetOneOf4454865216 cohortScope20270101TargetOneOf4454865216 =
        (CohortScope20270101TargetOneOf4454865216) o;
    return Objects.equals(this.type, cohortScope20270101TargetOneOf4454865216.type)
        && Objects.equals(this.value, cohortScope20270101TargetOneOf4454865216.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CohortScope20270101TargetOneOf4454865216 {\n");
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
