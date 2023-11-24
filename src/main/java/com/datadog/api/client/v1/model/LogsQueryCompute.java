/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Define computation for a log query. */
@JsonPropertyOrder({
  LogsQueryCompute.JSON_PROPERTY_AGGREGATION,
  LogsQueryCompute.JSON_PROPERTY_FACET,
  LogsQueryCompute.JSON_PROPERTY_INTERVAL,
  LogsQueryCompute.JSON_PROPERTY_ROLLUP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsQueryCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_ROLLUP = "rollup";
  private CalendarInterval rollup;

  public LogsQueryCompute() {}

  @JsonCreator
  public LogsQueryCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION) String aggregation) {
    this.aggregation = aggregation;
  }

  public LogsQueryCompute aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * The aggregation method.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAggregation() {
    return aggregation;
  }

  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }

  public LogsQueryCompute facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Facet name.
   *
   * @return facet
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public LogsQueryCompute interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Fixed numeric interval for compute (in milliseconds). Fields <code>interval</code> (numeric
   * interval) and <code>rollup</code> (calendar interval) are mutually exclusive.
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public LogsQueryCompute rollup(CalendarInterval rollup) {
    this.rollup = rollup;
    this.unparsed |= rollup.unparsed;
    return this;
  }

  /**
   * Calendar interval options for compute. Fields <code>interval</code> (numeric interval) and
   * <code>rollup</code> (calendar interval) are mutually exclusive.
   *
   * <p>For instance: - { type: 'day', alignment: '1pm', timezone: 'Europe/Paris' } - { type:
   * 'week', alignment: 'tuesday', quantity: 2 } - { type: 'month', alignment: '15th' } - { type:
   * 'year', alignment: 'april' }
   *
   * @return rollup
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLLUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CalendarInterval getRollup() {
    return rollup;
  }

  public void setRollup(CalendarInterval rollup) {
    this.rollup = rollup;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return LogsQueryCompute
   */
  @JsonAnySetter
  public LogsQueryCompute putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsQueryCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsQueryCompute logsQueryCompute = (LogsQueryCompute) o;
    return Objects.equals(this.aggregation, logsQueryCompute.aggregation)
        && Objects.equals(this.facet, logsQueryCompute.facet)
        && Objects.equals(this.interval, logsQueryCompute.interval)
        && Objects.equals(this.rollup, logsQueryCompute.rollup)
        && Objects.equals(this.additionalProperties, logsQueryCompute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, facet, interval, rollup, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsQueryCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    rollup: ").append(toIndentedString(rollup)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
