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
   * <p>CI pipeline related statistics for the flaky test. This information is only available if test runs are associated with CI pipeline events from CI Visibility.</p>
 */
@JsonPropertyOrder({
  FlakyTestPipelineStats.JSON_PROPERTY_FAILED_PIPELINES,
  FlakyTestPipelineStats.JSON_PROPERTY_TOTAL_LOST_TIME_MS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlakyTestPipelineStats {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAILED_PIPELINES = "failed_pipelines";
  private JsonNullable<Long> failedPipelines = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TOTAL_LOST_TIME_MS = "total_lost_time_ms";
  private JsonNullable<Long> totalLostTimeMs = JsonNullable.<Long>undefined();

  public FlakyTestPipelineStats failedPipelines(Long failedPipelines) {
    this.failedPipelines = JsonNullable.<Long>of(failedPipelines);
    return this;
  }

  /**
   * <p>The number of pipelines that failed due to this test for the past 7 days. This is computed as the sum of failed CI pipeline events associated with test runs where the flaky test failed.</p>
   * @return failedPipelines
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getFailedPipelines() {
        return failedPipelines.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_FAILED_PIPELINES)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getFailedPipelines_JsonNullable() {
    return failedPipelines;
  }
  @JsonProperty(JSON_PROPERTY_FAILED_PIPELINES)public void setFailedPipelines_JsonNullable(JsonNullable<Long> failedPipelines) {
    this.failedPipelines = failedPipelines;
  }
  public void setFailedPipelines(Long failedPipelines) {
    this.failedPipelines = JsonNullable.<Long>of(failedPipelines);
  }
  public FlakyTestPipelineStats totalLostTimeMs(Long totalLostTimeMs) {
    this.totalLostTimeMs = JsonNullable.<Long>of(totalLostTimeMs);
    return this;
  }

  /**
   * <p>The total time lost by CI pipelines due to this flaky test in milliseconds. This is computed as the sum of the duration of failed CI pipeline events associated with test runs where the flaky test failed.</p>
   * @return totalLostTimeMs
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getTotalLostTimeMs() {
        return totalLostTimeMs.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TOTAL_LOST_TIME_MS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getTotalLostTimeMs_JsonNullable() {
    return totalLostTimeMs;
  }
  @JsonProperty(JSON_PROPERTY_TOTAL_LOST_TIME_MS)public void setTotalLostTimeMs_JsonNullable(JsonNullable<Long> totalLostTimeMs) {
    this.totalLostTimeMs = totalLostTimeMs;
  }
  public void setTotalLostTimeMs(Long totalLostTimeMs) {
    this.totalLostTimeMs = JsonNullable.<Long>of(totalLostTimeMs);
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
   * @return FlakyTestPipelineStats
   */
  @JsonAnySetter
  public FlakyTestPipelineStats putAdditionalProperty(String key, Object value) {
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
   * Return true if this FlakyTestPipelineStats object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlakyTestPipelineStats flakyTestPipelineStats = (FlakyTestPipelineStats) o;
    return Objects.equals(this.failedPipelines, flakyTestPipelineStats.failedPipelines) && Objects.equals(this.totalLostTimeMs, flakyTestPipelineStats.totalLostTimeMs) && Objects.equals(this.additionalProperties, flakyTestPipelineStats.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(failedPipelines,totalLostTimeMs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlakyTestPipelineStats {\n");
    sb.append("    failedPipelines: ").append(toIndentedString(failedPipelines)).append("\n");
    sb.append("    totalLostTimeMs: ").append(toIndentedString(totalLostTimeMs)).append("\n");
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
