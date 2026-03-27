/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>A group of processors.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineConfigProcessorGroup.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineConfigProcessorGroup.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineConfigProcessorGroup.JSON_PROPERTY_ID,
  ObservabilityPipelineConfigProcessorGroup.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineConfigProcessorGroup.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineConfigProcessorGroup.JSON_PROPERTY_PROCESSORS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineConfigProcessorGroup {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_PROCESSORS = "processors";
  private List<ObservabilityPipelineConfigProcessorItem> processors = new ArrayList<>();

  public ObservabilityPipelineConfigProcessorGroup() {}

  @JsonCreator
  public ObservabilityPipelineConfigProcessorGroup(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENABLED)Boolean enabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INCLUDE)String include,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_PROCESSORS)List<ObservabilityPipelineConfigProcessorItem> processors) {
        this.enabled = enabled;
        this.id = id;
        this.include = include;
        this.inputs = inputs;
        this.processors = processors;
  }
  public ObservabilityPipelineConfigProcessorGroup displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * <p>The display name for a component.</p>
   * @return displayName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDisplayName() {
        return displayName;
      }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  public ObservabilityPipelineConfigProcessorGroup enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether this processor group is enabled.</p>
   * @return enabled
  **/
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public ObservabilityPipelineConfigProcessorGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier for the processor group.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ObservabilityPipelineConfigProcessorGroup include(String include) {
    this.include = include;
    return this;
  }

  /**
   * <p>Conditional expression for when this processor group should execute.</p>
   * @return include
  **/
      @JsonProperty(JSON_PROPERTY_INCLUDE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getInclude() {
        return include;
      }
  public void setInclude(String include) {
    this.include = include;
  }
  public ObservabilityPipelineConfigProcessorGroup inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineConfigProcessorGroup addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * <p>A list of IDs for components whose output is used as the input for this processor group.</p>
   * @return inputs
  **/
      @JsonProperty(JSON_PROPERTY_INPUTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getInputs() {
        return inputs;
      }
  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }
  public ObservabilityPipelineConfigProcessorGroup processors(List<ObservabilityPipelineConfigProcessorItem> processors) {
    this.processors = processors;
    for (ObservabilityPipelineConfigProcessorItem item : processors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ObservabilityPipelineConfigProcessorGroup addProcessorsItem(ObservabilityPipelineConfigProcessorItem processorsItem) {
    this.processors.add(processorsItem);
    this.unparsed |= processorsItem.unparsed;
    return this;
  }

  /**
   * <p>Processors applied sequentially within this group. Events flow through each processor in order.</p>
   * @return processors
  **/
      @JsonProperty(JSON_PROPERTY_PROCESSORS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ObservabilityPipelineConfigProcessorItem> getProcessors() {
        return processors;
      }
  public void setProcessors(List<ObservabilityPipelineConfigProcessorItem> processors) {
    this.processors = processors;
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
   * @return ObservabilityPipelineConfigProcessorGroup
   */
  @JsonAnySetter
  public ObservabilityPipelineConfigProcessorGroup putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineConfigProcessorGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineConfigProcessorGroup observabilityPipelineConfigProcessorGroup = (ObservabilityPipelineConfigProcessorGroup) o;
    return Objects.equals(this.displayName, observabilityPipelineConfigProcessorGroup.displayName) && Objects.equals(this.enabled, observabilityPipelineConfigProcessorGroup.enabled) && Objects.equals(this.id, observabilityPipelineConfigProcessorGroup.id) && Objects.equals(this.include, observabilityPipelineConfigProcessorGroup.include) && Objects.equals(this.inputs, observabilityPipelineConfigProcessorGroup.inputs) && Objects.equals(this.processors, observabilityPipelineConfigProcessorGroup.processors) && Objects.equals(this.additionalProperties, observabilityPipelineConfigProcessorGroup.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(displayName,enabled,id,include,inputs,processors, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineConfigProcessorGroup {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
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
