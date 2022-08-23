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
   * <p>A bucket values</p>
 */
@JsonPropertyOrder({
  LogsAggregateBucket.JSON_PROPERTY_BY,
  LogsAggregateBucket.JSON_PROPERTY_COMPUTES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsAggregateBucket {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BY = "by";
  private Map<String, String> by = null;

  public static final String JSON_PROPERTY_COMPUTES = "computes";
  private Map<String, LogsAggregateBucketValue> computes = null;

  public LogsAggregateBucket by(Map<String, String> by) {
    this.by = by;
    return this;
  }
  public LogsAggregateBucket putByItem(String key, String byItem) {
    if (this.by == null) {
      this.by = new HashMap<>();
    }
    this.by.put(key, byItem);
    return this;
  }

  /**
   * <p>The key, value pairs for each group by</p>
   * @return by
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getBy() {
        return by;
      }
  public void setBy(Map<String, String> by) {
    this.by = by;
  }
  public LogsAggregateBucket computes(Map<String, LogsAggregateBucketValue> computes) {
    this.computes = computes;
    return this;
  }
  public LogsAggregateBucket putComputesItem(String key, LogsAggregateBucketValue computesItem) {
    if (this.computes == null) {
      this.computes = new HashMap<>();
    }
    this.computes.put(key, computesItem);
    return this;
  }

  /**
   * <p>A map of the metric name -&gt; value for regular compute or list of values for a timeseries</p>
   * @return computes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, LogsAggregateBucketValue> getComputes() {
        return computes;
      }
  public void setComputes(Map<String, LogsAggregateBucketValue> computes) {
    this.computes = computes;
  }

  /**
   * Return true if this LogsAggregateBucket object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsAggregateBucket logsAggregateBucket = (LogsAggregateBucket) o;
    return Objects.equals(this.by, logsAggregateBucket.by) && Objects.equals(this.computes, logsAggregateBucket.computes);
  }


  @Override
  public int hashCode() {
    return Objects.hash(by,computes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsAggregateBucket {\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    computes: ").append(toIndentedString(computes)).append("\n");
    sb.append("}");
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
