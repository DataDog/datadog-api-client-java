/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**

 */
@JsonPropertyOrder({
  SeatUserDataAttributes.JSON_PROPERTY_ASSIGNED_AT,
  SeatUserDataAttributes.JSON_PROPERTY_EMAIL,
  SeatUserDataAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SeatUserDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNED_AT = "assigned_at";
  private JsonNullable<OffsetDateTime> assignedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public SeatUserDataAttributes assignedAt(OffsetDateTime assignedAt) {
    this.assignedAt = JsonNullable.<OffsetDateTime>of(assignedAt);
    return this;
  }

  /**
   * <p>The date and time the seat was assigned.</p>
   * @return assignedAt
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getAssignedAt() {
        return assignedAt.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ASSIGNED_AT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getAssignedAt_JsonNullable() {
    return assignedAt;
  }
  @JsonProperty(JSON_PROPERTY_ASSIGNED_AT)public void setAssignedAt_JsonNullable(JsonNullable<OffsetDateTime> assignedAt) {
    this.assignedAt = assignedAt;
  }
  public void setAssignedAt(OffsetDateTime assignedAt) {
    this.assignedAt = JsonNullable.<OffsetDateTime>of(assignedAt);
  }
  public SeatUserDataAttributes email(String email) {
    this.email = JsonNullable.<String>of(email);
    return this;
  }

  /**
   * <p>The email of the user.</p>
   * @return email
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getEmail() {
        return email.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  @JsonProperty(JSON_PROPERTY_EMAIL)public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }
  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }
  public SeatUserDataAttributes name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * <p>The name of the user.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getName() {
        return name.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  @JsonProperty(JSON_PROPERTY_NAME)public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }
  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SeatUserDataAttributes
   */
  @JsonAnySetter
  public SeatUserDataAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SeatUserDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatUserDataAttributes seatUserDataAttributes = (SeatUserDataAttributes) o;
    return Objects.equals(this.assignedAt, seatUserDataAttributes.assignedAt) && Objects.equals(this.email, seatUserDataAttributes.email) && Objects.equals(this.name, seatUserDataAttributes.name) && Objects.equals(this.additionalProperties, seatUserDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(assignedAt,email,name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatUserDataAttributes {\n");
    sb.append("    assignedAt: ").append(toIndentedString(assignedAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
