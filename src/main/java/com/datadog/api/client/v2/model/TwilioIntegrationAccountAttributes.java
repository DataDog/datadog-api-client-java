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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a Twilio integration account. */
@JsonPropertyOrder({
  TwilioIntegrationAccountAttributes.JSON_PROPERTY_INTERFACE,
  TwilioIntegrationAccountAttributes.JSON_PROPERTY_NAME,
  TwilioIntegrationAccountAttributes.JSON_PROPERTY_PERMISSIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TwilioIntegrationAccountAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTERFACE = "interface";
  private TwilioInterface _interface;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private IntegrationAccountPermissions permissions;

  public TwilioIntegrationAccountAttributes() {}

  @JsonCreator
  public TwilioIntegrationAccountAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERFACE) TwilioInterface _interface,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this._interface = _interface;
    this.unparsed |= _interface.unparsed;
    this.name = name;
  }

  public TwilioIntegrationAccountAttributes _interface(TwilioInterface _interface) {
    this._interface = _interface;
    this.unparsed |= _interface.unparsed;
    return this;
  }

  /**
   * Twilio interface (source-type) configuration.
   *
   * @return _interface
   */
  @JsonProperty(JSON_PROPERTY_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TwilioInterface getInterface() {
    return _interface;
  }

  public void setInterface(TwilioInterface _interface) {
    this._interface = _interface;
    if (_interface != null) {
      this.unparsed |= _interface.unparsed;
    }
  }

  public TwilioIntegrationAccountAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the account.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Read-only permission information for the account, derived from its restriction policy.
   *
   * @return permissions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationAccountPermissions getPermissions() {
    return permissions;
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
   * @return TwilioIntegrationAccountAttributes
   */
  @JsonAnySetter
  public TwilioIntegrationAccountAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TwilioIntegrationAccountAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioIntegrationAccountAttributes twilioIntegrationAccountAttributes =
        (TwilioIntegrationAccountAttributes) o;
    return Objects.equals(this._interface, twilioIntegrationAccountAttributes._interface)
        && Objects.equals(this.name, twilioIntegrationAccountAttributes.name)
        && Objects.equals(this.permissions, twilioIntegrationAccountAttributes.permissions)
        && Objects.equals(
            this.additionalProperties, twilioIntegrationAccountAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_interface, name, permissions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioIntegrationAccountAttributes {\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
