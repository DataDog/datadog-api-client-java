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

/** PagerDuty integration for the service. */
@JsonPropertyOrder({ServiceDefinitionV2Dot1Pagerduty.JSON_PROPERTY_SERVICE_URL})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2Dot1Pagerduty {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SERVICE_URL = "service-url";
  private String serviceUrl;

  public ServiceDefinitionV2Dot1Pagerduty serviceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
    return this;
  }

  /**
   * PagerDuty service url.
   *
   * @return serviceUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceUrl() {
    return serviceUrl;
  }

  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  /** Return true if this ServiceDefinitionV2Dot1Pagerduty object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2Dot1Pagerduty serviceDefinitionV2Dot1Pagerduty =
        (ServiceDefinitionV2Dot1Pagerduty) o;
    return Objects.equals(this.serviceUrl, serviceDefinitionV2Dot1Pagerduty.serviceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2Dot1Pagerduty {\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
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
