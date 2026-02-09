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

/** */
@JsonPropertyOrder({
  WorkflowHeadlessExecutionConfig.JSON_PROPERTY_CONNECTIONS,
  WorkflowHeadlessExecutionConfig.JSON_PROPERTY_INPUTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WorkflowHeadlessExecutionConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTIONS = "connections";
  private List<WorkflowHeadlessExecutionConnection> connections = new ArrayList<>();

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private Map<String, Object> inputs = new HashMap<String, Object>();

  public WorkflowHeadlessExecutionConfig() {}

  @JsonCreator
  public WorkflowHeadlessExecutionConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONNECTIONS)
          List<WorkflowHeadlessExecutionConnection> connections,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) Map<String, Object> inputs) {
    this.connections = connections;
    this.inputs = inputs;
  }

  public WorkflowHeadlessExecutionConfig connections(
      List<WorkflowHeadlessExecutionConnection> connections) {
    this.connections = connections;
    for (WorkflowHeadlessExecutionConnection item : connections) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public WorkflowHeadlessExecutionConfig addConnectionsItem(
      WorkflowHeadlessExecutionConnection connectionsItem) {
    this.connections.add(connectionsItem);
    this.unparsed |= connectionsItem.unparsed;
    return this;
  }

  /**
   * List of connections to use for the workflow execution
   *
   * @return connections
   */
  @JsonProperty(JSON_PROPERTY_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<WorkflowHeadlessExecutionConnection> getConnections() {
    return connections;
  }

  public void setConnections(List<WorkflowHeadlessExecutionConnection> connections) {
    this.connections = connections;
  }

  public WorkflowHeadlessExecutionConfig inputs(Map<String, Object> inputs) {
    this.inputs = inputs;
    return this;
  }

  public WorkflowHeadlessExecutionConfig putInputsItem(String key, Object inputsItem) {
    this.inputs.put(key, inputsItem);
    return this;
  }

  /**
   * Input parameters for the workflow execution
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getInputs() {
    return inputs;
  }

  public void setInputs(Map<String, Object> inputs) {
    this.inputs = inputs;
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
   * @return WorkflowHeadlessExecutionConfig
   */
  @JsonAnySetter
  public WorkflowHeadlessExecutionConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WorkflowHeadlessExecutionConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowHeadlessExecutionConfig workflowHeadlessExecutionConfig =
        (WorkflowHeadlessExecutionConfig) o;
    return Objects.equals(this.connections, workflowHeadlessExecutionConfig.connections)
        && Objects.equals(this.inputs, workflowHeadlessExecutionConfig.inputs)
        && Objects.equals(
            this.additionalProperties, workflowHeadlessExecutionConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connections, inputs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowHeadlessExecutionConfig {\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
