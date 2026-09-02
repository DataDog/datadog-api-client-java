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

/**
 * Structured compression configuration for the ClickHouse destination. Use <code>algorithm</code>
 * to specify the compression type and <code>level</code> (optional, gzip only) to control
 * compression strength.
 */
@JsonPropertyOrder({
  ObservabilityPipelineClickhouseDestinationCompressionObject.JSON_PROPERTY_ALGORITHM,
  ObservabilityPipelineClickhouseDestinationCompressionObject.JSON_PROPERTY_LEVEL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineClickhouseDestinationCompressionObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALGORITHM = "algorithm";
  private ObservabilityPipelineClickhouseDestinationCompressionAlgorithm algorithm;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Long level;

  public ObservabilityPipelineClickhouseDestinationCompressionObject() {}

  @JsonCreator
  public ObservabilityPipelineClickhouseDestinationCompressionObject(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALGORITHM)
          ObservabilityPipelineClickhouseDestinationCompressionAlgorithm algorithm) {
    this.algorithm = algorithm;
    this.unparsed |= !algorithm.isValid();
  }

  public ObservabilityPipelineClickhouseDestinationCompressionObject algorithm(
      ObservabilityPipelineClickhouseDestinationCompressionAlgorithm algorithm) {
    this.algorithm = algorithm;
    this.unparsed |= !algorithm.isValid();
    return this;
  }

  /**
   * The compression algorithm applied to outbound HTTP requests.
   *
   * @return algorithm
   */
  @JsonProperty(JSON_PROPERTY_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineClickhouseDestinationCompressionAlgorithm getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(
      ObservabilityPipelineClickhouseDestinationCompressionAlgorithm algorithm) {
    if (!algorithm.isValid()) {
      this.unparsed = true;
    }
    this.algorithm = algorithm;
  }

  public ObservabilityPipelineClickhouseDestinationCompressionObject level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * Compression level (1–9). Only applicable when <code>algorithm</code> is <code>gzip</code>.
   * minimum: 1 maximum: 9
   *
   * @return level
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
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
   * @return ObservabilityPipelineClickhouseDestinationCompressionObject
   */
  @JsonAnySetter
  public ObservabilityPipelineClickhouseDestinationCompressionObject putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineClickhouseDestinationCompressionObject object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineClickhouseDestinationCompressionObject
        observabilityPipelineClickhouseDestinationCompressionObject =
            (ObservabilityPipelineClickhouseDestinationCompressionObject) o;
    return Objects.equals(
            this.algorithm, observabilityPipelineClickhouseDestinationCompressionObject.algorithm)
        && Objects.equals(
            this.level, observabilityPipelineClickhouseDestinationCompressionObject.level)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineClickhouseDestinationCompressionObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, level, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineClickhouseDestinationCompressionObject {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
