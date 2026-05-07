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

/** The message delivery event details. */
@JsonPropertyOrder({
  TransportWebhookLogMessage.JSON_PROPERTY_AUTH,
  TransportWebhookLogMessage.JSON_PROPERTY_CUSTOM_ARGS,
  TransportWebhookLogMessage.JSON_PROPERTY_ID,
  TransportWebhookLogMessage.JSON_PROPERTY_NAME,
  TransportWebhookLogMessage.JSON_PROPERTY_RESPONSE,
  TransportWebhookLogMessage.JSON_PROPERTY_SENDER_IP,
  TransportWebhookLogMessage.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TransportWebhookLogMessage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private TransportWebhookLogMessageAuth auth;

  public static final String JSON_PROPERTY_CUSTOM_ARGS = "custom_args";
  private TransportWebhookLogMessageCustomArgs customArgs;

  public static final String JSON_PROPERTY_ID = "id";
  private TransportWebhookLogMessageId id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private TransportWebhookLogMessageResponse response;

  public static final String JSON_PROPERTY_SENDER_IP = "sender_ip";
  private String senderIp;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private TransportWebhookLogMessageTimestamp timestamp;

  public TransportWebhookLogMessage auth(TransportWebhookLogMessageAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * The message authentication details.
   *
   * @return auth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransportWebhookLogMessageAuth getAuth() {
    return auth;
  }

  public void setAuth(TransportWebhookLogMessageAuth auth) {
    this.auth = auth;
  }

  public TransportWebhookLogMessage customArgs(TransportWebhookLogMessageCustomArgs customArgs) {
    this.customArgs = customArgs;
    this.unparsed |= customArgs.unparsed;
    return this;
  }

  /**
   * Custom arguments passed through the email transport provider for tracking.
   *
   * @return customArgs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransportWebhookLogMessageCustomArgs getCustomArgs() {
    return customArgs;
  }

  public void setCustomArgs(TransportWebhookLogMessageCustomArgs customArgs) {
    this.customArgs = customArgs;
  }

  public TransportWebhookLogMessage id(TransportWebhookLogMessageId id) {
    this.id = id;
    this.unparsed |= id.unparsed;
    return this;
  }

  /**
   * The message identifiers.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransportWebhookLogMessageId getId() {
    return id;
  }

  public void setId(TransportWebhookLogMessageId id) {
    this.id = id;
  }

  public TransportWebhookLogMessage name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The delivery event type emitted by the transport provider (for example, "delivered", "dropped",
   * "bounced").
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

  public TransportWebhookLogMessage response(TransportWebhookLogMessageResponse response) {
    this.response = response;
    this.unparsed |= response.unparsed;
    return this;
  }

  /**
   * The SMTP response information.
   *
   * @return response
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransportWebhookLogMessageResponse getResponse() {
    return response;
  }

  public void setResponse(TransportWebhookLogMessageResponse response) {
    this.response = response;
  }

  public TransportWebhookLogMessage senderIp(String senderIp) {
    this.senderIp = senderIp;
    return this;
  }

  /**
   * The IP address of the sending server.
   *
   * @return senderIp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSenderIp() {
    return senderIp;
  }

  public void setSenderIp(String senderIp) {
    this.senderIp = senderIp;
  }

  public TransportWebhookLogMessage timestamp(TransportWebhookLogMessageTimestamp timestamp) {
    this.timestamp = timestamp;
    this.unparsed |= timestamp.unparsed;
    return this;
  }

  /**
   * The message delivery timing information.
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransportWebhookLogMessageTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(TransportWebhookLogMessageTimestamp timestamp) {
    this.timestamp = timestamp;
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
   * @return TransportWebhookLogMessage
   */
  @JsonAnySetter
  public TransportWebhookLogMessage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TransportWebhookLogMessage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportWebhookLogMessage transportWebhookLogMessage = (TransportWebhookLogMessage) o;
    return Objects.equals(this.auth, transportWebhookLogMessage.auth)
        && Objects.equals(this.customArgs, transportWebhookLogMessage.customArgs)
        && Objects.equals(this.id, transportWebhookLogMessage.id)
        && Objects.equals(this.name, transportWebhookLogMessage.name)
        && Objects.equals(this.response, transportWebhookLogMessage.response)
        && Objects.equals(this.senderIp, transportWebhookLogMessage.senderIp)
        && Objects.equals(this.timestamp, transportWebhookLogMessage.timestamp)
        && Objects.equals(
            this.additionalProperties, transportWebhookLogMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        auth, customArgs, id, name, response, senderIp, timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportWebhookLogMessage {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    customArgs: ").append(toIndentedString(customArgs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    senderIp: ").append(toIndentedString(senderIp)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
