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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object describing the synthetics tests to trigger. */
@JsonPropertyOrder({SyntheticsCITestBody.JSON_PROPERTY_TESTS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsCITestBody {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<SyntheticsCITest> tests = null;

  public SyntheticsCITestBody tests(List<SyntheticsCITest> tests) {
    this.tests = tests;
    for (SyntheticsCITest item : tests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsCITestBody addTestsItem(SyntheticsCITest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    this.unparsed |= testsItem.unparsed;
    return this;
  }

  /**
   * Individual synthetics test.
   *
   * @return tests
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsCITest> getTests() {
    return tests;
  }

  public void setTests(List<SyntheticsCITest> tests) {
    this.tests = tests;
  }

  /** Return true if this SyntheticsCITestBody object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsCITestBody syntheticsCiTestBody = (SyntheticsCITestBody) o;
    return Objects.equals(this.tests, syntheticsCiTestBody.tests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsCITestBody {\n");
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
