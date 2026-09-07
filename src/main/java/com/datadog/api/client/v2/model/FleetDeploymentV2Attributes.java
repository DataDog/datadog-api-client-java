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

/** Attributes of a deployment in the v2 API response. */
@JsonPropertyOrder({
  FleetDeploymentV2Attributes.JSON_PROPERTY_AUTHOR,
  FleetDeploymentV2Attributes.JSON_PROPERTY_CONFIG_OPERATIONS,
  FleetDeploymentV2Attributes.JSON_PROPERTY_DURATION_SECONDS,
  FleetDeploymentV2Attributes.JSON_PROPERTY_ERROR_SUMMARY,
  FleetDeploymentV2Attributes.JSON_PROPERTY_ESTIMATED_FINISHED_AT,
  FleetDeploymentV2Attributes.JSON_PROPERTY_FINISHED_AT,
  FleetDeploymentV2Attributes.JSON_PROPERTY_IS_SCHEDULED,
  FleetDeploymentV2Attributes.JSON_PROPERTY_QUERY,
  FleetDeploymentV2Attributes.JSON_PROPERTY_SCHEDULE_ID,
  FleetDeploymentV2Attributes.JSON_PROPERTY_STARTED_AT,
  FleetDeploymentV2Attributes.JSON_PROPERTY_STATUS,
  FleetDeploymentV2Attributes.JSON_PROPERTY_TARGET_VERSIONS,
  FleetDeploymentV2Attributes.JSON_PROPERTY_TOTAL_HOSTS,
  FleetDeploymentV2Attributes.JSON_PROPERTY_UPDATE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentV2Attributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private String author;

  public static final String JSON_PROPERTY_CONFIG_OPERATIONS = "config_operations";
  private List<FleetDeploymentOperation> configOperations = null;

  public static final String JSON_PROPERTY_DURATION_SECONDS = "duration_seconds";
  private Long durationSeconds;

  public static final String JSON_PROPERTY_ERROR_SUMMARY = "error_summary";
  private String errorSummary;

  public static final String JSON_PROPERTY_ESTIMATED_FINISHED_AT = "estimated_finished_at";
  private Long estimatedFinishedAt;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private Long finishedAt;

  public static final String JSON_PROPERTY_IS_SCHEDULED = "is_scheduled";
  private Boolean isScheduled;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SCHEDULE_ID = "schedule_id";
  private String scheduleId;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private Long startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TARGET_VERSIONS = "target_versions";
  private List<String> targetVersions = null;

  public static final String JSON_PROPERTY_TOTAL_HOSTS = "total_hosts";
  private Long totalHosts;

  public static final String JSON_PROPERTY_UPDATE_TYPE = "update_type";
  private String updateType;

  public FleetDeploymentV2Attributes author(String author) {
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

  public FleetDeploymentV2Attributes configOperations(
      List<FleetDeploymentOperation> configOperations) {
    this.configOperations = configOperations;
    if (configOperations != null) {
      for (FleetDeploymentOperation item : configOperations) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetDeploymentV2Attributes addConfigOperationsItem(
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

  public FleetDeploymentV2Attributes durationSeconds(Long durationSeconds) {
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

  public FleetDeploymentV2Attributes errorSummary(String errorSummary) {
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

  public FleetDeploymentV2Attributes estimatedFinishedAt(Long estimatedFinishedAt) {
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

  public FleetDeploymentV2Attributes finishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Time the deployment finished as a Unix timestamp. Zero if not yet finished.
   *
   * @return finishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
  }

  public FleetDeploymentV2Attributes isScheduled(Boolean isScheduled) {
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

  public FleetDeploymentV2Attributes query(String query) {
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

  public FleetDeploymentV2Attributes scheduleId(String scheduleId) {
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

  public FleetDeploymentV2Attributes startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Time the deployment started as a Unix timestamp. Zero if not yet started.
   *
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Long startedAt) {
    this.startedAt = startedAt;
  }

  public FleetDeploymentV2Attributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Current high-level status of the deployment (for example, "pending", "running", "completed",
   * "failed").
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FleetDeploymentV2Attributes targetVersions(List<String> targetVersions) {
    this.targetVersions = targetVersions;
    return this;
  }

  public FleetDeploymentV2Attributes addTargetVersionsItem(String targetVersionsItem) {
    if (this.targetVersions == null) {
      this.targetVersions = new ArrayList<>();
    }
    this.targetVersions.add(targetVersionsItem);
    return this;
  }

  /**
   * Package versions targeted by this deployment.
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

  public FleetDeploymentV2Attributes totalHosts(Long totalHosts) {
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

  public FleetDeploymentV2Attributes updateType(String updateType) {
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
   * @return FleetDeploymentV2Attributes
   */
  @JsonAnySetter
  public FleetDeploymentV2Attributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetDeploymentV2Attributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentV2Attributes fleetDeploymentV2Attributes = (FleetDeploymentV2Attributes) o;
    return Objects.equals(this.author, fleetDeploymentV2Attributes.author)
        && Objects.equals(this.configOperations, fleetDeploymentV2Attributes.configOperations)
        && Objects.equals(this.durationSeconds, fleetDeploymentV2Attributes.durationSeconds)
        && Objects.equals(this.errorSummary, fleetDeploymentV2Attributes.errorSummary)
        && Objects.equals(this.estimatedFinishedAt, fleetDeploymentV2Attributes.estimatedFinishedAt)
        && Objects.equals(this.finishedAt, fleetDeploymentV2Attributes.finishedAt)
        && Objects.equals(this.isScheduled, fleetDeploymentV2Attributes.isScheduled)
        && Objects.equals(this.query, fleetDeploymentV2Attributes.query)
        && Objects.equals(this.scheduleId, fleetDeploymentV2Attributes.scheduleId)
        && Objects.equals(this.startedAt, fleetDeploymentV2Attributes.startedAt)
        && Objects.equals(this.status, fleetDeploymentV2Attributes.status)
        && Objects.equals(this.targetVersions, fleetDeploymentV2Attributes.targetVersions)
        && Objects.equals(this.totalHosts, fleetDeploymentV2Attributes.totalHosts)
        && Objects.equals(this.updateType, fleetDeploymentV2Attributes.updateType)
        && Objects.equals(
            this.additionalProperties, fleetDeploymentV2Attributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        configOperations,
        durationSeconds,
        errorSummary,
        estimatedFinishedAt,
        finishedAt,
        isScheduled,
        query,
        scheduleId,
        startedAt,
        status,
        targetVersions,
        totalHosts,
        updateType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentV2Attributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    configOperations: ").append(toIndentedString(configOperations)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    errorSummary: ").append(toIndentedString(errorSummary)).append("\n");
    sb.append("    estimatedFinishedAt: ")
        .append(toIndentedString(estimatedFinishedAt))
        .append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    isScheduled: ").append(toIndentedString(isScheduled)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
