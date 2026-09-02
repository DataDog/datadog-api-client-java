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

/** Attributes of a Twilio integration account returned in responses. */
@JsonPropertyOrder({
  TwilioIntegrationAccountResponseAttributes.JSON_PROPERTY_AUTHENTICATION,
  TwilioIntegrationAccountResponseAttributes.JSON_PROPERTY_DATAFLOWS,
  TwilioIntegrationAccountResponseAttributes.JSON_PROPERTY_NAME,
  TwilioIntegrationAccountResponseAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TwilioIntegrationAccountResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private TwilioIntegrationAccountAuthenticationResponse authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private TwilioIntegrationDataflowsResponse dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private TwilioIntegrationAccountSettingsResponse settings;

  public TwilioIntegrationAccountResponseAttributes() {}

  @JsonCreator
  public TwilioIntegrationAccountResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTINGS)
          TwilioIntegrationAccountSettingsResponse settings) {
    this.name = name;
    this.settings = settings;
    this.unparsed |= settings.unparsed;
  }

  public TwilioIntegrationAccountResponseAttributes authentication(
      TwilioIntegrationAccountAuthenticationResponse authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication configured on the Twilio integration account.
   *
   * @return authentication
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TwilioIntegrationAccountAuthenticationResponse getAuthentication() {
    return authentication;
  }

  public void setAuthentication(TwilioIntegrationAccountAuthenticationResponse authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public TwilioIntegrationAccountResponseAttributes dataflows(
      TwilioIntegrationDataflowsResponse dataflows) {
    this.dataflows = dataflows;
    this.unparsed |= dataflows.unparsed;
    return this;
  }

  /**
   * Dataflows configured on the Twilio integration account, keyed by dataflow id.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TwilioIntegrationDataflowsResponse getDataflows() {
    return dataflows;
  }

  public void setDataflows(TwilioIntegrationDataflowsResponse dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      this.unparsed |= dataflows.unparsed;
    }
  }

  public TwilioIntegrationAccountResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the Twilio integration account.
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

  public TwilioIntegrationAccountResponseAttributes settings(
      TwilioIntegrationAccountSettingsResponse settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings configured on the Twilio integration account.
   *
   * @return settings
   */
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TwilioIntegrationAccountSettingsResponse getSettings() {
    return settings;
  }

  public void setSettings(TwilioIntegrationAccountSettingsResponse settings) {
    this.settings = settings;
    if (settings != null) {
      this.unparsed |= settings.unparsed;
    }
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
   * @return TwilioIntegrationAccountResponseAttributes
   */
  @JsonAnySetter
  public TwilioIntegrationAccountResponseAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this TwilioIntegrationAccountResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioIntegrationAccountResponseAttributes twilioIntegrationAccountResponseAttributes =
        (TwilioIntegrationAccountResponseAttributes) o;
    return Objects.equals(
            this.authentication, twilioIntegrationAccountResponseAttributes.authentication)
        && Objects.equals(this.dataflows, twilioIntegrationAccountResponseAttributes.dataflows)
        && Objects.equals(this.name, twilioIntegrationAccountResponseAttributes.name)
        && Objects.equals(this.settings, twilioIntegrationAccountResponseAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            twilioIntegrationAccountResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioIntegrationAccountResponseAttributes {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    dataflows: ").append(toIndentedString(dataflows)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
