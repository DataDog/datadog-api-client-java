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

/** One condition of the WAF Custom Rule. */
@JsonPropertyOrder({
  ApplicationSecurityWafCustomRuleCondition.JSON_PROPERTY_OPERATOR,
  ApplicationSecurityWafCustomRuleCondition.JSON_PROPERTY_PARAMETERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityWafCustomRuleCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private ApplicationSecurityWafCustomRuleConditionOperator operator;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private ApplicationSecurityWafCustomRuleConditionParameters parameters;

  public ApplicationSecurityWafCustomRuleCondition() {}

  @JsonCreator
  public ApplicationSecurityWafCustomRuleCondition(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATOR)
          ApplicationSecurityWafCustomRuleConditionOperator operator,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARAMETERS)
          ApplicationSecurityWafCustomRuleConditionParameters parameters) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    this.parameters = parameters;
    this.unparsed |= parameters.unparsed;
  }

  public ApplicationSecurityWafCustomRuleCondition operator(
      ApplicationSecurityWafCustomRuleConditionOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * Operator to use for the WAF Condition.
   *
   * @return operator
   */
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApplicationSecurityWafCustomRuleConditionOperator getOperator() {
    return operator;
  }

  public void setOperator(ApplicationSecurityWafCustomRuleConditionOperator operator) {
    if (!operator.isValid()) {
      this.unparsed = true;
    }
    this.operator = operator;
  }

  public ApplicationSecurityWafCustomRuleCondition parameters(
      ApplicationSecurityWafCustomRuleConditionParameters parameters) {
    this.parameters = parameters;
    this.unparsed |= parameters.unparsed;
    return this;
  }

  /**
   * The scope of the WAF custom rule.
   *
   * @return parameters
   */
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApplicationSecurityWafCustomRuleConditionParameters getParameters() {
    return parameters;
  }

  public void setParameters(ApplicationSecurityWafCustomRuleConditionParameters parameters) {
    this.parameters = parameters;
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
   * @return ApplicationSecurityWafCustomRuleCondition
   */
  @JsonAnySetter
  public ApplicationSecurityWafCustomRuleCondition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ApplicationSecurityWafCustomRuleCondition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityWafCustomRuleCondition applicationSecurityWafCustomRuleCondition =
        (ApplicationSecurityWafCustomRuleCondition) o;
    return Objects.equals(this.operator, applicationSecurityWafCustomRuleCondition.operator)
        && Objects.equals(this.parameters, applicationSecurityWafCustomRuleCondition.parameters)
        && Objects.equals(
            this.additionalProperties,
            applicationSecurityWafCustomRuleCondition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, parameters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityWafCustomRuleCondition {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
