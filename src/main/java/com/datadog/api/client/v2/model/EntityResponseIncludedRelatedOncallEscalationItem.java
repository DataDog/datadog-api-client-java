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

/** Oncall escalation. */
@JsonPropertyOrder({
  EntityResponseIncludedRelatedOncallEscalationItem.JSON_PROPERTY_EMAIL,
  EntityResponseIncludedRelatedOncallEscalationItem.JSON_PROPERTY_ESCALATION_LEVEL,
  EntityResponseIncludedRelatedOncallEscalationItem.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityResponseIncludedRelatedOncallEscalationItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ESCALATION_LEVEL = "escalationLevel";
  private Long escalationLevel;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public EntityResponseIncludedRelatedOncallEscalationItem email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Oncall email.
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EntityResponseIncludedRelatedOncallEscalationItem escalationLevel(Long escalationLevel) {
    this.escalationLevel = escalationLevel;
    return this;
  }

  /**
   * Oncall level.
   *
   * @return escalationLevel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESCALATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEscalationLevel() {
    return escalationLevel;
  }

  public void setEscalationLevel(Long escalationLevel) {
    this.escalationLevel = escalationLevel;
  }

  public EntityResponseIncludedRelatedOncallEscalationItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Oncall name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return EntityResponseIncludedRelatedOncallEscalationItem
   */
  @JsonAnySetter
  public EntityResponseIncludedRelatedOncallEscalationItem putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this EntityResponseIncludedRelatedOncallEscalationItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityResponseIncludedRelatedOncallEscalationItem
        entityResponseIncludedRelatedOncallEscalationItem =
            (EntityResponseIncludedRelatedOncallEscalationItem) o;
    return Objects.equals(this.email, entityResponseIncludedRelatedOncallEscalationItem.email)
        && Objects.equals(
            this.escalationLevel, entityResponseIncludedRelatedOncallEscalationItem.escalationLevel)
        && Objects.equals(this.name, entityResponseIncludedRelatedOncallEscalationItem.name)
        && Objects.equals(
            this.additionalProperties,
            entityResponseIncludedRelatedOncallEscalationItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, escalationLevel, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityResponseIncludedRelatedOncallEscalationItem {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    escalationLevel: ").append(toIndentedString(escalationLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
