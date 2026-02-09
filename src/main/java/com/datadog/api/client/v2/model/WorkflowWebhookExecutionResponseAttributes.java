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
  WorkflowWebhookExecutionResponseAttributes.JSON_PROPERTY_INSTANCE_ID,
  WorkflowWebhookExecutionResponseAttributes.JSON_PROPERTY_WORKFLOW_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WorkflowWebhookExecutionResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INSTANCE_ID = "instance_id";
  private UUID instanceId;

  public static final String JSON_PROPERTY_WORKFLOW_ID = "workflow_id";
  private UUID workflowId;

  public WorkflowWebhookExecutionResponseAttributes() {}

  @JsonCreator
  public WorkflowWebhookExecutionResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_ID) UUID instanceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_WORKFLOW_ID) UUID workflowId) {
    this.instanceId = instanceId;
    this.workflowId = workflowId;
  }

  public WorkflowWebhookExecutionResponseAttributes instanceId(UUID instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * The ID of the workflow instance that was created
   *
   * @return instanceId
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(UUID instanceId) {
    this.instanceId = instanceId;
  }

  public WorkflowWebhookExecutionResponseAttributes workflowId(UUID workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * The ID of the workflow that was executed
   *
   * @return workflowId
   */
  @JsonProperty(JSON_PROPERTY_WORKFLOW_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(UUID workflowId) {
    this.workflowId = workflowId;
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
   * @return WorkflowWebhookExecutionResponseAttributes
   */
  @JsonAnySetter
  public WorkflowWebhookExecutionResponseAttributes putAdditionalProperty(
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

  /** Return true if this WorkflowWebhookExecutionResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowWebhookExecutionResponseAttributes workflowWebhookExecutionResponseAttributes =
        (WorkflowWebhookExecutionResponseAttributes) o;
    return Objects.equals(this.instanceId, workflowWebhookExecutionResponseAttributes.instanceId)
        && Objects.equals(this.workflowId, workflowWebhookExecutionResponseAttributes.workflowId)
        && Objects.equals(
            this.additionalProperties,
            workflowWebhookExecutionResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, workflowId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowWebhookExecutionResponseAttributes {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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
