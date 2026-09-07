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

/** Attributes for creating a Google Meet configuration. */
@JsonPropertyOrder({
  IncidentGoogleMeetConfigurationDataAttributesRequest.JSON_PROPERTY_ALLOW_MANUAL_MEETING_CREATION,
  IncidentGoogleMeetConfigurationDataAttributesRequest.JSON_PROPERTY_AUTO_SUMMARIZE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentGoogleMeetConfigurationDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_MANUAL_MEETING_CREATION =
      "allow_manual_meeting_creation";
  private Boolean allowManualMeetingCreation;

  public static final String JSON_PROPERTY_AUTO_SUMMARIZE = "auto_summarize";
  private Boolean autoSummarize;

  public IncidentGoogleMeetConfigurationDataAttributesRequest() {}

  @JsonCreator
  public IncidentGoogleMeetConfigurationDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOW_MANUAL_MEETING_CREATION)
          Boolean allowManualMeetingCreation,
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTO_SUMMARIZE) Boolean autoSummarize) {
    this.allowManualMeetingCreation = allowManualMeetingCreation;
    this.autoSummarize = autoSummarize;
  }

  public IncidentGoogleMeetConfigurationDataAttributesRequest allowManualMeetingCreation(
      Boolean allowManualMeetingCreation) {
    this.allowManualMeetingCreation = allowManualMeetingCreation;
    return this;
  }

  /**
   * Whether to allow manual meeting creation.
   *
   * @return allowManualMeetingCreation
   */
  @JsonProperty(JSON_PROPERTY_ALLOW_MANUAL_MEETING_CREATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAllowManualMeetingCreation() {
    return allowManualMeetingCreation;
  }

  public void setAllowManualMeetingCreation(Boolean allowManualMeetingCreation) {
    this.allowManualMeetingCreation = allowManualMeetingCreation;
  }

  public IncidentGoogleMeetConfigurationDataAttributesRequest autoSummarize(Boolean autoSummarize) {
    this.autoSummarize = autoSummarize;
    return this;
  }

  /**
   * Whether to auto-summarize meetings.
   *
   * @return autoSummarize
   */
  @JsonProperty(JSON_PROPERTY_AUTO_SUMMARIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAutoSummarize() {
    return autoSummarize;
  }

  public void setAutoSummarize(Boolean autoSummarize) {
    this.autoSummarize = autoSummarize;
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
   * @return IncidentGoogleMeetConfigurationDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentGoogleMeetConfigurationDataAttributesRequest putAdditionalProperty(
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
   * Return true if this IncidentGoogleMeetConfigurationDataAttributesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentGoogleMeetConfigurationDataAttributesRequest
        incidentGoogleMeetConfigurationDataAttributesRequest =
            (IncidentGoogleMeetConfigurationDataAttributesRequest) o;
    return Objects.equals(
            this.allowManualMeetingCreation,
            incidentGoogleMeetConfigurationDataAttributesRequest.allowManualMeetingCreation)
        && Objects.equals(
            this.autoSummarize, incidentGoogleMeetConfigurationDataAttributesRequest.autoSummarize)
        && Objects.equals(
            this.additionalProperties,
            incidentGoogleMeetConfigurationDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowManualMeetingCreation, autoSummarize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentGoogleMeetConfigurationDataAttributesRequest {\n");
    sb.append("    allowManualMeetingCreation: ")
        .append(toIndentedString(allowManualMeetingCreation))
        .append("\n");
    sb.append("    autoSummarize: ").append(toIndentedString(autoSummarize)).append("\n");
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
