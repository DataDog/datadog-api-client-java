/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Configuration to create a phone notification channel</p>
 */
@JsonPropertyOrder({
  CreatePhoneNotificationChannelConfig.JSON_PROPERTY_NUMBER,
  CreatePhoneNotificationChannelConfig.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreatePhoneNotificationChannelConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotificationChannelPhoneConfigType type = NotificationChannelPhoneConfigType.PHONE;

  public CreatePhoneNotificationChannelConfig() {}

  @JsonCreator
  public CreatePhoneNotificationChannelConfig(
            @JsonProperty(required=true, value=JSON_PROPERTY_NUMBER)String number,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)NotificationChannelPhoneConfigType type) {
        this.number = number;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public CreatePhoneNotificationChannelConfig number(String number) {
    this.number = number;
    return this;
  }

  /**
   * <p>The E-164 formatted phone number (e.g. +3371234567)</p>
   * @return number
  **/
      @JsonProperty(JSON_PROPERTY_NUMBER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getNumber() {
        return number;
      }
  public void setNumber(String number) {
    this.number = number;
  }
  public CreatePhoneNotificationChannelConfig type(NotificationChannelPhoneConfigType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Indicates that the notification channel is a phone</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public NotificationChannelPhoneConfigType getType() {
        return type;
      }
  public void setType(NotificationChannelPhoneConfigType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CreatePhoneNotificationChannelConfig
   */
  @JsonAnySetter
  public CreatePhoneNotificationChannelConfig putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreatePhoneNotificationChannelConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePhoneNotificationChannelConfig createPhoneNotificationChannelConfig = (CreatePhoneNotificationChannelConfig) o;
    return Objects.equals(this.number, createPhoneNotificationChannelConfig.number) && Objects.equals(this.type, createPhoneNotificationChannelConfig.type) && Objects.equals(this.additionalProperties, createPhoneNotificationChannelConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(number,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePhoneNotificationChannelConfig {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
