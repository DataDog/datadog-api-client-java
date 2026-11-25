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
@JsonPropertyOrder({ReturnPeriodScope.JSON_PROPERTY_TARGET, ReturnPeriodScope.JSON_PROPERTY_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReturnPeriodScope {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TARGET = "target";
  private ReturnPeriodScopeTarget target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ReturnPeriodScopeType type;

  public ReturnPeriodScope() {}

  @JsonCreator
  public ReturnPeriodScope(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) ReturnPeriodScopeTarget target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ReturnPeriodScopeType type) {
    this.target = target;
    this.unparsed |= target.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ReturnPeriodScope target(ReturnPeriodScopeTarget target) {
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
  public ReturnPeriodScopeTarget getTarget() {
    return target;
  }

  public void setTarget(ReturnPeriodScopeTarget target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
  }

  public ReturnPeriodScope type(ReturnPeriodScopeType type) {
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
  public ReturnPeriodScopeType getType() {
    return type;
  }

  public void setType(ReturnPeriodScopeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ReturnPeriodScope object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnPeriodScope returnPeriodScope = (ReturnPeriodScope) o;
    return Objects.equals(this.target, returnPeriodScope.target)
        && Objects.equals(this.type, returnPeriodScope.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnPeriodScope {\n");
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
