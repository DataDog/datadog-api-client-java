/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
 * A processor for extracting, aggregating, or transforming values from JSON arrays within your
 * logs. Supported operations are: - Select value from matching element - Compute array length -
 * Append a value to an array
 */
@JsonPropertyOrder({
  LogsArrayProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsArrayProcessor.JSON_PROPERTY_NAME,
  LogsArrayProcessor.JSON_PROPERTY_OPERATION,
  LogsArrayProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArrayProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private LogsArrayProcessorOperation operation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArrayProcessorType type = LogsArrayProcessorType.ARRAY_PROCESSOR;

  public LogsArrayProcessor() {}

  @JsonCreator
  public LogsArrayProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATION)
          LogsArrayProcessorOperation operation,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsArrayProcessorType type) {
    this.operation = operation;
    this.unparsed |= operation.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsArrayProcessor isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the processor is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsArrayProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsArrayProcessor operation(LogsArrayProcessorOperation operation) {
    this.operation = operation;
    this.unparsed |= operation.unparsed;
    return this;
  }

  /**
   * Configuration of the array processor operation to perform.
   *
   * @return operation
   */
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArrayProcessorOperation getOperation() {
    return operation;
  }

  public void setOperation(LogsArrayProcessorOperation operation) {
    this.operation = operation;
  }

  public LogsArrayProcessor type(LogsArrayProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs array processor.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArrayProcessorType getType() {
    return type;
  }

  public void setType(LogsArrayProcessorType type) {
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
   * @return LogsArrayProcessor
   */
  @JsonAnySetter
  public LogsArrayProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsArrayProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArrayProcessor logsArrayProcessor = (LogsArrayProcessor) o;
    return Objects.equals(this.isEnabled, logsArrayProcessor.isEnabled)
        && Objects.equals(this.name, logsArrayProcessor.name)
        && Objects.equals(this.operation, logsArrayProcessor.operation)
        && Objects.equals(this.type, logsArrayProcessor.type)
        && Objects.equals(this.additionalProperties, logsArrayProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, name, operation, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArrayProcessor {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
