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
   * <p>Gzip compression.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineAzureStorageDestinationCompressionGzip.JSON_PROPERTY_ALGORITHM,
  ObservabilityPipelineAzureStorageDestinationCompressionGzip.JSON_PROPERTY_LEVEL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAzureStorageDestinationCompressionGzip {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALGORITHM = "algorithm";
  private ObservabilityPipelineAzureStorageDestinationCompressionGzipType algorithm = ObservabilityPipelineAzureStorageDestinationCompressionGzipType.GZIP;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Long level;

  public ObservabilityPipelineAzureStorageDestinationCompressionGzip() {}

  @JsonCreator
  public ObservabilityPipelineAzureStorageDestinationCompressionGzip(
            @JsonProperty(required=true, value=JSON_PROPERTY_ALGORITHM)ObservabilityPipelineAzureStorageDestinationCompressionGzipType algorithm,
            @JsonProperty(required=true, value=JSON_PROPERTY_LEVEL)Long level) {
        this.algorithm = algorithm;
        this.unparsed |= !algorithm.isValid();
        this.level = level;
  }
  public ObservabilityPipelineAzureStorageDestinationCompressionGzip algorithm(ObservabilityPipelineAzureStorageDestinationCompressionGzipType algorithm) {
    this.algorithm = algorithm;
    this.unparsed |= !algorithm.isValid();
    return this;
  }

  /**
   * <p>The compression type. Always <code>gzip</code>.</p>
   * @return algorithm
  **/
      @JsonProperty(JSON_PROPERTY_ALGORITHM)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineAzureStorageDestinationCompressionGzipType getAlgorithm() {
        return algorithm;
      }
  public void setAlgorithm(ObservabilityPipelineAzureStorageDestinationCompressionGzipType algorithm) {
    if (!algorithm.isValid()) {
        this.unparsed = true;
    }
    this.algorithm = algorithm;
  }
  public ObservabilityPipelineAzureStorageDestinationCompressionGzip level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * <p>Gzip compression level. Valid values range from <code>1</code> to <code>9</code>.</p>
   * minimum: 1
   * maximum: 9
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
   * @return ObservabilityPipelineAzureStorageDestinationCompressionGzip
   */
  @JsonAnySetter
  public ObservabilityPipelineAzureStorageDestinationCompressionGzip putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineAzureStorageDestinationCompressionGzip object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAzureStorageDestinationCompressionGzip observabilityPipelineAzureStorageDestinationCompressionGzip = (ObservabilityPipelineAzureStorageDestinationCompressionGzip) o;
    return Objects.equals(this.algorithm, observabilityPipelineAzureStorageDestinationCompressionGzip.algorithm) && Objects.equals(this.level, observabilityPipelineAzureStorageDestinationCompressionGzip.level) && Objects.equals(this.additionalProperties, observabilityPipelineAzureStorageDestinationCompressionGzip.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(algorithm,level, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAzureStorageDestinationCompressionGzip {\n");
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
