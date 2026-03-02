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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for updating an event email address. */
@JsonPropertyOrder({
  EventEmailAddressUpdateAttributes.JSON_PROPERTY_ALERT_TYPE,
  EventEmailAddressUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  EventEmailAddressUpdateAttributes.JSON_PROPERTY_NOTIFY_HANDLES,
  EventEmailAddressUpdateAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventEmailAddressUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERT_TYPE = "alert_type";
  private EventEmailAddressAlertType alertType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NOTIFY_HANDLES = "notify_handles";
  private List<String> notifyHandles = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public EventEmailAddressUpdateAttributes() {}

  @JsonCreator
  public EventEmailAddressUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALERT_TYPE)
          EventEmailAddressAlertType alertType,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NOTIFY_HANDLES)
          List<String> notifyHandles,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.alertType = alertType;
    if (alertType != null) {
      this.unparsed |= !alertType.isValid();
    }
    this.description = description;
    if (description != null) {}
    this.notifyHandles = notifyHandles;
    this.tags = tags;
  }

  public EventEmailAddressUpdateAttributes alertType(EventEmailAddressAlertType alertType) {
    this.alertType = alertType;
    if (alertType != null) {
      this.unparsed |= !alertType.isValid();
    }
    return this;
  }

  /**
   * The alert type of events generated from the email address.
   *
   * @return alertType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventEmailAddressAlertType getAlertType() {
    return alertType;
  }

  public void setAlertType(EventEmailAddressAlertType alertType) {
    if (!alertType.isValid()) {
      this.unparsed = true;
    }
    this.alertType = alertType;
  }

  public EventEmailAddressUpdateAttributes description(String description) {
    this.description = description;
    if (description != null) {}
    return this;
  }

  /**
   * A description of the event email address.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EventEmailAddressUpdateAttributes notifyHandles(List<String> notifyHandles) {
    this.notifyHandles = notifyHandles;
    return this;
  }

  public EventEmailAddressUpdateAttributes addNotifyHandlesItem(String notifyHandlesItem) {
    this.notifyHandles.add(notifyHandlesItem);
    return this;
  }

  /**
   * A list of handles to notify when an email is received.
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

  public EventEmailAddressUpdateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EventEmailAddressUpdateAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags to apply to events generated from the email address.
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
   * @return EventEmailAddressUpdateAttributes
   */
  @JsonAnySetter
  public EventEmailAddressUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EventEmailAddressUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEmailAddressUpdateAttributes eventEmailAddressUpdateAttributes =
        (EventEmailAddressUpdateAttributes) o;
    return Objects.equals(this.alertType, eventEmailAddressUpdateAttributes.alertType)
        && Objects.equals(this.description, eventEmailAddressUpdateAttributes.description)
        && Objects.equals(this.notifyHandles, eventEmailAddressUpdateAttributes.notifyHandles)
        && Objects.equals(this.tags, eventEmailAddressUpdateAttributes.tags)
        && Objects.equals(
            this.additionalProperties, eventEmailAddressUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertType, description, notifyHandles, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEmailAddressUpdateAttributes {\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notifyHandles: ").append(toIndentedString(notifyHandles)).append("\n");
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
