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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The definition of <code>RegionsConfig</code> object. */
@JsonPropertyOrder({
  RegionsConfig.JSON_PROPERTY_AVAILABLE,
  RegionsConfig.JSON_PROPERTY_DISABLED,
  RegionsConfig.JSON_PROPERTY_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RegionsConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private List<String> available = null;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private List<String> disabled = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private List<String> enabled = null;

  public RegionsConfig available(List<String> available) {
    this.available = available;
    return this;
  }

  public RegionsConfig addAvailableItem(String availableItem) {
    if (this.available == null) {
      this.available = new ArrayList<>();
    }
    this.available.add(availableItem);
    return this;
  }

  /**
   * The list of regions currently subscribed to .
   *
   * @return available
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAvailable() {
    return available;
  }

  public void setAvailable(List<String> available) {
    this.available = available;
  }

  public RegionsConfig disabled(List<String> disabled) {
    this.disabled = disabled;
    return this;
  }

  public RegionsConfig addDisabledItem(String disabledItem) {
    if (this.disabled == null) {
      this.disabled = new ArrayList<>();
    }
    this.disabled.add(disabledItem);
    return this;
  }

  /**
   * The list of disabled regions.
   *
   * @return disabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDisabled() {
    return disabled;
  }

  public void setDisabled(List<String> disabled) {
    this.disabled = disabled;
  }

  public RegionsConfig enabled(List<String> enabled) {
    this.enabled = enabled;
    return this;
  }

  public RegionsConfig addEnabledItem(String enabledItem) {
    if (this.enabled == null) {
      this.enabled = new ArrayList<>();
    }
    this.enabled.add(enabledItem);
    return this;
  }

  /**
   * The list of enabled regions.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnabled() {
    return enabled;
  }

  public void setEnabled(List<String> enabled) {
    this.enabled = enabled;
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
   * @return RegionsConfig
   */
  @JsonAnySetter
  public RegionsConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RegionsConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionsConfig regionsConfig = (RegionsConfig) o;
    return Objects.equals(this.available, regionsConfig.available)
        && Objects.equals(this.disabled, regionsConfig.disabled)
        && Objects.equals(this.enabled, regionsConfig.enabled)
        && Objects.equals(this.additionalProperties, regionsConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, disabled, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionsConfig {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
