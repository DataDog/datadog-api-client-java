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

/**
 * The issue's errors in the time window, and the users, sessions, accounts, views, and endpoints
 * they affect.
 */
@JsonPropertyOrder({
  IssueImpactAttributes.JSON_PROPERTY_ACCOUNTS,
  IssueImpactAttributes.JSON_PROPERTY_ENDPOINTS,
  IssueImpactAttributes.JSON_PROPERTY_ERROR_COUNTS,
  IssueImpactAttributes.JSON_PROPERTY_SESSIONS,
  IssueImpactAttributes.JSON_PROPERTY_USERS,
  IssueImpactAttributes.JSON_PROPERTY_VIEWS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueImpactAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private IssueImpactAccounts accounts;

  public static final String JSON_PROPERTY_ENDPOINTS = "endpoints";
  private IssueImpactEndpoints endpoints;

  public static final String JSON_PROPERTY_ERROR_COUNTS = "error_counts";
  private IssueImpactErrorCounts errorCounts;

  public static final String JSON_PROPERTY_SESSIONS = "sessions";
  private IssueImpactSessions sessions;

  public static final String JSON_PROPERTY_USERS = "users";
  private IssueImpactUsers users;

  public static final String JSON_PROPERTY_VIEWS = "views";
  private IssueImpactViews views;

  public IssueImpactAttributes() {}

  @JsonCreator
  public IssueImpactAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNTS) IssueImpactAccounts accounts,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENDPOINTS)
          IssueImpactEndpoints endpoints,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_COUNTS)
          IssueImpactErrorCounts errorCounts,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSIONS) IssueImpactSessions sessions,
      @JsonProperty(required = true, value = JSON_PROPERTY_USERS) IssueImpactUsers users,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEWS) IssueImpactViews views) {
    this.accounts = accounts;
    this.unparsed |= accounts.unparsed;
    this.endpoints = endpoints;
    this.unparsed |= endpoints.unparsed;
    this.errorCounts = errorCounts;
    this.unparsed |= errorCounts.unparsed;
    this.sessions = sessions;
    this.unparsed |= sessions.unparsed;
    this.users = users;
    this.unparsed |= users.unparsed;
    this.views = views;
    this.unparsed |= views.unparsed;
  }

  public IssueImpactAttributes accounts(IssueImpactAccounts accounts) {
    this.accounts = accounts;
    this.unparsed |= accounts.unparsed;
    return this;
  }

  /**
   * Accounts whose users are affected by the issue.
   *
   * @return accounts
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueImpactAccounts getAccounts() {
    return accounts;
  }

  public void setAccounts(IssueImpactAccounts accounts) {
    this.accounts = accounts;
    if (accounts != null) {
      this.unparsed |= accounts.unparsed;
    }
  }

  public IssueImpactAttributes endpoints(IssueImpactEndpoints endpoints) {
    this.endpoints = endpoints;
    this.unparsed |= endpoints.unparsed;
    return this;
  }

  /**
   * Endpoints whose traces have the issue's errors, identified by each trace's root span.
   *
   * @return endpoints
   */
  @JsonProperty(JSON_PROPERTY_ENDPOINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueImpactEndpoints getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(IssueImpactEndpoints endpoints) {
    this.endpoints = endpoints;
    if (endpoints != null) {
      this.unparsed |= endpoints.unparsed;
    }
  }

  public IssueImpactAttributes errorCounts(IssueImpactErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
    this.unparsed |= errorCounts.unparsed;
    return this;
  }

  /**
   * Number of errors reported by each source. Several sources can report the same error, such as an
   * APM span and a log, so the counts overlap: don't add them together.
   *
   * @return errorCounts
   */
  @JsonProperty(JSON_PROPERTY_ERROR_COUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueImpactErrorCounts getErrorCounts() {
    return errorCounts;
  }

  public void setErrorCounts(IssueImpactErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
    if (errorCounts != null) {
      this.unparsed |= errorCounts.unparsed;
    }
  }

  public IssueImpactAttributes sessions(IssueImpactSessions sessions) {
    this.sessions = sessions;
    this.unparsed |= sessions.unparsed;
    return this;
  }

  /**
   * RUM sessions where the issue occurred.
   *
   * @return sessions
   */
  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueImpactSessions getSessions() {
    return sessions;
  }

  public void setSessions(IssueImpactSessions sessions) {
    this.sessions = sessions;
    if (sessions != null) {
      this.unparsed |= sessions.unparsed;
    }
  }

  public IssueImpactAttributes users(IssueImpactUsers users) {
    this.users = users;
    this.unparsed |= users.unparsed;
    return this;
  }

  /**
   * Users affected by the issue.
   *
   * @return users
   */
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueImpactUsers getUsers() {
    return users;
  }

  public void setUsers(IssueImpactUsers users) {
    this.users = users;
    if (users != null) {
      this.unparsed |= users.unparsed;
    }
  }

  public IssueImpactAttributes views(IssueImpactViews views) {
    this.views = views;
    this.unparsed |= views.unparsed;
    return this;
  }

  /**
   * RUM views where the issue occurred.
   *
   * @return views
   */
  @JsonProperty(JSON_PROPERTY_VIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueImpactViews getViews() {
    return views;
  }

  public void setViews(IssueImpactViews views) {
    this.views = views;
    if (views != null) {
      this.unparsed |= views.unparsed;
    }
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
   * @return IssueImpactAttributes
   */
  @JsonAnySetter
  public IssueImpactAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueImpactAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueImpactAttributes issueImpactAttributes = (IssueImpactAttributes) o;
    return Objects.equals(this.accounts, issueImpactAttributes.accounts)
        && Objects.equals(this.endpoints, issueImpactAttributes.endpoints)
        && Objects.equals(this.errorCounts, issueImpactAttributes.errorCounts)
        && Objects.equals(this.sessions, issueImpactAttributes.sessions)
        && Objects.equals(this.users, issueImpactAttributes.users)
        && Objects.equals(this.views, issueImpactAttributes.views)
        && Objects.equals(this.additionalProperties, issueImpactAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accounts, endpoints, errorCounts, sessions, users, views, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueImpactAttributes {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    errorCounts: ").append(toIndentedString(errorCounts)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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
