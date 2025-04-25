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

/** Configuration for partially redacting matched sensitive data. */
@JsonPropertyOrder({
  ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.JSON_PROPERTY_ACTION,
  ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.JSON_PROPERTY_OPTIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction action;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions options;

  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact() {}

  @JsonCreator
  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION)
          ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIONS)
          ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions options) {
    this.action = action;
    this.unparsed |= !action.isValid();
    this.options = options;
    this.unparsed |= options.unparsed;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact action(
      ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * Action type that redacts part of the sensitive data while preserving a configurable number of
   * characters, typically used for masking purposes (e.g., show last 4 digits of a credit card).
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction getAction() {
    return action;
  }

  public void setAction(
      ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction action) {
    if (!action.isValid()) {
      this.unparsed = true;
    }
    this.action = action;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact options(
      ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Controls how partial redaction is applied, including character count and direction.
   *
   * @return options
   */
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions getOptions() {
    return options;
  }

  public void setOptions(
      ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions options) {
    this.options = options;
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
   * @return ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
   */
  @JsonAnySetter
  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
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
   * Return true if this ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
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
    ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
        observabilityPipelineSensitiveDataScannerProcessorActionPartialRedact =
            (ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact) o;
    return Objects.equals(
            this.action,
            observabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.action)
        && Objects.equals(
            this.options,
            observabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.options)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, options, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
