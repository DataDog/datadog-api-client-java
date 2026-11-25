/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  RetentionSearchReturnCriteria.JSON_PROPERTY_BASE_QUERY,
  RetentionSearchReturnCriteria.JSON_PROPERTY_TIME_INTERVAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionSearchReturnCriteria {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private BaseProductAnalyticsQuery baseQuery;

  public static final String JSON_PROPERTY_TIME_INTERVAL = "time_interval";
  private RetentionSearchReturnCriteriaTimeInterval timeInterval;

  public RetentionSearchReturnCriteria() {}

  @JsonCreator
  public RetentionSearchReturnCriteria(
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          BaseProductAnalyticsQuery baseQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
  }

  public RetentionSearchReturnCriteria baseQuery(BaseProductAnalyticsQuery baseQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return baseQuery
   */
  @JsonProperty(JSON_PROPERTY_BASE_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BaseProductAnalyticsQuery getBaseQuery() {
    return baseQuery;
  }

  public void setBaseQuery(BaseProductAnalyticsQuery baseQuery) {
    this.baseQuery = baseQuery;
    if (baseQuery != null) {
      this.unparsed |= baseQuery.unparsed;
    }
  }

  public RetentionSearchReturnCriteria timeInterval(
      RetentionSearchReturnCriteriaTimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    this.unparsed |= timeInterval.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeInterval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RetentionSearchReturnCriteriaTimeInterval getTimeInterval() {
    return timeInterval;
  }

  public void setTimeInterval(RetentionSearchReturnCriteriaTimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    if (timeInterval != null) {
      this.unparsed |= timeInterval.unparsed;
    }
  }

  /** Return true if this RetentionSearchReturnCriteria object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionSearchReturnCriteria retentionSearchReturnCriteria = (RetentionSearchReturnCriteria) o;
    return Objects.equals(this.baseQuery, retentionSearchReturnCriteria.baseQuery)
        && Objects.equals(this.timeInterval, retentionSearchReturnCriteria.timeInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseQuery, timeInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionSearchReturnCriteria {\n");
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
