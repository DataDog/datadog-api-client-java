/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Result of the last API test run. */
@JsonPropertyOrder({
  SyntheticsAPITestResultShortResult.JSON_PROPERTY_PASSED,
  SyntheticsAPITestResultShortResult.JSON_PROPERTY_TIMINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPITestResultShortResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PASSED = "passed";
  private Boolean passed;

  public static final String JSON_PROPERTY_TIMINGS = "timings";
  private SyntheticsTiming timings;

  public SyntheticsAPITestResultShortResult passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  /**
   * Describes if the test run has passed or failed.
   *
   * @return passed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Object containing all metrics and their values collected for a Synthetic API test. See the <a
   * href="https://docs.datadoghq.com/synthetics/metrics/">Synthetic Monitoring Metrics
   * documentation</a>.
   *
   * @return timings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTiming getTimings() {
    return timings;
  }

  public void setTimings(SyntheticsTiming timings) {
    this.timings = timings;
  }

  /** Return true if this SyntheticsAPITestResultShortResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestResultShortResult syntheticsApiTestResultShortResult =
        (SyntheticsAPITestResultShortResult) o;
    return Objects.equals(this.passed, syntheticsApiTestResultShortResult.passed)
        && Objects.equals(this.timings, syntheticsApiTestResultShortResult.timings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passed, timings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestResultShortResult {\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
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
