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
   * <p>Elapsed time statistics (min/max/avg in milliseconds).</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsElapsedTime.JSON_PROPERTY_AVG,
  ProductAnalyticsElapsedTime.JSON_PROPERTY_MAX,
  ProductAnalyticsElapsedTime.JSON_PROPERTY_MIN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsElapsedTime {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG = "avg";
  private Long avg;

  public static final String JSON_PROPERTY_MAX = "max";
  private Long max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Long min;

  public ProductAnalyticsElapsedTime() {}

  @JsonCreator
  public ProductAnalyticsElapsedTime(
            @JsonProperty(required=true, value=JSON_PROPERTY_AVG)Long avg,
            @JsonProperty(required=true, value=JSON_PROPERTY_MAX)Long max,
            @JsonProperty(required=true, value=JSON_PROPERTY_MIN)Long min) {
        this.avg = avg;
        this.max = max;
        this.min = min;
  }
  public ProductAnalyticsElapsedTime avg(Long avg) {
    this.avg = avg;
    return this;
  }

  /**
   * <p>Average elapsed time to reach the next step, in milliseconds.</p>
   * @return avg
  **/
      @JsonProperty(JSON_PROPERTY_AVG)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getAvg() {
        return avg;
      }
  public void setAvg(Long avg) {
    this.avg = avg;
  }
  public ProductAnalyticsElapsedTime max(Long max) {
    this.max = max;
    return this;
  }

  /**
   * <p>Maximum elapsed time to reach the next step, in milliseconds.</p>
   * @return max
  **/
      @JsonProperty(JSON_PROPERTY_MAX)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getMax() {
        return max;
      }
  public void setMax(Long max) {
    this.max = max;
  }
  public ProductAnalyticsElapsedTime min(Long min) {
    this.min = min;
    return this;
  }

  /**
   * <p>Minimum elapsed time to reach the next step, in milliseconds.</p>
   * @return min
  **/
      @JsonProperty(JSON_PROPERTY_MIN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return ProductAnalyticsElapsedTime
   */
  @JsonAnySetter
  public ProductAnalyticsElapsedTime putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsElapsedTime object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsElapsedTime productAnalyticsElapsedTime = (ProductAnalyticsElapsedTime) o;
    return Objects.equals(this.avg, productAnalyticsElapsedTime.avg) && Objects.equals(this.max, productAnalyticsElapsedTime.max) && Objects.equals(this.min, productAnalyticsElapsedTime.min) && Objects.equals(this.additionalProperties, productAnalyticsElapsedTime.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(avg,max,min, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsElapsedTime {\n");
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
