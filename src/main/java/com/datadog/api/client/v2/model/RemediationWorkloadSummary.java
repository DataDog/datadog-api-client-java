/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Aggregated health across all tasks in a workload (service or daemon). */
@JsonPropertyOrder({
  RemediationWorkloadSummary.JSON_PROPERTY_DEPLOYMENT_ROLLOUT_STATE,
  RemediationWorkloadSummary.JSON_PROPERTY_DESIRED_COUNT,
  RemediationWorkloadSummary.JSON_PROPERTY_FAILED_COUNT,
  RemediationWorkloadSummary.JSON_PROPERTY_FAILED_PERCENT,
  RemediationWorkloadSummary.JSON_PROPERTY_PENDING_COUNT,
  RemediationWorkloadSummary.JSON_PROPERTY_PREVIOUS_TASK_DEFINITION,
  RemediationWorkloadSummary.JSON_PROPERTY_RUNNING_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationWorkloadSummary {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEPLOYMENT_ROLLOUT_STATE = "deployment_rollout_state";
  private RemediationDeploymentRolloutState deploymentRolloutState;

  public static final String JSON_PROPERTY_DESIRED_COUNT = "desired_count";
  private String desiredCount;

  public static final String JSON_PROPERTY_FAILED_COUNT = "failed_count";
  private String failedCount;

  public static final String JSON_PROPERTY_FAILED_PERCENT = "failed_percent";
  private String failedPercent;

  public static final String JSON_PROPERTY_PENDING_COUNT = "pending_count";
  private String pendingCount;

  public static final String JSON_PROPERTY_PREVIOUS_TASK_DEFINITION = "previous_task_definition";
  private String previousTaskDefinition;

  public static final String JSON_PROPERTY_RUNNING_COUNT = "running_count";
  private String runningCount;

  public RemediationWorkloadSummary deploymentRolloutState(
      RemediationDeploymentRolloutState deploymentRolloutState) {
    this.deploymentRolloutState = deploymentRolloutState;
    this.unparsed |= !deploymentRolloutState.isValid();
    return this;
  }

  /**
   * ECS deployment state, populated only for deployment failures.
   *
   * @return deploymentRolloutState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ROLLOUT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationDeploymentRolloutState getDeploymentRolloutState() {
    return deploymentRolloutState;
  }

  public void setDeploymentRolloutState(RemediationDeploymentRolloutState deploymentRolloutState) {
    if (!deploymentRolloutState.isValid()) {
      this.unparsed = true;
    }
    this.deploymentRolloutState = deploymentRolloutState;
  }

  public RemediationWorkloadSummary desiredCount(String desiredCount) {
    this.desiredCount = desiredCount;
    return this;
  }

  /**
   * Expected task count (64-bit integer encoded as a string).
   *
   * @return desiredCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIRED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDesiredCount() {
    return desiredCount;
  }

  public void setDesiredCount(String desiredCount) {
    this.desiredCount = desiredCount;
  }

  public RemediationWorkloadSummary failedCount(String failedCount) {
    this.failedCount = failedCount;
    return this;
  }

  /**
   * Tasks in a problematic state (64-bit integer encoded as a string).
   *
   * @return failedCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(String failedCount) {
    this.failedCount = failedCount;
  }

  public RemediationWorkloadSummary failedPercent(String failedPercent) {
    this.failedPercent = failedPercent;
    return this;
  }

  /**
   * Percentage of desired count that is failed (64-bit integer encoded as a string).
   *
   * @return failedPercent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFailedPercent() {
    return failedPercent;
  }

  public void setFailedPercent(String failedPercent) {
    this.failedPercent = failedPercent;
  }

  public RemediationWorkloadSummary pendingCount(String pendingCount) {
    this.pendingCount = pendingCount;
    return this;
  }

  /**
   * Tasks currently pending (64-bit integer encoded as a string).
   *
   * @return pendingCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PENDING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPendingCount() {
    return pendingCount;
  }

  public void setPendingCount(String pendingCount) {
    this.pendingCount = pendingCount;
  }

  public RemediationWorkloadSummary previousTaskDefinition(String previousTaskDefinition) {
    this.previousTaskDefinition = previousTaskDefinition;
    return this;
  }

  /**
   * Previous deployment's task definition, as family:revision or a full task definition ARN. Empty
   * when no rollback target is visible.
   *
   * @return previousTaskDefinition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_TASK_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPreviousTaskDefinition() {
    return previousTaskDefinition;
  }

  public void setPreviousTaskDefinition(String previousTaskDefinition) {
    this.previousTaskDefinition = previousTaskDefinition;
  }

  public RemediationWorkloadSummary runningCount(String runningCount) {
    this.runningCount = runningCount;
    return this;
  }

  /**
   * Tasks currently running (64-bit integer encoded as a string).
   *
   * @return runningCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUNNING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRunningCount() {
    return runningCount;
  }

  public void setRunningCount(String runningCount) {
    this.runningCount = runningCount;
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
   * @return RemediationWorkloadSummary
   */
  @JsonAnySetter
  public RemediationWorkloadSummary putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationWorkloadSummary object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationWorkloadSummary remediationWorkloadSummary = (RemediationWorkloadSummary) o;
    return Objects.equals(
            this.deploymentRolloutState, remediationWorkloadSummary.deploymentRolloutState)
        && Objects.equals(this.desiredCount, remediationWorkloadSummary.desiredCount)
        && Objects.equals(this.failedCount, remediationWorkloadSummary.failedCount)
        && Objects.equals(this.failedPercent, remediationWorkloadSummary.failedPercent)
        && Objects.equals(this.pendingCount, remediationWorkloadSummary.pendingCount)
        && Objects.equals(
            this.previousTaskDefinition, remediationWorkloadSummary.previousTaskDefinition)
        && Objects.equals(this.runningCount, remediationWorkloadSummary.runningCount)
        && Objects.equals(
            this.additionalProperties, remediationWorkloadSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deploymentRolloutState,
        desiredCount,
        failedCount,
        failedPercent,
        pendingCount,
        previousTaskDefinition,
        runningCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationWorkloadSummary {\n");
    sb.append("    deploymentRolloutState: ")
        .append(toIndentedString(deploymentRolloutState))
        .append("\n");
    sb.append("    desiredCount: ").append(toIndentedString(desiredCount)).append("\n");
    sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
    sb.append("    failedPercent: ").append(toIndentedString(failedPercent)).append("\n");
    sb.append("    pendingCount: ").append(toIndentedString(pendingCount)).append("\n");
    sb.append("    previousTaskDefinition: ")
        .append(toIndentedString(previousTaskDefinition))
        .append("\n");
    sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
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
