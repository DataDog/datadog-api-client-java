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

/** Zstd compression. */
@JsonPropertyOrder({
  ObservabilityPipelineAmazonS3GenericCompressionZstd.JSON_PROPERTY_LEVEL,
  ObservabilityPipelineAmazonS3GenericCompressionZstd.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAmazonS3GenericCompressionZstd {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LEVEL = "level";
  private Long level;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAmazonS3GenericCompressionZstdType type =
      ObservabilityPipelineAmazonS3GenericCompressionZstdType.ZSTD;

  public ObservabilityPipelineAmazonS3GenericCompressionZstd() {}

  @JsonCreator
  public ObservabilityPipelineAmazonS3GenericCompressionZstd(
      @JsonProperty(required = true, value = JSON_PROPERTY_LEVEL) Long level,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineAmazonS3GenericCompressionZstdType type) {
    this.level = level;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineAmazonS3GenericCompressionZstd level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * Zstd compression level.
   *
   * @return level
   */
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
  }

  public ObservabilityPipelineAmazonS3GenericCompressionZstd type(
      ObservabilityPipelineAmazonS3GenericCompressionZstdType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The compression type. Always <code>zstd</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAmazonS3GenericCompressionZstdType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineAmazonS3GenericCompressionZstdType type) {
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
   * @return ObservabilityPipelineAmazonS3GenericCompressionZstd
   */
  @JsonAnySetter
  public ObservabilityPipelineAmazonS3GenericCompressionZstd putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineAmazonS3GenericCompressionZstd object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAmazonS3GenericCompressionZstd
        observabilityPipelineAmazonS3GenericCompressionZstd =
            (ObservabilityPipelineAmazonS3GenericCompressionZstd) o;
    return Objects.equals(this.level, observabilityPipelineAmazonS3GenericCompressionZstd.level)
        && Objects.equals(this.type, observabilityPipelineAmazonS3GenericCompressionZstd.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAmazonS3GenericCompressionZstd.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAmazonS3GenericCompressionZstd {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
