/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
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
   * <p>An individual assertion result from a Synthetic test.</p>
 */
@JsonPropertyOrder({
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_ACTUAL,
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_ERROR_MESSAGE,
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_EXPECTED,
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_OPERATOR,
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_PROPERTY,
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_TARGET,
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_TARGET_PATH,
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_TARGET_PATH_OPERATOR,
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_TYPE,
  SyntheticsTestResultAssertionResult.JSON_PROPERTY_VALID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultAssertionResult {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTUAL = "actual";
  private Object actual = null;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_EXPECTED = "expected";
  private Object expected = null;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_TARGET = "target";
  private Object target = null;

  public static final String JSON_PROPERTY_TARGET_PATH = "target_path";
  private String targetPath;

  public static final String JSON_PROPERTY_TARGET_PATH_OPERATOR = "target_path_operator";
  private String targetPathOperator;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALID = "valid";
  private Boolean valid;

  public SyntheticsTestResultAssertionResult actual(Object actual) {
    this.actual = actual;
    return this;
  }

  /**
   * <p>Actual value observed during the test. Its type depends on the assertion type.</p>
   * @return actual
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACTUAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getActual() {
        return actual;
      }
  public void setActual(Object actual) {
    this.actual = actual;
  }
  public SyntheticsTestResultAssertionResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * <p>Error message if the assertion failed.</p>
   * @return errorMessage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getErrorMessage() {
        return errorMessage;
      }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  public SyntheticsTestResultAssertionResult expected(Object expected) {
    this.expected = expected;
    return this;
  }

  /**
   * <p>Expected value for the assertion. Its type depends on the assertion type.</p>
   * @return expected
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXPECTED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getExpected() {
        return expected;
      }
  public void setExpected(Object expected) {
    this.expected = expected;
  }
  public SyntheticsTestResultAssertionResult operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * <p>Operator used for the assertion (for example, <code>is</code>, <code>contains</code>).</p>
   * @return operator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPERATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOperator() {
        return operator;
      }
  public void setOperator(String operator) {
    this.operator = operator;
  }
  public SyntheticsTestResultAssertionResult property(String property) {
    this.property = property;
    return this;
  }

  /**
   * <p>Property targeted by the assertion, when applicable.</p>
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
  public SyntheticsTestResultAssertionResult target(Object target) {
    this.target = target;
    return this;
  }

  /**
   * <p>Target value for the assertion. Its type depends on the assertion type.</p>
   * @return target
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getTarget() {
        return target;
      }
  public void setTarget(Object target) {
    this.target = target;
  }
  public SyntheticsTestResultAssertionResult targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
  }

  /**
   * <p>JSON path or XPath evaluated for the assertion.</p>
   * @return targetPath
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTargetPath() {
        return targetPath;
      }
  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }
  public SyntheticsTestResultAssertionResult targetPathOperator(String targetPathOperator) {
    this.targetPathOperator = targetPathOperator;
    return this;
  }

  /**
   * <p>Operator used for the target path assertion.</p>
   * @return targetPathOperator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET_PATH_OPERATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTargetPathOperator() {
        return targetPathOperator;
      }
  public void setTargetPathOperator(String targetPathOperator) {
    this.targetPathOperator = targetPathOperator;
  }
  public SyntheticsTestResultAssertionResult type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Type of the assertion (for example, <code>responseTime</code>, <code>statusCode</code>, <code>body</code>).</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }
  public SyntheticsTestResultAssertionResult valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * <p>Whether the assertion passed.</p>
   * @return valid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getValid() {
        return valid;
      }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsTestResultAssertionResult
   */
  @JsonAnySetter
  public SyntheticsTestResultAssertionResult putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SyntheticsTestResultAssertionResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultAssertionResult syntheticsTestResultAssertionResult = (SyntheticsTestResultAssertionResult) o;
    return Objects.equals(this.actual, syntheticsTestResultAssertionResult.actual) && Objects.equals(this.errorMessage, syntheticsTestResultAssertionResult.errorMessage) && Objects.equals(this.expected, syntheticsTestResultAssertionResult.expected) && Objects.equals(this.operator, syntheticsTestResultAssertionResult.operator) && Objects.equals(this.property, syntheticsTestResultAssertionResult.property) && Objects.equals(this.target, syntheticsTestResultAssertionResult.target) && Objects.equals(this.targetPath, syntheticsTestResultAssertionResult.targetPath) && Objects.equals(this.targetPathOperator, syntheticsTestResultAssertionResult.targetPathOperator) && Objects.equals(this.type, syntheticsTestResultAssertionResult.type) && Objects.equals(this.valid, syntheticsTestResultAssertionResult.valid) && Objects.equals(this.additionalProperties, syntheticsTestResultAssertionResult.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(actual,errorMessage,expected,operator,property,target,targetPath,targetPathOperator,type,valid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultAssertionResult {\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    targetPathOperator: ").append(toIndentedString(targetPathOperator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
