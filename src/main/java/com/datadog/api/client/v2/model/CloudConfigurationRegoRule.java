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

/** Rule details. */
@JsonPropertyOrder({
  CloudConfigurationRegoRule.JSON_PROPERTY_POLICY,
  CloudConfigurationRegoRule.JSON_PROPERTY_RESOURCE_TYPES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudConfigurationRegoRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_POLICY = "policy";
  private String policy;

  public static final String JSON_PROPERTY_RESOURCE_TYPES = "resourceTypes";
  private List<String> resourceTypes = new ArrayList<>();

  public CloudConfigurationRegoRule() {}

  @JsonCreator
  public CloudConfigurationRegoRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY) String policy,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPES)
          List<String> resourceTypes) {
    this.policy = policy;
    this.resourceTypes = resourceTypes;
  }

  public CloudConfigurationRegoRule policy(String policy) {
    this.policy = policy;
    return this;
  }

  /**
   * The policy written in <code>rego</code>, see:
   * https://www.openpolicyagent.org/docs/latest/policy-language/
   *
   * @return policy
   */
  @JsonProperty(JSON_PROPERTY_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public CloudConfigurationRegoRule resourceTypes(List<String> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public CloudConfigurationRegoRule addResourceTypesItem(String resourceTypesItem) {
    this.resourceTypes.add(resourceTypesItem);
    return this;
  }

  /**
   * List of resource types that will be evaluated upon. Must have at least one element.
   *
   * @return resourceTypes
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getResourceTypes() {
    return resourceTypes;
  }

  public void setResourceTypes(List<String> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }

  /** Return true if this CloudConfigurationRegoRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConfigurationRegoRule cloudConfigurationRegoRule = (CloudConfigurationRegoRule) o;
    return Objects.equals(this.policy, cloudConfigurationRegoRule.policy)
        && Objects.equals(this.resourceTypes, cloudConfigurationRegoRule.resourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, resourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConfigurationRegoRule {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
    sb.append("}");
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
