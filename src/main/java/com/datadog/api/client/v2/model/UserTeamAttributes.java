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
import org.openapitools.jackson.nullable.JsonNullable;

/** Team membership attributes */
@JsonPropertyOrder({UserTeamAttributes.JSON_PROPERTY_ROLE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserTeamAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ROLE = "role";
  private JsonNullable<UserTeamRole> role = JsonNullable.<UserTeamRole>undefined();

  public UserTeamAttributes role(UserTeamRole role) {
    this.role = JsonNullable.<UserTeamRole>of(role);
    return this;
  }

  /**
   * The user's role within the team
   *
   * @return role
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UserTeamRole getRole() {
    return role.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UserTeamRole> getRole_JsonNullable() {
    return role;
  }

  @JsonProperty(JSON_PROPERTY_ROLE)
  public void setRole_JsonNullable(JsonNullable<UserTeamRole> role) {
    this.role = role;
  }

  public void setRole(UserTeamRole role) {
    if (!role.isValid()) {
      this.unparsed = true;
    }
    this.role = JsonNullable.<UserTeamRole>of(role);
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
   * @return UserTeamAttributes
   */
  @JsonAnySetter
  public UserTeamAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UserTeamAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTeamAttributes userTeamAttributes = (UserTeamAttributes) o;
    return Objects.equals(this.role, userTeamAttributes.role)
        && Objects.equals(this.additionalProperties, userTeamAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTeamAttributes {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
