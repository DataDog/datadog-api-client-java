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

/** Defines a single VRL remap rule with its own filtering and transformation logic. */
@JsonPropertyOrder({
  ObservabilityPipelineCustomProcessorRemap.JSON_PROPERTY_DROP_ON_ERROR,
  ObservabilityPipelineCustomProcessorRemap.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineCustomProcessorRemap.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineCustomProcessorRemap.JSON_PROPERTY_NAME,
  ObservabilityPipelineCustomProcessorRemap.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineCustomProcessorRemap {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DROP_ON_ERROR = "drop_on_error";
  private Boolean dropOnError;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public ObservabilityPipelineCustomProcessorRemap() {}

  @JsonCreator
  public ObservabilityPipelineCustomProcessorRemap(
      @JsonProperty(required = true, value = JSON_PROPERTY_DROP_ON_ERROR) Boolean dropOnError,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source) {
    this.dropOnError = dropOnError;
    this.include = include;
    this.name = name;
    this.source = source;
  }

  public ObservabilityPipelineCustomProcessorRemap dropOnError(Boolean dropOnError) {
    this.dropOnError = dropOnError;
    return this;
  }

  /**
   * Whether to drop events that caused errors during processing.
   *
   * @return dropOnError
   */
  @JsonProperty(JSON_PROPERTY_DROP_ON_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDropOnError() {
    return dropOnError;
  }

  public void setDropOnError(Boolean dropOnError) {
    this.dropOnError = dropOnError;
  }

  public ObservabilityPipelineCustomProcessorRemap enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this remap rule is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ObservabilityPipelineCustomProcessorRemap include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to filter events for this specific remap rule.
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

  public ObservabilityPipelineCustomProcessorRemap name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A descriptive name for this remap rule.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ObservabilityPipelineCustomProcessorRemap source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The VRL script source code that defines the processing logic.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
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
   * @return ObservabilityPipelineCustomProcessorRemap
   */
  @JsonAnySetter
  public ObservabilityPipelineCustomProcessorRemap putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineCustomProcessorRemap object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineCustomProcessorRemap observabilityPipelineCustomProcessorRemap =
        (ObservabilityPipelineCustomProcessorRemap) o;
    return Objects.equals(this.dropOnError, observabilityPipelineCustomProcessorRemap.dropOnError)
        && Objects.equals(this.enabled, observabilityPipelineCustomProcessorRemap.enabled)
        && Objects.equals(this.include, observabilityPipelineCustomProcessorRemap.include)
        && Objects.equals(this.name, observabilityPipelineCustomProcessorRemap.name)
        && Objects.equals(this.source, observabilityPipelineCustomProcessorRemap.source)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineCustomProcessorRemap.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dropOnError, enabled, include, name, source, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineCustomProcessorRemap {\n");
    sb.append("    dropOnError: ").append(toIndentedString(dropOnError)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
