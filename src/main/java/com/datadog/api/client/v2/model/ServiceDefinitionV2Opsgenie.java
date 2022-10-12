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

/** Opsgenie integration for the service. */
@JsonPropertyOrder({
  ServiceDefinitionV2Opsgenie.JSON_PROPERTY_REGION,
  ServiceDefinitionV2Opsgenie.JSON_PROPERTY_SERVICE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2Opsgenie {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REGION = "region";
  private ServiceDefinitionV2OpsgenieRegion region;

  public static final String JSON_PROPERTY_SERVICE_ID = "service-id";
  private String serviceId;

  public ServiceDefinitionV2Opsgenie() {}

  @JsonCreator
  public ServiceDefinitionV2Opsgenie(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_ID) String serviceId) {
    this.serviceId = serviceId;
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

  public ServiceDefinitionV2Opsgenie serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Opsgenie service id.
   *
   * @return serviceId
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
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
        && Objects.equals(this.serviceId, serviceDefinitionV2Opsgenie.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, serviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2Opsgenie {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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
