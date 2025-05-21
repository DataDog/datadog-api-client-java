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

/** The definition of <code>OCILogsConfig</code> object. */
@JsonPropertyOrder({
  OCILogsConfig.JSON_PROPERTY_COMPARTMENT_TAG_FILTERS,
  OCILogsConfig.JSON_PROPERTY_ENABLED,
  OCILogsConfig.JSON_PROPERTY_ENABLED_SERVICES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OCILogsConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPARTMENT_TAG_FILTERS = "compartment_tag_filters";
  private List<String> compartmentTagFilters = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ENABLED_SERVICES = "enabled_services";
  private List<String> enabledServices = null;

  public OCILogsConfig compartmentTagFilters(List<String> compartmentTagFilters) {
    this.compartmentTagFilters = compartmentTagFilters;
    return this;
  }

  public OCILogsConfig addCompartmentTagFiltersItem(String compartmentTagFiltersItem) {
    if (this.compartmentTagFilters == null) {
      this.compartmentTagFilters = new ArrayList<>();
    }
    this.compartmentTagFilters.add(compartmentTagFiltersItem);
    return this;
  }

  /**
   * The compartment tag filters to apply to log collection. Each value represents a Datadog tag in
   * the format key:value.
   *
   * @return compartmentTagFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARTMENT_TAG_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCompartmentTagFilters() {
    return compartmentTagFilters;
  }

  public void setCompartmentTagFilters(List<String> compartmentTagFilters) {
    this.compartmentTagFilters = compartmentTagFilters;
  }

  public OCILogsConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Enable or disable log collection. Disabled by default.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public OCILogsConfig enabledServices(List<String> enabledServices) {
    this.enabledServices = enabledServices;
    return this;
  }

  public OCILogsConfig addEnabledServicesItem(String enabledServicesItem) {
    if (this.enabledServices == null) {
      this.enabledServices = new ArrayList<>();
    }
    this.enabledServices.add(enabledServicesItem);
    return this;
  }

  /**
   * The list of services to enable for log collection.
   *
   * @return enabledServices
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnabledServices() {
    return enabledServices;
  }

  public void setEnabledServices(List<String> enabledServices) {
    this.enabledServices = enabledServices;
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
   * @return OCILogsConfig
   */
  @JsonAnySetter
  public OCILogsConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OCILogsConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCILogsConfig ociLogsConfig = (OCILogsConfig) o;
    return Objects.equals(this.compartmentTagFilters, ociLogsConfig.compartmentTagFilters)
        && Objects.equals(this.enabled, ociLogsConfig.enabled)
        && Objects.equals(this.enabledServices, ociLogsConfig.enabledServices)
        && Objects.equals(this.additionalProperties, ociLogsConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compartmentTagFilters, enabled, enabledServices, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCILogsConfig {\n");
    sb.append("    compartmentTagFilters: ")
        .append(toIndentedString(compartmentTagFilters))
        .append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enabledServices: ").append(toIndentedString(enabledServices)).append("\n");
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
