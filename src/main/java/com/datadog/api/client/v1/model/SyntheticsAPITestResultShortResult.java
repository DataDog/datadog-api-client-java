/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Result of the last API test run.</p>
 */
@JsonPropertyOrder({
  SyntheticsAPITestResultShortResult.JSON_PROPERTY_PASSED,
  SyntheticsAPITestResultShortResult.JSON_PROPERTY_TIMINGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPITestResultShortResult {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PASSED = "passed";
  private Boolean passed;

  public static final String JSON_PROPERTY_TIMINGS = "timings";
  private SyntheticsTiming timings;

  public SyntheticsAPITestResultShortResult passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  /**
   * <p>Describes if the test run has passed or failed.</p>
   * @return passed
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PASSED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getPassed() {
        return passed;
      }
  public void setPassed(Boolean passed) {
    this.passed = passed;
  }
  public SyntheticsAPITestResultShortResult timings(SyntheticsTiming timings) {
    this.timings = timings;
    this.unparsed |= timings.unparsed;
    return this;
  }

  /**
   * <p>Object containing all metrics and their values collected for a Synthetic API test.
   * See the <a href="https://docs.datadoghq.com/synthetics/metrics/">Synthetic Monitoring Metrics documentation</a>.</p>
   * @return timings
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMINGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTiming getTimings() {
        return timings;
      }
  public void setTimings(SyntheticsTiming timings) {
    this.timings = timings;
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
   * @return SyntheticsAPITestResultShortResult
   */
  @JsonAnySetter
  public SyntheticsAPITestResultShortResult putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsAPITestResultShortResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestResultShortResult syntheticsApiTestResultShortResult = (SyntheticsAPITestResultShortResult) o;
    return Objects.equals(this.passed, syntheticsApiTestResultShortResult.passed) && Objects.equals(this.timings, syntheticsApiTestResultShortResult.timings) && Objects.equals(this.additionalProperties, syntheticsApiTestResultShortResult.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(passed,timings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestResultShortResult {\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
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
