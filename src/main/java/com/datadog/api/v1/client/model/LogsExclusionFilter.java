/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Exclusion filter is defined by a query, a sampling rule, and a active/inactive toggle.
 */
@ApiModel(description = "Exclusion filter is defined by a query, a sampling rule, and a active/inactive toggle.")
@JsonPropertyOrder({
  LogsExclusionFilter.JSON_PROPERTY_QUERY,
  LogsExclusionFilter.JSON_PROPERTY_SAMPLE_RATE
})

public class LogsExclusionFilter {
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SAMPLE_RATE = "sample_rate";
  private Double sampleRate;


  public LogsExclusionFilter query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Default query is &#x60;*&#x60;, meaning all logs flowing in the index would be excluded. Scope down exclusion filter to only a subset of logs with a log query.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "*", value = "Default query is `*`, meaning all logs flowing in the index would be excluded. Scope down exclusion filter to only a subset of logs with a log query.")
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
   * Sample rate to apply to logs going through this exclusion filter, a value of 1 will exclude all logs matching the query.
   * @return sampleRate
  **/
  @ApiModelProperty(example = "1", required = true, value = "Sample rate to apply to logs going through this exclusion filter, a value of 1 will exclude all logs matching the query.")
  @JsonProperty(JSON_PROPERTY_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getSampleRate() {
    return sampleRate;
  }


  public void setSampleRate(Double sampleRate) {
    this.sampleRate = sampleRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsExclusionFilter logsExclusionFilter = (LogsExclusionFilter) o;
    return Objects.equals(this.query, logsExclusionFilter.query) &&
        Objects.equals(this.sampleRate, logsExclusionFilter.sampleRate);
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

