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
   * <p>A <code>metric</code> based SLO history response.</p>
   * <p>This is not included in responses for <code>monitor</code> based SLOs.</p>
 */
@JsonPropertyOrder({
  SLOHistoryMetrics.JSON_PROPERTY_DENOMINATOR,
  SLOHistoryMetrics.JSON_PROPERTY_INTERVAL,
  SLOHistoryMetrics.JSON_PROPERTY_MESSAGE,
  SLOHistoryMetrics.JSON_PROPERTY_NUMERATOR,
  SLOHistoryMetrics.JSON_PROPERTY_QUERY,
  SLOHistoryMetrics.JSON_PROPERTY_RES_TYPE,
  SLOHistoryMetrics.JSON_PROPERTY_RESP_VERSION,
  SLOHistoryMetrics.JSON_PROPERTY_TIMES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOHistoryMetrics {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DENOMINATOR = "denominator";
  private SLOHistoryMetricsSeries denominator;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NUMERATOR = "numerator";
  private SLOHistoryMetricsSeries numerator;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RES_TYPE = "res_type";
  private String resType;

  public static final String JSON_PROPERTY_RESP_VERSION = "resp_version";
  private Long respVersion;

  public static final String JSON_PROPERTY_TIMES = "times";
  private List<Double> times = new ArrayList<>();

  public SLOHistoryMetrics() {}

  @JsonCreator
  public SLOHistoryMetrics(
            @JsonProperty(required=true, value=JSON_PROPERTY_DENOMINATOR)SLOHistoryMetricsSeries denominator,
            @JsonProperty(required=true, value=JSON_PROPERTY_INTERVAL)Long interval,
            @JsonProperty(required=true, value=JSON_PROPERTY_NUMERATOR)SLOHistoryMetricsSeries numerator,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)String query,
            @JsonProperty(required=true, value=JSON_PROPERTY_RES_TYPE)String resType,
            @JsonProperty(required=true, value=JSON_PROPERTY_RESP_VERSION)Long respVersion,
            @JsonProperty(required=true, value=JSON_PROPERTY_TIMES)List<Double> times) {
        this.denominator = denominator;
        this.unparsed |= denominator.unparsed;
        this.interval = interval;
        this.numerator = numerator;
        this.unparsed |= numerator.unparsed;
        this.query = query;
        this.resType = resType;
        this.respVersion = respVersion;
        this.times = times;
  }
  public SLOHistoryMetrics denominator(SLOHistoryMetricsSeries denominator) {
    this.denominator = denominator;
    this.unparsed |= denominator.unparsed;
    return this;
  }

  /**
   * <p>A representation of <code>metric</code> based SLO timeseries for the provided queries.
   * This is the same response type from <code>batch_query</code> endpoint.</p>
   * @return denominator
  **/
      @JsonProperty(JSON_PROPERTY_DENOMINATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SLOHistoryMetricsSeries getDenominator() {
        return denominator;
      }
  public void setDenominator(SLOHistoryMetricsSeries denominator) {
    this.denominator = denominator;
  }
  public SLOHistoryMetrics interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * <p>The aggregated query interval for the series data. It's implicit based on the query time window.</p>
   * @return interval
  **/
      @JsonProperty(JSON_PROPERTY_INTERVAL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getInterval() {
        return interval;
      }
  public void setInterval(Long interval) {
    this.interval = interval;
  }
  public SLOHistoryMetrics message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Optional message if there are specific query issues/warnings.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
  }
  public SLOHistoryMetrics numerator(SLOHistoryMetricsSeries numerator) {
    this.numerator = numerator;
    this.unparsed |= numerator.unparsed;
    return this;
  }

  /**
   * <p>A representation of <code>metric</code> based SLO timeseries for the provided queries.
   * This is the same response type from <code>batch_query</code> endpoint.</p>
   * @return numerator
  **/
      @JsonProperty(JSON_PROPERTY_NUMERATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SLOHistoryMetricsSeries getNumerator() {
        return numerator;
      }
  public void setNumerator(SLOHistoryMetricsSeries numerator) {
    this.numerator = numerator;
  }
  public SLOHistoryMetrics query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The combined numerator and denominator query CSV.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public SLOHistoryMetrics resType(String resType) {
    this.resType = resType;
    return this;
  }

  /**
   * <p>The series result type. This mimics <code>batch_query</code> response type.</p>
   * @return resType
  **/
      @JsonProperty(JSON_PROPERTY_RES_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getResType() {
        return resType;
      }
  public void setResType(String resType) {
    this.resType = resType;
  }
  public SLOHistoryMetrics respVersion(Long respVersion) {
    this.respVersion = respVersion;
    return this;
  }

  /**
   * <p>The series response version type. This mimics <code>batch_query</code> response type.</p>
   * @return respVersion
  **/
      @JsonProperty(JSON_PROPERTY_RESP_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getRespVersion() {
        return respVersion;
      }
  public void setRespVersion(Long respVersion) {
    this.respVersion = respVersion;
  }
  public SLOHistoryMetrics times(List<Double> times) {
    this.times = times;
    return this;
  }
  public SLOHistoryMetrics addTimesItem(Double timesItem) {
    this.times.add(timesItem);
    return this;
  }

  /**
   * <p>An array of query timestamps in EPOCH milliseconds.</p>
   * @return times
  **/
      @JsonProperty(JSON_PROPERTY_TIMES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<Double> getTimes() {
        return times;
      }
  public void setTimes(List<Double> times) {
    this.times = times;
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
   * @return SLOHistoryMetrics
   */
  @JsonAnySetter
  public SLOHistoryMetrics putAdditionalProperty(String key, Object value) {
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
   * Return true if this SLOHistoryMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryMetrics sloHistoryMetrics = (SLOHistoryMetrics) o;
    return Objects.equals(this.denominator, sloHistoryMetrics.denominator) && Objects.equals(this.interval, sloHistoryMetrics.interval) && Objects.equals(this.message, sloHistoryMetrics.message) && Objects.equals(this.numerator, sloHistoryMetrics.numerator) && Objects.equals(this.query, sloHistoryMetrics.query) && Objects.equals(this.resType, sloHistoryMetrics.resType) && Objects.equals(this.respVersion, sloHistoryMetrics.respVersion) && Objects.equals(this.times, sloHistoryMetrics.times) && Objects.equals(this.additionalProperties, sloHistoryMetrics.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(denominator,interval,message,numerator,query,resType,respVersion,times, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistoryMetrics {\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    resType: ").append(toIndentedString(resType)).append("\n");
    sb.append("    respVersion: ").append(toIndentedString(respVersion)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
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
