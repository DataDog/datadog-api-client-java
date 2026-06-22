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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** An individual ECS task in a problematic state. */
@JsonPropertyOrder({
  RemediationProblemTask.JSON_PROPERTY_AVAILABILITY_ZONE,
  RemediationProblemTask.JSON_PROPERTY_CONTAINER_INSTANCE_ARN,
  RemediationProblemTask.JSON_PROPERTY_CONTAINERS,
  RemediationProblemTask.JSON_PROPERTY_CPU_UNITS,
  RemediationProblemTask.JSON_PROPERTY_DESIRED_STATUS,
  RemediationProblemTask.JSON_PROPERTY_EXECUTION_ROLE_ARN,
  RemediationProblemTask.JSON_PROPERTY_HEALTH_STATUS,
  RemediationProblemTask.JSON_PROPERTY_ISSUE_START_TIME,
  RemediationProblemTask.JSON_PROPERTY_ISSUE_TYPE,
  RemediationProblemTask.JSON_PROPERTY_LAST_STATUS,
  RemediationProblemTask.JSON_PROPERTY_LAUNCH_TYPE,
  RemediationProblemTask.JSON_PROPERTY_MEMORY_MIB,
  RemediationProblemTask.JSON_PROPERTY_STOP_CODE,
  RemediationProblemTask.JSON_PROPERTY_STOPPED_REASON,
  RemediationProblemTask.JSON_PROPERTY_TAGS,
  RemediationProblemTask.JSON_PROPERTY_TASK_ARN,
  RemediationProblemTask.JSON_PROPERTY_TASK_DEFINITION_ARN,
  RemediationProblemTask.JSON_PROPERTY_TASK_ROLE_ARN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationProblemTask {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVAILABILITY_ZONE = "availability_zone";
  private String availabilityZone;

  public static final String JSON_PROPERTY_CONTAINER_INSTANCE_ARN = "container_instance_arn";
  private String containerInstanceArn;

  public static final String JSON_PROPERTY_CONTAINERS = "containers";
  private List<RemediationProblemContainer> containers = null;

  public static final String JSON_PROPERTY_CPU_UNITS = "cpu_units";
  private String cpuUnits;

  public static final String JSON_PROPERTY_DESIRED_STATUS = "desired_status";
  private String desiredStatus;

  public static final String JSON_PROPERTY_EXECUTION_ROLE_ARN = "execution_role_arn";
  private String executionRoleArn;

  public static final String JSON_PROPERTY_HEALTH_STATUS = "health_status";
  private String healthStatus;

  public static final String JSON_PROPERTY_ISSUE_START_TIME = "issue_start_time";
  private String issueStartTime;

  public static final String JSON_PROPERTY_ISSUE_TYPE = "issue_type";
  private String issueType;

  public static final String JSON_PROPERTY_LAST_STATUS = "last_status";
  private String lastStatus;

  public static final String JSON_PROPERTY_LAUNCH_TYPE = "launch_type";
  private RemediationLaunchType launchType;

  public static final String JSON_PROPERTY_MEMORY_MIB = "memory_mib";
  private String memoryMib;

  public static final String JSON_PROPERTY_STOP_CODE = "stop_code";
  private String stopCode;

  public static final String JSON_PROPERTY_STOPPED_REASON = "stopped_reason";
  private String stoppedReason;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TASK_ARN = "task_arn";
  private String taskArn;

  public static final String JSON_PROPERTY_TASK_DEFINITION_ARN = "task_definition_arn";
  private String taskDefinitionArn;

  public static final String JSON_PROPERTY_TASK_ROLE_ARN = "task_role_arn";
  private String taskRoleArn;

  public RemediationProblemTask availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

  /**
   * Availability zone where the task is running.
   *
   * @return availabilityZone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  public RemediationProblemTask containerInstanceArn(String containerInstanceArn) {
    this.containerInstanceArn = containerInstanceArn;
    return this;
  }

  /**
   * Container instance ARN (EC2 launch type only).
   *
   * @return containerInstanceArn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_INSTANCE_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContainerInstanceArn() {
    return containerInstanceArn;
  }

  public void setContainerInstanceArn(String containerInstanceArn) {
    this.containerInstanceArn = containerInstanceArn;
  }

  public RemediationProblemTask containers(List<RemediationProblemContainer> containers) {
    this.containers = containers;
    for (RemediationProblemContainer item : containers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RemediationProblemTask addContainersItem(RemediationProblemContainer containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    this.unparsed |= containersItem.unparsed;
    return this;
  }

  /**
   * Problematic containers within the task.
   *
   * @return containers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RemediationProblemContainer> getContainers() {
    return containers;
  }

  public void setContainers(List<RemediationProblemContainer> containers) {
    this.containers = containers;
  }

  public RemediationProblemTask cpuUnits(String cpuUnits) {
    this.cpuUnits = cpuUnits;
    return this;
  }

  /**
   * CPU units allocated to the task (64-bit integer encoded as a string).
   *
   * @return cpuUnits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCpuUnits() {
    return cpuUnits;
  }

  public void setCpuUnits(String cpuUnits) {
    this.cpuUnits = cpuUnits;
  }

  public RemediationProblemTask desiredStatus(String desiredStatus) {
    this.desiredStatus = desiredStatus;
    return this;
  }

  /**
   * Desired task status.
   *
   * @return desiredStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIRED_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDesiredStatus() {
    return desiredStatus;
  }

  public void setDesiredStatus(String desiredStatus) {
    this.desiredStatus = desiredStatus;
  }

  public RemediationProblemTask executionRoleArn(String executionRoleArn) {
    this.executionRoleArn = executionRoleArn;
    return this;
  }

  /**
   * IAM role used by ECS to pull images and fetch secrets.
   *
   * @return executionRoleArn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_ROLE_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExecutionRoleArn() {
    return executionRoleArn;
  }

  public void setExecutionRoleArn(String executionRoleArn) {
    this.executionRoleArn = executionRoleArn;
  }

  public RemediationProblemTask healthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }

  /**
   * Task-level health status.
   *
   * @return healthStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEALTH_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHealthStatus() {
    return healthStatus;
  }

  public void setHealthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
  }

  public RemediationProblemTask issueStartTime(String issueStartTime) {
    this.issueStartTime = issueStartTime;
    return this;
  }

  /**
   * When this task's issue started, epoch milliseconds (64-bit integer encoded as a string).
   *
   * @return issueStartTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssueStartTime() {
    return issueStartTime;
  }

  public void setIssueStartTime(String issueStartTime) {
    this.issueStartTime = issueStartTime;
  }

  public RemediationProblemTask issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

  /**
   * Issue type for this specific task.
   *
   * @return issueType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssueType() {
    return issueType;
  }

  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }

  public RemediationProblemTask lastStatus(String lastStatus) {
    this.lastStatus = lastStatus;
    return this;
  }

  /**
   * Current task status.
   *
   * @return lastStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastStatus() {
    return lastStatus;
  }

  public void setLastStatus(String lastStatus) {
    this.lastStatus = lastStatus;
  }

  public RemediationProblemTask launchType(RemediationLaunchType launchType) {
    this.launchType = launchType;
    this.unparsed |= !launchType.isValid();
    return this;
  }

  /**
   * ECS launch type.
   *
   * @return launchType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAUNCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationLaunchType getLaunchType() {
    return launchType;
  }

  public void setLaunchType(RemediationLaunchType launchType) {
    if (!launchType.isValid()) {
      this.unparsed = true;
    }
    this.launchType = launchType;
  }

  public RemediationProblemTask memoryMib(String memoryMib) {
    this.memoryMib = memoryMib;
    return this;
  }

  /**
   * Memory in MiB allocated to the task (64-bit integer encoded as a string).
   *
   * @return memoryMib
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMORY_MIB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMemoryMib() {
    return memoryMib;
  }

  public void setMemoryMib(String memoryMib) {
    this.memoryMib = memoryMib;
  }

  public RemediationProblemTask stopCode(String stopCode) {
    this.stopCode = stopCode;
    return this;
  }

  /**
   * Stop code if the task was stopped.
   *
   * @return stopCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STOP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStopCode() {
    return stopCode;
  }

  public void setStopCode(String stopCode) {
    this.stopCode = stopCode;
  }

  public RemediationProblemTask stoppedReason(String stoppedReason) {
    this.stoppedReason = stoppedReason;
    return this;
  }

  /**
   * Stop reason if the task was stopped.
   *
   * @return stoppedReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STOPPED_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStoppedReason() {
    return stoppedReason;
  }

  public void setStoppedReason(String stoppedReason) {
    this.stoppedReason = stoppedReason;
  }

  public RemediationProblemTask tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RemediationProblemTask addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Task-level tags.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public RemediationProblemTask taskArn(String taskArn) {
    this.taskArn = taskArn;
    return this;
  }

  /**
   * Full task ARN.
   *
   * @return taskArn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTaskArn() {
    return taskArn;
  }

  public void setTaskArn(String taskArn) {
    this.taskArn = taskArn;
  }

  public RemediationProblemTask taskDefinitionArn(String taskDefinitionArn) {
    this.taskDefinitionArn = taskDefinitionArn;
    return this;
  }

  /**
   * Task definition ARN with revision.
   *
   * @return taskDefinitionArn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_DEFINITION_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTaskDefinitionArn() {
    return taskDefinitionArn;
  }

  public void setTaskDefinitionArn(String taskDefinitionArn) {
    this.taskDefinitionArn = taskDefinitionArn;
  }

  public RemediationProblemTask taskRoleArn(String taskRoleArn) {
    this.taskRoleArn = taskRoleArn;
    return this;
  }

  /**
   * IAM role used by the task at runtime.
   *
   * @return taskRoleArn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_ROLE_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTaskRoleArn() {
    return taskRoleArn;
  }

  public void setTaskRoleArn(String taskRoleArn) {
    this.taskRoleArn = taskRoleArn;
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
   * @return RemediationProblemTask
   */
  @JsonAnySetter
  public RemediationProblemTask putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationProblemTask object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationProblemTask remediationProblemTask = (RemediationProblemTask) o;
    return Objects.equals(this.availabilityZone, remediationProblemTask.availabilityZone)
        && Objects.equals(this.containerInstanceArn, remediationProblemTask.containerInstanceArn)
        && Objects.equals(this.containers, remediationProblemTask.containers)
        && Objects.equals(this.cpuUnits, remediationProblemTask.cpuUnits)
        && Objects.equals(this.desiredStatus, remediationProblemTask.desiredStatus)
        && Objects.equals(this.executionRoleArn, remediationProblemTask.executionRoleArn)
        && Objects.equals(this.healthStatus, remediationProblemTask.healthStatus)
        && Objects.equals(this.issueStartTime, remediationProblemTask.issueStartTime)
        && Objects.equals(this.issueType, remediationProblemTask.issueType)
        && Objects.equals(this.lastStatus, remediationProblemTask.lastStatus)
        && Objects.equals(this.launchType, remediationProblemTask.launchType)
        && Objects.equals(this.memoryMib, remediationProblemTask.memoryMib)
        && Objects.equals(this.stopCode, remediationProblemTask.stopCode)
        && Objects.equals(this.stoppedReason, remediationProblemTask.stoppedReason)
        && Objects.equals(this.tags, remediationProblemTask.tags)
        && Objects.equals(this.taskArn, remediationProblemTask.taskArn)
        && Objects.equals(this.taskDefinitionArn, remediationProblemTask.taskDefinitionArn)
        && Objects.equals(this.taskRoleArn, remediationProblemTask.taskRoleArn)
        && Objects.equals(this.additionalProperties, remediationProblemTask.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availabilityZone,
        containerInstanceArn,
        containers,
        cpuUnits,
        desiredStatus,
        executionRoleArn,
        healthStatus,
        issueStartTime,
        issueType,
        lastStatus,
        launchType,
        memoryMib,
        stopCode,
        stoppedReason,
        tags,
        taskArn,
        taskDefinitionArn,
        taskRoleArn,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationProblemTask {\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    containerInstanceArn: ")
        .append(toIndentedString(containerInstanceArn))
        .append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    cpuUnits: ").append(toIndentedString(cpuUnits)).append("\n");
    sb.append("    desiredStatus: ").append(toIndentedString(desiredStatus)).append("\n");
    sb.append("    executionRoleArn: ").append(toIndentedString(executionRoleArn)).append("\n");
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
    sb.append("    issueStartTime: ").append(toIndentedString(issueStartTime)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    launchType: ").append(toIndentedString(launchType)).append("\n");
    sb.append("    memoryMib: ").append(toIndentedString(memoryMib)).append("\n");
    sb.append("    stopCode: ").append(toIndentedString(stopCode)).append("\n");
    sb.append("    stoppedReason: ").append(toIndentedString(stoppedReason)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    taskArn: ").append(toIndentedString(taskArn)).append("\n");
    sb.append("    taskDefinitionArn: ").append(toIndentedString(taskDefinitionArn)).append("\n");
    sb.append("    taskRoleArn: ").append(toIndentedString(taskRoleArn)).append("\n");
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
