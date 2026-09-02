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

/** Attributes of a Google Meet configuration. */
@JsonPropertyOrder({
  IncidentGoogleMeetConfigurationDataAttributesResponse.JSON_PROPERTY_ALLOW_MANUAL_MEETING_CREATION,
  IncidentGoogleMeetConfigurationDataAttributesResponse.JSON_PROPERTY_AUTO_SUMMARIZE,
  IncidentGoogleMeetConfigurationDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  IncidentGoogleMeetConfigurationDataAttributesResponse.JSON_PROPERTY_MODIFIED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentGoogleMeetConfigurationDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_MANUAL_MEETING_CREATION =
      "allow_manual_meeting_creation";
  private Boolean allowManualMeetingCreation;

  public static final String JSON_PROPERTY_AUTO_SUMMARIZE = "auto_summarize";
  private Boolean autoSummarize;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public IncidentGoogleMeetConfigurationDataAttributesResponse() {}

  @JsonCreator
  public IncidentGoogleMeetConfigurationDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOW_MANUAL_MEETING_CREATION)
          Boolean allowManualMeetingCreation,
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTO_SUMMARIZE) Boolean autoSummarize,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt) {
    this.allowManualMeetingCreation = allowManualMeetingCreation;
    this.autoSummarize = autoSummarize;
    this.modifiedAt = modifiedAt;
  }

  public IncidentGoogleMeetConfigurationDataAttributesResponse allowManualMeetingCreation(
      Boolean allowManualMeetingCreation) {
    this.allowManualMeetingCreation = allowManualMeetingCreation;
    return this;
  }

  /**
   * Whether manual meeting creation is allowed.
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

  public IncidentGoogleMeetConfigurationDataAttributesResponse autoSummarize(
      Boolean autoSummarize) {
    this.autoSummarize = autoSummarize;
    return this;
  }

  /**
   * Whether meetings are auto-summarized.
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

  public IncidentGoogleMeetConfigurationDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the configuration was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IncidentGoogleMeetConfigurationDataAttributesResponse modifiedAt(
      OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the configuration was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
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
   * @return IncidentGoogleMeetConfigurationDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentGoogleMeetConfigurationDataAttributesResponse putAdditionalProperty(
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
   * Return true if this IncidentGoogleMeetConfigurationDataAttributesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentGoogleMeetConfigurationDataAttributesResponse
        incidentGoogleMeetConfigurationDataAttributesResponse =
            (IncidentGoogleMeetConfigurationDataAttributesResponse) o;
    return Objects.equals(
            this.allowManualMeetingCreation,
            incidentGoogleMeetConfigurationDataAttributesResponse.allowManualMeetingCreation)
        && Objects.equals(
            this.autoSummarize, incidentGoogleMeetConfigurationDataAttributesResponse.autoSummarize)
        && Objects.equals(
            this.createdAt, incidentGoogleMeetConfigurationDataAttributesResponse.createdAt)
        && Objects.equals(
            this.modifiedAt, incidentGoogleMeetConfigurationDataAttributesResponse.modifiedAt)
        && Objects.equals(
            this.additionalProperties,
            incidentGoogleMeetConfigurationDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowManualMeetingCreation, autoSummarize, createdAt, modifiedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentGoogleMeetConfigurationDataAttributesResponse {\n");
    sb.append("    allowManualMeetingCreation: ")
        .append(toIndentedString(allowManualMeetingCreation))
        .append("\n");
    sb.append("    autoSummarize: ").append(toIndentedString(autoSummarize)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
