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

/** Writable attributes used to create an OpenAI Codex integration account. */
@JsonPropertyOrder({
  OpenAICodexIntegrationAccountCreateAttributes.JSON_PROPERTY_AUTHENTICATION,
  OpenAICodexIntegrationAccountCreateAttributes.JSON_PROPERTY_DATAFLOWS,
  OpenAICodexIntegrationAccountCreateAttributes.JSON_PROPERTY_NAME,
  OpenAICodexIntegrationAccountCreateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAICodexIntegrationAccountCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private OpenAICodexIntegrationAccountAuthenticationRequest authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private OpenAICodexIntegrationDataflowsRequest dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private OpenAICodexIntegrationAccountSettingsRequest settings;

  public OpenAICodexIntegrationAccountCreateAttributes() {}

  @JsonCreator
  public OpenAICodexIntegrationAccountCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHENTICATION)
          OpenAICodexIntegrationAccountAuthenticationRequest authentication,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTINGS)
          OpenAICodexIntegrationAccountSettingsRequest settings) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    this.name = name;
    this.settings = settings;
    this.unparsed |= settings.unparsed;
  }

  public OpenAICodexIntegrationAccountCreateAttributes authentication(
      OpenAICodexIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication for creating the OpenAI Codex integration account. Exactly one method is set.
   *
   * @return authentication
   */
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OpenAICodexIntegrationAccountAuthenticationRequest getAuthentication() {
    return authentication;
  }

  public void setAuthentication(OpenAICodexIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public OpenAICodexIntegrationAccountCreateAttributes dataflows(
      OpenAICodexIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    this.unparsed |= dataflows.unparsed;
    return this;
  }

  /**
   * Data Datadog collects from OpenAI Codex, keyed by dataflow id. Daily Codex analytics metrics
   * are always collected; each dataflow here adds a further kind of collection on top of that
   * baseline, so set <code>enabled</code> to start or stop it. Defaults listed on each dataflow
   * apply when the account is created; on update, omitted fields keep their current values. Every
   * dataflow requires an OpenAI enterprise subscription with Codex enabled; a dataflow enabled
   * without it is stored but collects no data.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAICodexIntegrationDataflowsRequest getDataflows() {
    return dataflows;
  }

  public void setDataflows(OpenAICodexIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      this.unparsed |= dataflows.unparsed;
    }
  }

  public OpenAICodexIntegrationAccountCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the OpenAI Codex integration account.
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

  public OpenAICodexIntegrationAccountCreateAttributes settings(
      OpenAICodexIntegrationAccountSettingsRequest settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings for creating the OpenAI Codex integration account.
   *
   * @return settings
   */
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OpenAICodexIntegrationAccountSettingsRequest getSettings() {
    return settings;
  }

  public void setSettings(OpenAICodexIntegrationAccountSettingsRequest settings) {
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
   * @return OpenAICodexIntegrationAccountCreateAttributes
   */
  @JsonAnySetter
  public OpenAICodexIntegrationAccountCreateAttributes putAdditionalProperty(
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

  /** Return true if this OpenAICodexIntegrationAccountCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAICodexIntegrationAccountCreateAttributes openAiCodexIntegrationAccountCreateAttributes =
        (OpenAICodexIntegrationAccountCreateAttributes) o;
    return Objects.equals(
            this.authentication, openAiCodexIntegrationAccountCreateAttributes.authentication)
        && Objects.equals(this.dataflows, openAiCodexIntegrationAccountCreateAttributes.dataflows)
        && Objects.equals(this.name, openAiCodexIntegrationAccountCreateAttributes.name)
        && Objects.equals(this.settings, openAiCodexIntegrationAccountCreateAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            openAiCodexIntegrationAccountCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAICodexIntegrationAccountCreateAttributes {\n");
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
