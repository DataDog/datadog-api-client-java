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
@JsonPropertyOrder({CohortScope.JSON_PROPERTY_TARGET, CohortScope.JSON_PROPERTY_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CohortScope {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TARGET = "target";
  private CohortScope20270101Target target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CohortScopeType type;

  public CohortScope() {}

  @JsonCreator
  public CohortScope(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) CohortScope20270101Target target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CohortScopeType type) {
    this.target = target;
    this.unparsed |= target.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CohortScope target(CohortScope20270101Target target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CohortScope20270101Target getTarget() {
    return target;
  }

  public void setTarget(CohortScope20270101Target target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
  }

  public CohortScope type(CohortScopeType type) {
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
  public CohortScopeType getType() {
    return type;
  }

  public void setType(CohortScopeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CohortScope object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CohortScope cohortScope = (CohortScope) o;
    return Objects.equals(this.target, cohortScope.target)
        && Objects.equals(this.type, cohortScope.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CohortScope {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
