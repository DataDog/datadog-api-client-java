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

/** The attributes of the AWS IAM Identity Center AWS account prerequisites. */
@JsonPropertyOrder({
  SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes.JSON_PROPERTY_AWS_ACCOUNTS,
  SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes.JSON_PROPERTY_HAS_VALID_PREREQUISITE,
  SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AWS_ACCOUNTS = "aws_accounts";
  private List<SecurityMonitoringAWSIdentityCenterAWSAccount> awsAccounts = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_VALID_PREREQUISITE = "has_valid_prerequisite";
  private Boolean hasValidPrerequisite;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes() {}

  @JsonCreator
  public SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS_ACCOUNTS)
          List<SecurityMonitoringAWSIdentityCenterAWSAccount> awsAccounts,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_VALID_PREREQUISITE)
          Boolean hasValidPrerequisite) {
    this.awsAccounts = awsAccounts;
    for (SecurityMonitoringAWSIdentityCenterAWSAccount item : awsAccounts) {
      this.unparsed |= item.unparsed;
    }
    this.hasValidPrerequisite = hasValidPrerequisite;
  }

  public SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes awsAccounts(
      List<SecurityMonitoringAWSIdentityCenterAWSAccount> awsAccounts) {
    this.awsAccounts = awsAccounts;
    for (SecurityMonitoringAWSIdentityCenterAWSAccount item : awsAccounts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes addAwsAccountsItem(
      SecurityMonitoringAWSIdentityCenterAWSAccount awsAccountsItem) {
    this.awsAccounts.add(awsAccountsItem);
    this.unparsed |= awsAccountsItem.unparsed;
    return this;
  }

  /**
   * The integrated AWS accounts that users are read from, including AWS Organization management
   * accounts and any accounts that users were collected from.
   *
   * @return awsAccounts
   */
  @JsonProperty(JSON_PROPERTY_AWS_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringAWSIdentityCenterAWSAccount> getAwsAccounts() {
    return awsAccounts;
  }

  public void setAwsAccounts(List<SecurityMonitoringAWSIdentityCenterAWSAccount> awsAccounts) {
    this.awsAccounts = awsAccounts;
    if (awsAccounts != null) {
      for (SecurityMonitoringAWSIdentityCenterAWSAccount item : awsAccounts) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes hasValidPrerequisite(
      Boolean hasValidPrerequisite) {
    this.hasValidPrerequisite = hasValidPrerequisite;
    return this;
  }

  /**
   * Whether AWS IAM Identity Center users were collected for the organization.
   *
   * @return hasValidPrerequisite
   */
  @JsonProperty(JSON_PROPERTY_HAS_VALID_PREREQUISITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasValidPrerequisite() {
    return hasValidPrerequisite;
  }

  public void setHasValidPrerequisite(Boolean hasValidPrerequisite) {
    this.hasValidPrerequisite = hasValidPrerequisite;
  }

  public SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The missing setup step when <code>has_valid_prerequisite</code> is <code>false</code>.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
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
   * @return SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes
        securityMonitoringAwsIdentityCenterAwsAccountsAttributes =
            (SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes) o;
    return Objects.equals(
            this.awsAccounts, securityMonitoringAwsIdentityCenterAwsAccountsAttributes.awsAccounts)
        && Objects.equals(
            this.hasValidPrerequisite,
            securityMonitoringAwsIdentityCenterAwsAccountsAttributes.hasValidPrerequisite)
        && Objects.equals(
            this.reason, securityMonitoringAwsIdentityCenterAwsAccountsAttributes.reason)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringAwsIdentityCenterAwsAccountsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccounts, hasValidPrerequisite, reason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringAWSIdentityCenterAWSAccountsAttributes {\n");
    sb.append("    awsAccounts: ").append(toIndentedString(awsAccounts)).append("\n");
    sb.append("    hasValidPrerequisite: ")
        .append(toIndentedString(hasValidPrerequisite))
        .append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
