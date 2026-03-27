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

/** Attributes describing the change of state of a security signal. */
@JsonPropertyOrder({
  SecurityMonitoringSignalStateUpdateAttributes.JSON_PROPERTY_ARCHIVE_COMMENT,
  SecurityMonitoringSignalStateUpdateAttributes.JSON_PROPERTY_ARCHIVE_REASON,
  SecurityMonitoringSignalStateUpdateAttributes.JSON_PROPERTY_STATE,
  SecurityMonitoringSignalStateUpdateAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalStateUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVE_COMMENT = "archive_comment";
  private String archiveComment;

  public static final String JSON_PROPERTY_ARCHIVE_REASON = "archive_reason";
  private SecurityMonitoringSignalArchiveReason archiveReason;

  public static final String JSON_PROPERTY_STATE = "state";
  private SecurityMonitoringSignalState state;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SecurityMonitoringSignalStateUpdateAttributes() {}

  @JsonCreator
  public SecurityMonitoringSignalStateUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE)
          SecurityMonitoringSignalState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
  }

  public SecurityMonitoringSignalStateUpdateAttributes archiveComment(String archiveComment) {
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

  public SecurityMonitoringSignalStateUpdateAttributes archiveReason(
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

  public SecurityMonitoringSignalStateUpdateAttributes state(SecurityMonitoringSignalState state) {
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

  public SecurityMonitoringSignalStateUpdateAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the updated signal. If server side version is higher, update will be rejected.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return SecurityMonitoringSignalStateUpdateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSignalStateUpdateAttributes putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringSignalStateUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalStateUpdateAttributes securityMonitoringSignalStateUpdateAttributes =
        (SecurityMonitoringSignalStateUpdateAttributes) o;
    return Objects.equals(
            this.archiveComment, securityMonitoringSignalStateUpdateAttributes.archiveComment)
        && Objects.equals(
            this.archiveReason, securityMonitoringSignalStateUpdateAttributes.archiveReason)
        && Objects.equals(this.state, securityMonitoringSignalStateUpdateAttributes.state)
        && Objects.equals(this.version, securityMonitoringSignalStateUpdateAttributes.version)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalStateUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveComment, archiveReason, state, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalStateUpdateAttributes {\n");
    sb.append("    archiveComment: ").append(toIndentedString(archiveComment)).append("\n");
    sb.append("    archiveReason: ").append(toIndentedString(archiveReason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
