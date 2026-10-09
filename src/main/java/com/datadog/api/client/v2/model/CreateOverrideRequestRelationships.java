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

/** Relationships to set when creating an on-call schedule override. */
@JsonPropertyOrder({
  CreateOverrideRequestRelationships.JSON_PROPERTY_OVERRIDDEN_USER,
  CreateOverrideRequestRelationships.JSON_PROPERTY_USER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateOverrideRequestRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OVERRIDDEN_USER = "overridden_user";
  private OverrideRelationshipsUser overriddenUser;

  public static final String JSON_PROPERTY_USER = "user";
  private OverrideRelationshipsUser user;

  public CreateOverrideRequestRelationships overriddenUser(
      OverrideRelationshipsUser overriddenUser) {
    this.overriddenUser = overriddenUser;
    this.unparsed |= overriddenUser.unparsed;
    return this;
  }

  /**
   * Defines the relationship between an override and one of its associated users.
   *
   * @return overriddenUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDDEN_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OverrideRelationshipsUser getOverriddenUser() {
    return overriddenUser;
  }

  public void setOverriddenUser(OverrideRelationshipsUser overriddenUser) {
    this.overriddenUser = overriddenUser;
    if (overriddenUser != null) {
      this.unparsed |= overriddenUser.unparsed;
    }
  }

  public CreateOverrideRequestRelationships user(OverrideRelationshipsUser user) {
    this.user = user;
    this.unparsed |= user.unparsed;
    return this;
  }

  /**
   * Defines the relationship between an override and one of its associated users.
   *
   * @return user
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OverrideRelationshipsUser getUser() {
    return user;
  }

  public void setUser(OverrideRelationshipsUser user) {
    this.user = user;
    if (user != null) {
      this.unparsed |= user.unparsed;
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
   * @return CreateOverrideRequestRelationships
   */
  @JsonAnySetter
  public CreateOverrideRequestRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateOverrideRequestRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOverrideRequestRelationships createOverrideRequestRelationships =
        (CreateOverrideRequestRelationships) o;
    return Objects.equals(this.overriddenUser, createOverrideRequestRelationships.overriddenUser)
        && Objects.equals(this.user, createOverrideRequestRelationships.user)
        && Objects.equals(
            this.additionalProperties, createOverrideRequestRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overriddenUser, user, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOverrideRequestRelationships {\n");
    sb.append("    overriddenUser: ").append(toIndentedString(overriddenUser)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
