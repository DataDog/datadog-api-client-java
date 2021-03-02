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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.SyntheticsAssertion;
import com.datadog.api.v1.client.model.SyntheticsBrowserVariable;
import com.datadog.api.v1.client.model.SyntheticsTestRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Configuration object for a Synthetic browser test.
 */
@ApiModel(description = "Configuration object for a Synthetic browser test.")
@JsonPropertyOrder({
  SyntheticsBrowserTestConfig.JSON_PROPERTY_ASSERTIONS,
  SyntheticsBrowserTestConfig.JSON_PROPERTY_REQUEST,
  SyntheticsBrowserTestConfig.JSON_PROPERTY_VARIABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsBrowserTestConfig {
  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsAssertion> assertions = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestRequest request;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<SyntheticsBrowserVariable> variables = null;


  public SyntheticsBrowserTestConfig assertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
    return this;
  }

  public SyntheticsBrowserTestConfig addAssertionsItem(SyntheticsAssertion assertionsItem) {
    this.assertions.add(assertionsItem);
    return this;
  }

   /**
   * Array of assertions used for the test.
   * @return assertions
  **/
  @ApiModelProperty(example = "[]", required = true, value = "Array of assertions used for the test.")
  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SyntheticsAssertion> getAssertions() {
    return assertions;
  }


  public void setAssertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
  }


  public SyntheticsBrowserTestConfig request(SyntheticsTestRequest request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SyntheticsTestRequest getRequest() {
    return request;
  }


  public void setRequest(SyntheticsTestRequest request) {
    this.request = request;
  }


  public SyntheticsBrowserTestConfig variables(List<SyntheticsBrowserVariable> variables) {
    this.variables = variables;
    return this;
  }

  public SyntheticsBrowserTestConfig addVariablesItem(SyntheticsBrowserVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Array of variables used for the test steps.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of variables used for the test steps.")
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsBrowserVariable> getVariables() {
    return variables;
  }


  public void setVariables(List<SyntheticsBrowserVariable> variables) {
    this.variables = variables;
  }


  /**
   * Return true if this SyntheticsBrowserTestConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestConfig syntheticsBrowserTestConfig = (SyntheticsBrowserTestConfig) o;
    return Objects.equals(this.assertions, syntheticsBrowserTestConfig.assertions) &&
        Objects.equals(this.request, syntheticsBrowserTestConfig.request) &&
        Objects.equals(this.variables, syntheticsBrowserTestConfig.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assertions, request, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestConfig {\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("}");
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

