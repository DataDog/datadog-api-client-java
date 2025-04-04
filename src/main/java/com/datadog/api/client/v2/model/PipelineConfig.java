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

/** Specifies the pipeline's configuration, including its sources, processors, and destinations. */
@JsonPropertyOrder({
  PipelineConfig.JSON_PROPERTY_DESTINATIONS,
  PipelineConfig.JSON_PROPERTY_PROCESSORS,
  PipelineConfig.JSON_PROPERTY_SOURCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PipelineConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATIONS = "destinations";
  private List<PipelineConfigDestination> destinations = new ArrayList<>();

  public static final String JSON_PROPERTY_PROCESSORS = "processors";
  private List<PipelineConfigProcessor> processors = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<PipelineConfigSource> sources = new ArrayList<>();

  public PipelineConfig() {}

  @JsonCreator
  public PipelineConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATIONS)
          List<PipelineConfigDestination> destinations,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROCESSORS)
          List<PipelineConfigProcessor> processors,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES)
          List<PipelineConfigSource> sources) {
    this.destinations = destinations;
    this.processors = processors;
    this.sources = sources;
  }

  public PipelineConfig destinations(List<PipelineConfigDestination> destinations) {
    this.destinations = destinations;
    for (PipelineConfigDestination item : destinations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PipelineConfig addDestinationsItem(PipelineConfigDestination destinationsItem) {
    this.destinations.add(destinationsItem);
    this.unparsed |= destinationsItem.unparsed;
    return this;
  }

  /**
   * A list of destination components where processed logs are sent.
   *
   * @return destinations
   */
  @JsonProperty(JSON_PROPERTY_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<PipelineConfigDestination> getDestinations() {
    return destinations;
  }

  public void setDestinations(List<PipelineConfigDestination> destinations) {
    this.destinations = destinations;
  }

  public PipelineConfig processors(List<PipelineConfigProcessor> processors) {
    this.processors = processors;
    for (PipelineConfigProcessor item : processors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PipelineConfig addProcessorsItem(PipelineConfigProcessor processorsItem) {
    this.processors.add(processorsItem);
    this.unparsed |= processorsItem.unparsed;
    return this;
  }

  /**
   * A list of processors that transform or enrich log data.
   *
   * @return processors
   */
  @JsonProperty(JSON_PROPERTY_PROCESSORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<PipelineConfigProcessor> getProcessors() {
    return processors;
  }

  public void setProcessors(List<PipelineConfigProcessor> processors) {
    this.processors = processors;
  }

  public PipelineConfig sources(List<PipelineConfigSource> sources) {
    this.sources = sources;
    for (PipelineConfigSource item : sources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PipelineConfig addSourcesItem(PipelineConfigSource sourcesItem) {
    this.sources.add(sourcesItem);
    this.unparsed |= sourcesItem.unparsed;
    return this;
  }

  /**
   * A list of configured data sources for the pipeline.
   *
   * @return sources
   */
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<PipelineConfigSource> getSources() {
    return sources;
  }

  public void setSources(List<PipelineConfigSource> sources) {
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
   * @return PipelineConfig
   */
  @JsonAnySetter
  public PipelineConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PipelineConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineConfig pipelineConfig = (PipelineConfig) o;
    return Objects.equals(this.destinations, pipelineConfig.destinations)
        && Objects.equals(this.processors, pipelineConfig.processors)
        && Objects.equals(this.sources, pipelineConfig.sources)
        && Objects.equals(this.additionalProperties, pipelineConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinations, processors, sources, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineConfig {\n");
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
