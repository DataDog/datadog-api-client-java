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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Top-level attributes for the webhook log event, including delivery status, recipient details, and
 * provider metadata.
 */
@JsonPropertyOrder({
  TransportWebhookLogAttributes.JSON_PROPERTY_CATEGORY,
  TransportWebhookLogAttributes.JSON_PROPERTY_EMAIL,
  TransportWebhookLogAttributes.JSON_PROPERTY_EMAIL_ID,
  TransportWebhookLogAttributes.JSON_PROPERTY_EMAIL_TYPE_DISPLAY_NAME,
  TransportWebhookLogAttributes.JSON_PROPERTY_MESSAGE,
  TransportWebhookLogAttributes.JSON_PROPERTY_NETWORK,
  TransportWebhookLogAttributes.JSON_PROPERTY_ORG,
  TransportWebhookLogAttributes.JSON_PROPERTY_ORG_METADATA,
  TransportWebhookLogAttributes.JSON_PROPERTY_ORG_UUID,
  TransportWebhookLogAttributes.JSON_PROPERTY_QUEUE_TIME,
  TransportWebhookLogAttributes.JSON_PROPERTY_SG_MACHINE_OPEN,
  TransportWebhookLogAttributes.JSON_PROPERTY_SUBJECT,
  TransportWebhookLogAttributes.JSON_PROPERTY_USERAGENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TransportWebhookLogAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private List<String> category = null;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private TransportWebhookLogEmail email;

  public static final String JSON_PROPERTY_EMAIL_ID = "email_id";
  private String emailId;

  public static final String JSON_PROPERTY_EMAIL_TYPE_DISPLAY_NAME = "email_type_display_name";
  private String emailTypeDisplayName;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private TransportWebhookLogMessage message;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private TransportWebhookLogNetwork network;

  public static final String JSON_PROPERTY_ORG = "org";
  private Long org;

  public static final String JSON_PROPERTY_ORG_METADATA = "org_metadata";
  private TransportWebhookLogOrgMetadata orgMetadata;

  public static final String JSON_PROPERTY_ORG_UUID = "org_uuid";
  private String orgUuid;

  public static final String JSON_PROPERTY_QUEUE_TIME = "queue_time";
  private String queueTime;

  public static final String JSON_PROPERTY_SG_MACHINE_OPEN = "sg_machine_open";
  private Boolean sgMachineOpen;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_USERAGENT = "useragent";
  private String useragent;

  public TransportWebhookLogAttributes category(List<String> category) {
    this.category = category;
    return this;
  }

  public TransportWebhookLogAttributes addCategoryItem(String categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * The event categories.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCategory() {
    return category;
  }

  public void setCategory(List<String> category) {
    this.category = category;
  }

  public TransportWebhookLogAttributes email(TransportWebhookLogEmail email) {
    this.email = email;
    this.unparsed |= email.unparsed;
    return this;
  }

  /**
   * The email address details.
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransportWebhookLogEmail getEmail() {
    return email;
  }

  public void setEmail(TransportWebhookLogEmail email) {
    this.email = email;
  }

  public TransportWebhookLogAttributes emailId(String emailId) {
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

  public TransportWebhookLogAttributes emailTypeDisplayName(String emailTypeDisplayName) {
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

  public TransportWebhookLogAttributes message(TransportWebhookLogMessage message) {
    this.message = message;
    this.unparsed |= message.unparsed;
    return this;
  }

  /**
   * The message delivery event details.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransportWebhookLogMessage getMessage() {
    return message;
  }

  public void setMessage(TransportWebhookLogMessage message) {
    this.message = message;
  }

  public TransportWebhookLogAttributes network(TransportWebhookLogNetwork network) {
    this.network = network;
    this.unparsed |= network.unparsed;
    return this;
  }

  /**
   * The network information for the event.
   *
   * @return network
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransportWebhookLogNetwork getNetwork() {
    return network;
  }

  public void setNetwork(TransportWebhookLogNetwork network) {
    this.network = network;
  }

  public TransportWebhookLogAttributes org(Long org) {
    this.org = org;
    return this;
  }

  /**
   * The numeric organization identifier.
   *
   * @return org
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOrg() {
    return org;
  }

  public void setOrg(Long org) {
    this.org = org;
  }

  public TransportWebhookLogAttributes orgMetadata(TransportWebhookLogOrgMetadata orgMetadata) {
    this.orgMetadata = orgMetadata;
    this.unparsed |= orgMetadata.unparsed;
    return this;
  }

  /**
   * Metadata about the organization that sent the email.
   *
   * @return orgMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransportWebhookLogOrgMetadata getOrgMetadata() {
    return orgMetadata;
  }

  public void setOrgMetadata(TransportWebhookLogOrgMetadata orgMetadata) {
    this.orgMetadata = orgMetadata;
  }

  public TransportWebhookLogAttributes orgUuid(String orgUuid) {
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

  public TransportWebhookLogAttributes queueTime(String queueTime) {
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

  public TransportWebhookLogAttributes sgMachineOpen(Boolean sgMachineOpen) {
    this.sgMachineOpen = sgMachineOpen;
    return this;
  }

  /**
   * Indicates whether the open event was triggered by automated machine activity rather than a
   * human recipient (SendGrid-specific).
   *
   * @return sgMachineOpen
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SG_MACHINE_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSgMachineOpen() {
    return sgMachineOpen;
  }

  public void setSgMachineOpen(Boolean sgMachineOpen) {
    this.sgMachineOpen = sgMachineOpen;
  }

  public TransportWebhookLogAttributes subject(String subject) {
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

  public TransportWebhookLogAttributes useragent(String useragent) {
    this.useragent = useragent;
    return this;
  }

  /**
   * The user agent string for open events.
   *
   * @return useragent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERAGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUseragent() {
    return useragent;
  }

  public void setUseragent(String useragent) {
    this.useragent = useragent;
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
   * @return TransportWebhookLogAttributes
   */
  @JsonAnySetter
  public TransportWebhookLogAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TransportWebhookLogAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportWebhookLogAttributes transportWebhookLogAttributes = (TransportWebhookLogAttributes) o;
    return Objects.equals(this.category, transportWebhookLogAttributes.category)
        && Objects.equals(this.email, transportWebhookLogAttributes.email)
        && Objects.equals(this.emailId, transportWebhookLogAttributes.emailId)
        && Objects.equals(
            this.emailTypeDisplayName, transportWebhookLogAttributes.emailTypeDisplayName)
        && Objects.equals(this.message, transportWebhookLogAttributes.message)
        && Objects.equals(this.network, transportWebhookLogAttributes.network)
        && Objects.equals(this.org, transportWebhookLogAttributes.org)
        && Objects.equals(this.orgMetadata, transportWebhookLogAttributes.orgMetadata)
        && Objects.equals(this.orgUuid, transportWebhookLogAttributes.orgUuid)
        && Objects.equals(this.queueTime, transportWebhookLogAttributes.queueTime)
        && Objects.equals(this.sgMachineOpen, transportWebhookLogAttributes.sgMachineOpen)
        && Objects.equals(this.subject, transportWebhookLogAttributes.subject)
        && Objects.equals(this.useragent, transportWebhookLogAttributes.useragent)
        && Objects.equals(
            this.additionalProperties, transportWebhookLogAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        email,
        emailId,
        emailTypeDisplayName,
        message,
        network,
        org,
        orgMetadata,
        orgUuid,
        queueTime,
        sgMachineOpen,
        subject,
        useragent,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportWebhookLogAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    emailTypeDisplayName: ")
        .append(toIndentedString(emailTypeDisplayName))
        .append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    orgMetadata: ").append(toIndentedString(orgMetadata)).append("\n");
    sb.append("    orgUuid: ").append(toIndentedString(orgUuid)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    sgMachineOpen: ").append(toIndentedString(sgMachineOpen)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    useragent: ").append(toIndentedString(useragent)).append("\n");
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
