/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Analyzer options sent by browser-based clients. Accepted but ignored: the API always runs the
 * analysis with tree-sitter enabled and rule output logged.
 */
@JsonPropertyOrder({
  AnalysisRequestOptions.JSON_PROPERTY_LOG_OUTPUT,
  AnalysisRequestOptions.JSON_PROPERTY_USE_TREE_SITTER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnalysisRequestOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOG_OUTPUT = "log_output";
  private Boolean logOutput;

  public static final String JSON_PROPERTY_USE_TREE_SITTER = "use_tree_sitter";
  private Boolean useTreeSitter;

  public AnalysisRequestOptions logOutput(Boolean logOutput) {
    this.logOutput = logOutput;
    return this;
  }

  /**
   * Whether to capture the output logged by rules during execution. Ignored by this operation.
   *
   * @return logOutput
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLogOutput() {
    return logOutput;
  }

  public void setLogOutput(Boolean logOutput) {
    this.logOutput = logOutput;
  }

  public AnalysisRequestOptions useTreeSitter(Boolean useTreeSitter) {
    this.useTreeSitter = useTreeSitter;
    return this;
  }

  /**
   * Whether to use tree-sitter to parse the source code. Ignored by this operation.
   *
   * @return useTreeSitter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_TREE_SITTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUseTreeSitter() {
    return useTreeSitter;
  }

  public void setUseTreeSitter(Boolean useTreeSitter) {
    this.useTreeSitter = useTreeSitter;
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
   * @return AnalysisRequestOptions
   */
  @JsonAnySetter
  public AnalysisRequestOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AnalysisRequestOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisRequestOptions analysisRequestOptions = (AnalysisRequestOptions) o;
    return Objects.equals(this.logOutput, analysisRequestOptions.logOutput)
        && Objects.equals(this.useTreeSitter, analysisRequestOptions.useTreeSitter)
        && Objects.equals(this.additionalProperties, analysisRequestOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logOutput, useTreeSitter, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisRequestOptions {\n");
    sb.append("    logOutput: ").append(toIndentedString(logOutput)).append("\n");
    sb.append("    useTreeSitter: ").append(toIndentedString(useTreeSitter)).append("\n");
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
