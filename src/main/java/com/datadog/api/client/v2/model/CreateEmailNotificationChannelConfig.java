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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Configuration to create an e-mail notification channel */
@JsonPropertyOrder({
  CreateEmailNotificationChannelConfig.JSON_PROPERTY_ADDRESS,
  CreateEmailNotificationChannelConfig.JSON_PROPERTY_FORMATS,
  CreateEmailNotificationChannelConfig.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateEmailNotificationChannelConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_FORMATS = "formats";
  private List<NotificationChannelEmailFormatType> formats = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotificationChannelEmailConfigType type = NotificationChannelEmailConfigType.EMAIL;

  public CreateEmailNotificationChannelConfig() {}

  @JsonCreator
  public CreateEmailNotificationChannelConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_ADDRESS) String address,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMATS)
          List<NotificationChannelEmailFormatType> formats,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          NotificationChannelEmailConfigType type) {
    this.address = address;
    this.formats = formats;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CreateEmailNotificationChannelConfig address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The e-mail address to be notified
   *
   * @return address
   */
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CreateEmailNotificationChannelConfig formats(
      List<NotificationChannelEmailFormatType> formats) {
    this.formats = formats;
    return this;
  }

  public CreateEmailNotificationChannelConfig addFormatsItem(
      NotificationChannelEmailFormatType formatsItem) {
    this.formats.add(formatsItem);
    this.unparsed |= !formatsItem.isValid();
    return this;
  }

  /**
   * Preferred content formats for notifications.
   *
   * @return formats
   */
  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<NotificationChannelEmailFormatType> getFormats() {
    return formats;
  }

  public void setFormats(List<NotificationChannelEmailFormatType> formats) {
    this.formats = formats;
  }

  public CreateEmailNotificationChannelConfig type(NotificationChannelEmailConfigType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Indicates that the notification channel is an e-mail address
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationChannelEmailConfigType getType() {
    return type;
  }

  public void setType(NotificationChannelEmailConfigType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return CreateEmailNotificationChannelConfig
   */
  @JsonAnySetter
  public CreateEmailNotificationChannelConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateEmailNotificationChannelConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmailNotificationChannelConfig createEmailNotificationChannelConfig =
        (CreateEmailNotificationChannelConfig) o;
    return Objects.equals(this.address, createEmailNotificationChannelConfig.address)
        && Objects.equals(this.formats, createEmailNotificationChannelConfig.formats)
        && Objects.equals(this.type, createEmailNotificationChannelConfig.type)
        && Objects.equals(
            this.additionalProperties, createEmailNotificationChannelConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, formats, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmailNotificationChannelConfig {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
