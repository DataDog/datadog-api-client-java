/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Assertion result for a browser or mobile step. */
@JsonPropertyOrder({
  SyntheticsTestResultStepAssertionResult.JSON_PROPERTY_ACTUAL,
  SyntheticsTestResultStepAssertionResult.JSON_PROPERTY_CHECK_TYPE,
  SyntheticsTestResultStepAssertionResult.JSON_PROPERTY_EXPECTED,
  SyntheticsTestResultStepAssertionResult.JSON_PROPERTY_HAS_SECURE_VARIABLES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultStepAssertionResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTUAL = "actual";
  private Object actual = null;

  public static final String JSON_PROPERTY_CHECK_TYPE = "check_type";
  private String checkType;

  public static final String JSON_PROPERTY_EXPECTED = "expected";
  private Object expected = null;

  public static final String JSON_PROPERTY_HAS_SECURE_VARIABLES = "has_secure_variables";
  private Boolean hasSecureVariables;

  public SyntheticsTestResultStepAssertionResult actual(Object actual) {
    this.actual = actual;
    return this;
  }

  /**
   * Actual value observed during the step assertion. Its type depends on the check type.
   *
   * @return actual
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getActual() {
    return actual;
  }

  public void setActual(Object actual) {
    this.actual = actual;
  }

  public SyntheticsTestResultStepAssertionResult checkType(String checkType) {
    this.checkType = checkType;
    return this;
  }

  /**
   * Type of the step assertion check.
   *
   * @return checkType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCheckType() {
    return checkType;
  }

  public void setCheckType(String checkType) {
    this.checkType = checkType;
  }

  public SyntheticsTestResultStepAssertionResult expected(Object expected) {
    this.expected = expected;
    return this;
  }

  /**
   * Expected value for the step assertion. Its type depends on the check type.
   *
   * @return expected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getExpected() {
    return expected;
  }

  public void setExpected(Object expected) {
    this.expected = expected;
  }

  public SyntheticsTestResultStepAssertionResult hasSecureVariables(Boolean hasSecureVariables) {
    this.hasSecureVariables = hasSecureVariables;
    return this;
  }

  /**
   * Whether the assertion involves secure variables.
   *
   * @return hasSecureVariables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_SECURE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasSecureVariables() {
    return hasSecureVariables;
  }

  public void setHasSecureVariables(Boolean hasSecureVariables) {
    this.hasSecureVariables = hasSecureVariables;
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
   * @return SyntheticsTestResultStepAssertionResult
   */
  @JsonAnySetter
  public SyntheticsTestResultStepAssertionResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultStepAssertionResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultStepAssertionResult syntheticsTestResultStepAssertionResult =
        (SyntheticsTestResultStepAssertionResult) o;
    return Objects.equals(this.actual, syntheticsTestResultStepAssertionResult.actual)
        && Objects.equals(this.checkType, syntheticsTestResultStepAssertionResult.checkType)
        && Objects.equals(this.expected, syntheticsTestResultStepAssertionResult.expected)
        && Objects.equals(
            this.hasSecureVariables, syntheticsTestResultStepAssertionResult.hasSecureVariables)
        && Objects.equals(
            this.additionalProperties,
            syntheticsTestResultStepAssertionResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actual, checkType, expected, hasSecureVariables, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultStepAssertionResult {\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    hasSecureVariables: ").append(toIndentedString(hasSecureVariables)).append("\n");
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
