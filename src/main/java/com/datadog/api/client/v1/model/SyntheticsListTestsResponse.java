/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Object containing an array of Synthetic tests configuration. */
@JsonPropertyOrder({SyntheticsListTestsResponse.JSON_PROPERTY_TESTS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsListTestsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<SyntheticsTestDetails> tests = null;

  public SyntheticsListTestsResponse tests(List<SyntheticsTestDetails> tests) {
    this.tests = tests;
    for (SyntheticsTestDetails item : tests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsListTestsResponse addTestsItem(SyntheticsTestDetails testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    this.unparsed |= testsItem.unparsed;
    return this;
  }

  /**
   * Array of Synthetic tests configuration.
   *
   * @return tests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestDetails> getTests() {
    return tests;
  }

  public void setTests(List<SyntheticsTestDetails> tests) {
    this.tests = tests;
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
   * @return SyntheticsListTestsResponse
   */
  @JsonAnySetter
  public SyntheticsListTestsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsListTestsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsListTestsResponse syntheticsListTestsResponse = (SyntheticsListTestsResponse) o;
    return Objects.equals(this.tests, syntheticsListTestsResponse.tests)
        && Objects.equals(
            this.additionalProperties, syntheticsListTestsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tests, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsListTestsResponse {\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
