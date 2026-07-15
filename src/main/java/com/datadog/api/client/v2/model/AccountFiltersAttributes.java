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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes for the account filters of a cloud account. */
@JsonPropertyOrder({
  AccountFiltersAttributes.JSON_PROPERTY_ACCOUNT_FILTERS,
  AccountFiltersAttributes.JSON_PROPERTY_ACCOUNT_ID,
  AccountFiltersAttributes.JSON_PROPERTY_CLOUD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AccountFiltersAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_FILTERS = "account_filters";
  private AccountFilteringConfig accountFilters;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private String cloud;

  public AccountFiltersAttributes accountFilters(AccountFilteringConfig accountFilters) {
    this.accountFilters = accountFilters;
    this.unparsed |= accountFilters.unparsed;
    return this;
  }

  /**
   * The account filtering configuration.
   *
   * @return accountFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AccountFilteringConfig getAccountFilters() {
    return accountFilters;
  }

  public void setAccountFilters(AccountFilteringConfig accountFilters) {
    this.accountFilters = accountFilters;
  }

  public AccountFiltersAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The cloud account ID.
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccountFiltersAttributes cloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  /**
   * The cloud provider of the account, for example <code>aws</code>, <code>aws_cur2</code>, or
   * <code>oci</code>.
   *
   * @return cloud
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCloud() {
    return cloud;
  }

  public void setCloud(String cloud) {
    this.cloud = cloud;
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
   * @return AccountFiltersAttributes
   */
  @JsonAnySetter
  public AccountFiltersAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AccountFiltersAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFiltersAttributes accountFiltersAttributes = (AccountFiltersAttributes) o;
    return Objects.equals(this.accountFilters, accountFiltersAttributes.accountFilters)
        && Objects.equals(this.accountId, accountFiltersAttributes.accountId)
        && Objects.equals(this.cloud, accountFiltersAttributes.cloud)
        && Objects.equals(this.additionalProperties, accountFiltersAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountFilters, accountId, cloud, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFiltersAttributes {\n");
    sb.append("    accountFilters: ").append(toIndentedString(accountFilters)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
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
