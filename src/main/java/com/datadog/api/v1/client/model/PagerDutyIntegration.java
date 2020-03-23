/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.PagerDutyService;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * New Datadog-PagerDuty integration.
 */
@ApiModel(description = "New Datadog-PagerDuty integration.")
@JsonPropertyOrder({
  PagerDutyIntegration.JSON_PROPERTY_API_TOKEN,
  PagerDutyIntegration.JSON_PROPERTY_SCHEDULES,
  PagerDutyIntegration.JSON_PROPERTY_SERVICES,
  PagerDutyIntegration.JSON_PROPERTY_SUBDOMAIN
})

public class PagerDutyIntegration {
  public static final String JSON_PROPERTY_API_TOKEN = "api_token";
  private String apiToken;

  public static final String JSON_PROPERTY_SCHEDULES = "schedules";
  private List<String> schedules = null;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<PagerDutyService> services = null;

  public static final String JSON_PROPERTY_SUBDOMAIN = "subdomain";
  private String subdomain;


  public PagerDutyIntegration apiToken(String apiToken) {
    
    this.apiToken = apiToken;
    return this;
  }

   /**
   * Your PagerDuty API token.
   * @return apiToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<PAGERDUTY_TOKEN>", value = "Your PagerDuty API token.")
  @JsonProperty(JSON_PROPERTY_API_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiToken() {
    return apiToken;
  }


  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }


  public PagerDutyIntegration schedules(List<String> schedules) {
    
    this.schedules = schedules;
    return this;
  }

  public PagerDutyIntegration addSchedulesItem(String schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

   /**
   * The array of your schedule URLs.
   * @return schedules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"https://my-pd.pagerduty.com/schedules#PCPYT4M\",\"https://my-pd.pagerduty.com/schedules#PKTPB7P\"]", value = "The array of your schedule URLs.")
  @JsonProperty(JSON_PROPERTY_SCHEDULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSchedules() {
    return schedules;
  }


  public void setSchedules(List<String> schedules) {
    this.schedules = schedules;
  }


  public PagerDutyIntegration services(List<PagerDutyService> services) {
    
    this.services = services;
    return this;
  }

  public PagerDutyIntegration addServicesItem(PagerDutyService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * The array of PagerDuty service objects.
   * @return services
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"service_key\":\"<PAGERDUTY_SERVICE_KEY>\",\"service_name\":\"test_00\"},{\"service_key\":\"<PAGERDUTY_SERVICE_KEY>\",\"service_name\":\"test_01\"}]", value = "The array of PagerDuty service objects.")
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PagerDutyService> getServices() {
    return services;
  }


  public void setServices(List<PagerDutyService> services) {
    this.services = services;
  }


  public PagerDutyIntegration subdomain(String subdomain) {
    
    this.subdomain = subdomain;
    return this;
  }

   /**
   * Your PagerDuty subdomain.
   * @return subdomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<PAGERDUTY_SUB_DOMAIN>", value = "Your PagerDuty subdomain.")
  @JsonProperty(JSON_PROPERTY_SUBDOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubdomain() {
    return subdomain;
  }


  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagerDutyIntegration pagerDutyIntegration = (PagerDutyIntegration) o;
    return Objects.equals(this.apiToken, pagerDutyIntegration.apiToken) &&
        Objects.equals(this.schedules, pagerDutyIntegration.schedules) &&
        Objects.equals(this.services, pagerDutyIntegration.services) &&
        Objects.equals(this.subdomain, pagerDutyIntegration.subdomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiToken, schedules, services, subdomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagerDutyIntegration {\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

