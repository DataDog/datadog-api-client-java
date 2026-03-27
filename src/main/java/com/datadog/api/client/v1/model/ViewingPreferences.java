/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The viewing preferences for a shared dashboard. */
@JsonPropertyOrder({
  ViewingPreferences.JSON_PROPERTY_HIGH_DENSITY,
  ViewingPreferences.JSON_PROPERTY_THEME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ViewingPreferences {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIGH_DENSITY = "high_density";
  private Boolean highDensity;

  public static final String JSON_PROPERTY_THEME = "theme";
  private ViewingPreferencesTheme theme;

  public ViewingPreferences highDensity(Boolean highDensity) {
    this.highDensity = highDensity;
    return this;
  }

  /**
   * Whether the widgets on the shared dashboard should be displayed with high density.
   *
   * @return highDensity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGH_DENSITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHighDensity() {
    return highDensity;
  }

  public void setHighDensity(Boolean highDensity) {
    this.highDensity = highDensity;
  }

  public ViewingPreferences theme(ViewingPreferencesTheme theme) {
    this.theme = theme;
    this.unparsed |= !theme.isValid();
    return this;
  }

  /**
   * The theme of the shared dashboard view. "system" follows your system's default viewing theme.
   *
   * @return theme
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ViewingPreferencesTheme getTheme() {
    return theme;
  }

  public void setTheme(ViewingPreferencesTheme theme) {
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
   * @return ViewingPreferences
   */
  @JsonAnySetter
  public ViewingPreferences putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ViewingPreferences object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewingPreferences viewingPreferences = (ViewingPreferences) o;
    return Objects.equals(this.highDensity, viewingPreferences.highDensity)
        && Objects.equals(this.theme, viewingPreferences.theme)
        && Objects.equals(this.additionalProperties, viewingPreferences.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highDensity, theme, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewingPreferences {\n");
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
