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

/** The attributes of the analysis response, containing rule results and any top-level errors. */
@JsonPropertyOrder({
  AnalysisResponseDataAttributes.JSON_PROPERTY_ERRORS,
  AnalysisResponseDataAttributes.JSON_PROPERTY_RULE_RESPONSES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnalysisResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = new ArrayList<>();

  public static final String JSON_PROPERTY_RULE_RESPONSES = "rule_responses";
  private List<AnalysisRuleResponse> ruleResponses = new ArrayList<>();

  public AnalysisResponseDataAttributes() {}

  @JsonCreator
  public AnalysisResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERRORS) List<String> errors,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_RESPONSES)
          List<AnalysisRuleResponse> ruleResponses) {
    this.errors = errors;
    this.ruleResponses = ruleResponses;
  }

  public AnalysisResponseDataAttributes errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public AnalysisResponseDataAttributes addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Top-level error messages encountered during the analysis operation.
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

  public AnalysisResponseDataAttributes ruleResponses(List<AnalysisRuleResponse> ruleResponses) {
    this.ruleResponses = ruleResponses;
    for (AnalysisRuleResponse item : ruleResponses) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AnalysisResponseDataAttributes addRuleResponsesItem(
      AnalysisRuleResponse ruleResponsesItem) {
    this.ruleResponses.add(ruleResponsesItem);
    this.unparsed |= ruleResponsesItem.unparsed;
    return this;
  }

  /**
   * The list of results for each static analysis rule applied during analysis.
   *
   * @return ruleResponses
   */
  @JsonProperty(JSON_PROPERTY_RULE_RESPONSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AnalysisRuleResponse> getRuleResponses() {
    return ruleResponses;
  }

  public void setRuleResponses(List<AnalysisRuleResponse> ruleResponses) {
    this.ruleResponses = ruleResponses;
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
   * @return AnalysisResponseDataAttributes
   */
  @JsonAnySetter
  public AnalysisResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AnalysisResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisResponseDataAttributes analysisResponseDataAttributes =
        (AnalysisResponseDataAttributes) o;
    return Objects.equals(this.errors, analysisResponseDataAttributes.errors)
        && Objects.equals(this.ruleResponses, analysisResponseDataAttributes.ruleResponses)
        && Objects.equals(
            this.additionalProperties, analysisResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, ruleResponses, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisResponseDataAttributes {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    ruleResponses: ").append(toIndentedString(ruleResponses)).append("\n");
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
