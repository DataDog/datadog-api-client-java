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
import java.util.UUID;

/** The action to take when the ticket creation rule matches a finding. */
@JsonPropertyOrder({
  TicketCreationRuleActionResponse.JSON_PROPERTY_ASSIGNEE_ID,
  TicketCreationRuleActionResponse.JSON_PROPERTY_AUTO_DISABLED_REASON,
  TicketCreationRuleActionResponse.JSON_PROPERTY_FIELDS,
  TicketCreationRuleActionResponse.JSON_PROPERTY_MAX_TICKETS_PER_DAY,
  TicketCreationRuleActionResponse.JSON_PROPERTY_PROJECT_ID,
  TicketCreationRuleActionResponse.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TicketCreationRuleActionResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE_ID = "assignee_id";
  private UUID assigneeId;

  public static final String JSON_PROPERTY_AUTO_DISABLED_REASON = "auto_disabled_reason";
  private String autoDisabledReason;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Object fields;

  public static final String JSON_PROPERTY_MAX_TICKETS_PER_DAY = "max_tickets_per_day";
  private Long maxTicketsPerDay;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private UUID projectId;

  public static final String JSON_PROPERTY_TARGET = "target";
  private TicketCreationTarget target;

  public TicketCreationRuleActionResponse() {}

  @JsonCreator
  public TicketCreationRuleActionResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_TICKETS_PER_DAY)
          Long maxTicketsPerDay,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) UUID projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) TicketCreationTarget target) {
    this.maxTicketsPerDay = maxTicketsPerDay;
    this.projectId = projectId;
    this.target = target;
    this.unparsed |= !target.isValid();
  }

  public TicketCreationRuleActionResponse assigneeId(UUID assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * The UUID of the default assignee for created tickets.
   *
   * @return assigneeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(UUID assigneeId) {
    this.assigneeId = assigneeId;
  }

  public TicketCreationRuleActionResponse autoDisabledReason(String autoDisabledReason) {
    this.autoDisabledReason = autoDisabledReason;
    return this;
  }

  /**
   * The reason the rule was automatically disabled by the system due to a ticketing integration
   * error.
   *
   * @return autoDisabledReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_DISABLED_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAutoDisabledReason() {
    return autoDisabledReason;
  }

  public void setAutoDisabledReason(String autoDisabledReason) {
    this.autoDisabledReason = autoDisabledReason;
  }

  public TicketCreationRuleActionResponse fields(Object fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Custom fields of the Jira issue to create. For the list of available fields, see <a
   * href="https://developer.atlassian.com/cloud/jira/platform/rest/v2/api-group-issues/#api-rest-api-2-issue-createmeta-projectidorkey-issuetypes-issuetypeid-get">Jira
   * documentation</a>.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getFields() {
    return fields;
  }

  public void setFields(Object fields) {
    this.fields = fields;
  }

  public TicketCreationRuleActionResponse maxTicketsPerDay(Long maxTicketsPerDay) {
    this.maxTicketsPerDay = maxTicketsPerDay;
    return this;
  }

  /**
   * The maximum number of tickets the rule may create per day. If exceeded, one final ticket will
   * be created, explaining the limit was hit and link back to the responsible rule. minimum: 1
   * maximum: 500
   *
   * @return maxTicketsPerDay
   */
  @JsonProperty(JSON_PROPERTY_MAX_TICKETS_PER_DAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMaxTicketsPerDay() {
    return maxTicketsPerDay;
  }

  public void setMaxTicketsPerDay(Long maxTicketsPerDay) {
    this.maxTicketsPerDay = maxTicketsPerDay;
  }

  public TicketCreationRuleActionResponse projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The UUID of the case management project.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public TicketCreationRuleActionResponse target(TicketCreationTarget target) {
    this.target = target;
    this.unparsed |= !target.isValid();
    return this;
  }

  /**
   * The ticketing system to create tickets in.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TicketCreationTarget getTarget() {
    return target;
  }

  public void setTarget(TicketCreationTarget target) {
    if (!target.isValid()) {
      this.unparsed = true;
    }
    this.target = target;
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
   * @return TicketCreationRuleActionResponse
   */
  @JsonAnySetter
  public TicketCreationRuleActionResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TicketCreationRuleActionResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketCreationRuleActionResponse ticketCreationRuleActionResponse =
        (TicketCreationRuleActionResponse) o;
    return Objects.equals(this.assigneeId, ticketCreationRuleActionResponse.assigneeId)
        && Objects.equals(
            this.autoDisabledReason, ticketCreationRuleActionResponse.autoDisabledReason)
        && Objects.equals(this.fields, ticketCreationRuleActionResponse.fields)
        && Objects.equals(this.maxTicketsPerDay, ticketCreationRuleActionResponse.maxTicketsPerDay)
        && Objects.equals(this.projectId, ticketCreationRuleActionResponse.projectId)
        && Objects.equals(this.target, ticketCreationRuleActionResponse.target)
        && Objects.equals(
            this.additionalProperties, ticketCreationRuleActionResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assigneeId,
        autoDisabledReason,
        fields,
        maxTicketsPerDay,
        projectId,
        target,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketCreationRuleActionResponse {\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    autoDisabledReason: ").append(toIndentedString(autoDisabledReason)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    maxTicketsPerDay: ").append(toIndentedString(maxTicketsPerDay)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
