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

/** Basic information about a service. */
@JsonPropertyOrder({
  ServiceDefinitionV1Info.JSON_PROPERTY_DD_SERVICE,
  ServiceDefinitionV1Info.JSON_PROPERTY_DESCRIPTION,
  ServiceDefinitionV1Info.JSON_PROPERTY_DISPLAY_NAME,
  ServiceDefinitionV1Info.JSON_PROPERTY_SERVICE_TIER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV1Info {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DD_SERVICE = "dd-service";
  private String ddService;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display-name";
  private String displayName;

  public static final String JSON_PROPERTY_SERVICE_TIER = "service-tier";
  private String serviceTier;

  public ServiceDefinitionV1Info() {}

  @JsonCreator
  public ServiceDefinitionV1Info(
      @JsonProperty(required = true, value = JSON_PROPERTY_DD_SERVICE) String ddService) {
    this.ddService = ddService;
  }

  public ServiceDefinitionV1Info ddService(String ddService) {
    this.ddService = ddService;
    return this;
  }

  /**
   * Unique identifier of the service. Must be unique across all services and is used to match with
   * a service in Datadog.
   *
   * @return ddService
   */
  @JsonProperty(JSON_PROPERTY_DD_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDdService() {
    return ddService;
  }

  public void setDdService(String ddService) {
    this.ddService = ddService;
  }

  public ServiceDefinitionV1Info description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short description of the service.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceDefinitionV1Info displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A friendly name of the service.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ServiceDefinitionV1Info serviceTier(String serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

  /**
   * Service tier.
   *
   * @return serviceTier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceTier() {
    return serviceTier;
  }

  public void setServiceTier(String serviceTier) {
    this.serviceTier = serviceTier;
  }

  /** Return true if this ServiceDefinitionV1Info object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV1Info serviceDefinitionV1Info = (ServiceDefinitionV1Info) o;
    return Objects.equals(this.ddService, serviceDefinitionV1Info.ddService)
        && Objects.equals(this.description, serviceDefinitionV1Info.description)
        && Objects.equals(this.displayName, serviceDefinitionV1Info.displayName)
        && Objects.equals(this.serviceTier, serviceDefinitionV1Info.serviceTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddService, description, displayName, serviceTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV1Info {\n");
    sb.append("    ddService: ").append(toIndentedString(ddService)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    serviceTier: ").append(toIndentedString(serviceTier)).append("\n");
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
