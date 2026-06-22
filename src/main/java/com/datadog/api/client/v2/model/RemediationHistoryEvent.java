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

/** A single event in the investigation history. */
@JsonPropertyOrder({
  RemediationHistoryEvent.JSON_PROPERTY_EVENT_TYPE,
  RemediationHistoryEvent.JSON_PROPERTY_ID,
  RemediationHistoryEvent.JSON_PROPERTY_PAYLOAD,
  RemediationHistoryEvent.JSON_PROPERTY_TIMESTAMP_MS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationHistoryEvent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
  private String eventType;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public static final String JSON_PROPERTY_TIMESTAMP_MS = "timestamp_ms";
  private String timestampMs;

  public RemediationHistoryEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of event.
   *
   * @return eventType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public RemediationHistoryEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * History event ID.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RemediationHistoryEvent payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Opaque JSON event body, base64-encoded. Decode and parse according to event_type.
   *
   * @return payload
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public RemediationHistoryEvent timestampMs(String timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  /**
   * Event time in epoch milliseconds (64-bit integer encoded as a string).
   *
   * @return timestampMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(String timestampMs) {
    this.timestampMs = timestampMs;
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
   * @return RemediationHistoryEvent
   */
  @JsonAnySetter
  public RemediationHistoryEvent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationHistoryEvent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationHistoryEvent remediationHistoryEvent = (RemediationHistoryEvent) o;
    return Objects.equals(this.eventType, remediationHistoryEvent.eventType)
        && Objects.equals(this.id, remediationHistoryEvent.id)
        && Objects.equals(this.payload, remediationHistoryEvent.payload)
        && Objects.equals(this.timestampMs, remediationHistoryEvent.timestampMs)
        && Objects.equals(this.additionalProperties, remediationHistoryEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, id, payload, timestampMs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationHistoryEvent {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
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
