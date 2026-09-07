/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A PagerDuty integration schema. */
@JsonPropertyOrder({EntityV3DatadogIntegrationPagerduty.JSON_PROPERTY_SERVICE_URL})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3DatadogIntegrationPagerduty {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SERVICE_URL = "serviceURL";
  private String serviceUrl;

  public EntityV3DatadogIntegrationPagerduty() {}

  @JsonCreator
  public EntityV3DatadogIntegrationPagerduty(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_URL) String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  public EntityV3DatadogIntegrationPagerduty serviceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
    return this;
  }

  /**
   * The service URL for the PagerDuty integration.
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

  /** Return true if this EntityV3DatadogIntegrationPagerduty object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3DatadogIntegrationPagerduty entityV3DatadogIntegrationPagerduty =
        (EntityV3DatadogIntegrationPagerduty) o;
    return Objects.equals(this.serviceUrl, entityV3DatadogIntegrationPagerduty.serviceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3DatadogIntegrationPagerduty {\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
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
