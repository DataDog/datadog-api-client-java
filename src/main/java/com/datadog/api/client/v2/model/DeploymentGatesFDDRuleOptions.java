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
   * <p>Options for a <code>faulty_deployment_detection</code> rule.</p>
 */
@JsonPropertyOrder({
  DeploymentGatesFDDRuleOptions.JSON_PROPERTY_ALLOWED_RESOURCES,
  DeploymentGatesFDDRuleOptions.JSON_PROPERTY_DURATION,
  DeploymentGatesFDDRuleOptions.JSON_PROPERTY_EXCLUDED_RESOURCES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGatesFDDRuleOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOWED_RESOURCES = "allowed_resources";
  private List<String> allowedResources = null;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_EXCLUDED_RESOURCES = "excluded_resources";
  private List<String> excludedResources = null;

  public DeploymentGatesFDDRuleOptions allowedResources(List<String> allowedResources) {
    this.allowedResources = allowedResources;
    return this;
  }
  public DeploymentGatesFDDRuleOptions addAllowedResourcesItem(String allowedResourcesItem) {
    if (this.allowedResources == null) {
      this.allowedResources = new ArrayList<>();
    }
    this.allowedResources.add(allowedResourcesItem);
    return this;
  }

  /**
   * <p>APM resource names to include in analysis. Mutually exclusive with <code>excluded_resources</code>.</p>
   * @return allowedResources
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALLOWED_RESOURCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getAllowedResources() {
        return allowedResources;
      }
  public void setAllowedResources(List<String> allowedResources) {
    this.allowedResources = allowedResources;
  }
  public DeploymentGatesFDDRuleOptions duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * <p>Evaluation window in seconds. Maximum 7200 (2 hours).</p>
   * maximum: 7200
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
  public DeploymentGatesFDDRuleOptions excludedResources(List<String> excludedResources) {
    this.excludedResources = excludedResources;
    return this;
  }
  public DeploymentGatesFDDRuleOptions addExcludedResourcesItem(String excludedResourcesItem) {
    if (this.excludedResources == null) {
      this.excludedResources = new ArrayList<>();
    }
    this.excludedResources.add(excludedResourcesItem);
    return this;
  }

  /**
   * <p>APM resource names to exclude from analysis.</p>
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
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return DeploymentGatesFDDRuleOptions
   */
  @JsonAnySetter
  public DeploymentGatesFDDRuleOptions putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this DeploymentGatesFDDRuleOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGatesFDDRuleOptions deploymentGatesFddRuleOptions = (DeploymentGatesFDDRuleOptions) o;
    return Objects.equals(this.allowedResources, deploymentGatesFddRuleOptions.allowedResources) && Objects.equals(this.duration, deploymentGatesFddRuleOptions.duration) && Objects.equals(this.excludedResources, deploymentGatesFddRuleOptions.excludedResources) && Objects.equals(this.additionalProperties, deploymentGatesFddRuleOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(allowedResources,duration,excludedResources, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGatesFDDRuleOptions {\n");
    sb.append("    allowedResources: ").append(toIndentedString(allowedResources)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    excludedResources: ").append(toIndentedString(excludedResources)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
