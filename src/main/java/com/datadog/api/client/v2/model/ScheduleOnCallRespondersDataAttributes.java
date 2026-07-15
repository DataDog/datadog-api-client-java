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

/** Attributes for a schedule's on-call responders lookup. */
@JsonPropertyOrder({ScheduleOnCallRespondersDataAttributes.JSON_PROPERTY_SCHEDULED_AT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScheduleOnCallRespondersDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduled_at";
  private OffsetDateTime scheduledAt;

  public ScheduleOnCallRespondersDataAttributes scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * The timestamp the responders were resolved at.
   *
   * @return scheduledAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
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
   * @return ScheduleOnCallRespondersDataAttributes
   */
  @JsonAnySetter
  public ScheduleOnCallRespondersDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScheduleOnCallRespondersDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleOnCallRespondersDataAttributes scheduleOnCallRespondersDataAttributes =
        (ScheduleOnCallRespondersDataAttributes) o;
    return Objects.equals(this.scheduledAt, scheduleOnCallRespondersDataAttributes.scheduledAt)
        && Objects.equals(
            this.additionalProperties, scheduleOnCallRespondersDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleOnCallRespondersDataAttributes {\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
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
