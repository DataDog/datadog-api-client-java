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

/** The <code>dedupe</code> processor removes duplicate fields in log events. */
@JsonPropertyOrder({
  ObservabilityPipelineDedupeProcessor.JSON_PROPERTY_FIELDS,
  ObservabilityPipelineDedupeProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineDedupeProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineDedupeProcessor.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineDedupeProcessor.JSON_PROPERTY_MODE,
  ObservabilityPipelineDedupeProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineDedupeProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<String> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_MODE = "mode";
  private ObservabilityPipelineDedupeProcessorMode mode;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineDedupeProcessorType type =
      ObservabilityPipelineDedupeProcessorType.DEDUPE;

  public ObservabilityPipelineDedupeProcessor() {}

  @JsonCreator
  public ObservabilityPipelineDedupeProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELDS) List<String> fields,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          ObservabilityPipelineDedupeProcessorMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineDedupeProcessorType type) {
    this.fields = fields;
    this.id = id;
    this.include = include;
    this.inputs = inputs;
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineDedupeProcessor fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public ObservabilityPipelineDedupeProcessor addFieldsItem(String fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * A list of log field paths to check for duplicates.
   *
   * @return fields
   */
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public ObservabilityPipelineDedupeProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this processor.
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

  public ObservabilityPipelineDedupeProcessor include(String include) {
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

  public ObservabilityPipelineDedupeProcessor inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineDedupeProcessor addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineDedupeProcessor mode(ObservabilityPipelineDedupeProcessorMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * The deduplication mode to apply to the fields.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDedupeProcessorMode getMode() {
    return mode;
  }

  public void setMode(ObservabilityPipelineDedupeProcessorMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public ObservabilityPipelineDedupeProcessor type(ObservabilityPipelineDedupeProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>dedupe</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDedupeProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineDedupeProcessorType type) {
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
   * @return ObservabilityPipelineDedupeProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineDedupeProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineDedupeProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineDedupeProcessor observabilityPipelineDedupeProcessor =
        (ObservabilityPipelineDedupeProcessor) o;
    return Objects.equals(this.fields, observabilityPipelineDedupeProcessor.fields)
        && Objects.equals(this.id, observabilityPipelineDedupeProcessor.id)
        && Objects.equals(this.include, observabilityPipelineDedupeProcessor.include)
        && Objects.equals(this.inputs, observabilityPipelineDedupeProcessor.inputs)
        && Objects.equals(this.mode, observabilityPipelineDedupeProcessor.mode)
        && Objects.equals(this.type, observabilityPipelineDedupeProcessor.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineDedupeProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, id, include, inputs, mode, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineDedupeProcessor {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
