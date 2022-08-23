/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>An assertion which uses a simple target.</p>
 */
@JsonPropertyOrder({
  SyntheticsAssertionTarget.JSON_PROPERTY_OPERATOR,
  SyntheticsAssertionTarget.JSON_PROPERTY_PROPERTY,
  SyntheticsAssertionTarget.JSON_PROPERTY_TARGET,
  SyntheticsAssertionTarget.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAssertionTarget {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private SyntheticsAssertionOperator operator;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_TARGET = "target";
  private Object target = new Object();

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsAssertionType type;

  public SyntheticsAssertionTarget() {}

  @JsonCreator
  public SyntheticsAssertionTarget(
            @JsonProperty(required=true, value=JSON_PROPERTY_OPERATOR)SyntheticsAssertionOperator operator,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)Object target,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SyntheticsAssertionType type) {
        this.operator = operator;
        this.unparsed |= !operator.isValid();
        this.target = target;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public SyntheticsAssertionTarget operator(SyntheticsAssertionOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * <p>Assertion operator to apply.</p>
   * @return operator
  **/
      @JsonProperty(JSON_PROPERTY_OPERATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The associated assertion property.</p>
   * @return property
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROPERTY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProperty() {
        return property;
      }
  public void setProperty(String property) {
    this.property = property;
  }
  public SyntheticsAssertionTarget target(Object target) {
    this.target = target;
    return this;
  }

  /**
   * <p>Value used by the operator.</p>
   * @return target
  **/
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Object getTarget() {
        return target;
      }
  public void setTarget(Object target) {
    this.target = target;
  }
  public SyntheticsAssertionTarget type(SyntheticsAssertionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the assertion.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * Return true if this SyntheticsAssertionTarget object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAssertionTarget syntheticsAssertionTarget = (SyntheticsAssertionTarget) o;
    return Objects.equals(this.operator, syntheticsAssertionTarget.operator) && Objects.equals(this.property, syntheticsAssertionTarget.property) && Objects.equals(this.target, syntheticsAssertionTarget.target) && Objects.equals(this.type, syntheticsAssertionTarget.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(operator,property,target,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAssertionTarget {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
