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

/** Custom arguments passed through the email transport provider for tracking. */
@JsonPropertyOrder({
  TransportWebhookLogMessageCustomArgs.JSON_PROPERTY_EMAIL_ID,
  TransportWebhookLogMessageCustomArgs.JSON_PROPERTY_EMAIL_TYPE_DISPLAY_NAME,
  TransportWebhookLogMessageCustomArgs.JSON_PROPERTY_ORG_UUID,
  TransportWebhookLogMessageCustomArgs.JSON_PROPERTY_QUEUE_TIME,
  TransportWebhookLogMessageCustomArgs.JSON_PROPERTY_SUBJECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TransportWebhookLogMessageCustomArgs {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL_ID = "email_id";
  private String emailId;

  public static final String JSON_PROPERTY_EMAIL_TYPE_DISPLAY_NAME = "email_type_display_name";
  private String emailTypeDisplayName;

  public static final String JSON_PROPERTY_ORG_UUID = "org_uuid";
  private String orgUuid;

  public static final String JSON_PROPERTY_QUEUE_TIME = "queue_time";
  private String queueTime;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public TransportWebhookLogMessageCustomArgs emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

  /**
   * The unique email identifier.
   *
   * @return emailId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public TransportWebhookLogMessageCustomArgs emailTypeDisplayName(String emailTypeDisplayName) {
    this.emailTypeDisplayName = emailTypeDisplayName;
    return this;
  }

  /**
   * The human-readable email type name.
   *
   * @return emailTypeDisplayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_TYPE_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmailTypeDisplayName() {
    return emailTypeDisplayName;
  }

  public void setEmailTypeDisplayName(String emailTypeDisplayName) {
    this.emailTypeDisplayName = emailTypeDisplayName;
  }

  public TransportWebhookLogMessageCustomArgs orgUuid(String orgUuid) {
    this.orgUuid = orgUuid;
    return this;
  }

  /**
   * The organization UUID.
   *
   * @return orgUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgUuid() {
    return orgUuid;
  }

  public void setOrgUuid(String orgUuid) {
    this.orgUuid = orgUuid;
  }

  public TransportWebhookLogMessageCustomArgs queueTime(String queueTime) {
    this.queueTime = queueTime;
    return this;
  }

  /**
   * The timestamp when the email was queued.
   *
   * @return queueTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUEUE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueueTime() {
    return queueTime;
  }

  public void setQueueTime(String queueTime) {
    this.queueTime = queueTime;
  }

  public TransportWebhookLogMessageCustomArgs subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The email subject line.
   *
   * @return subject
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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
   * @return TransportWebhookLogMessageCustomArgs
   */
  @JsonAnySetter
  public TransportWebhookLogMessageCustomArgs putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TransportWebhookLogMessageCustomArgs object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportWebhookLogMessageCustomArgs transportWebhookLogMessageCustomArgs =
        (TransportWebhookLogMessageCustomArgs) o;
    return Objects.equals(this.emailId, transportWebhookLogMessageCustomArgs.emailId)
        && Objects.equals(
            this.emailTypeDisplayName, transportWebhookLogMessageCustomArgs.emailTypeDisplayName)
        && Objects.equals(this.orgUuid, transportWebhookLogMessageCustomArgs.orgUuid)
        && Objects.equals(this.queueTime, transportWebhookLogMessageCustomArgs.queueTime)
        && Objects.equals(this.subject, transportWebhookLogMessageCustomArgs.subject)
        && Objects.equals(
            this.additionalProperties, transportWebhookLogMessageCustomArgs.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        emailId, emailTypeDisplayName, orgUuid, queueTime, subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportWebhookLogMessageCustomArgs {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    emailTypeDisplayName: ")
        .append(toIndentedString(emailTypeDisplayName))
        .append("\n");
    sb.append("    orgUuid: ").append(toIndentedString(orgUuid)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
