/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Cohort criteria for retention queries. */
@JsonPropertyOrder({
  RetentionCohortCriteria.JSON_PROPERTY_BASE_QUERY,
  RetentionCohortCriteria.JSON_PROPERTY_TIME_INTERVAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionCohortCriteria {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private ProductAnalyticsBaseQuery baseQuery;

  public static final String JSON_PROPERTY_TIME_INTERVAL = "time_interval";
  private RetentionCohortCriteriaTimeInterval timeInterval;

  public RetentionCohortCriteria() {}

  @JsonCreator
  public RetentionCohortCriteria(
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          ProductAnalyticsBaseQuery baseQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_INTERVAL)
          RetentionCohortCriteriaTimeInterval timeInterval) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    this.timeInterval = timeInterval;
    this.unparsed |= timeInterval.unparsed;
  }

  public RetentionCohortCriteria baseQuery(ProductAnalyticsBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    return this;
  }

  /**
   * Product Analytics event query.
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
  }

  public RetentionCohortCriteria timeInterval(RetentionCohortCriteriaTimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    this.unparsed |= timeInterval.unparsed;
    return this;
  }

  /**
   * Time interval for cohort criteria.
   *
   * @return timeInterval
   */
  @JsonProperty(JSON_PROPERTY_TIME_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionCohortCriteriaTimeInterval getTimeInterval() {
    return timeInterval;
  }

  public void setTimeInterval(RetentionCohortCriteriaTimeInterval timeInterval) {
    this.timeInterval = timeInterval;
  }

  /** Return true if this RetentionCohortCriteria object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionCohortCriteria retentionCohortCriteria = (RetentionCohortCriteria) o;
    return Objects.equals(this.baseQuery, retentionCohortCriteria.baseQuery)
        && Objects.equals(this.timeInterval, retentionCohortCriteria.timeInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseQuery, timeInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionCohortCriteria {\n");
    sb.append("    baseQuery: ").append(toIndentedString(baseQuery)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
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
