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

/** Attributes of an email subscription. */
@JsonPropertyOrder({
  IncidentStatuspageSubscriptionDataAttributesResponse.JSON_PROPERTY_CONFIRMED,
  IncidentStatuspageSubscriptionDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  IncidentStatuspageSubscriptionDataAttributesResponse.JSON_PROPERTY_EMAIL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentStatuspageSubscriptionDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIRMED = "confirmed";
  private Boolean confirmed;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public IncidentStatuspageSubscriptionDataAttributesResponse() {}

  @JsonCreator
  public IncidentStatuspageSubscriptionDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIRMED) Boolean confirmed,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EMAIL) String email) {
    this.confirmed = confirmed;
    this.createdAt = createdAt;
    this.email = email;
  }

  public IncidentStatuspageSubscriptionDataAttributesResponse confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

  /**
   * Whether the subscription has been confirmed.
   *
   * @return confirmed
   */
  @JsonProperty(JSON_PROPERTY_CONFIRMED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public IncidentStatuspageSubscriptionDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the subscription was created.
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

  public IncidentStatuspageSubscriptionDataAttributesResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The subscribed email address.
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
   * @return IncidentStatuspageSubscriptionDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentStatuspageSubscriptionDataAttributesResponse putAdditionalProperty(
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

  /**
   * Return true if this IncidentStatuspageSubscriptionDataAttributesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentStatuspageSubscriptionDataAttributesResponse
        incidentStatuspageSubscriptionDataAttributesResponse =
            (IncidentStatuspageSubscriptionDataAttributesResponse) o;
    return Objects.equals(
            this.confirmed, incidentStatuspageSubscriptionDataAttributesResponse.confirmed)
        && Objects.equals(
            this.createdAt, incidentStatuspageSubscriptionDataAttributesResponse.createdAt)
        && Objects.equals(this.email, incidentStatuspageSubscriptionDataAttributesResponse.email)
        && Objects.equals(
            this.additionalProperties,
            incidentStatuspageSubscriptionDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmed, createdAt, email, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentStatuspageSubscriptionDataAttributesResponse {\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
