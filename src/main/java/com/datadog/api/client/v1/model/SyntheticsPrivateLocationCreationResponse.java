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
import java.util.UUID;
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
   * <p>Object that contains the new private location, the public key for result encryption, and the configuration skeleton.</p>
 */
@JsonPropertyOrder({
  SyntheticsPrivateLocationCreationResponse.JSON_PROPERTY_CONFIG,
  SyntheticsPrivateLocationCreationResponse.JSON_PROPERTY_PRIVATE_LOCATION,
  SyntheticsPrivateLocationCreationResponse.JSON_PROPERTY_RESULT_ENCRYPTION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsPrivateLocationCreationResponse {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>Configuration skeleton for the private location. See installation instructions of the private location on how to use this configuration.</p>
   * @return config
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getConfig() {
        return config;
      }
  public void setConfig(Object config) {
    this.config = config;
  }
  public SyntheticsPrivateLocationCreationResponse privateLocation(SyntheticsPrivateLocation privateLocation) {
    this.privateLocation = privateLocation;
    this.unparsed |= privateLocation.unparsed;
    return this;
  }

  /**
   * <p>Object containing information about the private location to create.</p>
   * @return privateLocation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIVATE_LOCATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsPrivateLocation getPrivateLocation() {
        return privateLocation;
      }
  public void setPrivateLocation(SyntheticsPrivateLocation privateLocation) {
    this.privateLocation = privateLocation;
  }
  public SyntheticsPrivateLocationCreationResponse resultEncryption(SyntheticsPrivateLocationCreationResponseResultEncryption resultEncryption) {
    this.resultEncryption = resultEncryption;
    this.unparsed |= resultEncryption.unparsed;
    return this;
  }

  /**
   * <p>Public key for the result encryption.</p>
   * @return resultEncryption
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESULT_ENCRYPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsPrivateLocationCreationResponseResultEncryption getResultEncryption() {
        return resultEncryption;
      }
  public void setResultEncryption(SyntheticsPrivateLocationCreationResponseResultEncryption resultEncryption) {
    this.resultEncryption = resultEncryption;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsPrivateLocationCreationResponse
   */
  @JsonAnySetter
  public SyntheticsPrivateLocationCreationResponse putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SyntheticsPrivateLocationCreationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsPrivateLocationCreationResponse syntheticsPrivateLocationCreationResponse = (SyntheticsPrivateLocationCreationResponse) o;
    return Objects.equals(this.config, syntheticsPrivateLocationCreationResponse.config) && Objects.equals(this.privateLocation, syntheticsPrivateLocationCreationResponse.privateLocation) && Objects.equals(this.resultEncryption, syntheticsPrivateLocationCreationResponse.resultEncryption) && Objects.equals(this.additionalProperties, syntheticsPrivateLocationCreationResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(config,privateLocation,resultEncryption, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsPrivateLocationCreationResponse {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    privateLocation: ").append(toIndentedString(privateLocation)).append("\n");
    sb.append("    resultEncryption: ").append(toIndentedString(resultEncryption)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
