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

/** Defines a custom regex-based pattern for identifying sensitive data in logs. */
@JsonPropertyOrder({
  ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.JSON_PROPERTY_OPTIONS,
  ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPTIONS = "options";
  private ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions options;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternType type;

  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern() {}

  @JsonCreator
  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIONS)
          ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions options,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternType type) {
    this.options = options;
    this.unparsed |= options.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern options(
      ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Options for defining a custom regex pattern.
   *
   * @return options
   */
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions getOptions() {
    return options;
  }

  public void setOptions(
      ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions options) {
    this.options = options;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern type(
      ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Indicates a custom regular expression is used for matching.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternType type) {
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
   * @return ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern
   */
  @JsonAnySetter
  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern
        observabilityPipelineSensitiveDataScannerProcessorCustomPattern =
            (ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern) o;
    return Objects.equals(
            this.options, observabilityPipelineSensitiveDataScannerProcessorCustomPattern.options)
        && Objects.equals(
            this.type, observabilityPipelineSensitiveDataScannerProcessorCustomPattern.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSensitiveDataScannerProcessorCustomPattern.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
