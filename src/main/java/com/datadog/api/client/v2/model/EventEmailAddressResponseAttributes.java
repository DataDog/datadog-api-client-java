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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of an event email address resource. */
@JsonPropertyOrder({
  EventEmailAddressResponseAttributes.JSON_PROPERTY_ALERT_TYPE,
  EventEmailAddressResponseAttributes.JSON_PROPERTY_CREATED_AT,
  EventEmailAddressResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  EventEmailAddressResponseAttributes.JSON_PROPERTY_EMAIL,
  EventEmailAddressResponseAttributes.JSON_PROPERTY_FORMAT,
  EventEmailAddressResponseAttributes.JSON_PROPERTY_LAST_USED_AT,
  EventEmailAddressResponseAttributes.JSON_PROPERTY_NOTIFY_HANDLES,
  EventEmailAddressResponseAttributes.JSON_PROPERTY_REVOKED_AT,
  EventEmailAddressResponseAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventEmailAddressResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERT_TYPE = "alert_type";
  private JsonNullable<EventEmailAddressAlertType> alertType =
      JsonNullable.<EventEmailAddressAlertType>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private EventEmailAddressFormat format;

  public static final String JSON_PROPERTY_LAST_USED_AT = "last_used_at";
  private JsonNullable<OffsetDateTime> lastUsedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_NOTIFY_HANDLES = "notify_handles";
  private List<String> notifyHandles = null;

  public static final String JSON_PROPERTY_REVOKED_AT = "revoked_at";
  private JsonNullable<OffsetDateTime> revokedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public EventEmailAddressResponseAttributes() {}

  @JsonCreator
  public EventEmailAddressResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EMAIL) String email,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMAT) EventEmailAddressFormat format) {
    this.createdAt = createdAt;
    this.email = email;
    this.format = format;
    this.unparsed |= !format.isValid();
  }

  public EventEmailAddressResponseAttributes alertType(EventEmailAddressAlertType alertType) {
    this.alertType = JsonNullable.<EventEmailAddressAlertType>of(alertType);
    return this;
  }

  /**
   * The alert type of events generated from the email address.
   *
   * @return alertType
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public EventEmailAddressAlertType getAlertType() {
    return alertType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<EventEmailAddressAlertType> getAlertType_JsonNullable() {
    return alertType;
  }

  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  public void setAlertType_JsonNullable(JsonNullable<EventEmailAddressAlertType> alertType) {
    this.alertType = alertType;
  }

  public void setAlertType(EventEmailAddressAlertType alertType) {
    if (!alertType.isValid()) {
      this.unparsed = true;
    }
    this.alertType = JsonNullable.<EventEmailAddressAlertType>of(alertType);
  }

  public EventEmailAddressResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp of when the event email address was created.
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

  public EventEmailAddressResponseAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * A description of the event email address.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public EventEmailAddressResponseAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The generated email address for ingesting events.
   *
   * @return email
   */
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EventEmailAddressResponseAttributes format(EventEmailAddressFormat format) {
    this.format = format;
    this.unparsed |= !format.isValid();
    return this;
  }

  /**
   * The format of events ingested through the email address.
   *
   * @return format
   */
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventEmailAddressFormat getFormat() {
    return format;
  }

  public void setFormat(EventEmailAddressFormat format) {
    if (!format.isValid()) {
      this.unparsed = true;
    }
    this.format = format;
  }

  public EventEmailAddressResponseAttributes lastUsedAt(OffsetDateTime lastUsedAt) {
    this.lastUsedAt = JsonNullable.<OffsetDateTime>of(lastUsedAt);
    return this;
  }

  /**
   * The timestamp of when the event email address was last used.
   *
   * @return lastUsedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getLastUsedAt() {
    return lastUsedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getLastUsedAt_JsonNullable() {
    return lastUsedAt;
  }

  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  public void setLastUsedAt_JsonNullable(JsonNullable<OffsetDateTime> lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public void setLastUsedAt(OffsetDateTime lastUsedAt) {
    this.lastUsedAt = JsonNullable.<OffsetDateTime>of(lastUsedAt);
  }

  public EventEmailAddressResponseAttributes notifyHandles(List<String> notifyHandles) {
    this.notifyHandles = notifyHandles;
    return this;
  }

  public EventEmailAddressResponseAttributes addNotifyHandlesItem(String notifyHandlesItem) {
    if (this.notifyHandles == null) {
      this.notifyHandles = new ArrayList<>();
    }
    this.notifyHandles.add(notifyHandlesItem);
    return this;
  }

  /**
   * A list of handles to notify when an email is received.
   *
   * @return notifyHandles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_HANDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getNotifyHandles() {
    return notifyHandles;
  }

  public void setNotifyHandles(List<String> notifyHandles) {
    this.notifyHandles = notifyHandles;
  }

  public EventEmailAddressResponseAttributes revokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = JsonNullable.<OffsetDateTime>of(revokedAt);
    return this;
  }

  /**
   * The timestamp of when the event email address was revoked.
   *
   * @return revokedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getRevokedAt() {
    return revokedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REVOKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getRevokedAt_JsonNullable() {
    return revokedAt;
  }

  @JsonProperty(JSON_PROPERTY_REVOKED_AT)
  public void setRevokedAt_JsonNullable(JsonNullable<OffsetDateTime> revokedAt) {
    this.revokedAt = revokedAt;
  }

  public void setRevokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = JsonNullable.<OffsetDateTime>of(revokedAt);
  }

  public EventEmailAddressResponseAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EventEmailAddressResponseAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags to apply to events generated from the email address.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return EventEmailAddressResponseAttributes
   */
  @JsonAnySetter
  public EventEmailAddressResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EventEmailAddressResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEmailAddressResponseAttributes eventEmailAddressResponseAttributes =
        (EventEmailAddressResponseAttributes) o;
    return Objects.equals(this.alertType, eventEmailAddressResponseAttributes.alertType)
        && Objects.equals(this.createdAt, eventEmailAddressResponseAttributes.createdAt)
        && Objects.equals(this.description, eventEmailAddressResponseAttributes.description)
        && Objects.equals(this.email, eventEmailAddressResponseAttributes.email)
        && Objects.equals(this.format, eventEmailAddressResponseAttributes.format)
        && Objects.equals(this.lastUsedAt, eventEmailAddressResponseAttributes.lastUsedAt)
        && Objects.equals(this.notifyHandles, eventEmailAddressResponseAttributes.notifyHandles)
        && Objects.equals(this.revokedAt, eventEmailAddressResponseAttributes.revokedAt)
        && Objects.equals(this.tags, eventEmailAddressResponseAttributes.tags)
        && Objects.equals(
            this.additionalProperties, eventEmailAddressResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alertType,
        createdAt,
        description,
        email,
        format,
        lastUsedAt,
        notifyHandles,
        revokedAt,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEmailAddressResponseAttributes {\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    notifyHandles: ").append(toIndentedString(notifyHandles)).append("\n");
    sb.append("    revokedAt: ").append(toIndentedString(revokedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
