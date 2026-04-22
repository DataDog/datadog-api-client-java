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

/**
 * Attributes for creating an org group policy. If <code>policy_type</code> or <code>
 * enforcement_tier</code> are not provided, they default to <code>org_config</code> and <code>
 * DEFAULT</code> respectively.
 */
@JsonPropertyOrder({
  OrgGroupPolicyCreateAttributes.JSON_PROPERTY_CONTENT,
  OrgGroupPolicyCreateAttributes.JSON_PROPERTY_ENFORCEMENT_TIER,
  OrgGroupPolicyCreateAttributes.JSON_PROPERTY_POLICY_NAME,
  OrgGroupPolicyCreateAttributes.JSON_PROPERTY_POLICY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupPolicyCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private Map<String, Object> content = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_ENFORCEMENT_TIER = "enforcement_tier";
  private OrgGroupPolicyEnforcementTier enforcementTier = OrgGroupPolicyEnforcementTier.DEFAULT;

  public static final String JSON_PROPERTY_POLICY_NAME = "policy_name";
  private String policyName;

  public static final String JSON_PROPERTY_POLICY_TYPE = "policy_type";
  private OrgGroupPolicyPolicyType policyType = OrgGroupPolicyPolicyType.ORG_CONFIG;

  public OrgGroupPolicyCreateAttributes() {}

  @JsonCreator
  public OrgGroupPolicyCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) Map<String, Object> content,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_NAME) String policyName) {
    this.content = content;
    this.policyName = policyName;
  }

  public OrgGroupPolicyCreateAttributes content(Map<String, Object> content) {
    this.content = content;
    return this;
  }

  public OrgGroupPolicyCreateAttributes putContentItem(String key, Object contentItem) {
    this.content.put(key, contentItem);
    return this;
  }

  /**
   * The policy content as key-value pairs.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getContent() {
    return content;
  }

  public void setContent(Map<String, Object> content) {
    this.content = content;
  }

  public OrgGroupPolicyCreateAttributes enforcementTier(
      OrgGroupPolicyEnforcementTier enforcementTier) {
    this.enforcementTier = enforcementTier;
    this.unparsed |= !enforcementTier.isValid();
    return this;
  }

  /**
   * The enforcement tier of the policy. <code>DEFAULT</code> means the policy is set but member
   * orgs may mutate it. <code>ENFORCE</code> means the policy is strictly controlled and mutations
   * are blocked for affected orgs. <code>DELEGATE</code> means each member org controls its own
   * value.
   *
   * @return enforcementTier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCEMENT_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrgGroupPolicyEnforcementTier getEnforcementTier() {
    return enforcementTier;
  }

  public void setEnforcementTier(OrgGroupPolicyEnforcementTier enforcementTier) {
    if (!enforcementTier.isValid()) {
      this.unparsed = true;
    }
    this.enforcementTier = enforcementTier;
  }

  public OrgGroupPolicyCreateAttributes policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * The name of the policy.
   *
   * @return policyName
   */
  @JsonProperty(JSON_PROPERTY_POLICY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public OrgGroupPolicyCreateAttributes policyType(OrgGroupPolicyPolicyType policyType) {
    this.policyType = policyType;
    this.unparsed |= !policyType.isValid();
    return this;
  }

  /**
   * The type of the policy. Only <code>org_config</code> is supported, indicating a policy backed
   * by an organization configuration setting.
   *
   * @return policyType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrgGroupPolicyPolicyType getPolicyType() {
    return policyType;
  }

  public void setPolicyType(OrgGroupPolicyPolicyType policyType) {
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
   * @return OrgGroupPolicyCreateAttributes
   */
  @JsonAnySetter
  public OrgGroupPolicyCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgGroupPolicyCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupPolicyCreateAttributes orgGroupPolicyCreateAttributes =
        (OrgGroupPolicyCreateAttributes) o;
    return Objects.equals(this.content, orgGroupPolicyCreateAttributes.content)
        && Objects.equals(this.enforcementTier, orgGroupPolicyCreateAttributes.enforcementTier)
        && Objects.equals(this.policyName, orgGroupPolicyCreateAttributes.policyName)
        && Objects.equals(this.policyType, orgGroupPolicyCreateAttributes.policyType)
        && Objects.equals(
            this.additionalProperties, orgGroupPolicyCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, enforcementTier, policyName, policyType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupPolicyCreateAttributes {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    enforcementTier: ").append(toIndentedString(enforcementTier)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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
