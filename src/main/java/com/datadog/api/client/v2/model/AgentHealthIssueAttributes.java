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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of an open Agent Health issue. */
@JsonPropertyOrder({
  AgentHealthIssueAttributes.JSON_PROPERTY_CATEGORY,
  AgentHealthIssueAttributes.JSON_PROPERTY_DESCRIPTION,
  AgentHealthIssueAttributes.JSON_PROPERTY_FIRST_SEEN_AT,
  AgentHealthIssueAttributes.JSON_PROPERTY_ISSUE_NAME,
  AgentHealthIssueAttributes.JSON_PROPERTY_ISSUE_TYPE,
  AgentHealthIssueAttributes.JSON_PROPERTY_RESOURCE_ID,
  AgentHealthIssueAttributes.JSON_PROPERTY_RESOURCE_KIND,
  AgentHealthIssueAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  AgentHealthIssueAttributes.JSON_PROPERTY_SEVERITY,
  AgentHealthIssueAttributes.JSON_PROPERTY_STATE,
  AgentHealthIssueAttributes.JSON_PROPERTY_TAGS,
  AgentHealthIssueAttributes.JSON_PROPERTY_TITLE,
  AgentHealthIssueAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AgentHealthIssueAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FIRST_SEEN_AT = "first_seen_at";
  private OffsetDateTime firstSeenAt;

  public static final String JSON_PROPERTY_ISSUE_NAME = "issue_name";
  private String issueName;

  public static final String JSON_PROPERTY_ISSUE_TYPE = "issue_type";
  private String issueType;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_RESOURCE_KIND = "resource_kind";
  private String resourceKind;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AgentHealthIssueAttributes() {}

  @JsonCreator
  public AgentHealthIssueAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_NAME) String issueName,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_TYPE) String issueType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_ID) String resourceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_KIND) String resourceKind,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY) String severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE) String state) {
    this.issueName = issueName;
    this.issueType = issueType;
    this.resourceId = resourceId;
    this.resourceKind = resourceKind;
    this.severity = severity;
    this.state = state;
  }

  public AgentHealthIssueAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the issue, such as <code>configuration</code>. Omitted when not set.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AgentHealthIssueAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue. Omitted when empty.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AgentHealthIssueAttributes firstSeenAt(OffsetDateTime firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

  /**
   * The time the issue was first seen, in RFC 3339 format. Omitted when empty.
   *
   * @return firstSeenAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getFirstSeenAt() {
    return firstSeenAt;
  }

  public void setFirstSeenAt(OffsetDateTime firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
  }

  public AgentHealthIssueAttributes issueName(String issueName) {
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

  public AgentHealthIssueAttributes issueType(String issueType) {
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

  public AgentHealthIssueAttributes resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The identifier of the affected resource, interpreted according to <code>resource_kind</code>:
   * hostname for <code>host</code>, DaemonSet UID for <code>deployment</code> (node Agent), cluster
   * UUID for <code>cluster</code>, hostname of the host running the Cluster Agent for <code>
   * cluster_agent</code>, or OpenTelemetry collector ID for <code>otel</code>.
   *
   * @return resourceId
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public AgentHealthIssueAttributes resourceKind(String resourceKind) {
    this.resourceKind = resourceKind;
    return this;
  }

  /**
   * The kind of affected resource. Known values are <code>host</code>, <code>deployment</code>,
   * <code>cluster</code>, <code>cluster_agent</code>, and <code>otel</code>.
   *
   * @return resourceKind
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceKind() {
    return resourceKind;
  }

  public void setResourceKind(String resourceKind) {
    this.resourceKind = resourceKind;
  }

  public AgentHealthIssueAttributes resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of the affected resource. Omitted when empty.
   *
   * @return resourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public AgentHealthIssueAttributes severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of the issue. Known values are <code>low</code>, <code>medium</code>, <code>high
   * </code>, and <code>unknown</code>.
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public AgentHealthIssueAttributes state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state of the issue. Only issues with state <code>open</code> are returned.
   *
   * @return state
   */
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AgentHealthIssueAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AgentHealthIssueAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the issue. Omitted when empty.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public AgentHealthIssueAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the issue. Omitted when empty.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AgentHealthIssueAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time the issue was last updated, in RFC 3339 format. Omitted when empty.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return AgentHealthIssueAttributes
   */
  @JsonAnySetter
  public AgentHealthIssueAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AgentHealthIssueAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentHealthIssueAttributes agentHealthIssueAttributes = (AgentHealthIssueAttributes) o;
    return Objects.equals(this.category, agentHealthIssueAttributes.category)
        && Objects.equals(this.description, agentHealthIssueAttributes.description)
        && Objects.equals(this.firstSeenAt, agentHealthIssueAttributes.firstSeenAt)
        && Objects.equals(this.issueName, agentHealthIssueAttributes.issueName)
        && Objects.equals(this.issueType, agentHealthIssueAttributes.issueType)
        && Objects.equals(this.resourceId, agentHealthIssueAttributes.resourceId)
        && Objects.equals(this.resourceKind, agentHealthIssueAttributes.resourceKind)
        && Objects.equals(this.resourceType, agentHealthIssueAttributes.resourceType)
        && Objects.equals(this.severity, agentHealthIssueAttributes.severity)
        && Objects.equals(this.state, agentHealthIssueAttributes.state)
        && Objects.equals(this.tags, agentHealthIssueAttributes.tags)
        && Objects.equals(this.title, agentHealthIssueAttributes.title)
        && Objects.equals(this.updatedAt, agentHealthIssueAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, agentHealthIssueAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        description,
        firstSeenAt,
        issueName,
        issueType,
        resourceId,
        resourceKind,
        resourceType,
        severity,
        state,
        tags,
        title,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentHealthIssueAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    issueName: ").append(toIndentedString(issueName)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceKind: ").append(toIndentedString(resourceKind)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
