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

/** pipeline config */
@JsonPropertyOrder({
  PipelineDataAttributesConfig.JSON_PROPERTY_DESTINATIONS,
  PipelineDataAttributesConfig.JSON_PROPERTY_PROCESSORS,
  PipelineDataAttributesConfig.JSON_PROPERTY_SOURCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PipelineDataAttributesConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATIONS = "destinations";
  private List<Object> destinations = new ArrayList<>();

  public static final String JSON_PROPERTY_PROCESSORS = "processors";
  private List<Object> processors = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<Object> sources = new ArrayList<>();

  public PipelineDataAttributesConfig() {}

  @JsonCreator
  public PipelineDataAttributesConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATIONS) List<Object> destinations,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROCESSORS) List<Object> processors,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<Object> sources) {
    this.destinations = destinations;
    this.processors = processors;
    this.sources = sources;
  }

  public PipelineDataAttributesConfig destinations(List<Object> destinations) {
    this.destinations = destinations;
    for (Object item : destinations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PipelineDataAttributesConfig addDestinationsItem(Object destinationsItem) {
    this.destinations.add(destinationsItem);
    this.unparsed |= destinationsItem.unparsed;
    return this;
  }

  /**
   * The <code>PipelineDataAttributesConfig</code> <code>destinations</code>.
   *
   * @return destinations
   */
  @JsonProperty(JSON_PROPERTY_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Object> getDestinations() {
    return destinations;
  }

  public void setDestinations(List<Object> destinations) {
    this.destinations = destinations;
  }

  public PipelineDataAttributesConfig processors(List<Object> processors) {
    this.processors = processors;
    for (Object item : processors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PipelineDataAttributesConfig addProcessorsItem(Object processorsItem) {
    this.processors.add(processorsItem);
    this.unparsed |= processorsItem.unparsed;
    return this;
  }

  /**
   * The <code>PipelineDataAttributesConfig</code> <code>processors</code>.
   *
   * @return processors
   */
  @JsonProperty(JSON_PROPERTY_PROCESSORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Object> getProcessors() {
    return processors;
  }

  public void setProcessors(List<Object> processors) {
    this.processors = processors;
  }

  public PipelineDataAttributesConfig sources(List<Object> sources) {
    this.sources = sources;
    for (Object item : sources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PipelineDataAttributesConfig addSourcesItem(Object sourcesItem) {
    this.sources.add(sourcesItem);
    this.unparsed |= sourcesItem.unparsed;
    return this;
  }

  /**
   * The <code>PipelineDataAttributesConfig</code> <code>sources</code>.
   *
   * @return sources
   */
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Object> getSources() {
    return sources;
  }

  public void setSources(List<Object> sources) {
    this.sources = sources;
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
   * @return PipelineDataAttributesConfig
   */
  @JsonAnySetter
  public PipelineDataAttributesConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PipelineDataAttributesConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineDataAttributesConfig pipelineDataAttributesConfig = (PipelineDataAttributesConfig) o;
    return Objects.equals(this.destinations, pipelineDataAttributesConfig.destinations)
        && Objects.equals(this.processors, pipelineDataAttributesConfig.processors)
        && Objects.equals(this.sources, pipelineDataAttributesConfig.sources)
        && Objects.equals(
            this.additionalProperties, pipelineDataAttributesConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinations, processors, sources, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineDataAttributesConfig {\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
