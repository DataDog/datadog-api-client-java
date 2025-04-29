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
 * The <code>throttle</code> processor limits the number of events that pass through over a given
 * time window.
 */
@JsonPropertyOrder({
  ObservabilityPipelineThrottleProcessor.JSON_PROPERTY_GROUP_BY,
  ObservabilityPipelineThrottleProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineThrottleProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineThrottleProcessor.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineThrottleProcessor.JSON_PROPERTY_THRESHOLD,
  ObservabilityPipelineThrottleProcessor.JSON_PROPERTY_TYPE,
  ObservabilityPipelineThrottleProcessor.JSON_PROPERTY_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineThrottleProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private Long threshold;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineThrottleProcessorType type =
      ObservabilityPipelineThrottleProcessorType.THROTTLE;

  public static final String JSON_PROPERTY_WINDOW = "window";
  private Double window;

  public ObservabilityPipelineThrottleProcessor() {}

  @JsonCreator
  public ObservabilityPipelineThrottleProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_THRESHOLD) Long threshold,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineThrottleProcessorType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW) Double window) {
    this.id = id;
    this.include = include;
    this.inputs = inputs;
    this.threshold = threshold;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.window = window;
  }

  public ObservabilityPipelineThrottleProcessor groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public ObservabilityPipelineThrottleProcessor addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Optional list of fields used to group events before the threshold has been reached.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public ObservabilityPipelineThrottleProcessor id(String id) {
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

  public ObservabilityPipelineThrottleProcessor include(String include) {
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

  public ObservabilityPipelineThrottleProcessor inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineThrottleProcessor addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineThrottleProcessor threshold(Long threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * the number of events allowed in a given time window. Events sent after the threshold has been
   * reached, are dropped.
   *
   * @return threshold
   */
  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getThreshold() {
    return threshold;
  }

  public void setThreshold(Long threshold) {
    this.threshold = threshold;
  }

  public ObservabilityPipelineThrottleProcessor type(
      ObservabilityPipelineThrottleProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>throttle</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineThrottleProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineThrottleProcessorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ObservabilityPipelineThrottleProcessor window(Double window) {
    this.window = window;
    return this;
  }

  /**
   * The time window in seconds over which the threshold applies.
   *
   * @return window
   */
  @JsonProperty(JSON_PROPERTY_WINDOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getWindow() {
    return window;
  }

  public void setWindow(Double window) {
    this.window = window;
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
   * @return ObservabilityPipelineThrottleProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineThrottleProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineThrottleProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineThrottleProcessor observabilityPipelineThrottleProcessor =
        (ObservabilityPipelineThrottleProcessor) o;
    return Objects.equals(this.groupBy, observabilityPipelineThrottleProcessor.groupBy)
        && Objects.equals(this.id, observabilityPipelineThrottleProcessor.id)
        && Objects.equals(this.include, observabilityPipelineThrottleProcessor.include)
        && Objects.equals(this.inputs, observabilityPipelineThrottleProcessor.inputs)
        && Objects.equals(this.threshold, observabilityPipelineThrottleProcessor.threshold)
        && Objects.equals(this.type, observabilityPipelineThrottleProcessor.type)
        && Objects.equals(this.window, observabilityPipelineThrottleProcessor.window)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineThrottleProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        groupBy, id, include, inputs, threshold, type, window, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineThrottleProcessor {\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
