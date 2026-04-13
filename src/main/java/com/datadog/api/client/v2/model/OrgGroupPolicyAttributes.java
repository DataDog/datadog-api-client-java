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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of an org group policy. */
@JsonPropertyOrder({
  OrgGroupPolicyAttributes.JSON_PROPERTY_CONTENT,
  OrgGroupPolicyAttributes.JSON_PROPERTY_ENFORCED_AT,
  OrgGroupPolicyAttributes.JSON_PROPERTY_MODIFIED_AT,
  OrgGroupPolicyAttributes.JSON_PROPERTY_POLICY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupPolicyAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private Map<String, Object> content = null;

  public static final String JSON_PROPERTY_ENFORCED_AT = "enforced_at";
  private OffsetDateTime enforcedAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_POLICY_NAME = "policy_name";
  private String policyName;

  public OrgGroupPolicyAttributes() {}

  @JsonCreator
  public OrgGroupPolicyAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENFORCED_AT) OffsetDateTime enforcedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_NAME) String policyName) {
    this.enforcedAt = enforcedAt;
    this.modifiedAt = modifiedAt;
    this.policyName = policyName;
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
   * The policy content as key-value pairs.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getContent() {
    return content;
  }

  public void setContent(Map<String, Object> content) {
    this.content = content;
  }

  public OrgGroupPolicyAttributes enforcedAt(OffsetDateTime enforcedAt) {
    this.enforcedAt = enforcedAt;
    return this;
  }

  /**
   * Timestamp when the policy was enforced.
   *
   * @return enforcedAt
   */
  @JsonProperty(JSON_PROPERTY_ENFORCED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getEnforcedAt() {
    return enforcedAt;
  }

  public void setEnforcedAt(OffsetDateTime enforcedAt) {
    this.enforcedAt = enforcedAt;
  }

  public OrgGroupPolicyAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the policy was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  /** Return true if this OrgGroupPolicyAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupPolicyAttributes orgGroupPolicyAttributes = (OrgGroupPolicyAttributes) o;
    return Objects.equals(this.content, orgGroupPolicyAttributes.content)
        && Objects.equals(this.enforcedAt, orgGroupPolicyAttributes.enforcedAt)
        && Objects.equals(this.modifiedAt, orgGroupPolicyAttributes.modifiedAt)
        && Objects.equals(this.policyName, orgGroupPolicyAttributes.policyName)
        && Objects.equals(this.additionalProperties, orgGroupPolicyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, enforcedAt, modifiedAt, policyName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupPolicyAttributes {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    enforcedAt: ").append(toIndentedString(enforcedAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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
