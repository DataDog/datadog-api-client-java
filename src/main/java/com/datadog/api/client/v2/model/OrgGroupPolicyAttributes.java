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
   * <p>Attributes of an org group policy.</p>
 */
@JsonPropertyOrder({
  OrgGroupPolicyAttributes.JSON_PROPERTY_CONTENT,
  OrgGroupPolicyAttributes.JSON_PROPERTY_ENFORCEMENT_TIER,
  OrgGroupPolicyAttributes.JSON_PROPERTY_MODIFIED_AT,
  OrgGroupPolicyAttributes.JSON_PROPERTY_POLICY_NAME,
  OrgGroupPolicyAttributes.JSON_PROPERTY_POLICY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupPolicyAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private Map<String, Object> content = null;

  public static final String JSON_PROPERTY_ENFORCEMENT_TIER = "enforcement_tier";
  private OrgGroupPolicyEnforcementTier enforcementTier;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_POLICY_NAME = "policy_name";
  private String policyName;

  public static final String JSON_PROPERTY_POLICY_TYPE = "policy_type";
  private OrgGroupPolicyPolicyType policyType = OrgGroupPolicyPolicyType.ORG_CONFIG;

  public OrgGroupPolicyAttributes() {}

  @JsonCreator
  public OrgGroupPolicyAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENFORCEMENT_TIER)OrgGroupPolicyEnforcementTier enforcementTier,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED_AT)OffsetDateTime modifiedAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_POLICY_NAME)String policyName,
            @JsonProperty(required=true, value=JSON_PROPERTY_POLICY_TYPE)OrgGroupPolicyPolicyType policyType) {
        this.enforcementTier = enforcementTier;
        this.unparsed |= !enforcementTier.isValid();
        this.modifiedAt = modifiedAt;
        this.policyName = policyName;
        this.policyType = policyType;
        this.unparsed |= !policyType.isValid();
  }
  public OrgGroupPolicyAttributes content(Map<String, Object> content) {
    this.content = content;
    return this;
  }
  public OrgGroupPolicyAttributes putContentItem(String key, Object contentItem) {
    if (this.content == null) {
      this.content = new HashMap<>();
    }
    this.content.put(key, contentItem);
    return this;
  }

  /**
   * <p>The policy content as key-value pairs. For <code>org_config</code> policies, an arbitrary key-value map (for example, <code>{"value": "UTC"}</code>). For <code>role</code> policies, a <code>permissions</code> key containing an array of permission UUIDs (for example, <code>{"permissions": ["&lt;uuid&gt;", ...]}</code>).</p>
   * @return content
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONTENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getContent() {
        return content;
      }
  public void setContent(Map<String, Object> content) {
    this.content = content;
  }
  public OrgGroupPolicyAttributes enforcementTier(OrgGroupPolicyEnforcementTier enforcementTier) {
    this.enforcementTier = enforcementTier;
    this.unparsed |= !enforcementTier.isValid();
    return this;
  }

  /**
   * <p>The enforcement tier of the policy. <code>OVERRIDE_ALLOWED</code> means the policy is set but member orgs may mutate it. <code>GROUP_MANAGED</code> means the policy is strictly controlled and mutations are blocked for affected orgs. <code>DELEGATE</code> means each member org controls its own value. <code>role</code> policies only support <code>GROUP_MANAGED</code> and <code>DELEGATE</code> — <code>OVERRIDE_ALLOWED</code> is rejected for this policy type. Transitioning a <code>role</code> policy to <code>DELEGATE</code> (disabling it) is one-way — the policy cannot be transitioned back to <code>GROUP_MANAGED</code> afterward.</p>
   * @return enforcementTier
  **/
      @JsonProperty(JSON_PROPERTY_ENFORCEMENT_TIER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OrgGroupPolicyEnforcementTier getEnforcementTier() {
        return enforcementTier;
      }
  public void setEnforcementTier(OrgGroupPolicyEnforcementTier enforcementTier) {
    if (!enforcementTier.isValid()) {
        this.unparsed = true;
    }
    this.enforcementTier = enforcementTier;
  }
  public OrgGroupPolicyAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Timestamp when the policy was last modified.</p>
   * @return modifiedAt
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public OrgGroupPolicyAttributes policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * <p>The name of the policy. This becomes the name of the resource created across orgs in the group (for example, for <code>role</code> policies, the name of the created role).</p>
   * @return policyName
  **/
      @JsonProperty(JSON_PROPERTY_POLICY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPolicyName() {
        return policyName;
      }
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }
  public OrgGroupPolicyAttributes policyType(OrgGroupPolicyPolicyType policyType) {
    this.policyType = policyType;
    this.unparsed |= !policyType.isValid();
    return this;
  }

  /**
   * <p>The type of the policy. <code>org_config</code> indicates a policy backed by an organization configuration setting. <code>role</code> indicates a policy backed by a Datadog custom role.</p>
   * @return policyType
  **/
      @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return OrgGroupPolicyAttributes
   */
  @JsonAnySetter
  public OrgGroupPolicyAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this OrgGroupPolicyAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupPolicyAttributes orgGroupPolicyAttributes = (OrgGroupPolicyAttributes) o;
    return Objects.equals(this.content, orgGroupPolicyAttributes.content) && Objects.equals(this.enforcementTier, orgGroupPolicyAttributes.enforcementTier) && Objects.equals(this.modifiedAt, orgGroupPolicyAttributes.modifiedAt) && Objects.equals(this.policyName, orgGroupPolicyAttributes.policyName) && Objects.equals(this.policyType, orgGroupPolicyAttributes.policyType) && Objects.equals(this.additionalProperties, orgGroupPolicyAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(content,enforcementTier,modifiedAt,policyName,policyType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupPolicyAttributes {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    enforcementTier: ").append(toIndentedString(enforcementTier)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
