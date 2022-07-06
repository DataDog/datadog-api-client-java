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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object describing the synthetics tests to trigger. */
@JsonPropertyOrder({SyntheticsTriggerBody.JSON_PROPERTY_TESTS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTriggerBody {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<SyntheticsTriggerTest> tests = new ArrayList<>();

  public SyntheticsTriggerBody() {}

  @JsonCreator
  public SyntheticsTriggerBody(
      @JsonProperty(required = true, value = JSON_PROPERTY_TESTS)
          List<SyntheticsTriggerTest> tests) {
    this.tests = tests;
  }

  public SyntheticsTriggerBody tests(List<SyntheticsTriggerTest> tests) {
    this.tests = tests;
    for (SyntheticsTriggerTest item : tests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTriggerBody addTestsItem(SyntheticsTriggerTest testsItem) {
    this.tests.add(testsItem);
    this.unparsed |= testsItem.unparsed;
    return this;
  }

  /**
   * Individual synthetics test.
   *
   * @return tests
   */
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SyntheticsTriggerTest> getTests() {
    return tests;
  }

  public void setTests(List<SyntheticsTriggerTest> tests) {
    this.tests = tests;
  }

  /** Return true if this SyntheticsTriggerBody object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTriggerBody syntheticsTriggerBody = (SyntheticsTriggerBody) o;
    return Objects.equals(this.tests, syntheticsTriggerBody.tests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTriggerBody {\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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
