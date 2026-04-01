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

/** Triage attributes of a security signal returned in a bulk update response. */
@JsonPropertyOrder({
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_ARCHIVE_COMMENT,
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_ARCHIVE_COMMENT_TIMESTAMP,
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_ARCHIVE_COMMENT_USER,
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_ARCHIVE_REASON,
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_ASSIGNEE,
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_ID,
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_INCIDENT_IDS,
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_STATE,
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_STATE_UPDATE_TIMESTAMP,
  SecurityMonitoringSignalsBulkTriageEventAttributes.JSON_PROPERTY_STATE_UPDATE_USER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalsBulkTriageEventAttributes {
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

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCIDENT_IDS = "incident_ids";
  private List<Long> incidentIds = new ArrayList<>();

  public static final String JSON_PROPERTY_STATE = "state";
  private SecurityMonitoringSignalState state;

  public static final String JSON_PROPERTY_STATE_UPDATE_TIMESTAMP = "state_update_timestamp";
  private Long stateUpdateTimestamp;

  public static final String JSON_PROPERTY_STATE_UPDATE_USER = "state_update_user";
  private SecurityMonitoringTriageUser stateUpdateUser;

  public SecurityMonitoringSignalsBulkTriageEventAttributes() {}

  @JsonCreator
  public SecurityMonitoringSignalsBulkTriageEventAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSIGNEE)
          SecurityMonitoringTriageUser assignee,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_IDS) List<Long> incidentIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE)
          SecurityMonitoringSignalState state) {
    this.assignee = assignee;
    this.unparsed |= assignee.unparsed;
    this.id = id;
    this.incidentIds = incidentIds;
    this.state = state;
    this.unparsed |= !state.isValid();
  }

  public SecurityMonitoringSignalsBulkTriageEventAttributes archiveComment(String archiveComment) {
    this.archiveComment = archiveComment;
    return this;
  }

  /**
   * Optional comment to display on archived signals.
   *
   * @return archiveComment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArchiveComment() {
    return archiveComment;
  }

  public void setArchiveComment(String archiveComment) {
    this.archiveComment = archiveComment;
  }

  public SecurityMonitoringSignalsBulkTriageEventAttributes archiveCommentTimestamp(
      Long archiveCommentTimestamp) {
    this.archiveCommentTimestamp = archiveCommentTimestamp;
    return this;
  }

  /**
   * Timestamp of the last edit to the archive comment.
   *
   * @return archiveCommentTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE_COMMENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getArchiveCommentTimestamp() {
    return archiveCommentTimestamp;
  }

  public void setArchiveCommentTimestamp(Long archiveCommentTimestamp) {
    this.archiveCommentTimestamp = archiveCommentTimestamp;
  }

  public SecurityMonitoringSignalsBulkTriageEventAttributes archiveCommentUser(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE_COMMENT_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringTriageUser getArchiveCommentUser() {
    return archiveCommentUser;
  }

  public void setArchiveCommentUser(SecurityMonitoringTriageUser archiveCommentUser) {
    this.archiveCommentUser = archiveCommentUser;
  }

  public SecurityMonitoringSignalsBulkTriageEventAttributes archiveReason(
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
  @jakarta.annotation.Nullable
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

  public SecurityMonitoringSignalsBulkTriageEventAttributes assignee(
      SecurityMonitoringTriageUser assignee) {
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

  public SecurityMonitoringSignalsBulkTriageEventAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the security signal.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityMonitoringSignalsBulkTriageEventAttributes incidentIds(List<Long> incidentIds) {
    this.incidentIds = incidentIds;
    return this;
  }

  public SecurityMonitoringSignalsBulkTriageEventAttributes addIncidentIdsItem(
      Long incidentIdsItem) {
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

  public SecurityMonitoringSignalsBulkTriageEventAttributes state(
      SecurityMonitoringSignalState state) {
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

  public SecurityMonitoringSignalsBulkTriageEventAttributes stateUpdateTimestamp(
      Long stateUpdateTimestamp) {
    this.stateUpdateTimestamp = stateUpdateTimestamp;
    return this;
  }

  /**
   * Timestamp of the last state update.
   *
   * @return stateUpdateTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_UPDATE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStateUpdateTimestamp() {
    return stateUpdateTimestamp;
  }

  public void setStateUpdateTimestamp(Long stateUpdateTimestamp) {
    this.stateUpdateTimestamp = stateUpdateTimestamp;
  }

  public SecurityMonitoringSignalsBulkTriageEventAttributes stateUpdateUser(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringTriageUser getStateUpdateUser() {
    return stateUpdateUser;
  }

  public void setStateUpdateUser(SecurityMonitoringTriageUser stateUpdateUser) {
    this.stateUpdateUser = stateUpdateUser;
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
   * @return SecurityMonitoringSignalsBulkTriageEventAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSignalsBulkTriageEventAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this SecurityMonitoringSignalsBulkTriageEventAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalsBulkTriageEventAttributes
        securityMonitoringSignalsBulkTriageEventAttributes =
            (SecurityMonitoringSignalsBulkTriageEventAttributes) o;
    return Objects.equals(
            this.archiveComment, securityMonitoringSignalsBulkTriageEventAttributes.archiveComment)
        && Objects.equals(
            this.archiveCommentTimestamp,
            securityMonitoringSignalsBulkTriageEventAttributes.archiveCommentTimestamp)
        && Objects.equals(
            this.archiveCommentUser,
            securityMonitoringSignalsBulkTriageEventAttributes.archiveCommentUser)
        && Objects.equals(
            this.archiveReason, securityMonitoringSignalsBulkTriageEventAttributes.archiveReason)
        && Objects.equals(
            this.assignee, securityMonitoringSignalsBulkTriageEventAttributes.assignee)
        && Objects.equals(this.id, securityMonitoringSignalsBulkTriageEventAttributes.id)
        && Objects.equals(
            this.incidentIds, securityMonitoringSignalsBulkTriageEventAttributes.incidentIds)
        && Objects.equals(this.state, securityMonitoringSignalsBulkTriageEventAttributes.state)
        && Objects.equals(
            this.stateUpdateTimestamp,
            securityMonitoringSignalsBulkTriageEventAttributes.stateUpdateTimestamp)
        && Objects.equals(
            this.stateUpdateUser,
            securityMonitoringSignalsBulkTriageEventAttributes.stateUpdateUser)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalsBulkTriageEventAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archiveComment,
        archiveCommentTimestamp,
        archiveCommentUser,
        archiveReason,
        assignee,
        id,
        incidentIds,
        state,
        stateUpdateTimestamp,
        stateUpdateUser,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalsBulkTriageEventAttributes {\n");
    sb.append("    archiveComment: ").append(toIndentedString(archiveComment)).append("\n");
    sb.append("    archiveCommentTimestamp: ")
        .append(toIndentedString(archiveCommentTimestamp))
        .append("\n");
    sb.append("    archiveCommentUser: ").append(toIndentedString(archiveCommentUser)).append("\n");
    sb.append("    archiveReason: ").append(toIndentedString(archiveReason)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incidentIds: ").append(toIndentedString(incidentIds)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateUpdateTimestamp: ")
        .append(toIndentedString(stateUpdateTimestamp))
        .append("\n");
    sb.append("    stateUpdateUser: ").append(toIndentedString(stateUpdateUser)).append("\n");
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
