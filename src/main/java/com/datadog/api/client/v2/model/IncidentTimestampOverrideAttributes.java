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

/** Attributes of an incident timestamp override. */
@JsonPropertyOrder({
  IncidentTimestampOverrideAttributes.JSON_PROPERTY_CREATED_AT,
  IncidentTimestampOverrideAttributes.JSON_PROPERTY_DELETED_AT,
  IncidentTimestampOverrideAttributes.JSON_PROPERTY_INCIDENT_ID,
  IncidentTimestampOverrideAttributes.JSON_PROPERTY_MODIFIED_AT,
  IncidentTimestampOverrideAttributes.JSON_PROPERTY_TIMESTAMP_TYPE,
  IncidentTimestampOverrideAttributes.JSON_PROPERTY_TIMESTAMP_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTimestampOverrideAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private OffsetDateTime deletedAt;

  public static final String JSON_PROPERTY_INCIDENT_ID = "incident_id";
  private UUID incidentId;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_TIMESTAMP_TYPE = "timestamp_type";
  private TimestampType timestampType;

  public static final String JSON_PROPERTY_TIMESTAMP_VALUE = "timestamp_value";
  private OffsetDateTime timestampValue;

  public IncidentTimestampOverrideAttributes() {}

  @JsonCreator
  public IncidentTimestampOverrideAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DELETED_AT) OffsetDateTime deletedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_ID) UUID incidentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP_TYPE)
          TimestampType timestampType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP_VALUE)
          OffsetDateTime timestampValue) {
    this.createdAt = createdAt;
    this.deletedAt = deletedAt;
    if (deletedAt != null) {}
    this.incidentId = incidentId;
    this.modifiedAt = modifiedAt;
    this.timestampType = timestampType;
    this.unparsed |= !timestampType.isValid();
    this.timestampValue = timestampValue;
  }

  public IncidentTimestampOverrideAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of when the override was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IncidentTimestampOverrideAttributes deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    if (deletedAt != null) {}
    return this;
  }

  /**
   * Timestamp of when the override was deleted (soft delete).
   *
   * @return deletedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public IncidentTimestampOverrideAttributes incidentId(UUID incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * The UUID of the incident.
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

  public IncidentTimestampOverrideAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp of when the override was last modified.
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

  public IncidentTimestampOverrideAttributes timestampType(TimestampType timestampType) {
    this.timestampType = timestampType;
    this.unparsed |= !timestampType.isValid();
    return this;
  }

  /**
   * The type of timestamp being overridden.
   *
   * @return timestampType
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimestampType getTimestampType() {
    return timestampType;
  }

  public void setTimestampType(TimestampType timestampType) {
    if (!timestampType.isValid()) {
      this.unparsed = true;
    }
    this.timestampType = timestampType;
  }

  public IncidentTimestampOverrideAttributes timestampValue(OffsetDateTime timestampValue) {
    this.timestampValue = timestampValue;
    return this;
  }

  /**
   * The timestamp value for the override.
   *
   * @return timestampValue
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getTimestampValue() {
    return timestampValue;
  }

  public void setTimestampValue(OffsetDateTime timestampValue) {
    this.timestampValue = timestampValue;
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
   * @return IncidentTimestampOverrideAttributes
   */
  @JsonAnySetter
  public IncidentTimestampOverrideAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentTimestampOverrideAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTimestampOverrideAttributes incidentTimestampOverrideAttributes =
        (IncidentTimestampOverrideAttributes) o;
    return Objects.equals(this.createdAt, incidentTimestampOverrideAttributes.createdAt)
        && Objects.equals(this.deletedAt, incidentTimestampOverrideAttributes.deletedAt)
        && Objects.equals(this.incidentId, incidentTimestampOverrideAttributes.incidentId)
        && Objects.equals(this.modifiedAt, incidentTimestampOverrideAttributes.modifiedAt)
        && Objects.equals(this.timestampType, incidentTimestampOverrideAttributes.timestampType)
        && Objects.equals(this.timestampValue, incidentTimestampOverrideAttributes.timestampValue)
        && Objects.equals(
            this.additionalProperties, incidentTimestampOverrideAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        deletedAt,
        incidentId,
        modifiedAt,
        timestampType,
        timestampValue,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTimestampOverrideAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    timestampType: ").append(toIndentedString(timestampType)).append("\n");
    sb.append("    timestampValue: ").append(toIndentedString(timestampValue)).append("\n");
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
