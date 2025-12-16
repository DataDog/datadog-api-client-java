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

/** */
@JsonPropertyOrder({
  SankeyRequestDataAttributesSearchAudienceFilters.JSON_PROPERTY_ACCOUNTS,
  SankeyRequestDataAttributesSearchAudienceFilters.JSON_PROPERTY_FORMULA,
  SankeyRequestDataAttributesSearchAudienceFilters.JSON_PROPERTY_SEGMENTS,
  SankeyRequestDataAttributesSearchAudienceFilters.JSON_PROPERTY_USERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyRequestDataAttributesSearchAudienceFilters {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<SankeyRequestDataAttributesSearchAudienceFiltersAccountsItems> accounts = null;

  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_SEGMENTS = "segments";
  private List<SankeyRequestDataAttributesSearchAudienceFiltersSegmentsItems> segments = null;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<SankeyRequestDataAttributesSearchAudienceFiltersUsersItems> users = null;

  public SankeyRequestDataAttributesSearchAudienceFilters accounts(
      List<SankeyRequestDataAttributesSearchAudienceFiltersAccountsItems> accounts) {
    this.accounts = accounts;
    for (SankeyRequestDataAttributesSearchAudienceFiltersAccountsItems item : accounts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SankeyRequestDataAttributesSearchAudienceFilters addAccountsItem(
      SankeyRequestDataAttributesSearchAudienceFiltersAccountsItems accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    this.unparsed |= accountsItem.unparsed;
    return this;
  }

  /**
   * Getaccounts
   *
   * @return accounts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SankeyRequestDataAttributesSearchAudienceFiltersAccountsItems> getAccounts() {
    return accounts;
  }

  public void setAccounts(
      List<SankeyRequestDataAttributesSearchAudienceFiltersAccountsItems> accounts) {
    this.accounts = accounts;
  }

  public SankeyRequestDataAttributesSearchAudienceFilters formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * Getformula
   *
   * @return formula
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public SankeyRequestDataAttributesSearchAudienceFilters segments(
      List<SankeyRequestDataAttributesSearchAudienceFiltersSegmentsItems> segments) {
    this.segments = segments;
    for (SankeyRequestDataAttributesSearchAudienceFiltersSegmentsItems item : segments) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SankeyRequestDataAttributesSearchAudienceFilters addSegmentsItem(
      SankeyRequestDataAttributesSearchAudienceFiltersSegmentsItems segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    this.unparsed |= segmentsItem.unparsed;
    return this;
  }

  /**
   * Getsegments
   *
   * @return segments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SankeyRequestDataAttributesSearchAudienceFiltersSegmentsItems> getSegments() {
    return segments;
  }

  public void setSegments(
      List<SankeyRequestDataAttributesSearchAudienceFiltersSegmentsItems> segments) {
    this.segments = segments;
  }

  public SankeyRequestDataAttributesSearchAudienceFilters users(
      List<SankeyRequestDataAttributesSearchAudienceFiltersUsersItems> users) {
    this.users = users;
    for (SankeyRequestDataAttributesSearchAudienceFiltersUsersItems item : users) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SankeyRequestDataAttributesSearchAudienceFilters addUsersItem(
      SankeyRequestDataAttributesSearchAudienceFiltersUsersItems usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    this.unparsed |= usersItem.unparsed;
    return this;
  }

  /**
   * Getusers
   *
   * @return users
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SankeyRequestDataAttributesSearchAudienceFiltersUsersItems> getUsers() {
    return users;
  }

  public void setUsers(List<SankeyRequestDataAttributesSearchAudienceFiltersUsersItems> users) {
    this.users = users;
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
   * @return SankeyRequestDataAttributesSearchAudienceFilters
   */
  @JsonAnySetter
  public SankeyRequestDataAttributesSearchAudienceFilters putAdditionalProperty(
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

  /** Return true if this SankeyRequestDataAttributesSearchAudienceFilters object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyRequestDataAttributesSearchAudienceFilters
        sankeyRequestDataAttributesSearchAudienceFilters =
            (SankeyRequestDataAttributesSearchAudienceFilters) o;
    return Objects.equals(this.accounts, sankeyRequestDataAttributesSearchAudienceFilters.accounts)
        && Objects.equals(this.formula, sankeyRequestDataAttributesSearchAudienceFilters.formula)
        && Objects.equals(this.segments, sankeyRequestDataAttributesSearchAudienceFilters.segments)
        && Objects.equals(this.users, sankeyRequestDataAttributesSearchAudienceFilters.users)
        && Objects.equals(
            this.additionalProperties,
            sankeyRequestDataAttributesSearchAudienceFilters.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, formula, segments, users, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SankeyRequestDataAttributesSearchAudienceFilters {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
