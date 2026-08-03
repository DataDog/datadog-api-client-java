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

/** Attributes of a deployment detail response. */
@JsonPropertyOrder({
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_AUTHOR,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_CANCELED_HOSTS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_CONFIG_OPERATIONS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_DURATION_SECONDS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_ERROR_SUMMARY,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_ESTIMATED_FINISHED_AT,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_FAILED_HOSTS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_HIGH_LEVEL_STATUS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_HOSTS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_IS_SCHEDULED,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_QUERY,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_RUNNING_HOSTS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_SCHEDULE_ID,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_SKIPPED_HOSTS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_SUCCEEDED_HOSTS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_TARGET_VERSIONS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_TOTAL_HOSTS,
  FleetDeploymentV2DetailAttributes.JSON_PROPERTY_UPDATE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentV2DetailAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private String author;

  public static final String JSON_PROPERTY_CANCELED_HOSTS = "canceled_hosts";
  private Long canceledHosts;

  public static final String JSON_PROPERTY_CONFIG_OPERATIONS = "config_operations";
  private List<FleetDeploymentOperation> configOperations = null;

  public static final String JSON_PROPERTY_DURATION_SECONDS = "duration_seconds";
  private Long durationSeconds;

  public static final String JSON_PROPERTY_ERROR_SUMMARY = "error_summary";
  private String errorSummary;

  public static final String JSON_PROPERTY_ESTIMATED_FINISHED_AT = "estimated_finished_at";
  private Long estimatedFinishedAt;

  public static final String JSON_PROPERTY_FAILED_HOSTS = "failed_hosts";
  private Long failedHosts;

  public static final String JSON_PROPERTY_HIGH_LEVEL_STATUS = "high_level_status";
  private String highLevelStatus;

  public static final String JSON_PROPERTY_HOSTS = "hosts";
  private List<FleetDeploymentV2DetailAgent> hosts = null;

  public static final String JSON_PROPERTY_IS_SCHEDULED = "is_scheduled";
  private Boolean isScheduled;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RUNNING_HOSTS = "running_hosts";
  private Long runningHosts;

  public static final String JSON_PROPERTY_SCHEDULE_ID = "schedule_id";
  private String scheduleId;

  public static final String JSON_PROPERTY_SKIPPED_HOSTS = "skipped_hosts";
  private Long skippedHosts;

  public static final String JSON_PROPERTY_SUCCEEDED_HOSTS = "succeeded_hosts";
  private Long succeededHosts;

  public static final String JSON_PROPERTY_TARGET_VERSIONS = "target_versions";
  private List<String> targetVersions = null;

  public static final String JSON_PROPERTY_TOTAL_HOSTS = "total_hosts";
  private Long totalHosts;

  public static final String JSON_PROPERTY_UPDATE_TYPE = "update_type";
  private String updateType;

  public FleetDeploymentV2DetailAttributes author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Handle of the user who triggered the deployment.
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public FleetDeploymentV2DetailAttributes canceledHosts(Long canceledHosts) {
    this.canceledHosts = canceledHosts;
    return this;
  }

  /**
   * Number of hosts on which the deployment was canceled. minimum: 0
   *
   * @return canceledHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCELED_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCanceledHosts() {
    return canceledHosts;
  }

  public void setCanceledHosts(Long canceledHosts) {
    this.canceledHosts = canceledHosts;
  }

  public FleetDeploymentV2DetailAttributes configOperations(
      List<FleetDeploymentOperation> configOperations) {
    this.configOperations = configOperations;
    if (configOperations != null) {
      for (FleetDeploymentOperation item : configOperations) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetDeploymentV2DetailAttributes addConfigOperationsItem(
      FleetDeploymentOperation configOperationsItem) {
    if (this.configOperations == null) {
      this.configOperations = new ArrayList<>();
    }
    this.configOperations.add(configOperationsItem);
    this.unparsed |= configOperationsItem.unparsed;
    return this;
  }

  /**
   * Ordered list of configuration file operations applied by this deployment. Absent for package
   * deployments, which have no configuration file operations.
   *
   * @return configOperations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetDeploymentOperation> getConfigOperations() {
    return configOperations;
  }

  public void setConfigOperations(List<FleetDeploymentOperation> configOperations) {
    this.configOperations = configOperations;
    if (configOperations != null) {
      for (FleetDeploymentOperation item : configOperations) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FleetDeploymentV2DetailAttributes durationSeconds(Long durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * Duration of the deployment in seconds, computed as <code>finished_at - started_at</code>. Zero
   * if the deployment has not finished.
   *
   * @return durationSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Long durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public FleetDeploymentV2DetailAttributes errorSummary(String errorSummary) {
    this.errorSummary = errorSummary;
    return this;
  }

  /**
   * Top-level error message for the deployment. Populated only when the deployment has failed.
   *
   * @return errorSummary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorSummary() {
    return errorSummary;
  }

  public void setErrorSummary(String errorSummary) {
    this.errorSummary = errorSummary;
  }

  public FleetDeploymentV2DetailAttributes estimatedFinishedAt(Long estimatedFinishedAt) {
    this.estimatedFinishedAt = estimatedFinishedAt;
    return this;
  }

  /**
   * Estimated completion time of the deployment as a Unix timestamp. Zero if not available.
   *
   * @return estimatedFinishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEstimatedFinishedAt() {
    return estimatedFinishedAt;
  }

  public void setEstimatedFinishedAt(Long estimatedFinishedAt) {
    this.estimatedFinishedAt = estimatedFinishedAt;
  }

  public FleetDeploymentV2DetailAttributes failedHosts(Long failedHosts) {
    this.failedHosts = failedHosts;
    return this;
  }

  /**
   * Number of hosts on which the deployment failed. minimum: 0
   *
   * @return failedHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFailedHosts() {
    return failedHosts;
  }

  public void setFailedHosts(Long failedHosts) {
    this.failedHosts = failedHosts;
  }

  public FleetDeploymentV2DetailAttributes highLevelStatus(String highLevelStatus) {
    this.highLevelStatus = highLevelStatus;
    return this;
  }

  /**
   * Current high-level status of the deployment (for example, "pending", "running", "completed",
   * "failed").
   *
   * @return highLevelStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGH_LEVEL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHighLevelStatus() {
    return highLevelStatus;
  }

  public void setHighLevelStatus(String highLevelStatus) {
    this.highLevelStatus = highLevelStatus;
  }

  public FleetDeploymentV2DetailAttributes hosts(List<FleetDeploymentV2DetailAgent> hosts) {
    this.hosts = hosts;
    if (hosts != null) {
      for (FleetDeploymentV2DetailAgent item : hosts) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetDeploymentV2DetailAttributes addHostsItem(FleetDeploymentV2DetailAgent hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    this.unparsed |= hostsItem.unparsed;
    return this;
  }

  /**
   * Per-host status list for this deployment.
   *
   * @return hosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetDeploymentV2DetailAgent> getHosts() {
    return hosts;
  }

  public void setHosts(List<FleetDeploymentV2DetailAgent> hosts) {
    this.hosts = hosts;
    if (hosts != null) {
      for (FleetDeploymentV2DetailAgent item : hosts) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FleetDeploymentV2DetailAttributes isScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
    return this;
  }

  /**
   * Whether this deployment was triggered by a schedule (<code>schedule_id</code> is non-empty).
   *
   * @return isScheduled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SCHEDULED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsScheduled() {
    return isScheduled;
  }

  public void setIsScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }

  public FleetDeploymentV2DetailAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query used to filter and select target hosts for the deployment.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public FleetDeploymentV2DetailAttributes runningHosts(Long runningHosts) {
    this.runningHosts = runningHosts;
    return this;
  }

  /**
   * Number of hosts on which the deployment is currently running. minimum: 0
   *
   * @return runningHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUNNING_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRunningHosts() {
    return runningHosts;
  }

  public void setRunningHosts(Long runningHosts) {
    this.runningHosts = runningHosts;
  }

  public FleetDeploymentV2DetailAttributes scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * Identifier of the schedule that triggered this deployment. Empty if triggered manually.
   *
   * @return scheduleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public FleetDeploymentV2DetailAttributes skippedHosts(Long skippedHosts) {
    this.skippedHosts = skippedHosts;
    return this;
  }

  /**
   * Number of hosts that were skipped during the deployment. minimum: 0
   *
   * @return skippedHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKIPPED_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSkippedHosts() {
    return skippedHosts;
  }

  public void setSkippedHosts(Long skippedHosts) {
    this.skippedHosts = skippedHosts;
  }

  public FleetDeploymentV2DetailAttributes succeededHosts(Long succeededHosts) {
    this.succeededHosts = succeededHosts;
    return this;
  }

  /**
   * Number of hosts on which the deployment succeeded. minimum: 0
   *
   * @return succeededHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCEEDED_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSucceededHosts() {
    return succeededHosts;
  }

  public void setSucceededHosts(Long succeededHosts) {
    this.succeededHosts = succeededHosts;
  }

  public FleetDeploymentV2DetailAttributes targetVersions(List<String> targetVersions) {
    this.targetVersions = targetVersions;
    return this;
  }

  public FleetDeploymentV2DetailAttributes addTargetVersionsItem(String targetVersionsItem) {
    if (this.targetVersions == null) {
      this.targetVersions = new ArrayList<>();
    }
    this.targetVersions.add(targetVersionsItem);
    return this;
  }

  /**
   * Distinct package versions targeted by this deployment, in first-seen order.
   *
   * @return targetVersions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTargetVersions() {
    return targetVersions;
  }

  public void setTargetVersions(List<String> targetVersions) {
    this.targetVersions = targetVersions;
  }

  public FleetDeploymentV2DetailAttributes totalHosts(Long totalHosts) {
    this.totalHosts = totalHosts;
    return this;
  }

  /**
   * Total number of hosts targeted by this deployment.
   *
   * @return totalHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalHosts() {
    return totalHosts;
  }

  public void setTotalHosts(Long totalHosts) {
    this.totalHosts = totalHosts;
  }

  public FleetDeploymentV2DetailAttributes updateType(String updateType) {
    this.updateType = updateType;
    return this;
  }

  /**
   * Type of update operation performed by this deployment (for example, "update_config_operations",
   * "update_package").
   *
   * @return updateType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
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
   * @return FleetDeploymentV2DetailAttributes
   */
  @JsonAnySetter
  public FleetDeploymentV2DetailAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetDeploymentV2DetailAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentV2DetailAttributes fleetDeploymentV2DetailAttributes =
        (FleetDeploymentV2DetailAttributes) o;
    return Objects.equals(this.author, fleetDeploymentV2DetailAttributes.author)
        && Objects.equals(this.canceledHosts, fleetDeploymentV2DetailAttributes.canceledHosts)
        && Objects.equals(this.configOperations, fleetDeploymentV2DetailAttributes.configOperations)
        && Objects.equals(this.durationSeconds, fleetDeploymentV2DetailAttributes.durationSeconds)
        && Objects.equals(this.errorSummary, fleetDeploymentV2DetailAttributes.errorSummary)
        && Objects.equals(
            this.estimatedFinishedAt, fleetDeploymentV2DetailAttributes.estimatedFinishedAt)
        && Objects.equals(this.failedHosts, fleetDeploymentV2DetailAttributes.failedHosts)
        && Objects.equals(this.highLevelStatus, fleetDeploymentV2DetailAttributes.highLevelStatus)
        && Objects.equals(this.hosts, fleetDeploymentV2DetailAttributes.hosts)
        && Objects.equals(this.isScheduled, fleetDeploymentV2DetailAttributes.isScheduled)
        && Objects.equals(this.query, fleetDeploymentV2DetailAttributes.query)
        && Objects.equals(this.runningHosts, fleetDeploymentV2DetailAttributes.runningHosts)
        && Objects.equals(this.scheduleId, fleetDeploymentV2DetailAttributes.scheduleId)
        && Objects.equals(this.skippedHosts, fleetDeploymentV2DetailAttributes.skippedHosts)
        && Objects.equals(this.succeededHosts, fleetDeploymentV2DetailAttributes.succeededHosts)
        && Objects.equals(this.targetVersions, fleetDeploymentV2DetailAttributes.targetVersions)
        && Objects.equals(this.totalHosts, fleetDeploymentV2DetailAttributes.totalHosts)
        && Objects.equals(this.updateType, fleetDeploymentV2DetailAttributes.updateType)
        && Objects.equals(
            this.additionalProperties, fleetDeploymentV2DetailAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        canceledHosts,
        configOperations,
        durationSeconds,
        errorSummary,
        estimatedFinishedAt,
        failedHosts,
        highLevelStatus,
        hosts,
        isScheduled,
        query,
        runningHosts,
        scheduleId,
        skippedHosts,
        succeededHosts,
        targetVersions,
        totalHosts,
        updateType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentV2DetailAttributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    canceledHosts: ").append(toIndentedString(canceledHosts)).append("\n");
    sb.append("    configOperations: ").append(toIndentedString(configOperations)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    errorSummary: ").append(toIndentedString(errorSummary)).append("\n");
    sb.append("    estimatedFinishedAt: ")
        .append(toIndentedString(estimatedFinishedAt))
        .append("\n");
    sb.append("    failedHosts: ").append(toIndentedString(failedHosts)).append("\n");
    sb.append("    highLevelStatus: ").append(toIndentedString(highLevelStatus)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    isScheduled: ").append(toIndentedString(isScheduled)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    runningHosts: ").append(toIndentedString(runningHosts)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    skippedHosts: ").append(toIndentedString(skippedHosts)).append("\n");
    sb.append("    succeededHosts: ").append(toIndentedString(succeededHosts)).append("\n");
    sb.append("    targetVersions: ").append(toIndentedString(targetVersions)).append("\n");
    sb.append("    totalHosts: ").append(toIndentedString(totalHosts)).append("\n");
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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
