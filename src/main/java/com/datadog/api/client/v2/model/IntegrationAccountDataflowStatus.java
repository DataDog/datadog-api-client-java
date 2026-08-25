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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Read-only collection status of a dataflow. */
@JsonPropertyOrder({
  IntegrationAccountDataflowStatus.JSON_PROPERTY_HEALTH,
  IntegrationAccountDataflowStatus.JSON_PROPERTY_MESSAGE,
  IntegrationAccountDataflowStatus.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationAccountDataflowStatus {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEALTH = "health";
  private IntegrationAccountDataflowHealth health;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public IntegrationAccountDataflowStatus health(IntegrationAccountDataflowHealth health) {
    this.health = health;
    this.unparsed |= !health.isValid();
    return this;
  }

  /**
   * Collection health of a single dataflow.
   *
   * @return health
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEALTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationAccountDataflowHealth getHealth() {
    return health;
  }

  public void setHealth(IntegrationAccountDataflowHealth health) {
    if (!health.isValid()) {
      this.unparsed = true;
    }
    this.health = health;
  }

  public IntegrationAccountDataflowStatus message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Human-readable detail, populated when the dataflow is not healthy.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IntegrationAccountDataflowStatus updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time the status was last computed.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return IntegrationAccountDataflowStatus
   */
  @JsonAnySetter
  public IntegrationAccountDataflowStatus putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IntegrationAccountDataflowStatus object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationAccountDataflowStatus integrationAccountDataflowStatus =
        (IntegrationAccountDataflowStatus) o;
    return Objects.equals(this.health, integrationAccountDataflowStatus.health)
        && Objects.equals(this.message, integrationAccountDataflowStatus.message)
        && Objects.equals(this.updatedAt, integrationAccountDataflowStatus.updatedAt)
        && Objects.equals(
            this.additionalProperties, integrationAccountDataflowStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(health, message, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationAccountDataflowStatus {\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
