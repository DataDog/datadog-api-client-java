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
import java.util.Objects;

/** Monitor options for deployment rules. */
@JsonPropertyOrder({
  DeploymentRuleOptionsMonitor.JSON_PROPERTY_DURATION,
  DeploymentRuleOptionsMonitor.JSON_PROPERTY_FAIL_ON_NO_DATA,
  DeploymentRuleOptionsMonitor.JSON_PROPERTY_FAIL_ON_NO_GROUPS_FOUND,
  DeploymentRuleOptionsMonitor.JSON_PROPERTY_QUERY,
  DeploymentRuleOptionsMonitor.JSON_PROPERTY_WARMUP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentRuleOptionsMonitor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_FAIL_ON_NO_DATA = "fail_on_no_data";
  private Boolean failOnNoData = true;

  public static final String JSON_PROPERTY_FAIL_ON_NO_GROUPS_FOUND = "fail_on_no_groups_found";
  private Boolean failOnNoGroupsFound = false;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_WARMUP = "warmup";
  private Long warmup = 0l;

  public DeploymentRuleOptionsMonitor() {}

  @JsonCreator
  public DeploymentRuleOptionsMonitor(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.query = query;
  }

  public DeploymentRuleOptionsMonitor duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Seconds the monitor needs to stay in OK status for the rule to pass.
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

  public DeploymentRuleOptionsMonitor failOnNoData(Boolean failOnNoData) {
    this.failOnNoData = failOnNoData;
    return this;
  }

  /**
   * Whether the rule should fail if a matching monitor group is in a NO DATA state.
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

  public DeploymentRuleOptionsMonitor failOnNoGroupsFound(Boolean failOnNoGroupsFound) {
    this.failOnNoGroupsFound = failOnNoGroupsFound;
    return this;
  }

  /**
   * Whether the rule should fail if no monitor groups are found for the query.
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

  public DeploymentRuleOptionsMonitor query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Monitors that match this query are evaluated.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public DeploymentRuleOptionsMonitor warmup(Long warmup) {
    this.warmup = warmup;
    return this;
  }

  /**
   * Seconds to wait after a deployment starts before evaluating the monitor's status. minimum: 0
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

  /** Return true if this DeploymentRuleOptionsMonitor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentRuleOptionsMonitor deploymentRuleOptionsMonitor = (DeploymentRuleOptionsMonitor) o;
    return Objects.equals(this.duration, deploymentRuleOptionsMonitor.duration)
        && Objects.equals(this.failOnNoData, deploymentRuleOptionsMonitor.failOnNoData)
        && Objects.equals(
            this.failOnNoGroupsFound, deploymentRuleOptionsMonitor.failOnNoGroupsFound)
        && Objects.equals(this.query, deploymentRuleOptionsMonitor.query)
        && Objects.equals(this.warmup, deploymentRuleOptionsMonitor.warmup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, failOnNoData, failOnNoGroupsFound, query, warmup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentRuleOptionsMonitor {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    failOnNoData: ").append(toIndentedString(failOnNoData)).append("\n");
    sb.append("    failOnNoGroupsFound: ")
        .append(toIndentedString(failOnNoGroupsFound))
        .append("\n");
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
