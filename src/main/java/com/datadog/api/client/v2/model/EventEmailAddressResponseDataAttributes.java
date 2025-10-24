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

/** */
@JsonPropertyOrder({
  EventEmailAddressResponseDataAttributes.JSON_PROPERTY_ALERT_TYPE,
  EventEmailAddressResponseDataAttributes.JSON_PROPERTY_CREATED_AT,
  EventEmailAddressResponseDataAttributes.JSON_PROPERTY_DESCRIPTION,
  EventEmailAddressResponseDataAttributes.JSON_PROPERTY_EMAIL,
  EventEmailAddressResponseDataAttributes.JSON_PROPERTY_FORMAT,
  EventEmailAddressResponseDataAttributes.JSON_PROPERTY_LAST_USED_AT,
  EventEmailAddressResponseDataAttributes.JSON_PROPERTY_NOTIFY_HANDLES,
  EventEmailAddressResponseDataAttributes.JSON_PROPERTY_REVOKED_AT,
  EventEmailAddressResponseDataAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventEmailAddressResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERT_TYPE = "alert_type";
  private String alertType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;

  public static final String JSON_PROPERTY_LAST_USED_AT = "last_used_at";
  private OffsetDateTime lastUsedAt;

  public static final String JSON_PROPERTY_NOTIFY_HANDLES = "notify_handles";
  private List<String> notifyHandles = new ArrayList<>();

  public static final String JSON_PROPERTY_REVOKED_AT = "revoked_at";
  private OffsetDateTime revokedAt;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public EventEmailAddressResponseDataAttributes() {}

  @JsonCreator
  public EventEmailAddressResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EMAIL) String email,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMAT) String format,
      @JsonProperty(required = true, value = JSON_PROPERTY_NOTIFY_HANDLES)
          List<String> notifyHandles,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.createdAt = createdAt;
    this.email = email;
    this.format = format;
    this.notifyHandles = notifyHandles;
    this.tags = tags;
  }

  public EventEmailAddressResponseDataAttributes alertType(String alertType) {
    this.alertType = alertType;
    return this;
  }

  /**
   * GetalertType
   *
   * @return alertType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlertType() {
    return alertType;
  }

  public void setAlertType(String alertType) {
    this.alertType = alertType;
  }

  public EventEmailAddressResponseDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * GetcreatedAt
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

  public EventEmailAddressResponseDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Getdescription
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EventEmailAddressResponseDataAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Getemail
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

  public EventEmailAddressResponseDataAttributes format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Getformat
   *
   * @return format
   */
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public EventEmailAddressResponseDataAttributes lastUsedAt(OffsetDateTime lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
    return this;
  }

  /**
   * GetlastUsedAt
   *
   * @return lastUsedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastUsedAt() {
    return lastUsedAt;
  }

  public void setLastUsedAt(OffsetDateTime lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public EventEmailAddressResponseDataAttributes notifyHandles(List<String> notifyHandles) {
    this.notifyHandles = notifyHandles;
    return this;
  }

  public EventEmailAddressResponseDataAttributes addNotifyHandlesItem(String notifyHandlesItem) {
    this.notifyHandles.add(notifyHandlesItem);
    return this;
  }

  /**
   * GetnotifyHandles
   *
   * @return notifyHandles
   */
  @JsonProperty(JSON_PROPERTY_NOTIFY_HANDLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getNotifyHandles() {
    return notifyHandles;
  }

  public void setNotifyHandles(List<String> notifyHandles) {
    this.notifyHandles = notifyHandles;
  }

  public EventEmailAddressResponseDataAttributes revokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
    return this;
  }

  /**
   * GetrevokedAt
   *
   * @return revokedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVOKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getRevokedAt() {
    return revokedAt;
  }

  public void setRevokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
  }

  public EventEmailAddressResponseDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EventEmailAddressResponseDataAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Gettags
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return EventEmailAddressResponseDataAttributes
   */
  @JsonAnySetter
  public EventEmailAddressResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EventEmailAddressResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEmailAddressResponseDataAttributes eventEmailAddressResponseDataAttributes =
        (EventEmailAddressResponseDataAttributes) o;
    return Objects.equals(this.alertType, eventEmailAddressResponseDataAttributes.alertType)
        && Objects.equals(this.createdAt, eventEmailAddressResponseDataAttributes.createdAt)
        && Objects.equals(this.description, eventEmailAddressResponseDataAttributes.description)
        && Objects.equals(this.email, eventEmailAddressResponseDataAttributes.email)
        && Objects.equals(this.format, eventEmailAddressResponseDataAttributes.format)
        && Objects.equals(this.lastUsedAt, eventEmailAddressResponseDataAttributes.lastUsedAt)
        && Objects.equals(this.notifyHandles, eventEmailAddressResponseDataAttributes.notifyHandles)
        && Objects.equals(this.revokedAt, eventEmailAddressResponseDataAttributes.revokedAt)
        && Objects.equals(this.tags, eventEmailAddressResponseDataAttributes.tags)
        && Objects.equals(
            this.additionalProperties,
            eventEmailAddressResponseDataAttributes.additionalProperties);
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
    sb.append("class EventEmailAddressResponseDataAttributes {\n");
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
