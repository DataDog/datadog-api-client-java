/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Faulty deployment detection options for deployment rules.</p>
 */
@JsonPropertyOrder({
  DeploymentRuleOptionsFaultyDeploymentDetection.JSON_PROPERTY_DURATION,
  DeploymentRuleOptionsFaultyDeploymentDetection.JSON_PROPERTY_EXCLUDED_RESOURCES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentRuleOptionsFaultyDeploymentDetection {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_EXCLUDED_RESOURCES = "excluded_resources";
  private List<String> excludedResources = null;

  public DeploymentRuleOptionsFaultyDeploymentDetection duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * <p>The duration for faulty deployment detection.</p>
   * @return duration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getDuration() {
        return duration;
      }
  public void setDuration(Long duration) {
    this.duration = duration;
  }
  public DeploymentRuleOptionsFaultyDeploymentDetection excludedResources(List<String> excludedResources) {
    this.excludedResources = excludedResources;
    return this;
  }
  public DeploymentRuleOptionsFaultyDeploymentDetection addExcludedResourcesItem(String excludedResourcesItem) {
    if (this.excludedResources == null) {
      this.excludedResources = new ArrayList<>();
    }
    this.excludedResources.add(excludedResourcesItem);
    return this;
  }

  /**
   * <p>Resources to exclude from faulty deployment detection.</p>
   * @return excludedResources
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXCLUDED_RESOURCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getExcludedResources() {
        return excludedResources;
      }
  public void setExcludedResources(List<String> excludedResources) {
    this.excludedResources = excludedResources;
  }

  /**
   * Return true if this DeploymentRuleOptionsFaultyDeploymentDetection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentRuleOptionsFaultyDeploymentDetection deploymentRuleOptionsFaultyDeploymentDetection = (DeploymentRuleOptionsFaultyDeploymentDetection) o;
    return Objects.equals(this.duration, deploymentRuleOptionsFaultyDeploymentDetection.duration) && Objects.equals(this.excludedResources, deploymentRuleOptionsFaultyDeploymentDetection.excludedResources);
  }


  @Override
  public int hashCode() {
    return Objects.hash(duration,excludedResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentRuleOptionsFaultyDeploymentDetection {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    excludedResources: ").append(toIndentedString(excludedResources)).append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
