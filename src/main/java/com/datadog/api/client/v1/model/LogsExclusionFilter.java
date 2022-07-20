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

/** Exclusion filter is defined by a query, a sampling rule, and a active/inactive toggle. */
@JsonPropertyOrder({
  LogsExclusionFilter.JSON_PROPERTY_QUERY,
  LogsExclusionFilter.JSON_PROPERTY_SAMPLE_RATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsExclusionFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SAMPLE_RATE = "sample_rate";
  private Double sampleRate;

  public LogsExclusionFilter() {}

  @JsonCreator
  public LogsExclusionFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_SAMPLE_RATE) Double sampleRate) {
    this.sampleRate = sampleRate;
  }

  public LogsExclusionFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Default query is <code>*</code>, meaning all logs flowing in the index would be excluded. Scope
   * down exclusion filter to only a subset of logs with a log query.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public LogsExclusionFilter sampleRate(Double sampleRate) {
    this.sampleRate = sampleRate;
    return this;
  }

  /**
   * Sample rate to apply to logs going through this exclusion filter, a value of 1.0 excludes all
   * logs matching the query.
   *
   * @return sampleRate
   */
  @JsonProperty(JSON_PROPERTY_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getSampleRate() {
    return sampleRate;
  }

  public void setSampleRate(Double sampleRate) {
    this.sampleRate = sampleRate;
  }

  /** Return true if this LogsExclusionFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsExclusionFilter logsExclusionFilter = (LogsExclusionFilter) o;
    return Objects.equals(this.query, logsExclusionFilter.query)
        && Objects.equals(this.sampleRate, logsExclusionFilter.sampleRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, sampleRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsExclusionFilter {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
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
