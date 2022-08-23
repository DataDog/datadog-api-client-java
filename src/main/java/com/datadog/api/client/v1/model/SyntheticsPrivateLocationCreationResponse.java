/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Object that contains the new private location, the public key for result encryption, and the
 * configuration skeleton.
 */
@JsonPropertyOrder({
  SyntheticsPrivateLocationCreationResponse.JSON_PROPERTY_CONFIG,
  SyntheticsPrivateLocationCreationResponse.JSON_PROPERTY_PRIVATE_LOCATION,
  SyntheticsPrivateLocationCreationResponse.JSON_PROPERTY_RESULT_ENCRYPTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsPrivateLocationCreationResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private Object config;

  public static final String JSON_PROPERTY_PRIVATE_LOCATION = "private_location";
  private SyntheticsPrivateLocation privateLocation;

  public static final String JSON_PROPERTY_RESULT_ENCRYPTION = "result_encryption";
  private SyntheticsPrivateLocationCreationResponseResultEncryption resultEncryption;

  public SyntheticsPrivateLocationCreationResponse config(Object config) {
    this.config = config;
    return this;
  }

  /**
   * Configuration skeleton for the private location. See installation instructions of the private
   * location on how to use this configuration.
   *
   * @return config
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public SyntheticsPrivateLocationCreationResponse privateLocation(
      SyntheticsPrivateLocation privateLocation) {
    this.privateLocation = privateLocation;
    this.unparsed |= privateLocation.unparsed;
    return this;
  }

  /**
   * Object containing information about the private location to create.
   *
   * @return privateLocation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsPrivateLocation getPrivateLocation() {
    return privateLocation;
  }

  public void setPrivateLocation(SyntheticsPrivateLocation privateLocation) {
    this.privateLocation = privateLocation;
  }

  public SyntheticsPrivateLocationCreationResponse resultEncryption(
      SyntheticsPrivateLocationCreationResponseResultEncryption resultEncryption) {
    this.resultEncryption = resultEncryption;
    this.unparsed |= resultEncryption.unparsed;
    return this;
  }

  /**
   * Public key for the result encryption.
   *
   * @return resultEncryption
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_ENCRYPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsPrivateLocationCreationResponseResultEncryption getResultEncryption() {
    return resultEncryption;
  }

  public void setResultEncryption(
      SyntheticsPrivateLocationCreationResponseResultEncryption resultEncryption) {
    this.resultEncryption = resultEncryption;
  }

  /** Return true if this SyntheticsPrivateLocationCreationResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsPrivateLocationCreationResponse syntheticsPrivateLocationCreationResponse =
        (SyntheticsPrivateLocationCreationResponse) o;
    return Objects.equals(this.config, syntheticsPrivateLocationCreationResponse.config)
        && Objects.equals(
            this.privateLocation, syntheticsPrivateLocationCreationResponse.privateLocation)
        && Objects.equals(
            this.resultEncryption, syntheticsPrivateLocationCreationResponse.resultEncryption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, privateLocation, resultEncryption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsPrivateLocationCreationResponse {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    privateLocation: ").append(toIndentedString(privateLocation)).append("\n");
    sb.append("    resultEncryption: ").append(toIndentedString(resultEncryption)).append("\n");
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
