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

/** Object containing the information of a search result. */
@JsonPropertyOrder({
  IssuesSearchResultAttributes.JSON_PROPERTY_IMPACTED_SESSIONS,
  IssuesSearchResultAttributes.JSON_PROPERTY_IMPACTED_USERS,
  IssuesSearchResultAttributes.JSON_PROPERTY_TOTAL_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssuesSearchResultAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IMPACTED_SESSIONS = "impacted_sessions";
  private Long impactedSessions;

  public static final String JSON_PROPERTY_IMPACTED_USERS = "impacted_users";
  private Long impactedUsers;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public IssuesSearchResultAttributes impactedSessions(Long impactedSessions) {
    this.impactedSessions = impactedSessions;
    return this;
  }

  /**
   * Count of sessions impacted by the issue over the queried time window.
   *
   * @return impactedSessions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPACTED_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getImpactedSessions() {
    return impactedSessions;
  }

  public void setImpactedSessions(Long impactedSessions) {
    this.impactedSessions = impactedSessions;
  }

  public IssuesSearchResultAttributes impactedUsers(Long impactedUsers) {
    this.impactedUsers = impactedUsers;
    return this;
  }

  /**
   * Count of users impacted by the issue over the queried time window.
   *
   * @return impactedUsers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPACTED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getImpactedUsers() {
    return impactedUsers;
  }

  public void setImpactedUsers(Long impactedUsers) {
    this.impactedUsers = impactedUsers;
  }

  public IssuesSearchResultAttributes totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total count of errors that match the issue over the queried time window.
   *
   * @return totalCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
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
   * @return IssuesSearchResultAttributes
   */
  @JsonAnySetter
  public IssuesSearchResultAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssuesSearchResultAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesSearchResultAttributes issuesSearchResultAttributes = (IssuesSearchResultAttributes) o;
    return Objects.equals(this.impactedSessions, issuesSearchResultAttributes.impactedSessions)
        && Objects.equals(this.impactedUsers, issuesSearchResultAttributes.impactedUsers)
        && Objects.equals(this.totalCount, issuesSearchResultAttributes.totalCount)
        && Objects.equals(
            this.additionalProperties, issuesSearchResultAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impactedSessions, impactedUsers, totalCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesSearchResultAttributes {\n");
    sb.append("    impactedSessions: ").append(toIndentedString(impactedSessions)).append("\n");
    sb.append("    impactedUsers: ").append(toIndentedString(impactedUsers)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
