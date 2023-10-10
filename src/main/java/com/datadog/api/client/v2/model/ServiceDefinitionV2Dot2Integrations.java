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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Third party integrations that Datadog supports. */
@JsonPropertyOrder({
  ServiceDefinitionV2Dot2Integrations.JSON_PROPERTY_OPSGENIE,
  ServiceDefinitionV2Dot2Integrations.JSON_PROPERTY_PAGERDUTY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2Dot2Integrations {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPSGENIE = "opsgenie";
  private ServiceDefinitionV2Dot2Opsgenie opsgenie;

  public static final String JSON_PROPERTY_PAGERDUTY = "pagerduty";
  private ServiceDefinitionV2Dot2Pagerduty pagerduty;

  public ServiceDefinitionV2Dot2Integrations opsgenie(ServiceDefinitionV2Dot2Opsgenie opsgenie) {
    this.opsgenie = opsgenie;
    this.unparsed |= opsgenie.unparsed;
    return this;
  }

  /**
   * Opsgenie integration for the service.
   *
   * @return opsgenie
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPSGENIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceDefinitionV2Dot2Opsgenie getOpsgenie() {
    return opsgenie;
  }

  public void setOpsgenie(ServiceDefinitionV2Dot2Opsgenie opsgenie) {
    this.opsgenie = opsgenie;
  }

  public ServiceDefinitionV2Dot2Integrations pagerduty(ServiceDefinitionV2Dot2Pagerduty pagerduty) {
    this.pagerduty = pagerduty;
    this.unparsed |= pagerduty.unparsed;
    return this;
  }

  /**
   * PagerDuty integration for the service.
   *
   * @return pagerduty
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGERDUTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceDefinitionV2Dot2Pagerduty getPagerduty() {
    return pagerduty;
  }

  public void setPagerduty(ServiceDefinitionV2Dot2Pagerduty pagerduty) {
    this.pagerduty = pagerduty;
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
   * @return ServiceDefinitionV2Dot2Integrations
   */
  @JsonAnySetter
  public ServiceDefinitionV2Dot2Integrations putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceDefinitionV2Dot2Integrations object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2Dot2Integrations serviceDefinitionV2Dot2Integrations =
        (ServiceDefinitionV2Dot2Integrations) o;
    return Objects.equals(this.opsgenie, serviceDefinitionV2Dot2Integrations.opsgenie)
        && Objects.equals(this.pagerduty, serviceDefinitionV2Dot2Integrations.pagerduty)
        && Objects.equals(
            this.additionalProperties, serviceDefinitionV2Dot2Integrations.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opsgenie, pagerduty, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2Dot2Integrations {\n");
    sb.append("    opsgenie: ").append(toIndentedString(opsgenie)).append("\n");
    sb.append("    pagerduty: ").append(toIndentedString(pagerduty)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
