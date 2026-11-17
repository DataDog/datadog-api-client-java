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

/** An integrated AWS account the AWS IAM Identity Center integration reads users from. */
@JsonPropertyOrder({
  SecurityMonitoringAWSIdentityCenterAWSAccount.JSON_PROPERTY_ACCOUNT_CONFIG_ID,
  SecurityMonitoringAWSIdentityCenterAWSAccount.JSON_PROPERTY_ACCOUNT_ID,
  SecurityMonitoringAWSIdentityCenterAWSAccount.JSON_PROPERTY_ACCOUNT_NAME,
  SecurityMonitoringAWSIdentityCenterAWSAccount.JSON_PROPERTY_COLLECTING_USERS,
  SecurityMonitoringAWSIdentityCenterAWSAccount.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringAWSIdentityCenterAWSAccount {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_CONFIG_ID = "account_config_id";
  private String accountConfigId;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "account_name";
  private String accountName;

  public static final String JSON_PROPERTY_COLLECTING_USERS = "collecting_users";
  private Boolean collectingUsers;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED =
      "resource_collection_enabled";
  private Boolean resourceCollectionEnabled;

  public SecurityMonitoringAWSIdentityCenterAWSAccount() {}

  @JsonCreator
  public SecurityMonitoringAWSIdentityCenterAWSAccount(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_CONFIG_ID)
          String accountConfigId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_NAME) String accountName,
      @JsonProperty(required = true, value = JSON_PROPERTY_COLLECTING_USERS)
          Boolean collectingUsers,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
          Boolean resourceCollectionEnabled) {
    this.accountConfigId = accountConfigId;
    this.accountId = accountId;
    this.accountName = accountName;
    this.collectingUsers = collectingUsers;
    this.resourceCollectionEnabled = resourceCollectionEnabled;
  }

  public SecurityMonitoringAWSIdentityCenterAWSAccount accountConfigId(String accountConfigId) {
    this.accountConfigId = accountConfigId;
    return this;
  }

  /**
   * The ID of the AWS account integration configuration.
   *
   * @return accountConfigId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountConfigId() {
    return accountConfigId;
  }

  public void setAccountConfigId(String accountConfigId) {
    this.accountConfigId = accountConfigId;
  }

  public SecurityMonitoringAWSIdentityCenterAWSAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The AWS account ID.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SecurityMonitoringAWSIdentityCenterAWSAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The name of the AWS account integration.
   *
   * @return accountName
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public SecurityMonitoringAWSIdentityCenterAWSAccount collectingUsers(Boolean collectingUsers) {
    this.collectingUsers = collectingUsers;
    return this;
  }

  /**
   * Whether AWS IAM Identity Center users were collected from this AWS account.
   *
   * @return collectingUsers
   */
  @JsonProperty(JSON_PROPERTY_COLLECTING_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getCollectingUsers() {
    return collectingUsers;
  }

  public void setCollectingUsers(Boolean collectingUsers) {
    this.collectingUsers = collectingUsers;
  }

  public SecurityMonitoringAWSIdentityCenterAWSAccount resourceCollectionEnabled(
      Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    return this;
  }

  /**
   * Whether resource collection is enabled for this AWS account.
   *
   * @return resourceCollectionEnabled
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getResourceCollectionEnabled() {
    return resourceCollectionEnabled;
  }

  public void setResourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
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
   * @return SecurityMonitoringAWSIdentityCenterAWSAccount
   */
  @JsonAnySetter
  public SecurityMonitoringAWSIdentityCenterAWSAccount putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringAWSIdentityCenterAWSAccount object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringAWSIdentityCenterAWSAccount securityMonitoringAwsIdentityCenterAwsAccount =
        (SecurityMonitoringAWSIdentityCenterAWSAccount) o;
    return Objects.equals(
            this.accountConfigId, securityMonitoringAwsIdentityCenterAwsAccount.accountConfigId)
        && Objects.equals(this.accountId, securityMonitoringAwsIdentityCenterAwsAccount.accountId)
        && Objects.equals(
            this.accountName, securityMonitoringAwsIdentityCenterAwsAccount.accountName)
        && Objects.equals(
            this.collectingUsers, securityMonitoringAwsIdentityCenterAwsAccount.collectingUsers)
        && Objects.equals(
            this.resourceCollectionEnabled,
            securityMonitoringAwsIdentityCenterAwsAccount.resourceCollectionEnabled)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringAwsIdentityCenterAwsAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountConfigId,
        accountId,
        accountName,
        collectingUsers,
        resourceCollectionEnabled,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringAWSIdentityCenterAWSAccount {\n");
    sb.append("    accountConfigId: ").append(toIndentedString(accountConfigId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    collectingUsers: ").append(toIndentedString(collectingUsers)).append("\n");
    sb.append("    resourceCollectionEnabled: ")
        .append(toIndentedString(resourceCollectionEnabled))
        .append("\n");
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
