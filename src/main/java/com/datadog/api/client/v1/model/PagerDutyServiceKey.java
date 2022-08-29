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
   * <p>PagerDuty service object key.</p>
 */
@JsonPropertyOrder({
  PagerDutyServiceKey.JSON_PROPERTY_SERVICE_KEY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PagerDutyServiceKey {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_SERVICE_KEY = "service_key";
  private String serviceKey;

  public PagerDutyServiceKey() {}

  @JsonCreator
  public PagerDutyServiceKey(
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE_KEY)String serviceKey) {
        this.serviceKey = serviceKey;
  }
  public PagerDutyServiceKey serviceKey(String serviceKey) {
    this.serviceKey = serviceKey;
    return this;
  }

  /**
   * <p>Your service key in PagerDuty.</p>
   * @return serviceKey
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getServiceKey() {
        return serviceKey;
      }
  public void setServiceKey(String serviceKey) {
    this.serviceKey = serviceKey;
  }

  /**
   * Return true if this PagerDutyServiceKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagerDutyServiceKey pagerDutyServiceKey = (PagerDutyServiceKey) o;
    return Objects.equals(this.serviceKey, pagerDutyServiceKey.serviceKey);
  }


  @Override
  public int hashCode() {
    return Objects.hash(serviceKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagerDutyServiceKey {\n");
    sb.append("    serviceKey: ").append(toIndentedString(serviceKey)).append("\n");
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
