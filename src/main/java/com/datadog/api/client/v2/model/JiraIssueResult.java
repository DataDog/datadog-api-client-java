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

/** Jira issue information */
@JsonPropertyOrder({
  JiraIssueResult.JSON_PROPERTY_ISSUE_ID,
  JiraIssueResult.JSON_PROPERTY_ISSUE_KEY,
  JiraIssueResult.JSON_PROPERTY_ISSUE_URL,
  JiraIssueResult.JSON_PROPERTY_PROJECT_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIssueResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ISSUE_ID = "issue_id";
  private String issueId;

  public static final String JSON_PROPERTY_ISSUE_KEY = "issue_key";
  private String issueKey;

  public static final String JSON_PROPERTY_ISSUE_URL = "issue_url";
  private String issueUrl;

  public static final String JSON_PROPERTY_PROJECT_KEY = "project_key";
  private String projectKey;

  public JiraIssueResult issueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

  /**
   * Jira issue ID
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

  public JiraIssueResult issueKey(String issueKey) {
    this.issueKey = issueKey;
    return this;
  }

  /**
   * Jira issue key
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

  public JiraIssueResult issueUrl(String issueUrl) {
    this.issueUrl = issueUrl;
    return this;
  }

  /**
   * Jira issue URL
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

  public JiraIssueResult projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  /**
   * Jira project key
   *
   * @return projectKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProjectKey() {
    return projectKey;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
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
   * @return JiraIssueResult
   */
  @JsonAnySetter
  public JiraIssueResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JiraIssueResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueResult jiraIssueResult = (JiraIssueResult) o;
    return Objects.equals(this.issueId, jiraIssueResult.issueId)
        && Objects.equals(this.issueKey, jiraIssueResult.issueKey)
        && Objects.equals(this.issueUrl, jiraIssueResult.issueUrl)
        && Objects.equals(this.projectKey, jiraIssueResult.projectKey)
        && Objects.equals(this.additionalProperties, jiraIssueResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueId, issueKey, issueUrl, projectKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueResult {\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    issueKey: ").append(toIndentedString(issueKey)).append("\n");
    sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
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
