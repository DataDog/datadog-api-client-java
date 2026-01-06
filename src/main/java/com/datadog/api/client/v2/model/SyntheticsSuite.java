/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Object containing details about a Synthetic suite. */
@JsonPropertyOrder({
  SyntheticsSuite.JSON_PROPERTY_MESSAGE,
  SyntheticsSuite.JSON_PROPERTY_NAME,
  SyntheticsSuite.JSON_PROPERTY_OPTIONS,
  SyntheticsSuite.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsSuite.JSON_PROPERTY_TAGS,
  SyntheticsSuite.JSON_PROPERTY_TESTS,
  SyntheticsSuite.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsSuite {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SyntheticsSuiteOptions options;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<SyntheticsSuiteTest> tests = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsSuiteType type = SyntheticsSuiteType.SUITE;

  public SyntheticsSuite() {}

  @JsonCreator
  public SyntheticsSuite(
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIONS) SyntheticsSuiteOptions options,
      @JsonProperty(required = true, value = JSON_PROPERTY_TESTS) List<SyntheticsSuiteTest> tests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SyntheticsSuiteType type) {
    this.message = message;
    this.name = name;
    this.options = options;
    this.unparsed |= options.unparsed;
    this.tests = tests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsSuite message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Notification message associated with the suite.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SyntheticsSuite name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the suite.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsSuite options(SyntheticsSuiteOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Object describing the extra options for a Synthetic suite.
   *
   * @return options
   */
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsSuiteOptions getOptions() {
    return options;
  }

  public void setOptions(SyntheticsSuiteOptions options) {
    this.options = options;
  }

  /**
   * The public ID for the test.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public SyntheticsSuite tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsSuite addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags attached to the suite.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SyntheticsSuite tests(List<SyntheticsSuiteTest> tests) {
    this.tests = tests;
    for (SyntheticsSuiteTest item : tests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsSuite addTestsItem(SyntheticsSuiteTest testsItem) {
    this.tests.add(testsItem);
    this.unparsed |= testsItem.unparsed;
    return this;
  }

  /**
   * Gettests
   *
   * @return tests
   */
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SyntheticsSuiteTest> getTests() {
    return tests;
  }

  public void setTests(List<SyntheticsSuiteTest> tests) {
    this.tests = tests;
  }

  public SyntheticsSuite type(SyntheticsSuiteType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Synthetic suite, <code>suite</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsSuiteType getType() {
    return type;
  }

  public void setType(SyntheticsSuiteType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SyntheticsSuite
   */
  @JsonAnySetter
  public SyntheticsSuite putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsSuite object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsSuite syntheticsSuite = (SyntheticsSuite) o;
    return Objects.equals(this.message, syntheticsSuite.message)
        && Objects.equals(this.name, syntheticsSuite.name)
        && Objects.equals(this.options, syntheticsSuite.options)
        && Objects.equals(this.publicId, syntheticsSuite.publicId)
        && Objects.equals(this.tags, syntheticsSuite.tags)
        && Objects.equals(this.tests, syntheticsSuite.tests)
        && Objects.equals(this.type, syntheticsSuite.type)
        && Objects.equals(this.additionalProperties, syntheticsSuite.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, name, options, publicId, tags, tests, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsSuite {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
