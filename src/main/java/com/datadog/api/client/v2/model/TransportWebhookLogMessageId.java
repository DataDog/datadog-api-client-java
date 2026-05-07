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

/** The message identifiers. */
@JsonPropertyOrder({
  TransportWebhookLogMessageId.JSON_PROPERTY_MESSAGE_ID,
  TransportWebhookLogMessageId.JSON_PROPERTY_SMTP_ID,
  TransportWebhookLogMessageId.JSON_PROPERTY_TRANSPORT_EVENT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TransportWebhookLogMessageId {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MESSAGE_ID = "message_id";
  private String messageId;

  public static final String JSON_PROPERTY_SMTP_ID = "smtp_id";
  private String smtpId;

  public static final String JSON_PROPERTY_TRANSPORT_EVENT_ID = "transport_event_id";
  private String transportEventId;

  public TransportWebhookLogMessageId messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * The RFC 5322 Message-ID.
   *
   * @return messageId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public TransportWebhookLogMessageId smtpId(String smtpId) {
    this.smtpId = smtpId;
    return this;
  }

  /**
   * The SMTP transaction identifier.
   *
   * @return smtpId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMTP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSmtpId() {
    return smtpId;
  }

  public void setSmtpId(String smtpId) {
    this.smtpId = smtpId;
  }

  public TransportWebhookLogMessageId transportEventId(String transportEventId) {
    this.transportEventId = transportEventId;
    return this;
  }

  /**
   * The transport provider event identifier.
   *
   * @return transportEventId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSPORT_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportEventId() {
    return transportEventId;
  }

  public void setTransportEventId(String transportEventId) {
    this.transportEventId = transportEventId;
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
   * @return TransportWebhookLogMessageId
   */
  @JsonAnySetter
  public TransportWebhookLogMessageId putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TransportWebhookLogMessageId object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportWebhookLogMessageId transportWebhookLogMessageId = (TransportWebhookLogMessageId) o;
    return Objects.equals(this.messageId, transportWebhookLogMessageId.messageId)
        && Objects.equals(this.smtpId, transportWebhookLogMessageId.smtpId)
        && Objects.equals(this.transportEventId, transportWebhookLogMessageId.transportEventId)
        && Objects.equals(
            this.additionalProperties, transportWebhookLogMessageId.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, smtpId, transportEventId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportWebhookLogMessageId {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    smtpId: ").append(toIndentedString(smtpId)).append("\n");
    sb.append("    transportEventId: ").append(toIndentedString(transportEventId)).append("\n");
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
