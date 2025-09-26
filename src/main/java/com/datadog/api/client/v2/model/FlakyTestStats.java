/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Test statistics for the flaky test. */
@JsonPropertyOrder({FlakyTestStats.JSON_PROPERTY_FAILURE_RATE_PCT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlakyTestStats {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAILURE_RATE_PCT = "failure_rate_pct";
  private JsonNullable<Double> failureRatePct = JsonNullable.<Double>undefined();

  public FlakyTestStats failureRatePct(Double failureRatePct) {
    this.failureRatePct = JsonNullable.<Double>of(failureRatePct);
    return this;
  }

  /**
   * The failure rate percentage of the test for the past 7 days. This is the number of failed test
   * runs divided by the total number of test runs (excluding skipped test runs).
   *
   * @return failureRatePct
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getFailureRatePct() {
    return failureRatePct.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAILURE_RATE_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getFailureRatePct_JsonNullable() {
    return failureRatePct;
  }

  @JsonProperty(JSON_PROPERTY_FAILURE_RATE_PCT)
  public void setFailureRatePct_JsonNullable(JsonNullable<Double> failureRatePct) {
    this.failureRatePct = failureRatePct;
  }

  public void setFailureRatePct(Double failureRatePct) {
    this.failureRatePct = JsonNullable.<Double>of(failureRatePct);
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
   * @return FlakyTestStats
   */
  @JsonAnySetter
  public FlakyTestStats putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FlakyTestStats object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlakyTestStats flakyTestStats = (FlakyTestStats) o;
    return Objects.equals(this.failureRatePct, flakyTestStats.failureRatePct)
        && Objects.equals(this.additionalProperties, flakyTestStats.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureRatePct, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlakyTestStats {\n");
    sb.append("    failureRatePct: ").append(toIndentedString(failureRatePct)).append("\n");
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
