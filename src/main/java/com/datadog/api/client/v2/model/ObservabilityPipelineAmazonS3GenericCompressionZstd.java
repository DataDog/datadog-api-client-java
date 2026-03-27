/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Zstd compression.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineAmazonS3GenericCompressionZstd.JSON_PROPERTY_ALGORITHM,
  ObservabilityPipelineAmazonS3GenericCompressionZstd.JSON_PROPERTY_LEVEL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAmazonS3GenericCompressionZstd {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALGORITHM = "algorithm";
  private ObservabilityPipelineAmazonS3GenericCompressionZstdType algorithm = ObservabilityPipelineAmazonS3GenericCompressionZstdType.ZSTD;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Long level;

  public ObservabilityPipelineAmazonS3GenericCompressionZstd() {}

  @JsonCreator
  public ObservabilityPipelineAmazonS3GenericCompressionZstd(
            @JsonProperty(required=true, value=JSON_PROPERTY_ALGORITHM)ObservabilityPipelineAmazonS3GenericCompressionZstdType algorithm,
            @JsonProperty(required=true, value=JSON_PROPERTY_LEVEL)Long level) {
        this.algorithm = algorithm;
        this.unparsed |= !algorithm.isValid();
        this.level = level;
  }
  public ObservabilityPipelineAmazonS3GenericCompressionZstd algorithm(ObservabilityPipelineAmazonS3GenericCompressionZstdType algorithm) {
    this.algorithm = algorithm;
    this.unparsed |= !algorithm.isValid();
    return this;
  }

  /**
   * <p>The compression type. Always <code>zstd</code>.</p>
   * @return algorithm
  **/
      @JsonProperty(JSON_PROPERTY_ALGORITHM)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineAmazonS3GenericCompressionZstdType getAlgorithm() {
        return algorithm;
      }
  public void setAlgorithm(ObservabilityPipelineAmazonS3GenericCompressionZstdType algorithm) {
    if (!algorithm.isValid()) {
        this.unparsed = true;
    }
    this.algorithm = algorithm;
  }
  public ObservabilityPipelineAmazonS3GenericCompressionZstd level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * <p>Zstd compression level.</p>
   * @return level
  **/
      @JsonProperty(JSON_PROPERTY_LEVEL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getLevel() {
        return level;
      }
  public void setLevel(Long level) {
    this.level = level;
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
   * @return ObservabilityPipelineAmazonS3GenericCompressionZstd
   */
  @JsonAnySetter
  public ObservabilityPipelineAmazonS3GenericCompressionZstd putAdditionalProperty(String key, Object value) {
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
    ObservabilityPipelineAmazonS3GenericCompressionZstd observabilityPipelineAmazonS3GenericCompressionZstd = (ObservabilityPipelineAmazonS3GenericCompressionZstd) o;
    return Objects.equals(this.algorithm, observabilityPipelineAmazonS3GenericCompressionZstd.algorithm) && Objects.equals(this.level, observabilityPipelineAmazonS3GenericCompressionZstd.level) && Objects.equals(this.additionalProperties, observabilityPipelineAmazonS3GenericCompressionZstd.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(algorithm,level, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAmazonS3GenericCompressionZstd {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
