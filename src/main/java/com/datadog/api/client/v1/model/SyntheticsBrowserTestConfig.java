/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>Configuration object for a Synthetic browser test.</p>
 */
@JsonPropertyOrder({
  SyntheticsBrowserTestConfig.JSON_PROPERTY_ASSERTIONS,
  SyntheticsBrowserTestConfig.JSON_PROPERTY_CONFIG_VARIABLES,
  SyntheticsBrowserTestConfig.JSON_PROPERTY_REQUEST,
  SyntheticsBrowserTestConfig.JSON_PROPERTY_SET_COOKIE,
  SyntheticsBrowserTestConfig.JSON_PROPERTY_VARIABLES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBrowserTestConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsAssertion> assertions = new ArrayList<>();

  public static final String JSON_PROPERTY_CONFIG_VARIABLES = "configVariables";
  private List<SyntheticsConfigVariable> configVariables = null;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestRequest request;

  public static final String JSON_PROPERTY_SET_COOKIE = "setCookie";
  private String setCookie;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<SyntheticsBrowserVariable> variables = null;

  public SyntheticsBrowserTestConfig() {}

  @JsonCreator
  public SyntheticsBrowserTestConfig(
            @JsonProperty(required=true, value=JSON_PROPERTY_ASSERTIONS)List<SyntheticsAssertion> assertions,
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUEST)SyntheticsTestRequest request) {
        this.assertions = assertions;
        this.request = request;
        this.unparsed |= request.unparsed;
  }
  public SyntheticsBrowserTestConfig assertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
    for (SyntheticsAssertion item : assertions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsBrowserTestConfig addAssertionsItem(SyntheticsAssertion assertionsItem) {
    this.assertions.add(assertionsItem);
    this.unparsed |= assertionsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of assertions used for the test.</p>
   * @return assertions
  **/
      @JsonProperty(JSON_PROPERTY_ASSERTIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SyntheticsAssertion> getAssertions() {
        return assertions;
      }
  public void setAssertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
  }
  public SyntheticsBrowserTestConfig configVariables(List<SyntheticsConfigVariable> configVariables) {
    this.configVariables = configVariables;
    for (SyntheticsConfigVariable item : configVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsBrowserTestConfig addConfigVariablesItem(SyntheticsConfigVariable configVariablesItem) {
    if (this.configVariables == null) {
      this.configVariables = new ArrayList<>();
    }
    this.configVariables.add(configVariablesItem);
    this.unparsed |= configVariablesItem.unparsed;
    return this;
  }

  /**
   * <p>Array of variables used for the test.</p>
   * @return configVariables
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIG_VARIABLES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsConfigVariable> getConfigVariables() {
        return configVariables;
      }
  public void setConfigVariables(List<SyntheticsConfigVariable> configVariables) {
    this.configVariables = configVariables;
  }
  public SyntheticsBrowserTestConfig request(SyntheticsTestRequest request) {
    this.request = request;
    this.unparsed |= request.unparsed;
    return this;
  }

  /**
   * <p>Object describing the Synthetic test request.</p>
   * @return request
  **/
      @JsonProperty(JSON_PROPERTY_REQUEST)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsTestRequest getRequest() {
        return request;
      }
  public void setRequest(SyntheticsTestRequest request) {
    this.request = request;
  }
  public SyntheticsBrowserTestConfig setCookie(String setCookie) {
    this.setCookie = setCookie;
    return this;
  }

  /**
   * <p>Cookies to be used for the request, using the <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Set-Cookie">Set-Cookie</a> syntax.</p>
   * @return setCookie
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SET_COOKIE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSetCookie() {
        return setCookie;
      }
  public void setSetCookie(String setCookie) {
    this.setCookie = setCookie;
  }
  public SyntheticsBrowserTestConfig variables(List<SyntheticsBrowserVariable> variables) {
    this.variables = variables;
    for (SyntheticsBrowserVariable item : variables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsBrowserTestConfig addVariablesItem(SyntheticsBrowserVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    this.unparsed |= variablesItem.unparsed;
    return this;
  }

  /**
   * <p>Array of variables used for the test steps.</p>
   * @return variables
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VARIABLES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
    return Objects.equals(this.assertions, syntheticsBrowserTestConfig.assertions) && Objects.equals(this.configVariables, syntheticsBrowserTestConfig.configVariables) && Objects.equals(this.request, syntheticsBrowserTestConfig.request) && Objects.equals(this.setCookie, syntheticsBrowserTestConfig.setCookie) && Objects.equals(this.variables, syntheticsBrowserTestConfig.variables);
  }


  @Override
  public int hashCode() {
    return Objects.hash(assertions,configVariables,request,setCookie,variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestConfig {\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    configVariables: ").append(toIndentedString(configVariables)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    setCookie: ").append(toIndentedString(setCookie)).append("\n");
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
