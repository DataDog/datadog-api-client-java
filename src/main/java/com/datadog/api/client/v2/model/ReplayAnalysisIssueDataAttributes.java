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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a RUM replay analysis issue. */
@JsonPropertyOrder({
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_AFFECTED_SESSIONS,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_APPLICATION_ID,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_CREATED_AT,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_JOURNEY_QUERY,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_NAME,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_REPRESENTATIVE_SESSION,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_SESSION_COUNT,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_SEVERITY,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_UPDATED_AT,
  ReplayAnalysisIssueDataAttributes.JSON_PROPERTY_VALIDATION_VERDICT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReplayAnalysisIssueDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AFFECTED_SESSIONS = "affected_sessions";
  private List<ReplayAnalysisAffectedSession> affectedSessions = new ArrayList<>();

  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_JOURNEY_QUERY = "journey_query";
  private JsonNullable<Map<String, Object>> journeyQuery =
      JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REPRESENTATIVE_SESSION = "representative_session";
  private ReplayAnalysisRepresentativeSession representativeSession;

  public static final String JSON_PROPERTY_SESSION_COUNT = "session_count";
  private Long sessionCount;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_VALIDATION_VERDICT = "validation_verdict";
  private String validationVerdict;

  public ReplayAnalysisIssueDataAttributes() {}

  @JsonCreator
  public ReplayAnalysisIssueDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AFFECTED_SESSIONS)
          List<ReplayAnalysisAffectedSession> affectedSessions,
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) String applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPRESENTATIVE_SESSION)
          ReplayAnalysisRepresentativeSession representativeSession,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_COUNT) Long sessionCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY) String severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALIDATION_VERDICT)
          String validationVerdict) {
    this.affectedSessions = affectedSessions;
    this.applicationId = applicationId;
    this.createdAt = createdAt;
    this.description = description;
    this.name = name;
    this.representativeSession = representativeSession;
    this.unparsed |= representativeSession.unparsed;
    this.sessionCount = sessionCount;
    this.severity = severity;
    this.updatedAt = updatedAt;
    this.validationVerdict = validationVerdict;
  }

  public ReplayAnalysisIssueDataAttributes affectedSessions(
      List<ReplayAnalysisAffectedSession> affectedSessions) {
    this.affectedSessions = affectedSessions;
    for (ReplayAnalysisAffectedSession item : affectedSessions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ReplayAnalysisIssueDataAttributes addAffectedSessionsItem(
      ReplayAnalysisAffectedSession affectedSessionsItem) {
    this.affectedSessions.add(affectedSessionsItem);
    this.unparsed |= affectedSessionsItem.unparsed;
    return this;
  }

  /**
   * Up to three sample sessions affected by this issue.
   *
   * @return affectedSessions
   */
  @JsonProperty(JSON_PROPERTY_AFFECTED_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ReplayAnalysisAffectedSession> getAffectedSessions() {
    return affectedSessions;
  }

  public void setAffectedSessions(List<ReplayAnalysisAffectedSession> affectedSessions) {
    this.affectedSessions = affectedSessions;
  }

  public ReplayAnalysisIssueDataAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Unique identifier of the application where the issue was detected.
   *
   * @return applicationId
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public ReplayAnalysisIssueDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the issue was first detected.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ReplayAnalysisIssueDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable description of the issue.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReplayAnalysisIssueDataAttributes journeyQuery(Map<String, Object> journeyQuery) {
    this.journeyQuery = JsonNullable.<Map<String, Object>>of(journeyQuery);
    return this;
  }

  public ReplayAnalysisIssueDataAttributes putJourneyQueryItem(
      String key, Object journeyQueryItem) {
    if (this.journeyQuery == null || !this.journeyQuery.isPresent()) {
      this.journeyQuery = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.journeyQuery.get().put(key, journeyQueryItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Journey query associated with the issue.
   *
   * @return journeyQuery
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getJourneyQuery() {
    return journeyQuery.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOURNEY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getJourneyQuery_JsonNullable() {
    return journeyQuery;
  }

  @JsonProperty(JSON_PROPERTY_JOURNEY_QUERY)
  public void setJourneyQuery_JsonNullable(JsonNullable<Map<String, Object>> journeyQuery) {
    this.journeyQuery = journeyQuery;
  }

  public void setJourneyQuery(Map<String, Object> journeyQuery) {
    this.journeyQuery = JsonNullable.<Map<String, Object>>of(journeyQuery);
  }

  public ReplayAnalysisIssueDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the issue.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReplayAnalysisIssueDataAttributes representativeSession(
      ReplayAnalysisRepresentativeSession representativeSession) {
    this.representativeSession = representativeSession;
    this.unparsed |= representativeSession.unparsed;
    return this;
  }

  /**
   * A representative session illustrating a replay analysis issue.
   *
   * @return representativeSession
   */
  @JsonProperty(JSON_PROPERTY_REPRESENTATIVE_SESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReplayAnalysisRepresentativeSession getRepresentativeSession() {
    return representativeSession;
  }

  public void setRepresentativeSession(ReplayAnalysisRepresentativeSession representativeSession) {
    this.representativeSession = representativeSession;
  }

  public ReplayAnalysisIssueDataAttributes sessionCount(Long sessionCount) {
    this.sessionCount = sessionCount;
    return this;
  }

  /**
   * Total number of sessions affected by this issue.
   *
   * @return sessionCount
   */
  @JsonProperty(JSON_PROPERTY_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionCount() {
    return sessionCount;
  }

  public void setSessionCount(Long sessionCount) {
    this.sessionCount = sessionCount;
  }

  public ReplayAnalysisIssueDataAttributes severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Severity level of the issue. Valid values are <code>high</code>, <code>medium</code>, and
   * <code>low</code>.
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

  public ReplayAnalysisIssueDataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the issue was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ReplayAnalysisIssueDataAttributes validationVerdict(String validationVerdict) {
    this.validationVerdict = validationVerdict;
    return this;
  }

  /**
   * Validation status of the issue.
   *
   * @return validationVerdict
   */
  @JsonProperty(JSON_PROPERTY_VALIDATION_VERDICT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValidationVerdict() {
    return validationVerdict;
  }

  public void setValidationVerdict(String validationVerdict) {
    this.validationVerdict = validationVerdict;
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
   * @return ReplayAnalysisIssueDataAttributes
   */
  @JsonAnySetter
  public ReplayAnalysisIssueDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReplayAnalysisIssueDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplayAnalysisIssueDataAttributes replayAnalysisIssueDataAttributes =
        (ReplayAnalysisIssueDataAttributes) o;
    return Objects.equals(this.affectedSessions, replayAnalysisIssueDataAttributes.affectedSessions)
        && Objects.equals(this.applicationId, replayAnalysisIssueDataAttributes.applicationId)
        && Objects.equals(this.createdAt, replayAnalysisIssueDataAttributes.createdAt)
        && Objects.equals(this.description, replayAnalysisIssueDataAttributes.description)
        && Objects.equals(this.journeyQuery, replayAnalysisIssueDataAttributes.journeyQuery)
        && Objects.equals(this.name, replayAnalysisIssueDataAttributes.name)
        && Objects.equals(
            this.representativeSession, replayAnalysisIssueDataAttributes.representativeSession)
        && Objects.equals(this.sessionCount, replayAnalysisIssueDataAttributes.sessionCount)
        && Objects.equals(this.severity, replayAnalysisIssueDataAttributes.severity)
        && Objects.equals(this.updatedAt, replayAnalysisIssueDataAttributes.updatedAt)
        && Objects.equals(
            this.validationVerdict, replayAnalysisIssueDataAttributes.validationVerdict)
        && Objects.equals(
            this.additionalProperties, replayAnalysisIssueDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        affectedSessions,
        applicationId,
        createdAt,
        description,
        journeyQuery,
        name,
        representativeSession,
        sessionCount,
        severity,
        updatedAt,
        validationVerdict,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplayAnalysisIssueDataAttributes {\n");
    sb.append("    affectedSessions: ").append(toIndentedString(affectedSessions)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    journeyQuery: ").append(toIndentedString(journeyQuery)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    representativeSession: ")
        .append(toIndentedString(representativeSession))
        .append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    validationVerdict: ").append(toIndentedString(validationVerdict)).append("\n");
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
