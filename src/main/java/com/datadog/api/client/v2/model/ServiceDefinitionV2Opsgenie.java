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

/** Opsgenie integration for the service. */
@JsonPropertyOrder({
  ServiceDefinitionV2Opsgenie.JSON_PROPERTY_REGION,
  ServiceDefinitionV2Opsgenie.JSON_PROPERTY_SERVICE_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2Opsgenie {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REGION = "region";
  private ServiceDefinitionV2OpsgenieRegion region;

  public static final String JSON_PROPERTY_SERVICE_URL = "service-url";
  private String serviceUrl;

  public ServiceDefinitionV2Opsgenie() {}

  @JsonCreator
  public ServiceDefinitionV2Opsgenie(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_URL) String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  public ServiceDefinitionV2Opsgenie region(ServiceDefinitionV2OpsgenieRegion region) {
    this.region = region;
    this.unparsed |= !region.isValid();
    return this;
  }

  /**
   * Opsgenie instance region.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceDefinitionV2OpsgenieRegion getRegion() {
    return region;
  }

  public void setRegion(ServiceDefinitionV2OpsgenieRegion region) {
    if (!region.isValid()) {
      this.unparsed = true;
    }
    this.region = region;
  }

  public ServiceDefinitionV2Opsgenie serviceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
    return this;
  }

  /**
   * Opsgenie service url.
   *
   * @return serviceUrl
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceUrl() {
    return serviceUrl;
  }

  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
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
   * @return ServiceDefinitionV2Opsgenie
   */
  @JsonAnySetter
  public ServiceDefinitionV2Opsgenie putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceDefinitionV2Opsgenie object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2Opsgenie serviceDefinitionV2Opsgenie = (ServiceDefinitionV2Opsgenie) o;
    return Objects.equals(this.region, serviceDefinitionV2Opsgenie.region)
        && Objects.equals(this.serviceUrl, serviceDefinitionV2Opsgenie.serviceUrl)
        && Objects.equals(
            this.additionalProperties, serviceDefinitionV2Opsgenie.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, serviceUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2Opsgenie {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
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
