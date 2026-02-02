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
import java.util.UUID;

/** Attributes of a policy evaluation result. */
@JsonPropertyOrder({
  PolicyResultAttributesResponse.JSON_PROPERTY_ACTIVE,
  PolicyResultAttributesResponse.JSON_PROPERTY_PAYLOAD,
  PolicyResultAttributesResponse.JSON_PROPERTY_POLICY_TYPE,
  PolicyResultAttributesResponse.JSON_PROPERTY_REFERENCE_ORG_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PolicyResultAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private Object payload;

  public static final String JSON_PROPERTY_POLICY_TYPE = "policy_type";
  private String policyType;

  public static final String JSON_PROPERTY_REFERENCE_ORG_UUID = "reference_org_uuid";
  private UUID referenceOrgUuid;

  public PolicyResultAttributesResponse() {}

  @JsonCreator
  public PolicyResultAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTIVE) Boolean active,
      @JsonProperty(required = true, value = JSON_PROPERTY_PAYLOAD) Object payload,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_TYPE) String policyType,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFERENCE_ORG_UUID)
          UUID referenceOrgUuid) {
    this.active = active;
    this.payload = payload;
    this.policyType = policyType;
    this.referenceOrgUuid = referenceOrgUuid;
  }

  public PolicyResultAttributesResponse active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Whether the policy is active.
   *
   * @return active
   */
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public PolicyResultAttributesResponse payload(Object payload) {
    this.payload = payload;
    return this;
  }

  /**
   * The policy configuration payload.
   *
   * @return payload
   */
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Object getPayload() {
    return payload;
  }

  public void setPayload(Object payload) {
    this.payload = payload;
  }

  public PolicyResultAttributesResponse policyType(String policyType) {
    this.policyType = policyType;
    return this;
  }

  /**
   * The type of policy being evaluated.
   *
   * @return policyType
   */
  @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPolicyType() {
    return policyType;
  }

  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }

  public PolicyResultAttributesResponse referenceOrgUuid(UUID referenceOrgUuid) {
    this.referenceOrgUuid = referenceOrgUuid;
    return this;
  }

  /**
   * The organization UUID reference.
   *
   * @return referenceOrgUuid
   */
  @JsonProperty(JSON_PROPERTY_REFERENCE_ORG_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getReferenceOrgUuid() {
    return referenceOrgUuid;
  }

  public void setReferenceOrgUuid(UUID referenceOrgUuid) {
    this.referenceOrgUuid = referenceOrgUuid;
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
   * @return PolicyResultAttributesResponse
   */
  @JsonAnySetter
  public PolicyResultAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PolicyResultAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyResultAttributesResponse policyResultAttributesResponse =
        (PolicyResultAttributesResponse) o;
    return Objects.equals(this.active, policyResultAttributesResponse.active)
        && Objects.equals(this.payload, policyResultAttributesResponse.payload)
        && Objects.equals(this.policyType, policyResultAttributesResponse.policyType)
        && Objects.equals(this.referenceOrgUuid, policyResultAttributesResponse.referenceOrgUuid)
        && Objects.equals(
            this.additionalProperties, policyResultAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, payload, policyType, referenceOrgUuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyResultAttributesResponse {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    referenceOrgUuid: ").append(toIndentedString(referenceOrgUuid)).append("\n");
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
