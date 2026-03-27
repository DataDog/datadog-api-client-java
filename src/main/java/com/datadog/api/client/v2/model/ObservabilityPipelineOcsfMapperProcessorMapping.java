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

/** Defines how specific events are transformed to OCSF using a mapping configuration. */
@JsonPropertyOrder({
  ObservabilityPipelineOcsfMapperProcessorMapping.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineOcsfMapperProcessorMapping.JSON_PROPERTY_MAPPING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineOcsfMapperProcessorMapping {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_MAPPING = "mapping";
  private ObservabilityPipelineOcsfMapperProcessorMappingMapping mapping;

  public ObservabilityPipelineOcsfMapperProcessorMapping() {}

  @JsonCreator
  public ObservabilityPipelineOcsfMapperProcessorMapping(
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAPPING)
          ObservabilityPipelineOcsfMapperProcessorMappingMapping mapping) {
    this.include = include;
    this.mapping = mapping;
    this.unparsed |= mapping.unparsed;
  }

  public ObservabilityPipelineOcsfMapperProcessorMapping include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to select the logs that this mapping should apply to.
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

  public ObservabilityPipelineOcsfMapperProcessorMapping mapping(
      ObservabilityPipelineOcsfMapperProcessorMappingMapping mapping) {
    this.mapping = mapping;
    this.unparsed |= mapping.unparsed;
    return this;
  }

  /**
   * Defines a single mapping rule for transforming logs into the OCSF schema.
   *
   * @return mapping
   */
  @JsonProperty(JSON_PROPERTY_MAPPING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineOcsfMapperProcessorMappingMapping getMapping() {
    return mapping;
  }

  public void setMapping(ObservabilityPipelineOcsfMapperProcessorMappingMapping mapping) {
    this.mapping = mapping;
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
   * @return ObservabilityPipelineOcsfMapperProcessorMapping
   */
  @JsonAnySetter
  public ObservabilityPipelineOcsfMapperProcessorMapping putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineOcsfMapperProcessorMapping object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineOcsfMapperProcessorMapping
        observabilityPipelineOcsfMapperProcessorMapping =
            (ObservabilityPipelineOcsfMapperProcessorMapping) o;
    return Objects.equals(this.include, observabilityPipelineOcsfMapperProcessorMapping.include)
        && Objects.equals(this.mapping, observabilityPipelineOcsfMapperProcessorMapping.mapping)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineOcsfMapperProcessorMapping.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, mapping, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineOcsfMapperProcessorMapping {\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
