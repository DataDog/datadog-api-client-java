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
   * <p>Includes only specific fields for sensitive data scanning.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.JSON_PROPERTY_OPTIONS,
  ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPTIONS = "options";
  private ObservabilityPipelineSensitiveDataScannerProcessorScopeOptions options;

  public static final String JSON_PROPERTY_TARGET = "target";
  private ObservabilityPipelineSensitiveDataScannerProcessorScopeIncludeTarget target;

  public ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude() {}

  @JsonCreator
  public ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude(
            @JsonProperty(required=true, value=JSON_PROPERTY_OPTIONS)ObservabilityPipelineSensitiveDataScannerProcessorScopeOptions options,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)ObservabilityPipelineSensitiveDataScannerProcessorScopeIncludeTarget target) {
        this.options = options;
        this.unparsed |= options.unparsed;
        this.target = target;
        this.unparsed |= !target.isValid();
  }
  public ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude options(ObservabilityPipelineSensitiveDataScannerProcessorScopeOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Fields to which the scope rule applies.</p>
   * @return options
  **/
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineSensitiveDataScannerProcessorScopeOptions getOptions() {
        return options;
      }
  public void setOptions(ObservabilityPipelineSensitiveDataScannerProcessorScopeOptions options) {
    this.options = options;
  }
  public ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude target(ObservabilityPipelineSensitiveDataScannerProcessorScopeIncludeTarget target) {
    this.target = target;
    this.unparsed |= !target.isValid();
    return this;
  }

  /**
   * <p>Applies the rule only to included fields.</p>
   * @return target
  **/
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineSensitiveDataScannerProcessorScopeIncludeTarget getTarget() {
        return target;
      }
  public void setTarget(ObservabilityPipelineSensitiveDataScannerProcessorScopeIncludeTarget target) {
    if (!target.isValid()) {
        this.unparsed = true;
    }
    this.target = target;
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
   * @return ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude
   */
  @JsonAnySetter
  public ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude observabilityPipelineSensitiveDataScannerProcessorScopeInclude = (ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude) o;
    return Objects.equals(this.options, observabilityPipelineSensitiveDataScannerProcessorScopeInclude.options) && Objects.equals(this.target, observabilityPipelineSensitiveDataScannerProcessorScopeInclude.target) && Objects.equals(this.additionalProperties, observabilityPipelineSensitiveDataScannerProcessorScopeInclude.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(options,target, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
