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
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@JsonPropertyOrder({
  JiraIssueDataAttributesRequest.JSON_PROPERTY_ACCOUNT_ID,
  JiraIssueDataAttributesRequest.JSON_PROPERTY_FIELDS,
  JiraIssueDataAttributesRequest.JSON_PROPERTY_ISSUE_TYPE,
  JiraIssueDataAttributesRequest.JSON_PROPERTY_ISSUETYPE_ID,
  JiraIssueDataAttributesRequest.JSON_PROPERTY_MODE,
  JiraIssueDataAttributesRequest.JSON_PROPERTY_PROJECT_ID,
  JiraIssueDataAttributesRequest.JSON_PROPERTY_PROJECT_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIssueDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private JsonNullable<Map<String, Object>> fields = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_ISSUE_TYPE = "issue_type";
  private String issueType;

  public static final String JSON_PROPERTY_ISSUETYPE_ID = "issuetype_id";
  private String issuetypeId;

  public static final String JSON_PROPERTY_MODE = "mode";
  private JiraIssueDataAttributesRequestMode mode;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_PROJECT_KEY = "project_key";
  private String projectKey;

  public JiraIssueDataAttributesRequest() {}

  @JsonCreator
  public JiraIssueDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_TYPE) String issueType,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUETYPE_ID) String issuetypeId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_KEY) String projectKey) {
    this.accountId = accountId;
    this.issueType = issueType;
    this.issuetypeId = issuetypeId;
    this.projectId = projectId;
    this.projectKey = projectKey;
  }

  public JiraIssueDataAttributesRequest accountId(String accountId) {
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

  public JiraIssueDataAttributesRequest fields(Map<String, Object> fields) {
    this.fields = JsonNullable.<Map<String, Object>>of(fields);
    return this;
  }

  public JiraIssueDataAttributesRequest putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null || !this.fields.isPresent()) {
      this.fields = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.fields.get().put(key, fieldsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Custom fields for the Jira issue.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getFields() {
    return fields.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getFields_JsonNullable() {
    return fields;
  }

  @JsonProperty(JSON_PROPERTY_FIELDS)
  public void setFields_JsonNullable(JsonNullable<Map<String, Object>> fields) {
    this.fields = fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = JsonNullable.<Map<String, Object>>of(fields);
  }

  public JiraIssueDataAttributesRequest issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

  /**
   * Jira issue type name.
   *
   * @return issueType
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssueType() {
    return issueType;
  }

  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }

  public JiraIssueDataAttributesRequest issuetypeId(String issuetypeId) {
    this.issuetypeId = issuetypeId;
    return this;
  }

  /**
   * Jira issue type identifier.
   *
   * @return issuetypeId
   */
  @JsonProperty(JSON_PROPERTY_ISSUETYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssuetypeId() {
    return issuetypeId;
  }

  public void setIssuetypeId(String issuetypeId) {
    this.issuetypeId = issuetypeId;
  }

  public JiraIssueDataAttributesRequest mode(JiraIssueDataAttributesRequestMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Mode for creating the Jira issue. Can be "single" or "multiple".
   *
   * @return mode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JiraIssueDataAttributesRequestMode getMode() {
    return mode;
  }

  public void setMode(JiraIssueDataAttributesRequestMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public JiraIssueDataAttributesRequest projectId(String projectId) {
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

  public JiraIssueDataAttributesRequest projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  /**
   * Jira project key.
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
   * @return JiraIssueDataAttributesRequest
   */
  @JsonAnySetter
  public JiraIssueDataAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JiraIssueDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueDataAttributesRequest jiraIssueDataAttributesRequest =
        (JiraIssueDataAttributesRequest) o;
    return Objects.equals(this.accountId, jiraIssueDataAttributesRequest.accountId)
        && Objects.equals(this.fields, jiraIssueDataAttributesRequest.fields)
        && Objects.equals(this.issueType, jiraIssueDataAttributesRequest.issueType)
        && Objects.equals(this.issuetypeId, jiraIssueDataAttributesRequest.issuetypeId)
        && Objects.equals(this.mode, jiraIssueDataAttributesRequest.mode)
        && Objects.equals(this.projectId, jiraIssueDataAttributesRequest.projectId)
        && Objects.equals(this.projectKey, jiraIssueDataAttributesRequest.projectKey)
        && Objects.equals(
            this.additionalProperties, jiraIssueDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        fields,
        issueType,
        issuetypeId,
        mode,
        projectId,
        projectKey,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueDataAttributesRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    issuetypeId: ").append(toIndentedString(issuetypeId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
