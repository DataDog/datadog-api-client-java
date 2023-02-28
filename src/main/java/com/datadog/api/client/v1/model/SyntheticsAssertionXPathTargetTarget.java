/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Composed target for <code>validatesXPath</code> operator. */
@JsonPropertyOrder({
  SyntheticsAssertionXPathTargetTarget.JSON_PROPERTY_OPERATOR,
  SyntheticsAssertionXPathTargetTarget.JSON_PROPERTY_TARGET_VALUE,
  SyntheticsAssertionXPathTargetTarget.JSON_PROPERTY_X_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAssertionXPathTargetTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_TARGET_VALUE = "targetValue";
  private Object targetValue = null;

  public static final String JSON_PROPERTY_X_PATH = "xPath";
  private String xPath;

  public SyntheticsAssertionXPathTargetTarget operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The specific operator to use on the path.
   *
   * @return operator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public SyntheticsAssertionXPathTargetTarget targetValue(Object targetValue) {
    this.targetValue = targetValue;
    return this;
  }

  /**
   * The path target value to compare to.
   *
   * @return targetValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getTargetValue() {
    return targetValue;
  }

  public void setTargetValue(Object targetValue) {
    this.targetValue = targetValue;
  }

  public SyntheticsAssertionXPathTargetTarget xPath(String xPath) {
    this.xPath = xPath;
    return this;
  }

  /**
   * The X path to assert.
   *
   * @return xPath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getXPath() {
    return xPath;
  }

  public void setXPath(String xPath) {
    this.xPath = xPath;
  }

  /** Return true if this SyntheticsAssertionXPathTargetTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAssertionXPathTargetTarget syntheticsAssertionXPathTargetTarget =
        (SyntheticsAssertionXPathTargetTarget) o;
    return Objects.equals(this.operator, syntheticsAssertionXPathTargetTarget.operator)
        && Objects.equals(this.targetValue, syntheticsAssertionXPathTargetTarget.targetValue)
        && Objects.equals(this.xPath, syntheticsAssertionXPathTargetTarget.xPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, targetValue, xPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAssertionXPathTargetTarget {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
    sb.append("    xPath: ").append(toIndentedString(xPath)).append("\n");
    sb.append("}");
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
