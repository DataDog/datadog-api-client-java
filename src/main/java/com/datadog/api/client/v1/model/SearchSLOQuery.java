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
   * <p>A metric-based SLO. <strong>Required if type is <code>metric</code></strong>. Note that Datadog only allows the sum by aggregator
   * to be used because this will sum up all request counts instead of averaging them, or taking the max or
   * min of all of those requests.</p>
 */
@JsonPropertyOrder({
  SearchSLOQuery.JSON_PROPERTY_DENOMINATOR,
  SearchSLOQuery.JSON_PROPERTY_METRICS,
  SearchSLOQuery.JSON_PROPERTY_NUMERATOR
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SearchSLOQuery {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DENOMINATOR = "denominator";
  private String denominator;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private JsonNullable<List<String>> metrics = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_NUMERATOR = "numerator";
  private String numerator;

  public SearchSLOQuery denominator(String denominator) {
    this.denominator = denominator;
    return this;
  }

  /**
   * <p>A Datadog metric query for total (valid) events.</p>
   * @return denominator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DENOMINATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDenominator() {
        return denominator;
      }
  public void setDenominator(String denominator) {
    this.denominator = denominator;
  }
  public SearchSLOQuery metrics(List<String> metrics) {
    this.metrics = JsonNullable.<List<String>>of(metrics);
    return this;
  }
  public SearchSLOQuery addMetricsItem(String metricsItem) {
    if (this.metrics == null || !this.metrics.isPresent()) {
      this.metrics = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.metrics.get().add(metricsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>Metric names used in the query's numerator and denominator.
   * This field will return null and will be implemented in the next version of this endpoint.</p>
   * @return metrics
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getMetrics() {
        return metrics.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getMetrics_JsonNullable() {
    return metrics;
  }
  @JsonProperty(JSON_PROPERTY_METRICS)public void setMetrics_JsonNullable(JsonNullable<List<String>> metrics) {
    this.metrics = metrics;
  }
  public void setMetrics(List<String> metrics) {
    this.metrics = JsonNullable.<List<String>>of(metrics);
  }
  public SearchSLOQuery numerator(String numerator) {
    this.numerator = numerator;
    return this;
  }

  /**
   * <p>A Datadog metric query for good events.</p>
   * @return numerator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NUMERATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return SearchSLOQuery
   */
  @JsonAnySetter
  public SearchSLOQuery putAdditionalProperty(String key, Object value) {
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
   * Return true if this SearchSLOQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSLOQuery searchSloQuery = (SearchSLOQuery) o;
    return Objects.equals(this.denominator, searchSloQuery.denominator) && Objects.equals(this.metrics, searchSloQuery.metrics) && Objects.equals(this.numerator, searchSloQuery.numerator) && Objects.equals(this.additionalProperties, searchSloQuery.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(denominator,metrics,numerator, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSLOQuery {\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
