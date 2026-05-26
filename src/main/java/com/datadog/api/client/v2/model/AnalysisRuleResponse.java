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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The result of applying a single static analysis rule to the analyzed source code. */
@JsonPropertyOrder({
  AnalysisRuleResponse.JSON_PROPERTY_ERRORS,
  AnalysisRuleResponse.JSON_PROPERTY_EXECUTION_ERROR,
  AnalysisRuleResponse.JSON_PROPERTY_EXECUTION_TIME_MS,
  AnalysisRuleResponse.JSON_PROPERTY_IDENTIFIER,
  AnalysisRuleResponse.JSON_PROPERTY_OUTPUT,
  AnalysisRuleResponse.JSON_PROPERTY_VIOLATIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnalysisRuleResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = new ArrayList<>();

  public static final String JSON_PROPERTY_EXECUTION_ERROR = "execution_error";
  private String executionError;

  public static final String JSON_PROPERTY_EXECUTION_TIME_MS = "execution_time_ms";
  private Long executionTimeMs;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private String output;

  public static final String JSON_PROPERTY_VIOLATIONS = "violations";
  private List<AnalysisViolation> violations = new ArrayList<>();

  public AnalysisRuleResponse() {}

  @JsonCreator
  public AnalysisRuleResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERRORS) List<String> errors,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXECUTION_ERROR) String executionError,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXECUTION_TIME_MS) Long executionTimeMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_IDENTIFIER) String identifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_OUTPUT) String output,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIOLATIONS)
          List<AnalysisViolation> violations) {
    this.errors = errors;
    this.executionError = executionError;
    if (executionError != null) {}
    this.executionTimeMs = executionTimeMs;
    this.identifier = identifier;
    this.output = output;
    this.violations = violations;
  }

  public AnalysisRuleResponse errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public AnalysisRuleResponse addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * A list of error messages encountered while executing the rule.
   *
   * @return errors
   */
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public AnalysisRuleResponse executionError(String executionError) {
    this.executionError = executionError;
    if (executionError != null) {}
    return this;
  }

  /**
   * An error message if the rule execution failed, or null if execution succeeded.
   *
   * @return executionError
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExecutionError() {
    return executionError;
  }

  public void setExecutionError(String executionError) {
    this.executionError = executionError;
  }

  public AnalysisRuleResponse executionTimeMs(Long executionTimeMs) {
    this.executionTimeMs = executionTimeMs;
    return this;
  }

  /**
   * The time taken to execute the rule, in milliseconds.
   *
   * @return executionTimeMs
   */
  @JsonProperty(JSON_PROPERTY_EXECUTION_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getExecutionTimeMs() {
    return executionTimeMs;
  }

  public void setExecutionTimeMs(Long executionTimeMs) {
    this.executionTimeMs = executionTimeMs;
  }

  public AnalysisRuleResponse identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * The identifier of the rule that produced this response.
   *
   * @return identifier
   */
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public AnalysisRuleResponse output(String output) {
    this.output = output;
    return this;
  }

  /**
   * The raw output produced by the rule engine during execution.
   *
   * @return output
   */
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  public AnalysisRuleResponse violations(List<AnalysisViolation> violations) {
    this.violations = violations;
    for (AnalysisViolation item : violations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AnalysisRuleResponse addViolationsItem(AnalysisViolation violationsItem) {
    this.violations.add(violationsItem);
    this.unparsed |= violationsItem.unparsed;
    return this;
  }

  /**
   * The list of violations found by this rule.
   *
   * @return violations
   */
  @JsonProperty(JSON_PROPERTY_VIOLATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AnalysisViolation> getViolations() {
    return violations;
  }

  public void setViolations(List<AnalysisViolation> violations) {
    this.violations = violations;
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
   * @return AnalysisRuleResponse
   */
  @JsonAnySetter
  public AnalysisRuleResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AnalysisRuleResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisRuleResponse analysisRuleResponse = (AnalysisRuleResponse) o;
    return Objects.equals(this.errors, analysisRuleResponse.errors)
        && Objects.equals(this.executionError, analysisRuleResponse.executionError)
        && Objects.equals(this.executionTimeMs, analysisRuleResponse.executionTimeMs)
        && Objects.equals(this.identifier, analysisRuleResponse.identifier)
        && Objects.equals(this.output, analysisRuleResponse.output)
        && Objects.equals(this.violations, analysisRuleResponse.violations)
        && Objects.equals(this.additionalProperties, analysisRuleResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        errors,
        executionError,
        executionTimeMs,
        identifier,
        output,
        violations,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisRuleResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    executionError: ").append(toIndentedString(executionError)).append("\n");
    sb.append("    executionTimeMs: ").append(toIndentedString(executionTimeMs)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
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
