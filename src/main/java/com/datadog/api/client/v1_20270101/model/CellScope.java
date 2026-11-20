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
  CellScope.JSON_PROPERTY_COHORT_TARGET,
  CellScope.JSON_PROPERTY_RETURN_PERIOD_TARGET,
  CellScope.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CellScope {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COHORT_TARGET = "cohort_target";
  private CellScope20270101CohortTarget cohortTarget;

  public static final String JSON_PROPERTY_RETURN_PERIOD_TARGET = "return_period_target";
  private CellScopeReturnPeriodTarget returnPeriodTarget;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CellScopeType type;

  public CellScope() {}

  @JsonCreator
  public CellScope(
      @JsonProperty(required = true, value = JSON_PROPERTY_COHORT_TARGET)
          CellScope20270101CohortTarget cohortTarget,
      @JsonProperty(required = true, value = JSON_PROPERTY_RETURN_PERIOD_TARGET)
          CellScopeReturnPeriodTarget returnPeriodTarget,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CellScopeType type) {
    this.cohortTarget = cohortTarget;
    this.unparsed |= cohortTarget.unparsed;
    this.returnPeriodTarget = returnPeriodTarget;
    this.unparsed |= returnPeriodTarget.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CellScope cohortTarget(CellScope20270101CohortTarget cohortTarget) {
    this.cohortTarget = cohortTarget;
    this.unparsed |= cohortTarget.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return cohortTarget
   */
  @JsonProperty(JSON_PROPERTY_COHORT_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CellScope20270101CohortTarget getCohortTarget() {
    return cohortTarget;
  }

  public void setCohortTarget(CellScope20270101CohortTarget cohortTarget) {
    this.cohortTarget = cohortTarget;
    if (cohortTarget != null) {
      this.unparsed |= cohortTarget.unparsed;
    }
  }

  public CellScope returnPeriodTarget(CellScopeReturnPeriodTarget returnPeriodTarget) {
    this.returnPeriodTarget = returnPeriodTarget;
    this.unparsed |= returnPeriodTarget.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return returnPeriodTarget
   */
  @JsonProperty(JSON_PROPERTY_RETURN_PERIOD_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CellScopeReturnPeriodTarget getReturnPeriodTarget() {
    return returnPeriodTarget;
  }

  public void setReturnPeriodTarget(CellScopeReturnPeriodTarget returnPeriodTarget) {
    this.returnPeriodTarget = returnPeriodTarget;
    if (returnPeriodTarget != null) {
      this.unparsed |= returnPeriodTarget.unparsed;
    }
  }

  public CellScope type(CellScopeType type) {
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
  public CellScopeType getType() {
    return type;
  }

  public void setType(CellScopeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CellScope object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellScope cellScope = (CellScope) o;
    return Objects.equals(this.cohortTarget, cellScope.cohortTarget)
        && Objects.equals(this.returnPeriodTarget, cellScope.returnPeriodTarget)
        && Objects.equals(this.type, cellScope.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cohortTarget, returnPeriodTarget, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellScope {\n");
    sb.append("    cohortTarget: ").append(toIndentedString(cohortTarget)).append("\n");
    sb.append("    returnPeriodTarget: ").append(toIndentedString(returnPeriodTarget)).append("\n");
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
