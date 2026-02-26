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
   * <p>An object describing the EventBridge configuration for multiple accounts.</p>
 */
@JsonPropertyOrder({
  AWSEventBridgeListResponseAttributes.JSON_PROPERTY_ACCOUNTS,
  AWSEventBridgeListResponseAttributes.JSON_PROPERTY_IS_INSTALLED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSEventBridgeListResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<AWSEventBridgeAccountConfiguration> accounts = null;

  public static final String JSON_PROPERTY_IS_INSTALLED = "is_installed";
  private Boolean isInstalled;

  public AWSEventBridgeListResponseAttributes accounts(List<AWSEventBridgeAccountConfiguration> accounts) {
    this.accounts = accounts;
    for (AWSEventBridgeAccountConfiguration item : accounts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public AWSEventBridgeListResponseAttributes addAccountsItem(AWSEventBridgeAccountConfiguration accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    this.unparsed |= accountsItem.unparsed;
    return this;
  }

  /**
   * <p>List of accounts with their event sources.</p>
   * @return accounts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<AWSEventBridgeAccountConfiguration> getAccounts() {
        return accounts;
      }
  public void setAccounts(List<AWSEventBridgeAccountConfiguration> accounts) {
    this.accounts = accounts;
  }
  public AWSEventBridgeListResponseAttributes isInstalled(Boolean isInstalled) {
    this.isInstalled = isInstalled;
    return this;
  }

  /**
   * <p>True if the EventBridge integration is enabled for your organization.</p>
   * @return isInstalled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_INSTALLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsInstalled() {
        return isInstalled;
      }
  public void setIsInstalled(Boolean isInstalled) {
    this.isInstalled = isInstalled;
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
   * @return AWSEventBridgeListResponseAttributes
   */
  @JsonAnySetter
  public AWSEventBridgeListResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AWSEventBridgeListResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSEventBridgeListResponseAttributes awsEventBridgeListResponseAttributes = (AWSEventBridgeListResponseAttributes) o;
    return Objects.equals(this.accounts, awsEventBridgeListResponseAttributes.accounts) && Objects.equals(this.isInstalled, awsEventBridgeListResponseAttributes.isInstalled) && Objects.equals(this.additionalProperties, awsEventBridgeListResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accounts,isInstalled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSEventBridgeListResponseAttributes {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    isInstalled: ").append(toIndentedString(isInstalled)).append("\n");
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
