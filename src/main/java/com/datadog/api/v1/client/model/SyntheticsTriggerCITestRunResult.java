/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Information about a single test run. */
@JsonPropertyOrder({
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_DEVICE,
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_LOCATION,
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_RESULT_ID
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTriggerCITestRunResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEVICE = "device";
  private SyntheticsDeviceID device;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private Long location;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RESULT_ID = "result_id";
  private String resultId;

  public SyntheticsTriggerCITestRunResult device(SyntheticsDeviceID device) {
    this.device = device;
    this.unparsed |= !device.isValid();
    return this;
  }

  /**
   * The device ID.
   *
   * @return device
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsDeviceID getDevice() {
    return device;
  }

  public void setDevice(SyntheticsDeviceID device) {
    if (!device.isValid()) {
      this.unparsed = true;
    }
    this.device = device;
  }

  public SyntheticsTriggerCITestRunResult location(Long location) {
    this.location = location;
    return this;
  }

  /**
   * The location ID of the test run.
   *
   * @return location
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLocation() {
    return location;
  }

  public void setLocation(Long location) {
    this.location = location;
  }

  public SyntheticsTriggerCITestRunResult publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The public ID of the Synthetics test.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public SyntheticsTriggerCITestRunResult resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * ID of the result.
   *
   * @return resultId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  /** Return true if this SyntheticsTriggerCITestRunResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTriggerCITestRunResult syntheticsTriggerCiTestRunResult =
        (SyntheticsTriggerCITestRunResult) o;
    return Objects.equals(this.device, syntheticsTriggerCiTestRunResult.device)
        && Objects.equals(this.location, syntheticsTriggerCiTestRunResult.location)
        && Objects.equals(this.publicId, syntheticsTriggerCiTestRunResult.publicId)
        && Objects.equals(this.resultId, syntheticsTriggerCiTestRunResult.resultId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, location, publicId, resultId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTriggerCITestRunResult {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
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
