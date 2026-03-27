/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Item in the Jira integration metadata issue array.</p>
 */
@JsonPropertyOrder({
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_ACCOUNT,
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_ISSUE_KEY,
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_ISSUETYPE_ID,
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_PROJECT_KEY,
  JiraIntegrationMetadataIssuesItem.JSON_PROPERTY_REDIRECT_URL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIntegrationMetadataIssuesItem {
  @JsonIgnore
  public boolean unparsed = false;
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
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCOUNT)String account,
            @JsonProperty(required=true, value=JSON_PROPERTY_PROJECT_KEY)String projectKey) {
        this.account = account;
        this.projectKey = projectKey;
  }
  public JiraIntegrationMetadataIssuesItem account(String account) {
    this.account = account;
    return this;
  }

  /**
   * <p>URL of issue's Jira account.</p>
   * @return account
  **/
      @JsonProperty(JSON_PROPERTY_ACCOUNT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Jira issue's issue key.</p>
   * @return issueKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ISSUE_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Jira issue's issue type.</p>
   * @return issuetypeId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ISSUETYPE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Jira issue's project keys.</p>
   * @return projectKey
  **/
      @JsonProperty(JSON_PROPERTY_PROJECT_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>URL redirecting to the Jira issue.</p>
   * @return redirectUrl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRedirectUrl() {
        return redirectUrl;
      }
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return JiraIntegrationMetadataIssuesItem
   */
  @JsonAnySetter
  public JiraIntegrationMetadataIssuesItem putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this JiraIntegrationMetadataIssuesItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIntegrationMetadataIssuesItem jiraIntegrationMetadataIssuesItem = (JiraIntegrationMetadataIssuesItem) o;
    return Objects.equals(this.account, jiraIntegrationMetadataIssuesItem.account) && Objects.equals(this.issueKey, jiraIntegrationMetadataIssuesItem.issueKey) && Objects.equals(this.issuetypeId, jiraIntegrationMetadataIssuesItem.issuetypeId) && Objects.equals(this.projectKey, jiraIntegrationMetadataIssuesItem.projectKey) && Objects.equals(this.redirectUrl, jiraIntegrationMetadataIssuesItem.redirectUrl) && Objects.equals(this.additionalProperties, jiraIntegrationMetadataIssuesItem.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(account,issueKey,issuetypeId,projectKey,redirectUrl, additionalProperties);
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
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
