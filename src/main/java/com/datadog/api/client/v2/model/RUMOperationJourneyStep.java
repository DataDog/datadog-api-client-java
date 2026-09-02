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
 * A single step of a RUM operation's journey. Matches RUM events either through a list of <code>
 * nodes</code> or through a <code>composite</code> rule; the two are mutually exclusive.
 */
@JsonPropertyOrder({
  RUMOperationJourneyStep.JSON_PROPERTY_COMPOSITE,
  RUMOperationJourneyStep.JSON_PROPERTY_NODES,
  RUMOperationJourneyStep.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMOperationJourneyStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPOSITE = "composite";
  private RUMOperationJourneyCompositeRule composite;

  public static final String JSON_PROPERTY_NODES = "nodes";
  private List<RUMOperationJourneyNode> nodes = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RUMOperationJourneyStepType type;

  public RUMOperationJourneyStep() {}

  @JsonCreator
  public RUMOperationJourneyStep(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) RUMOperationJourneyStepType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public RUMOperationJourneyStep composite(RUMOperationJourneyCompositeRule composite) {
    this.composite = composite;
    this.unparsed |= composite.unparsed;
    return this;
  }

  /**
   * A composite rule combining several predicates. Used as an alternative to <code>nodes</code> on
   * a journey step when several conditions must be matched together, in any order or in a specific
   * order.
   *
   * @return composite
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPOSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMOperationJourneyCompositeRule getComposite() {
    return composite;
  }

  public void setComposite(RUMOperationJourneyCompositeRule composite) {
    this.composite = composite;
    if (composite != null) {
      this.unparsed |= composite.unparsed;
    }
  }

  public RUMOperationJourneyStep nodes(List<RUMOperationJourneyNode> nodes) {
    this.nodes = nodes;
    if (nodes != null) {
      for (RUMOperationJourneyNode item : nodes) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public RUMOperationJourneyStep addNodesItem(RUMOperationJourneyNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    this.unparsed |= nodesItem.unparsed;
    return this;
  }

  /**
   * The list of nodes that can match this step. Mutually exclusive with <code>composite</code>.
   *
   * @return nodes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RUMOperationJourneyNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<RUMOperationJourneyNode> nodes) {
    this.nodes = nodes;
    if (nodes != null) {
      for (RUMOperationJourneyNode item : nodes) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public RUMOperationJourneyStep type(RUMOperationJourneyStepType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of a step within a RUM operation's journey.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RUMOperationJourneyStepType getType() {
    return type;
  }

  public void setType(RUMOperationJourneyStepType type) {
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
   * @return RUMOperationJourneyStep
   */
  @JsonAnySetter
  public RUMOperationJourneyStep putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMOperationJourneyStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMOperationJourneyStep rumOperationJourneyStep = (RUMOperationJourneyStep) o;
    return Objects.equals(this.composite, rumOperationJourneyStep.composite)
        && Objects.equals(this.nodes, rumOperationJourneyStep.nodes)
        && Objects.equals(this.type, rumOperationJourneyStep.type)
        && Objects.equals(this.additionalProperties, rumOperationJourneyStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(composite, nodes, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMOperationJourneyStep {\n");
    sb.append("    composite: ").append(toIndentedString(composite)).append("\n");
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
