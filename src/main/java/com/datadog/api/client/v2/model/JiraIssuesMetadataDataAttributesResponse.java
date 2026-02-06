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

/** */
@JsonPropertyOrder({
  JiraIssuesMetadataDataAttributesResponse.JSON_PROPERTY_ACCOUNT_ID,
  JiraIssuesMetadataDataAttributesResponse.JSON_PROPERTY_ISSUE_TYPE_ID,
  JiraIssuesMetadataDataAttributesResponse.JSON_PROPERTY_PROJECT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIssuesMetadataDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ISSUE_TYPE_ID = "issue_type_id";
  private String issueTypeId;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public JiraIssuesMetadataDataAttributesResponse() {}

  @JsonCreator
  public JiraIssuesMetadataDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_TYPE_ID) String issueTypeId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId) {
    this.accountId = accountId;
    this.issueTypeId = issueTypeId;
    this.projectId = projectId;
  }

  public JiraIssuesMetadataDataAttributesResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Jira account identifier.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public JiraIssuesMetadataDataAttributesResponse issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * Jira issue type identifier.
   *
   * @return issueTypeId
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public JiraIssuesMetadataDataAttributesResponse projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Jira project identifier.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
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
   * @return JiraIssuesMetadataDataAttributesResponse
   */
  @JsonAnySetter
  public JiraIssuesMetadataDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JiraIssuesMetadataDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssuesMetadataDataAttributesResponse jiraIssuesMetadataDataAttributesResponse =
        (JiraIssuesMetadataDataAttributesResponse) o;
    return Objects.equals(this.accountId, jiraIssuesMetadataDataAttributesResponse.accountId)
        && Objects.equals(this.issueTypeId, jiraIssuesMetadataDataAttributesResponse.issueTypeId)
        && Objects.equals(this.projectId, jiraIssuesMetadataDataAttributesResponse.projectId)
        && Objects.equals(
            this.additionalProperties,
            jiraIssuesMetadataDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, issueTypeId, projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssuesMetadataDataAttributesResponse {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
