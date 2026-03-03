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
import org.openapitools.jackson.nullable.JsonNullable;

/** Relationships associated with an event email address resource. */
@JsonPropertyOrder({
  EventEmailAddressRelationships.JSON_PROPERTY_CREATED_BY,
  EventEmailAddressRelationships.JSON_PROPERTY_REVOKED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventEmailAddressRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private EventEmailAddressCreatedByRelationship createdBy;

  public static final String JSON_PROPERTY_REVOKED_BY = "revoked_by";
  private JsonNullable<EventEmailAddressRevokedByRelationship> revokedBy =
      JsonNullable.<EventEmailAddressRevokedByRelationship>undefined();

  public EventEmailAddressRelationships() {}

  @JsonCreator
  public EventEmailAddressRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY)
          EventEmailAddressCreatedByRelationship createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
  }

  public EventEmailAddressRelationships createdBy(
      EventEmailAddressCreatedByRelationship createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * Relationship to the user who created the email address.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventEmailAddressCreatedByRelationship getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(EventEmailAddressCreatedByRelationship createdBy) {
    this.createdBy = createdBy;
  }

  public EventEmailAddressRelationships revokedBy(
      EventEmailAddressRevokedByRelationship revokedBy) {
    this.revokedBy = JsonNullable.<EventEmailAddressRevokedByRelationship>of(revokedBy);
    return this;
  }

  /**
   * Relationship to the user who revoked the email address.
   *
   * @return revokedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public EventEmailAddressRevokedByRelationship getRevokedBy() {
    return revokedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REVOKED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<EventEmailAddressRevokedByRelationship> getRevokedBy_JsonNullable() {
    return revokedBy;
  }

  @JsonProperty(JSON_PROPERTY_REVOKED_BY)
  public void setRevokedBy_JsonNullable(
      JsonNullable<EventEmailAddressRevokedByRelationship> revokedBy) {
    this.revokedBy = revokedBy;
  }

  public void setRevokedBy(EventEmailAddressRevokedByRelationship revokedBy) {
    this.revokedBy = JsonNullable.<EventEmailAddressRevokedByRelationship>of(revokedBy);
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
   * @return EventEmailAddressRelationships
   */
  @JsonAnySetter
  public EventEmailAddressRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EventEmailAddressRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEmailAddressRelationships eventEmailAddressRelationships =
        (EventEmailAddressRelationships) o;
    return Objects.equals(this.createdBy, eventEmailAddressRelationships.createdBy)
        && Objects.equals(this.revokedBy, eventEmailAddressRelationships.revokedBy)
        && Objects.equals(
            this.additionalProperties, eventEmailAddressRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, revokedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEmailAddressRelationships {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    revokedBy: ").append(toIndentedString(revokedBy)).append("\n");
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
