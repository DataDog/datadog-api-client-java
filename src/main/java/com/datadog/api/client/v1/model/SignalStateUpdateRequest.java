/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes describing the change of state for a given state.</p>
 */
@JsonPropertyOrder({
  SignalStateUpdateRequest.JSON_PROPERTY_ARCHIVE_COMMENT,
  SignalStateUpdateRequest.JSON_PROPERTY_ARCHIVE_REASON,
  SignalStateUpdateRequest.JSON_PROPERTY_STATE,
  SignalStateUpdateRequest.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SignalStateUpdateRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVE_COMMENT = "archiveComment";
  private String archiveComment;

  public static final String JSON_PROPERTY_ARCHIVE_REASON = "archiveReason";
  private SignalArchiveReason archiveReason;

  public static final String JSON_PROPERTY_STATE = "state";
  private SignalTriageState state;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SignalStateUpdateRequest() {}

  @JsonCreator
  public SignalStateUpdateRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_STATE)SignalTriageState state) {
        this.state = state;
        this.unparsed |= !state.isValid();
  }
  public SignalStateUpdateRequest archiveComment(String archiveComment) {
    this.archiveComment = archiveComment;
    return this;
  }

  /**
   * <p>Optional comment to explain why a signal is being archived.</p>
   * @return archiveComment
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ARCHIVE_COMMENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getArchiveComment() {
        return archiveComment;
      }
  public void setArchiveComment(String archiveComment) {
    this.archiveComment = archiveComment;
  }
  public SignalStateUpdateRequest archiveReason(SignalArchiveReason archiveReason) {
    this.archiveReason = archiveReason;
    this.unparsed |= !archiveReason.isValid();
    return this;
  }

  /**
   * <p>Reason why a signal has been archived.</p>
   * @return archiveReason
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ARCHIVE_REASON)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SignalArchiveReason getArchiveReason() {
        return archiveReason;
      }
  public void setArchiveReason(SignalArchiveReason archiveReason) {
    if (!archiveReason.isValid()) {
        this.unparsed = true;
    }
    this.archiveReason = archiveReason;
  }
  public SignalStateUpdateRequest state(SignalTriageState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * <p>The new triage state of the signal.</p>
   * @return state
  **/
      @JsonProperty(JSON_PROPERTY_STATE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SignalTriageState getState() {
        return state;
      }
  public void setState(SignalTriageState state) {
    if (!state.isValid()) {
        this.unparsed = true;
    }
    this.state = state;
  }
  public SignalStateUpdateRequest version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Version of the updated signal. If server side version is higher, update will be rejected.</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
    this.version = version;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SignalStateUpdateRequest
   */
  @JsonAnySetter
  public SignalStateUpdateRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this SignalStateUpdateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalStateUpdateRequest signalStateUpdateRequest = (SignalStateUpdateRequest) o;
    return Objects.equals(this.archiveComment, signalStateUpdateRequest.archiveComment) && Objects.equals(this.archiveReason, signalStateUpdateRequest.archiveReason) && Objects.equals(this.state, signalStateUpdateRequest.state) && Objects.equals(this.version, signalStateUpdateRequest.version) && Objects.equals(this.additionalProperties, signalStateUpdateRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(archiveComment,archiveReason,state,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalStateUpdateRequest {\n");
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
