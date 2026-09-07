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

/** A single step in a RUM journey definition. */
@JsonPropertyOrder({DemRumStep.JSON_PROPERTY_NODES, DemRumStep.JSON_PROPERTY_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DemRumStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NODES = "nodes";
  private List<DemRumNode> nodes = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private DemRumStepType type;

  public DemRumStep() {}

  @JsonCreator
  public DemRumStep(
      @JsonProperty(required = true, value = JSON_PROPERTY_NODES) List<DemRumNode> nodes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DemRumStepType type) {
    this.nodes = nodes;
    for (DemRumNode item : nodes) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DemRumStep nodes(List<DemRumNode> nodes) {
    this.nodes = nodes;
    for (DemRumNode item : nodes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DemRumStep addNodesItem(DemRumNode nodesItem) {
    this.nodes.add(nodesItem);
    this.unparsed |= nodesItem.unparsed;
    return this;
  }

  /**
   * List of RUM nodes within a journey step.
   *
   * @return nodes
   */
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DemRumNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<DemRumNode> nodes) {
    this.nodes = nodes;
    if (nodes != null) {
      for (DemRumNode item : nodes) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public DemRumStep type(DemRumStepType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of a RUM journey step.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DemRumStepType getType() {
    return type;
  }

  public void setType(DemRumStepType type) {
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
   * @return DemRumStep
   */
  @JsonAnySetter
  public DemRumStep putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DemRumStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemRumStep demRumStep = (DemRumStep) o;
    return Objects.equals(this.nodes, demRumStep.nodes)
        && Objects.equals(this.type, demRumStep.type)
        && Objects.equals(this.additionalProperties, demRumStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemRumStep {\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
