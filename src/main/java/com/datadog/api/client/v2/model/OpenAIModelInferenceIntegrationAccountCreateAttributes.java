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

/** Writable attributes used to create an OpenAI Model Inference integration account. */
@JsonPropertyOrder({
  OpenAIModelInferenceIntegrationAccountCreateAttributes.JSON_PROPERTY_AUTHENTICATION,
  OpenAIModelInferenceIntegrationAccountCreateAttributes.JSON_PROPERTY_DATAFLOWS,
  OpenAIModelInferenceIntegrationAccountCreateAttributes.JSON_PROPERTY_NAME,
  OpenAIModelInferenceIntegrationAccountCreateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAIModelInferenceIntegrationAccountCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private OpenAIModelInferenceIntegrationAccountAuthenticationRequest authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private OpenAIModelInferenceIntegrationDataflowsRequest dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private OpenAIModelInferenceIntegrationAccountSettingsRequest settings;

  public OpenAIModelInferenceIntegrationAccountCreateAttributes() {}

  @JsonCreator
  public OpenAIModelInferenceIntegrationAccountCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHENTICATION)
          OpenAIModelInferenceIntegrationAccountAuthenticationRequest authentication,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTINGS)
          OpenAIModelInferenceIntegrationAccountSettingsRequest settings) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    this.name = name;
    this.settings = settings;
    this.unparsed |= settings.unparsed;
  }

  public OpenAIModelInferenceIntegrationAccountCreateAttributes authentication(
      OpenAIModelInferenceIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication for creating the OpenAI Model Inference integration account. Set exactly one
   * method.
   *
   * @return authentication
   */
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OpenAIModelInferenceIntegrationAccountAuthenticationRequest getAuthentication() {
    return authentication;
  }

  public void setAuthentication(
      OpenAIModelInferenceIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public OpenAIModelInferenceIntegrationAccountCreateAttributes dataflows(
      OpenAIModelInferenceIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    this.unparsed |= dataflows.unparsed;
    return this;
  }

  /**
   * Data Datadog collects from OpenAI Model Inference, keyed by dataflow ID. Each dataflow turns on
   * a distinct type of collection. Set <code>enabled</code> to start or stop a dataflow. The
   * default for each dataflow applies when the account is created. On update, omitted fields keep
   * their current values.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAIModelInferenceIntegrationDataflowsRequest getDataflows() {
    return dataflows;
  }

  public void setDataflows(OpenAIModelInferenceIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      this.unparsed |= dataflows.unparsed;
    }
  }

  public OpenAIModelInferenceIntegrationAccountCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the OpenAI Model Inference integration account.
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

  public OpenAIModelInferenceIntegrationAccountCreateAttributes settings(
      OpenAIModelInferenceIntegrationAccountSettingsRequest settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings for creating the OpenAI Model Inference integration account.
   *
   * @return settings
   */
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OpenAIModelInferenceIntegrationAccountSettingsRequest getSettings() {
    return settings;
  }

  public void setSettings(OpenAIModelInferenceIntegrationAccountSettingsRequest settings) {
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
   * @return OpenAIModelInferenceIntegrationAccountCreateAttributes
   */
  @JsonAnySetter
  public OpenAIModelInferenceIntegrationAccountCreateAttributes putAdditionalProperty(
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
   * Return true if this OpenAIModelInferenceIntegrationAccountCreateAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAIModelInferenceIntegrationAccountCreateAttributes
        openAiModelInferenceIntegrationAccountCreateAttributes =
            (OpenAIModelInferenceIntegrationAccountCreateAttributes) o;
    return Objects.equals(
            this.authentication,
            openAiModelInferenceIntegrationAccountCreateAttributes.authentication)
        && Objects.equals(
            this.dataflows, openAiModelInferenceIntegrationAccountCreateAttributes.dataflows)
        && Objects.equals(this.name, openAiModelInferenceIntegrationAccountCreateAttributes.name)
        && Objects.equals(
            this.settings, openAiModelInferenceIntegrationAccountCreateAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            openAiModelInferenceIntegrationAccountCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAIModelInferenceIntegrationAccountCreateAttributes {\n");
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
