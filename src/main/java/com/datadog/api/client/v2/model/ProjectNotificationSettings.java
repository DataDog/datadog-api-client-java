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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Project notification settings */
@JsonPropertyOrder({
  ProjectNotificationSettings.JSON_PROPERTY_DESTINATIONS,
  ProjectNotificationSettings.JSON_PROPERTY_ENABLED,
  ProjectNotificationSettings.JSON_PROPERTY_NOTIFY_ON_CASE_ASSIGNMENT,
  ProjectNotificationSettings.JSON_PROPERTY_NOTIFY_ON_CASE_CLOSED,
  ProjectNotificationSettings.JSON_PROPERTY_NOTIFY_ON_CASE_COMMENT,
  ProjectNotificationSettings.JSON_PROPERTY_NOTIFY_ON_CASE_COMMENT_MENTION,
  ProjectNotificationSettings.JSON_PROPERTY_NOTIFY_ON_CASE_PRIORITY_CHANGE,
  ProjectNotificationSettings.JSON_PROPERTY_NOTIFY_ON_CASE_STATUS_CHANGE,
  ProjectNotificationSettings.JSON_PROPERTY_NOTIFY_ON_CASE_UNASSIGNMENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProjectNotificationSettings {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATIONS = "destinations";
  private List<Integer> destinations = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NOTIFY_ON_CASE_ASSIGNMENT = "notify_on_case_assignment";
  private Boolean notifyOnCaseAssignment;

  public static final String JSON_PROPERTY_NOTIFY_ON_CASE_CLOSED = "notify_on_case_closed";
  private Boolean notifyOnCaseClosed;

  public static final String JSON_PROPERTY_NOTIFY_ON_CASE_COMMENT = "notify_on_case_comment";
  private Boolean notifyOnCaseComment;

  public static final String JSON_PROPERTY_NOTIFY_ON_CASE_COMMENT_MENTION =
      "notify_on_case_comment_mention";
  private Boolean notifyOnCaseCommentMention;

  public static final String JSON_PROPERTY_NOTIFY_ON_CASE_PRIORITY_CHANGE =
      "notify_on_case_priority_change";
  private Boolean notifyOnCasePriorityChange;

  public static final String JSON_PROPERTY_NOTIFY_ON_CASE_STATUS_CHANGE =
      "notify_on_case_status_change";
  private Boolean notifyOnCaseStatusChange;

  public static final String JSON_PROPERTY_NOTIFY_ON_CASE_UNASSIGNMENT =
      "notify_on_case_unassignment";
  private Boolean notifyOnCaseUnassignment;

  public ProjectNotificationSettings destinations(List<Integer> destinations) {
    this.destinations = destinations;
    return this;
  }

  public ProjectNotificationSettings addDestinationsItem(Integer destinationsItem) {
    if (this.destinations == null) {
      this.destinations = new ArrayList<>();
    }
    this.destinations.add(destinationsItem);
    return this;
  }

  /**
   * Notification destinations (1=email, 2=slack, 3=in-app)
   *
   * @return destinations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Integer> getDestinations() {
    return destinations;
  }

  public void setDestinations(List<Integer> destinations) {
    this.destinations = destinations;
  }

  public ProjectNotificationSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether notifications are enabled
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ProjectNotificationSettings notifyOnCaseAssignment(Boolean notifyOnCaseAssignment) {
    this.notifyOnCaseAssignment = notifyOnCaseAssignment;
    return this;
  }

  /**
   * GetnotifyOnCaseAssignment
   *
   * @return notifyOnCaseAssignment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CASE_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifyOnCaseAssignment() {
    return notifyOnCaseAssignment;
  }

  public void setNotifyOnCaseAssignment(Boolean notifyOnCaseAssignment) {
    this.notifyOnCaseAssignment = notifyOnCaseAssignment;
  }

  public ProjectNotificationSettings notifyOnCaseClosed(Boolean notifyOnCaseClosed) {
    this.notifyOnCaseClosed = notifyOnCaseClosed;
    return this;
  }

  /**
   * GetnotifyOnCaseClosed
   *
   * @return notifyOnCaseClosed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CASE_CLOSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifyOnCaseClosed() {
    return notifyOnCaseClosed;
  }

  public void setNotifyOnCaseClosed(Boolean notifyOnCaseClosed) {
    this.notifyOnCaseClosed = notifyOnCaseClosed;
  }

  public ProjectNotificationSettings notifyOnCaseComment(Boolean notifyOnCaseComment) {
    this.notifyOnCaseComment = notifyOnCaseComment;
    return this;
  }

  /**
   * GetnotifyOnCaseComment
   *
   * @return notifyOnCaseComment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CASE_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifyOnCaseComment() {
    return notifyOnCaseComment;
  }

  public void setNotifyOnCaseComment(Boolean notifyOnCaseComment) {
    this.notifyOnCaseComment = notifyOnCaseComment;
  }

  public ProjectNotificationSettings notifyOnCaseCommentMention(
      Boolean notifyOnCaseCommentMention) {
    this.notifyOnCaseCommentMention = notifyOnCaseCommentMention;
    return this;
  }

  /**
   * GetnotifyOnCaseCommentMention
   *
   * @return notifyOnCaseCommentMention
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CASE_COMMENT_MENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifyOnCaseCommentMention() {
    return notifyOnCaseCommentMention;
  }

  public void setNotifyOnCaseCommentMention(Boolean notifyOnCaseCommentMention) {
    this.notifyOnCaseCommentMention = notifyOnCaseCommentMention;
  }

  public ProjectNotificationSettings notifyOnCasePriorityChange(
      Boolean notifyOnCasePriorityChange) {
    this.notifyOnCasePriorityChange = notifyOnCasePriorityChange;
    return this;
  }

  /**
   * GetnotifyOnCasePriorityChange
   *
   * @return notifyOnCasePriorityChange
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CASE_PRIORITY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifyOnCasePriorityChange() {
    return notifyOnCasePriorityChange;
  }

  public void setNotifyOnCasePriorityChange(Boolean notifyOnCasePriorityChange) {
    this.notifyOnCasePriorityChange = notifyOnCasePriorityChange;
  }

  public ProjectNotificationSettings notifyOnCaseStatusChange(Boolean notifyOnCaseStatusChange) {
    this.notifyOnCaseStatusChange = notifyOnCaseStatusChange;
    return this;
  }

  /**
   * GetnotifyOnCaseStatusChange
   *
   * @return notifyOnCaseStatusChange
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CASE_STATUS_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifyOnCaseStatusChange() {
    return notifyOnCaseStatusChange;
  }

  public void setNotifyOnCaseStatusChange(Boolean notifyOnCaseStatusChange) {
    this.notifyOnCaseStatusChange = notifyOnCaseStatusChange;
  }

  public ProjectNotificationSettings notifyOnCaseUnassignment(Boolean notifyOnCaseUnassignment) {
    this.notifyOnCaseUnassignment = notifyOnCaseUnassignment;
    return this;
  }

  /**
   * GetnotifyOnCaseUnassignment
   *
   * @return notifyOnCaseUnassignment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CASE_UNASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifyOnCaseUnassignment() {
    return notifyOnCaseUnassignment;
  }

  public void setNotifyOnCaseUnassignment(Boolean notifyOnCaseUnassignment) {
    this.notifyOnCaseUnassignment = notifyOnCaseUnassignment;
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
   * @return ProjectNotificationSettings
   */
  @JsonAnySetter
  public ProjectNotificationSettings putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProjectNotificationSettings object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectNotificationSettings projectNotificationSettings = (ProjectNotificationSettings) o;
    return Objects.equals(this.destinations, projectNotificationSettings.destinations)
        && Objects.equals(this.enabled, projectNotificationSettings.enabled)
        && Objects.equals(
            this.notifyOnCaseAssignment, projectNotificationSettings.notifyOnCaseAssignment)
        && Objects.equals(this.notifyOnCaseClosed, projectNotificationSettings.notifyOnCaseClosed)
        && Objects.equals(this.notifyOnCaseComment, projectNotificationSettings.notifyOnCaseComment)
        && Objects.equals(
            this.notifyOnCaseCommentMention, projectNotificationSettings.notifyOnCaseCommentMention)
        && Objects.equals(
            this.notifyOnCasePriorityChange, projectNotificationSettings.notifyOnCasePriorityChange)
        && Objects.equals(
            this.notifyOnCaseStatusChange, projectNotificationSettings.notifyOnCaseStatusChange)
        && Objects.equals(
            this.notifyOnCaseUnassignment, projectNotificationSettings.notifyOnCaseUnassignment)
        && Objects.equals(
            this.additionalProperties, projectNotificationSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destinations,
        enabled,
        notifyOnCaseAssignment,
        notifyOnCaseClosed,
        notifyOnCaseComment,
        notifyOnCaseCommentMention,
        notifyOnCasePriorityChange,
        notifyOnCaseStatusChange,
        notifyOnCaseUnassignment,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectNotificationSettings {\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    notifyOnCaseAssignment: ")
        .append(toIndentedString(notifyOnCaseAssignment))
        .append("\n");
    sb.append("    notifyOnCaseClosed: ").append(toIndentedString(notifyOnCaseClosed)).append("\n");
    sb.append("    notifyOnCaseComment: ")
        .append(toIndentedString(notifyOnCaseComment))
        .append("\n");
    sb.append("    notifyOnCaseCommentMention: ")
        .append(toIndentedString(notifyOnCaseCommentMention))
        .append("\n");
    sb.append("    notifyOnCasePriorityChange: ")
        .append(toIndentedString(notifyOnCasePriorityChange))
        .append("\n");
    sb.append("    notifyOnCaseStatusChange: ")
        .append(toIndentedString(notifyOnCaseStatusChange))
        .append("\n");
    sb.append("    notifyOnCaseUnassignment: ")
        .append(toIndentedString(notifyOnCaseUnassignment))
        .append("\n");
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
