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

/** Contains the identifiers and URL for a successfully created Linear issue. */
@JsonPropertyOrder({
  IssueCaseLinearIssueResult.JSON_PROPERTY_ACCOUNT_ID,
  IssueCaseLinearIssueResult.JSON_PROPERTY_ISSUE_ID,
  IssueCaseLinearIssueResult.JSON_PROPERTY_ISSUE_KEY,
  IssueCaseLinearIssueResult.JSON_PROPERTY_ISSUE_URL,
  IssueCaseLinearIssueResult.JSON_PROPERTY_TEAM_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueCaseLinearIssueResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ISSUE_ID = "issue_id";
  private String issueId;

  public static final String JSON_PROPERTY_ISSUE_KEY = "issue_key";
  private String issueKey;

  public static final String JSON_PROPERTY_ISSUE_URL = "issue_url";
  private String issueUrl;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public IssueCaseLinearIssueResult accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Linear account identifier.
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

  public IssueCaseLinearIssueResult issueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

  /**
   * Linear issue identifier.
   *
   * @return issueId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssueId() {
    return issueId;
  }

  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }

  public IssueCaseLinearIssueResult issueKey(String issueKey) {
    this.issueKey = issueKey;
    return this;
  }

  /**
   * Linear issue key.
   *
   * @return issueKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssueKey() {
    return issueKey;
  }

  public void setIssueKey(String issueKey) {
    this.issueKey = issueKey;
  }

  public IssueCaseLinearIssueResult issueUrl(String issueUrl) {
    this.issueUrl = issueUrl;
    return this;
  }

  /**
   * Linear issue URL.
   *
   * @return issueUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssueUrl() {
    return issueUrl;
  }

  public void setIssueUrl(String issueUrl) {
    this.issueUrl = issueUrl;
  }

  public IssueCaseLinearIssueResult teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Linear team identifier.
   *
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
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
   * @return IssueCaseLinearIssueResult
   */
  @JsonAnySetter
  public IssueCaseLinearIssueResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueCaseLinearIssueResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueCaseLinearIssueResult issueCaseLinearIssueResult = (IssueCaseLinearIssueResult) o;
    return Objects.equals(this.accountId, issueCaseLinearIssueResult.accountId)
        && Objects.equals(this.issueId, issueCaseLinearIssueResult.issueId)
        && Objects.equals(this.issueKey, issueCaseLinearIssueResult.issueKey)
        && Objects.equals(this.issueUrl, issueCaseLinearIssueResult.issueUrl)
        && Objects.equals(this.teamId, issueCaseLinearIssueResult.teamId)
        && Objects.equals(
            this.additionalProperties, issueCaseLinearIssueResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, issueId, issueKey, issueUrl, teamId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueCaseLinearIssueResult {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    issueKey: ").append(toIndentedString(issueKey)).append("\n");
    sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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
