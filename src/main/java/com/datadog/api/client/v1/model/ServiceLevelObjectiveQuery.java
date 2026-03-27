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
import java.util.UUID;
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
   * <p>A count-based (metric) SLO query. This field is superseded by <code>sli_specification</code> but is retained for backwards compatibility. Note that Datadog only allows the sum by aggregator
   * to be used because this will sum up all request counts instead of averaging them, or taking the max or
   * min of all of those requests.</p>
 */
@JsonPropertyOrder({
  ServiceLevelObjectiveQuery.JSON_PROPERTY_DENOMINATOR,
  ServiceLevelObjectiveQuery.JSON_PROPERTY_NUMERATOR
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceLevelObjectiveQuery {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DENOMINATOR = "denominator";
  private String denominator;

  public static final String JSON_PROPERTY_NUMERATOR = "numerator";
  private String numerator;

  public ServiceLevelObjectiveQuery() {}

  @JsonCreator
  public ServiceLevelObjectiveQuery(
            @JsonProperty(required=true, value=JSON_PROPERTY_DENOMINATOR)String denominator,
            @JsonProperty(required=true, value=JSON_PROPERTY_NUMERATOR)String numerator) {
        this.denominator = denominator;
        this.numerator = numerator;
  }
  public ServiceLevelObjectiveQuery denominator(String denominator) {
    this.denominator = denominator;
    return this;
  }

  /**
   * <p>A Datadog metric query for total (valid) events.</p>
   * @return denominator
  **/
      @JsonProperty(JSON_PROPERTY_DENOMINATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDenominator() {
        return denominator;
      }
  public void setDenominator(String denominator) {
    this.denominator = denominator;
  }
  public ServiceLevelObjectiveQuery numerator(String numerator) {
    this.numerator = numerator;
    return this;
  }

  /**
   * <p>A Datadog metric query for good events.</p>
   * @return numerator
  **/
      @JsonProperty(JSON_PROPERTY_NUMERATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getNumerator() {
        return numerator;
      }
  public void setNumerator(String numerator) {
    this.numerator = numerator;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ServiceLevelObjectiveQuery
   */
  @JsonAnySetter
  public ServiceLevelObjectiveQuery putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this ServiceLevelObjectiveQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelObjectiveQuery serviceLevelObjectiveQuery = (ServiceLevelObjectiveQuery) o;
    return Objects.equals(this.denominator, serviceLevelObjectiveQuery.denominator) && Objects.equals(this.numerator, serviceLevelObjectiveQuery.numerator) && Objects.equals(this.additionalProperties, serviceLevelObjectiveQuery.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(denominator,numerator, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelObjectiveQuery {\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
