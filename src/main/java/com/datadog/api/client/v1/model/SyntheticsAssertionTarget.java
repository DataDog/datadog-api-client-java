/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** An assertion which uses a simple target. */
@JsonPropertyOrder({
  SyntheticsAssertionTarget.JSON_PROPERTY_OPERATOR,
  SyntheticsAssertionTarget.JSON_PROPERTY_PROPERTY,
  SyntheticsAssertionTarget.JSON_PROPERTY_TARGET,
  SyntheticsAssertionTarget.JSON_PROPERTY_TIMINGS_SCOPE,
  SyntheticsAssertionTarget.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAssertionTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private SyntheticsAssertionOperator operator;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_TARGET = "target";
  private SyntheticsAssertionTargetValue target;

  public static final String JSON_PROPERTY_TIMINGS_SCOPE = "timingsScope";
  private SyntheticsAssertionTimingsScope timingsScope;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsAssertionType type;

  public SyntheticsAssertionTarget() {}

  @JsonCreator
  public SyntheticsAssertionTarget(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATOR)
          SyntheticsAssertionOperator operator,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET)
          SyntheticsAssertionTargetValue target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SyntheticsAssertionType type) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    this.target = target;
    this.unparsed |= target.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsAssertionTarget operator(SyntheticsAssertionOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * Assertion operator to apply.
   *
   * @return operator
   */
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsAssertionOperator getOperator() {
    return operator;
  }

  public void setOperator(SyntheticsAssertionOperator operator) {
    if (!operator.isValid()) {
      this.unparsed = true;
    }
    this.operator = operator;
  }

  public SyntheticsAssertionTarget property(String property) {
    this.property = property;
    return this;
  }

  /**
   * The associated assertion property.
   *
   * @return property
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public SyntheticsAssertionTarget target(SyntheticsAssertionTargetValue target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Value used by the operator in assertions. Can be either a number or string.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsAssertionTargetValue getTarget() {
    return target;
  }

  public void setTarget(SyntheticsAssertionTargetValue target) {
    this.target = target;
  }

  public SyntheticsAssertionTarget timingsScope(SyntheticsAssertionTimingsScope timingsScope) {
    this.timingsScope = timingsScope;
    this.unparsed |= !timingsScope.isValid();
    return this;
  }

  /**
   * Timings scope for response time assertions.
   *
   * @return timingsScope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMINGS_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsAssertionTimingsScope getTimingsScope() {
    return timingsScope;
  }

  public void setTimingsScope(SyntheticsAssertionTimingsScope timingsScope) {
    if (!timingsScope.isValid()) {
      this.unparsed = true;
    }
    this.timingsScope = timingsScope;
  }

  public SyntheticsAssertionTarget type(SyntheticsAssertionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the assertion.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsAssertionType getType() {
    return type;
  }

  public void setType(SyntheticsAssertionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsAssertionTarget
   */
  @JsonAnySetter
  public SyntheticsAssertionTarget putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this SyntheticsAssertionTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAssertionTarget syntheticsAssertionTarget = (SyntheticsAssertionTarget) o;
    return Objects.equals(this.operator, syntheticsAssertionTarget.operator)
        && Objects.equals(this.property, syntheticsAssertionTarget.property)
        && Objects.equals(this.target, syntheticsAssertionTarget.target)
        && Objects.equals(this.timingsScope, syntheticsAssertionTarget.timingsScope)
        && Objects.equals(this.type, syntheticsAssertionTarget.type)
        && Objects.equals(
            this.additionalProperties, syntheticsAssertionTarget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, property, target, timingsScope, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAssertionTarget {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    timingsScope: ").append(toIndentedString(timingsScope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
