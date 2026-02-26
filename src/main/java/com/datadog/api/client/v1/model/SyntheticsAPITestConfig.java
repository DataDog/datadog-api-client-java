/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Configuration object for a Synthetic API test. */
@JsonPropertyOrder({
  SyntheticsAPITestConfig.JSON_PROPERTY_ASSERTIONS,
  SyntheticsAPITestConfig.JSON_PROPERTY_CONFIG_VARIABLES,
  SyntheticsAPITestConfig.JSON_PROPERTY_REQUEST,
  SyntheticsAPITestConfig.JSON_PROPERTY_STEPS,
  SyntheticsAPITestConfig.JSON_PROPERTY_VARIABLES_FROM_SCRIPT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPITestConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsAssertion> assertions = null;

  public static final String JSON_PROPERTY_CONFIG_VARIABLES = "configVariables";
  private List<SyntheticsConfigVariable> configVariables = null;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestRequest request;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SyntheticsAPIStep> steps = null;

  public static final String JSON_PROPERTY_VARIABLES_FROM_SCRIPT = "variablesFromScript";
  private String variablesFromScript;

  public SyntheticsAPITestConfig assertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
    for (SyntheticsAssertion item : assertions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsAPITestConfig addAssertionsItem(SyntheticsAssertion assertionsItem) {
    if (this.assertions == null) {
      this.assertions = new ArrayList<>();
    }
    this.assertions.add(assertionsItem);
    this.unparsed |= assertionsItem.unparsed;
    return this;
  }

  /**
   * Array of assertions used for the test. Required for single API tests.
   *
   * @return assertions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsAssertion> getAssertions() {
    return assertions;
  }

  public void setAssertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
  }

  public SyntheticsAPITestConfig configVariables(List<SyntheticsConfigVariable> configVariables) {
    this.configVariables = configVariables;
    for (SyntheticsConfigVariable item : configVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsAPITestConfig addConfigVariablesItem(
      SyntheticsConfigVariable configVariablesItem) {
    if (this.configVariables == null) {
      this.configVariables = new ArrayList<>();
    }
    this.configVariables.add(configVariablesItem);
    this.unparsed |= configVariablesItem.unparsed;
    return this;
  }

  /**
   * Array of variables used for the test.
   *
   * @return configVariables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsConfigVariable> getConfigVariables() {
    return configVariables;
  }

  public void setConfigVariables(List<SyntheticsConfigVariable> configVariables) {
    this.configVariables = configVariables;
  }

  public SyntheticsAPITestConfig request(SyntheticsTestRequest request) {
    this.request = request;
    this.unparsed |= request.unparsed;
    return this;
  }

  /**
   * Object describing the Synthetic test request.
   *
   * @return request
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestRequest getRequest() {
    return request;
  }

  public void setRequest(SyntheticsTestRequest request) {
    this.request = request;
  }

  public SyntheticsAPITestConfig steps(List<SyntheticsAPIStep> steps) {
    this.steps = steps;
    for (SyntheticsAPIStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsAPITestConfig addStepsItem(SyntheticsAPIStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * When the test subtype is <code>multi</code>, the steps of the test.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsAPIStep> getSteps() {
    return steps;
  }

  public void setSteps(List<SyntheticsAPIStep> steps) {
    this.steps = steps;
  }

  public SyntheticsAPITestConfig variablesFromScript(String variablesFromScript) {
    this.variablesFromScript = variablesFromScript;
    return this;
  }

  /**
   * Variables defined from JavaScript code.
   *
   * @return variablesFromScript
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIABLES_FROM_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariablesFromScript() {
    return variablesFromScript;
  }

  public void setVariablesFromScript(String variablesFromScript) {
    this.variablesFromScript = variablesFromScript;
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
   * @return SyntheticsAPITestConfig
   */
  @JsonAnySetter
  public SyntheticsAPITestConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsAPITestConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestConfig syntheticsApiTestConfig = (SyntheticsAPITestConfig) o;
    return Objects.equals(this.assertions, syntheticsApiTestConfig.assertions)
        && Objects.equals(this.configVariables, syntheticsApiTestConfig.configVariables)
        && Objects.equals(this.request, syntheticsApiTestConfig.request)
        && Objects.equals(this.steps, syntheticsApiTestConfig.steps)
        && Objects.equals(this.variablesFromScript, syntheticsApiTestConfig.variablesFromScript)
        && Objects.equals(this.additionalProperties, syntheticsApiTestConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assertions, configVariables, request, steps, variablesFromScript, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestConfig {\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    configVariables: ").append(toIndentedString(configVariables)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    variablesFromScript: ")
        .append(toIndentedString(variablesFromScript))
        .append("\n");
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
