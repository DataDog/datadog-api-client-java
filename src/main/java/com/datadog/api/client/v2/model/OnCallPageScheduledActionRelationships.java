/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The relationships of a scheduled action. */
@JsonPropertyOrder({
  OnCallPageScheduledActionRelationships.JSON_PROPERTY_SCHEDULES,
  OnCallPageScheduledActionRelationships.JSON_PROPERTY_USERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnCallPageScheduledActionRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCHEDULES = "schedules";
  private OnCallPageScheduledActionRelationshipsSchedules schedules;

  public static final String JSON_PROPERTY_USERS = "users";
  private OnCallPageScheduledActionRelationshipsUsers users;

  public OnCallPageScheduledActionRelationships schedules(
      OnCallPageScheduledActionRelationshipsSchedules schedules) {
    this.schedules = schedules;
    this.unparsed |= schedules.unparsed;
    return this;
  }

  /**
   * The schedules the action escalates to.
   *
   * @return schedules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageScheduledActionRelationshipsSchedules getSchedules() {
    return schedules;
  }

  public void setSchedules(OnCallPageScheduledActionRelationshipsSchedules schedules) {
    this.schedules = schedules;
    if (schedules != null) {
      this.unparsed |= schedules.unparsed;
    }
  }

  public OnCallPageScheduledActionRelationships users(
      OnCallPageScheduledActionRelationshipsUsers users) {
    this.users = users;
    this.unparsed |= users.unparsed;
    return this;
  }

  /**
   * The users the action escalates to.
   *
   * @return users
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageScheduledActionRelationshipsUsers getUsers() {
    return users;
  }

  public void setUsers(OnCallPageScheduledActionRelationshipsUsers users) {
    this.users = users;
    if (users != null) {
      this.unparsed |= users.unparsed;
    }
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
   * @return OnCallPageScheduledActionRelationships
   */
  @JsonAnySetter
  public OnCallPageScheduledActionRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OnCallPageScheduledActionRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnCallPageScheduledActionRelationships onCallPageScheduledActionRelationships =
        (OnCallPageScheduledActionRelationships) o;
    return Objects.equals(this.schedules, onCallPageScheduledActionRelationships.schedules)
        && Objects.equals(this.users, onCallPageScheduledActionRelationships.users)
        && Objects.equals(
            this.additionalProperties, onCallPageScheduledActionRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedules, users, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnCallPageScheduledActionRelationships {\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
