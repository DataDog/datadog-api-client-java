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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Information about a single test run. */
@JsonPropertyOrder({
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_DEVICE,
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_LOCATION,
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_RESULT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTriggerCITestRunResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEVICE = "device";
  private String device;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private Long location;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RESULT_ID = "result_id";
  private String resultId;

  public SyntheticsTriggerCITestRunResult device(String device) {
    this.device = device;
    return this;
  }

  /**
   * The device ID.
   *
   * @return device
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
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
  @jakarta.annotation.Nullable
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
   * The public ID of the Synthetic test.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
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
   * @return SyntheticsTriggerCITestRunResult
   */
  @JsonAnySetter
  public SyntheticsTriggerCITestRunResult putAdditionalProperty(String key, Object value) {
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
        && Objects.equals(this.resultId, syntheticsTriggerCiTestRunResult.resultId)
        && Objects.equals(
            this.additionalProperties, syntheticsTriggerCiTestRunResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, location, publicId, resultId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTriggerCITestRunResult {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
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
