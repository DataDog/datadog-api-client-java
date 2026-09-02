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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** RUM application context associated with a step or sub-test. */
@JsonPropertyOrder({
  SyntheticsTestResultRumContext.JSON_PROPERTY_APPLICATION_ID,
  SyntheticsTestResultRumContext.JSON_PROPERTY_SESSION_ID,
  SyntheticsTestResultRumContext.JSON_PROPERTY_VIEW_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultRumContext {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_VIEW_ID = "view_id";
  private String viewId;

  public SyntheticsTestResultRumContext applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * RUM application identifier.
   *
   * @return applicationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public SyntheticsTestResultRumContext sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * RUM session identifier.
   *
   * @return sessionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public SyntheticsTestResultRumContext viewId(String viewId) {
    this.viewId = viewId;
    return this;
  }

  /**
   * RUM view identifier.
   *
   * @return viewId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getViewId() {
    return viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
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
   * @return SyntheticsTestResultRumContext
   */
  @JsonAnySetter
  public SyntheticsTestResultRumContext putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultRumContext object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultRumContext syntheticsTestResultRumContext =
        (SyntheticsTestResultRumContext) o;
    return Objects.equals(this.applicationId, syntheticsTestResultRumContext.applicationId)
        && Objects.equals(this.sessionId, syntheticsTestResultRumContext.sessionId)
        && Objects.equals(this.viewId, syntheticsTestResultRumContext.viewId)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultRumContext.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, sessionId, viewId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultRumContext {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
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
