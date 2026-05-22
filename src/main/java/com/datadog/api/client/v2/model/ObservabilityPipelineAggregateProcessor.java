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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The <code>aggregate</code> processor combines metrics that share the same name and tags into a
 * single metric over a configurable interval.
 *
 * <p><strong>Supported pipeline types:</strong> metrics
 */
@JsonPropertyOrder({
  ObservabilityPipelineAggregateProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineAggregateProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineAggregateProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineAggregateProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineAggregateProcessor.JSON_PROPERTY_INTERVAL_SECS,
  ObservabilityPipelineAggregateProcessor.JSON_PROPERTY_MODE,
  ObservabilityPipelineAggregateProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAggregateProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INTERVAL_SECS = "interval_secs";
  private Long intervalSecs;

  public static final String JSON_PROPERTY_MODE = "mode";
  private ObservabilityPipelineAggregateProcessorMode mode;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAggregateProcessorType type =
      ObservabilityPipelineAggregateProcessorType.AGGREGATE;

  public ObservabilityPipelineAggregateProcessor() {}

  @JsonCreator
  public ObservabilityPipelineAggregateProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERVAL_SECS) Long intervalSecs,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          ObservabilityPipelineAggregateProcessorMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineAggregateProcessorType type) {
    this.enabled = enabled;
    this.id = id;
    this.include = include;
    this.intervalSecs = intervalSecs;
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineAggregateProcessor displayName(String displayName) {
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

  public ObservabilityPipelineAggregateProcessor enabled(Boolean enabled) {
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

  public ObservabilityPipelineAggregateProcessor id(String id) {
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

  public ObservabilityPipelineAggregateProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which metrics this processor targets.
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

  public ObservabilityPipelineAggregateProcessor intervalSecs(Long intervalSecs) {
    this.intervalSecs = intervalSecs;
    return this;
  }

  /**
   * The interval, in seconds, over which metrics are aggregated. minimum: 1 maximum: 60
   *
   * @return intervalSecs
   */
  @JsonProperty(JSON_PROPERTY_INTERVAL_SECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getIntervalSecs() {
    return intervalSecs;
  }

  public void setIntervalSecs(Long intervalSecs) {
    this.intervalSecs = intervalSecs;
  }

  public ObservabilityPipelineAggregateProcessor mode(
      ObservabilityPipelineAggregateProcessorMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * The aggregation mode applied to metrics that share the same name and tags within the interval.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAggregateProcessorMode getMode() {
    return mode;
  }

  public void setMode(ObservabilityPipelineAggregateProcessorMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public ObservabilityPipelineAggregateProcessor type(
      ObservabilityPipelineAggregateProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value must be <code>aggregate</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAggregateProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineAggregateProcessorType type) {
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
   * @return ObservabilityPipelineAggregateProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineAggregateProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineAggregateProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAggregateProcessor observabilityPipelineAggregateProcessor =
        (ObservabilityPipelineAggregateProcessor) o;
    return Objects.equals(this.displayName, observabilityPipelineAggregateProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineAggregateProcessor.enabled)
        && Objects.equals(this.id, observabilityPipelineAggregateProcessor.id)
        && Objects.equals(this.include, observabilityPipelineAggregateProcessor.include)
        && Objects.equals(this.intervalSecs, observabilityPipelineAggregateProcessor.intervalSecs)
        && Objects.equals(this.mode, observabilityPipelineAggregateProcessor.mode)
        && Objects.equals(this.type, observabilityPipelineAggregateProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAggregateProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        displayName, enabled, id, include, intervalSecs, mode, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAggregateProcessor {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    intervalSecs: ").append(toIndentedString(intervalSecs)).append("\n");
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
