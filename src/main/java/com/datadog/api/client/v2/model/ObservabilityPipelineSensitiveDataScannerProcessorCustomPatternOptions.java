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

/** Options for defining a custom regex pattern. */
@JsonPropertyOrder({
  ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions.JSON_PROPERTY_DESCRIPTION,
  ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions.JSON_PROPERTY_RULE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_RULE = "rule";
  private String rule;

  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions() {}

  @JsonCreator
  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions(
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE) String rule) {
    this.rule = rule;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions description(
      String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable description providing context about a sensitive data scanner rule
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions rule(String rule) {
    this.rule = rule;
    return this;
  }

  /**
   * A regular expression used to detect sensitive values. Must be a valid regex.
   *
   * @return rule
   */
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
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
   * @return ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions
   */
  @JsonAnySetter
  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions
        observabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions =
            (ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions) o;
    return Objects.equals(
            this.description,
            observabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions.description)
        && Objects.equals(
            this.rule, observabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions.rule)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, rule, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSensitiveDataScannerProcessorCustomPatternOptions {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
