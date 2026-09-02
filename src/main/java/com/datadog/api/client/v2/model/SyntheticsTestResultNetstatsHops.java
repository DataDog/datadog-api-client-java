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
   * <p>Statistics about the number of hops for a network test.</p>
 */
@JsonPropertyOrder({
  SyntheticsTestResultNetstatsHops.JSON_PROPERTY_AVG,
  SyntheticsTestResultNetstatsHops.JSON_PROPERTY_MAX,
  SyntheticsTestResultNetstatsHops.JSON_PROPERTY_MIN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultNetstatsHops {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG = "avg";
  private Double avg;

  public static final String JSON_PROPERTY_MAX = "max";
  private Long max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Long min;

  public SyntheticsTestResultNetstatsHops avg(Double avg) {
    this.avg = avg;
    return this;
  }

  /**
   * <p>Average number of hops.</p>
   * @return avg
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AVG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getAvg() {
        return avg;
      }
  public void setAvg(Double avg) {
    this.avg = avg;
  }
  public SyntheticsTestResultNetstatsHops max(Long max) {
    this.max = max;
    return this;
  }

  /**
   * <p>Maximum number of hops.</p>
   * @return max
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MAX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMax() {
        return max;
      }
  public void setMax(Long max) {
    this.max = max;
  }
  public SyntheticsTestResultNetstatsHops min(Long min) {
    this.min = min;
    return this;
  }

  /**
   * <p>Minimum number of hops.</p>
   * @return min
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MIN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMin() {
        return min;
      }
  public void setMin(Long min) {
    this.min = min;
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
   * @return SyntheticsTestResultNetstatsHops
   */
  @JsonAnySetter
  public SyntheticsTestResultNetstatsHops putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsTestResultNetstatsHops object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultNetstatsHops syntheticsTestResultNetstatsHops = (SyntheticsTestResultNetstatsHops) o;
    return Objects.equals(this.avg, syntheticsTestResultNetstatsHops.avg) && Objects.equals(this.max, syntheticsTestResultNetstatsHops.max) && Objects.equals(this.min, syntheticsTestResultNetstatsHops.min) && Objects.equals(this.additionalProperties, syntheticsTestResultNetstatsHops.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(avg,max,min, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultNetstatsHops {\n");
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
