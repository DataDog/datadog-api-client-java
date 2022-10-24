/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Bucket values. */
@JsonPropertyOrder({
  CIAppPipelinesBucketResponse.JSON_PROPERTY_BY,
  CIAppPipelinesBucketResponse.JSON_PROPERTY_COMPUTES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelinesBucketResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BY = "by";
  private Map<String, String> by = null;

  public static final String JSON_PROPERTY_COMPUTES = "computes";
  private Map<String, CIAppAggregateBucketValue> computes = null;

  public CIAppPipelinesBucketResponse by(Map<String, String> by) {
    this.by = by;
    return this;
  }

  public CIAppPipelinesBucketResponse putByItem(String key, String byItem) {
    if (this.by == null) {
      this.by = new HashMap<>();
    }
    this.by.put(key, byItem);
    return this;
  }

  /**
   * The key-value pairs for each group-by.
   *
   * @return by
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getBy() {
    return by;
  }

  public void setBy(Map<String, String> by) {
    this.by = by;
  }

  public CIAppPipelinesBucketResponse computes(Map<String, CIAppAggregateBucketValue> computes) {
    this.computes = computes;
    return this;
  }

  public CIAppPipelinesBucketResponse putComputesItem(
      String key, CIAppAggregateBucketValue computesItem) {
    if (this.computes == null) {
      this.computes = new HashMap<>();
    }
    this.computes.put(key, computesItem);
    return this;
  }

  /**
   * A map of the metric name to value for regular compute, or a list of values for a timeseries.
   *
   * @return computes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, CIAppAggregateBucketValue> getComputes() {
    return computes;
  }

  public void setComputes(Map<String, CIAppAggregateBucketValue> computes) {
    this.computes = computes;
  }

  /** Return true if this CIAppPipelinesBucketResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelinesBucketResponse ciAppPipelinesBucketResponse = (CIAppPipelinesBucketResponse) o;
    return Objects.equals(this.by, ciAppPipelinesBucketResponse.by)
        && Objects.equals(this.computes, ciAppPipelinesBucketResponse.computes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, computes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelinesBucketResponse {\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    computes: ").append(toIndentedString(computes)).append("\n");
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
