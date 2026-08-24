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

/**
 * Attributes of a Twilio integration account. The Twilio configuration is hoisted directly onto the
 * attributes; there is no interface wrapper because the <code>twilio</code> interface is fixed by
 * the endpoint path.
 */
@JsonPropertyOrder({
  TwilioAccountAttributes.JSON_PROPERTY_AUTHENTICATION,
  TwilioAccountAttributes.JSON_PROPERTY_DATAFLOWS,
  TwilioAccountAttributes.JSON_PROPERTY_NAME,
  TwilioAccountAttributes.JSON_PROPERTY_PERMISSIONS,
  TwilioAccountAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TwilioAccountAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private TwilioAuthentication authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private List<TwilioDataflow> dataflows = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private IntegrationAccountPermissions permissions;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private TwilioSettings settings;

  public TwilioAccountAttributes() {}

  @JsonCreator
  public TwilioAccountAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHENTICATION)
          TwilioAuthentication authentication,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    this.name = name;
  }

  public TwilioAccountAttributes authentication(TwilioAuthentication authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication methods supported by the Twilio interface. Exactly one is set, selected by its
   * <code>type</code>.
   *
   * @return authentication
   */
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TwilioAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(TwilioAuthentication authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public TwilioAccountAttributes dataflows(List<TwilioDataflow> dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      for (TwilioDataflow item : dataflows) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TwilioAccountAttributes addDataflowsItem(TwilioDataflow dataflowsItem) {
    if (this.dataflows == null) {
      this.dataflows = new ArrayList<>();
    }
    this.dataflows.add(dataflowsItem);
    this.unparsed |= dataflowsItem.unparsed;
    return this;
  }

  /**
   * Dataflows for the Twilio interface.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TwilioDataflow> getDataflows() {
    return dataflows;
  }

  public void setDataflows(List<TwilioDataflow> dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      for (TwilioDataflow item : dataflows) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TwilioAccountAttributes name(String name) {
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

  public TwilioAccountAttributes settings(TwilioSettings settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Twilio interface settings.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TwilioSettings getSettings() {
    return settings;
  }

  public void setSettings(TwilioSettings settings) {
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
   * @return TwilioAccountAttributes
   */
  @JsonAnySetter
  public TwilioAccountAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TwilioAccountAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioAccountAttributes twilioAccountAttributes = (TwilioAccountAttributes) o;
    return Objects.equals(this.authentication, twilioAccountAttributes.authentication)
        && Objects.equals(this.dataflows, twilioAccountAttributes.dataflows)
        && Objects.equals(this.name, twilioAccountAttributes.name)
        && Objects.equals(this.permissions, twilioAccountAttributes.permissions)
        && Objects.equals(this.settings, twilioAccountAttributes.settings)
        && Objects.equals(this.additionalProperties, twilioAccountAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authentication, dataflows, name, permissions, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioAccountAttributes {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    dataflows: ").append(toIndentedString(dataflows)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
