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

/** Writable attributes used to create a Databricks integration account. */
@JsonPropertyOrder({
  DatabricksIntegrationAccountCreateAttributes.JSON_PROPERTY_AUTHENTICATION,
  DatabricksIntegrationAccountCreateAttributes.JSON_PROPERTY_DATAFLOWS,
  DatabricksIntegrationAccountCreateAttributes.JSON_PROPERTY_NAME,
  DatabricksIntegrationAccountCreateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationAccountCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private DatabricksIntegrationAccountAuthenticationRequest authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private DatabricksIntegrationDataflowsRequest dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private DatabricksIntegrationAccountSettingsRequest settings;

  public DatabricksIntegrationAccountCreateAttributes() {}

  @JsonCreator
  public DatabricksIntegrationAccountCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHENTICATION)
          DatabricksIntegrationAccountAuthenticationRequest authentication,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTINGS)
          DatabricksIntegrationAccountSettingsRequest settings) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    this.name = name;
    this.settings = settings;
    this.unparsed |= settings.unparsed;
  }

  public DatabricksIntegrationAccountCreateAttributes authentication(
      DatabricksIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication for creating the Databricks integration account. Exactly one method is set.
   * Choosing <code>private-action-runner</code> leaves the <code>databricks-model-serving-metrics
   * </code> dataflow unable to collect data.
   *
   * @return authentication
   */
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatabricksIntegrationAccountAuthenticationRequest getAuthentication() {
    return authentication;
  }

  public void setAuthentication(DatabricksIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public DatabricksIntegrationAccountCreateAttributes dataflows(
      DatabricksIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    this.unparsed |= dataflows.unparsed;
    return this;
  }

  /**
   * Dataflows to configure on the Databricks integration account, keyed by dataflow id. Some
   * dataflows and settings have prerequisites, noted on each. Those prerequisites are not checked
   * when the request is made, so anything left enabled without them is stored but collects no data.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksIntegrationDataflowsRequest getDataflows() {
    return dataflows;
  }

  public void setDataflows(DatabricksIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      this.unparsed |= dataflows.unparsed;
    }
  }

  public DatabricksIntegrationAccountCreateAttributes name(String name) {
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

  public DatabricksIntegrationAccountCreateAttributes settings(
      DatabricksIntegrationAccountSettingsRequest settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings for creating the Databricks integration account.
   *
   * @return settings
   */
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatabricksIntegrationAccountSettingsRequest getSettings() {
    return settings;
  }

  public void setSettings(DatabricksIntegrationAccountSettingsRequest settings) {
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
   * @return DatabricksIntegrationAccountCreateAttributes
   */
  @JsonAnySetter
  public DatabricksIntegrationAccountCreateAttributes putAdditionalProperty(
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

  /** Return true if this DatabricksIntegrationAccountCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationAccountCreateAttributes databricksIntegrationAccountCreateAttributes =
        (DatabricksIntegrationAccountCreateAttributes) o;
    return Objects.equals(
            this.authentication, databricksIntegrationAccountCreateAttributes.authentication)
        && Objects.equals(this.dataflows, databricksIntegrationAccountCreateAttributes.dataflows)
        && Objects.equals(this.name, databricksIntegrationAccountCreateAttributes.name)
        && Objects.equals(this.settings, databricksIntegrationAccountCreateAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            databricksIntegrationAccountCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationAccountCreateAttributes {\n");
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
