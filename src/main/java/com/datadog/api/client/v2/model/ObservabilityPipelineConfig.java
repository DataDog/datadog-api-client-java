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
  ObservabilityPipelineConfig.JSON_PROPERTY_DESTINATIONS,
  ObservabilityPipelineConfig.JSON_PROPERTY_PROCESSOR_GROUPS,
  ObservabilityPipelineConfig.JSON_PROPERTY_SOURCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATIONS = "destinations";
  private List<ObservabilityPipelineConfigDestinationItem> destinations = new ArrayList<>();

  public static final String JSON_PROPERTY_PROCESSOR_GROUPS = "processor_groups";
  private List<ObservabilityPipelineConfigProcessorGroup> processorGroups = null;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<ObservabilityPipelineConfigSourceItem> sources = new ArrayList<>();

  public ObservabilityPipelineConfig() {}

  @JsonCreator
  public ObservabilityPipelineConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATIONS)
          List<ObservabilityPipelineConfigDestinationItem> destinations,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES)
          List<ObservabilityPipelineConfigSourceItem> sources) {
    this.destinations = destinations;
    this.sources = sources;
  }

  public ObservabilityPipelineConfig destinations(
      List<ObservabilityPipelineConfigDestinationItem> destinations) {
    this.destinations = destinations;
    for (ObservabilityPipelineConfigDestinationItem item : destinations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineConfig addDestinationsItem(
      ObservabilityPipelineConfigDestinationItem destinationsItem) {
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
  public List<ObservabilityPipelineConfigDestinationItem> getDestinations() {
    return destinations;
  }

  public void setDestinations(List<ObservabilityPipelineConfigDestinationItem> destinations) {
    this.destinations = destinations;
  }

  public ObservabilityPipelineConfig processorGroups(
      List<ObservabilityPipelineConfigProcessorGroup> processorGroups) {
    this.processorGroups = processorGroups;
    for (ObservabilityPipelineConfigProcessorGroup item : processorGroups) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineConfig addProcessorGroupsItem(
      ObservabilityPipelineConfigProcessorGroup processorGroupsItem) {
    if (this.processorGroups == null) {
      this.processorGroups = new ArrayList<>();
    }
    this.processorGroups.add(processorGroupsItem);
    this.unparsed |= processorGroupsItem.unparsed;
    return this;
  }

  /**
   * A list of processor groups that transform or enrich log data.
   *
   * @return processorGroups
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelineConfigProcessorGroup> getProcessorGroups() {
    return processorGroups;
  }

  public void setProcessorGroups(List<ObservabilityPipelineConfigProcessorGroup> processorGroups) {
    this.processorGroups = processorGroups;
  }

  public ObservabilityPipelineConfig sources(List<ObservabilityPipelineConfigSourceItem> sources) {
    this.sources = sources;
    for (ObservabilityPipelineConfigSourceItem item : sources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineConfig addSourcesItem(
      ObservabilityPipelineConfigSourceItem sourcesItem) {
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
  public List<ObservabilityPipelineConfigSourceItem> getSources() {
    return sources;
  }

  public void setSources(List<ObservabilityPipelineConfigSourceItem> sources) {
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
   * @return ObservabilityPipelineConfig
   */
  @JsonAnySetter
  public ObservabilityPipelineConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineConfig observabilityPipelineConfig = (ObservabilityPipelineConfig) o;
    return Objects.equals(this.destinations, observabilityPipelineConfig.destinations)
        && Objects.equals(this.processorGroups, observabilityPipelineConfig.processorGroups)
        && Objects.equals(this.sources, observabilityPipelineConfig.sources)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinations, processorGroups, sources, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineConfig {\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    processorGroups: ").append(toIndentedString(processorGroups)).append("\n");
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
