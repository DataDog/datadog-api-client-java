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

/** Faulty deployment detection options for deployment rules. */
@JsonPropertyOrder({
  DeploymentRuleOptionsFaultyDeploymentDetection.JSON_PROPERTY_EXCLUDED_RESOURCES,
  DeploymentRuleOptionsFaultyDeploymentDetection.JSON_PROPERTY_OPERATION_NAME,
  DeploymentRuleOptionsFaultyDeploymentDetection.JSON_PROPERTY_WAIT_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentRuleOptionsFaultyDeploymentDetection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUDED_RESOURCES = "excluded_resources";
  private List<String> excludedResources = null;

  public static final String JSON_PROPERTY_OPERATION_NAME = "operation_name";
  private String operationName;

  public static final String JSON_PROPERTY_WAIT_TIME = "wait_time";
  private Long waitTime;

  public DeploymentRuleOptionsFaultyDeploymentDetection excludedResources(
      List<String> excludedResources) {
    this.excludedResources = excludedResources;
    return this;
  }

  public DeploymentRuleOptionsFaultyDeploymentDetection addExcludedResourcesItem(
      String excludedResourcesItem) {
    if (this.excludedResources == null) {
      this.excludedResources = new ArrayList<>();
    }
    this.excludedResources.add(excludedResourcesItem);
    return this;
  }

  /**
   * Resources to exclude from faulty deployment detection.
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

  public DeploymentRuleOptionsFaultyDeploymentDetection operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * The operation name for faulty deployment detection.
   *
   * @return operationName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  public DeploymentRuleOptionsFaultyDeploymentDetection waitTime(Long waitTime) {
    this.waitTime = waitTime;
    return this;
  }

  /**
   * The wait time for faulty deployment detection.
   *
   * @return waitTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWaitTime() {
    return waitTime;
  }

  public void setWaitTime(Long waitTime) {
    this.waitTime = waitTime;
  }

  /** Return true if this DeploymentRuleOptionsFaultyDeploymentDetection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentRuleOptionsFaultyDeploymentDetection deploymentRuleOptionsFaultyDeploymentDetection =
        (DeploymentRuleOptionsFaultyDeploymentDetection) o;
    return Objects.equals(
            this.excludedResources,
            deploymentRuleOptionsFaultyDeploymentDetection.excludedResources)
        && Objects.equals(
            this.operationName, deploymentRuleOptionsFaultyDeploymentDetection.operationName)
        && Objects.equals(this.waitTime, deploymentRuleOptionsFaultyDeploymentDetection.waitTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedResources, operationName, waitTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentRuleOptionsFaultyDeploymentDetection {\n");
    sb.append("    excludedResources: ").append(toIndentedString(excludedResources)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
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
