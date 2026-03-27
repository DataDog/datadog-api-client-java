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
   * <p>A time and space aggregation combination for use in query.</p>
 */
@JsonPropertyOrder({
  MetricCustomAggregation.JSON_PROPERTY_SPACE,
  MetricCustomAggregation.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricCustomAggregation {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_SPACE = "space";
  private MetricCustomSpaceAggregation space;

  public static final String JSON_PROPERTY_TIME = "time";
  private MetricCustomTimeAggregation time;

  public MetricCustomAggregation() {}

  @JsonCreator
  public MetricCustomAggregation(
            @JsonProperty(required=true, value=JSON_PROPERTY_SPACE)MetricCustomSpaceAggregation space,
            @JsonProperty(required=true, value=JSON_PROPERTY_TIME)MetricCustomTimeAggregation time) {
        this.space = space;
        this.unparsed |= !space.isValid();
        this.time = time;
        this.unparsed |= !time.isValid();
  }
  public MetricCustomAggregation space(MetricCustomSpaceAggregation space) {
    this.space = space;
    this.unparsed |= !space.isValid();
    return this;
  }

  /**
   * <p>A space aggregation for use in query.</p>
   * @return space
  **/
      @JsonProperty(JSON_PROPERTY_SPACE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MetricCustomSpaceAggregation getSpace() {
        return space;
      }
  public void setSpace(MetricCustomSpaceAggregation space) {
    if (!space.isValid()) {
        this.unparsed = true;
    }
    this.space = space;
  }
  public MetricCustomAggregation time(MetricCustomTimeAggregation time) {
    this.time = time;
    this.unparsed |= !time.isValid();
    return this;
  }

  /**
   * <p>A time aggregation for use in query.</p>
   * @return time
  **/
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MetricCustomTimeAggregation getTime() {
        return time;
      }
  public void setTime(MetricCustomTimeAggregation time) {
    if (!time.isValid()) {
        this.unparsed = true;
    }
    this.time = time;
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
   * @return MetricCustomAggregation
   */
  @JsonAnySetter
  public MetricCustomAggregation putAdditionalProperty(String key, Object value) {
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
   * Return true if this MetricCustomAggregation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricCustomAggregation metricCustomAggregation = (MetricCustomAggregation) o;
    return Objects.equals(this.space, metricCustomAggregation.space) && Objects.equals(this.time, metricCustomAggregation.time) && Objects.equals(this.additionalProperties, metricCustomAggregation.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(space,time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricCustomAggregation {\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
