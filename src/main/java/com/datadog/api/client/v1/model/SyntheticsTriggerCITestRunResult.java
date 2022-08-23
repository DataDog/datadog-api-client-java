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
   * <p>Information about a single test run.</p>
 */
@JsonPropertyOrder({
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_DEVICE,
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_LOCATION,
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsTriggerCITestRunResult.JSON_PROPERTY_RESULT_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTriggerCITestRunResult {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>The device ID.</p>
   * @return device
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The location ID of the test run.</p>
   * @return location
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOCATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The public ID of the Synthetics test.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>ID of the result.</p>
   * @return resultId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESULT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getResultId() {
        return resultId;
      }
  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  /**
   * Return true if this SyntheticsTriggerCITestRunResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTriggerCITestRunResult syntheticsTriggerCiTestRunResult = (SyntheticsTriggerCITestRunResult) o;
    return Objects.equals(this.device, syntheticsTriggerCiTestRunResult.device) && Objects.equals(this.location, syntheticsTriggerCiTestRunResult.location) && Objects.equals(this.publicId, syntheticsTriggerCiTestRunResult.publicId) && Objects.equals(this.resultId, syntheticsTriggerCiTestRunResult.resultId);
  }


  @Override
  public int hashCode() {
    return Objects.hash(device,location,publicId,resultId);
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
