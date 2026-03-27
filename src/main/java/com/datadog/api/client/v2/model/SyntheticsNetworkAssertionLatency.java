/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Network latency assertion for a Network Path test. */
@JsonPropertyOrder({
  SyntheticsNetworkAssertionLatency.JSON_PROPERTY_OPERATOR,
  SyntheticsNetworkAssertionLatency.JSON_PROPERTY_PROPERTY,
  SyntheticsNetworkAssertionLatency.JSON_PROPERTY_TARGET,
  SyntheticsNetworkAssertionLatency.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsNetworkAssertionLatency {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private SyntheticsNetworkAssertionOperator operator;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private SyntheticsNetworkAssertionProperty property;

  public static final String JSON_PROPERTY_TARGET = "target";
  private Double target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsNetworkAssertionLatencyType type =
      SyntheticsNetworkAssertionLatencyType.LATENCY;

  public SyntheticsNetworkAssertionLatency() {}

  @JsonCreator
  public SyntheticsNetworkAssertionLatency(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATOR)
          SyntheticsNetworkAssertionOperator operator,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY)
          SyntheticsNetworkAssertionProperty property,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) Double target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SyntheticsNetworkAssertionLatencyType type) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    this.property = property;
    this.unparsed |= !property.isValid();
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsNetworkAssertionLatency operator(SyntheticsNetworkAssertionOperator operator) {
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
  public SyntheticsNetworkAssertionOperator getOperator() {
    return operator;
  }

  public void setOperator(SyntheticsNetworkAssertionOperator operator) {
    if (!operator.isValid()) {
      this.unparsed = true;
    }
    this.operator = operator;
  }

  public SyntheticsNetworkAssertionLatency property(SyntheticsNetworkAssertionProperty property) {
    this.property = property;
    this.unparsed |= !property.isValid();
    return this;
  }

  /**
   * The associated assertion property.
   *
   * @return property
   */
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsNetworkAssertionProperty getProperty() {
    return property;
  }

  public void setProperty(SyntheticsNetworkAssertionProperty property) {
    if (!property.isValid()) {
      this.unparsed = true;
    }
    this.property = property;
  }

  public SyntheticsNetworkAssertionLatency target(Double target) {
    this.target = target;
    return this;
  }

  /**
   * Target value in milliseconds.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getTarget() {
    return target;
  }

  public void setTarget(Double target) {
    this.target = target;
  }

  public SyntheticsNetworkAssertionLatency type(SyntheticsNetworkAssertionLatencyType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the latency assertion.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsNetworkAssertionLatencyType getType() {
    return type;
  }

  public void setType(SyntheticsNetworkAssertionLatencyType type) {
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
   * @return SyntheticsNetworkAssertionLatency
   */
  @JsonAnySetter
  public SyntheticsNetworkAssertionLatency putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsNetworkAssertionLatency object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsNetworkAssertionLatency syntheticsNetworkAssertionLatency =
        (SyntheticsNetworkAssertionLatency) o;
    return Objects.equals(this.operator, syntheticsNetworkAssertionLatency.operator)
        && Objects.equals(this.property, syntheticsNetworkAssertionLatency.property)
        && Objects.equals(this.target, syntheticsNetworkAssertionLatency.target)
        && Objects.equals(this.type, syntheticsNetworkAssertionLatency.type)
        && Objects.equals(
            this.additionalProperties, syntheticsNetworkAssertionLatency.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, property, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsNetworkAssertionLatency {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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
