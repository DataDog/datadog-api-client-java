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

/** Attributes for creating a test suite for a DEM journey. */
@JsonPropertyOrder({
  DemCreateJourneyTestSuiteAttributes.JSON_PROPERTY_INCLUDE_TESTS_FROM_JOURNEY_COVERAGE,
  DemCreateJourneyTestSuiteAttributes.JSON_PROPERTY_TEST_SUITE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DemCreateJourneyTestSuiteAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_TESTS_FROM_JOURNEY_COVERAGE =
      "include_tests_from_journey_coverage";
  private JsonNullable<Boolean> includeTestsFromJourneyCoverage = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TEST_SUITE_NAME = "test_suite_name";
  private JsonNullable<String> testSuiteName = JsonNullable.<String>undefined();

  public DemCreateJourneyTestSuiteAttributes includeTestsFromJourneyCoverage(
      Boolean includeTestsFromJourneyCoverage) {
    this.includeTestsFromJourneyCoverage =
        JsonNullable.<Boolean>of(includeTestsFromJourneyCoverage);
    return this;
  }

  /**
   * Whether to populate the test suite based on journey coverage data.
   *
   * @return includeTestsFromJourneyCoverage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIncludeTestsFromJourneyCoverage() {
    return includeTestsFromJourneyCoverage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCLUDE_TESTS_FROM_JOURNEY_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIncludeTestsFromJourneyCoverage_JsonNullable() {
    return includeTestsFromJourneyCoverage;
  }

  @JsonProperty(JSON_PROPERTY_INCLUDE_TESTS_FROM_JOURNEY_COVERAGE)
  public void setIncludeTestsFromJourneyCoverage_JsonNullable(
      JsonNullable<Boolean> includeTestsFromJourneyCoverage) {
    this.includeTestsFromJourneyCoverage = includeTestsFromJourneyCoverage;
  }

  public void setIncludeTestsFromJourneyCoverage(Boolean includeTestsFromJourneyCoverage) {
    this.includeTestsFromJourneyCoverage =
        JsonNullable.<Boolean>of(includeTestsFromJourneyCoverage);
  }

  public DemCreateJourneyTestSuiteAttributes testSuiteName(String testSuiteName) {
    this.testSuiteName = JsonNullable.<String>of(testSuiteName);
    return this;
  }

  /**
   * An optional custom name for the auto-created test suite.
   *
   * @return testSuiteName
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTestSuiteName() {
    return testSuiteName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_SUITE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTestSuiteName_JsonNullable() {
    return testSuiteName;
  }

  @JsonProperty(JSON_PROPERTY_TEST_SUITE_NAME)
  public void setTestSuiteName_JsonNullable(JsonNullable<String> testSuiteName) {
    this.testSuiteName = testSuiteName;
  }

  public void setTestSuiteName(String testSuiteName) {
    this.testSuiteName = JsonNullable.<String>of(testSuiteName);
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
   * @return DemCreateJourneyTestSuiteAttributes
   */
  @JsonAnySetter
  public DemCreateJourneyTestSuiteAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DemCreateJourneyTestSuiteAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemCreateJourneyTestSuiteAttributes demCreateJourneyTestSuiteAttributes =
        (DemCreateJourneyTestSuiteAttributes) o;
    return Objects.equals(
            this.includeTestsFromJourneyCoverage,
            demCreateJourneyTestSuiteAttributes.includeTestsFromJourneyCoverage)
        && Objects.equals(this.testSuiteName, demCreateJourneyTestSuiteAttributes.testSuiteName)
        && Objects.equals(
            this.additionalProperties, demCreateJourneyTestSuiteAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeTestsFromJourneyCoverage, testSuiteName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemCreateJourneyTestSuiteAttributes {\n");
    sb.append("    includeTestsFromJourneyCoverage: ")
        .append(toIndentedString(includeTestsFromJourneyCoverage))
        .append("\n");
    sb.append("    testSuiteName: ").append(toIndentedString(testSuiteName)).append("\n");
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
