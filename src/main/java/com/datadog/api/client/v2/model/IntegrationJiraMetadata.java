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

 */
@JsonPropertyOrder({
  IntegrationJiraMetadata.JSON_PROPERTY_ACCOUNT_ID,
  IntegrationJiraMetadata.JSON_PROPERTY_ISSUE_TYPE_ID,
  IntegrationJiraMetadata.JSON_PROPERTY_PROJECT_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationJiraMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ISSUE_TYPE_ID = "issue_type_id";
  private String issueTypeId;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public IntegrationJiraMetadata accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>GetaccountId</p>
   * @return accountId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAccountId() {
        return accountId;
      }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public IntegrationJiraMetadata issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * <p>GetissueTypeId</p>
   * @return issueTypeId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIssueTypeId() {
        return issueTypeId;
      }
  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }
  public IntegrationJiraMetadata projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * <p>GetprojectId</p>
   * @return projectId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROJECT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProjectId() {
        return projectId;
      }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
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
   * @return IntegrationJiraMetadata
   */
  @JsonAnySetter
  public IntegrationJiraMetadata putAdditionalProperty(String key, Object value) {
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
   * Return true if this IntegrationJiraMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationJiraMetadata integrationJiraMetadata = (IntegrationJiraMetadata) o;
    return Objects.equals(this.accountId, integrationJiraMetadata.accountId) && Objects.equals(this.issueTypeId, integrationJiraMetadata.issueTypeId) && Objects.equals(this.projectId, integrationJiraMetadata.projectId) && Objects.equals(this.additionalProperties, integrationJiraMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountId,issueTypeId,projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationJiraMetadata {\n");
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
