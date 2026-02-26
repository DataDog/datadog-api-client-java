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
   * <p>Configuration object for a Synthetic mobile test.</p>
 */
@JsonPropertyOrder({
  SyntheticsMobileTestConfig.JSON_PROPERTY_INITIAL_APPLICATION_ARGUMENTS,
  SyntheticsMobileTestConfig.JSON_PROPERTY_VARIABLES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileTestConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_INITIAL_APPLICATION_ARGUMENTS = "initialApplicationArguments";
  private Map<String, String> initialApplicationArguments = null;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<SyntheticsConfigVariable> variables = null;

  public SyntheticsMobileTestConfig initialApplicationArguments(Map<String, String> initialApplicationArguments) {
    this.initialApplicationArguments = initialApplicationArguments;
    return this;
  }
  public SyntheticsMobileTestConfig putInitialApplicationArgumentsItem(String key, String initialApplicationArgumentsItem) {
    if (this.initialApplicationArguments == null) {
      this.initialApplicationArguments = new HashMap<>();
    }
    this.initialApplicationArguments.put(key, initialApplicationArgumentsItem);
    return this;
  }

  /**
   * <p>Initial application arguments for a mobile test.</p>
   * @return initialApplicationArguments
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INITIAL_APPLICATION_ARGUMENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getInitialApplicationArguments() {
        return initialApplicationArguments;
      }
  public void setInitialApplicationArguments(Map<String, String> initialApplicationArguments) {
    this.initialApplicationArguments = initialApplicationArguments;
  }
  public SyntheticsMobileTestConfig variables(List<SyntheticsConfigVariable> variables) {
    this.variables = variables;
    for (SyntheticsConfigVariable item : variables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsMobileTestConfig addVariablesItem(SyntheticsConfigVariable variablesItem) {
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
      public List<SyntheticsConfigVariable> getVariables() {
        return variables;
      }
  public void setVariables(List<SyntheticsConfigVariable> variables) {
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
   * @return SyntheticsMobileTestConfig
   */
  @JsonAnySetter
  public SyntheticsMobileTestConfig putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsMobileTestConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileTestConfig syntheticsMobileTestConfig = (SyntheticsMobileTestConfig) o;
    return Objects.equals(this.initialApplicationArguments, syntheticsMobileTestConfig.initialApplicationArguments) && Objects.equals(this.variables, syntheticsMobileTestConfig.variables) && Objects.equals(this.additionalProperties, syntheticsMobileTestConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(initialApplicationArguments,variables, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileTestConfig {\n");
    sb.append("    initialApplicationArguments: ").append(toIndentedString(initialApplicationArguments)).append("\n");
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
