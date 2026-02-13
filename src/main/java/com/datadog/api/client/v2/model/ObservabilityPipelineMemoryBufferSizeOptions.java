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

/** Options for configuring a memory buffer by queue length. */
@JsonPropertyOrder({
  ObservabilityPipelineMemoryBufferSizeOptions.JSON_PROPERTY_MAX_EVENTS,
  ObservabilityPipelineMemoryBufferSizeOptions.JSON_PROPERTY_TYPE,
  ObservabilityPipelineMemoryBufferSizeOptions.JSON_PROPERTY_WHEN_FULL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineMemoryBufferSizeOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX_EVENTS = "max_events";
  private Long maxEvents;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineBufferOptionsMemoryType type =
      ObservabilityPipelineBufferOptionsMemoryType.MEMORY;

  public static final String JSON_PROPERTY_WHEN_FULL = "when_full";
  private ObservabilityPipelineBufferOptionsWhenFull whenFull =
      ObservabilityPipelineBufferOptionsWhenFull.BLOCK;

  public ObservabilityPipelineMemoryBufferSizeOptions() {}

  @JsonCreator
  public ObservabilityPipelineMemoryBufferSizeOptions(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_EVENTS) Long maxEvents) {
    this.maxEvents = maxEvents;
  }

  public ObservabilityPipelineMemoryBufferSizeOptions maxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

  /**
   * Maximum events for the memory buffer.
   *
   * @return maxEvents
   */
  @JsonProperty(JSON_PROPERTY_MAX_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
  }

  public ObservabilityPipelineMemoryBufferSizeOptions type(
      ObservabilityPipelineBufferOptionsMemoryType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the buffer that will be configured, a memory buffer.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineBufferOptionsMemoryType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineBufferOptionsMemoryType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ObservabilityPipelineMemoryBufferSizeOptions whenFull(
      ObservabilityPipelineBufferOptionsWhenFull whenFull) {
    this.whenFull = whenFull;
    this.unparsed |= !whenFull.isValid();
    return this;
  }

  /**
   * Behavior when the buffer is full (block and stop accepting new events, or drop new events)
   *
   * @return whenFull
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WHEN_FULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineBufferOptionsWhenFull getWhenFull() {
    return whenFull;
  }

  public void setWhenFull(ObservabilityPipelineBufferOptionsWhenFull whenFull) {
    if (!whenFull.isValid()) {
      this.unparsed = true;
    }
    this.whenFull = whenFull;
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
   * @return ObservabilityPipelineMemoryBufferSizeOptions
   */
  @JsonAnySetter
  public ObservabilityPipelineMemoryBufferSizeOptions putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ObservabilityPipelineMemoryBufferSizeOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineMemoryBufferSizeOptions observabilityPipelineMemoryBufferSizeOptions =
        (ObservabilityPipelineMemoryBufferSizeOptions) o;
    return Objects.equals(this.maxEvents, observabilityPipelineMemoryBufferSizeOptions.maxEvents)
        && Objects.equals(this.type, observabilityPipelineMemoryBufferSizeOptions.type)
        && Objects.equals(this.whenFull, observabilityPipelineMemoryBufferSizeOptions.whenFull)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineMemoryBufferSizeOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxEvents, type, whenFull, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineMemoryBufferSizeOptions {\n");
    sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    whenFull: ").append(toIndentedString(whenFull)).append("\n");
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
