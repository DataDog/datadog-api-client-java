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

/** An assertion which targets body hash. */
@JsonPropertyOrder({
  SyntheticsAssertionBodyHashTarget.JSON_PROPERTY_OPERATOR,
  SyntheticsAssertionBodyHashTarget.JSON_PROPERTY_TARGET,
  SyntheticsAssertionBodyHashTarget.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAssertionBodyHashTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private SyntheticsAssertionBodyHashOperator operator;

  public static final String JSON_PROPERTY_TARGET = "target";
  private SyntheticsAssertionTargetValue target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsAssertionBodyHashType type;

  public SyntheticsAssertionBodyHashTarget() {}

  @JsonCreator
  public SyntheticsAssertionBodyHashTarget(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATOR)
          SyntheticsAssertionBodyHashOperator operator,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET)
          SyntheticsAssertionTargetValue target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SyntheticsAssertionBodyHashType type) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    this.target = target;
    this.unparsed |= target.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsAssertionBodyHashTarget operator(SyntheticsAssertionBodyHashOperator operator) {
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
  public SyntheticsAssertionBodyHashOperator getOperator() {
    return operator;
  }

  public void setOperator(SyntheticsAssertionBodyHashOperator operator) {
    if (!operator.isValid()) {
      this.unparsed = true;
    }
    this.operator = operator;
  }

  public SyntheticsAssertionBodyHashTarget target(SyntheticsAssertionTargetValue target) {
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

  public SyntheticsAssertionBodyHashTarget type(SyntheticsAssertionBodyHashType type) {
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
  public SyntheticsAssertionBodyHashType getType() {
    return type;
  }

  public void setType(SyntheticsAssertionBodyHashType type) {
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
   * @return SyntheticsAssertionBodyHashTarget
   */
  @JsonAnySetter
  public SyntheticsAssertionBodyHashTarget putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsAssertionBodyHashTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAssertionBodyHashTarget syntheticsAssertionBodyHashTarget =
        (SyntheticsAssertionBodyHashTarget) o;
    return Objects.equals(this.operator, syntheticsAssertionBodyHashTarget.operator)
        && Objects.equals(this.target, syntheticsAssertionBodyHashTarget.target)
        && Objects.equals(this.type, syntheticsAssertionBodyHashTarget.type)
        && Objects.equals(
            this.additionalProperties, syntheticsAssertionBodyHashTarget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAssertionBodyHashTarget {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
