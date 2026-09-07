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
   * <p>Metadata about the latest failed test run of the flaky test.</p>
 */
@JsonPropertyOrder({
  FlakyTestRunMetadata.JSON_PROPERTY_DURATION_MS,
  FlakyTestRunMetadata.JSON_PROPERTY_ERROR_MESSAGE,
  FlakyTestRunMetadata.JSON_PROPERTY_ERROR_STACK,
  FlakyTestRunMetadata.JSON_PROPERTY_SOURCE_END,
  FlakyTestRunMetadata.JSON_PROPERTY_SOURCE_FILE,
  FlakyTestRunMetadata.JSON_PROPERTY_SOURCE_START
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlakyTestRunMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION_MS = "duration_ms";
  private JsonNullable<Long> durationMs = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_STACK = "error_stack";
  private JsonNullable<String> errorStack = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_END = "source_end";
  private JsonNullable<Long> sourceEnd = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SOURCE_FILE = "source_file";
  private JsonNullable<String> sourceFile = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_START = "source_start";
  private JsonNullable<Long> sourceStart = JsonNullable.<Long>undefined();

  public FlakyTestRunMetadata durationMs(Long durationMs) {
    this.durationMs = JsonNullable.<Long>of(durationMs);
    return this;
  }

  /**
   * <p>The duration of the test run in milliseconds.</p>
   * @return durationMs
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getDurationMs() {
        return durationMs.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DURATION_MS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getDurationMs_JsonNullable() {
    return durationMs;
  }
  @JsonProperty(JSON_PROPERTY_DURATION_MS)public void setDurationMs_JsonNullable(JsonNullable<Long> durationMs) {
    this.durationMs = durationMs;
  }
  public void setDurationMs(Long durationMs) {
    this.durationMs = JsonNullable.<Long>of(durationMs);
  }
  public FlakyTestRunMetadata errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    return this;
  }

  /**
   * <p>The error message from the test failure.</p>
   * @return errorMessage
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getErrorMessage() {
        return errorMessage.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getErrorMessage_JsonNullable() {
    return errorMessage;
  }
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)public void setErrorMessage_JsonNullable(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }
  public FlakyTestRunMetadata errorStack(String errorStack) {
    this.errorStack = JsonNullable.<String>of(errorStack);
    return this;
  }

  /**
   * <p>The stack trace from the test failure.</p>
   * @return errorStack
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getErrorStack() {
        return errorStack.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ERROR_STACK)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getErrorStack_JsonNullable() {
    return errorStack;
  }
  @JsonProperty(JSON_PROPERTY_ERROR_STACK)public void setErrorStack_JsonNullable(JsonNullable<String> errorStack) {
    this.errorStack = errorStack;
  }
  public void setErrorStack(String errorStack) {
    this.errorStack = JsonNullable.<String>of(errorStack);
  }
  public FlakyTestRunMetadata sourceEnd(Long sourceEnd) {
    this.sourceEnd = JsonNullable.<Long>of(sourceEnd);
    return this;
  }

  /**
   * <p>The line number where the test ends in the source file.</p>
   * @return sourceEnd
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getSourceEnd() {
        return sourceEnd.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SOURCE_END)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSourceEnd_JsonNullable() {
    return sourceEnd;
  }
  @JsonProperty(JSON_PROPERTY_SOURCE_END)public void setSourceEnd_JsonNullable(JsonNullable<Long> sourceEnd) {
    this.sourceEnd = sourceEnd;
  }
  public void setSourceEnd(Long sourceEnd) {
    this.sourceEnd = JsonNullable.<Long>of(sourceEnd);
  }
  public FlakyTestRunMetadata sourceFile(String sourceFile) {
    this.sourceFile = JsonNullable.<String>of(sourceFile);
    return this;
  }

  /**
   * <p>The source file where the test is defined.</p>
   * @return sourceFile
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getSourceFile() {
        return sourceFile.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SOURCE_FILE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSourceFile_JsonNullable() {
    return sourceFile;
  }
  @JsonProperty(JSON_PROPERTY_SOURCE_FILE)public void setSourceFile_JsonNullable(JsonNullable<String> sourceFile) {
    this.sourceFile = sourceFile;
  }
  public void setSourceFile(String sourceFile) {
    this.sourceFile = JsonNullable.<String>of(sourceFile);
  }
  public FlakyTestRunMetadata sourceStart(Long sourceStart) {
    this.sourceStart = JsonNullable.<Long>of(sourceStart);
    return this;
  }

  /**
   * <p>The line number where the test starts in the source file.</p>
   * @return sourceStart
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getSourceStart() {
        return sourceStart.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SOURCE_START)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSourceStart_JsonNullable() {
    return sourceStart;
  }
  @JsonProperty(JSON_PROPERTY_SOURCE_START)public void setSourceStart_JsonNullable(JsonNullable<Long> sourceStart) {
    this.sourceStart = sourceStart;
  }
  public void setSourceStart(Long sourceStart) {
    this.sourceStart = JsonNullable.<Long>of(sourceStart);
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
   * @return FlakyTestRunMetadata
   */
  @JsonAnySetter
  public FlakyTestRunMetadata putAdditionalProperty(String key, Object value) {
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
   * Return true if this FlakyTestRunMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlakyTestRunMetadata flakyTestRunMetadata = (FlakyTestRunMetadata) o;
    return Objects.equals(this.durationMs, flakyTestRunMetadata.durationMs) && Objects.equals(this.errorMessage, flakyTestRunMetadata.errorMessage) && Objects.equals(this.errorStack, flakyTestRunMetadata.errorStack) && Objects.equals(this.sourceEnd, flakyTestRunMetadata.sourceEnd) && Objects.equals(this.sourceFile, flakyTestRunMetadata.sourceFile) && Objects.equals(this.sourceStart, flakyTestRunMetadata.sourceStart) && Objects.equals(this.additionalProperties, flakyTestRunMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(durationMs,errorMessage,errorStack,sourceEnd,sourceFile,sourceStart, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlakyTestRunMetadata {\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorStack: ").append(toIndentedString(errorStack)).append("\n");
    sb.append("    sourceEnd: ").append(toIndentedString(sourceEnd)).append("\n");
    sb.append("    sourceFile: ").append(toIndentedString(sourceFile)).append("\n");
    sb.append("    sourceStart: ").append(toIndentedString(sourceStart)).append("\n");
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
