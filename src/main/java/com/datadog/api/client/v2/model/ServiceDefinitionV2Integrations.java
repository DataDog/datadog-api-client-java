/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Third party integrations that Datadog supports. */
@JsonPropertyOrder({
  ServiceDefinitionV2Integrations.JSON_PROPERTY_OPSGENIE,
  ServiceDefinitionV2Integrations.JSON_PROPERTY_PAGERDUTY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2Integrations {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPSGENIE = "opsgenie";
  private ServiceDefinitionV2Opsgenie opsgenie;

  public static final String JSON_PROPERTY_PAGERDUTY = "pagerduty";
  private String pagerduty;

  public ServiceDefinitionV2Integrations opsgenie(ServiceDefinitionV2Opsgenie opsgenie) {
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
  public ServiceDefinitionV2Opsgenie getOpsgenie() {
    return opsgenie;
  }

  public void setOpsgenie(ServiceDefinitionV2Opsgenie opsgenie) {
    this.opsgenie = opsgenie;
  }

  public ServiceDefinitionV2Integrations pagerduty(String pagerduty) {
    this.pagerduty = pagerduty;
    return this;
  }

  /**
   * PagerDuty service URL for the service.
   *
   * @return pagerduty
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGERDUTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPagerduty() {
    return pagerduty;
  }

  public void setPagerduty(String pagerduty) {
    this.pagerduty = pagerduty;
  }

  /** Return true if this ServiceDefinitionV2Integrations object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2Integrations serviceDefinitionV2Integrations =
        (ServiceDefinitionV2Integrations) o;
    return Objects.equals(this.opsgenie, serviceDefinitionV2Integrations.opsgenie)
        && Objects.equals(this.pagerduty, serviceDefinitionV2Integrations.pagerduty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opsgenie, pagerduty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2Integrations {\n");
    sb.append("    opsgenie: ").append(toIndentedString(opsgenie)).append("\n");
    sb.append("    pagerduty: ").append(toIndentedString(pagerduty)).append("\n");
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
