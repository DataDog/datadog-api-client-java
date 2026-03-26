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

/** Attributes of the fast test result. */
@JsonPropertyOrder({
  SyntheticsFastTestResultAttributes.JSON_PROPERTY_DEVICE,
  SyntheticsFastTestResultAttributes.JSON_PROPERTY_LOCATION,
  SyntheticsFastTestResultAttributes.JSON_PROPERTY_RESULT,
  SyntheticsFastTestResultAttributes.JSON_PROPERTY_TEST_SUB_TYPE,
  SyntheticsFastTestResultAttributes.JSON_PROPERTY_TEST_TYPE,
  SyntheticsFastTestResultAttributes.JSON_PROPERTY_TEST_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsFastTestResultAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEVICE = "device";
  private SyntheticsFastTestResultDevice device;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private SyntheticsFastTestResultLocation location;

  public static final String JSON_PROPERTY_RESULT = "result";
  private SyntheticsFastTestResultDetail result;

  public static final String JSON_PROPERTY_TEST_SUB_TYPE = "test_sub_type";
  private SyntheticsFastTestSubType testSubType;

  public static final String JSON_PROPERTY_TEST_TYPE = "test_type";
  private String testType;

  public static final String JSON_PROPERTY_TEST_VERSION = "test_version";
  private Long testVersion;

  public SyntheticsFastTestResultAttributes device(SyntheticsFastTestResultDevice device) {
    this.device = device;
    this.unparsed |= device.unparsed;
    return this;
  }

  /**
   * Device information for browser-based fast tests.
   *
   * @return device
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsFastTestResultDevice getDevice() {
    return device;
  }

  public void setDevice(SyntheticsFastTestResultDevice device) {
    this.device = device;
  }

  public SyntheticsFastTestResultAttributes location(SyntheticsFastTestResultLocation location) {
    this.location = location;
    this.unparsed |= location.unparsed;
    return this;
  }

  /**
   * Location from which the fast test was executed.
   *
   * @return location
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsFastTestResultLocation getLocation() {
    return location;
  }

  public void setLocation(SyntheticsFastTestResultLocation location) {
    this.location = location;
  }

  public SyntheticsFastTestResultAttributes result(SyntheticsFastTestResultDetail result) {
    this.result = result;
    this.unparsed |= result.unparsed;
    return this;
  }

  /**
   * Detailed result data for the fast test run. The exact shape of nested fields (<code>request
   * </code>, <code>response</code>, <code>assertions</code>, etc.) depends on the test subtype.
   *
   * @return result
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsFastTestResultDetail getResult() {
    return result;
  }

  public void setResult(SyntheticsFastTestResultDetail result) {
    this.result = result;
  }

  public SyntheticsFastTestResultAttributes testSubType(SyntheticsFastTestSubType testSubType) {
    this.testSubType = testSubType;
    this.unparsed |= !testSubType.isValid();
    return this;
  }

  /**
   * Subtype of the Synthetic test that produced this result.
   *
   * @return testSubType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsFastTestSubType getTestSubType() {
    return testSubType;
  }

  public void setTestSubType(SyntheticsFastTestSubType testSubType) {
    if (!testSubType.isValid()) {
      this.unparsed = true;
    }
    this.testSubType = testSubType;
  }

  public SyntheticsFastTestResultAttributes testType(String testType) {
    this.testType = testType;
    return this;
  }

  /**
   * The type of the Synthetic test that produced this result (for example, <code>api</code> or
   * <code>browser</code>).
   *
   * @return testType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTestType() {
    return testType;
  }

  public void setTestType(String testType) {
    this.testType = testType;
  }

  public SyntheticsFastTestResultAttributes testVersion(Long testVersion) {
    this.testVersion = testVersion;
    return this;
  }

  /**
   * Version of the test at the time the fast test was triggered.
   *
   * @return testVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTestVersion() {
    return testVersion;
  }

  public void setTestVersion(Long testVersion) {
    this.testVersion = testVersion;
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
   * @return SyntheticsFastTestResultAttributes
   */
  @JsonAnySetter
  public SyntheticsFastTestResultAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsFastTestResultAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsFastTestResultAttributes syntheticsFastTestResultAttributes =
        (SyntheticsFastTestResultAttributes) o;
    return Objects.equals(this.device, syntheticsFastTestResultAttributes.device)
        && Objects.equals(this.location, syntheticsFastTestResultAttributes.location)
        && Objects.equals(this.result, syntheticsFastTestResultAttributes.result)
        && Objects.equals(this.testSubType, syntheticsFastTestResultAttributes.testSubType)
        && Objects.equals(this.testType, syntheticsFastTestResultAttributes.testType)
        && Objects.equals(this.testVersion, syntheticsFastTestResultAttributes.testVersion)
        && Objects.equals(
            this.additionalProperties, syntheticsFastTestResultAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        device, location, result, testSubType, testType, testVersion, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsFastTestResultAttributes {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    testSubType: ").append(toIndentedString(testSubType)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    testVersion: ").append(toIndentedString(testVersion)).append("\n");
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
