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
 * The <code>remap_vrl</code> processor (also called "Custom processor") transforms events using <a
 * href="https://vector.dev/docs/reference/vrl/">Vector Remap Language (VRL)</a> scripts with
 * advanced filtering capabilities.
 */
@JsonPropertyOrder({
  ObservabilityPipelineRemapVrlProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineRemapVrlProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineRemapVrlProcessor.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineRemapVrlProcessor.JSON_PROPERTY_REMAPS,
  ObservabilityPipelineRemapVrlProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineRemapVrlProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_REMAPS = "remaps";
  private List<ObservabilityPipelineRemapVrlProcessorRemap> remaps = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineRemapVrlProcessorType type =
      ObservabilityPipelineRemapVrlProcessorType.REMAP_VRL;

  public ObservabilityPipelineRemapVrlProcessor() {}

  @JsonCreator
  public ObservabilityPipelineRemapVrlProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_REMAPS)
          List<ObservabilityPipelineRemapVrlProcessorRemap> remaps,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineRemapVrlProcessorType type) {
    this.id = id;
    this.include = include;
    this.inputs = inputs;
    this.remaps = remaps;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineRemapVrlProcessor id(String id) {
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

  public ObservabilityPipelineRemapVrlProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which logs this processor targets. This field should
   * always be set to <code>*</code> for the remap_vrl processor.
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

  public ObservabilityPipelineRemapVrlProcessor inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineRemapVrlProcessor addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineRemapVrlProcessor remaps(
      List<ObservabilityPipelineRemapVrlProcessorRemap> remaps) {
    this.remaps = remaps;
    for (ObservabilityPipelineRemapVrlProcessorRemap item : remaps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineRemapVrlProcessor addRemapsItem(
      ObservabilityPipelineRemapVrlProcessorRemap remapsItem) {
    this.remaps.add(remapsItem);
    this.unparsed |= remapsItem.unparsed;
    return this;
  }

  /**
   * Array of VRL remap rules.
   *
   * @return remaps
   */
  @JsonProperty(JSON_PROPERTY_REMAPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineRemapVrlProcessorRemap> getRemaps() {
    return remaps;
  }

  public void setRemaps(List<ObservabilityPipelineRemapVrlProcessorRemap> remaps) {
    this.remaps = remaps;
  }

  public ObservabilityPipelineRemapVrlProcessor type(
      ObservabilityPipelineRemapVrlProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>remap_vrl</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineRemapVrlProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineRemapVrlProcessorType type) {
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
   * @return ObservabilityPipelineRemapVrlProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineRemapVrlProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineRemapVrlProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineRemapVrlProcessor observabilityPipelineRemapVrlProcessor =
        (ObservabilityPipelineRemapVrlProcessor) o;
    return Objects.equals(this.id, observabilityPipelineRemapVrlProcessor.id)
        && Objects.equals(this.include, observabilityPipelineRemapVrlProcessor.include)
        && Objects.equals(this.inputs, observabilityPipelineRemapVrlProcessor.inputs)
        && Objects.equals(this.remaps, observabilityPipelineRemapVrlProcessor.remaps)
        && Objects.equals(this.type, observabilityPipelineRemapVrlProcessor.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineRemapVrlProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, include, inputs, remaps, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineRemapVrlProcessor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    remaps: ").append(toIndentedString(remaps)).append("\n");
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
