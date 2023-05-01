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

/** Policy and policy type for a monitor configuration policy. */
@JsonPropertyOrder({
  MonitorConfigPolicyAttributeCreateRequest.JSON_PROPERTY_POLICY,
  MonitorConfigPolicyAttributeCreateRequest.JSON_PROPERTY_POLICY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorConfigPolicyAttributeCreateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_POLICY = "policy";
  private MonitorConfigPolicyPolicyCreateRequest policy;

  public static final String JSON_PROPERTY_POLICY_TYPE = "policy_type";
  private MonitorConfigPolicyType policyType = MonitorConfigPolicyType.TAG;

  public MonitorConfigPolicyAttributeCreateRequest() {}

  @JsonCreator
  public MonitorConfigPolicyAttributeCreateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY)
          MonitorConfigPolicyPolicyCreateRequest policy,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_TYPE)
          MonitorConfigPolicyType policyType) {
    this.policy = policy;
    this.unparsed |= policy.unparsed;
    this.policyType = policyType;
    this.unparsed |= !policyType.isValid();
  }

  public MonitorConfigPolicyAttributeCreateRequest policy(
      MonitorConfigPolicyPolicyCreateRequest policy) {
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
  public MonitorConfigPolicyPolicyCreateRequest getPolicy() {
    return policy;
  }

  public void setPolicy(MonitorConfigPolicyPolicyCreateRequest policy) {
    this.policy = policy;
  }

  public MonitorConfigPolicyAttributeCreateRequest policyType(MonitorConfigPolicyType policyType) {
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

  /** Return true if this MonitorConfigPolicyAttributeCreateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorConfigPolicyAttributeCreateRequest monitorConfigPolicyAttributeCreateRequest =
        (MonitorConfigPolicyAttributeCreateRequest) o;
    return Objects.equals(this.policy, monitorConfigPolicyAttributeCreateRequest.policy)
        && Objects.equals(this.policyType, monitorConfigPolicyAttributeCreateRequest.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorConfigPolicyAttributeCreateRequest {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
