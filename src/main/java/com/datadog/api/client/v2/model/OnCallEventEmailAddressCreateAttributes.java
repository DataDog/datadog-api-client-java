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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for creating an on-call event email address. */
@JsonPropertyOrder({
  OnCallEventEmailAddressCreateAttributes.JSON_PROPERTY_ALERT_TYPE,
  OnCallEventEmailAddressCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  OnCallEventEmailAddressCreateAttributes.JSON_PROPERTY_FORMAT,
  OnCallEventEmailAddressCreateAttributes.JSON_PROPERTY_TAGS,
  OnCallEventEmailAddressCreateAttributes.JSON_PROPERTY_TEAM_HANDLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnCallEventEmailAddressCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERT_TYPE = "alert_type";
  private JsonNullable<EventEmailAddressAlertType> alertType =
      JsonNullable.<EventEmailAddressAlertType>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private EventEmailAddressFormat format;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEAM_HANDLE = "team_handle";
  private String teamHandle;

  public OnCallEventEmailAddressCreateAttributes() {}

  @JsonCreator
  public OnCallEventEmailAddressCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMAT) EventEmailAddressFormat format,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAM_HANDLE) String teamHandle) {
    this.format = format;
    this.unparsed |= !format.isValid();
    this.teamHandle = teamHandle;
  }

  public OnCallEventEmailAddressCreateAttributes alertType(EventEmailAddressAlertType alertType) {
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

  public OnCallEventEmailAddressCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the on-call event email address.
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

  public OnCallEventEmailAddressCreateAttributes format(EventEmailAddressFormat format) {
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

  public OnCallEventEmailAddressCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public OnCallEventEmailAddressCreateAttributes addTagsItem(String tagsItem) {
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

  public OnCallEventEmailAddressCreateAttributes teamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
    return this;
  }

  /**
   * The team handle associated with the on-call email address. Must contain only alphanumeric
   * characters, hyphens, and underscores.
   *
   * @return teamHandle
   */
  @JsonProperty(JSON_PROPERTY_TEAM_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeamHandle() {
    return teamHandle;
  }

  public void setTeamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
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
   * @return OnCallEventEmailAddressCreateAttributes
   */
  @JsonAnySetter
  public OnCallEventEmailAddressCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OnCallEventEmailAddressCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnCallEventEmailAddressCreateAttributes onCallEventEmailAddressCreateAttributes =
        (OnCallEventEmailAddressCreateAttributes) o;
    return Objects.equals(this.alertType, onCallEventEmailAddressCreateAttributes.alertType)
        && Objects.equals(this.description, onCallEventEmailAddressCreateAttributes.description)
        && Objects.equals(this.format, onCallEventEmailAddressCreateAttributes.format)
        && Objects.equals(this.tags, onCallEventEmailAddressCreateAttributes.tags)
        && Objects.equals(this.teamHandle, onCallEventEmailAddressCreateAttributes.teamHandle)
        && Objects.equals(
            this.additionalProperties,
            onCallEventEmailAddressCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertType, description, format, tags, teamHandle, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnCallEventEmailAddressCreateAttributes {\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teamHandle: ").append(toIndentedString(teamHandle)).append("\n");
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
