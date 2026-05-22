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

/**
 * A single historical revision of an entity, including the time range during which the revision was
 * observed.
 */
@JsonPropertyOrder({
  EntityContextRevision.JSON_PROPERTY_ATTRIBUTES,
  EntityContextRevision.JSON_PROPERTY_FIRST_SEEN_AT,
  EntityContextRevision.JSON_PROPERTY_LAST_SEEN_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityContextRevision {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_FIRST_SEEN_AT = "first_seen_at";
  private OffsetDateTime firstSeenAt;

  public static final String JSON_PROPERTY_LAST_SEEN_AT = "last_seen_at";
  private OffsetDateTime lastSeenAt;

  public EntityContextRevision() {}

  @JsonCreator
  public EntityContextRevision(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          Map<String, Object> attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_FIRST_SEEN_AT)
          OffsetDateTime firstSeenAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_SEEN_AT)
          OffsetDateTime lastSeenAt) {
    this.attributes = attributes;
    this.firstSeenAt = firstSeenAt;
    this.lastSeenAt = lastSeenAt;
  }

  public EntityContextRevision attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public EntityContextRevision putAttributesItem(String key, Object attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * The set of attributes recorded for the entity at this revision. The keys depend on the kind of
   * entity.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public EntityContextRevision firstSeenAt(OffsetDateTime firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

  /**
   * The first time the entity was observed at this revision.
   *
   * @return firstSeenAt
   */
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getFirstSeenAt() {
    return firstSeenAt;
  }

  public void setFirstSeenAt(OffsetDateTime firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
  }

  public EntityContextRevision lastSeenAt(OffsetDateTime lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
    return this;
  }

  /**
   * The last time the entity was observed at this revision.
   *
   * @return lastSeenAt
   */
  @JsonProperty(JSON_PROPERTY_LAST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastSeenAt() {
    return lastSeenAt;
  }

  public void setLastSeenAt(OffsetDateTime lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
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
   * @return EntityContextRevision
   */
  @JsonAnySetter
  public EntityContextRevision putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EntityContextRevision object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityContextRevision entityContextRevision = (EntityContextRevision) o;
    return Objects.equals(this.attributes, entityContextRevision.attributes)
        && Objects.equals(this.firstSeenAt, entityContextRevision.firstSeenAt)
        && Objects.equals(this.lastSeenAt, entityContextRevision.lastSeenAt)
        && Objects.equals(this.additionalProperties, entityContextRevision.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, firstSeenAt, lastSeenAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityContextRevision {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
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
