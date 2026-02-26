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
   * <p>An interval definition in a timeseries response.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsInterval.JSON_PROPERTY_MILLISECONDS,
  ProductAnalyticsInterval.JSON_PROPERTY_START_TIME,
  ProductAnalyticsInterval.JSON_PROPERTY_TIMES,
  ProductAnalyticsInterval.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsInterval {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_MILLISECONDS = "milliseconds";
  private Long milliseconds;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private Long startTime;

  public static final String JSON_PROPERTY_TIMES = "times";
  private List<Long> times = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ProductAnalyticsInterval milliseconds(Long milliseconds) {
    this.milliseconds = milliseconds;
    return this;
  }

  /**
   * <p>Getmilliseconds</p>
   * @return milliseconds
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MILLISECONDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMilliseconds() {
        return milliseconds;
      }
  public void setMilliseconds(Long milliseconds) {
    this.milliseconds = milliseconds;
  }
  public ProductAnalyticsInterval startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>GetstartTime</p>
   * @return startTime
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getStartTime() {
        return startTime;
      }
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }
  public ProductAnalyticsInterval times(List<Long> times) {
    this.times = times;
    return this;
  }
  public ProductAnalyticsInterval addTimesItem(Long timesItem) {
    if (this.times == null) {
      this.times = new ArrayList<>();
    }
    this.times.add(timesItem);
    return this;
  }

  /**
   * <p>Gettimes</p>
   * @return times
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<Long> getTimes() {
        return times;
      }
  public void setTimes(List<Long> times) {
    this.times = times;
  }
  public ProductAnalyticsInterval type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Gettype</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
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
   * @return ProductAnalyticsInterval
   */
  @JsonAnySetter
  public ProductAnalyticsInterval putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsInterval object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsInterval productAnalyticsInterval = (ProductAnalyticsInterval) o;
    return Objects.equals(this.milliseconds, productAnalyticsInterval.milliseconds) && Objects.equals(this.startTime, productAnalyticsInterval.startTime) && Objects.equals(this.times, productAnalyticsInterval.times) && Objects.equals(this.type, productAnalyticsInterval.type) && Objects.equals(this.additionalProperties, productAnalyticsInterval.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(milliseconds,startTime,times,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsInterval {\n");
    sb.append("    milliseconds: ").append(toIndentedString(milliseconds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
