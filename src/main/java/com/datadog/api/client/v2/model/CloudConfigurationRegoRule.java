/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
   * @return CloudConfigurationRegoRule
   */
  @JsonAnySetter
  public CloudConfigurationRegoRule putAdditionalProperty(String key, Object value) {
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
        && Objects.equals(this.resourceTypes, cloudConfigurationRegoRule.resourceTypes)
        && Objects.equals(
            this.additionalProperties, cloudConfigurationRegoRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, resourceTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConfigurationRegoRule {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
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
