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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The attributes of a governance control detection. */
@JsonPropertyOrder({
  GovernanceControlDetectionAttributes.JSON_PROPERTY_ASSIGNED_TEAM,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_ASSIGNED_TO,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_ASSIGNMENT_SOURCE,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_CONTROL_ID,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_CREATED_AT,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_DETECTION_TYPE,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_DISPLAY_NAME,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_EXCEPTION_AT,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_EXCEPTION_BY,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_METADATA,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_MITIGATE_AFTER,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_MITIGATED_AT,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_PRIORITY,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_RESOURCE_ID,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_RESOURCE_URL,
  GovernanceControlDetectionAttributes.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceControlDetectionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNED_TEAM = "assigned_team";
  private String assignedTeam;

  public static final String JSON_PROPERTY_ASSIGNED_TO = "assigned_to";
  private String assignedTo;

  public static final String JSON_PROPERTY_ASSIGNMENT_SOURCE = "assignment_source";
  private GovernanceControlDetectionAssignmentSource assignmentSource;

  public static final String JSON_PROPERTY_CONTROL_ID = "control_id";
  private String controlId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DETECTION_TYPE = "detection_type";
  private String detectionType;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_EXCEPTION_AT = "exception_at";
  private OffsetDateTime exceptionAt;

  public static final String JSON_PROPERTY_EXCEPTION_BY = "exception_by";
  private String exceptionBy;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata = null;

  public static final String JSON_PROPERTY_MITIGATE_AFTER = "mitigate_after";
  private OffsetDateTime mitigateAfter;

  public static final String JSON_PROPERTY_MITIGATED_AT = "mitigated_at";
  private OffsetDateTime mitigatedAt;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Long priority;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_RESOURCE_URL = "resource_url";
  private String resourceUrl;

  public static final String JSON_PROPERTY_STATE = "state";
  private GovernanceControlDetectionState state;

  public GovernanceControlDetectionAttributes() {}

  @JsonCreator
  public GovernanceControlDetectionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSIGNMENT_SOURCE)
          GovernanceControlDetectionAssignmentSource assignmentSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTROL_ID) String controlId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DETECTION_TYPE) String detectionType,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIORITY) Long priority,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_ID) String resourceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_URL) String resourceUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE)
          GovernanceControlDetectionState state) {
    this.assignmentSource = assignmentSource;
    this.unparsed |= !assignmentSource.isValid();
    this.controlId = controlId;
    this.createdAt = createdAt;
    this.detectionType = detectionType;
    this.displayName = displayName;
    this.priority = priority;
    this.resourceId = resourceId;
    this.resourceUrl = resourceUrl;
    this.state = state;
    this.unparsed |= !state.isValid();
  }

  public GovernanceControlDetectionAttributes assignedTeam(String assignedTeam) {
    this.assignedTeam = assignedTeam;
    return this;
  }

  /**
   * The identifier of the team the detection is assigned to, if any.
   *
   * @return assignedTeam
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssignedTeam() {
    return assignedTeam;
  }

  public void setAssignedTeam(String assignedTeam) {
    this.assignedTeam = assignedTeam;
  }

  public GovernanceControlDetectionAttributes assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * The identifier of the user the detection is assigned to, if any.
   *
   * @return assignedTo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }

  public GovernanceControlDetectionAttributes assignmentSource(
      GovernanceControlDetectionAssignmentSource assignmentSource) {
    this.assignmentSource = assignmentSource;
    this.unparsed |= !assignmentSource.isValid();
    return this;
  }

  /**
   * How the detection's current assignment was determined. Possible values are <code>auto_resolved
   * </code>, <code>manual</code>, <code>reassigned</code>, and <code>cleared</code>.
   *
   * @return assignmentSource
   */
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GovernanceControlDetectionAssignmentSource getAssignmentSource() {
    return assignmentSource;
  }

  public void setAssignmentSource(GovernanceControlDetectionAssignmentSource assignmentSource) {
    if (!assignmentSource.isValid()) {
      this.unparsed = true;
    }
    this.assignmentSource = assignmentSource;
  }

  public GovernanceControlDetectionAttributes controlId(String controlId) {
    this.controlId = controlId;
    return this;
  }

  /**
   * The unique identifier of the control that produced this detection.
   *
   * @return controlId
   */
  @JsonProperty(JSON_PROPERTY_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getControlId() {
    return controlId;
  }

  public void setControlId(String controlId) {
    this.controlId = controlId;
  }

  public GovernanceControlDetectionAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time when the detection was created.
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

  public GovernanceControlDetectionAttributes detectionType(String detectionType) {
    this.detectionType = detectionType;
    return this;
  }

  /**
   * The type of detection, which determines what condition was detected.
   *
   * @return detectionType
   */
  @JsonProperty(JSON_PROPERTY_DETECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDetectionType() {
    return detectionType;
  }

  public void setDetectionType(String detectionType) {
    this.detectionType = detectionType;
  }

  public GovernanceControlDetectionAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable name of the detected resource.
   *
   * @return displayName
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GovernanceControlDetectionAttributes exceptionAt(OffsetDateTime exceptionAt) {
    this.exceptionAt = exceptionAt;
    return this;
  }

  /**
   * The date and time when the detection was marked as an exception, if applicable.
   *
   * @return exceptionAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCEPTION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getExceptionAt() {
    return exceptionAt;
  }

  public void setExceptionAt(OffsetDateTime exceptionAt) {
    this.exceptionAt = exceptionAt;
  }

  public GovernanceControlDetectionAttributes exceptionBy(String exceptionBy) {
    this.exceptionBy = exceptionBy;
    return this;
  }

  /**
   * The identifier of the user who marked the detection as an exception, if applicable.
   *
   * @return exceptionBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCEPTION_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExceptionBy() {
    return exceptionBy;
  }

  public void setExceptionBy(String exceptionBy) {
    this.exceptionBy = exceptionBy;
  }

  public GovernanceControlDetectionAttributes metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Free-form metadata associated with the detection.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public GovernanceControlDetectionAttributes mitigateAfter(OffsetDateTime mitigateAfter) {
    this.mitigateAfter = mitigateAfter;
    return this;
  }

  /**
   * The date and time after which the detection is scheduled to be mitigated, if applicable.
   *
   * @return mitigateAfter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MITIGATE_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getMitigateAfter() {
    return mitigateAfter;
  }

  public void setMitigateAfter(OffsetDateTime mitigateAfter) {
    this.mitigateAfter = mitigateAfter;
  }

  public GovernanceControlDetectionAttributes mitigatedAt(OffsetDateTime mitigatedAt) {
    this.mitigatedAt = mitigatedAt;
    return this;
  }

  /**
   * The date and time when the detection was mitigated, if applicable.
   *
   * @return mitigatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MITIGATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getMitigatedAt() {
    return mitigatedAt;
  }

  public void setMitigatedAt(OffsetDateTime mitigatedAt) {
    this.mitigatedAt = mitigatedAt;
  }

  public GovernanceControlDetectionAttributes priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The priority of the detection, if set.
   *
   * @return priority
   */
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public GovernanceControlDetectionAttributes resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The identifier of the resource the detection applies to.
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

  public GovernanceControlDetectionAttributes resourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
    return this;
  }

  /**
   * A link to the detected resource in Datadog.
   *
   * @return resourceUrl
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceUrl() {
    return resourceUrl;
  }

  public void setResourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
  }

  public GovernanceControlDetectionAttributes state(GovernanceControlDetectionState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * The current state of the detection. Possible values are <code>active</code>, <code>exception
   * </code>, <code>mitigated</code>, <code>inactive</code>, <code>obsolete</code>, <code>
   * resolved_externally</code>, and <code>mitigation_in_progress</code>.
   *
   * @return state
   */
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GovernanceControlDetectionState getState() {
    return state;
  }

  public void setState(GovernanceControlDetectionState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
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
   * @return GovernanceControlDetectionAttributes
   */
  @JsonAnySetter
  public GovernanceControlDetectionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceControlDetectionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceControlDetectionAttributes governanceControlDetectionAttributes =
        (GovernanceControlDetectionAttributes) o;
    return Objects.equals(this.assignedTeam, governanceControlDetectionAttributes.assignedTeam)
        && Objects.equals(this.assignedTo, governanceControlDetectionAttributes.assignedTo)
        && Objects.equals(
            this.assignmentSource, governanceControlDetectionAttributes.assignmentSource)
        && Objects.equals(this.controlId, governanceControlDetectionAttributes.controlId)
        && Objects.equals(this.createdAt, governanceControlDetectionAttributes.createdAt)
        && Objects.equals(this.detectionType, governanceControlDetectionAttributes.detectionType)
        && Objects.equals(this.displayName, governanceControlDetectionAttributes.displayName)
        && Objects.equals(this.exceptionAt, governanceControlDetectionAttributes.exceptionAt)
        && Objects.equals(this.exceptionBy, governanceControlDetectionAttributes.exceptionBy)
        && Objects.equals(this.metadata, governanceControlDetectionAttributes.metadata)
        && Objects.equals(this.mitigateAfter, governanceControlDetectionAttributes.mitigateAfter)
        && Objects.equals(this.mitigatedAt, governanceControlDetectionAttributes.mitigatedAt)
        && Objects.equals(this.priority, governanceControlDetectionAttributes.priority)
        && Objects.equals(this.resourceId, governanceControlDetectionAttributes.resourceId)
        && Objects.equals(this.resourceUrl, governanceControlDetectionAttributes.resourceUrl)
        && Objects.equals(this.state, governanceControlDetectionAttributes.state)
        && Objects.equals(
            this.additionalProperties, governanceControlDetectionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assignedTeam,
        assignedTo,
        assignmentSource,
        controlId,
        createdAt,
        detectionType,
        displayName,
        exceptionAt,
        exceptionBy,
        metadata,
        mitigateAfter,
        mitigatedAt,
        priority,
        resourceId,
        resourceUrl,
        state,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceControlDetectionAttributes {\n");
    sb.append("    assignedTeam: ").append(toIndentedString(assignedTeam)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    assignmentSource: ").append(toIndentedString(assignmentSource)).append("\n");
    sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    detectionType: ").append(toIndentedString(detectionType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    exceptionAt: ").append(toIndentedString(exceptionAt)).append("\n");
    sb.append("    exceptionBy: ").append(toIndentedString(exceptionBy)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mitigateAfter: ").append(toIndentedString(mitigateAfter)).append("\n");
    sb.append("    mitigatedAt: ").append(toIndentedString(mitigatedAt)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceUrl: ").append(toIndentedString(resourceUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
