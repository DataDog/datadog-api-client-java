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

/** Display settings for the shared dashboard. */
@JsonPropertyOrder({
  SharedDashboardViewingPreferences.JSON_PROPERTY_HIGH_DENSITY,
  SharedDashboardViewingPreferences.JSON_PROPERTY_THEME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardViewingPreferences {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIGH_DENSITY = "high_density";
  private Boolean highDensity;

  public static final String JSON_PROPERTY_THEME = "theme";
  private SharedDashboardViewingPreferencesTheme theme;

  public SharedDashboardViewingPreferences() {}

  @JsonCreator
  public SharedDashboardViewingPreferences(
      @JsonProperty(required = true, value = JSON_PROPERTY_HIGH_DENSITY) Boolean highDensity,
      @JsonProperty(required = true, value = JSON_PROPERTY_THEME)
          SharedDashboardViewingPreferencesTheme theme) {
    this.highDensity = highDensity;
    this.theme = theme;
    this.unparsed |= !theme.isValid();
  }

  public SharedDashboardViewingPreferences highDensity(Boolean highDensity) {
    this.highDensity = highDensity;
    return this;
  }

  /**
   * Whether widgets are displayed in high-density mode.
   *
   * @return highDensity
   */
  @JsonProperty(JSON_PROPERTY_HIGH_DENSITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHighDensity() {
    return highDensity;
  }

  public void setHighDensity(Boolean highDensity) {
    this.highDensity = highDensity;
  }

  public SharedDashboardViewingPreferences theme(SharedDashboardViewingPreferencesTheme theme) {
    this.theme = theme;
    this.unparsed |= !theme.isValid();
    return this;
  }

  /**
   * The theme of the shared dashboard view. <code>system</code> follows the viewer's system
   * default.
   *
   * @return theme
   */
  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SharedDashboardViewingPreferencesTheme getTheme() {
    return theme;
  }

  public void setTheme(SharedDashboardViewingPreferencesTheme theme) {
    if (!theme.isValid()) {
      this.unparsed = true;
    }
    this.theme = theme;
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
   * @return SharedDashboardViewingPreferences
   */
  @JsonAnySetter
  public SharedDashboardViewingPreferences putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SharedDashboardViewingPreferences object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardViewingPreferences sharedDashboardViewingPreferences =
        (SharedDashboardViewingPreferences) o;
    return Objects.equals(this.highDensity, sharedDashboardViewingPreferences.highDensity)
        && Objects.equals(this.theme, sharedDashboardViewingPreferences.theme)
        && Objects.equals(
            this.additionalProperties, sharedDashboardViewingPreferences.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highDensity, theme, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardViewingPreferences {\n");
    sb.append("    highDensity: ").append(toIndentedString(highDensity)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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
