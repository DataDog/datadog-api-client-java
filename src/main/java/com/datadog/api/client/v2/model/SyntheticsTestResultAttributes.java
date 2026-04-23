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

/** Attributes of a Synthetic test result. */
@JsonPropertyOrder({
  SyntheticsTestResultAttributes.JSON_PROPERTY_BATCH,
  SyntheticsTestResultAttributes.JSON_PROPERTY_CI,
  SyntheticsTestResultAttributes.JSON_PROPERTY_DEVICE,
  SyntheticsTestResultAttributes.JSON_PROPERTY_GIT,
  SyntheticsTestResultAttributes.JSON_PROPERTY_LOCATION,
  SyntheticsTestResultAttributes.JSON_PROPERTY_RESULT,
  SyntheticsTestResultAttributes.JSON_PROPERTY_TEST_SUB_TYPE,
  SyntheticsTestResultAttributes.JSON_PROPERTY_TEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BATCH = "batch";
  private SyntheticsTestResultBatch batch;

  public static final String JSON_PROPERTY_CI = "ci";
  private SyntheticsTestResultCI ci;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private SyntheticsTestResultDevice device;

  public static final String JSON_PROPERTY_GIT = "git";
  private SyntheticsTestResultGit git;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private SyntheticsTestResultLocation location;

  public static final String JSON_PROPERTY_RESULT = "result";
  private SyntheticsTestResultDetail result;

  public static final String JSON_PROPERTY_TEST_SUB_TYPE = "test_sub_type";
  private SyntheticsTestSubType testSubType;

  public static final String JSON_PROPERTY_TEST_TYPE = "test_type";
  private SyntheticsTestType testType;

  public SyntheticsTestResultAttributes batch(SyntheticsTestResultBatch batch) {
    this.batch = batch;
    this.unparsed |= batch.unparsed;
    return this;
  }

  /**
   * Batch information for the test result.
   *
   * @return batch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultBatch getBatch() {
    return batch;
  }

  public void setBatch(SyntheticsTestResultBatch batch) {
    this.batch = batch;
  }

  public SyntheticsTestResultAttributes ci(SyntheticsTestResultCI ci) {
    this.ci = ci;
    this.unparsed |= ci.unparsed;
    return this;
  }

  /**
   * CI information associated with the test result.
   *
   * @return ci
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultCI getCi() {
    return ci;
  }

  public void setCi(SyntheticsTestResultCI ci) {
    this.ci = ci;
  }

  public SyntheticsTestResultAttributes device(SyntheticsTestResultDevice device) {
    this.device = device;
    this.unparsed |= device.unparsed;
    return this;
  }

  /**
   * Device information for the test result (browser and mobile tests).
   *
   * @return device
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultDevice getDevice() {
    return device;
  }

  public void setDevice(SyntheticsTestResultDevice device) {
    this.device = device;
  }

  public SyntheticsTestResultAttributes git(SyntheticsTestResultGit git) {
    this.git = git;
    this.unparsed |= git.unparsed;
    return this;
  }

  /**
   * Git information associated with the test result.
   *
   * @return git
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultGit getGit() {
    return git;
  }

  public void setGit(SyntheticsTestResultGit git) {
    this.git = git;
  }

  public SyntheticsTestResultAttributes location(SyntheticsTestResultLocation location) {
    this.location = location;
    this.unparsed |= location.unparsed;
    return this;
  }

  /**
   * Location information for a Synthetic test result.
   *
   * @return location
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultLocation getLocation() {
    return location;
  }

  public void setLocation(SyntheticsTestResultLocation location) {
    this.location = location;
  }

  public SyntheticsTestResultAttributes result(SyntheticsTestResultDetail result) {
    this.result = result;
    this.unparsed |= result.unparsed;
    return this;
  }

  /**
   * Full result details for a Synthetic test execution.
   *
   * @return result
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultDetail getResult() {
    return result;
  }

  public void setResult(SyntheticsTestResultDetail result) {
    this.result = result;
  }

  public SyntheticsTestResultAttributes testSubType(SyntheticsTestSubType testSubType) {
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
  public SyntheticsTestSubType getTestSubType() {
    return testSubType;
  }

  public void setTestSubType(SyntheticsTestSubType testSubType) {
    if (!testSubType.isValid()) {
      this.unparsed = true;
    }
    this.testSubType = testSubType;
  }

  public SyntheticsTestResultAttributes testType(SyntheticsTestType testType) {
    this.testType = testType;
    this.unparsed |= !testType.isValid();
    return this;
  }

  /**
   * Type of the Synthetic test that produced this result.
   *
   * @return testType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestType getTestType() {
    return testType;
  }

  public void setTestType(SyntheticsTestType testType) {
    if (!testType.isValid()) {
      this.unparsed = true;
    }
    this.testType = testType;
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
   * @return SyntheticsTestResultAttributes
   */
  @JsonAnySetter
  public SyntheticsTestResultAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultAttributes syntheticsTestResultAttributes =
        (SyntheticsTestResultAttributes) o;
    return Objects.equals(this.batch, syntheticsTestResultAttributes.batch)
        && Objects.equals(this.ci, syntheticsTestResultAttributes.ci)
        && Objects.equals(this.device, syntheticsTestResultAttributes.device)
        && Objects.equals(this.git, syntheticsTestResultAttributes.git)
        && Objects.equals(this.location, syntheticsTestResultAttributes.location)
        && Objects.equals(this.result, syntheticsTestResultAttributes.result)
        && Objects.equals(this.testSubType, syntheticsTestResultAttributes.testSubType)
        && Objects.equals(this.testType, syntheticsTestResultAttributes.testType)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        batch, ci, device, git, location, result, testSubType, testType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultAttributes {\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    ci: ").append(toIndentedString(ci)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    testSubType: ").append(toIndentedString(testSubType)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
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
