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

/** The <code>add_fields</code> processor adds static key-value fields to logs. */
@JsonPropertyOrder({
  ObservabilityPipelineAddFieldsProcessor.JSON_PROPERTY_FIELDS,
  ObservabilityPipelineAddFieldsProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineAddFieldsProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineAddFieldsProcessor.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineAddFieldsProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAddFieldsProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<ObservabilityPipelineFieldValue> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAddFieldsProcessorType type =
      ObservabilityPipelineAddFieldsProcessorType.ADD_FIELDS;

  public ObservabilityPipelineAddFieldsProcessor() {}

  @JsonCreator
  public ObservabilityPipelineAddFieldsProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELDS)
          List<ObservabilityPipelineFieldValue> fields,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineAddFieldsProcessorType type) {
    this.fields = fields;
    this.id = id;
    this.include = include;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineAddFieldsProcessor fields(
      List<ObservabilityPipelineFieldValue> fields) {
    this.fields = fields;
    for (ObservabilityPipelineFieldValue item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineAddFieldsProcessor addFieldsItem(
      ObservabilityPipelineFieldValue fieldsItem) {
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * A list of static fields (key-value pairs) that is added to each log event processed by this
   * component.
   *
   * @return fields
   */
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineFieldValue> getFields() {
    return fields;
  }

  public void setFields(List<ObservabilityPipelineFieldValue> fields) {
    this.fields = fields;
  }

  public ObservabilityPipelineAddFieldsProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used to reference this component in other parts of
   * the pipeline (for example, as the <code>input</code> to downstream components).
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

  public ObservabilityPipelineAddFieldsProcessor include(String include) {
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

  public ObservabilityPipelineAddFieldsProcessor inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineAddFieldsProcessor addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineAddFieldsProcessor type(
      ObservabilityPipelineAddFieldsProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>add_fields</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAddFieldsProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineAddFieldsProcessorType type) {
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
   * @return ObservabilityPipelineAddFieldsProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineAddFieldsProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineAddFieldsProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAddFieldsProcessor observabilityPipelineAddFieldsProcessor =
        (ObservabilityPipelineAddFieldsProcessor) o;
    return Objects.equals(this.fields, observabilityPipelineAddFieldsProcessor.fields)
        && Objects.equals(this.id, observabilityPipelineAddFieldsProcessor.id)
        && Objects.equals(this.include, observabilityPipelineAddFieldsProcessor.include)
        && Objects.equals(this.inputs, observabilityPipelineAddFieldsProcessor.inputs)
        && Objects.equals(this.type, observabilityPipelineAddFieldsProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAddFieldsProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, id, include, inputs, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAddFieldsProcessor {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
