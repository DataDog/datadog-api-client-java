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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Region configuration for an OCI tenancy, indicating which regions are available, enabled, or
 * disabled for data collection.
 */
@JsonPropertyOrder({
  TenancyConfigDataAttributesRegionsConfig.JSON_PROPERTY_AVAILABLE,
  TenancyConfigDataAttributesRegionsConfig.JSON_PROPERTY_DISABLED,
  TenancyConfigDataAttributesRegionsConfig.JSON_PROPERTY_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TenancyConfigDataAttributesRegionsConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private JsonNullable<List<String>> available = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private JsonNullable<List<String>> disabled = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private JsonNullable<List<String>> enabled = JsonNullable.<List<String>>undefined();

  public TenancyConfigDataAttributesRegionsConfig available(List<String> available) {
    this.available = JsonNullable.<List<String>>of(available);
    return this;
  }

  public TenancyConfigDataAttributesRegionsConfig addAvailableItem(String availableItem) {
    if (this.available == null || !this.available.isPresent()) {
      this.available = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.available.get().add(availableItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of OCI regions available for data collection in the tenancy. Returns <code>null</code>
   * when no regions are set.
   *
   * @return available
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getAvailable() {
    return available.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getAvailable_JsonNullable() {
    return available;
  }

  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  public void setAvailable_JsonNullable(JsonNullable<List<String>> available) {
    this.available = available;
  }

  public void setAvailable(List<String> available) {
    this.available = JsonNullable.<List<String>>of(available);
  }

  public TenancyConfigDataAttributesRegionsConfig disabled(List<String> disabled) {
    this.disabled = JsonNullable.<List<String>>of(disabled);
    return this;
  }

  public TenancyConfigDataAttributesRegionsConfig addDisabledItem(String disabledItem) {
    if (this.disabled == null || !this.disabled.isPresent()) {
      this.disabled = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.disabled.get().add(disabledItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of OCI regions explicitly disabled for data collection. Returns <code>null</code> when no
   * regions are set.
   *
   * @return disabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getDisabled() {
    return disabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getDisabled_JsonNullable() {
    return disabled;
  }

  @JsonProperty(JSON_PROPERTY_DISABLED)
  public void setDisabled_JsonNullable(JsonNullable<List<String>> disabled) {
    this.disabled = disabled;
  }

  public void setDisabled(List<String> disabled) {
    this.disabled = JsonNullable.<List<String>>of(disabled);
  }

  public TenancyConfigDataAttributesRegionsConfig enabled(List<String> enabled) {
    this.enabled = JsonNullable.<List<String>>of(enabled);
    return this;
  }

  public TenancyConfigDataAttributesRegionsConfig addEnabledItem(String enabledItem) {
    if (this.enabled == null || !this.enabled.isPresent()) {
      this.enabled = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.enabled.get().add(enabledItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of OCI regions enabled for data collection. Returns <code>null</code> when no regions are
   * set.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getEnabled() {
    return enabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getEnabled_JsonNullable() {
    return enabled;
  }

  @JsonProperty(JSON_PROPERTY_ENABLED)
  public void setEnabled_JsonNullable(JsonNullable<List<String>> enabled) {
    this.enabled = enabled;
  }

  public void setEnabled(List<String> enabled) {
    this.enabled = JsonNullable.<List<String>>of(enabled);
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
   * @return TenancyConfigDataAttributesRegionsConfig
   */
  @JsonAnySetter
  public TenancyConfigDataAttributesRegionsConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TenancyConfigDataAttributesRegionsConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenancyConfigDataAttributesRegionsConfig tenancyConfigDataAttributesRegionsConfig =
        (TenancyConfigDataAttributesRegionsConfig) o;
    return Objects.equals(this.available, tenancyConfigDataAttributesRegionsConfig.available)
        && Objects.equals(this.disabled, tenancyConfigDataAttributesRegionsConfig.disabled)
        && Objects.equals(this.enabled, tenancyConfigDataAttributesRegionsConfig.enabled)
        && Objects.equals(
            this.additionalProperties,
            tenancyConfigDataAttributesRegionsConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, disabled, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenancyConfigDataAttributesRegionsConfig {\n");
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
