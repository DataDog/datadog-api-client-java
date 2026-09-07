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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The attributes of a governance control detection that can be updated. Only the attributes present
 * in the request are modified.
 */
@JsonPropertyOrder({
  GovernanceControlDetectionUpdateAttributes.JSON_PROPERTY_ASSIGNED_TEAM,
  GovernanceControlDetectionUpdateAttributes.JSON_PROPERTY_ASSIGNED_TO,
  GovernanceControlDetectionUpdateAttributes.JSON_PROPERTY_MITIGATE_AFTER,
  GovernanceControlDetectionUpdateAttributes.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceControlDetectionUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNED_TEAM = "assigned_team";
  private String assignedTeam;

  public static final String JSON_PROPERTY_ASSIGNED_TO = "assigned_to";
  private String assignedTo;

  public static final String JSON_PROPERTY_MITIGATE_AFTER = "mitigate_after";
  private OffsetDateTime mitigateAfter;

  public static final String JSON_PROPERTY_STATE = "state";
  private GovernanceControlDetectionUpdateState state;

  public GovernanceControlDetectionUpdateAttributes assignedTeam(String assignedTeam) {
    this.assignedTeam = assignedTeam;
    return this;
  }

  /**
   * The handle of the team the detection is assigned to. Set to an empty string to clear the
   * assignment.
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

  public GovernanceControlDetectionUpdateAttributes assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * The UUID of the user the detection is assigned to. Set to an empty string to clear the
   * assignment.
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

  public GovernanceControlDetectionUpdateAttributes mitigateAfter(OffsetDateTime mitigateAfter) {
    this.mitigateAfter = mitigateAfter;
    return this;
  }

  /**
   * The timestamp after which the detection becomes eligible for mitigation. Used to defer
   * mitigation to a later time.
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

  public GovernanceControlDetectionUpdateAttributes state(
      GovernanceControlDetectionUpdateState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * The new state to set for the detection. Set to <code>exception</code> to acknowledge the
   * detection and exclude it from active counts, or <code>active</code> to reopen it.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GovernanceControlDetectionUpdateState getState() {
    return state;
  }

  public void setState(GovernanceControlDetectionUpdateState state) {
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
   * @return GovernanceControlDetectionUpdateAttributes
   */
  @JsonAnySetter
  public GovernanceControlDetectionUpdateAttributes putAdditionalProperty(
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

  /** Return true if this GovernanceControlDetectionUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceControlDetectionUpdateAttributes governanceControlDetectionUpdateAttributes =
        (GovernanceControlDetectionUpdateAttributes) o;
    return Objects.equals(
            this.assignedTeam, governanceControlDetectionUpdateAttributes.assignedTeam)
        && Objects.equals(this.assignedTo, governanceControlDetectionUpdateAttributes.assignedTo)
        && Objects.equals(
            this.mitigateAfter, governanceControlDetectionUpdateAttributes.mitigateAfter)
        && Objects.equals(this.state, governanceControlDetectionUpdateAttributes.state)
        && Objects.equals(
            this.additionalProperties,
            governanceControlDetectionUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedTeam, assignedTo, mitigateAfter, state, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceControlDetectionUpdateAttributes {\n");
    sb.append("    assignedTeam: ").append(toIndentedString(assignedTeam)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    mitigateAfter: ").append(toIndentedString(mitigateAfter)).append("\n");
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
