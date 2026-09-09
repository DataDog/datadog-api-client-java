/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Specific monitor options for deployment rules. */
@JsonPropertyOrder({
  DeploymentRuleOptionsMonitorIds.JSON_PROPERTY_DURATION,
  DeploymentRuleOptionsMonitorIds.JSON_PROPERTY_FAIL_ON_NO_DATA,
  DeploymentRuleOptionsMonitorIds.JSON_PROPERTY_FAIL_ON_NO_GROUPS_FOUND,
  DeploymentRuleOptionsMonitorIds.JSON_PROPERTY_MONITOR_IDS,
  DeploymentRuleOptionsMonitorIds.JSON_PROPERTY_WARMUP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentRuleOptionsMonitorIds {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_FAIL_ON_NO_DATA = "fail_on_no_data";
  private Boolean failOnNoData = true;

  public static final String JSON_PROPERTY_FAIL_ON_NO_GROUPS_FOUND = "fail_on_no_groups_found";
  private Boolean failOnNoGroupsFound = false;

  public static final String JSON_PROPERTY_MONITOR_IDS = "monitor_ids";
  private List<DeploymentRuleOptionsMonitorId> monitorIds = new ArrayList<>();

  public static final String JSON_PROPERTY_WARMUP = "warmup";
  private Long warmup = 0l;

  public DeploymentRuleOptionsMonitorIds() {}

  @JsonCreator
  public DeploymentRuleOptionsMonitorIds(
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITOR_IDS)
          List<DeploymentRuleOptionsMonitorId> monitorIds) {
    this.monitorIds = monitorIds;
    for (DeploymentRuleOptionsMonitorId item : monitorIds) {
      this.unparsed |= item.unparsed;
    }
  }

  public DeploymentRuleOptionsMonitorIds duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Seconds the monitors need to stay in OK status for the rule to pass.
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

  public DeploymentRuleOptionsMonitorIds failOnNoData(Boolean failOnNoData) {
    this.failOnNoData = failOnNoData;
    return this;
  }

  /**
   * Whether the rule should fail if a selected monitor group is in a NO DATA state.
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

  public DeploymentRuleOptionsMonitorIds failOnNoGroupsFound(Boolean failOnNoGroupsFound) {
    this.failOnNoGroupsFound = failOnNoGroupsFound;
    return this;
  }

  /**
   * Whether the rule should fail if no monitor groups are found for the selected monitors.
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

  public DeploymentRuleOptionsMonitorIds monitorIds(
      List<DeploymentRuleOptionsMonitorId> monitorIds) {
    this.monitorIds = monitorIds;
    for (DeploymentRuleOptionsMonitorId item : monitorIds) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DeploymentRuleOptionsMonitorIds addMonitorIdsItem(
      DeploymentRuleOptionsMonitorId monitorIdsItem) {
    this.monitorIds.add(monitorIdsItem);
    this.unparsed |= monitorIdsItem.unparsed;
    return this;
  }

  /**
   * A non-empty list of specific monitors to evaluate.
   *
   * @return monitorIds
   */
  @JsonProperty(JSON_PROPERTY_MONITOR_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DeploymentRuleOptionsMonitorId> getMonitorIds() {
    return monitorIds;
  }

  public void setMonitorIds(List<DeploymentRuleOptionsMonitorId> monitorIds) {
    this.monitorIds = monitorIds;
    if (monitorIds != null) {
      for (DeploymentRuleOptionsMonitorId item : monitorIds) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public DeploymentRuleOptionsMonitorIds warmup(Long warmup) {
    this.warmup = warmup;
    return this;
  }

  /**
   * Seconds to wait after a deployment starts before evaluating the monitors' statuses. minimum: 0
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

  /** Return true if this DeploymentRuleOptionsMonitorIds object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentRuleOptionsMonitorIds deploymentRuleOptionsMonitorIds =
        (DeploymentRuleOptionsMonitorIds) o;
    return Objects.equals(this.duration, deploymentRuleOptionsMonitorIds.duration)
        && Objects.equals(this.failOnNoData, deploymentRuleOptionsMonitorIds.failOnNoData)
        && Objects.equals(
            this.failOnNoGroupsFound, deploymentRuleOptionsMonitorIds.failOnNoGroupsFound)
        && Objects.equals(this.monitorIds, deploymentRuleOptionsMonitorIds.monitorIds)
        && Objects.equals(this.warmup, deploymentRuleOptionsMonitorIds.warmup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, failOnNoData, failOnNoGroupsFound, monitorIds, warmup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentRuleOptionsMonitorIds {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    failOnNoData: ").append(toIndentedString(failOnNoData)).append("\n");
    sb.append("    failOnNoGroupsFound: ")
        .append(toIndentedString(failOnNoGroupsFound))
        .append("\n");
    sb.append("    monitorIds: ").append(toIndentedString(monitorIds)).append("\n");
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
