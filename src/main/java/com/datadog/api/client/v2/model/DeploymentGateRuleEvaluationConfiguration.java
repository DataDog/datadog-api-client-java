/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Evaluated rule configuration. Fields depend on rule type and unset fields are omitted. Monitor
 * rules can include <code>duration</code>, <code>query</code>, <code>monitor_ids</code>, <code>
 * warmup</code>, <code>fail_on_no_groups_found</code>, and <code>fail_on_no_data</code>. Faulty
 * deployment detection rules can include <code>duration</code>, <code>allowed_resources</code>, and
 * <code>excluded_resources</code>.
 */
@JsonPropertyOrder({
  DeploymentGateRuleEvaluationConfiguration.JSON_PROPERTY_ALLOWED_RESOURCES,
  DeploymentGateRuleEvaluationConfiguration.JSON_PROPERTY_DURATION,
  DeploymentGateRuleEvaluationConfiguration.JSON_PROPERTY_EXCLUDED_RESOURCES,
  DeploymentGateRuleEvaluationConfiguration.JSON_PROPERTY_FAIL_ON_NO_DATA,
  DeploymentGateRuleEvaluationConfiguration.JSON_PROPERTY_FAIL_ON_NO_GROUPS_FOUND,
  DeploymentGateRuleEvaluationConfiguration.JSON_PROPERTY_MONITOR_IDS,
  DeploymentGateRuleEvaluationConfiguration.JSON_PROPERTY_QUERY,
  DeploymentGateRuleEvaluationConfiguration.JSON_PROPERTY_WARMUP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGateRuleEvaluationConfiguration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOWED_RESOURCES = "allowed_resources";
  private List<String> allowedResources = null;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_EXCLUDED_RESOURCES = "excluded_resources";
  private List<String> excludedResources = null;

  public static final String JSON_PROPERTY_FAIL_ON_NO_DATA = "fail_on_no_data";
  private Boolean failOnNoData;

  public static final String JSON_PROPERTY_FAIL_ON_NO_GROUPS_FOUND = "fail_on_no_groups_found";
  private Boolean failOnNoGroupsFound;

  public static final String JSON_PROPERTY_MONITOR_IDS = "monitor_ids";
  private List<String> monitorIds = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_WARMUP = "warmup";
  private Long warmup;

  public DeploymentGateRuleEvaluationConfiguration allowedResources(List<String> allowedResources) {
    this.allowedResources = allowedResources;
    return this;
  }

  public DeploymentGateRuleEvaluationConfiguration addAllowedResourcesItem(
      String allowedResourcesItem) {
    if (this.allowedResources == null) {
      this.allowedResources = new ArrayList<>();
    }
    this.allowedResources.add(allowedResourcesItem);
    return this;
  }

  /**
   * APM resources explicitly allowed by faulty deployment detection.
   *
   * @return allowedResources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAllowedResources() {
    return allowedResources;
  }

  public void setAllowedResources(List<String> allowedResources) {
    this.allowedResources = allowedResources;
  }

  public DeploymentGateRuleEvaluationConfiguration duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Evaluation duration configured for this rule.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public DeploymentGateRuleEvaluationConfiguration excludedResources(
      List<String> excludedResources) {
    this.excludedResources = excludedResources;
    return this;
  }

  public DeploymentGateRuleEvaluationConfiguration addExcludedResourcesItem(
      String excludedResourcesItem) {
    if (this.excludedResources == null) {
      this.excludedResources = new ArrayList<>();
    }
    this.excludedResources.add(excludedResourcesItem);
    return this;
  }

  /**
   * APM resources excluded from faulty deployment detection.
   *
   * @return excludedResources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludedResources() {
    return excludedResources;
  }

  public void setExcludedResources(List<String> excludedResources) {
    this.excludedResources = excludedResources;
  }

  public DeploymentGateRuleEvaluationConfiguration failOnNoData(Boolean failOnNoData) {
    this.failOnNoData = failOnNoData;
    return this;
  }

  /**
   * Whether a monitor rule fails when no data is found.
   *
   * @return failOnNoData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAIL_ON_NO_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFailOnNoData() {
    return failOnNoData;
  }

  public void setFailOnNoData(Boolean failOnNoData) {
    this.failOnNoData = failOnNoData;
  }

  public DeploymentGateRuleEvaluationConfiguration failOnNoGroupsFound(
      Boolean failOnNoGroupsFound) {
    this.failOnNoGroupsFound = failOnNoGroupsFound;
    return this;
  }

  /**
   * Whether a monitor rule fails when no groups are found.
   *
   * @return failOnNoGroupsFound
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAIL_ON_NO_GROUPS_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFailOnNoGroupsFound() {
    return failOnNoGroupsFound;
  }

  public void setFailOnNoGroupsFound(Boolean failOnNoGroupsFound) {
    this.failOnNoGroupsFound = failOnNoGroupsFound;
  }

  public DeploymentGateRuleEvaluationConfiguration monitorIds(List<String> monitorIds) {
    this.monitorIds = monitorIds;
    return this;
  }

  public DeploymentGateRuleEvaluationConfiguration addMonitorIdsItem(String monitorIdsItem) {
    if (this.monitorIds == null) {
      this.monitorIds = new ArrayList<>();
    }
    this.monitorIds.add(monitorIdsItem);
    return this;
  }

  /**
   * Monitor IDs evaluated by a monitor rule.
   *
   * @return monitorIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMonitorIds() {
    return monitorIds;
  }

  public void setMonitorIds(List<String> monitorIds) {
    this.monitorIds = monitorIds;
  }

  public DeploymentGateRuleEvaluationConfiguration query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Monitor query used by a monitor rule.
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

  public DeploymentGateRuleEvaluationConfiguration warmup(Long warmup) {
    this.warmup = warmup;
    return this;
  }

  /**
   * Warm-up duration in seconds for a monitor rule. Omitted when zero.
   *
   * @return warmup
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARMUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWarmup() {
    return warmup;
  }

  public void setWarmup(Long warmup) {
    this.warmup = warmup;
  }

  /** Return true if this DeploymentGateRuleEvaluationConfiguration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGateRuleEvaluationConfiguration deploymentGateRuleEvaluationConfiguration =
        (DeploymentGateRuleEvaluationConfiguration) o;
    return Objects.equals(
            this.allowedResources, deploymentGateRuleEvaluationConfiguration.allowedResources)
        && Objects.equals(this.duration, deploymentGateRuleEvaluationConfiguration.duration)
        && Objects.equals(
            this.excludedResources, deploymentGateRuleEvaluationConfiguration.excludedResources)
        && Objects.equals(this.failOnNoData, deploymentGateRuleEvaluationConfiguration.failOnNoData)
        && Objects.equals(
            this.failOnNoGroupsFound, deploymentGateRuleEvaluationConfiguration.failOnNoGroupsFound)
        && Objects.equals(this.monitorIds, deploymentGateRuleEvaluationConfiguration.monitorIds)
        && Objects.equals(this.query, deploymentGateRuleEvaluationConfiguration.query)
        && Objects.equals(this.warmup, deploymentGateRuleEvaluationConfiguration.warmup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedResources,
        duration,
        excludedResources,
        failOnNoData,
        failOnNoGroupsFound,
        monitorIds,
        query,
        warmup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGateRuleEvaluationConfiguration {\n");
    sb.append("    allowedResources: ").append(toIndentedString(allowedResources)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    excludedResources: ").append(toIndentedString(excludedResources)).append("\n");
    sb.append("    failOnNoData: ").append(toIndentedString(failOnNoData)).append("\n");
    sb.append("    failOnNoGroupsFound: ")
        .append(toIndentedString(failOnNoGroupsFound))
        .append("\n");
    sb.append("    monitorIds: ").append(toIndentedString(monitorIds)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    warmup: ").append(toIndentedString(warmup)).append("\n");
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
