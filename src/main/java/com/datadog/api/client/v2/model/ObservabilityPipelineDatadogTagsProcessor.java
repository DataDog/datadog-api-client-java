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
 * The <code>datadog_tags</code> processor includes or excludes specific Datadog tags in your logs.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineDatadogTagsProcessor.JSON_PROPERTY_ACTION,
  ObservabilityPipelineDatadogTagsProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineDatadogTagsProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineDatadogTagsProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineDatadogTagsProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineDatadogTagsProcessor.JSON_PROPERTY_KEYS,
  ObservabilityPipelineDatadogTagsProcessor.JSON_PROPERTY_MODE,
  ObservabilityPipelineDatadogTagsProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineDatadogTagsProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private ObservabilityPipelineDatadogTagsProcessorAction action;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_KEYS = "keys";
  private List<String> keys = new ArrayList<>();

  public static final String JSON_PROPERTY_MODE = "mode";
  private ObservabilityPipelineDatadogTagsProcessorMode mode;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineDatadogTagsProcessorType type =
      ObservabilityPipelineDatadogTagsProcessorType.DATADOG_TAGS;

  public ObservabilityPipelineDatadogTagsProcessor() {}

  @JsonCreator
  public ObservabilityPipelineDatadogTagsProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION)
          ObservabilityPipelineDatadogTagsProcessorAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEYS) List<String> keys,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          ObservabilityPipelineDatadogTagsProcessorMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineDatadogTagsProcessorType type) {
    this.action = action;
    this.unparsed |= !action.isValid();
    this.enabled = enabled;
    this.id = id;
    this.include = include;
    this.keys = keys;
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineDatadogTagsProcessor action(
      ObservabilityPipelineDatadogTagsProcessorAction action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * The action to take on tags with matching keys.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDatadogTagsProcessorAction getAction() {
    return action;
  }

  public void setAction(ObservabilityPipelineDatadogTagsProcessorAction action) {
    if (!action.isValid()) {
      this.unparsed = true;
    }
    this.action = action;
  }

  public ObservabilityPipelineDatadogTagsProcessor displayName(String displayName) {
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

  public ObservabilityPipelineDatadogTagsProcessor enabled(Boolean enabled) {
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

  public ObservabilityPipelineDatadogTagsProcessor id(String id) {
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

  public ObservabilityPipelineDatadogTagsProcessor include(String include) {
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

  public ObservabilityPipelineDatadogTagsProcessor keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public ObservabilityPipelineDatadogTagsProcessor addKeysItem(String keysItem) {
    this.keys.add(keysItem);
    return this;
  }

  /**
   * A list of tag keys.
   *
   * @return keys
   */
  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }

  public ObservabilityPipelineDatadogTagsProcessor mode(
      ObservabilityPipelineDatadogTagsProcessorMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * The processing mode.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDatadogTagsProcessorMode getMode() {
    return mode;
  }

  public void setMode(ObservabilityPipelineDatadogTagsProcessorMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public ObservabilityPipelineDatadogTagsProcessor type(
      ObservabilityPipelineDatadogTagsProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>datadog_tags</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDatadogTagsProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineDatadogTagsProcessorType type) {
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
   * @return ObservabilityPipelineDatadogTagsProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineDatadogTagsProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineDatadogTagsProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineDatadogTagsProcessor observabilityPipelineDatadogTagsProcessor =
        (ObservabilityPipelineDatadogTagsProcessor) o;
    return Objects.equals(this.action, observabilityPipelineDatadogTagsProcessor.action)
        && Objects.equals(this.displayName, observabilityPipelineDatadogTagsProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineDatadogTagsProcessor.enabled)
        && Objects.equals(this.id, observabilityPipelineDatadogTagsProcessor.id)
        && Objects.equals(this.include, observabilityPipelineDatadogTagsProcessor.include)
        && Objects.equals(this.keys, observabilityPipelineDatadogTagsProcessor.keys)
        && Objects.equals(this.mode, observabilityPipelineDatadogTagsProcessor.mode)
        && Objects.equals(this.type, observabilityPipelineDatadogTagsProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineDatadogTagsProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action, displayName, enabled, id, include, keys, mode, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineDatadogTagsProcessor {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
