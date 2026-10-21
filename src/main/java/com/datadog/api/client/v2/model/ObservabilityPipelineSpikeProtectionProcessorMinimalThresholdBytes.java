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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Sets a specific byte threshold for the matching partition. */
@JsonPropertyOrder({
  ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.JSON_PROPERTY_BYTES,
  ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BYTES = "bytes";
  private Long bytes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType type =
      ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType.THRESHOLD;

  public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes() {}

  @JsonCreator
  public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BYTES) Long bytes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType type) {
    this.bytes = bytes;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes bytes(Long bytes) {
    this.bytes = bytes;
    return this;
  }

  /**
   * The minimal threshold, in bytes, for the matching partition.
   *
   * @return bytes
   */
  @JsonProperty(JSON_PROPERTY_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getBytes() {
    return bytes;
  }

  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }

  public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes type(
      ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The minimal threshold type. The value should always be <code>threshold</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType type) {
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
   * @return ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes
   */
  @JsonAnySetter
  public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes object
   * is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes
        observabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes =
            (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes) o;
    return Objects.equals(
            this.bytes, observabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.bytes)
        && Objects.equals(
            this.type, observabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes {\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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
