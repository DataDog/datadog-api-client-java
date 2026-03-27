/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Product Analytics/RUM audience filters.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsAudienceFilters.JSON_PROPERTY_ACCOUNTS,
  ProductAnalyticsAudienceFilters.JSON_PROPERTY_FILTER_CONDITION,
  ProductAnalyticsAudienceFilters.JSON_PROPERTY_SEGMENTS,
  ProductAnalyticsAudienceFilters.JSON_PROPERTY_USERS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsAudienceFilters {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<ProductAnalyticsAudienceAccountSubquery> accounts = null;

  public static final String JSON_PROPERTY_FILTER_CONDITION = "filter_condition";
  private String filterCondition;

  public static final String JSON_PROPERTY_SEGMENTS = "segments";
  private List<ProductAnalyticsAudienceSegmentSubquery> segments = null;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<ProductAnalyticsAudienceUserSubquery> users = null;

  public ProductAnalyticsAudienceFilters accounts(List<ProductAnalyticsAudienceAccountSubquery> accounts) {
    this.accounts = accounts;
    for (ProductAnalyticsAudienceAccountSubquery item : accounts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ProductAnalyticsAudienceFilters addAccountsItem(ProductAnalyticsAudienceAccountSubquery accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    this.unparsed |= accountsItem.unparsed;
    return this;
  }

  /**
   * <p>Getaccounts</p>
   * @return accounts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ProductAnalyticsAudienceAccountSubquery> getAccounts() {
        return accounts;
      }
  public void setAccounts(List<ProductAnalyticsAudienceAccountSubquery> accounts) {
    this.accounts = accounts;
  }
  public ProductAnalyticsAudienceFilters filterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
    return this;
  }

  /**
   * <p>GetfilterCondition</p>
   * @return filterCondition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER_CONDITION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFilterCondition() {
        return filterCondition;
      }
  public void setFilterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
  }
  public ProductAnalyticsAudienceFilters segments(List<ProductAnalyticsAudienceSegmentSubquery> segments) {
    this.segments = segments;
    for (ProductAnalyticsAudienceSegmentSubquery item : segments) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ProductAnalyticsAudienceFilters addSegmentsItem(ProductAnalyticsAudienceSegmentSubquery segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    this.unparsed |= segmentsItem.unparsed;
    return this;
  }

  /**
   * <p>Getsegments</p>
   * @return segments
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEGMENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ProductAnalyticsAudienceSegmentSubquery> getSegments() {
        return segments;
      }
  public void setSegments(List<ProductAnalyticsAudienceSegmentSubquery> segments) {
    this.segments = segments;
  }
  public ProductAnalyticsAudienceFilters users(List<ProductAnalyticsAudienceUserSubquery> users) {
    this.users = users;
    for (ProductAnalyticsAudienceUserSubquery item : users) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ProductAnalyticsAudienceFilters addUsersItem(ProductAnalyticsAudienceUserSubquery usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    this.unparsed |= usersItem.unparsed;
    return this;
  }

  /**
   * <p>Getusers</p>
   * @return users
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ProductAnalyticsAudienceUserSubquery> getUsers() {
        return users;
      }
  public void setUsers(List<ProductAnalyticsAudienceUserSubquery> users) {
    this.users = users;
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
   * @return ProductAnalyticsAudienceFilters
   */
  @JsonAnySetter
  public ProductAnalyticsAudienceFilters putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsAudienceFilters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsAudienceFilters productAnalyticsAudienceFilters = (ProductAnalyticsAudienceFilters) o;
    return Objects.equals(this.accounts, productAnalyticsAudienceFilters.accounts) && Objects.equals(this.filterCondition, productAnalyticsAudienceFilters.filterCondition) && Objects.equals(this.segments, productAnalyticsAudienceFilters.segments) && Objects.equals(this.users, productAnalyticsAudienceFilters.users) && Objects.equals(this.additionalProperties, productAnalyticsAudienceFilters.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accounts,filterCondition,segments,users, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsAudienceFilters {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    filterCondition: ").append(toIndentedString(filterCondition)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
