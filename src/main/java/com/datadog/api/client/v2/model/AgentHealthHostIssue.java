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

/** An active Agent Health issue associated with a resource. */
@JsonPropertyOrder({
  AgentHealthHostIssue.JSON_PROPERTY_CATEGORY,
  AgentHealthHostIssue.JSON_PROPERTY_ISSUE_ID,
  AgentHealthHostIssue.JSON_PROPERTY_ISSUE_NAME,
  AgentHealthHostIssue.JSON_PROPERTY_ISSUE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AgentHealthHostIssue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_ISSUE_ID = "issue_id";
  private String issueId;

  public static final String JSON_PROPERTY_ISSUE_NAME = "issue_name";
  private String issueName;

  public static final String JSON_PROPERTY_ISSUE_TYPE = "issue_type";
  private String issueType;

  public AgentHealthHostIssue() {}

  @JsonCreator
  public AgentHealthHostIssue(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_ID) String issueId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_NAME) String issueName,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_TYPE) String issueType) {
    this.category = category;
    this.issueId = issueId;
    this.issueName = issueName;
    this.issueType = issueType;
  }

  public AgentHealthHostIssue category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category used by the Agent to group and reconcile the issue.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AgentHealthHostIssue issueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

  /**
   * The unique identifier of the issue.
   *
   * @return issueId
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssueId() {
    return issueId;
  }

  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }

  public AgentHealthHostIssue issueName(String issueName) {
    this.issueName = issueName;
    return this;
  }

  /**
   * The human-readable name of the issue.
   *
   * @return issueName
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssueName() {
    return issueName;
  }

  public void setIssueName(String issueName) {
    this.issueName = issueName;
  }

  public AgentHealthHostIssue issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

  /**
   * The machine-readable type of the issue.
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
   * @return AgentHealthHostIssue
   */
  @JsonAnySetter
  public AgentHealthHostIssue putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AgentHealthHostIssue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentHealthHostIssue agentHealthHostIssue = (AgentHealthHostIssue) o;
    return Objects.equals(this.category, agentHealthHostIssue.category)
        && Objects.equals(this.issueId, agentHealthHostIssue.issueId)
        && Objects.equals(this.issueName, agentHealthHostIssue.issueName)
        && Objects.equals(this.issueType, agentHealthHostIssue.issueType)
        && Objects.equals(this.additionalProperties, agentHealthHostIssue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, issueId, issueName, issueType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentHealthHostIssue {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    issueName: ").append(toIndentedString(issueName)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
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
