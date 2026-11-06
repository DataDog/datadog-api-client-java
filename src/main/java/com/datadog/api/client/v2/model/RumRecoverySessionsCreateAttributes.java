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

/** Recover 1 to 100 explicit archived sessions. Session IDs must be unique within the request. */
@JsonPropertyOrder({
  RumRecoverySessionsCreateAttributes.JSON_PROPERTY_REQUEST_TYPE,
  RumRecoverySessionsCreateAttributes.JSON_PROPERTY_SESSIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRecoverySessionsCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private RumRecoverySessionsRequestType requestType = RumRecoverySessionsRequestType.SESSIONS;

  public static final String JSON_PROPERTY_SESSIONS = "sessions";
  private List<RumRecoverySessionInput> sessions = new ArrayList<>();

  public RumRecoverySessionsCreateAttributes() {}

  @JsonCreator
  public RumRecoverySessionsCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSIONS)
          List<RumRecoverySessionInput> sessions) {
    this.sessions = sessions;
    for (RumRecoverySessionInput item : sessions) {
      this.unparsed |= item.unparsed;
    }
  }

  public RumRecoverySessionsCreateAttributes requestType(
      RumRecoverySessionsRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Targeted recovery. Omitted request_type defaults to sessions.
   *
   * @return requestType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumRecoverySessionsRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(RumRecoverySessionsRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public RumRecoverySessionsCreateAttributes sessions(List<RumRecoverySessionInput> sessions) {
    this.sessions = sessions;
    for (RumRecoverySessionInput item : sessions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumRecoverySessionsCreateAttributes addSessionsItem(RumRecoverySessionInput sessionsItem) {
    this.sessions.add(sessionsItem);
    this.unparsed |= sessionsItem.unparsed;
    return this;
  }

  /**
   * Sessions to recover.
   *
   * @return sessions
   */
  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<RumRecoverySessionInput> getSessions() {
    return sessions;
  }

  public void setSessions(List<RumRecoverySessionInput> sessions) {
    this.sessions = sessions;
    if (sessions != null) {
      for (RumRecoverySessionInput item : sessions) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return RumRecoverySessionsCreateAttributes
   */
  @JsonAnySetter
  public RumRecoverySessionsCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRecoverySessionsCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRecoverySessionsCreateAttributes rumRecoverySessionsCreateAttributes =
        (RumRecoverySessionsCreateAttributes) o;
    return Objects.equals(this.requestType, rumRecoverySessionsCreateAttributes.requestType)
        && Objects.equals(this.sessions, rumRecoverySessionsCreateAttributes.sessions)
        && Objects.equals(
            this.additionalProperties, rumRecoverySessionsCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, sessions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRecoverySessionsCreateAttributes {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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
