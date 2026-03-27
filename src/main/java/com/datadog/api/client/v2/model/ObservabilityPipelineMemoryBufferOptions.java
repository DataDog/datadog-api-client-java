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

/** Options for configuring a memory buffer by byte size. */
@JsonPropertyOrder({
  ObservabilityPipelineMemoryBufferOptions.JSON_PROPERTY_MAX_SIZE,
  ObservabilityPipelineMemoryBufferOptions.JSON_PROPERTY_TYPE,
  ObservabilityPipelineMemoryBufferOptions.JSON_PROPERTY_WHEN_FULL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineMemoryBufferOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX_SIZE = "max_size";
  private Long maxSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineBufferOptionsMemoryType type =
      ObservabilityPipelineBufferOptionsMemoryType.MEMORY;

  public static final String JSON_PROPERTY_WHEN_FULL = "when_full";
  private ObservabilityPipelineBufferOptionsWhenFull whenFull =
      ObservabilityPipelineBufferOptionsWhenFull.BLOCK;

  public ObservabilityPipelineMemoryBufferOptions() {}

  @JsonCreator
  public ObservabilityPipelineMemoryBufferOptions(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_SIZE) Long maxSize) {
    this.maxSize = maxSize;
  }

  public ObservabilityPipelineMemoryBufferOptions maxSize(Long maxSize) {
    this.maxSize = maxSize;
    return this;
  }

  /**
   * Maximum size of the memory buffer.
   *
   * @return maxSize
   */
  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Long maxSize) {
    this.maxSize = maxSize;
  }

  public ObservabilityPipelineMemoryBufferOptions type(
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

  public ObservabilityPipelineMemoryBufferOptions whenFull(
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
   * @return ObservabilityPipelineMemoryBufferOptions
   */
  @JsonAnySetter
  public ObservabilityPipelineMemoryBufferOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineMemoryBufferOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineMemoryBufferOptions observabilityPipelineMemoryBufferOptions =
        (ObservabilityPipelineMemoryBufferOptions) o;
    return Objects.equals(this.maxSize, observabilityPipelineMemoryBufferOptions.maxSize)
        && Objects.equals(this.type, observabilityPipelineMemoryBufferOptions.type)
        && Objects.equals(this.whenFull, observabilityPipelineMemoryBufferOptions.whenFull)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineMemoryBufferOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSize, type, whenFull, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineMemoryBufferOptions {\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
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
