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

/**
 * Writable attributes used to update a ChatGPT Enterprise integration account. Every field is
 * optional; only the fields provided are changed. When <code>dataflows</code> is provided, only the
 * dataflow ids included in the request are modified; dataflows omitted from the map keep their
 * current configuration.
 */
@JsonPropertyOrder({
  ChatGPTEnterpriseIntegrationAccountUpdateAttributes.JSON_PROPERTY_AUTHENTICATION,
  ChatGPTEnterpriseIntegrationAccountUpdateAttributes.JSON_PROPERTY_DATAFLOWS,
  ChatGPTEnterpriseIntegrationAccountUpdateAttributes.JSON_PROPERTY_NAME,
  ChatGPTEnterpriseIntegrationAccountUpdateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChatGPTEnterpriseIntegrationAccountUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private ChatGPTEnterpriseIntegrationAccountAuthenticationUpdate authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private ChatGPTEnterpriseIntegrationDataflowsRequest dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private ChatGPTEnterpriseIntegrationAccountSettingsUpdate settings;

  public ChatGPTEnterpriseIntegrationAccountUpdateAttributes authentication(
      ChatGPTEnterpriseIntegrationAccountAuthenticationUpdate authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication for updating the ChatGPT Enterprise integration account. Exactly one method is
   * set.
   *
   * @return authentication
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChatGPTEnterpriseIntegrationAccountAuthenticationUpdate getAuthentication() {
    return authentication;
  }

  public void setAuthentication(
      ChatGPTEnterpriseIntegrationAccountAuthenticationUpdate authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public ChatGPTEnterpriseIntegrationAccountUpdateAttributes dataflows(
      ChatGPTEnterpriseIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    this.unparsed |= dataflows.unparsed;
    return this;
  }

  /**
   * Data Datadog collects from ChatGPT Enterprise, keyed by dataflow id. Each dataflow turns on a
   * distinct kind of collection: set <code>enabled</code> to start or stop it. Defaults listed on
   * each dataflow apply when the account is created; on update, omitted fields keep their current
   * values. Every dataflow requires a ChatGPT Enterprise workspace with access to the OpenAI Costs
   * API; a dataflow enabled without it is stored but collects no data.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChatGPTEnterpriseIntegrationDataflowsRequest getDataflows() {
    return dataflows;
  }

  public void setDataflows(ChatGPTEnterpriseIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      this.unparsed |= dataflows.unparsed;
    }
  }

  public ChatGPTEnterpriseIntegrationAccountUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the ChatGPT Enterprise integration account.
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

  public ChatGPTEnterpriseIntegrationAccountUpdateAttributes settings(
      ChatGPTEnterpriseIntegrationAccountSettingsUpdate settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings for updating the ChatGPT Enterprise integration account. Only the fields provided are
   * changed.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChatGPTEnterpriseIntegrationAccountSettingsUpdate getSettings() {
    return settings;
  }

  public void setSettings(ChatGPTEnterpriseIntegrationAccountSettingsUpdate settings) {
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
   * @return ChatGPTEnterpriseIntegrationAccountUpdateAttributes
   */
  @JsonAnySetter
  public ChatGPTEnterpriseIntegrationAccountUpdateAttributes putAdditionalProperty(
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

  /**
   * Return true if this ChatGPTEnterpriseIntegrationAccountUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatGPTEnterpriseIntegrationAccountUpdateAttributes
        chatGptEnterpriseIntegrationAccountUpdateAttributes =
            (ChatGPTEnterpriseIntegrationAccountUpdateAttributes) o;
    return Objects.equals(
            this.authentication, chatGptEnterpriseIntegrationAccountUpdateAttributes.authentication)
        && Objects.equals(
            this.dataflows, chatGptEnterpriseIntegrationAccountUpdateAttributes.dataflows)
        && Objects.equals(this.name, chatGptEnterpriseIntegrationAccountUpdateAttributes.name)
        && Objects.equals(
            this.settings, chatGptEnterpriseIntegrationAccountUpdateAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            chatGptEnterpriseIntegrationAccountUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatGPTEnterpriseIntegrationAccountUpdateAttributes {\n");
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
