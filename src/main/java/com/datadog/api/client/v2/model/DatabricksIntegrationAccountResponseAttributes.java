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

/** Attributes of a Databricks integration account returned in responses. */
@JsonPropertyOrder({
  DatabricksIntegrationAccountResponseAttributes.JSON_PROPERTY_AUTHENTICATION,
  DatabricksIntegrationAccountResponseAttributes.JSON_PROPERTY_DATAFLOWS,
  DatabricksIntegrationAccountResponseAttributes.JSON_PROPERTY_NAME,
  DatabricksIntegrationAccountResponseAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationAccountResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private DatabricksIntegrationAccountAuthenticationResponse authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private DatabricksIntegrationDataflowsResponse dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private DatabricksIntegrationAccountSettingsResponse settings;

  public DatabricksIntegrationAccountResponseAttributes() {}

  @JsonCreator
  public DatabricksIntegrationAccountResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTINGS)
          DatabricksIntegrationAccountSettingsResponse settings) {
    this.name = name;
    this.settings = settings;
    this.unparsed |= settings.unparsed;
  }

  public DatabricksIntegrationAccountResponseAttributes authentication(
      DatabricksIntegrationAccountAuthenticationResponse authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication configured on the Databricks integration account.
   *
   * @return authentication
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksIntegrationAccountAuthenticationResponse getAuthentication() {
    return authentication;
  }

  public void setAuthentication(DatabricksIntegrationAccountAuthenticationResponse authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public DatabricksIntegrationAccountResponseAttributes dataflows(
      DatabricksIntegrationDataflowsResponse dataflows) {
    this.dataflows = dataflows;
    this.unparsed |= dataflows.unparsed;
    return this;
  }

  /**
   * Dataflows configured on the Databricks integration account, keyed by dataflow id.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksIntegrationDataflowsResponse getDataflows() {
    return dataflows;
  }

  public void setDataflows(DatabricksIntegrationDataflowsResponse dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      this.unparsed |= dataflows.unparsed;
    }
  }

  public DatabricksIntegrationAccountResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the Databricks integration account.
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

  public DatabricksIntegrationAccountResponseAttributes settings(
      DatabricksIntegrationAccountSettingsResponse settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings configured on the Databricks integration account.
   *
   * @return settings
   */
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatabricksIntegrationAccountSettingsResponse getSettings() {
    return settings;
  }

  public void setSettings(DatabricksIntegrationAccountSettingsResponse settings) {
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
   * @return DatabricksIntegrationAccountResponseAttributes
   */
  @JsonAnySetter
  public DatabricksIntegrationAccountResponseAttributes putAdditionalProperty(
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

  /** Return true if this DatabricksIntegrationAccountResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationAccountResponseAttributes databricksIntegrationAccountResponseAttributes =
        (DatabricksIntegrationAccountResponseAttributes) o;
    return Objects.equals(
            this.authentication, databricksIntegrationAccountResponseAttributes.authentication)
        && Objects.equals(this.dataflows, databricksIntegrationAccountResponseAttributes.dataflows)
        && Objects.equals(this.name, databricksIntegrationAccountResponseAttributes.name)
        && Objects.equals(this.settings, databricksIntegrationAccountResponseAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            databricksIntegrationAccountResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationAccountResponseAttributes {\n");
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
