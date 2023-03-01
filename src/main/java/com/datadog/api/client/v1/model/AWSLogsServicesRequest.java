/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>A list of current AWS services for which Datadog offers automatic log collection.</p>
 */
@JsonPropertyOrder({
  AWSLogsServicesRequest.JSON_PROPERTY_ACCOUNT_ID,
  AWSLogsServicesRequest.JSON_PROPERTY_SERVICES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSLogsServicesRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = new ArrayList<>();

  public AWSLogsServicesRequest() {}

  @JsonCreator
  public AWSLogsServicesRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCOUNT_ID)String accountId,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICES)List<String> services) {
        this.accountId = accountId;
        this.services = services;
  }
  public AWSLogsServicesRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Your AWS Account ID without dashes.</p>
   * @return accountId
  **/
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAccountId() {
        return accountId;
      }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public AWSLogsServicesRequest services(List<String> services) {
    this.services = services;
    return this;
  }
  public AWSLogsServicesRequest addServicesItem(String servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

  /**
   * <p>Array of services IDs set to enable automatic log collection. Discover the list of available services with the get list of AWS log ready services API endpoint.</p>
   * @return services
  **/
      @JsonProperty(JSON_PROPERTY_SERVICES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getServices() {
        return services;
      }
  public void setServices(List<String> services) {
    this.services = services;
  }

  /**
   * Return true if this AWSLogsServicesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLogsServicesRequest awsLogsServicesRequest = (AWSLogsServicesRequest) o;
    return Objects.equals(this.accountId, awsLogsServicesRequest.accountId) && Objects.equals(this.services, awsLogsServicesRequest.services);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountId,services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSLogsServicesRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
