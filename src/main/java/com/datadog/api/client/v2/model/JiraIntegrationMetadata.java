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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Incident integration metadata for the Jira integration. */
@JsonPropertyOrder({JiraIntegrationMetadata.JSON_PROPERTY_ISSUES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIntegrationMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ISSUES = "issues";
  private List<JiraIntegrationMetadataIssuesItem> issues = new ArrayList<>();

  public JiraIntegrationMetadata() {}

  @JsonCreator
  public JiraIntegrationMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUES)
          List<JiraIntegrationMetadataIssuesItem> issues) {
    this.issues = issues;
  }

  public JiraIntegrationMetadata issues(List<JiraIntegrationMetadataIssuesItem> issues) {
    this.issues = issues;
    for (JiraIntegrationMetadataIssuesItem item : issues) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public JiraIntegrationMetadata addIssuesItem(JiraIntegrationMetadataIssuesItem issuesItem) {
    this.issues.add(issuesItem);
    this.unparsed |= issuesItem.unparsed;
    return this;
  }

  /**
   * Array of Jira issues in this integration metadata.
   *
   * @return issues
   */
  @JsonProperty(JSON_PROPERTY_ISSUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<JiraIntegrationMetadataIssuesItem> getIssues() {
    return issues;
  }

  public void setIssues(List<JiraIntegrationMetadataIssuesItem> issues) {
    this.issues = issues;
  }

  /** Return true if this JiraIntegrationMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIntegrationMetadata jiraIntegrationMetadata = (JiraIntegrationMetadata) o;
    return Objects.equals(this.issues, jiraIntegrationMetadata.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIntegrationMetadata {\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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
