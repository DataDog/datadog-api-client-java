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

/** ECS-specific context for the investigation. */
@JsonPropertyOrder({
  RemediationEcsMetadata.JSON_PROPERTY_ACCOUNT_ID,
  RemediationEcsMetadata.JSON_PROPERTY_CAPACITY_PROVIDERS,
  RemediationEcsMetadata.JSON_PROPERTY_CLUSTER_ARN,
  RemediationEcsMetadata.JSON_PROPERTY_CLUSTER_NAME,
  RemediationEcsMetadata.JSON_PROPERTY_IMPACT_SCORE,
  RemediationEcsMetadata.JSON_PROPERTY_ISSUE_START_TIME,
  RemediationEcsMetadata.JSON_PROPERTY_LAUNCH_TYPE,
  RemediationEcsMetadata.JSON_PROPERTY_REGION,
  RemediationEcsMetadata.JSON_PROPERTY_TASK_ARNS,
  RemediationEcsMetadata.JSON_PROPERTY_TASK_DEFINITION_FAMILY,
  RemediationEcsMetadata.JSON_PROPERTY_TASK_DEFINITION_REVISION,
  RemediationEcsMetadata.JSON_PROPERTY_TASKS,
  RemediationEcsMetadata.JSON_PROPERTY_TOTAL_CPU_UNITS,
  RemediationEcsMetadata.JSON_PROPERTY_TOTAL_MEMORY_MIB,
  RemediationEcsMetadata.JSON_PROPERTY_UPDATE_TIMESTAMP,
  RemediationEcsMetadata.JSON_PROPERTY_WORKLOAD_SUMMARY,
  RemediationEcsMetadata.JSON_PROPERTY_WORKLOAD_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationEcsMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_CAPACITY_PROVIDERS = "capacity_providers";
  private List<String> capacityProviders = null;

  public static final String JSON_PROPERTY_CLUSTER_ARN = "cluster_arn";
  private String clusterArn;

  public static final String JSON_PROPERTY_CLUSTER_NAME = "cluster_name";
  private String clusterName;

  public static final String JSON_PROPERTY_IMPACT_SCORE = "impact_score";
  private String impactScore;

  public static final String JSON_PROPERTY_ISSUE_START_TIME = "issue_start_time";
  private String issueStartTime;

  public static final String JSON_PROPERTY_LAUNCH_TYPE = "launch_type";
  private RemediationLaunchType launchType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TASK_ARNS = "task_arns";
  private List<String> taskArns = null;

  public static final String JSON_PROPERTY_TASK_DEFINITION_FAMILY = "task_definition_family";
  private String taskDefinitionFamily;

  public static final String JSON_PROPERTY_TASK_DEFINITION_REVISION = "task_definition_revision";
  private Long taskDefinitionRevision;

  public static final String JSON_PROPERTY_TASKS = "tasks";
  private List<RemediationProblemTask> tasks = null;

  public static final String JSON_PROPERTY_TOTAL_CPU_UNITS = "total_cpu_units";
  private String totalCpuUnits;

  public static final String JSON_PROPERTY_TOTAL_MEMORY_MIB = "total_memory_mib";
  private String totalMemoryMib;

  public static final String JSON_PROPERTY_UPDATE_TIMESTAMP = "update_timestamp";
  private String updateTimestamp;

  public static final String JSON_PROPERTY_WORKLOAD_SUMMARY = "workload_summary";
  private RemediationWorkloadSummary workloadSummary;

  public static final String JSON_PROPERTY_WORKLOAD_TYPE = "workload_type";
  private RemediationWorkloadType workloadType;

  public RemediationEcsMetadata accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * AWS account ID.
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public RemediationEcsMetadata capacityProviders(List<String> capacityProviders) {
    this.capacityProviders = capacityProviders;
    return this;
  }

  public RemediationEcsMetadata addCapacityProvidersItem(String capacityProvidersItem) {
    if (this.capacityProviders == null) {
      this.capacityProviders = new ArrayList<>();
    }
    this.capacityProviders.add(capacityProvidersItem);
    return this;
  }

  /**
   * Associated capacity providers.
   *
   * @return capacityProviders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPACITY_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCapacityProviders() {
    return capacityProviders;
  }

  public void setCapacityProviders(List<String> capacityProviders) {
    this.capacityProviders = capacityProviders;
  }

  public RemediationEcsMetadata clusterArn(String clusterArn) {
    this.clusterArn = clusterArn;
    return this;
  }

  /**
   * ECS cluster ARN.
   *
   * @return clusterArn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClusterArn() {
    return clusterArn;
  }

  public void setClusterArn(String clusterArn) {
    this.clusterArn = clusterArn;
  }

  public RemediationEcsMetadata clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * ECS cluster name.
   *
   * @return clusterName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public RemediationEcsMetadata impactScore(String impactScore) {
    this.impactScore = impactScore;
    return this;
  }

  /**
   * Computed impact score for ranking (64-bit integer encoded as a string).
   *
   * @return impactScore
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPACT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImpactScore() {
    return impactScore;
  }

  public void setImpactScore(String impactScore) {
    this.impactScore = impactScore;
  }

  public RemediationEcsMetadata issueStartTime(String issueStartTime) {
    this.issueStartTime = issueStartTime;
    return this;
  }

  /**
   * When the issue was first detected, epoch milliseconds (64-bit integer encoded as a string).
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

  public RemediationEcsMetadata launchType(RemediationLaunchType launchType) {
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

  public RemediationEcsMetadata region(String region) {
    this.region = region;
    return this;
  }

  /**
   * AWS region.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public RemediationEcsMetadata taskArns(List<String> taskArns) {
    this.taskArns = taskArns;
    return this;
  }

  public RemediationEcsMetadata addTaskArnsItem(String taskArnsItem) {
    if (this.taskArns == null) {
      this.taskArns = new ArrayList<>();
    }
    this.taskArns.add(taskArnsItem);
    return this;
  }

  /**
   * All affected task ARNs, for filtering.
   *
   * @return taskArns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_ARNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTaskArns() {
    return taskArns;
  }

  public void setTaskArns(List<String> taskArns) {
    this.taskArns = taskArns;
  }

  public RemediationEcsMetadata taskDefinitionFamily(String taskDefinitionFamily) {
    this.taskDefinitionFamily = taskDefinitionFamily;
    return this;
  }

  /**
   * Task definition family name.
   *
   * @return taskDefinitionFamily
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_DEFINITION_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTaskDefinitionFamily() {
    return taskDefinitionFamily;
  }

  public void setTaskDefinitionFamily(String taskDefinitionFamily) {
    this.taskDefinitionFamily = taskDefinitionFamily;
  }

  public RemediationEcsMetadata taskDefinitionRevision(Long taskDefinitionRevision) {
    this.taskDefinitionRevision = taskDefinitionRevision;
    return this;
  }

  /**
   * Current task definition revision.
   *
   * @return taskDefinitionRevision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_DEFINITION_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTaskDefinitionRevision() {
    return taskDefinitionRevision;
  }

  public void setTaskDefinitionRevision(Long taskDefinitionRevision) {
    this.taskDefinitionRevision = taskDefinitionRevision;
  }

  public RemediationEcsMetadata tasks(List<RemediationProblemTask> tasks) {
    this.tasks = tasks;
    for (RemediationProblemTask item : tasks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RemediationEcsMetadata addTasksItem(RemediationProblemTask tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    this.unparsed |= tasksItem.unparsed;
    return this;
  }

  /**
   * Individual tasks exhibiting issues. Capped at 50 most recent.
   *
   * @return tasks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RemediationProblemTask> getTasks() {
    return tasks;
  }

  public void setTasks(List<RemediationProblemTask> tasks) {
    this.tasks = tasks;
  }

  public RemediationEcsMetadata totalCpuUnits(String totalCpuUnits) {
    this.totalCpuUnits = totalCpuUnits;
    return this;
  }

  /**
   * Sum of CPU units across affected tasks (64-bit integer encoded as a string).
   *
   * @return totalCpuUnits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CPU_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTotalCpuUnits() {
    return totalCpuUnits;
  }

  public void setTotalCpuUnits(String totalCpuUnits) {
    this.totalCpuUnits = totalCpuUnits;
  }

  public RemediationEcsMetadata totalMemoryMib(String totalMemoryMib) {
    this.totalMemoryMib = totalMemoryMib;
    return this;
  }

  /**
   * Sum of memory (MiB) across affected tasks (64-bit integer encoded as a string).
   *
   * @return totalMemoryMib
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_MEMORY_MIB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTotalMemoryMib() {
    return totalMemoryMib;
  }

  public void setTotalMemoryMib(String totalMemoryMib) {
    this.totalMemoryMib = totalMemoryMib;
  }

  public RemediationEcsMetadata updateTimestamp(String updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
    return this;
  }

  /**
   * When this metadata was last updated, epoch milliseconds (64-bit integer encoded as a string).
   *
   * @return updateTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdateTimestamp() {
    return updateTimestamp;
  }

  public void setUpdateTimestamp(String updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }

  public RemediationEcsMetadata workloadSummary(RemediationWorkloadSummary workloadSummary) {
    this.workloadSummary = workloadSummary;
    this.unparsed |= workloadSummary.unparsed;
    return this;
  }

  /**
   * Aggregated health across all tasks in a workload (service or daemon).
   *
   * @return workloadSummary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKLOAD_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationWorkloadSummary getWorkloadSummary() {
    return workloadSummary;
  }

  public void setWorkloadSummary(RemediationWorkloadSummary workloadSummary) {
    this.workloadSummary = workloadSummary;
  }

  public RemediationEcsMetadata workloadType(RemediationWorkloadType workloadType) {
    this.workloadType = workloadType;
    this.unparsed |= !workloadType.isValid();
    return this;
  }

  /**
   * The kind of ECS workload that owns the problematic tasks.
   *
   * @return workloadType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationWorkloadType getWorkloadType() {
    return workloadType;
  }

  public void setWorkloadType(RemediationWorkloadType workloadType) {
    if (!workloadType.isValid()) {
      this.unparsed = true;
    }
    this.workloadType = workloadType;
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
   * @return RemediationEcsMetadata
   */
  @JsonAnySetter
  public RemediationEcsMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationEcsMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationEcsMetadata remediationEcsMetadata = (RemediationEcsMetadata) o;
    return Objects.equals(this.accountId, remediationEcsMetadata.accountId)
        && Objects.equals(this.capacityProviders, remediationEcsMetadata.capacityProviders)
        && Objects.equals(this.clusterArn, remediationEcsMetadata.clusterArn)
        && Objects.equals(this.clusterName, remediationEcsMetadata.clusterName)
        && Objects.equals(this.impactScore, remediationEcsMetadata.impactScore)
        && Objects.equals(this.issueStartTime, remediationEcsMetadata.issueStartTime)
        && Objects.equals(this.launchType, remediationEcsMetadata.launchType)
        && Objects.equals(this.region, remediationEcsMetadata.region)
        && Objects.equals(this.taskArns, remediationEcsMetadata.taskArns)
        && Objects.equals(this.taskDefinitionFamily, remediationEcsMetadata.taskDefinitionFamily)
        && Objects.equals(
            this.taskDefinitionRevision, remediationEcsMetadata.taskDefinitionRevision)
        && Objects.equals(this.tasks, remediationEcsMetadata.tasks)
        && Objects.equals(this.totalCpuUnits, remediationEcsMetadata.totalCpuUnits)
        && Objects.equals(this.totalMemoryMib, remediationEcsMetadata.totalMemoryMib)
        && Objects.equals(this.updateTimestamp, remediationEcsMetadata.updateTimestamp)
        && Objects.equals(this.workloadSummary, remediationEcsMetadata.workloadSummary)
        && Objects.equals(this.workloadType, remediationEcsMetadata.workloadType)
        && Objects.equals(this.additionalProperties, remediationEcsMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        capacityProviders,
        clusterArn,
        clusterName,
        impactScore,
        issueStartTime,
        launchType,
        region,
        taskArns,
        taskDefinitionFamily,
        taskDefinitionRevision,
        tasks,
        totalCpuUnits,
        totalMemoryMib,
        updateTimestamp,
        workloadSummary,
        workloadType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationEcsMetadata {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    capacityProviders: ").append(toIndentedString(capacityProviders)).append("\n");
    sb.append("    clusterArn: ").append(toIndentedString(clusterArn)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    impactScore: ").append(toIndentedString(impactScore)).append("\n");
    sb.append("    issueStartTime: ").append(toIndentedString(issueStartTime)).append("\n");
    sb.append("    launchType: ").append(toIndentedString(launchType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    taskArns: ").append(toIndentedString(taskArns)).append("\n");
    sb.append("    taskDefinitionFamily: ")
        .append(toIndentedString(taskDefinitionFamily))
        .append("\n");
    sb.append("    taskDefinitionRevision: ")
        .append(toIndentedString(taskDefinitionRevision))
        .append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    totalCpuUnits: ").append(toIndentedString(totalCpuUnits)).append("\n");
    sb.append("    totalMemoryMib: ").append(toIndentedString(totalMemoryMib)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
    sb.append("    workloadSummary: ").append(toIndentedString(workloadSummary)).append("\n");
    sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
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
