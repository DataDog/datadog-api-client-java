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

/** Incident integration metadata's attributes for a create request. */
@JsonPropertyOrder({
  IncidentIntegrationMetadataAttributes.JSON_PROPERTY_CREATED,
  IncidentIntegrationMetadataAttributes.JSON_PROPERTY_INCIDENT_ID,
  IncidentIntegrationMetadataAttributes.JSON_PROPERTY_INTEGRATION_TYPE,
  IncidentIntegrationMetadataAttributes.JSON_PROPERTY_METADATA,
  IncidentIntegrationMetadataAttributes.JSON_PROPERTY_MODIFIED,
  IncidentIntegrationMetadataAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentIntegrationMetadataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_INCIDENT_ID = "incident_id";
  private String incidentId;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration_type";
  private Integer integrationType;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private IncidentIntegrationMetadataMetadata metadata;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public IncidentIntegrationMetadataAttributes() {}

  @JsonCreator
  public IncidentIntegrationMetadataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION_TYPE)
          Integer integrationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_METADATA)
          IncidentIntegrationMetadataMetadata metadata) {
    this.integrationType = integrationType;
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
  }

  /**
   * Timestamp when the incident todo was created.
   *
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public IncidentIntegrationMetadataAttributes incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * UUID of the incident this integration metadata is connected to.
   *
   * @return incidentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  public IncidentIntegrationMetadataAttributes integrationType(Integer integrationType) {
    this.integrationType = integrationType;
    return this;
  }

  /**
   * A number indicating the type of integration this metadata is for. 1 indicates Slack; 8
   * indicates Jira. maximum: 9
   *
   * @return integrationType
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(Integer integrationType) {
    this.integrationType = integrationType;
  }

  public IncidentIntegrationMetadataAttributes metadata(
      IncidentIntegrationMetadataMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Incident integration metadata's metadata attribute.
   *
   * @return metadata
   */
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentIntegrationMetadataMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(IncidentIntegrationMetadataMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * Timestamp when the incident todo was last modified.
   *
   * @return modified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public IncidentIntegrationMetadataAttributes status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * A number indicating the status of this integration metadata. 0 indicates unknown; 1 indicates
   * pending; 2 indicates complete; 3 indicates manually created; 4 indicates manually updated; 5
   * indicates failed. maximum: 5
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
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
   * @return IncidentIntegrationMetadataAttributes
   */
  @JsonAnySetter
  public IncidentIntegrationMetadataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentIntegrationMetadataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentIntegrationMetadataAttributes incidentIntegrationMetadataAttributes =
        (IncidentIntegrationMetadataAttributes) o;
    return Objects.equals(this.created, incidentIntegrationMetadataAttributes.created)
        && Objects.equals(this.incidentId, incidentIntegrationMetadataAttributes.incidentId)
        && Objects.equals(
            this.integrationType, incidentIntegrationMetadataAttributes.integrationType)
        && Objects.equals(this.metadata, incidentIntegrationMetadataAttributes.metadata)
        && Objects.equals(this.modified, incidentIntegrationMetadataAttributes.modified)
        && Objects.equals(this.status, incidentIntegrationMetadataAttributes.status)
        && Objects.equals(
            this.additionalProperties, incidentIntegrationMetadataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        created, incidentId, integrationType, metadata, modified, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentIntegrationMetadataAttributes {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
