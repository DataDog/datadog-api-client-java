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
import java.util.UUID;

/** Attributes of an incident communication response. */
@JsonPropertyOrder({
  IncidentCommunicationDataAttributesResponse.JSON_PROPERTY_COMMUNICATION_TYPE,
  IncidentCommunicationDataAttributesResponse.JSON_PROPERTY_CONTENT,
  IncidentCommunicationDataAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentCommunicationDataAttributesResponse.JSON_PROPERTY_INCIDENT_ID,
  IncidentCommunicationDataAttributesResponse.JSON_PROPERTY_MODIFIED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCommunicationDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMUNICATION_TYPE = "communication_type";
  private IncidentCommunicationKind communicationType;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private IncidentCommunicationContent content;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_INCIDENT_ID = "incident_id";
  private UUID incidentId;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public IncidentCommunicationDataAttributesResponse() {}

  @JsonCreator
  public IncidentCommunicationDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMMUNICATION_TYPE)
          IncidentCommunicationKind communicationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT)
          IncidentCommunicationContent content,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_ID) UUID incidentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified) {
    this.communicationType = communicationType;
    this.unparsed |= !communicationType.isValid();
    this.content = content;
    this.unparsed |= content.unparsed;
    this.created = created;
    this.incidentId = incidentId;
    this.modified = modified;
  }

  public IncidentCommunicationDataAttributesResponse communicationType(
      IncidentCommunicationKind communicationType) {
    this.communicationType = communicationType;
    this.unparsed |= !communicationType.isValid();
    return this;
  }

  /**
   * The kind of communication.
   *
   * @return communicationType
   */
  @JsonProperty(JSON_PROPERTY_COMMUNICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentCommunicationKind getCommunicationType() {
    return communicationType;
  }

  public void setCommunicationType(IncidentCommunicationKind communicationType) {
    if (!communicationType.isValid()) {
      this.unparsed = true;
    }
    this.communicationType = communicationType;
  }

  public IncidentCommunicationDataAttributesResponse content(IncidentCommunicationContent content) {
    this.content = content;
    this.unparsed |= content.unparsed;
    return this;
  }

  /**
   * The content of a communication.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentCommunicationContent getContent() {
    return content;
  }

  public void setContent(IncidentCommunicationContent content) {
    this.content = content;
  }

  public IncidentCommunicationDataAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the communication was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentCommunicationDataAttributesResponse incidentId(UUID incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * The incident identifier.
   *
   * @return incidentId
   */
  @JsonProperty(JSON_PROPERTY_INCIDENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(UUID incidentId) {
    this.incidentId = incidentId;
  }

  public IncidentCommunicationDataAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the communication was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
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
   * @return IncidentCommunicationDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentCommunicationDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this IncidentCommunicationDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCommunicationDataAttributesResponse incidentCommunicationDataAttributesResponse =
        (IncidentCommunicationDataAttributesResponse) o;
    return Objects.equals(
            this.communicationType, incidentCommunicationDataAttributesResponse.communicationType)
        && Objects.equals(this.content, incidentCommunicationDataAttributesResponse.content)
        && Objects.equals(this.created, incidentCommunicationDataAttributesResponse.created)
        && Objects.equals(this.incidentId, incidentCommunicationDataAttributesResponse.incidentId)
        && Objects.equals(this.modified, incidentCommunicationDataAttributesResponse.modified)
        && Objects.equals(
            this.additionalProperties,
            incidentCommunicationDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        communicationType, content, created, incidentId, modified, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCommunicationDataAttributesResponse {\n");
    sb.append("    communicationType: ").append(toIndentedString(communicationType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
