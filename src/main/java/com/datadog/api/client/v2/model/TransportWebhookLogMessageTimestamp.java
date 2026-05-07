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

/** The message delivery timing information. */
@JsonPropertyOrder({
  TransportWebhookLogMessageTimestamp.JSON_PROPERTY_EVENT_TIMESTAMP,
  TransportWebhookLogMessageTimestamp.JSON_PROPERTY_LIFETIME,
  TransportWebhookLogMessageTimestamp.JSON_PROPERTY_QUEUE_TIME,
  TransportWebhookLogMessageTimestamp.JSON_PROPERTY_SCHEDULED_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TransportWebhookLogMessageTimestamp {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "event_timestamp";
  private Double eventTimestamp;

  public static final String JSON_PROPERTY_LIFETIME = "lifetime";
  private Double lifetime;

  public static final String JSON_PROPERTY_QUEUE_TIME = "queue_time";
  private Double queueTime;

  public static final String JSON_PROPERTY_SCHEDULED_TIME = "scheduled_time";
  private Double scheduledTime;

  public TransportWebhookLogMessageTimestamp eventTimestamp(Double eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

  /**
   * The Unix timestamp of the event.
   *
   * @return eventTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEventTimestamp() {
    return eventTimestamp;
  }

  public void setEventTimestamp(Double eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  public TransportWebhookLogMessageTimestamp lifetime(Double lifetime) {
    this.lifetime = lifetime;
    return this;
  }

  /**
   * The total delivery time in seconds.
   *
   * @return lifetime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLifetime() {
    return lifetime;
  }

  public void setLifetime(Double lifetime) {
    this.lifetime = lifetime;
  }

  public TransportWebhookLogMessageTimestamp queueTime(Double queueTime) {
    this.queueTime = queueTime;
    return this;
  }

  /**
   * Number of seconds the message spent in the delivery queue.
   *
   * @return queueTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUEUE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getQueueTime() {
    return queueTime;
  }

  public void setQueueTime(Double queueTime) {
    this.queueTime = queueTime;
  }

  public TransportWebhookLogMessageTimestamp scheduledTime(Double scheduledTime) {
    this.scheduledTime = scheduledTime;
    return this;
  }

  /**
   * The scheduled delivery time as a Unix timestamp.
   *
   * @return scheduledTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getScheduledTime() {
    return scheduledTime;
  }

  public void setScheduledTime(Double scheduledTime) {
    this.scheduledTime = scheduledTime;
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
   * @return TransportWebhookLogMessageTimestamp
   */
  @JsonAnySetter
  public TransportWebhookLogMessageTimestamp putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TransportWebhookLogMessageTimestamp object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportWebhookLogMessageTimestamp transportWebhookLogMessageTimestamp =
        (TransportWebhookLogMessageTimestamp) o;
    return Objects.equals(this.eventTimestamp, transportWebhookLogMessageTimestamp.eventTimestamp)
        && Objects.equals(this.lifetime, transportWebhookLogMessageTimestamp.lifetime)
        && Objects.equals(this.queueTime, transportWebhookLogMessageTimestamp.queueTime)
        && Objects.equals(this.scheduledTime, transportWebhookLogMessageTimestamp.scheduledTime)
        && Objects.equals(
            this.additionalProperties, transportWebhookLogMessageTimestamp.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTimestamp, lifetime, queueTime, scheduledTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportWebhookLogMessageTimestamp {\n");
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
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
