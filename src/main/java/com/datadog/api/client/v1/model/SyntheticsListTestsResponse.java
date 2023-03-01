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
   * <p>Object containing an array of Synthetic tests configuration.</p>
 */
@JsonPropertyOrder({
  SyntheticsListTestsResponse.JSON_PROPERTY_TESTS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsListTestsResponse {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>Array of Synthetic tests configuration.</p>
   * @return tests
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TESTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsTestDetails> getTests() {
        return tests;
      }
  public void setTests(List<SyntheticsTestDetails> tests) {
    this.tests = tests;
  }

  /**
   * Return true if this SyntheticsListTestsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsListTestsResponse syntheticsListTestsResponse = (SyntheticsListTestsResponse) o;
    return Objects.equals(this.tests, syntheticsListTestsResponse.tests);
  }


  @Override
  public int hashCode() {
    return Objects.hash(tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsListTestsResponse {\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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
