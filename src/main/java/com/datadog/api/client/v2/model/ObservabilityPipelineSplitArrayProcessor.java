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
 * The <code>split_array</code> processor splits array fields into separate events based on
 * configured rules.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineSplitArrayProcessor.JSON_PROPERTY_ARRAYS,
  ObservabilityPipelineSplitArrayProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineSplitArrayProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineSplitArrayProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineSplitArrayProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineSplitArrayProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSplitArrayProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARRAYS = "arrays";
  private List<ObservabilityPipelineSplitArrayProcessorArrayConfig> arrays = new ArrayList<>();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSplitArrayProcessorType type =
      ObservabilityPipelineSplitArrayProcessorType.SPLIT_ARRAY;

  public ObservabilityPipelineSplitArrayProcessor() {}

  @JsonCreator
  public ObservabilityPipelineSplitArrayProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARRAYS)
          List<ObservabilityPipelineSplitArrayProcessorArrayConfig> arrays,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineSplitArrayProcessorType type) {
    this.arrays = arrays;
    this.enabled = enabled;
    this.id = id;
    this.include = include;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineSplitArrayProcessor arrays(
      List<ObservabilityPipelineSplitArrayProcessorArrayConfig> arrays) {
    this.arrays = arrays;
    for (ObservabilityPipelineSplitArrayProcessorArrayConfig item : arrays) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineSplitArrayProcessor addArraysItem(
      ObservabilityPipelineSplitArrayProcessorArrayConfig arraysItem) {
    this.arrays.add(arraysItem);
    this.unparsed |= arraysItem.unparsed;
    return this;
  }

  /**
   * A list of array split configurations.
   *
   * @return arrays
   */
  @JsonProperty(JSON_PROPERTY_ARRAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineSplitArrayProcessorArrayConfig> getArrays() {
    return arrays;
  }

  public void setArrays(List<ObservabilityPipelineSplitArrayProcessorArrayConfig> arrays) {
    this.arrays = arrays;
  }

  public ObservabilityPipelineSplitArrayProcessor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name for a component.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ObservabilityPipelineSplitArrayProcessor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the processor is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ObservabilityPipelineSplitArrayProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used in other parts of the pipeline to reference this
   * component (for example, as the <code>input</code> to downstream components).
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

  public ObservabilityPipelineSplitArrayProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which logs this processor targets. For split_array,
   * this should typically be <code>*</code>.
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

  public ObservabilityPipelineSplitArrayProcessor type(
      ObservabilityPipelineSplitArrayProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>split_array</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSplitArrayProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineSplitArrayProcessorType type) {
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
   * @return ObservabilityPipelineSplitArrayProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineSplitArrayProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineSplitArrayProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSplitArrayProcessor observabilityPipelineSplitArrayProcessor =
        (ObservabilityPipelineSplitArrayProcessor) o;
    return Objects.equals(this.arrays, observabilityPipelineSplitArrayProcessor.arrays)
        && Objects.equals(this.displayName, observabilityPipelineSplitArrayProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineSplitArrayProcessor.enabled)
        && Objects.equals(this.id, observabilityPipelineSplitArrayProcessor.id)
        && Objects.equals(this.include, observabilityPipelineSplitArrayProcessor.include)
        && Objects.equals(this.type, observabilityPipelineSplitArrayProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSplitArrayProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrays, displayName, enabled, id, include, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSplitArrayProcessor {\n");
    sb.append("    arrays: ").append(toIndentedString(arrays)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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
