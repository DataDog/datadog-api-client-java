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

/** Attributes of an org group policy suggestion. */
@JsonPropertyOrder({
  OrgGroupPolicySuggestionAttributes.JSON_PROPERTY_CONSENSUS_RATIO,
  OrgGroupPolicySuggestionAttributes.JSON_PROPERTY_POLICY_NAME,
  OrgGroupPolicySuggestionAttributes.JSON_PROPERTY_RECOMMENDED_VALUE,
  OrgGroupPolicySuggestionAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupPolicySuggestionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONSENSUS_RATIO = "consensus_ratio";
  private Double consensusRatio;

  public static final String JSON_PROPERTY_POLICY_NAME = "policy_name";
  private String policyName;

  public static final String JSON_PROPERTY_RECOMMENDED_VALUE = "recommended_value";
  private Object recommendedValue = new Object();

  public static final String JSON_PROPERTY_STATUS = "status";
  private OrgGroupPolicySuggestionStatus status;

  public OrgGroupPolicySuggestionAttributes() {}

  @JsonCreator
  public OrgGroupPolicySuggestionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONSENSUS_RATIO) Double consensusRatio,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_NAME) String policyName,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECOMMENDED_VALUE)
          Object recommendedValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          OrgGroupPolicySuggestionStatus status) {
    this.consensusRatio = consensusRatio;
    this.policyName = policyName;
    this.recommendedValue = recommendedValue;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public OrgGroupPolicySuggestionAttributes consensusRatio(Double consensusRatio) {
    this.consensusRatio = consensusRatio;
    return this;
  }

  /**
   * The ratio of member orgs whose configuration agrees on the recommended value. minimum: 0
   * maximum: 1
   *
   * @return consensusRatio
   */
  @JsonProperty(JSON_PROPERTY_CONSENSUS_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getConsensusRatio() {
    return consensusRatio;
  }

  public void setConsensusRatio(Double consensusRatio) {
    this.consensusRatio = consensusRatio;
  }

  public OrgGroupPolicySuggestionAttributes policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * The name of the suggested policy.
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

  public OrgGroupPolicySuggestionAttributes recommendedValue(Object recommendedValue) {
    this.recommendedValue = recommendedValue;
    return this;
  }

  /**
   * The recommended value for the policy, based on member org consensus.
   *
   * @return recommendedValue
   */
  @JsonProperty(JSON_PROPERTY_RECOMMENDED_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Object getRecommendedValue() {
    return recommendedValue;
  }

  public void setRecommendedValue(Object recommendedValue) {
    this.recommendedValue = recommendedValue;
  }

  public OrgGroupPolicySuggestionAttributes status(OrgGroupPolicySuggestionStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the policy suggestion.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrgGroupPolicySuggestionStatus getStatus() {
    return status;
  }

  public void setStatus(OrgGroupPolicySuggestionStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return OrgGroupPolicySuggestionAttributes
   */
  @JsonAnySetter
  public OrgGroupPolicySuggestionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgGroupPolicySuggestionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupPolicySuggestionAttributes orgGroupPolicySuggestionAttributes =
        (OrgGroupPolicySuggestionAttributes) o;
    return Objects.equals(this.consensusRatio, orgGroupPolicySuggestionAttributes.consensusRatio)
        && Objects.equals(this.policyName, orgGroupPolicySuggestionAttributes.policyName)
        && Objects.equals(
            this.recommendedValue, orgGroupPolicySuggestionAttributes.recommendedValue)
        && Objects.equals(this.status, orgGroupPolicySuggestionAttributes.status)
        && Objects.equals(
            this.additionalProperties, orgGroupPolicySuggestionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consensusRatio, policyName, recommendedValue, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupPolicySuggestionAttributes {\n");
    sb.append("    consensusRatio: ").append(toIndentedString(consensusRatio)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    recommendedValue: ").append(toIndentedString(recommendedValue)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
