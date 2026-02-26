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
import org.openapitools.jackson.nullable.JsonNullable;

/** Phone notification channel configuration */
@JsonPropertyOrder({
  NotificationChannelPhoneConfig.JSON_PROPERTY_FORMATTED_NUMBER,
  NotificationChannelPhoneConfig.JSON_PROPERTY_NUMBER,
  NotificationChannelPhoneConfig.JSON_PROPERTY_REGION,
  NotificationChannelPhoneConfig.JSON_PROPERTY_SMS_SUBSCRIBED_AT,
  NotificationChannelPhoneConfig.JSON_PROPERTY_TYPE,
  NotificationChannelPhoneConfig.JSON_PROPERTY_VERIFIED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotificationChannelPhoneConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMATTED_NUMBER = "formatted_number";
  private String formattedNumber;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_SMS_SUBSCRIBED_AT = "sms_subscribed_at";
  private JsonNullable<OffsetDateTime> smsSubscribedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotificationChannelPhoneConfigType type = NotificationChannelPhoneConfigType.PHONE;

  public static final String JSON_PROPERTY_VERIFIED = "verified";
  private Boolean verified;

  public NotificationChannelPhoneConfig() {}

  @JsonCreator
  public NotificationChannelPhoneConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMATTED_NUMBER) String formattedNumber,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUMBER) String number,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          NotificationChannelPhoneConfigType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERIFIED) Boolean verified) {
    this.formattedNumber = formattedNumber;
    this.number = number;
    this.region = region;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.verified = verified;
  }

  public NotificationChannelPhoneConfig formattedNumber(String formattedNumber) {
    this.formattedNumber = formattedNumber;
    return this;
  }

  /**
   * The formatted international version of Number (e.g. +33 7 1 23 45 67).
   *
   * @return formattedNumber
   */
  @JsonProperty(JSON_PROPERTY_FORMATTED_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFormattedNumber() {
    return formattedNumber;
  }

  public void setFormattedNumber(String formattedNumber) {
    this.formattedNumber = formattedNumber;
  }

  public NotificationChannelPhoneConfig number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The E-164 formatted phone number (e.g. +3371234567)
   *
   * @return number
   */
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public NotificationChannelPhoneConfig region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The ISO 3166-1 alpha-2 two-letter country code.
   *
   * @return region
   */
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public NotificationChannelPhoneConfig smsSubscribedAt(OffsetDateTime smsSubscribedAt) {
    this.smsSubscribedAt = JsonNullable.<OffsetDateTime>of(smsSubscribedAt);
    return this;
  }

  /**
   * If present, the date the user subscribed this number to SMS messages
   *
   * @return smsSubscribedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getSmsSubscribedAt() {
    return smsSubscribedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SMS_SUBSCRIBED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getSmsSubscribedAt_JsonNullable() {
    return smsSubscribedAt;
  }

  @JsonProperty(JSON_PROPERTY_SMS_SUBSCRIBED_AT)
  public void setSmsSubscribedAt_JsonNullable(JsonNullable<OffsetDateTime> smsSubscribedAt) {
    this.smsSubscribedAt = smsSubscribedAt;
  }

  public void setSmsSubscribedAt(OffsetDateTime smsSubscribedAt) {
    this.smsSubscribedAt = JsonNullable.<OffsetDateTime>of(smsSubscribedAt);
  }

  public NotificationChannelPhoneConfig type(NotificationChannelPhoneConfigType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Indicates that the notification channel is a phone
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationChannelPhoneConfigType getType() {
    return type;
  }

  public void setType(NotificationChannelPhoneConfigType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public NotificationChannelPhoneConfig verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Indicates whether this phone has been verified by the user in Datadog On-Call
   *
   * @return verified
   */
  @JsonProperty(JSON_PROPERTY_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
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
   * @return NotificationChannelPhoneConfig
   */
  @JsonAnySetter
  public NotificationChannelPhoneConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotificationChannelPhoneConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelPhoneConfig notificationChannelPhoneConfig =
        (NotificationChannelPhoneConfig) o;
    return Objects.equals(this.formattedNumber, notificationChannelPhoneConfig.formattedNumber)
        && Objects.equals(this.number, notificationChannelPhoneConfig.number)
        && Objects.equals(this.region, notificationChannelPhoneConfig.region)
        && Objects.equals(this.smsSubscribedAt, notificationChannelPhoneConfig.smsSubscribedAt)
        && Objects.equals(this.type, notificationChannelPhoneConfig.type)
        && Objects.equals(this.verified, notificationChannelPhoneConfig.verified)
        && Objects.equals(
            this.additionalProperties, notificationChannelPhoneConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        formattedNumber, number, region, smsSubscribedAt, type, verified, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelPhoneConfig {\n");
    sb.append("    formattedNumber: ").append(toIndentedString(formattedNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    smsSubscribedAt: ").append(toIndentedString(smsSubscribedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
