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

/** Response object for deleting Synthetic tests. */
@JsonPropertyOrder({SyntheticsDeleteTestsResponse.JSON_PROPERTY_DELETED_TESTS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsDeleteTestsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELETED_TESTS = "deleted_tests";
  private List<SyntheticsDeletedTest> deletedTests = null;

  public SyntheticsDeleteTestsResponse deletedTests(List<SyntheticsDeletedTest> deletedTests) {
    this.deletedTests = deletedTests;
    for (SyntheticsDeletedTest item : deletedTests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsDeleteTestsResponse addDeletedTestsItem(SyntheticsDeletedTest deletedTestsItem) {
    if (this.deletedTests == null) {
      this.deletedTests = new ArrayList<>();
    }
    this.deletedTests.add(deletedTestsItem);
    this.unparsed |= deletedTestsItem.unparsed;
    return this;
  }

  /**
   * Array of objects containing a deleted Synthetic test ID with the associated deletion timestamp.
   *
   * @return deletedTests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsDeletedTest> getDeletedTests() {
    return deletedTests;
  }

  public void setDeletedTests(List<SyntheticsDeletedTest> deletedTests) {
    this.deletedTests = deletedTests;
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
   * @return SyntheticsDeleteTestsResponse
   */
  @JsonAnySetter
  public SyntheticsDeleteTestsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsDeleteTestsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDeleteTestsResponse syntheticsDeleteTestsResponse = (SyntheticsDeleteTestsResponse) o;
    return Objects.equals(this.deletedTests, syntheticsDeleteTestsResponse.deletedTests)
        && Objects.equals(
            this.additionalProperties, syntheticsDeleteTestsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedTests, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDeleteTestsResponse {\n");
    sb.append("    deletedTests: ").append(toIndentedString(deletedTests)).append("\n");
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
