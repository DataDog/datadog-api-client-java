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

/** The incident's attributes for an import request. */
@JsonPropertyOrder({
  IncidentImportRequestAttributes.JSON_PROPERTY_DECLARED,
  IncidentImportRequestAttributes.JSON_PROPERTY_DETECTED,
  IncidentImportRequestAttributes.JSON_PROPERTY_FIELDS,
  IncidentImportRequestAttributes.JSON_PROPERTY_INCIDENT_TYPE_UUID,
  IncidentImportRequestAttributes.JSON_PROPERTY_RESOLVED,
  IncidentImportRequestAttributes.JSON_PROPERTY_TITLE,
  IncidentImportRequestAttributes.JSON_PROPERTY_VISIBILITY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentImportRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DECLARED = "declared";
  private OffsetDateTime declared;

  public static final String JSON_PROPERTY_DETECTED = "detected";
  private OffsetDateTime detected;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, IncidentImportFieldAttributes> fields = null;

  public static final String JSON_PROPERTY_INCIDENT_TYPE_UUID = "incident_type_uuid";
  private String incidentTypeUuid;

  public static final String JSON_PROPERTY_RESOLVED = "resolved";
  private OffsetDateTime resolved;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private IncidentImportVisibility visibility = IncidentImportVisibility.ORGANIZATION;

  public IncidentImportRequestAttributes() {}

  @JsonCreator
  public IncidentImportRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.title = title;
  }

  public IncidentImportRequestAttributes declared(OffsetDateTime declared) {
    this.declared = declared;
    return this;
  }

  /**
   * Timestamp when the incident was declared.
   *
   * @return declared
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECLARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDeclared() {
    return declared;
  }

  public void setDeclared(OffsetDateTime declared) {
    this.declared = declared;
  }

  public IncidentImportRequestAttributes detected(OffsetDateTime detected) {
    this.detected = detected;
    return this;
  }

  /**
   * Timestamp when the incident was detected.
   *
   * @return detected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDetected() {
    return detected;
  }

  public void setDetected(OffsetDateTime detected) {
    this.detected = detected;
  }

  public IncidentImportRequestAttributes fields(Map<String, IncidentImportFieldAttributes> fields) {
    this.fields = fields;
    return this;
  }

  public IncidentImportRequestAttributes putFieldsItem(
      String key, IncidentImportFieldAttributes fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * A condensed view of the user-defined fields for which to create initial selections.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, IncidentImportFieldAttributes> getFields() {
    return fields;
  }

  public void setFields(Map<String, IncidentImportFieldAttributes> fields) {
    this.fields = fields;
  }

  public IncidentImportRequestAttributes incidentTypeUuid(String incidentTypeUuid) {
    this.incidentTypeUuid = incidentTypeUuid;
    return this;
  }

  /**
   * A unique identifier that represents the incident type. If not provided, the default incident
   * type is used.
   *
   * @return incidentTypeUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIncidentTypeUuid() {
    return incidentTypeUuid;
  }

  public void setIncidentTypeUuid(String incidentTypeUuid) {
    this.incidentTypeUuid = incidentTypeUuid;
  }

  public IncidentImportRequestAttributes resolved(OffsetDateTime resolved) {
    this.resolved = resolved;
    return this;
  }

  /**
   * Timestamp when the incident was resolved. Can only be set when the state field is set to
   * 'resolved'.
   *
   * @return resolved
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getResolved() {
    return resolved;
  }

  public void setResolved(OffsetDateTime resolved) {
    this.resolved = resolved;
  }

  public IncidentImportRequestAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the incident that summarizes what happened.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IncidentImportRequestAttributes visibility(IncidentImportVisibility visibility) {
    this.visibility = visibility;
    this.unparsed |= !visibility.isValid();
    return this;
  }

  /**
   * The visibility of the incident.
   *
   * @return visibility
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentImportVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(IncidentImportVisibility visibility) {
    if (!visibility.isValid()) {
      this.unparsed = true;
    }
    this.visibility = visibility;
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
   * @return IncidentImportRequestAttributes
   */
  @JsonAnySetter
  public IncidentImportRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentImportRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentImportRequestAttributes incidentImportRequestAttributes =
        (IncidentImportRequestAttributes) o;
    return Objects.equals(this.declared, incidentImportRequestAttributes.declared)
        && Objects.equals(this.detected, incidentImportRequestAttributes.detected)
        && Objects.equals(this.fields, incidentImportRequestAttributes.fields)
        && Objects.equals(this.incidentTypeUuid, incidentImportRequestAttributes.incidentTypeUuid)
        && Objects.equals(this.resolved, incidentImportRequestAttributes.resolved)
        && Objects.equals(this.title, incidentImportRequestAttributes.title)
        && Objects.equals(this.visibility, incidentImportRequestAttributes.visibility)
        && Objects.equals(
            this.additionalProperties, incidentImportRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        declared,
        detected,
        fields,
        incidentTypeUuid,
        resolved,
        title,
        visibility,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentImportRequestAttributes {\n");
    sb.append("    declared: ").append(toIndentedString(declared)).append("\n");
    sb.append("    detected: ").append(toIndentedString(detected)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    incidentTypeUuid: ").append(toIndentedString(incidentTypeUuid)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
