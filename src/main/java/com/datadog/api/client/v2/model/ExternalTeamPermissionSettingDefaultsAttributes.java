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

/** Attributes of an external team permission setting default. */
@JsonPropertyOrder({
  ExternalTeamPermissionSettingDefaultsAttributes.JSON_PROPERTY_ACTION,
  ExternalTeamPermissionSettingDefaultsAttributes.JSON_PROPERTY_SOURCE,
  ExternalTeamPermissionSettingDefaultsAttributes.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExternalTeamPermissionSettingDefaultsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private ExternalTeamPermissionSettingDefaultsSource source;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public ExternalTeamPermissionSettingDefaultsAttributes() {}

  @JsonCreator
  public ExternalTeamPermissionSettingDefaultsAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) String action,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          ExternalTeamPermissionSettingDefaultsSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.action = action;
    this.source = source;
    this.unparsed |= !source.isValid();
    this.value = value;
  }

  public ExternalTeamPermissionSettingDefaultsAttributes action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The permission action this default applies to.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ExternalTeamPermissionSettingDefaultsAttributes source(
      ExternalTeamPermissionSettingDefaultsSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * The external integration source for the permission setting default.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExternalTeamPermissionSettingDefaultsSource getSource() {
    return source;
  }

  public void setSource(ExternalTeamPermissionSettingDefaultsSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public ExternalTeamPermissionSettingDefaultsAttributes value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The default permission value for the action.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
   * @return ExternalTeamPermissionSettingDefaultsAttributes
   */
  @JsonAnySetter
  public ExternalTeamPermissionSettingDefaultsAttributes putAdditionalProperty(
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

  /** Return true if this ExternalTeamPermissionSettingDefaultsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTeamPermissionSettingDefaultsAttributes
        externalTeamPermissionSettingDefaultsAttributes =
            (ExternalTeamPermissionSettingDefaultsAttributes) o;
    return Objects.equals(this.action, externalTeamPermissionSettingDefaultsAttributes.action)
        && Objects.equals(this.source, externalTeamPermissionSettingDefaultsAttributes.source)
        && Objects.equals(this.value, externalTeamPermissionSettingDefaultsAttributes.value)
        && Objects.equals(
            this.additionalProperties,
            externalTeamPermissionSettingDefaultsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, source, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTeamPermissionSettingDefaultsAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
