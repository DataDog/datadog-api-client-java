/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  AudienceFilters.JSON_PROPERTY_ACCOUNTS,
  AudienceFilters.JSON_PROPERTY_SEGMENTS,
  AudienceFilters.JSON_PROPERTY_USERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AudienceFilters {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<AudienceFiltersAccountsItems> accounts = null;

  public static final String JSON_PROPERTY_SEGMENTS = "segments";
  private List<AudienceFiltersSegmentsItems> segments = null;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<AudienceFiltersUsersItems> users = null;

  public AudienceFilters accounts(List<AudienceFiltersAccountsItems> accounts) {
    this.accounts = accounts;
    if (accounts != null) {
      for (AudienceFiltersAccountsItems item : accounts) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AudienceFilters addAccountsItem(AudienceFiltersAccountsItems accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    this.unparsed |= accountsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return accounts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AudienceFiltersAccountsItems> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AudienceFiltersAccountsItems> accounts) {
    this.accounts = accounts;
    if (accounts != null) {
      for (AudienceFiltersAccountsItems item : accounts) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AudienceFilters segments(List<AudienceFiltersSegmentsItems> segments) {
    this.segments = segments;
    if (segments != null) {
      for (AudienceFiltersSegmentsItems item : segments) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AudienceFilters addSegmentsItem(AudienceFiltersSegmentsItems segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    this.unparsed |= segmentsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return segments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AudienceFiltersSegmentsItems> getSegments() {
    return segments;
  }

  public void setSegments(List<AudienceFiltersSegmentsItems> segments) {
    this.segments = segments;
    if (segments != null) {
      for (AudienceFiltersSegmentsItems item : segments) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AudienceFilters users(List<AudienceFiltersUsersItems> users) {
    this.users = users;
    if (users != null) {
      for (AudienceFiltersUsersItems item : users) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AudienceFilters addUsersItem(AudienceFiltersUsersItems usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    this.unparsed |= usersItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return users
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AudienceFiltersUsersItems> getUsers() {
    return users;
  }

  public void setUsers(List<AudienceFiltersUsersItems> users) {
    this.users = users;
    if (users != null) {
      for (AudienceFiltersUsersItems item : users) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this AudienceFilters object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceFilters audienceFilters = (AudienceFilters) o;
    return Objects.equals(this.accounts, audienceFilters.accounts)
        && Objects.equals(this.segments, audienceFilters.segments)
        && Objects.equals(this.users, audienceFilters.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, segments, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceFilters {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
