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

/** The <code>add_env_vars</code> processor adds environment variable values to log events. */
@JsonPropertyOrder({
  ObservabilityPipelineAddEnvVarsProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineAddEnvVarsProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineAddEnvVarsProcessor.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineAddEnvVarsProcessor.JSON_PROPERTY_TYPE,
  ObservabilityPipelineAddEnvVarsProcessor.JSON_PROPERTY_VARIABLES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAddEnvVarsProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAddEnvVarsProcessorType type =
      ObservabilityPipelineAddEnvVarsProcessorType.ADD_ENV_VARS;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<ObservabilityPipelineAddEnvVarsProcessorVariable> variables = new ArrayList<>();

  public ObservabilityPipelineAddEnvVarsProcessor() {}

  @JsonCreator
  public ObservabilityPipelineAddEnvVarsProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineAddEnvVarsProcessorType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIABLES)
          List<ObservabilityPipelineAddEnvVarsProcessorVariable> variables) {
    this.id = id;
    this.include = include;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.variables = variables;
  }

  public ObservabilityPipelineAddEnvVarsProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used to reference this processor in the pipeline.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObservabilityPipelineAddEnvVarsProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which logs this processor targets.
   *
   * @return include
   */
  @JsonProperty(JSON_PROPERTY_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public ObservabilityPipelineAddEnvVarsProcessor inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineAddEnvVarsProcessor addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the input for this processor.
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ObservabilityPipelineAddEnvVarsProcessor type(
      ObservabilityPipelineAddEnvVarsProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>add_env_vars</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAddEnvVarsProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineAddEnvVarsProcessorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ObservabilityPipelineAddEnvVarsProcessor variables(
      List<ObservabilityPipelineAddEnvVarsProcessorVariable> variables) {
    this.variables = variables;
    for (ObservabilityPipelineAddEnvVarsProcessorVariable item : variables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineAddEnvVarsProcessor addVariablesItem(
      ObservabilityPipelineAddEnvVarsProcessorVariable variablesItem) {
    this.variables.add(variablesItem);
    this.unparsed |= variablesItem.unparsed;
    return this;
  }

  /**
   * A list of environment variable mappings to apply to log fields.
   *
   * @return variables
   */
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineAddEnvVarsProcessorVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<ObservabilityPipelineAddEnvVarsProcessorVariable> variables) {
    this.variables = variables;
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
   * @return ObservabilityPipelineAddEnvVarsProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineAddEnvVarsProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineAddEnvVarsProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAddEnvVarsProcessor observabilityPipelineAddEnvVarsProcessor =
        (ObservabilityPipelineAddEnvVarsProcessor) o;
    return Objects.equals(this.id, observabilityPipelineAddEnvVarsProcessor.id)
        && Objects.equals(this.include, observabilityPipelineAddEnvVarsProcessor.include)
        && Objects.equals(this.inputs, observabilityPipelineAddEnvVarsProcessor.inputs)
        && Objects.equals(this.type, observabilityPipelineAddEnvVarsProcessor.type)
        && Objects.equals(this.variables, observabilityPipelineAddEnvVarsProcessor.variables)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAddEnvVarsProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, include, inputs, type, variables, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAddEnvVarsProcessor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
