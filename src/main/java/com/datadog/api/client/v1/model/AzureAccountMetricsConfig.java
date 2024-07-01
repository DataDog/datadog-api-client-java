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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Dictionary containing the key <code>excluded_resource_providers</code> which has to be a list of
 * Microsoft Azure Resource Provider names. This feature is currently being beta tested. In order to
 * enable all resource providers for metric collection, pass: <code>
 * metrics_config: {"excluded_resource_providers": []}</code> (i.e., an empty list for <code>
 * excluded_resource_providers</code>).
 */
@JsonPropertyOrder({AzureAccountMetricsConfig.JSON_PROPERTY_EXCLUDED_RESOURCE_PROVIDERS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AzureAccountMetricsConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUDED_RESOURCE_PROVIDERS =
      "excluded_resource_providers";
  private List<String> excludedResourceProviders = null;

  public AzureAccountMetricsConfig excludedResourceProviders(
      List<String> excludedResourceProviders) {
    this.excludedResourceProviders = excludedResourceProviders;
    return this;
  }

  public AzureAccountMetricsConfig addExcludedResourceProvidersItem(
      String excludedResourceProvidersItem) {
    if (this.excludedResourceProviders == null) {
      this.excludedResourceProviders = new ArrayList<>();
    }
    this.excludedResourceProviders.add(excludedResourceProvidersItem);
    return this;
  }

  /**
   * List of Microsoft Azure Resource Providers to exclude from metric collection.
   *
   * @return excludedResourceProviders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_RESOURCE_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludedResourceProviders() {
    return excludedResourceProviders;
  }

  public void setExcludedResourceProviders(List<String> excludedResourceProviders) {
    this.excludedResourceProviders = excludedResourceProviders;
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
   * @return AzureAccountMetricsConfig
   */
  @JsonAnySetter
  public AzureAccountMetricsConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AzureAccountMetricsConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureAccountMetricsConfig azureAccountMetricsConfig = (AzureAccountMetricsConfig) o;
    return Objects.equals(
            this.excludedResourceProviders, azureAccountMetricsConfig.excludedResourceProviders)
        && Objects.equals(
            this.additionalProperties, azureAccountMetricsConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedResourceProviders, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureAccountMetricsConfig {\n");
    sb.append("    excludedResourceProviders: ")
        .append(toIndentedString(excludedResourceProviders))
        .append("\n");
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
