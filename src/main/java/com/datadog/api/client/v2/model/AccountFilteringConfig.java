/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The account filtering configuration. */
@JsonPropertyOrder({
  AccountFilteringConfig.JSON_PROPERTY_EXCLUDED_ACCOUNTS,
  AccountFilteringConfig.JSON_PROPERTY_INCLUDE_NEW_ACCOUNTS,
  AccountFilteringConfig.JSON_PROPERTY_INCLUDED_ACCOUNTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AccountFilteringConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUDED_ACCOUNTS = "excluded_accounts";
  private List<String> excludedAccounts = null;

  public static final String JSON_PROPERTY_INCLUDE_NEW_ACCOUNTS = "include_new_accounts";
  private JsonNullable<Boolean> includeNewAccounts = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_INCLUDED_ACCOUNTS = "included_accounts";
  private List<String> includedAccounts = null;

  public AccountFilteringConfig excludedAccounts(List<String> excludedAccounts) {
    this.excludedAccounts = excludedAccounts;
    return this;
  }

  public AccountFilteringConfig addExcludedAccountsItem(String excludedAccountsItem) {
    if (this.excludedAccounts == null) {
      this.excludedAccounts = new ArrayList<>();
    }
    this.excludedAccounts.add(excludedAccountsItem);
    return this;
  }

  /**
   * The AWS account IDs to be excluded from your billing dataset. This field is used when <code>
   * include_new_accounts</code> is <code>true</code>.
   *
   * @return excludedAccounts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludedAccounts() {
    return excludedAccounts;
  }

  public void setExcludedAccounts(List<String> excludedAccounts) {
    this.excludedAccounts = excludedAccounts;
  }

  public AccountFilteringConfig includeNewAccounts(Boolean includeNewAccounts) {
    this.includeNewAccounts = JsonNullable.<Boolean>of(includeNewAccounts);
    return this;
  }

  /**
   * Whether or not to automatically include new member accounts by default in your billing dataset.
   *
   * @return includeNewAccounts
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIncludeNewAccounts() {
    return includeNewAccounts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCLUDE_NEW_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIncludeNewAccounts_JsonNullable() {
    return includeNewAccounts;
  }

  @JsonProperty(JSON_PROPERTY_INCLUDE_NEW_ACCOUNTS)
  public void setIncludeNewAccounts_JsonNullable(JsonNullable<Boolean> includeNewAccounts) {
    this.includeNewAccounts = includeNewAccounts;
  }

  public void setIncludeNewAccounts(Boolean includeNewAccounts) {
    this.includeNewAccounts = JsonNullable.<Boolean>of(includeNewAccounts);
  }

  public AccountFilteringConfig includedAccounts(List<String> includedAccounts) {
    this.includedAccounts = includedAccounts;
    return this;
  }

  public AccountFilteringConfig addIncludedAccountsItem(String includedAccountsItem) {
    if (this.includedAccounts == null) {
      this.includedAccounts = new ArrayList<>();
    }
    this.includedAccounts.add(includedAccountsItem);
    return this;
  }

  /**
   * The AWS account IDs to be included in your billing dataset. This field is used when <code>
   * include_new_accounts</code> is <code>false</code>.
   *
   * @return includedAccounts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIncludedAccounts() {
    return includedAccounts;
  }

  public void setIncludedAccounts(List<String> includedAccounts) {
    this.includedAccounts = includedAccounts;
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
   * @return AccountFilteringConfig
   */
  @JsonAnySetter
  public AccountFilteringConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AccountFilteringConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFilteringConfig accountFilteringConfig = (AccountFilteringConfig) o;
    return Objects.equals(this.excludedAccounts, accountFilteringConfig.excludedAccounts)
        && Objects.equals(this.includeNewAccounts, accountFilteringConfig.includeNewAccounts)
        && Objects.equals(this.includedAccounts, accountFilteringConfig.includedAccounts)
        && Objects.equals(this.additionalProperties, accountFilteringConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        excludedAccounts, includeNewAccounts, includedAccounts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFilteringConfig {\n");
    sb.append("    excludedAccounts: ").append(toIndentedString(excludedAccounts)).append("\n");
    sb.append("    includeNewAccounts: ").append(toIndentedString(includeNewAccounts)).append("\n");
    sb.append("    includedAccounts: ").append(toIndentedString(includedAccounts)).append("\n");
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
