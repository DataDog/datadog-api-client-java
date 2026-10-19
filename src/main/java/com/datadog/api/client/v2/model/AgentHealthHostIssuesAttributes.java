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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Active Agent Health issues for a resource. */
@JsonPropertyOrder({AgentHealthHostIssuesAttributes.JSON_PROPERTY_ISSUES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AgentHealthHostIssuesAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ISSUES = "issues";
  private List<AgentHealthHostIssue> issues = new ArrayList<>();

  public AgentHealthHostIssuesAttributes() {}

  @JsonCreator
  public AgentHealthHostIssuesAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUES)
          List<AgentHealthHostIssue> issues) {
    this.issues = issues;
    for (AgentHealthHostIssue item : issues) {
      this.unparsed |= item.unparsed;
    }
  }

  public AgentHealthHostIssuesAttributes issues(List<AgentHealthHostIssue> issues) {
    this.issues = issues;
    for (AgentHealthHostIssue item : issues) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AgentHealthHostIssuesAttributes addIssuesItem(AgentHealthHostIssue issuesItem) {
    this.issues.add(issuesItem);
    this.unparsed |= issuesItem.unparsed;
    return this;
  }

  /**
   * The active issues and their reconciliation metadata.
   *
   * @return issues
   */
  @JsonProperty(JSON_PROPERTY_ISSUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AgentHealthHostIssue> getIssues() {
    return issues;
  }

  public void setIssues(List<AgentHealthHostIssue> issues) {
    this.issues = issues;
    if (issues != null) {
      for (AgentHealthHostIssue item : issues) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return AgentHealthHostIssuesAttributes
   */
  @JsonAnySetter
  public AgentHealthHostIssuesAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AgentHealthHostIssuesAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentHealthHostIssuesAttributes agentHealthHostIssuesAttributes =
        (AgentHealthHostIssuesAttributes) o;
    return Objects.equals(this.issues, agentHealthHostIssuesAttributes.issues)
        && Objects.equals(
            this.additionalProperties, agentHealthHostIssuesAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentHealthHostIssuesAttributes {\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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
