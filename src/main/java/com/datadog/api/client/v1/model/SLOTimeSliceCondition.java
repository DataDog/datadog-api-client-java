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
   * <p>The time-slice condition, composed of 3 parts: 1. the metric timeseries query, 2. the comparator,
   * and 3. the threshold. Optionally, a fourth part, the query interval, can be provided.</p>
 */
@JsonPropertyOrder({
  SLOTimeSliceCondition.JSON_PROPERTY_COMPARATOR,
  SLOTimeSliceCondition.JSON_PROPERTY_QUERY,
  SLOTimeSliceCondition.JSON_PROPERTY_QUERY_INTERVAL_SECONDS,
  SLOTimeSliceCondition.JSON_PROPERTY_THRESHOLD
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOTimeSliceCondition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPARATOR = "comparator";
  private SLOTimeSliceComparator comparator;

  public static final String JSON_PROPERTY_QUERY = "query";
  private SLOTimeSliceQuery query;

  public static final String JSON_PROPERTY_QUERY_INTERVAL_SECONDS = "query_interval_seconds";
  private SLOTimeSliceInterval queryIntervalSeconds;

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private Double threshold;

  public SLOTimeSliceCondition() {}

  @JsonCreator
  public SLOTimeSliceCondition(
            @JsonProperty(required=true, value=JSON_PROPERTY_COMPARATOR)SLOTimeSliceComparator comparator,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)SLOTimeSliceQuery query,
            @JsonProperty(required=true, value=JSON_PROPERTY_THRESHOLD)Double threshold) {
        this.comparator = comparator;
        this.unparsed |= !comparator.isValid();
        this.query = query;
        this.unparsed |= query.unparsed;
        this.threshold = threshold;
  }
  public SLOTimeSliceCondition comparator(SLOTimeSliceComparator comparator) {
    this.comparator = comparator;
    this.unparsed |= !comparator.isValid();
    return this;
  }

  /**
   * <p>The comparator used to compare the SLI value to the threshold.</p>
   * @return comparator
  **/
      @JsonProperty(JSON_PROPERTY_COMPARATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SLOTimeSliceComparator getComparator() {
        return comparator;
      }
  public void setComparator(SLOTimeSliceComparator comparator) {
    if (!comparator.isValid()) {
        this.unparsed = true;
    }
    this.comparator = comparator;
  }
  public SLOTimeSliceCondition query(SLOTimeSliceQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * <p>The queries and formula used to calculate the SLI value.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SLOTimeSliceQuery getQuery() {
        return query;
      }
  public void setQuery(SLOTimeSliceQuery query) {
    this.query = query;
  }
  public SLOTimeSliceCondition queryIntervalSeconds(SLOTimeSliceInterval queryIntervalSeconds) {
    this.queryIntervalSeconds = queryIntervalSeconds;
    this.unparsed |= !queryIntervalSeconds.isValid();
    return this;
  }

  /**
   * <p>The interval used when querying data, which defines the size of a time slice.
   * Two values are allowed: 60 (1 minute) and 300 (5 minutes).
   * If not provided, the value defaults to 300 (5 minutes).</p>
   * @return queryIntervalSeconds
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY_INTERVAL_SECONDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SLOTimeSliceInterval getQueryIntervalSeconds() {
        return queryIntervalSeconds;
      }
  public void setQueryIntervalSeconds(SLOTimeSliceInterval queryIntervalSeconds) {
    if (!queryIntervalSeconds.isValid()) {
        this.unparsed = true;
    }
    this.queryIntervalSeconds = queryIntervalSeconds;
  }
  public SLOTimeSliceCondition threshold(Double threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * <p>The threshold value to which each SLI value will be compared.</p>
   * @return threshold
  **/
      @JsonProperty(JSON_PROPERTY_THRESHOLD)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getThreshold() {
        return threshold;
      }
  public void setThreshold(Double threshold) {
    this.threshold = threshold;
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
   * @return SLOTimeSliceCondition
   */
  @JsonAnySetter
  public SLOTimeSliceCondition putAdditionalProperty(String key, Object value) {
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
   * Return true if this SLOTimeSliceCondition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOTimeSliceCondition sloTimeSliceCondition = (SLOTimeSliceCondition) o;
    return Objects.equals(this.comparator, sloTimeSliceCondition.comparator) && Objects.equals(this.query, sloTimeSliceCondition.query) && Objects.equals(this.queryIntervalSeconds, sloTimeSliceCondition.queryIntervalSeconds) && Objects.equals(this.threshold, sloTimeSliceCondition.threshold) && Objects.equals(this.additionalProperties, sloTimeSliceCondition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(comparator,query,queryIntervalSeconds,threshold, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOTimeSliceCondition {\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryIntervalSeconds: ").append(toIndentedString(queryIntervalSeconds)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
