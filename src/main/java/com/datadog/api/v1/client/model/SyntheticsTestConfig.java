/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Configuration object for a Synthetic test. */
@ApiModel(description = "Configuration object for a Synthetic test.")
@JsonPropertyOrder({
  SyntheticsTestConfig.JSON_PROPERTY_ASSERTIONS,
  SyntheticsTestConfig.JSON_PROPERTY_CONFIG_VARIABLES,
  SyntheticsTestConfig.JSON_PROPERTY_REQUEST,
  SyntheticsTestConfig.JSON_PROPERTY_VARIABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsTestConfig {
  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsAssertion> assertions = new ArrayList<>();

  public static final String JSON_PROPERTY_CONFIG_VARIABLES = "configVariables";
  private List<SyntheticsConfigVariable> configVariables = null;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestRequest request;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<SyntheticsBrowserVariable> variables = null;

  public SyntheticsTestConfig assertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
    return this;
  }

  public SyntheticsTestConfig addAssertionsItem(SyntheticsAssertion assertionsItem) {
    this.assertions.add(assertionsItem);
    return this;
  }

  /**
   * Array of assertions used for the test.
   *
   * @return assertions
   */
  @ApiModelProperty(
      example = "[]",
      required = true,
      value = "Array of assertions used for the test.")
  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SyntheticsAssertion> getAssertions() {
    return assertions;
  }

  public void setAssertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
  }

  public SyntheticsTestConfig configVariables(List<SyntheticsConfigVariable> configVariables) {
    this.configVariables = configVariables;
    return this;
  }

  public SyntheticsTestConfig addConfigVariablesItem(SyntheticsConfigVariable configVariablesItem) {
    if (this.configVariables == null) {
      this.configVariables = new ArrayList<>();
    }
    this.configVariables.add(configVariablesItem);
    return this;
  }

  /**
   * API tests only - array of variables used for the test.
   *
   * @return configVariables
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API tests only - array of variables used for the test.")
  @JsonProperty(JSON_PROPERTY_CONFIG_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsConfigVariable> getConfigVariables() {
    return configVariables;
  }

  public void setConfigVariables(List<SyntheticsConfigVariable> configVariables) {
    this.configVariables = configVariables;
  }

  public SyntheticsTestConfig request(SyntheticsTestRequest request) {
    this.request = request;
    return this;
  }

  /**
   * Get request
   *
   * @return request
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsTestRequest getRequest() {
    return request;
  }

  public void setRequest(SyntheticsTestRequest request) {
    this.request = request;
  }

  public SyntheticsTestConfig variables(List<SyntheticsBrowserVariable> variables) {
    this.variables = variables;
    return this;
  }

  public SyntheticsTestConfig addVariablesItem(SyntheticsBrowserVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Browser tests only - array of variables used for the test steps.
   *
   * @return variables
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Browser tests only - array of variables used for the test steps.")
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsBrowserVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<SyntheticsBrowserVariable> variables) {
    this.variables = variables;
  }

  /** Return true if this SyntheticsTestConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestConfig syntheticsTestConfig = (SyntheticsTestConfig) o;
    return Objects.equals(this.assertions, syntheticsTestConfig.assertions)
        && Objects.equals(this.configVariables, syntheticsTestConfig.configVariables)
        && Objects.equals(this.request, syntheticsTestConfig.request)
        && Objects.equals(this.variables, syntheticsTestConfig.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assertions, configVariables, request, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestConfig {\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    configVariables: ").append(toIndentedString(configVariables)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
