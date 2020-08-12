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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.SyntheticsCITest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object describing the synthetics tests to trigger.
 */
@ApiModel(description = "Object describing the synthetics tests to trigger.")
@JsonPropertyOrder({
  SyntheticsCITestBody.JSON_PROPERTY_TESTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsCITestBody {
  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<SyntheticsCITest> tests = null;


  public SyntheticsCITestBody tests(List<SyntheticsCITest> tests) {
    this.tests = tests;
    return this;
  }

  public SyntheticsCITestBody addTestsItem(SyntheticsCITest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * Individual synthetics test.
   * @return tests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Individual synthetics test.")
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsCITest> getTests() {
    return tests;
  }


  public void setTests(List<SyntheticsCITest> tests) {
    this.tests = tests;
  }


  /**
   * Return true if this SyntheticsCITestBody object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsCITestBody syntheticsCITestBody = (SyntheticsCITestBody) o;
    return Objects.equals(this.tests, syntheticsCITestBody.tests);
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

