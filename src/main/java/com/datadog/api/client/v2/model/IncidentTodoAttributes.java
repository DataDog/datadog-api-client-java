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
import org.openapitools.jackson.nullable.JsonNullable;

/** Incident todo's attributes. */
@JsonPropertyOrder({
  IncidentTodoAttributes.JSON_PROPERTY_ASSIGNEES,
  IncidentTodoAttributes.JSON_PROPERTY_COMPLETED,
  IncidentTodoAttributes.JSON_PROPERTY_CONTENT,
  IncidentTodoAttributes.JSON_PROPERTY_DUE_DATE,
  IncidentTodoAttributes.JSON_PROPERTY_INCIDENT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTodoAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEES = "assignees";
  private List<IncidentTodoAssignee> assignees = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPLETED = "completed";
  private JsonNullable<String> completed = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_DUE_DATE = "due_date";
  private JsonNullable<String> dueDate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INCIDENT_ID = "incident_id";
  private String incidentId;

  public IncidentTodoAttributes() {}

  @JsonCreator
  public IncidentTodoAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSIGNEES)
          List<IncidentTodoAssignee> assignees,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content) {
    this.assignees = assignees;
    this.content = content;
  }

  public IncidentTodoAttributes assignees(List<IncidentTodoAssignee> assignees) {
    this.assignees = assignees;
    for (IncidentTodoAssignee item : assignees) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentTodoAttributes addAssigneesItem(IncidentTodoAssignee assigneesItem) {
    this.assignees.add(assigneesItem);
    this.unparsed |= assigneesItem.unparsed;
    return this;
  }

  /**
   * Array of todo assignees.
   *
   * @return assignees
   */
  @JsonProperty(JSON_PROPERTY_ASSIGNEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentTodoAssignee> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<IncidentTodoAssignee> assignees) {
    this.assignees = assignees;
  }

  public IncidentTodoAttributes completed(String completed) {
    this.completed = JsonNullable.<String>of(completed);
    return this;
  }

  /**
   * Timestamp when the todo was completed.
   *
   * @return completed
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCompleted() {
    return completed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCompleted_JsonNullable() {
    return completed;
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED)
  public void setCompleted_JsonNullable(JsonNullable<String> completed) {
    this.completed = completed;
  }

  public void setCompleted(String completed) {
    this.completed = JsonNullable.<String>of(completed);
  }

  public IncidentTodoAttributes content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The follow-up task's content.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public IncidentTodoAttributes dueDate(String dueDate) {
    this.dueDate = JsonNullable.<String>of(dueDate);
    return this;
  }

  /**
   * Timestamp when the todo should be completed by.
   *
   * @return dueDate
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDueDate() {
    return dueDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDueDate_JsonNullable() {
    return dueDate;
  }

  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  public void setDueDate_JsonNullable(JsonNullable<String> dueDate) {
    this.dueDate = dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = JsonNullable.<String>of(dueDate);
  }

  public IncidentTodoAttributes incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * UUID of the incident this todo is connected to.
   *
   * @return incidentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  /** Return true if this IncidentTodoAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTodoAttributes incidentTodoAttributes = (IncidentTodoAttributes) o;
    return Objects.equals(this.assignees, incidentTodoAttributes.assignees)
        && Objects.equals(this.completed, incidentTodoAttributes.completed)
        && Objects.equals(this.content, incidentTodoAttributes.content)
        && Objects.equals(this.dueDate, incidentTodoAttributes.dueDate)
        && Objects.equals(this.incidentId, incidentTodoAttributes.incidentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignees, completed, content, dueDate, incidentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTodoAttributes {\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
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
