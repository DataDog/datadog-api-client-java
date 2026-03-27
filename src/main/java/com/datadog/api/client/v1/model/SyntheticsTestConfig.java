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
import java.util.UUID;
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
   * <p>Configuration object for a Synthetic test.</p>
 */
@JsonPropertyOrder({
  SyntheticsTestConfig.JSON_PROPERTY_ASSERTIONS,
  SyntheticsTestConfig.JSON_PROPERTY_CONFIG_VARIABLES,
  SyntheticsTestConfig.JSON_PROPERTY_REQUEST,
  SyntheticsTestConfig.JSON_PROPERTY_VARIABLES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsAssertion> assertions = null;

  public static final String JSON_PROPERTY_CONFIG_VARIABLES = "configVariables";
  private List<SyntheticsConfigVariable> configVariables = null;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestRequest request;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<SyntheticsBrowserVariable> variables = null;

  public SyntheticsTestConfig assertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
    for (SyntheticsAssertion item : assertions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsTestConfig addAssertionsItem(SyntheticsAssertion assertionsItem) {
    if (this.assertions == null) {
      this.assertions = new ArrayList<>();
    }
    this.assertions.add(assertionsItem);
    this.unparsed |= assertionsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of assertions used for the test. Required for single API tests.</p>
   * @return assertions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ASSERTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsAssertion> getAssertions() {
        return assertions;
      }
  public void setAssertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
  }
  public SyntheticsTestConfig configVariables(List<SyntheticsConfigVariable> configVariables) {
    this.configVariables = configVariables;
    for (SyntheticsConfigVariable item : configVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsTestConfig addConfigVariablesItem(SyntheticsConfigVariable configVariablesItem) {
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
  public SyntheticsTestConfig request(SyntheticsTestRequest request) {
    this.request = request;
    this.unparsed |= request.unparsed;
    return this;
  }

  /**
   * <p>Object describing the Synthetic test request.</p>
   * @return request
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REQUEST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestRequest getRequest() {
        return request;
      }
  public void setRequest(SyntheticsTestRequest request) {
    this.request = request;
  }
  public SyntheticsTestConfig variables(List<SyntheticsBrowserVariable> variables) {
    this.variables = variables;
    for (SyntheticsBrowserVariable item : variables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsTestConfig addVariablesItem(SyntheticsBrowserVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    this.unparsed |= variablesItem.unparsed;
    return this;
  }

  /**
   * <p>Browser tests only - array of variables used for the test steps.</p>
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
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsTestConfig
   */
  @JsonAnySetter
  public SyntheticsTestConfig putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsTestConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestConfig syntheticsTestConfig = (SyntheticsTestConfig) o;
    return Objects.equals(this.assertions, syntheticsTestConfig.assertions) && Objects.equals(this.configVariables, syntheticsTestConfig.configVariables) && Objects.equals(this.request, syntheticsTestConfig.request) && Objects.equals(this.variables, syntheticsTestConfig.variables) && Objects.equals(this.additionalProperties, syntheticsTestConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(assertions,configVariables,request,variables, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestConfig {\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    configVariables: ").append(toIndentedString(configVariables)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
