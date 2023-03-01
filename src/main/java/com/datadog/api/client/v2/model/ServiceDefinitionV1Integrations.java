/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Third party integrations that Datadog supports.</p>
 */
@JsonPropertyOrder({
  ServiceDefinitionV1Integrations.JSON_PROPERTY_PAGERDUTY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV1Integrations {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PAGERDUTY = "pagerduty";
  private String pagerduty;

  public ServiceDefinitionV1Integrations pagerduty(String pagerduty) {
    this.pagerduty = pagerduty;
    return this;
  }

  /**
   * <p>PagerDuty service URL for the service.</p>
   * @return pagerduty
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGERDUTY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPagerduty() {
        return pagerduty;
      }
  public void setPagerduty(String pagerduty) {
    this.pagerduty = pagerduty;
  }

  /**
   * Return true if this ServiceDefinitionV1Integrations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV1Integrations serviceDefinitionV1Integrations = (ServiceDefinitionV1Integrations) o;
    return Objects.equals(this.pagerduty, serviceDefinitionV1Integrations.pagerduty);
  }


  @Override
  public int hashCode() {
    return Objects.hash(pagerduty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV1Integrations {\n");
    sb.append("    pagerduty: ").append(toIndentedString(pagerduty)).append("\n");
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
