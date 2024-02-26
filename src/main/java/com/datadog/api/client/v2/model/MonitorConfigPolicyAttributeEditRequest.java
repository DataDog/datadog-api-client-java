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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Policy and policy type for a monitor configuration policy. */
@JsonPropertyOrder({
  MonitorConfigPolicyAttributeEditRequest.JSON_PROPERTY_POLICY,
  MonitorConfigPolicyAttributeEditRequest.JSON_PROPERTY_POLICY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorConfigPolicyAttributeEditRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_POLICY = "policy";
  private MonitorConfigPolicyPolicy policy;

  public static final String JSON_PROPERTY_POLICY_TYPE = "policy_type";
  private MonitorConfigPolicyType policyType = MonitorConfigPolicyType.TAG;

  public MonitorConfigPolicyAttributeEditRequest() {}

  @JsonCreator
  public MonitorConfigPolicyAttributeEditRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY) MonitorConfigPolicyPolicy policy,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_TYPE)
          MonitorConfigPolicyType policyType) {
    this.policy = policy;
    this.unparsed |= policy.unparsed;
    this.policyType = policyType;
    this.unparsed |= !policyType.isValid();
  }

  public MonitorConfigPolicyAttributeEditRequest policy(MonitorConfigPolicyPolicy policy) {
    this.policy = policy;
    this.unparsed |= policy.unparsed;
    return this;
  }

  /**
   * Configuration for the policy.
   *
   * @return policy
   */
  @JsonProperty(JSON_PROPERTY_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorConfigPolicyPolicy getPolicy() {
    return policy;
  }

  public void setPolicy(MonitorConfigPolicyPolicy policy) {
    this.policy = policy;
  }

  public MonitorConfigPolicyAttributeEditRequest policyType(MonitorConfigPolicyType policyType) {
    this.policyType = policyType;
    this.unparsed |= !policyType.isValid();
    return this;
  }

  /**
   * The monitor configuration policy type.
   *
   * @return policyType
   */
  @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorConfigPolicyType getPolicyType() {
    return policyType;
  }

  public void setPolicyType(MonitorConfigPolicyType policyType) {
    if (!policyType.isValid()) {
      this.unparsed = true;
    }
    this.policyType = policyType;
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
   * @return MonitorConfigPolicyAttributeEditRequest
   */
  @JsonAnySetter
  public MonitorConfigPolicyAttributeEditRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonitorConfigPolicyAttributeEditRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorConfigPolicyAttributeEditRequest monitorConfigPolicyAttributeEditRequest =
        (MonitorConfigPolicyAttributeEditRequest) o;
    return Objects.equals(this.policy, monitorConfigPolicyAttributeEditRequest.policy)
        && Objects.equals(this.policyType, monitorConfigPolicyAttributeEditRequest.policyType)
        && Objects.equals(
            this.additionalProperties,
            monitorConfigPolicyAttributeEditRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorConfigPolicyAttributeEditRequest {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
