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
import java.util.UUID;

/** */
@JsonPropertyOrder({
  WorkflowHeadlessExecutionConnection.JSON_PROPERTY_CONNECTION_ID,
  WorkflowHeadlessExecutionConnection.JSON_PROPERTY_LABEL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WorkflowHeadlessExecutionConnection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private UUID connectionId;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public WorkflowHeadlessExecutionConnection() {}

  @JsonCreator
  public WorkflowHeadlessExecutionConnection(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONNECTION_ID) UUID connectionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL) String label) {
    this.connectionId = connectionId;
    this.label = label;
  }

  public WorkflowHeadlessExecutionConnection connectionId(UUID connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * The ID of the connection
   *
   * @return connectionId
   */
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(UUID connectionId) {
    this.connectionId = connectionId;
  }

  public WorkflowHeadlessExecutionConnection label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The label for the connection
   *
   * @return label
   */
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
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
   * @return WorkflowHeadlessExecutionConnection
   */
  @JsonAnySetter
  public WorkflowHeadlessExecutionConnection putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WorkflowHeadlessExecutionConnection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowHeadlessExecutionConnection workflowHeadlessExecutionConnection =
        (WorkflowHeadlessExecutionConnection) o;
    return Objects.equals(this.connectionId, workflowHeadlessExecutionConnection.connectionId)
        && Objects.equals(this.label, workflowHeadlessExecutionConnection.label)
        && Objects.equals(
            this.additionalProperties, workflowHeadlessExecutionConnection.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, label, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowHeadlessExecutionConnection {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
