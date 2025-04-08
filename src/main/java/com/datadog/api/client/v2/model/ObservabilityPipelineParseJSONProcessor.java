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

/**
 * The <code>parse_json</code> processor extracts JSON from a specified field and flattens it into
 * the event. This is useful when logs contain embedded JSON as a string.
 */
@JsonPropertyOrder({
  ObservabilityPipelineParseJSONProcessor.JSON_PROPERTY_FIELD,
  ObservabilityPipelineParseJSONProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineParseJSONProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineParseJSONProcessor.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineParseJSONProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineParseJSONProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineParseJSONProcessorType type =
      ObservabilityPipelineParseJSONProcessorType.PARSE_JSON;

  public ObservabilityPipelineParseJSONProcessor() {}

  @JsonCreator
  public ObservabilityPipelineParseJSONProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD) String field,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineParseJSONProcessorType type) {
    this.field = field;
    this.id = id;
    this.include = include;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineParseJSONProcessor field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The name of the log field that contains a JSON string.
   *
   * @return field
   */
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ObservabilityPipelineParseJSONProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for this component. Used to reference this component in other parts of the
   * pipeline (e.g., as input to downstream components).
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

  public ObservabilityPipelineParseJSONProcessor include(String include) {
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

  public ObservabilityPipelineParseJSONProcessor inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineParseJSONProcessor addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the <code>input</code> for this component.
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

  public ObservabilityPipelineParseJSONProcessor type(
      ObservabilityPipelineParseJSONProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>parse_json</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineParseJSONProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineParseJSONProcessorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineParseJSONProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineParseJSONProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineParseJSONProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineParseJSONProcessor observabilityPipelineParseJsonProcessor =
        (ObservabilityPipelineParseJSONProcessor) o;
    return Objects.equals(this.field, observabilityPipelineParseJsonProcessor.field)
        && Objects.equals(this.id, observabilityPipelineParseJsonProcessor.id)
        && Objects.equals(this.include, observabilityPipelineParseJsonProcessor.include)
        && Objects.equals(this.inputs, observabilityPipelineParseJsonProcessor.inputs)
        && Objects.equals(this.type, observabilityPipelineParseJsonProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineParseJsonProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, id, include, inputs, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineParseJSONProcessor {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
