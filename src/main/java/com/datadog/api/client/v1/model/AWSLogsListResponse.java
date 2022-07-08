/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A list of all Datadog-AWS logs integrations available in your Datadog organization. */
@JsonPropertyOrder({
  AWSLogsListResponse.JSON_PROPERTY_ACCOUNT_ID,
  AWSLogsListResponse.JSON_PROPERTY_LAMBDAS,
  AWSLogsListResponse.JSON_PROPERTY_SERVICES
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSLogsListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_LAMBDAS = "lambdas";
  private List<AWSLogsLambda> lambdas = null;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public AWSLogsListResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Your AWS Account ID without dashes.
   *
   * @return accountId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AWSLogsListResponse lambdas(List<AWSLogsLambda> lambdas) {
    this.lambdas = lambdas;
    for (AWSLogsLambda item : lambdas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AWSLogsListResponse addLambdasItem(AWSLogsLambda lambdasItem) {
    if (this.lambdas == null) {
      this.lambdas = new ArrayList<>();
    }
    this.lambdas.add(lambdasItem);
    this.unparsed |= lambdasItem.unparsed;
    return this;
  }

  /**
   * List of ARNs configured in your Datadog account.
   *
   * @return lambdas
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAMBDAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AWSLogsLambda> getLambdas() {
    return lambdas;
  }

  public void setLambdas(List<AWSLogsLambda> lambdas) {
    this.lambdas = lambdas;
  }

  public AWSLogsListResponse services(List<String> services) {
    this.services = services;
    return this;
  }

  public AWSLogsListResponse addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Array of services IDs.
   *
   * @return services
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  /** Return true if this AWSLogsListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLogsListResponse awsLogsListResponse = (AWSLogsListResponse) o;
    return Objects.equals(this.accountId, awsLogsListResponse.accountId)
        && Objects.equals(this.lambdas, awsLogsListResponse.lambdas)
        && Objects.equals(this.services, awsLogsListResponse.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, lambdas, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSLogsListResponse {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lambdas: ").append(toIndentedString(lambdas)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
