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

/** Information about a sub-step in a nested test execution. */
@JsonPropertyOrder({
  SyntheticsTestResultSubStep.JSON_PROPERTY_LEVEL,
  SyntheticsTestResultSubStep.JSON_PROPERTY_PARENT_STEP,
  SyntheticsTestResultSubStep.JSON_PROPERTY_PARENT_TEST
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultSubStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LEVEL = "level";
  private Long level;

  public static final String JSON_PROPERTY_PARENT_STEP = "parent_step";
  private SyntheticsTestResultParentStep parentStep;

  public static final String JSON_PROPERTY_PARENT_TEST = "parent_test";
  private SyntheticsTestResultParentTest parentTest;

  public SyntheticsTestResultSubStep level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * Depth of the sub-step in the execution tree.
   *
   * @return level
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
  }

  public SyntheticsTestResultSubStep parentStep(SyntheticsTestResultParentStep parentStep) {
    this.parentStep = parentStep;
    this.unparsed |= parentStep.unparsed;
    return this;
  }

  /**
   * Reference to the parent step of a sub-step.
   *
   * @return parentStep
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultParentStep getParentStep() {
    return parentStep;
  }

  public void setParentStep(SyntheticsTestResultParentStep parentStep) {
    this.parentStep = parentStep;
  }

  public SyntheticsTestResultSubStep parentTest(SyntheticsTestResultParentTest parentTest) {
    this.parentTest = parentTest;
    this.unparsed |= parentTest.unparsed;
    return this;
  }

  /**
   * Reference to the parent test of a sub-step.
   *
   * @return parentTest
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultParentTest getParentTest() {
    return parentTest;
  }

  public void setParentTest(SyntheticsTestResultParentTest parentTest) {
    this.parentTest = parentTest;
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
   * @return SyntheticsTestResultSubStep
   */
  @JsonAnySetter
  public SyntheticsTestResultSubStep putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultSubStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultSubStep syntheticsTestResultSubStep = (SyntheticsTestResultSubStep) o;
    return Objects.equals(this.level, syntheticsTestResultSubStep.level)
        && Objects.equals(this.parentStep, syntheticsTestResultSubStep.parentStep)
        && Objects.equals(this.parentTest, syntheticsTestResultSubStep.parentTest)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultSubStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, parentStep, parentTest, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultSubStep {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    parentStep: ").append(toIndentedString(parentStep)).append("\n");
    sb.append("    parentTest: ").append(toIndentedString(parentTest)).append("\n");
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
