/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Defines the event that counts as a return, and the window in which it must occur. */
@JsonPropertyOrder({
  ProductAnalyticsRetentionReturnCriteria.JSON_PROPERTY_BASE_QUERY,
  ProductAnalyticsRetentionReturnCriteria.JSON_PROPERTY_TIME_INTERVAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionReturnCriteria {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private ProductAnalyticsBaseQuery baseQuery;

  public static final String JSON_PROPERTY_TIME_INTERVAL = "time_interval";
  private ProductAnalyticsRetentionTimeInterval timeInterval;

  public ProductAnalyticsRetentionReturnCriteria() {}

  @JsonCreator
  public ProductAnalyticsRetentionReturnCriteria(
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          ProductAnalyticsBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
  }

  public ProductAnalyticsRetentionReturnCriteria baseQuery(ProductAnalyticsBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    return this;
  }

  /**
   * A query definition discriminated by the <code>data_source</code> field. Use <code>
   * product_analytics</code> for standard event queries, or <code>product_analytics_occurrence
   * </code> for occurrence-filtered queries.
   *
   * @return baseQuery
   */
  @JsonProperty(JSON_PROPERTY_BASE_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsBaseQuery getBaseQuery() {
    return baseQuery;
  }

  public void setBaseQuery(ProductAnalyticsBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
    if (baseQuery != null) {
      this.unparsed |= baseQuery.unparsed;
    }
  }

  public ProductAnalyticsRetentionReturnCriteria timeInterval(
      ProductAnalyticsRetentionTimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    this.unparsed |= timeInterval.unparsed;
    return this;
  }

  /**
   * A retention interval, either aligned to calendar boundaries or of a fixed length. Cohort
   * criteria use calendar intervals; return criteria use fixed intervals.
   *
   * @return timeInterval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsRetentionTimeInterval getTimeInterval() {
    return timeInterval;
  }

  public void setTimeInterval(ProductAnalyticsRetentionTimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    if (timeInterval != null) {
      this.unparsed |= timeInterval.unparsed;
    }
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
   * @return ProductAnalyticsRetentionReturnCriteria
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionReturnCriteria putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsRetentionReturnCriteria object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionReturnCriteria productAnalyticsRetentionReturnCriteria =
        (ProductAnalyticsRetentionReturnCriteria) o;
    return Objects.equals(this.baseQuery, productAnalyticsRetentionReturnCriteria.baseQuery)
        && Objects.equals(this.timeInterval, productAnalyticsRetentionReturnCriteria.timeInterval)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsRetentionReturnCriteria.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseQuery, timeInterval, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionReturnCriteria {\n");
    sb.append("    baseQuery: ").append(toIndentedString(baseQuery)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
