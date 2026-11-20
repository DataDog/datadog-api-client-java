/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  CompositeAudienceFiltersQuery.JSON_PROPERTY_ACCOUNTS,
  CompositeAudienceFiltersQuery.JSON_PROPERTY_DATA_SOURCE,
  CompositeAudienceFiltersQuery.JSON_PROPERTY_NAME,
  CompositeAudienceFiltersQuery.JSON_PROPERTY_SEGMENTS,
  CompositeAudienceFiltersQuery.JSON_PROPERTY_USERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CompositeAudienceFiltersQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<CompositeAudienceFiltersQueryAccountsItems> accounts = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private CompositeAudienceFiltersQueryDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEGMENTS = "segments";
  private List<CompositeAudienceFiltersQuerySegmentsItems> segments = null;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<CompositeAudienceFiltersQueryUsersItems> users = null;

  public CompositeAudienceFiltersQuery() {}

  @JsonCreator
  public CompositeAudienceFiltersQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          CompositeAudienceFiltersQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
  }

  public CompositeAudienceFiltersQuery accounts(
      List<CompositeAudienceFiltersQueryAccountsItems> accounts) {
    this.accounts = accounts;
    if (accounts != null) {
      for (CompositeAudienceFiltersQueryAccountsItems item : accounts) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CompositeAudienceFiltersQuery addAccountsItem(
      CompositeAudienceFiltersQueryAccountsItems accountsItem) {
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
  public List<CompositeAudienceFiltersQueryAccountsItems> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<CompositeAudienceFiltersQueryAccountsItems> accounts) {
    this.accounts = accounts;
    if (accounts != null) {
      for (CompositeAudienceFiltersQueryAccountsItems item : accounts) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CompositeAudienceFiltersQuery dataSource(
      CompositeAudienceFiltersQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CompositeAudienceFiltersQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(CompositeAudienceFiltersQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public CompositeAudienceFiltersQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompositeAudienceFiltersQuery segments(
      List<CompositeAudienceFiltersQuerySegmentsItems> segments) {
    this.segments = segments;
    if (segments != null) {
      for (CompositeAudienceFiltersQuerySegmentsItems item : segments) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CompositeAudienceFiltersQuery addSegmentsItem(
      CompositeAudienceFiltersQuerySegmentsItems segmentsItem) {
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
  public List<CompositeAudienceFiltersQuerySegmentsItems> getSegments() {
    return segments;
  }

  public void setSegments(List<CompositeAudienceFiltersQuerySegmentsItems> segments) {
    this.segments = segments;
    if (segments != null) {
      for (CompositeAudienceFiltersQuerySegmentsItems item : segments) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CompositeAudienceFiltersQuery users(List<CompositeAudienceFiltersQueryUsersItems> users) {
    this.users = users;
    if (users != null) {
      for (CompositeAudienceFiltersQueryUsersItems item : users) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CompositeAudienceFiltersQuery addUsersItem(
      CompositeAudienceFiltersQueryUsersItems usersItem) {
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
  public List<CompositeAudienceFiltersQueryUsersItems> getUsers() {
    return users;
  }

  public void setUsers(List<CompositeAudienceFiltersQueryUsersItems> users) {
    this.users = users;
    if (users != null) {
      for (CompositeAudienceFiltersQueryUsersItems item : users) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this CompositeAudienceFiltersQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeAudienceFiltersQuery compositeAudienceFiltersQuery = (CompositeAudienceFiltersQuery) o;
    return Objects.equals(this.accounts, compositeAudienceFiltersQuery.accounts)
        && Objects.equals(this.dataSource, compositeAudienceFiltersQuery.dataSource)
        && Objects.equals(this.name, compositeAudienceFiltersQuery.name)
        && Objects.equals(this.segments, compositeAudienceFiltersQuery.segments)
        && Objects.equals(this.users, compositeAudienceFiltersQuery.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, dataSource, name, segments, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeAudienceFiltersQuery {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
