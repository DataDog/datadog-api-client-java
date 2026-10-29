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

/** Attributes of the rule proposal to start. */
@JsonPropertyOrder({
  SecurityMonitoringRuleProposalStartRequestAttributes.JSON_PROPERTY_INPUT,
  SecurityMonitoringRuleProposalStartRequestAttributes.JSON_PROPERTY_INPUT_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleProposalStartRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INPUT = "input";
  private String input;

  public static final String JSON_PROPERTY_INPUT_TYPE = "inputType";
  private SecurityMonitoringRuleProposalInputType inputType;

  public SecurityMonitoringRuleProposalStartRequestAttributes() {}

  @JsonCreator
  public SecurityMonitoringRuleProposalStartRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT) String input,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT_TYPE)
          SecurityMonitoringRuleProposalInputType inputType) {
    this.input = input;
    this.inputType = inputType;
    this.unparsed |= !inputType.isValid();
  }

  public SecurityMonitoringRuleProposalStartRequestAttributes input(String input) {
    this.input = input;
    return this;
  }

  /**
   * The natural-language description or rule to generate the proposed rule from, in the format
   * given by <code>inputType</code>.
   *
   * @return input
   */
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public SecurityMonitoringRuleProposalStartRequestAttributes inputType(
      SecurityMonitoringRuleProposalInputType inputType) {
    this.inputType = inputType;
    this.unparsed |= !inputType.isValid();
    return this;
  }

  /**
   * The type of input to generate the proposed rule from: <code>natural_language</code> for a
   * plain-English description of the behavior to detect, <code>spl</code> for a Splunk SPL search
   * or saved search definition, or <code>kql</code> for a Microsoft KQL query. SPL inputs must be
   * self-contained, with search macros expanded.
   *
   * @return inputType
   */
  @JsonProperty(JSON_PROPERTY_INPUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringRuleProposalInputType getInputType() {
    return inputType;
  }

  public void setInputType(SecurityMonitoringRuleProposalInputType inputType) {
    if (!inputType.isValid()) {
      this.unparsed = true;
    }
    this.inputType = inputType;
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
   * @return SecurityMonitoringRuleProposalStartRequestAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringRuleProposalStartRequestAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this SecurityMonitoringRuleProposalStartRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleProposalStartRequestAttributes
        securityMonitoringRuleProposalStartRequestAttributes =
            (SecurityMonitoringRuleProposalStartRequestAttributes) o;
    return Objects.equals(this.input, securityMonitoringRuleProposalStartRequestAttributes.input)
        && Objects.equals(
            this.inputType, securityMonitoringRuleProposalStartRequestAttributes.inputType)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringRuleProposalStartRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, inputType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleProposalStartRequestAttributes {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
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
