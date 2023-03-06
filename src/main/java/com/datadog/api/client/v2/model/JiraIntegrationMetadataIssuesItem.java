/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Item in the Jira integration metadata issue array. */
@JsonPropertyOrder({
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_ACCOUNT,
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_ISSUE_KEY,
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_ISSUETYPE_ID,
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_PROJECT_KEY,
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_REDIRECT_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIntegrationMetadataIssuesItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private String account;

  public static final String JSON_PROPERTY_ISSUE_KEY = "issue_key";
  private String issueKey;

  public static final String JSON_PROPERTY_ISSUETYPE_ID = "issuetype_id";
  private String issuetypeId;

  public static final String JSON_PROPERTY_PROJECT_KEY = "project_key";
  private String projectKey;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirect_url";
  private String redirectUrl;

  public JiraIntegrationMetadataIssuesItem() {}

  @JsonCreator
  public JiraIntegrationMetadataIssuesItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT) String account,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_KEY) String projectKey) {
    this.account = account;
    this.projectKey = projectKey;
  }

  public JiraIntegrationMetadataIssuesItem account(String account) {
    this.account = account;
    return this;
  }

  /**
   * URL of issue's Jira account.
   *
   * @return account
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public JiraIntegrationMetadataIssuesItem issueKey(String issueKey) {
    this.issueKey = issueKey;
    return this;
  }

  /**
   * Jira issue's issue key.
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

  public JiraIntegrationMetadataIssuesItem issuetypeId(String issuetypeId) {
    this.issuetypeId = issuetypeId;
    return this;
  }

  /**
   * Jira issue's issue type.
   *
   * @return issuetypeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUETYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuetypeId() {
    return issuetypeId;
  }

  public void setIssuetypeId(String issuetypeId) {
    this.issuetypeId = issuetypeId;
  }

  public JiraIntegrationMetadataIssuesItem projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  /**
   * Jira issue's project keys.
   *
   * @return projectKey
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectKey() {
    return projectKey;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }

  public JiraIntegrationMetadataIssuesItem redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * URL redirecting to the Jira issue.
   *
   * @return redirectUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /** Return true if this JiraIntegrationMetadataIssuesItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIntegrationMetadataIssuesItem jiraIntegrationMetadataIssuesItem =
        (JiraIntegrationMetadataIssuesItem) o;
    return Objects.equals(this.account, jiraIntegrationMetadataIssuesItem.account)
        && Objects.equals(this.issueKey, jiraIntegrationMetadataIssuesItem.issueKey)
        && Objects.equals(this.issuetypeId, jiraIntegrationMetadataIssuesItem.issuetypeId)
        && Objects.equals(this.projectKey, jiraIntegrationMetadataIssuesItem.projectKey)
        && Objects.equals(this.redirectUrl, jiraIntegrationMetadataIssuesItem.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, issueKey, issuetypeId, projectKey, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIntegrationMetadataIssuesItem {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    issueKey: ").append(toIndentedString(issueKey)).append("\n");
    sb.append("    issuetypeId: ").append(toIndentedString(issuetypeId)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("}");
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
