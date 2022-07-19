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

/** Attributes describing a triage state update operation over a security signal. */
@JsonPropertyOrder({
  SecurityMonitoringSignalTriageAttributes.JSON_PROPERTY_ARCHIVE_COMMENT,
  SecurityMonitoringSignalTriageAttributes.JSON_PROPERTY_ARCHIVE_COMMENT_TIMESTAMP,
  SecurityMonitoringSignalTriageAttributes.JSON_PROPERTY_ARCHIVE_COMMENT_USER,
  SecurityMonitoringSignalTriageAttributes.JSON_PROPERTY_ARCHIVE_REASON,
  SecurityMonitoringSignalTriageAttributes.JSON_PROPERTY_ASSIGNEE,
  SecurityMonitoringSignalTriageAttributes.JSON_PROPERTY_INCIDENT_IDS,
  SecurityMonitoringSignalTriageAttributes.JSON_PROPERTY_STATE,
  SecurityMonitoringSignalTriageAttributes.JSON_PROPERTY_STATE_UPDATE_TIMESTAMP,
  SecurityMonitoringSignalTriageAttributes.JSON_PROPERTY_STATE_UPDATE_USER
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalTriageAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVE_COMMENT = "archive_comment";
  private String archiveComment;

  public static final String JSON_PROPERTY_ARCHIVE_COMMENT_TIMESTAMP = "archive_comment_timestamp";
  private Long archiveCommentTimestamp;

  public static final String JSON_PROPERTY_ARCHIVE_COMMENT_USER = "archive_comment_user";
  private SecurityMonitoringTriageUser archiveCommentUser;

  public static final String JSON_PROPERTY_ARCHIVE_REASON = "archive_reason";
  private SecurityMonitoringSignalArchiveReason archiveReason;

  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private SecurityMonitoringTriageUser assignee;

  public static final String JSON_PROPERTY_INCIDENT_IDS = "incident_ids";
  private List<Long> incidentIds = new ArrayList<>();

  public static final String JSON_PROPERTY_STATE = "state";
  private SecurityMonitoringSignalState state;

  public static final String JSON_PROPERTY_STATE_UPDATE_TIMESTAMP = "state_update_timestamp";
  private Long stateUpdateTimestamp;

  public static final String JSON_PROPERTY_STATE_UPDATE_USER = "state_update_user";
  private SecurityMonitoringTriageUser stateUpdateUser;

  public SecurityMonitoringSignalTriageAttributes() {}

  @JsonCreator
  public SecurityMonitoringSignalTriageAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSIGNEE)
          SecurityMonitoringTriageUser assignee,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_IDS) List<Long> incidentIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE)
          SecurityMonitoringSignalState state) {
    this.assignee = assignee;
    this.unparsed |= assignee.unparsed;
    this.incidentIds = incidentIds;
    this.state = state;
    this.unparsed |= !state.isValid();
  }

  public SecurityMonitoringSignalTriageAttributes archiveComment(String archiveComment) {
    this.archiveComment = archiveComment;
    return this;
  }

  /**
   * Optional comment to display on archived signals.
   *
   * @return archiveComment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArchiveComment() {
    return archiveComment;
  }

  public void setArchiveComment(String archiveComment) {
    this.archiveComment = archiveComment;
  }

  public SecurityMonitoringSignalTriageAttributes archiveCommentTimestamp(
      Long archiveCommentTimestamp) {
    this.archiveCommentTimestamp = archiveCommentTimestamp;
    return this;
  }

  /**
   * Timestamp of the last edit to the comment. minimum: 0
   *
   * @return archiveCommentTimestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE_COMMENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getArchiveCommentTimestamp() {
    return archiveCommentTimestamp;
  }

  public void setArchiveCommentTimestamp(Long archiveCommentTimestamp) {
    this.archiveCommentTimestamp = archiveCommentTimestamp;
  }

  public SecurityMonitoringSignalTriageAttributes archiveCommentUser(
      SecurityMonitoringTriageUser archiveCommentUser) {
    this.archiveCommentUser = archiveCommentUser;
    this.unparsed |= archiveCommentUser.unparsed;
    return this;
  }

  /**
   * Object representing a given user entity.
   *
   * @return archiveCommentUser
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE_COMMENT_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringTriageUser getArchiveCommentUser() {
    return archiveCommentUser;
  }

  public void setArchiveCommentUser(SecurityMonitoringTriageUser archiveCommentUser) {
    this.archiveCommentUser = archiveCommentUser;
  }

  public SecurityMonitoringSignalTriageAttributes archiveReason(
      SecurityMonitoringSignalArchiveReason archiveReason) {
    this.archiveReason = archiveReason;
    this.unparsed |= !archiveReason.isValid();
    return this;
  }

  /**
   * Reason a signal is archived.
   *
   * @return archiveReason
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringSignalArchiveReason getArchiveReason() {
    return archiveReason;
  }

  public void setArchiveReason(SecurityMonitoringSignalArchiveReason archiveReason) {
    if (!archiveReason.isValid()) {
      this.unparsed = true;
    }
    this.archiveReason = archiveReason;
  }

  public SecurityMonitoringSignalTriageAttributes assignee(SecurityMonitoringTriageUser assignee) {
    this.assignee = assignee;
    this.unparsed |= assignee.unparsed;
    return this;
  }

  /**
   * Object representing a given user entity.
   *
   * @return assignee
   */
  @JsonProperty(JSON_PROPERTY_ASSIGNEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringTriageUser getAssignee() {
    return assignee;
  }

  public void setAssignee(SecurityMonitoringTriageUser assignee) {
    this.assignee = assignee;
  }

  public SecurityMonitoringSignalTriageAttributes incidentIds(List<Long> incidentIds) {
    this.incidentIds = incidentIds;
    return this;
  }

  public SecurityMonitoringSignalTriageAttributes addIncidentIdsItem(Long incidentIdsItem) {
    this.incidentIds.add(incidentIdsItem);
    return this;
  }

  /**
   * Array of incidents that are associated with this signal.
   *
   * @return incidentIds
   */
  @JsonProperty(JSON_PROPERTY_INCIDENT_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Long> getIncidentIds() {
    return incidentIds;
  }

  public void setIncidentIds(List<Long> incidentIds) {
    this.incidentIds = incidentIds;
  }

  public SecurityMonitoringSignalTriageAttributes state(SecurityMonitoringSignalState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * The new triage state of the signal.
   *
   * @return state
   */
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringSignalState getState() {
    return state;
  }

  public void setState(SecurityMonitoringSignalState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public SecurityMonitoringSignalTriageAttributes stateUpdateTimestamp(Long stateUpdateTimestamp) {
    this.stateUpdateTimestamp = stateUpdateTimestamp;
    return this;
  }

  /**
   * Timestamp of the last update to the signal state. minimum: 0
   *
   * @return stateUpdateTimestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_UPDATE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStateUpdateTimestamp() {
    return stateUpdateTimestamp;
  }

  public void setStateUpdateTimestamp(Long stateUpdateTimestamp) {
    this.stateUpdateTimestamp = stateUpdateTimestamp;
  }

  public SecurityMonitoringSignalTriageAttributes stateUpdateUser(
      SecurityMonitoringTriageUser stateUpdateUser) {
    this.stateUpdateUser = stateUpdateUser;
    this.unparsed |= stateUpdateUser.unparsed;
    return this;
  }

  /**
   * Object representing a given user entity.
   *
   * @return stateUpdateUser
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringTriageUser getStateUpdateUser() {
    return stateUpdateUser;
  }

  public void setStateUpdateUser(SecurityMonitoringTriageUser stateUpdateUser) {
    this.stateUpdateUser = stateUpdateUser;
  }

  /** Return true if this SecurityMonitoringSignalTriageAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalTriageAttributes securityMonitoringSignalTriageAttributes =
        (SecurityMonitoringSignalTriageAttributes) o;
    return Objects.equals(
            this.archiveComment, securityMonitoringSignalTriageAttributes.archiveComment)
        && Objects.equals(
            this.archiveCommentTimestamp,
            securityMonitoringSignalTriageAttributes.archiveCommentTimestamp)
        && Objects.equals(
            this.archiveCommentUser, securityMonitoringSignalTriageAttributes.archiveCommentUser)
        && Objects.equals(
            this.archiveReason, securityMonitoringSignalTriageAttributes.archiveReason)
        && Objects.equals(this.assignee, securityMonitoringSignalTriageAttributes.assignee)
        && Objects.equals(this.incidentIds, securityMonitoringSignalTriageAttributes.incidentIds)
        && Objects.equals(this.state, securityMonitoringSignalTriageAttributes.state)
        && Objects.equals(
            this.stateUpdateTimestamp,
            securityMonitoringSignalTriageAttributes.stateUpdateTimestamp)
        && Objects.equals(
            this.stateUpdateUser, securityMonitoringSignalTriageAttributes.stateUpdateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archiveComment,
        archiveCommentTimestamp,
        archiveCommentUser,
        archiveReason,
        assignee,
        incidentIds,
        state,
        stateUpdateTimestamp,
        stateUpdateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalTriageAttributes {\n");
    sb.append("    archiveComment: ").append(toIndentedString(archiveComment)).append("\n");
    sb.append("    archiveCommentTimestamp: ")
        .append(toIndentedString(archiveCommentTimestamp))
        .append("\n");
    sb.append("    archiveCommentUser: ").append(toIndentedString(archiveCommentUser)).append("\n");
    sb.append("    archiveReason: ").append(toIndentedString(archiveReason)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    incidentIds: ").append(toIndentedString(incidentIds)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateUpdateTimestamp: ")
        .append(toIndentedString(stateUpdateTimestamp))
        .append("\n");
    sb.append("    stateUpdateUser: ").append(toIndentedString(stateUpdateUser)).append("\n");
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
