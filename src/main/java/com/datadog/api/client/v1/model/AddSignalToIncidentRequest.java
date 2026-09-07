/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Attributes describing which incident to add the signal to. */
@JsonPropertyOrder({
  AddSignalToIncidentRequest.JSON_PROPERTY_ADD_TO_SIGNAL_TIMELINE,
  AddSignalToIncidentRequest.JSON_PROPERTY_INCIDENT_ID,
  AddSignalToIncidentRequest.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AddSignalToIncidentRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADD_TO_SIGNAL_TIMELINE = "add_to_signal_timeline";
  private Boolean addToSignalTimeline;

  public static final String JSON_PROPERTY_INCIDENT_ID = "incident_id";
  private Long incidentId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public AddSignalToIncidentRequest() {}

  @JsonCreator
  public AddSignalToIncidentRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_ID) Long incidentId) {
    this.incidentId = incidentId;
  }

  public AddSignalToIncidentRequest addToSignalTimeline(Boolean addToSignalTimeline) {
    this.addToSignalTimeline = addToSignalTimeline;
    return this;
  }

  /**
   * Whether to post the signal on the incident timeline.
   *
   * @return addToSignalTimeline
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_TO_SIGNAL_TIMELINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAddToSignalTimeline() {
    return addToSignalTimeline;
  }

  public void setAddToSignalTimeline(Boolean addToSignalTimeline) {
    this.addToSignalTimeline = addToSignalTimeline;
  }

  public AddSignalToIncidentRequest incidentId(Long incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * Public ID attribute of the incident to which the signal will be added.
   *
   * @return incidentId
   */
  @JsonProperty(JSON_PROPERTY_INCIDENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(Long incidentId) {
    this.incidentId = incidentId;
  }

  public AddSignalToIncidentRequest version(Long version) {
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
   * @return AddSignalToIncidentRequest
   */
  @JsonAnySetter
  public AddSignalToIncidentRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AddSignalToIncidentRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSignalToIncidentRequest addSignalToIncidentRequest = (AddSignalToIncidentRequest) o;
    return Objects.equals(this.addToSignalTimeline, addSignalToIncidentRequest.addToSignalTimeline)
        && Objects.equals(this.incidentId, addSignalToIncidentRequest.incidentId)
        && Objects.equals(this.version, addSignalToIncidentRequest.version)
        && Objects.equals(
            this.additionalProperties, addSignalToIncidentRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addToSignalTimeline, incidentId, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSignalToIncidentRequest {\n");
    sb.append("    addToSignalTimeline: ")
        .append(toIndentedString(addToSignalTimeline))
        .append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
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
